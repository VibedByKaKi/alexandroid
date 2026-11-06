package com.amazon.tarazed.utility;

import android.content.Context;
import com.amazon.tarazed.cache.CacheManager;
import com.amazon.tarazed.dagger.scopes.LibraryScope;
import com.amazon.tarazed.logging.TarazedSessionLogger;
import com.amazon.tarazed.metrics.TarazedMetricsHelper;
import com.amazon.tarazed.signaling.TarazedEventDispatcher;
import com.amazon.tarazed.signaling.TarazedIoTManager;
import com.dee.app.contacts.common.constants.Constants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@LibraryScope
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0010H\u0081@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/amazon/tarazed/utility/BrowserPresenceDetectorToResumeSuspendedSession;", "Lcom/amazon/tarazed/utility/BrowserPresenceDetector;", "context", "Landroid/content/Context;", "logger", "Lcom/amazon/tarazed/logging/TarazedSessionLogger;", "cacheManager", "Lcom/amazon/tarazed/cache/CacheManager;", "metricsHelper", "Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;", "eventDispatcher", "Lcom/amazon/tarazed/signaling/TarazedEventDispatcher;", "iotManager", "Lcom/amazon/tarazed/signaling/TarazedIoTManager;", "(Landroid/content/Context;Lcom/amazon/tarazed/logging/TarazedSessionLogger;Lcom/amazon/tarazed/cache/CacheManager;Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;Lcom/amazon/tarazed/signaling/TarazedEventDispatcher;Lcom/amazon/tarazed/signaling/TarazedIoTManager;)V", "connectIot", "", "connectIot$TarazedAndroidLibrary_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBrowserPresent", "timeout", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class BrowserPresenceDetectorToResumeSuspendedSession extends BrowserPresenceDetector {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String METRIC_BROWSER_DETECTOR_IOT_FAILURE = "BrowserDetectorIoTFailure";

    @NotNull
    private static final String TAG = "BrwsrDtectorResume";

    @NotNull
    private final CacheManager cacheManager;

    @NotNull
    private final Context context;

    @NotNull
    private final TarazedEventDispatcher eventDispatcher;

    @NotNull
    private final TarazedIoTManager iotManager;

    @NotNull
    private final TarazedSessionLogger logger;

    @NotNull
    private final TarazedMetricsHelper metricsHelper;

    @Inject
    public BrowserPresenceDetectorToResumeSuspendedSession(@NotNull Context context, @NotNull TarazedSessionLogger tarazedSessionLogger, @NotNull CacheManager cacheManager, @NotNull TarazedMetricsHelper tarazedMetricsHelper, @NotNull TarazedEventDispatcher tarazedEventDispatcher, @NotNull TarazedIoTManager tarazedIoTManager) {
        context.getClass();
        tarazedSessionLogger.getClass();
        cacheManager.getClass();
        tarazedMetricsHelper.getClass();
        tarazedEventDispatcher.getClass();
        tarazedIoTManager.getClass();
        this.context = context;
        this.logger = tarazedSessionLogger;
        this.cacheManager = cacheManager;
        this.metricsHelper = tarazedMetricsHelper;
        this.eventDispatcher = tarazedEventDispatcher;
        this.iotManager = tarazedIoTManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (com.amazon.tarazed.signaling.TarazedIoTManager.connect$default(r1, r11, false, null, r5, 4, null) == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        if (r11 == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[Catch: Exception -> 0x0033, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:13:0x002f, B:25:0x005e), top: B:8:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Boolean, java.lang.Object] */
    @androidx.annotation.VisibleForTesting
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectIot$TarazedAndroidLibrary_release(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession$connectIot$1
            if (r0 == 0) goto L14
            r0 = r11
            com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession$connectIot$1 r0 = (com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession$connectIot$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession$connectIot$1 r0 = new com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession$connectIot$1
            r0.<init>(r10, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r5.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r8 = 0
            r2 = 2
            r9 = 1
            if (r1 == 0) goto L45
            if (r1 == r9) goto L3d
            if (r1 != r2) goto L36
            java.lang.Object r10 = r5.L$0
            com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession r10 = (com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession) r10
            kotlin.ResultKt.throwOnFailure(r11)     // Catch: java.lang.Exception -> L33
            goto L74
        L33:
            r0 = move-exception
            r11 = r0
            goto L79
        L36:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            rx.Single$$ExternalSyntheticBUOutline0.m$2(r10)
            r10 = 0
            return r10
        L3d:
            java.lang.Object r10 = r5.L$0
            com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession r10 = (com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L55
        L45:
            kotlin.ResultKt.throwOnFailure(r11)
            com.amazon.tarazed.cache.CacheManager r11 = r10.cacheManager
            r5.L$0 = r10
            r5.label = r9
            java.lang.Object r11 = r11.getCachedCredentials$TarazedAndroidLibrary_release(r5)
            if (r11 != r0) goto L55
            goto L73
        L55:
            com.amazon.tarazed.sessionclient.model.createcredentials.CreateCredentialsResponse r11 = (com.amazon.tarazed.sessionclient.model.createcredentials.CreateCredentialsResponse) r11
            if (r11 != 0) goto L5e
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            return r10
        L5e:
            com.amazon.tarazed.signaling.TarazedIoTManager r1 = r10.iotManager     // Catch: java.lang.Exception -> L33
            com.amazon.tarazed.sessionclient.model.createcredentials.SignalingCredentials r11 = r11.getSignalingCredentials()     // Catch: java.lang.Exception -> L33
            r5.L$0 = r10     // Catch: java.lang.Exception -> L33
            r5.label = r2     // Catch: java.lang.Exception -> L33
            r3 = 0
            r4 = 0
            r6 = 4
            r7 = 0
            r2 = r11
            java.lang.Object r10 = com.amazon.tarazed.signaling.TarazedIoTManager.connect$default(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L33
            if (r10 != r0) goto L74
        L73:
            return r0
        L74:
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
            return r10
        L79:
            com.amazon.tarazed.logging.TarazedSessionLogger r0 = r10.logger
            java.lang.String r1 = "Failed to connect to IoT"
            java.lang.String r2 = "BrwsrDtectorResume"
            r0.e(r2, r1, r11)
            com.amazon.tarazed.metrics.TarazedMetricsHelper r10 = r10.metricsHelper
            java.lang.String r11 = "BrowserDetectorIoTFailure"
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10.addCountHighPriority(r2, r11, r0)
            java.lang.Boolean r10 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.tarazed.utility.BrowserPresenceDetectorToResumeSuspendedSession.connectIot$TarazedAndroidLibrary_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.amazon.tarazed.utility.BrowserPresenceDetector
    @Nullable
    public Object isBrowserPresent(long j, @NotNull Continuation<? super Boolean> continuation) {
        return CoroutineScopeKt.coroutineScope(new BrowserPresenceDetectorToResumeSuspendedSession$isBrowserPresent$2(this, j, null), continuation);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/utility/BrowserPresenceDetectorToResumeSuspendedSession$Companion;", "", "()V", "METRIC_BROWSER_DETECTOR_IOT_FAILURE", "", Constants.LOG_TAG, "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
