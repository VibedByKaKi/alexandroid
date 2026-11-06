package com.amazon.alexa.mobilytics.configuration;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface ConfigStorage {
    void clear();

    @Nullable
    Config content();

    @Nullable
    String lastCheckedTime();

    @Nullable
    String lastUpdatedTime();

    void storeCheckedTime(@NonNull String str);

    void storeContent(@NonNull Config config);

    void storeUpdatedTime(@NonNull String str);
}
