package com.amazon.alexa.ra.android.smartfragment.bridge;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000  2\u00020\u0001:\u0003\u001e\u001f B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission;", "", "maxPerWindow", "", "maxPending", "ceiling", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/PendingCeiling;", "nanoTime", "Lkotlin/Function0;", "", "<init>", "(IILcom/amazon/alexa/ra/android/smartfragment/bridge/PendingCeiling;Lkotlin/jvm/functions/Function0;)V", JoinPoint.SYNCHRONIZATION_LOCK, "windowStartNanos", "windowCount", "pending", "hasReportedInWindow", "", "tryAcquire", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Permit;", "onShed", "Lkotlin/Function1;", "", "", "decide", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision;", "rollWindowIfElapsed", "reject", "reason", "releaseSlot", "Permit", "Decision", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInboundAdmission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundAdmission.kt\ncom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,252:1\n1#2:253\n*E\n"})
/* loaded from: classes18.dex */
public final class InboundAdmission {
    private static final int ERRORS_PENDING_PER_BRIDGE = 10;
    private static final int ERRORS_PENDING_PER_PROCESS = 40;
    private static final int ERRORS_PER_WINDOW = 10;
    private static final int MESSAGES_PENDING_PER_BRIDGE = 32;
    private static final int MESSAGES_PENDING_PER_PROCESS = 128;
    private static final int MESSAGES_PER_WINDOW = 100;

    @NotNull
    public static final String REASON_PENDING = "pending-limit";

    @NotNull
    public static final String REASON_PROCESS_PENDING = "process-pending-limit";

    @NotNull
    public static final String REASON_RATE = "rate-limited";
    private static final long WINDOW_NANOS = 1000000000;

    @NotNull
    private final PendingCeiling ceiling;
    private boolean hasReportedInWindow;

    @NotNull
    private final Object lock;
    private final int maxPending;
    private final int maxPerWindow;

    @NotNull
    private final Function0<Long> nanoTime;
    private int pending;
    private int windowCount;
    private long windowStartNanos;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final PendingCeiling messageCeiling = new PendingCeiling(128);

    @NotNull
    private static final PendingCeiling errorCeiling = new PendingCeiling(40);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.amazon.alexa.ra.android.smartfragment.bridge.InboundAdmission$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Long> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0, System.class, "nanoTime", "nanoTime()J", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.nanoTime());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision;", "", "Admitted", "FirstRejection", "Rejected", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision$Admitted;", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision$FirstRejection;", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision$Rejected;", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Decision {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision$Admitted;", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision;", "permit", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Permit;", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission;", "<init>", "(Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Permit;)V", "getPermit", "()Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Permit;", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Admitted implements Decision {
            public static final int $stable = 8;

            @NotNull
            private final Permit permit;

            public Admitted(@NotNull Permit permit) {
                permit.getClass();
                this.permit = permit;
            }

            @NotNull
            public final Permit getPermit() {
                return this.permit;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision$FirstRejection;", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision;", "reason", "", "<init>", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FirstRejection implements Decision {
            public static final int $stable = 0;

            @NotNull
            private final String reason;

            public FirstRejection(@NotNull String str) {
                str.getClass();
                this.reason = str;
            }

            @NotNull
            public final String getReason() {
                return this.reason;
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision$Rejected;", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Decision;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Rejected implements Decision {
            public static final int $stable = 0;

            @NotNull
            public static final Rejected INSTANCE = new Rejected();

            private Rejected() {
            }

            public boolean equals(@Nullable Object other) {
                return this == other || (other instanceof Rejected);
            }

            public int hashCode() {
                return 1244459084;
            }

            @NotNull
            public String toString() {
                return "Rejected";
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Permit;", "", "<init>", "(Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission;)V", "isReleased", "Ljava/util/concurrent/atomic/AtomicBoolean;", "release", "", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Permit {

        @NotNull
        private final AtomicBoolean isReleased = new AtomicBoolean(false);

        public Permit() {
        }

        public final void release() {
            if (this.isReleased.compareAndSet(false, true)) {
                InboundAdmission.this.releaseSlot();
            }
        }
    }

    public InboundAdmission(int i, int i2, @NotNull PendingCeiling pendingCeiling, @NotNull Function0<Long> function0) {
        pendingCeiling.getClass();
        function0.getClass();
        this.maxPerWindow = i;
        this.maxPending = i2;
        this.ceiling = pendingCeiling;
        this.nanoTime = function0;
        this.lock = new Object();
        this.windowStartNanos = function0.invoke().longValue();
    }

    private final Decision decide() {
        rollWindowIfElapsed();
        if (this.windowCount >= this.maxPerWindow) {
            return reject(REASON_RATE);
        }
        if (this.pending >= this.maxPending) {
            return reject(REASON_PENDING);
        }
        if (!this.ceiling.tryReserve()) {
            return reject(REASON_PROCESS_PENDING);
        }
        this.windowCount++;
        this.pending++;
        return new Decision.Admitted(new Permit());
    }

    private final Decision reject(String reason) {
        if (this.hasReportedInWindow) {
            return Decision.Rejected.INSTANCE;
        }
        this.hasReportedInWindow = true;
        return new Decision.FirstRejection(reason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseSlot() {
        synchronized (this.lock) {
            this.pending = Math.max(0, this.pending - 1);
            Unit unit = Unit.INSTANCE;
        }
        this.ceiling.release();
    }

    private final void rollWindowIfElapsed() {
        long longValue = this.nanoTime.invoke().longValue();
        if (longValue - this.windowStartNanos < 1000000000) {
            return;
        }
        this.windowStartNanos = longValue;
        this.windowCount = 0;
        this.hasReportedInWindow = false;
    }

    @Nullable
    public final Permit tryAcquire(@NotNull Function1<? super String, Unit> onShed) {
        Decision decide;
        onShed.getClass();
        synchronized (this.lock) {
            decide = decide();
        }
        if (decide instanceof Decision.Admitted) {
            return ((Decision.Admitted) decide).getPermit();
        }
        if (decide instanceof Decision.FirstRejection) {
            onShed.invoke(((Decision.FirstRejection) decide).getReason());
            return null;
        }
        if (Intrinsics.areEqual(decide, Decision.Rejected.INSTANCE)) {
            return null;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission$Companion;", "", "<init>", "()V", "REASON_RATE", "", "REASON_PENDING", "REASON_PROCESS_PENDING", "WINDOW_NANOS", "", "MESSAGES_PER_WINDOW", "", "MESSAGES_PENDING_PER_BRIDGE", "MESSAGES_PENDING_PER_PROCESS", "ERRORS_PER_WINDOW", "ERRORS_PENDING_PER_BRIDGE", "ERRORS_PENDING_PER_PROCESS", "messageCeiling", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/PendingCeiling;", "errorCeiling", "forMessages", "Lcom/amazon/alexa/ra/android/smartfragment/bridge/InboundAdmission;", "forErrors", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InboundAdmission forErrors() {
            return new InboundAdmission(10, 10, InboundAdmission.errorCeiling, null, 8, null);
        }

        @NotNull
        public final InboundAdmission forMessages() {
            return new InboundAdmission(100, 32, InboundAdmission.messageCeiling, null, 8, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ InboundAdmission(int i, int i2, PendingCeiling pendingCeiling, Function0 function0, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, pendingCeiling, (i3 & 8) != 0 ? AnonymousClass1.INSTANCE : function0);
    }
}
