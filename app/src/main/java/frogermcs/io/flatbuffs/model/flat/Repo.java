// automatically generated, do not modify

package frogermcs.io.flatbuffs.model.flat;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class Repo extends Table {
  public static Repo getRootAsRepo(ByteBuffer _bb) { return getRootAsRepo(_bb, new Repo()); }
  public static Repo getRootAsRepo(ByteBuffer _bb, Repo obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Repo __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public long id() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String fullName() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer fullNameAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public User owner() { return owner(new User()); }
  public User owner(User obj) { int o = __offset(10); return o != 0 ? obj.__init(__indirect(o + bb_pos), bb) : null; }
  public String htmlUrl() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer htmlUrlAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public String description() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer descriptionAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public boolean fork() { int o = __offset(16); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String url() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer urlAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public String createdAt() { int o = __offset(20); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer createdAtAsByteBuffer() { return __vector_as_bytebuffer(20, 1); }
  public String updatedAt() { int o = __offset(22); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer updatedAtAsByteBuffer() { return __vector_as_bytebuffer(22, 1); }
  public String pushedAt() { int o = __offset(24); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer pushedAtAsByteBuffer() { return __vector_as_bytebuffer(24, 1); }
  public String gitUrl() { int o = __offset(26); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer gitUrlAsByteBuffer() { return __vector_as_bytebuffer(26, 1); }
  public String sshUrl() { int o = __offset(28); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer sshUrlAsByteBuffer() { return __vector_as_bytebuffer(28, 1); }
  public String cloneUrl() { int o = __offset(30); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer cloneUrlAsByteBuffer() { return __vector_as_bytebuffer(30, 1); }
  public String svnUrl() { int o = __offset(32); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer svnUrlAsByteBuffer() { return __vector_as_bytebuffer(32, 1); }
  public String homepage() { int o = __offset(34); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer homepageAsByteBuffer() { return __vector_as_bytebuffer(34, 1); }
  public long size() { int o = __offset(36); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public int stargazersCount() { int o = __offset(38); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int watchersCount() { int o = __offset(40); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String language() { int o = __offset(42); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer languageAsByteBuffer() { return __vector_as_bytebuffer(42, 1); }
  public boolean hasIssues() { int o = __offset(44); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasDownloads() { int o = __offset(46); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasWiki() { int o = __offset(48); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public boolean hasPages() { int o = __offset(50); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public int forksCount() { int o = __offset(52); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String mirrorUrl() { int o = __offset(54); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer mirrorUrlAsByteBuffer() { return __vector_as_bytebuffer(54, 1); }
  public int openIssuesCount() { int o = __offset(56); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int forks() { int o = __offset(58); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int openIssues() { int o = __offset(60); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int watchers() { int o = __offset(62); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String defaultBranch() { int o = __offset(64); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer defaultBranchAsByteBuffer() { return __vector_as_bytebuffer(64, 1); }

  public static int createRepo(FlatBufferBuilder builder,
      long id,
      int name,
      int full_name,
      int owner,
      int html_url,
      int description,
      boolean fork,
      int url,
      int created_at,
      int updated_at,
      int pushed_at,
      int git_url,
      int ssh_url,
      int clone_url,
      int svn_url,
      int homepage,
      long size,
      int stargazers_count,
      int watchers_count,
      int language,
      boolean has_issues,
      boolean has_downloads,
      boolean has_wiki,
      boolean has_pages,
      int forks_count,
      int mirror_url,
      int open_issues_count,
      int forks,
      int open_issues,
      int watchers,
      int default_branch) {
    builder.startObject(67);
    Repo.addSize(builder, size);
    Repo.addId(builder, id);
    Repo.addDefaultBranch(builder, default_branch);
    Repo.addWatchers(builder, watchers);
    Repo.addOpenIssues(builder, open_issues);
    Repo.addForks(builder, forks);
    Repo.addOpenIssuesCount(builder, open_issues_count);
    Repo.addMirrorUrl(builder, mirror_url);
    Repo.addForksCount(builder, forks_count);
    Repo.addLanguage(builder, language);
    Repo.addWatchersCount(builder, watchers_count);
    Repo.addStargazersCount(builder, stargazers_count);
    Repo.addHomepage(builder, homepage);
    Repo.addSvnUrl(builder, svn_url);
    Repo.addCloneUrl(builder, clone_url);
    Repo.addSshUrl(builder, ssh_url);
    Repo.addGitUrl(builder, git_url);
    Repo.addPushedAt(builder, pushed_at);
    Repo.addUpdatedAt(builder, updated_at);
    Repo.addCreatedAt(builder, created_at);
    Repo.addUrl(builder, url);
    Repo.addDescription(builder, description);
    Repo.addHtmlUrl(builder, html_url);
    Repo.addOwner(builder, owner);
    Repo.addFullName(builder, full_name);
    Repo.addName(builder, name);
    Repo.addHasPages(builder, has_pages);
    Repo.addHasWiki(builder, has_wiki);
    Repo.addHasDownloads(builder, has_downloads);
    Repo.addHasIssues(builder, has_issues);
    Repo.addFork(builder, fork);
    return Repo.endRepo(builder);
  }

  public static void startRepo(FlatBufferBuilder builder) { builder.startObject(67); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(0, id, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addFullName(FlatBufferBuilder builder, int fullNameOffset) { builder.addOffset(2, fullNameOffset, 0); }
  public static void addOwner(FlatBufferBuilder builder, int ownerOffset) { builder.addOffset(3, ownerOffset, 0); }
  public static void addHtmlUrl(FlatBufferBuilder builder, int htmlUrlOffset) { builder.addOffset(4, htmlUrlOffset, 0); }
  public static void addDescription(FlatBufferBuilder builder, int descriptionOffset) { builder.addOffset(5, descriptionOffset, 0); }
  public static void addFork(FlatBufferBuilder builder, boolean fork) { builder.addBoolean(6, fork, false); }
  public static void addUrl(FlatBufferBuilder builder, int urlOffset) { builder.addOffset(7, urlOffset, 0); }
  public static void addCreatedAt(FlatBufferBuilder builder, int createdAtOffset) { builder.addOffset(8, createdAtOffset, 0); }
  public static void addUpdatedAt(FlatBufferBuilder builder, int updatedAtOffset) { builder.addOffset(9, updatedAtOffset, 0); }
  public static void addPushedAt(FlatBufferBuilder builder, int pushedAtOffset) { builder.addOffset(10, pushedAtOffset, 0); }
  public static void addGitUrl(FlatBufferBuilder builder, int gitUrlOffset) { builder.addOffset(11, gitUrlOffset, 0); }
  public static void addSshUrl(FlatBufferBuilder builder, int sshUrlOffset) { builder.addOffset(12, sshUrlOffset, 0); }
  public static void addCloneUrl(FlatBufferBuilder builder, int cloneUrlOffset) { builder.addOffset(13, cloneUrlOffset, 0); }
  public static void addSvnUrl(FlatBufferBuilder builder, int svnUrlOffset) { builder.addOffset(14, svnUrlOffset, 0); }
  public static void addHomepage(FlatBufferBuilder builder, int homepageOffset) { builder.addOffset(15, homepageOffset, 0); }
  public static void addSize(FlatBufferBuilder builder, long size) { builder.addLong(16, size, 0); }
  public static void addStargazersCount(FlatBufferBuilder builder, int stargazersCount) { builder.addInt(17, stargazersCount, 0); }
  public static void addWatchersCount(FlatBufferBuilder builder, int watchersCount) { builder.addInt(18, watchersCount, 0); }
  public static void addLanguage(FlatBufferBuilder builder, int languageOffset) { builder.addOffset(19, languageOffset, 0); }
  public static void addHasIssues(FlatBufferBuilder builder, boolean hasIssues) { builder.addBoolean(20, hasIssues, false); }
  public static void addHasDownloads(FlatBufferBuilder builder, boolean hasDownloads) { builder.addBoolean(21, hasDownloads, false); }
  public static void addHasWiki(FlatBufferBuilder builder, boolean hasWiki) { builder.addBoolean(22, hasWiki, false); }
  public static void addHasPages(FlatBufferBuilder builder, boolean hasPages) { builder.addBoolean(23, hasPages, false); }
  public static void addForksCount(FlatBufferBuilder builder, int forksCount) { builder.addInt(24, forksCount, 0); }
  public static void addMirrorUrl(FlatBufferBuilder builder, int mirrorUrlOffset) { builder.addOffset(25, mirrorUrlOffset, 0); }
  public static void addOpenIssuesCount(FlatBufferBuilder builder, int openIssuesCount) { builder.addInt(26, openIssuesCount, 0); }
  public static void addForks(FlatBufferBuilder builder, int forks) { builder.addInt(27, forks, 0); }
  public static void addOpenIssues(FlatBufferBuilder builder, int openIssues) { builder.addInt(28, openIssues, 0); }
  public static void addWatchers(FlatBufferBuilder builder, int watchers) { builder.addInt(29, watchers, 0); }
  public static void addDefaultBranch(FlatBufferBuilder builder, int defaultBranchOffset) { builder.addOffset(30, defaultBranchOffset, 0); }
  public static int endRepo(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

