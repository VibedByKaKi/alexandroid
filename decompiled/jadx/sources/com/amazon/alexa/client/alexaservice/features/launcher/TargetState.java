package com.amazon.alexa.client.alexaservice.features.launcher;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.features.launcher.payload.Reasons;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class TargetState {
    public static TargetState create(@Nullable Intent intent, boolean z, List<Reasons> list) {
        return new AutoValue_TargetState(intent, z, new ArrayList(list));
    }

    public abstract List<Reasons> decisionReasons();

    public abstract boolean isFallbackSelected();

    @Nullable
    public abstract Intent launchIntent();
}
