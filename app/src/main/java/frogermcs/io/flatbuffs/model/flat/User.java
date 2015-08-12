// automatically generated, do not modify

package frogermcs.io.flatbuffs.model.flat;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class User extends Table {
  public static User getRootAsUser(ByteBuffer _bb) { return getRootAsUser(_bb, new User()); }
  public static User getRootAsUser(ByteBuffer _bb, User obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public User __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String login() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer loginAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public long id() { int o = __offset(6); return o != 0 ? bb.getLong(o + bb_pos) : 0; }
  public String avatarUrl() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer avatarUrlAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String gravatarId() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer gravatarIdAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public String url() { int o = __offset(12); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer urlAsByteBuffer() { return __vector_as_bytebuffer(12, 1); }
  public String htmlUrl() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer htmlUrlAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public String followersUrl() { int o = __offset(16); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer followersUrlAsByteBuffer() { return __vector_as_bytebuffer(16, 1); }
  public String followingUrl() { int o = __offset(18); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer followingUrlAsByteBuffer() { return __vector_as_bytebuffer(18, 1); }
  public String gistsUrl() { int o = __offset(20); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer gistsUrlAsByteBuffer() { return __vector_as_bytebuffer(20, 1); }
  public String starredUrl() { int o = __offset(22); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer starredUrlAsByteBuffer() { return __vector_as_bytebuffer(22, 1); }
  public String subscriptionsUrl() { int o = __offset(24); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer subscriptionsUrlAsByteBuffer() { return __vector_as_bytebuffer(24, 1); }
  public String organizationsUrl() { int o = __offset(26); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer organizationsUrlAsByteBuffer() { return __vector_as_bytebuffer(26, 1); }
  public String reposUrl() { int o = __offset(28); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer reposUrlAsByteBuffer() { return __vector_as_bytebuffer(28, 1); }
  public String eventsUrl() { int o = __offset(30); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer eventsUrlAsByteBuffer() { return __vector_as_bytebuffer(30, 1); }
  public String receivedEventsUrl() { int o = __offset(32); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer receivedEventsUrlAsByteBuffer() { return __vector_as_bytebuffer(32, 1); }
  public String type() { int o = __offset(34); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer typeAsByteBuffer() { return __vector_as_bytebuffer(34, 1); }
  public boolean siteAdmin() { int o = __offset(36); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createUser(FlatBufferBuilder builder,
      int login,
      long id,
      int avatar_url,
      int gravatar_id,
      int url,
      int html_url,
      int followers_url,
      int following_url,
      int gists_url,
      int starred_url,
      int subscriptions_url,
      int organizations_url,
      int repos_url,
      int events_url,
      int received_events_url,
      int type,
      boolean site_admin) {
    builder.startObject(17);
    User.addId(builder, id);
    User.addType(builder, type);
    User.addReceivedEventsUrl(builder, received_events_url);
    User.addEventsUrl(builder, events_url);
    User.addReposUrl(builder, repos_url);
    User.addOrganizationsUrl(builder, organizations_url);
    User.addSubscriptionsUrl(builder, subscriptions_url);
    User.addStarredUrl(builder, starred_url);
    User.addGistsUrl(builder, gists_url);
    User.addFollowingUrl(builder, following_url);
    User.addFollowersUrl(builder, followers_url);
    User.addHtmlUrl(builder, html_url);
    User.addUrl(builder, url);
    User.addGravatarId(builder, gravatar_id);
    User.addAvatarUrl(builder, avatar_url);
    User.addLogin(builder, login);
    User.addSiteAdmin(builder, site_admin);
    return User.endUser(builder);
  }

  public static void startUser(FlatBufferBuilder builder) { builder.startObject(17); }
  public static void addLogin(FlatBufferBuilder builder, int loginOffset) { builder.addOffset(0, loginOffset, 0); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(1, id, 0); }
  public static void addAvatarUrl(FlatBufferBuilder builder, int avatarUrlOffset) { builder.addOffset(2, avatarUrlOffset, 0); }
  public static void addGravatarId(FlatBufferBuilder builder, int gravatarIdOffset) { builder.addOffset(3, gravatarIdOffset, 0); }
  public static void addUrl(FlatBufferBuilder builder, int urlOffset) { builder.addOffset(4, urlOffset, 0); }
  public static void addHtmlUrl(FlatBufferBuilder builder, int htmlUrlOffset) { builder.addOffset(5, htmlUrlOffset, 0); }
  public static void addFollowersUrl(FlatBufferBuilder builder, int followersUrlOffset) { builder.addOffset(6, followersUrlOffset, 0); }
  public static void addFollowingUrl(FlatBufferBuilder builder, int followingUrlOffset) { builder.addOffset(7, followingUrlOffset, 0); }
  public static void addGistsUrl(FlatBufferBuilder builder, int gistsUrlOffset) { builder.addOffset(8, gistsUrlOffset, 0); }
  public static void addStarredUrl(FlatBufferBuilder builder, int starredUrlOffset) { builder.addOffset(9, starredUrlOffset, 0); }
  public static void addSubscriptionsUrl(FlatBufferBuilder builder, int subscriptionsUrlOffset) { builder.addOffset(10, subscriptionsUrlOffset, 0); }
  public static void addOrganizationsUrl(FlatBufferBuilder builder, int organizationsUrlOffset) { builder.addOffset(11, organizationsUrlOffset, 0); }
  public static void addReposUrl(FlatBufferBuilder builder, int reposUrlOffset) { builder.addOffset(12, reposUrlOffset, 0); }
  public static void addEventsUrl(FlatBufferBuilder builder, int eventsUrlOffset) { builder.addOffset(13, eventsUrlOffset, 0); }
  public static void addReceivedEventsUrl(FlatBufferBuilder builder, int receivedEventsUrlOffset) { builder.addOffset(14, receivedEventsUrlOffset, 0); }
  public static void addType(FlatBufferBuilder builder, int typeOffset) { builder.addOffset(15, typeOffset, 0); }
  public static void addSiteAdmin(FlatBufferBuilder builder, boolean siteAdmin) { builder.addBoolean(16, siteAdmin, false); }
  public static int endUser(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

