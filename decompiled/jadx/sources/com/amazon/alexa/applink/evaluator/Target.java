package com.amazon.alexa.applink.evaluator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class Target {
    public static Target create(@Nullable String str, @NonNull String str2, @NonNull TargetIdentifierType targetIdentifierType, boolean z) {
        return new AutoValue_Target(str, str2, targetIdentifierType, z);
    }

    @Nullable
    public abstract String catalogId();

    @NonNull
    public abstract String identifier();

    public abstract boolean isMandatoryToLaunchTarget();

    @NonNull
    public abstract TargetIdentifierType targetIdentifierType();
}
