package com.bugsnag.android.performance;

import com.bugsnag.android.performance.controls.SpanControlProvider;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rH\u0016J\u001a\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\rH&J\u0014\u0010\u000e\u001a\u00020\u00072\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016J\u001e\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/performance/PluginContext;", "", "configuration", "Lcom/bugsnag/android/performance/PerformanceConfiguration;", "getConfiguration", "()Lcom/bugsnag/android/performance/PerformanceConfiguration;", "addOnSpanEndCallback", "", "callback", "Lcom/bugsnag/android/performance/OnSpanEndCallback;", "priority", "", "addOnSpanStartCallback", "Lcom/bugsnag/android/performance/OnSpanStartCallback;", "addSpanControlProvider", "provider", "Lcom/bugsnag/android/performance/controls/SpanControlProvider;", "Companion", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PluginContext {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int HIGH_PRIORITY = 0;
    public static final int LOW_PRIORITY = 100000;
    public static final int NORM_PRIORITY = 50000;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/performance/PluginContext$Companion;", "", "()V", "HIGH_PRIORITY", "", "LOW_PRIORITY", "NORM_PRIORITY", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int HIGH_PRIORITY = 0;
        public static final int LOW_PRIORITY = 100000;
        public static final int NORM_PRIORITY = 50000;

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void addOnSpanEndCallback(@NotNull PluginContext pluginContext, @NotNull OnSpanEndCallback onSpanEndCallback) {
            onSpanEndCallback.getClass();
            pluginContext.addOnSpanEndCallback(50000, onSpanEndCallback);
        }

        public static /* synthetic */ void addOnSpanEndCallback$default(PluginContext pluginContext, int i, OnSpanEndCallback onSpanEndCallback, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: addOnSpanEndCallback");
                return;
            }
            if ((i2 & 1) != 0) {
                i = 50000;
            }
            pluginContext.addOnSpanEndCallback(i, onSpanEndCallback);
        }

        public static void addOnSpanStartCallback(@NotNull PluginContext pluginContext, @NotNull OnSpanStartCallback onSpanStartCallback) {
            onSpanStartCallback.getClass();
            pluginContext.addOnSpanStartCallback(50000, onSpanStartCallback);
        }

        public static /* synthetic */ void addOnSpanStartCallback$default(PluginContext pluginContext, int i, OnSpanStartCallback onSpanStartCallback, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: addOnSpanStartCallback");
                return;
            }
            if ((i2 & 1) != 0) {
                i = 50000;
            }
            pluginContext.addOnSpanStartCallback(i, onSpanStartCallback);
        }

        public static void addSpanControlProvider(@NotNull PluginContext pluginContext, @NotNull SpanControlProvider<?> spanControlProvider) {
            spanControlProvider.getClass();
            pluginContext.addSpanControlProvider(50000, spanControlProvider);
        }

        public static /* synthetic */ void addSpanControlProvider$default(PluginContext pluginContext, int i, SpanControlProvider spanControlProvider, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: addSpanControlProvider");
                return;
            }
            if ((i2 & 1) != 0) {
                i = 50000;
            }
            pluginContext.addSpanControlProvider(i, spanControlProvider);
        }
    }

    void addOnSpanEndCallback(int priority, @NotNull OnSpanEndCallback callback);

    void addOnSpanEndCallback(@NotNull OnSpanEndCallback callback);

    void addOnSpanStartCallback(int priority, @NotNull OnSpanStartCallback callback);

    void addOnSpanStartCallback(@NotNull OnSpanStartCallback callback);

    void addSpanControlProvider(int priority, @NotNull SpanControlProvider<?> provider);

    void addSpanControlProvider(@NotNull SpanControlProvider<?> provider);

    @NotNull
    PerformanceConfiguration getConfiguration();
}
