package com.bugsnag.android.performance;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.redesign.view.container.CardStudioSurfaceHealth;
import com.bugsnag.android.performance.internal.SpanContextStack;
import com.facebook.react.runtime.ReactHostImpl$$ExternalSyntheticLambda0;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda4;
import java.lang.ref.WeakReference;
import java.util.Deque;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\"\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/bugsnag/android/performance/SpanContext;", "", "spanId", "", "getSpanId", "()J", "traceId", "Ljava/util/UUID;", "getTraceId", "()Ljava/util/UUID;", "wrap", "Ljava/lang/Runnable;", "runnable", "Ljava/util/concurrent/Callable;", ExifInterface.GPS_DIRECTION_TRUE, "callable", "Storage", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SpanContext {

    /* renamed from: Storage, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    static SpanContext getCurrent() {
        return INSTANCE.getCurrent();
    }

    @NotNull
    static SpanContext getInvalid() {
        return INSTANCE.getInvalid();
    }

    long getSpanId();

    @NotNull
    UUID getTraceId();

    @NotNull
    Runnable wrap(@NotNull Runnable runnable);

    @NotNull
    <T> Callable<T> wrap(@NotNull Callable<T> callable);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static Runnable wrap(@NotNull SpanContext spanContext, @NotNull Runnable runnable) {
            runnable.getClass();
            return new LifecycleUtils$$ExternalSyntheticLambda4(spanContext, runnable, 10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void wrap$lambda$0(SpanContext spanContext, Runnable runnable) {
            spanContext.getClass();
            runnable.getClass();
            try {
                Companion companion = SpanContext.INSTANCE;
                companion.attach$bugsnag_android_performance_release(spanContext);
                runnable.run();
                companion.detach$bugsnag_android_performance_release(spanContext);
            } catch (Throwable th) {
                SpanContext.INSTANCE.detach$bugsnag_android_performance_release(spanContext);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object wrap$lambda$1(SpanContext spanContext, Callable callable) {
            spanContext.getClass();
            callable.getClass();
            try {
                Companion companion = SpanContext.INSTANCE;
                companion.attach$bugsnag_android_performance_release(spanContext);
                Object call = callable.call();
                companion.detach$bugsnag_android_performance_release(spanContext);
                return call;
            } catch (Throwable th) {
                SpanContext.INSTANCE.detach$bugsnag_android_performance_release(spanContext);
                throw th;
            }
        }

        @NotNull
        public static <T> Callable<T> wrap(@NotNull SpanContext spanContext, @NotNull Callable<T> callable) {
            callable.getClass();
            return new ReactHostImpl$$ExternalSyntheticLambda0(spanContext, callable, 12);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0018J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u001bR-\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048@@@X\u0080\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u000eR\u0010\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/performance/SpanContext$Storage;", "", "()V", "value", "Lcom/bugsnag/android/performance/internal/SpanContextStack;", "contextStack", "getContextStack-07jRbR8$bugsnag_android_performance_release", "()Ljava/util/Deque;", "setContextStack-jmkdIac$bugsnag_android_performance_release", "(Ljava/util/Deque;)V", "current", "Lcom/bugsnag/android/performance/SpanContext;", "getCurrent$annotations", "getCurrent", "()Lcom/bugsnag/android/performance/SpanContext;", "invalid", "getInvalid$annotations", "getInvalid", "threadLocalStorage", "com/bugsnag/android/performance/SpanContext$Storage$threadLocalStorage$1", "Lcom/bugsnag/android/performance/SpanContext$Storage$threadLocalStorage$1;", CardStudioSurfaceHealth.Stage.ATTACH, "", "toAttach", "attach$bugsnag_android_performance_release", "detach", "spanContext", "detach$bugsnag_android_performance_release", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.bugsnag.android.performance.SpanContext$Storage, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final SpanContext$Storage$threadLocalStorage$1 threadLocalStorage = new ThreadLocal<SpanContextStack>() { // from class: com.bugsnag.android.performance.SpanContext$Storage$threadLocalStorage$1
            @Override // java.lang.ThreadLocal
            public /* bridge */ /* synthetic */ SpanContextStack initialValue() {
                return SpanContextStack.m23838boximpl(m23820initialValue07jRbR8());
            }

            @NotNull
            /* renamed from: initialValue-07jRbR8, reason: not valid java name */
            public Deque<WeakReference<SpanContext>> m23820initialValue07jRbR8() {
                return SpanContextStack.m23841constructorimpl$default(null, 1, null);
            }
        };

        @NotNull
        private static final SpanContext invalid = new SpanContext() { // from class: com.bugsnag.android.performance.SpanContext$Storage$invalid$1
            @Override // com.bugsnag.android.performance.SpanContext
            public long getSpanId() {
                return 0L;
            }

            @Override // com.bugsnag.android.performance.SpanContext
            @NotNull
            public UUID getTraceId() {
                return new UUID(0L, 0L);
            }

            @NotNull
            public String toString() {
                return "InvalidContext";
            }

            @Override // com.bugsnag.android.performance.SpanContext
            @NotNull
            public Runnable wrap(@NotNull Runnable runnable) {
                runnable.getClass();
                return runnable;
            }

            @Override // com.bugsnag.android.performance.SpanContext
            @NotNull
            public <T> Callable<T> wrap(@NotNull Callable<T> callable) {
                callable.getClass();
                return callable;
            }
        };

        private Companion() {
        }

        public final /* synthetic */ void attach$bugsnag_android_performance_release(SpanContext toAttach) {
            toAttach.getClass();
            SpanContextStack.m23837attachimpl(m23818getContextStack07jRbR8$bugsnag_android_performance_release(), toAttach);
        }

        public final /* synthetic */ void detach$bugsnag_android_performance_release(SpanContext spanContext) {
            spanContext.getClass();
            SpanContextStack.m23844detachimpl(m23818getContextStack07jRbR8$bugsnag_android_performance_release(), spanContext);
        }

        /* renamed from: getContextStack-07jRbR8$bugsnag_android_performance_release, reason: not valid java name */
        public final /* synthetic */ Deque m23818getContextStack07jRbR8$bugsnag_android_performance_release() {
            return threadLocalStorage.get().getStack();
        }

        @NotNull
        public final SpanContext getCurrent() {
            SpanContext m23849getTopimpl = SpanContextStack.m23849getTopimpl(m23818getContextStack07jRbR8$bugsnag_android_performance_release());
            return m23849getTopimpl == null ? invalid : m23849getTopimpl;
        }

        @NotNull
        public final SpanContext getInvalid() {
            return invalid;
        }

        /* renamed from: setContextStack-jmkdIac$bugsnag_android_performance_release, reason: not valid java name */
        public final void m23819setContextStackjmkdIac$bugsnag_android_performance_release(@NotNull Deque<WeakReference<SpanContext>> deque) {
            deque.getClass();
            threadLocalStorage.set(SpanContextStack.m23838boximpl(deque));
        }

        @JvmStatic
        public static /* synthetic */ void getCurrent$annotations() {
        }

        @JvmStatic
        public static /* synthetic */ void getInvalid$annotations() {
        }
    }
}
