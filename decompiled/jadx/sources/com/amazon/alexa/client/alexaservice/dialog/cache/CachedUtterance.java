package com.amazon.alexa.client.alexaservice.dialog.cache;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class CachedUtterance {
    public static CachedUtterance create(@NonNull String str, @NonNull String str2) {
        return create(str, str2, System.currentTimeMillis());
    }

    @NonNull
    public abstract String getDialogId();

    public abstract long getTimestamp();

    @NonNull
    public abstract String getTranscript();

    public boolean isExpired(long j) {
        return System.currentTimeMillis() - getTimestamp() > j;
    }

    public static CachedUtterance create(@NonNull String str, @NonNull String str2, long j) {
        return new AutoValue_CachedUtterance(str, str2, j);
    }
}
