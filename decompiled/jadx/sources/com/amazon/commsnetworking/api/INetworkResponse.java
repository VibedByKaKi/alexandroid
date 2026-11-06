package com.amazon.commsnetworking.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface INetworkResponse extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close() throws IOException;

    @Nullable
    String getAmazonRID();

    @NonNull
    String getAmazonRequestID();

    @Nullable
    String getBody();

    @Nullable
    InputStream getByteStream();

    @Nullable
    byte[] getBytes();

    Long getCallDuration();

    Map<String, List<String>> getHeaders();

    int getStatusCode();

    boolean isSuccessful();
}
