package com.bugsnag.android.performance.internal;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.contacts.database.provider.ContactProviderContract;
import com.amazon.tarazed.session.sessionEvents.PlaybackStates;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081@\u0018\u0000 %2\u00020\u0001:\u0001%B\f\b\u0016ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003B\u0014\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0006J\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\nJ\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nJ\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010\nJ\u000f\u0010!\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0004\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/bugsnag/android/performance/internal/SpanState;", "", "constructor-impl", "()Ljava/util/concurrent/atomic/AtomicInteger;", "state", "Ljava/util/concurrent/atomic/AtomicInteger;", "(Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/concurrent/atomic/AtomicInteger;", ContactProviderContract.ContactDatabaseEntry.COLUMN_NAME_IS_BLOCKED, "", "isBlocked-impl", "(Ljava/util/concurrent/atomic/AtomicInteger;)Z", "isDiscarded", "isDiscarded-impl", "isOpen", "isOpen-impl", "block", "block-impl", ClientCookie.DISCARD_ATTR, "discard-impl", "end", "end-impl", PlaybackStates.ENDING, "ending-impl", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals-impl", "(Ljava/util/concurrent/atomic/AtomicInteger;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/util/concurrent/atomic/AtomicInteger;)I", "process", "process-impl", "toString", "", "toString-impl", "(Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/lang/String;", "Companion", "bugsnag-android-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nSpanImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanImpl.kt\ncom/bugsnag/android/performance/internal/SpanState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,618:1\n1#2:619\n*E\n"})
/* loaded from: classes6.dex */
public final class SpanState {
    public static final int DISCARDED = -2;
    public static final int ENDED = -6;
    public static final int ENDED_BLOCKED = -7;
    public static final int ENDING = -4;
    public static final int ENDING_BLOCKED = -5;
    public static final int OPEN = -1;
    public static final int OPEN_BLOCKED = -3;
    public static final int PROCESSED = -8;

    @NotNull
    private final AtomicInteger state;

    private /* synthetic */ SpanState(AtomicInteger atomicInteger) {
        this.state = atomicInteger;
    }

    /* renamed from: block-impl, reason: not valid java name */
    public static final boolean m23856blockimpl(AtomicInteger atomicInteger) {
        while (true) {
            int i = atomicInteger.get();
            if (i != -4) {
                if (i != -1) {
                    return i == -3 || i == -5 || i == -7;
                }
                if (atomicInteger.compareAndSet(i, -3)) {
                    return true;
                }
            } else if (atomicInteger.compareAndSet(i, -5)) {
                return true;
            }
        }
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanState m23857boximpl(AtomicInteger atomicInteger) {
        return new SpanState(atomicInteger);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInteger m23858constructorimpl() {
        return m23859constructorimpl(new AtomicInteger(-1));
    }

    /* renamed from: discard-impl, reason: not valid java name */
    public static final boolean m23860discardimpl(AtomicInteger atomicInteger) {
        int i;
        do {
            i = atomicInteger.get();
            if (i != -5 && i != -4 && i != -3 && i != -1) {
                return i == -2;
            }
        } while (!atomicInteger.compareAndSet(i, -2));
        return true;
    }

    /* renamed from: end-impl, reason: not valid java name */
    public static final boolean m23861endimpl(AtomicInteger atomicInteger) {
        while (true) {
            int i = atomicInteger.get();
            if (i != -5) {
                if (i != -4) {
                    if (i != -3) {
                        if (i != -1) {
                            return false;
                        }
                    }
                }
                if (atomicInteger.compareAndSet(i, -6)) {
                    return true;
                }
            }
            if (atomicInteger.compareAndSet(i, -7)) {
                return true;
            }
        }
    }

    /* renamed from: ending-impl, reason: not valid java name */
    public static final boolean m23862endingimpl(AtomicInteger atomicInteger) {
        while (true) {
            int i = atomicInteger.get();
            if (i != -3) {
                if (i != -1) {
                    return false;
                }
                if (atomicInteger.compareAndSet(i, -4)) {
                    return true;
                }
            } else if (atomicInteger.compareAndSet(i, -5)) {
                return true;
            }
        }
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23863equalsimpl(AtomicInteger atomicInteger, Object obj) {
        return (obj instanceof SpanState) && Intrinsics.areEqual(atomicInteger, ((SpanState) obj).getState());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23864equalsimpl0(AtomicInteger atomicInteger, AtomicInteger atomicInteger2) {
        return Intrinsics.areEqual(atomicInteger, atomicInteger2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23865hashCodeimpl(AtomicInteger atomicInteger) {
        return atomicInteger.hashCode();
    }

    /* renamed from: isBlocked-impl, reason: not valid java name */
    public static final boolean m23866isBlockedimpl(AtomicInteger atomicInteger) {
        int i = atomicInteger.get();
        return i == -3 || i == -5 || i == -7;
    }

    /* renamed from: isDiscarded-impl, reason: not valid java name */
    public static final boolean m23867isDiscardedimpl(AtomicInteger atomicInteger) {
        return atomicInteger.get() == -2;
    }

    /* renamed from: isOpen-impl, reason: not valid java name */
    public static final boolean m23868isOpenimpl(AtomicInteger atomicInteger) {
        int i = atomicInteger.get();
        return i == -1 || i == -3;
    }

    /* renamed from: process-impl, reason: not valid java name */
    public static final boolean m23869processimpl(AtomicInteger atomicInteger) {
        int i;
        do {
            i = atomicInteger.get();
            if (i == -8 || i == -2) {
                return false;
            }
        } while (!atomicInteger.compareAndSet(i, -8));
        return true;
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23870toStringimpl(AtomicInteger atomicInteger) {
        int i = atomicInteger.get();
        return i != -3 ? i != -2 ? i != -1 ? PlaybackStates.ENDED : "open" : "discarded" : "blocked";
    }

    public boolean equals(Object obj) {
        return m23863equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m23865hashCodeimpl(this.state);
    }

    @NotNull
    public String toString() {
        return m23870toStringimpl(this.state);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ AtomicInteger getState() {
        return this.state;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static AtomicInteger m23859constructorimpl(AtomicInteger atomicInteger) {
        return atomicInteger;
    }
}
