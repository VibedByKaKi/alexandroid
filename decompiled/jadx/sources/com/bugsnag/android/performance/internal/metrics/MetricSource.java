package com.bugsnag.android.performance.internal.metrics;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import com.bugsnag.android.performance.Span;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\r\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/performance/internal/metrics/MetricSource;", ExifInterface.GPS_DIRECTION_TRUE, "", "createStartMetrics", "()Ljava/lang/Object;", "endMetrics", "", "startMetrics", "span", "Lcom/bugsnag/android/performance/Span;", "(Ljava/lang/Object;Lcom/bugsnag/android/performance/Span;)V", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public interface MetricSource<T> {
    T createStartMetrics();

    void endMetrics(T startMetrics, @NotNull Span span);
}
