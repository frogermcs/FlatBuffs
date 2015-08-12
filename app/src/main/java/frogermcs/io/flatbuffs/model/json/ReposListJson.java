package frogermcs.io.flatbuffs.model.json;

import java.util.List;

/**
 * Created by Miroslaw Stanek on 08.08.15.
 */
public class ReposListJson {
    public List<RepoJson> repos;

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
}
