package com.amazon.alexa.mobilytics.identity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface MobilyticsDeviceProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface Listener {
        void onDeviceDetailChange(@Nullable MobilyticsDevice mobilyticsDevice);
    }

    void addListener(@NonNull Listener listener);

    MobilyticsDevice device();

    void removeListener(@NonNull Listener listener);
}
