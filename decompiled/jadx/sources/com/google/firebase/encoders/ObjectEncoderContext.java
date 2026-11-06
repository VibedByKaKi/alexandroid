package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface ObjectEncoderContext {
    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d) throws IOException;

    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f) throws IOException;

    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException;

    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException;

    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException;

    @NonNull
    ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException;

    @NonNull
    @Deprecated
    ObjectEncoderContext add(@NonNull String str, double d) throws IOException;

    @NonNull
    @Deprecated
    ObjectEncoderContext add(@NonNull String str, int i) throws IOException;

    @NonNull
    @Deprecated
    ObjectEncoderContext add(@NonNull String str, long j) throws IOException;

    @NonNull
    @Deprecated
    ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException;

    @NonNull
    @Deprecated
    ObjectEncoderContext add(@NonNull String str, boolean z) throws IOException;

    @NonNull
    ObjectEncoderContext inline(@Nullable Object obj) throws IOException;

    @NonNull
    ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException;

    @NonNull
    ObjectEncoderContext nested(@NonNull String str) throws IOException;
}
