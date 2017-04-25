package frogermcs.io.flatbuffs.model.json;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by Miroslaw Stanek on 08.08.15.
 */
public class RepoJson implements Parcelable {
    public long id;
    public String name;
    private String full_name;
    private UserJson owner;
    private String html_url;
    public String description;
    private boolean fork;
    private String url;
    private Date created_at;
    private Date updated_at;
    private Date pushed_at;
    private String git_url;
    private String ssh_url;
    private String clone_url;
    private String svn_url;
    private String homepage;
    private long size;
    private int stargazers_count;
    private int watchers_count;
    private String language;
    private boolean has_issues;
    private boolean has_downloads;
    private boolean has_wiki;
    private boolean has_pages;
    private int forks_count;
    private String mirror_url;
    private int open_issues_count;
    private int forks;
    private int open_issues;
    private int watchers;
    private String default_branch;

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.name);
        dest.writeString(this.full_name);
        dest.writeParcelable(this.owner, flags);
        dest.writeString(this.html_url);
        dest.writeString(this.description);
        dest.writeByte(fork ? (byte) 1 : (byte) 0);
        dest.writeString(this.url);
        dest.writeLong(created_at != null ? created_at.getTime() : -1);
        dest.writeLong(updated_at != null ? updated_at.getTime() : -1);
        dest.writeLong(pushed_at != null ? pushed_at.getTime() : -1);
        dest.writeString(this.git_url);
        dest.writeString(this.ssh_url);
        dest.writeString(this.clone_url);
        dest.writeString(this.svn_url);
        dest.writeString(this.homepage);
        dest.writeLong(this.size);
        dest.writeInt(this.stargazers_count);
        dest.writeInt(this.watchers_count);
        dest.writeString(this.language);
        dest.writeByte(has_issues ? (byte) 1 : (byte) 0);
        dest.writeByte(has_downloads ? (byte) 1 : (byte) 0);
        dest.writeByte(has_wiki ? (byte) 1 : (byte) 0);
        dest.writeByte(has_pages ? (byte) 1 : (byte) 0);
        dest.writeInt(this.forks_count);
        dest.writeString(this.mirror_url);
        dest.writeInt(this.open_issues_count);
        dest.writeInt(this.forks);
        dest.writeInt(this.open_issues);
        dest.writeInt(this.watchers);
        dest.writeString(this.default_branch);
    }

    public RepoJson() {
    }

    private RepoJson(Parcel in) {
        this.id = in.readLong();
        this.name = in.readString();
        this.full_name = in.readString();
        this.owner = in.readParcelable(UserJson.class.getClassLoader());
        this.html_url = in.readString();
        this.description = in.readString();
        this.fork = in.readByte() != 0;
        this.url = in.readString();
        long tmpCreated_at = in.readLong();
        this.created_at = tmpCreated_at == -1 ? null : new Date(tmpCreated_at);
        long tmpUpdated_at = in.readLong();
        this.updated_at = tmpUpdated_at == -1 ? null : new Date(tmpUpdated_at);
        long tmpPushed_at = in.readLong();
        this.pushed_at = tmpPushed_at == -1 ? null : new Date(tmpPushed_at);
        this.git_url = in.readString();
        this.ssh_url = in.readString();
        this.clone_url = in.readString();
        this.svn_url = in.readString();
        this.homepage = in.readString();
        this.size = in.readLong();
        this.stargazers_count = in.readInt();
        this.watchers_count = in.readInt();
        this.language = in.readString();
        this.has_issues = in.readByte() != 0;
        this.has_downloads = in.readByte() != 0;
        this.has_wiki = in.readByte() != 0;
        this.has_pages = in.readByte() != 0;
        this.forks_count = in.readInt();
        this.mirror_url = in.readString();
        this.open_issues_count = in.readInt();
        this.forks = in.readInt();
        this.open_issues = in.readInt();
        this.watchers = in.readInt();
        this.default_branch = in.readString();
    }

    public static final Parcelable.Creator<RepoJson> CREATOR = new Parcelable.Creator<RepoJson>() {
        public RepoJson createFromParcel(Parcel source) {
            return new RepoJson(source);
        }

        public RepoJson[] newArray(int size) {
            return new RepoJson[size];
        }
    };
}
