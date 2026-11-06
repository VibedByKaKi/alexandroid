package com.amazon.alexa.voice.handsfree.decider.setup;

import android.content.Intent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface PermissionStrategy {
    void execute(@NonNull PermissionDelegate permissionDelegate, @NonNull PermissionMetricRecorder permissionMetricRecorder, @NonNull Intent intent, @NonNull String str, @Nullable String str2);

    void setupNegativeButtonOnClickListener(@NonNull View view, @NonNull PermissionDelegate permissionDelegate, @NonNull PermissionMetricRecorder permissionMetricRecorder);

    void setupPositiveButtonOnClickListener(@NonNull View view, @NonNull PermissionDelegate permissionDelegate, @NonNull PermissionMetricRecorder permissionMetricRecorder, @Nullable String str);
}
