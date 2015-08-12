// automatically generated, do not modify

package frogermcs.io.flatbuffs.model.flat;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class ReposList extends Table {
  public static ReposList getRootAsReposList(ByteBuffer _bb) { return getRootAsReposList(_bb, new ReposList()); }
  public static ReposList getRootAsReposList(ByteBuffer _bb, ReposList obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public ReposList __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public Repo repos(int j) { return repos(new Repo(), j); }
  public Repo repos(Repo obj, int j) { int o = __offset(4); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int reposLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }

  public static int createReposList(FlatBufferBuilder builder,
      int repos) {
    builder.startObject(1);
    ReposList.addRepos(builder, repos);
    return ReposList.endReposList(builder);
  }

  public static void startReposList(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addRepos(FlatBufferBuilder builder, int reposOffset) { builder.addOffset(0, reposOffset, 0); }
  public static int createReposVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startReposVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endReposList(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
  public static void finishReposListBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
};

