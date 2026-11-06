package com.amazon.alexa.ra.android.smartfragment.crypto;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0003J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestExecution;", "", "maxInFlightBytes", "", "maxInFlightCount", "deadlineMs", "", "<init>", "(IIJ)V", "getDeadlineMs", "()J", "workExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "timeoutScheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "getTimeoutScheduler$AVSMobileFramework_ra_android_smart_fragment_runtime_release", "()Ljava/util/concurrent/ScheduledExecutorService;", "admission", "Lcom/amazon/alexa/ra/android/smartfragment/crypto/AdmissionController;", "tryAcquire", "", "bytes", "release", "", "enqueue", "work", "Ljava/lang/Runnable;", "peakInFlightBytes", "getPeakInFlightBytes$AVSMobileFramework_ra_android_smart_fragment_runtime_release", "()I", "peakInFlightCount", "getPeakInFlightCount$AVSMobileFramework_ra_android_smart_fragment_runtime_release", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDigestExecution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigestExecution.kt\ncom/amazon/alexa/ra/android/smartfragment/crypto/DigestExecution\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
/* loaded from: classes18.dex */
public final class DigestExecution {
    public static final long DEFAULT_DEADLINE_MS = 5000;
    public static final int DEFAULT_MAX_IN_FLIGHT_BYTES = 33554432;
    public static final int DEFAULT_MAX_IN_FLIGHT_COUNT = 16;
    private static final int TIMEOUT_SCHEDULER_THREAD_COUNT = 1;

    @NotNull
    private final AdmissionController admission;
    private final long deadlineMs;

    @NotNull
    private final ScheduledExecutorService timeoutScheduler;
    private final ExecutorService workExecutor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final DigestExecution shared = new DigestExecution(0, 0, 0, 7, null);

    public DigestExecution(int i, int i2, long j) {
        this.deadlineMs = j;
        this.workExecutor = Executors.newSingleThreadExecutor(new ReadAheadInputStream$$ExternalSyntheticLambda1(15));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ReadAheadInputStream$$ExternalSyntheticLambda1(16));
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        this.timeoutScheduler = scheduledThreadPoolExecutor;
        this.admission = new AdmissionController(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread timeoutScheduler$lambda$3(Runnable runnable) {
        Thread thread = new Thread(runnable, "sandboxcrypto-timeout");
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread workExecutor$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, "sandboxcrypto-work");
        thread.setDaemon(true);
        return thread;
    }

    public final void enqueue(@NotNull Runnable work) {
        work.getClass();
        this.workExecutor.execute(work);
    }

    public final long getDeadlineMs() {
        return this.deadlineMs;
    }

    public final int getPeakInFlightBytes$AVSMobileFramework_ra_android_smart_fragment_runtime_release() {
        return this.admission.getPeakInFlightBytes().get();
    }

    public final int getPeakInFlightCount$AVSMobileFramework_ra_android_smart_fragment_runtime_release() {
        return this.admission.getPeakInFlightCount().get();
    }

    @NotNull
    /* renamed from: getTimeoutScheduler$AVSMobileFramework_ra_android_smart_fragment_runtime_release, reason: from getter */
    public final ScheduledExecutorService getTimeoutScheduler() {
        return this.timeoutScheduler;
    }

    public final void release(int bytes) {
        this.admission.release(bytes);
    }

    public final boolean tryAcquire(int bytes) {
        return this.admission.tryAcquire(bytes);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestExecution$Companion;", "", "<init>", "()V", "TIMEOUT_SCHEDULER_THREAD_COUNT", "", "DEFAULT_MAX_IN_FLIGHT_BYTES", "DEFAULT_MAX_IN_FLIGHT_COUNT", "DEFAULT_DEADLINE_MS", "", "shared", "Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestExecution;", "getShared", "()Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestExecution;", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DigestExecution getShared() {
            return DigestExecution.shared;
        }

        private Companion() {
        }
    }

    public DigestExecution() {
        this(0, 0, 0L, 7, null);
    }

    public /* synthetic */ DigestExecution(int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 33554432 : i, (i3 & 2) != 0 ? 16 : i2, (i3 & 4) != 0 ? 5000L : j);
    }
}
