package com.bugsnag.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
interface FeatureFlagAware {
    void addFeatureFlag(@NonNull String str);

    void addFeatureFlag(@NonNull String str, @Nullable String str2);

    void addFeatureFlags(@NonNull Iterable<FeatureFlag> iterable);

    void clearFeatureFlag(@NonNull String str);

    void clearFeatureFlags();
}
