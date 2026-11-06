package com.amazon.alexa.accessory.metrics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.Logger;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface AccessoryMetricsService {
    default void createTimer(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4, @NonNull String str5) {
        Logger.d("AccessoryMetricsService default implementation of createTimer with ownerId:" + str5);
    }

    void recordCounter(String str, String str2, double d, Map<String, Object> map);

    void recordCounter(String str, String str2, double d, Map<String, Object> map, String str3);

    void recordCriticalEvent(String str, String str2, String str3, Throwable th);

    void recordCriticalEvent(String str, String str2, String str3, Throwable th, String str4);

    void recordDem(String str, String str2, Map<String, String> map);

    void recordOccurrence(String str, String str2, boolean z, Map<String, Object> map);

    void recordOccurrence(String str, String str2, boolean z, Map<String, Object> map, String str3);

    void recordTime(String str, String str2, long j, Map<String, Object> map);

    void recordTime(String str, String str2, long j, Map<String, Object> map, String str3);

    default void recordTimer(@NonNull String str) {
        Logger.d("AccessoryMetricsService default implementation of recordTimer.");
    }

    void recordUpl(String str, String str2, long j, Map<String, Object> map);

    void recordWarningEvent(String str, String str2, String str3, Throwable th);

    void recordWarningEvent(String str, String str2, String str3, Throwable th, String str4);

    default void createTimer(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4) {
        Logger.d("AccessoryMetricsService default implementation of createTimer.");
    }
}
