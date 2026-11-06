package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface ValueEncoderContext {
    @NonNull
    ValueEncoderContext add(double d) throws IOException;

    @NonNull
    ValueEncoderContext add(float f) throws IOException;

    @NonNull
    ValueEncoderContext add(int i) throws IOException;

    @NonNull
    ValueEncoderContext add(long j) throws IOException;

    @NonNull
    ValueEncoderContext add(@Nullable String str) throws IOException;

    @NonNull
    ValueEncoderContext add(boolean z) throws IOException;

    @NonNull
    ValueEncoderContext add(@NonNull byte[] bArr) throws IOException;
}
