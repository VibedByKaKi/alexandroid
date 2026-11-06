package com.amazon.dee.app.elements;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public interface ReactFeatureManager extends ReactActivityLifecycle {
    void onClearReactData();

    void onFeatureBackgrounded(@NonNull ReactFeature reactFeature);

    void onFeatureDestroyed(@NonNull ReactFeature reactFeature);

    void onFeatureDestroyed(@NonNull String str);

    void onFeatureForegrounded(@NonNull ReactFeature reactFeature);

    void onFeatureRendered(@NonNull String str);

    @Nullable
    View onFeatureResumed(@NonNull ReactFeature reactFeature);

    void setOnFeatureRenderedListener(@NonNull ReactFeature reactFeature, @NonNull OnRenderedListener onRenderedListener);
}
