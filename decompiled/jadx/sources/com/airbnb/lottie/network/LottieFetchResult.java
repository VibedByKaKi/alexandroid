package com.airbnb.lottie.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface LottieFetchResult extends Closeable {
    @NonNull
    InputStream bodyByteStream() throws IOException;

    @Nullable
    String contentType();

    @Nullable
    String error();

    boolean isSuccessful();
}
