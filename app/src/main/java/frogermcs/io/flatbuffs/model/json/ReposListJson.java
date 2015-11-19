package frogermcs.io.flatbuffs.model.json;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Miroslaw Stanek on 08.08.15.
 */
public class ReposListJson implements Parcelable {
    public ArrayList<RepoJson> repos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReposListJson reposList = (ReposListJson) o;

        return !(repos != null ? !repos.equals(reposList.repos) : reposList.repos != null);

    }

    @Override
    public int hashCode() {
        return repos != null ? repos.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ReposList{" +
                "repos=" + repos +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(repos);
    }

    public ReposListJson() {
    }

    protected ReposListJson(Parcel in) {
        this.repos = in.createTypedArrayList(RepoJson.CREATOR);
    }

    public static final Creator<ReposListJson> CREATOR = new Creator<ReposListJson>() {
        public ReposListJson createFromParcel(Parcel source) {
            return new ReposListJson(source);
        }

        public ReposListJson[] newArray(int size) {
            return new ReposListJson[size];
        }
    };
}
