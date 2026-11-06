package com.amazon.alexa.presence.locks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0010J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0019\u0010\u0016\u001a\u00020\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/presence/locks/BLEInUseLock;", "", "defaultReservationDurationMilli", "", "(J)V", "getDefaultReservationDurationMilli", "()J", "reservations", "", "Lcom/amazon/alexa/presence/locks/BLEInUseLock$Reservation;", "kotlin.jvm.PlatformType", "", "executeWithExclusiveReservation", "", "timeoutAfterMs", "timeoutCallback", "Lkotlin/Function0;", "action", "hasOutstandingReservations", "", "release", "reservation", "requestReservation", "reservationDurationMilli", "(Ljava/lang/Long;)Lcom/amazon/alexa/presence/locks/BLEInUseLock$Reservation;", "Companion", "Reservation", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBLEInUseLock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BLEInUseLock.kt\ncom/amazon/alexa/presence/locks/BLEInUseLock\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,92:1\n32#2,2:93\n*S KotlinDebug\n*F\n+ 1 BLEInUseLock.kt\ncom/amazon/alexa/presence/locks/BLEInUseLock\n*L\n47#1:93,2\n*E\n"})
/* loaded from: classes18.dex */
public final class BLEInUseLock {
    private static final Logger log;
    private final long defaultReservationDurationMilli;
    private final List<Reservation> reservations;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        log = LoggerFactory.getLogger(companion.getClass().getEnclosingClass());
    }

    public BLEInUseLock(long j) {
        this.defaultReservationDurationMilli = j;
        this.reservations = Collections.synchronizedList(new ArrayList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void executeWithExclusiveReservation$default(BLEInUseLock bLEInUseLock, long j, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bLEInUseLock.defaultReservationDurationMilli + 100;
        }
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.amazon.alexa.presence.locks.BLEInUseLock$executeWithExclusiveReservation$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        bLEInUseLock.executeWithExclusiveReservation(j, function0, function02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void release(Reservation reservation) {
        this.reservations.remove(reservation);
        reservation.onRelease$AlexaMobileAndroidPresence_release();
    }

    public static /* synthetic */ Reservation requestReservation$default(BLEInUseLock bLEInUseLock, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return bLEInUseLock.requestReservation(l);
    }

    public final void executeWithExclusiveReservation(long timeoutAfterMs, @NotNull Function0<Unit> timeoutCallback, @NotNull Function0<Unit> action) {
        timeoutCallback.getClass();
        action.getClass();
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis() + timeoutAfterMs;
            while (this.reservations.size() > 0) {
                if (currentTimeMillis <= System.currentTimeMillis()) {
                    timeoutCallback.invoke();
                    return;
                }
                log.debug("Attempted to obtain exclusive reservation while outstanding reservations\n exist. Waiting for reservations to release.");
                Iterator<Reservation> it2 = this.reservations.iterator();
                while (it2.hasNext()) {
                    Reservation next = it2.next();
                    if (next.shouldEvict()) {
                        it2.remove();
                        next.onEvict$AlexaMobileAndroidPresence_release();
                    }
                }
                Thread.sleep(100L);
            }
            action.invoke();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final long getDefaultReservationDurationMilli() {
        return this.defaultReservationDurationMilli;
    }

    public final boolean hasOutstandingReservations() {
        return this.reservations.size() > 0;
    }

    @JvmOverloads
    @NotNull
    public final Reservation requestReservation(@Nullable Long reservationDurationMilli) {
        BLEInUseLock bLEInUseLock;
        Throwable th;
        long longValue;
        synchronized (this) {
            try {
                if (reservationDurationMilli != null) {
                    try {
                        longValue = reservationDurationMilli.longValue();
                    } catch (Throwable th2) {
                        th = th2;
                        bLEInUseLock = this;
                        throw th;
                    }
                } else {
                    longValue = this.defaultReservationDurationMilli;
                }
                long j = longValue;
                bLEInUseLock = this;
                try {
                    Reservation reservation = new Reservation(bLEInUseLock, 0L, j, 2, null);
                    bLEInUseLock.reservations.add(reservation);
                    return reservation;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bLEInUseLock = this;
            }
        }
    }

    public BLEInUseLock() {
        this(0L, 1, null);
    }

    public /* synthetic */ BLEInUseLock(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 30000L : j);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\r\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\nH\u0000¢\u0006\u0002\b\rJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/presence/locks/BLEInUseLock$Reservation;", "", JoinPoint.SYNCHRONIZATION_LOCK, "Lcom/amazon/alexa/presence/locks/BLEInUseLock;", "timeOfReservation", "", "maxReservationDurationMs", "(Lcom/amazon/alexa/presence/locks/BLEInUseLock;JJ)V", "timeOfEviction", "onEvict", "", "onEvict$AlexaMobileAndroidPresence_release", "onRelease", "onRelease$AlexaMobileAndroidPresence_release", "release", "shouldEvict", "", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Reservation {

        @NotNull
        private final BLEInUseLock lock;
        private final long maxReservationDurationMs;
        private final long timeOfEviction;
        private final long timeOfReservation;

        public /* synthetic */ Reservation(BLEInUseLock bLEInUseLock, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bLEInUseLock, (i & 2) != 0 ? System.currentTimeMillis() : j, (i & 4) != 0 ? 30000L : j2);
        }

        public final void onEvict$AlexaMobileAndroidPresence_release() {
            BLEInUseLock.log.debug("Reservation evicted");
        }

        public final void onRelease$AlexaMobileAndroidPresence_release() {
            BLEInUseLock.log.debug("Reservation released");
        }

        public final void release() {
            this.lock.release(this);
        }

        public final boolean shouldEvict() {
            return this.timeOfEviction < System.currentTimeMillis();
        }

        public Reservation(@NotNull BLEInUseLock bLEInUseLock, long j, long j2) {
            bLEInUseLock.getClass();
            this.lock = bLEInUseLock;
            this.timeOfReservation = j;
            this.maxReservationDurationMs = j2;
            this.timeOfEviction = j + j2;
        }
    }

    @JvmOverloads
    @NotNull
    public final Reservation requestReservation() {
        return requestReservation$default(this, null, 1, null);
    }
}
