package com.amazon.alexa.ra.sdk.capability;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\f\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\bJ\b\u0010\u0010\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/ra/sdk/capability/ConversationSurfaces;", "", "<init>", "()V", "raActivityCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "isPluggableSessionHidden", "Lkotlin/Function0;", "", "installPluggableSessionProbe", "", "probe", "uninstallPluggableSessionProbe", "onRaActivityCreated", "onRaActivityDestroyed", "isOnlyHiddenSurfaceReceiving", "reset", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ConversationSurfaces {

    @Nullable
    private static volatile Function0<Boolean> isPluggableSessionHidden;

    @NotNull
    public static final ConversationSurfaces INSTANCE = new ConversationSurfaces();

    @NotNull
    private static final AtomicInteger raActivityCount = new AtomicInteger(0);
    public static final int $stable = 8;

    private ConversationSurfaces() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int onRaActivityDestroyed$lambda$0(int i) {
        if (i > 0) {
            return i - 1;
        }
        return 0;
    }

    public final synchronized void installPluggableSessionProbe(@NotNull Function0<Boolean> probe) {
        probe.getClass();
        isPluggableSessionHidden = probe;
    }

    public final boolean isOnlyHiddenSurfaceReceiving() {
        Function0<Boolean> function0;
        return raActivityCount.get() == 0 && (function0 = isPluggableSessionHidden) != null && function0.invoke().booleanValue();
    }

    public final void onRaActivityCreated() {
        raActivityCount.incrementAndGet();
    }

    public final void onRaActivityDestroyed() {
        raActivityCount.updateAndGet(new ConversationSurfaces$$ExternalSyntheticLambda0());
    }

    @VisibleForTesting
    public final void reset() {
        raActivityCount.set(0);
        isPluggableSessionHidden = null;
    }

    public final synchronized void uninstallPluggableSessionProbe(@NotNull Function0<Boolean> probe) {
        probe.getClass();
        if (isPluggableSessionHidden == probe) {
            isPluggableSessionHidden = null;
        }
    }
}
