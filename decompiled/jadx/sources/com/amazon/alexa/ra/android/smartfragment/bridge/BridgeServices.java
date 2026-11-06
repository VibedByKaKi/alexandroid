package com.amazon.alexa.ra.android.smartfragment.bridge;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda6;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda0;
import com.amazon.alexa.ra.android.smartfragment.bridge.BridgeServices;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeServices;", "", "mainExecutor", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/MainExecutor;", "destroyExecutor", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/DestroyExecutor;", "scheduler", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/WatchdogScheduler;", "metrics", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lcom/amazon/alexa/ra/android/smartfragment/bridge/WatchdogScheduler;Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMainExecutor-vMkZxnM", "()Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "getDestroyExecutor--QJWbYk", "getScheduler", "()Lcom/amazon/alexa/ra/android/smartfragment/bridge/WatchdogScheduler;", "getMetrics", "()Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactHostBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactHostBridge.kt\ncom/amazon/alexa/ra/android/smartfragment/bridge/BridgeServices\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,938:1\n1#2:939\n*E\n"})
/* loaded from: classes18.dex */
public final class BridgeServices {

    @NotNull
    private static final Executor sharedDestroyExecutor;

    @NotNull
    private final Executor destroyExecutor;

    @NotNull
    private final Executor mainExecutor;

    @NotNull
    private final BridgeMetrics metrics;

    @NotNull
    private final WatchdogScheduler scheduler;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ReadAheadInputStream$$ExternalSyntheticLambda1(14));
        newSingleThreadExecutor.getClass();
        sharedDestroyExecutor = newSingleThreadExecutor;
    }

    private BridgeServices(Executor executor, Executor executor2, WatchdogScheduler watchdogScheduler, BridgeMetrics bridgeMetrics) {
        executor.getClass();
        executor2.getClass();
        watchdogScheduler.getClass();
        bridgeMetrics.getClass();
        this.mainExecutor = executor;
        this.destroyExecutor = executor2;
        this.scheduler = watchdogScheduler;
        this.metrics = bridgeMetrics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread sharedDestroyExecutor$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "sandbox-bridge-teardown");
        thread.setDaemon(true);
        return thread;
    }

    @NotNull
    /* renamed from: getDestroyExecutor--QJWbYk, reason: not valid java name and from getter */
    public final Executor getDestroyExecutor() {
        return this.destroyExecutor;
    }

    @NotNull
    /* renamed from: getMainExecutor-vMkZxnM, reason: not valid java name and from getter */
    public final Executor getMainExecutor() {
        return this.mainExecutor;
    }

    @NotNull
    public final BridgeMetrics getMetrics() {
        return this.metrics;
    }

    @NotNull
    public final WatchdogScheduler getScheduler() {
        return this.scheduler;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeServices$Companion;", "", "<init>", "()V", "sharedDestroyExecutor", "Ljava/util/concurrent/Executor;", "default", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeServices;", "metrics", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/BridgeMetrics;", "handlerScheduler", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/WatchdogScheduler;", "looper", "Landroid/os/Looper;", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ BridgeServices default$default(Companion companion, BridgeMetrics bridgeMetrics, int i, Object obj) {
            if ((i & 1) != 0) {
                bridgeMetrics = BridgeMetrics.INSTANCE.getLOGGING();
            }
            return companion.m17412default(bridgeMetrics);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void default$lambda$0(Runnable runnable) {
            runnable.getClass();
            UiThreadUtil.runOnUiThread(runnable);
        }

        private final WatchdogScheduler handlerScheduler(final Looper looper) {
            return new WatchdogScheduler() { // from class: com.amazon.alexa.ra.android.smartfragment.bridge.BridgeServices$Companion$$ExternalSyntheticLambda2
                @Override // com.amazon.alexa.ra.android.smartfragment.bridge.WatchdogScheduler
                public final Function0 schedule(long j, Function0 function0) {
                    Function0 handlerScheduler$lambda$3;
                    handlerScheduler$lambda$3 = BridgeServices.Companion.handlerScheduler$lambda$3(looper, j, function0);
                    return handlerScheduler$lambda$3;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Function0 handlerScheduler$lambda$3(Looper looper, long j, Function0 function0) {
            function0.getClass();
            Handler handler = new Handler(looper);
            ReactHostBridge$$ExternalSyntheticLambda4 reactHostBridge$$ExternalSyntheticLambda4 = new ReactHostBridge$$ExternalSyntheticLambda4(function0, 1);
            handler.postDelayed(reactHostBridge$$ExternalSyntheticLambda4, j);
            return new Recomposer$$ExternalSyntheticLambda6(handler, reactHostBridge$$ExternalSyntheticLambda4, 23);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handlerScheduler$lambda$3$lambda$2(Handler handler, Runnable runnable) {
            handler.removeCallbacks(runnable);
            return Unit.INSTANCE;
        }

        @NotNull
        /* renamed from: default, reason: not valid java name */
        public final BridgeServices m17412default(@NotNull BridgeMetrics metrics) {
            metrics.getClass();
            Executor m17423constructorimpl = MainExecutor.m17423constructorimpl(new WebStorageCompat$$ExternalSyntheticLambda0(6));
            Executor m17415constructorimpl = DestroyExecutor.m17415constructorimpl(BridgeServices.sharedDestroyExecutor);
            Looper mainLooper = Looper.getMainLooper();
            mainLooper.getClass();
            return new BridgeServices(m17423constructorimpl, m17415constructorimpl, handlerScheduler(mainLooper), metrics, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BridgeServices(Executor executor, Executor executor2, WatchdogScheduler watchdogScheduler, BridgeMetrics bridgeMetrics, DefaultConstructorMarker defaultConstructorMarker) {
        this(executor, executor2, watchdogScheduler, bridgeMetrics);
    }
}
