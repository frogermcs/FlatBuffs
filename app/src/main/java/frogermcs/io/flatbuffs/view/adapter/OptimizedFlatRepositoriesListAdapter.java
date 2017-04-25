package frogermcs.io.flatbuffs.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import frogermcs.io.flatbuffs.R;
import frogermcs.io.flatbuffs.model.flat.Repo;
import frogermcs.io.flatbuffs.model.flat.ReposList;

/**
 * Created by Miroslaw Stanek on 15.11.2015.
 */
public class OptimizedFlatRepositoriesListAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ReposList reposList;

    public OptimizedFlatRepositoriesListAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setReposList(ReposList reposList) {
        this.reposList = reposList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        if (reposList != null) {
            return reposList.reposLength();
        }
        return 0;
    }

    @Override
    public Repo getItem(int position) {
        return reposList.repos(position);
    }

    @Override
    public long getItemId(int position) {
        return reposList.repos(position).id();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        FlatRepositoryViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item_repo, parent, false);
            holder = new FlatRepositoryViewHolder(convertView, reposList, position);
            convertView.setTag(holder);
        } else {
            holder = (FlatRepositoryViewHolder) convertView.getTag();
        }

        holder.bindItemOnPosition(position);

        return convertView;
    }

    static class FlatRepositoryViewHolder {
        @Bind(R.id.tvTitle)
        TextView tvTitle;
        @Bind(R.id.tvSubtitle)
        TextView tvSubtitle;

        private ReposList reposList;
        private Repo repository;

        private char[] titleChars = new char[64];
        private char[] subtitleChars = new char[64];

        public FlatRepositoryViewHolder(View view, ReposList reposList, int itemPosition) {
            ButterKnife.bind(this, view);
            this.reposList = reposList;
            repository = reposList.repos(itemPosition);
        }

        public void bindItemOnPosition(int itemPosition) {
            repository = reposList.repos(repository, itemPosition);
            assert repository != null;
            bindRepositoryName(repository.getByteBuffer().array());
            bindRepositoryDescription(repository.getByteBuffer().array());
        }

        private void bindRepositoryName(byte[] reposListBytesArray) {
            int nameStartPosition = repository.nameVectorStart();
            if (nameStartPosition == -1) {
                tvSubtitle.setText(null);
                return;
            }

            int nameLength = repository.nameLength();
            ensureNameCapacity(nameLength);
            for (int i = 0; i < nameLength; i++) {
                titleChars[i] = (char) (reposListBytesArray[nameStartPosition + i] & 0xff);
            }

            tvTitle.setText(titleChars, 0, nameLength);
        }

        private void ensureNameCapacity(int nameLength) {
            if (nameLength > titleChars.length) {
                titleChars = new char[titleChars.length + nameLength];
            }
        }

        private void bindRepositoryDescription(byte[] reposListBytesArray) {
            int descriptionStartPosition = repository.descriptionVectorStart();
            if (descriptionStartPosition == -1) {
                tvSubtitle.setText(null);
                return;
            }

            int descriptionLength = repository.descriptionLength();
            ensureSubtitleCapacity(descriptionLength);
            for (int i = 0; i < descriptionLength; i++) {
                subtitleChars[i] = (char) (reposListBytesArray[i + descriptionStartPosition] & 0xff);
            }

            tvSubtitle.setText(subtitleChars, 0, descriptionLength);
        }

        private void ensureSubtitleCapacity(int descriptionLength) {
            if (descriptionLength > subtitleChars.length) {
                subtitleChars = new char[subtitleChars.length + descriptionLength];
            }
        }
    }
}
