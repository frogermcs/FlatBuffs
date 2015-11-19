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
 * Created by Miroslaw Stanek on 24.04.15.
 */
public class FlatRepositoriesListAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ReposList reposList;

    public FlatRepositoriesListAdapter (Context context) {
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
        RepositoryHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_item_repo, parent, false);
            holder = new RepositoryHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (RepositoryHolder) convertView.getTag();
        }

        holder.bindItemOnPosition(getItem(position));

        return convertView;
    }

    static class RepositoryHolder {
        @Bind(R.id.tvTitle)
        TextView tvTitle;
        @Bind(R.id.tvSubtitle)
        TextView tvSubtitle;

        public RepositoryHolder(View view) {
            ButterKnife.bind(this, view);
        }

        public void bindItemOnPosition(Repo repository) {
            tvTitle.setText(repository.name());
            tvSubtitle.setText(repository.description());
        }
    }
}
