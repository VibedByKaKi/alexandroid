package com.amazon.alexa.perfusermonitoring.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001f\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0003H&J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/perfusermonitoring/api/PerfUserMonitoringModule;", "", "endSpan", "", "name", "", "endTime", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "setAppStartTime", "timeInMillis", "setUniversalAttribute", "value", "start", "startSpan", "Lcom/amazon/alexa/perfusermonitoring/api/PerformanceSpan;", "options", "Lcom/amazon/alexa/perfusermonitoring/api/PerformanceSpanOptions;", "AlexaMobileAndroidPerformanceUserMonitoringAPI_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface PerfUserMonitoringModule {
    default void endSpan(@NotNull String name) {
        name.getClass();
        endSpan(name, null);
    }

    void endSpan(@NotNull String name, @Nullable Long endTime);

    void setAppStartTime(long timeInMillis);

    void setUniversalAttribute(@NotNull String name, @NotNull String value);

    void start();

    @Nullable
    PerformanceSpan startSpan(@NotNull String name);

    @Nullable
    PerformanceSpan startSpan(@NotNull String name, @NotNull PerformanceSpanOptions options);
}
