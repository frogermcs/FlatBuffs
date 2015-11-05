package frogermcs.io.flatbuffersparser;

import java.nio.ByteBuffer;

/**
 * Created by Miroslaw Stanek on 04.11.2015.
 */
public class FlatBuffersParser {

    static {
        System.loadLibrary("FlatBuffersParser");
    }

    public ByteBuffer parseJson(String json, String schema) {
        final byte[] bytes = parseJsonNative(json, schema);
        return ByteBuffer.wrap(bytes);
    }

    private native byte[] parseJsonNative(String json, String schema);
}
