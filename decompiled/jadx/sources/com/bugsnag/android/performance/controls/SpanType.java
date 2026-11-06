package com.bugsnag.android.performance.controls;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/performance/controls/SpanType;", "C", "Lcom/bugsnag/android/performance/controls/SpanQuery;", "AppStart", "Lcom/bugsnag/android/performance/controls/SpanType$AppStart;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SpanType<C> extends SpanQuery<C> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bugsnag/android/performance/controls/SpanType$AppStart;", "Lcom/bugsnag/android/performance/controls/SpanType;", "Lcom/bugsnag/android/performance/controls/AppStartSpanControl;", "()V", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AppStart implements SpanType<AppStartSpanControl> {

        @NotNull
        public static final AppStart INSTANCE = new AppStart();

        private AppStart() {
        }
    }
}
