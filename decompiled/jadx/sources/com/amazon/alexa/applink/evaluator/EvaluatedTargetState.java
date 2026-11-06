package com.amazon.alexa.applink.evaluator;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class EvaluatedTargetState {
    public static EvaluatedTargetState create(@NonNull Target target, @Nullable Intent intent, @NonNull InstallStatus installStatus, boolean z, boolean z2) {
        return new AutoValue_EvaluatedTargetState(target, intent, installStatus, z, z2);
    }

    public abstract boolean canLaunch();

    public abstract InstallStatus installStatus();

    public abstract boolean isLaunchedInTarget();

    @Nullable
    public abstract Intent launchIntent();

    public abstract Target target();
}
