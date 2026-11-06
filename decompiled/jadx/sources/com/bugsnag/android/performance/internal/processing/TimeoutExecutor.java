package com.bugsnag.android.performance.internal.processing;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/performance/internal/processing/TimeoutExecutor;", "", "cancelTimeout", "", "timeout", "Lcom/bugsnag/android/performance/internal/processing/Timeout;", "scheduleTimeout", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TimeoutExecutor {
    void cancelTimeout(@NotNull Timeout timeout);

    void scheduleTimeout(@NotNull Timeout timeout);
}
