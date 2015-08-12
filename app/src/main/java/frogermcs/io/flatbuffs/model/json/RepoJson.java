package frogermcs.io.flatbuffs.model.json;

import java.util.Date;

/**
 * Created by Miroslaw Stanek on 08.08.15.
 */
public class RepoJson {
    public long id;
    public String name;
    public String full_name;
    public UserJson owner;
    public String html_url;
    public String description;
    public boolean fork;
    public String url;
    public Date created_at;
    public Date updated_at;
    public Date pushed_at;
    public String git_url;
    public String ssh_url;
    public String clone_url;
    public String svn_url;
    public String homepage;
    public long size;
    public int stargazers_count;
    public int watchers_count;
    public String language;
    public boolean has_issues;
    public boolean has_downloads;
    public boolean has_wiki;
    public boolean has_pages;
    public int forks_count;
    public String mirror_url;
    public int open_issues_count;
    public int forks;
    public int open_issues;
    public int watchers;
    public String default_branch;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RepoJson repo = (RepoJson) o;

        if (id != repo.id) return false;
        if (fork != repo.fork) return false;
        if (size != repo.size) return false;
        if (stargazers_count != repo.stargazers_count) return false;
        if (watchers_count != repo.watchers_count) return false;
        if (has_issues != repo.has_issues) return false;
        if (has_downloads != repo.has_downloads) return false;
        if (has_wiki != repo.has_wiki) return false;
        if (has_pages != repo.has_pages) return false;
        if (forks_count != repo.forks_count) return false;
        if (open_issues_count != repo.open_issues_count) return false;
        if (forks != repo.forks) return false;
        if (open_issues != repo.open_issues) return false;
        if (watchers != repo.watchers) return false;
        if (name != null ? !name.equals(repo.name) : repo.name != null) return false;
        if (full_name != null ? !full_name.equals(repo.full_name) : repo.full_name != null)
            return false;
        if (owner != null ? !owner.equals(repo.owner) : repo.owner != null) return false;
        if (html_url != null ? !html_url.equals(repo.html_url) : repo.html_url != null)
            return false;
        if (description != null ? !description.equals(repo.description) : repo.description != null)
            return false;
        if (url != null ? !url.equals(repo.url) : repo.url != null) return false;
        if (created_at != null ? !created_at.equals(repo.created_at) : repo.created_at != null)
            return false;
        if (updated_at != null ? !updated_at.equals(repo.updated_at) : repo.updated_at != null)
            return false;
        if (pushed_at != null ? !pushed_at.equals(repo.pushed_at) : repo.pushed_at != null)
            return false;
        if (git_url != null ? !git_url.equals(repo.git_url) : repo.git_url != null) return false;
        if (ssh_url != null ? !ssh_url.equals(repo.ssh_url) : repo.ssh_url != null) return false;
        if (clone_url != null ? !clone_url.equals(repo.clone_url) : repo.clone_url != null)
            return false;
        if (svn_url != null ? !svn_url.equals(repo.svn_url) : repo.svn_url != null) return false;
        if (homepage != null ? !homepage.equals(repo.homepage) : repo.homepage != null)
            return false;
        if (language != null ? !language.equals(repo.language) : repo.language != null)
            return false;
        if (mirror_url != null ? !mirror_url.equals(repo.mirror_url) : repo.mirror_url != null)
            return false;
        return !(default_branch != null ? !default_branch.equals(repo.default_branch) : repo.default_branch != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (full_name != null ? full_name.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (html_url != null ? html_url.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (fork ? 1 : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (created_at != null ? created_at.hashCode() : 0);
        result = 31 * result + (updated_at != null ? updated_at.hashCode() : 0);
        result = 31 * result + (pushed_at != null ? pushed_at.hashCode() : 0);
        result = 31 * result + (git_url != null ? git_url.hashCode() : 0);
        result = 31 * result + (ssh_url != null ? ssh_url.hashCode() : 0);
        result = 31 * result + (clone_url != null ? clone_url.hashCode() : 0);
        result = 31 * result + (svn_url != null ? svn_url.hashCode() : 0);
        result = 31 * result + (homepage != null ? homepage.hashCode() : 0);
        result = 31 * result + (int) (size ^ (size >>> 32));
        result = 31 * result + stargazers_count;
        result = 31 * result + watchers_count;
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + (has_issues ? 1 : 0);
        result = 31 * result + (has_downloads ? 1 : 0);
        result = 31 * result + (has_wiki ? 1 : 0);
        result = 31 * result + (has_pages ? 1 : 0);
        result = 31 * result + forks_count;
        result = 31 * result + (mirror_url != null ? mirror_url.hashCode() : 0);
        result = 31 * result + open_issues_count;
        result = 31 * result + forks;
        result = 31 * result + open_issues;
        result = 31 * result + watchers;
        result = 31 * result + (default_branch != null ? default_branch.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Repo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", full_name='" + full_name + '\'' +
                ", owner=" + owner +
                ", html_url='" + html_url + '\'' +
                ", description='" + description + '\'' +
                ", fork=" + fork +
                ", url='" + url + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", pushed_at=" + pushed_at +
                ", git_url='" + git_url + '\'' +
                ", ssh_url='" + ssh_url + '\'' +
                ", clone_url='" + clone_url + '\'' +
                ", svn_url='" + svn_url + '\'' +
                ", homepage='" + homepage + '\'' +
                ", size=" + size +
                ", stargazers_count=" + stargazers_count +
                ", watchers_count=" + watchers_count +
                ", language='" + language + '\'' +
                ", has_issues=" + has_issues +
                ", has_downloads=" + has_downloads +
                ", has_wiki=" + has_wiki +
                ", has_pages=" + has_pages +
                ", forks_count=" + forks_count +
                ", mirror_url='" + mirror_url + '\'' +
                ", open_issues_count=" + open_issues_count +
                ", forks=" + forks +
                ", open_issues=" + open_issues +
                ", watchers=" + watchers +
                ", default_branch='" + default_branch + '\'' +
                '}';
    }
}
