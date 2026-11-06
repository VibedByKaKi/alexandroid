package com.bugsnag.android.performance.controls;

import com.dee.app.metrics.MetricsConstants;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J(\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u0002H\u0004H¦\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/performance/controls/SpanControlProvider;", "C", "", MetricsConstants.Method.CACHE_GET, "Q", "Lcom/bugsnag/android/performance/controls/SpanQuery;", SearchIntents.EXTRA_QUERY, "(Lcom/bugsnag/android/performance/controls/SpanQuery;)Ljava/lang/Object;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SpanControlProvider<C> {
    @Nullable
    <Q extends SpanQuery<? extends C>> C get(@NotNull Q query);
}
