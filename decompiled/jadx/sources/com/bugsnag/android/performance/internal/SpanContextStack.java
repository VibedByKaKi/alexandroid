package com.bugsnag.android.performance.internal;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.redesign.view.container.CardStudioSurfaceHealth;
import com.bugsnag.android.performance.SpanContext;
import com.dee.app.metrics.MetricsConstants;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B \u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0007J\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001eø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J)\u0010(\u001a\u0004\u0018\u00010\u001c2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020$0*H\u0080\bø\u0001\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b.\u0010\u000bJ'\u0010/\u001a\u00020$2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020$0*H\u0080\bø\u0001\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0002\u0092\u0001\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003ø\u0001\u0000\u0082\u0002\u0016\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"Lcom/bugsnag/android/performance/internal/SpanContextStack;", "", "stack", "Ljava/util/Deque;", "Ljava/lang/ref/WeakReference;", "Lcom/bugsnag/android/performance/SpanContext;", "constructor-impl", "(Ljava/util/Deque;)Ljava/util/Deque;", "size", "", "getSize-impl", "(Ljava/util/Deque;)I", "getStack$annotations", "()V", "top", "getTop-impl", "(Ljava/util/Deque;)Lcom/bugsnag/android/performance/SpanContext;", CardStudioSurfaceHealth.Stage.ATTACH, "", "spanContext", "attach-impl", "(Ljava/util/Deque;Lcom/bugsnag/android/performance/SpanContext;)V", MetricsConstants.Method.CACHE_CLEAR, "clear-impl", "(Ljava/util/Deque;)V", "copy", "copy-07jRbR8", "current", "Lcom/bugsnag/android/performance/internal/SpanImpl;", "spanCategory", "Lcom/bugsnag/android/performance/internal/SpanCategory;", "current-AYqBgNU", "(Ljava/util/Deque;Ljava/lang/String;)Lcom/bugsnag/android/performance/internal/SpanImpl;", "detach", "detach-impl", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals-impl", "(Ljava/util/Deque;Ljava/lang/Object;)Z", "findSpan", "predicate", "Lkotlin/Function1;", "findSpan-impl$bugsnag_android_performance_release", "(Ljava/util/Deque;Lkotlin/jvm/functions/Function1;)Lcom/bugsnag/android/performance/internal/SpanImpl;", "hashCode", "hashCode-impl", "noSpansMatch", "noSpansMatch-impl$bugsnag_android_performance_release", "(Ljava/util/Deque;Lkotlin/jvm/functions/Function1;)Z", "toString", "", "toString-impl", "(Ljava/util/Deque;)Ljava/lang/String;", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nSpanContextStack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanContextStack.kt\ncom/bugsnag/android/performance/internal/SpanContextStack\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n87#1,8:98\n2624#2,3:106\n*S KotlinDebug\n*F\n+ 1 SpanContextStack.kt\ncom/bugsnag/android/performance/internal/SpanContextStack\n*L\n75#1:98,8\n83#1:106,3\n*E\n"})
/* loaded from: classes6.dex */
public final class SpanContextStack {

    @NotNull
    private final Deque<WeakReference<SpanContext>> stack;

    private /* synthetic */ SpanContextStack(Deque deque) {
        this.stack = deque;
    }

    /* renamed from: attach-impl, reason: not valid java name */
    public static final void m23837attachimpl(Deque<WeakReference<SpanContext>> deque, @NotNull SpanContext spanContext) {
        spanContext.getClass();
        if (Intrinsics.areEqual(spanContext, SpanContext.INSTANCE.getInvalid())) {
            return;
        }
        deque.push(new WeakReference<>(spanContext));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanContextStack m23838boximpl(Deque deque) {
        return new SpanContextStack(deque);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m23839clearimpl(Deque<WeakReference<SpanContext>> deque) {
        deque.clear();
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Deque<WeakReference<SpanContext>> m23840constructorimpl(@NotNull Deque<WeakReference<SpanContext>> deque) {
        deque.getClass();
        return deque;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ Deque m23841constructorimpl$default(Deque deque, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            deque = new ArrayDeque();
        }
        return m23840constructorimpl(deque);
    }

    @NotNull
    /* renamed from: copy-07jRbR8, reason: not valid java name */
    public static final Deque<WeakReference<SpanContext>> m23842copy07jRbR8(Deque<WeakReference<SpanContext>> deque) {
        return m23840constructorimpl(new ArrayDeque(deque));
    }

    @Nullable
    /* renamed from: current-AYqBgNU, reason: not valid java name */
    public static final SpanImpl m23843currentAYqBgNU(Deque<WeakReference<SpanContext>> deque, @NotNull String str) {
        SpanImpl spanImpl;
        str.getClass();
        Iterator<WeakReference<SpanContext>> it2 = deque.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SpanContext spanContext = it2.next().get();
            spanImpl = spanContext instanceof SpanImpl ? (SpanImpl) spanContext : null;
            if (spanImpl != null && SpanCategory.m23827equalsimpl0(spanImpl.getCategory(), str)) {
                break;
            }
        }
        return spanImpl;
    }

    /* renamed from: detach-impl, reason: not valid java name */
    public static final void m23844detachimpl(Deque<WeakReference<SpanContext>> deque, @NotNull SpanContext spanContext) {
        spanContext.getClass();
        WeakReference<SpanContext> pollFirst = deque.pollFirst();
        if (pollFirst == null || Intrinsics.areEqual(pollFirst.get(), spanContext)) {
            return;
        }
        deque.push(pollFirst);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23845equalsimpl(Deque<WeakReference<SpanContext>> deque, Object obj) {
        return (obj instanceof SpanContextStack) && Intrinsics.areEqual(deque, ((SpanContextStack) obj).getStack());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23846equalsimpl0(Deque<WeakReference<SpanContext>> deque, Deque<WeakReference<SpanContext>> deque2) {
        return Intrinsics.areEqual(deque, deque2);
    }

    @Nullable
    /* renamed from: findSpan-impl$bugsnag_android_performance_release, reason: not valid java name */
    public static final SpanImpl m23847findSpanimpl$bugsnag_android_performance_release(Deque<WeakReference<SpanContext>> deque, @NotNull Function1<? super SpanImpl, Boolean> function1) {
        SpanImpl spanImpl;
        function1.getClass();
        Iterator<WeakReference<SpanContext>> it2 = deque.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SpanContext spanContext = it2.next().get();
            spanImpl = spanContext instanceof SpanImpl ? (SpanImpl) spanContext : null;
            if (spanImpl != null && function1.invoke(spanImpl).booleanValue()) {
                break;
            }
        }
        return spanImpl;
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m23848getSizeimpl(Deque<WeakReference<SpanContext>> deque) {
        return deque.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bugsnag.android.performance.SpanContext] */
    @Nullable
    /* renamed from: getTop-impl, reason: not valid java name */
    public static final SpanContext m23849getTopimpl(Deque<WeakReference<SpanContext>> deque) {
        SpanImpl spanImpl;
        while (true) {
            if (deque.isEmpty()) {
                return null;
            }
            WeakReference<SpanContext> peekFirst = deque.peekFirst();
            spanImpl = peekFirst != null ? peekFirst.get() : null;
            if (spanImpl != null) {
                SpanImpl spanImpl2 = spanImpl instanceof SpanImpl ? spanImpl : null;
                if (spanImpl2 == null || !spanImpl2.isEnded()) {
                    break;
                }
            }
            deque.removeFirst();
        }
        return spanImpl;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23850hashCodeimpl(Deque<WeakReference<SpanContext>> deque) {
        return deque.hashCode();
    }

    /* renamed from: noSpansMatch-impl$bugsnag_android_performance_release, reason: not valid java name */
    public static final boolean m23851noSpansMatchimpl$bugsnag_android_performance_release(Deque<WeakReference<SpanContext>> deque, @NotNull Function1<? super SpanImpl, Boolean> function1) {
        function1.getClass();
        if (deque != null && deque.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = deque.iterator();
        while (it2.hasNext()) {
            Object obj = ((WeakReference) it2.next()).get();
            SpanImpl spanImpl = obj instanceof SpanImpl ? (SpanImpl) obj : null;
            if (spanImpl != null && function1.invoke(spanImpl).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23852toStringimpl(Deque<WeakReference<SpanContext>> deque) {
        return "SpanContextStack(stack=" + deque + ')';
    }

    public boolean equals(Object obj) {
        return m23845equalsimpl(this.stack, obj);
    }

    public int hashCode() {
        return m23850hashCodeimpl(this.stack);
    }

    public String toString() {
        return m23852toStringimpl(this.stack);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Deque getStack() {
        return this.stack;
    }

    @PublishedApi
    public static /* synthetic */ void getStack$annotations() {
    }
}
