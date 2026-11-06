package com.amazon.alexa.ra.android.smartfragment.bridge;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0001¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/DestroyExecutor;", "Ljava/util/concurrent/Executor;", "delegate", "constructor-impl", "(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;", "execute", "", VoiceBridgePayloadUtil.PayloadKey.COMMAND, "Ljava/lang/Runnable;", "execute-impl", "(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "equals-impl", "(Ljava/util/concurrent/Executor;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/concurrent/Executor;)I", "toString", "", "toString-impl", "(Ljava/util/concurrent/Executor;)Ljava/lang/String;", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes18.dex */
public final class DestroyExecutor implements Executor {

    @NotNull
    private final Executor delegate;

    private /* synthetic */ DestroyExecutor(Executor executor) {
        this.delegate = executor;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DestroyExecutor m17414boximpl(Executor executor) {
        return new DestroyExecutor(executor);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Executor m17415constructorimpl(@NotNull Executor executor) {
        executor.getClass();
        return executor;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m17416equalsimpl(Executor executor, Object obj) {
        return (obj instanceof DestroyExecutor) && Intrinsics.areEqual(executor, ((DestroyExecutor) obj).getDelegate());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m17417equalsimpl0(Executor executor, Executor executor2) {
        return Intrinsics.areEqual(executor, executor2);
    }

    /* renamed from: execute-impl, reason: not valid java name */
    public static void m17418executeimpl(Executor executor, @NotNull Runnable runnable) {
        runnable.getClass();
        executor.execute(runnable);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m17419hashCodeimpl(Executor executor) {
        return executor.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m17420toStringimpl(Executor executor) {
        return "DestroyExecutor(delegate=" + executor + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public boolean equals(Object obj) {
        return m17416equalsimpl(this.delegate, obj);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        runnable.getClass();
        m17418executeimpl(this.delegate, runnable);
    }

    public int hashCode() {
        return m17419hashCodeimpl(this.delegate);
    }

    public String toString() {
        return m17420toStringimpl(this.delegate);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Executor getDelegate() {
        return this.delegate;
    }
}
