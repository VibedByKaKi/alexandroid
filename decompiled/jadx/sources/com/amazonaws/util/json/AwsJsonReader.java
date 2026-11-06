package com.amazonaws.util.json;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface AwsJsonReader {
    void beginArray() throws IOException;

    void beginObject() throws IOException;

    void close() throws IOException;

    void endArray() throws IOException;

    void endObject() throws IOException;

    boolean hasNext() throws IOException;

    boolean isContainer() throws IOException;

    String nextName() throws IOException;

    String nextString() throws IOException;

    AwsJsonToken peek() throws IOException;

    void skipValue() throws IOException;
}
