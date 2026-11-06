package com.google.firebase.encoders.config;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public interface EncoderConfig<T extends EncoderConfig<T>> {
    @NonNull
    <U> T registerEncoder(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder);

    @NonNull
    <U> T registerEncoder(@NonNull Class<U> cls, @NonNull ValueEncoder<? super U> valueEncoder);
}
