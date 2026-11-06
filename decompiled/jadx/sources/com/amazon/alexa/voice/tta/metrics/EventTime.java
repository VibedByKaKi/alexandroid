package com.amazon.alexa.voice.tta.metrics;

import androidx.annotation.VisibleForTesting;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0003\u001c\u001d\u001eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0011\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u001aH\u0086\u0002J\u0011\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u001aH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/voice/tta/metrics/EventTime;", "", "millisecondsSinceBoot", "", "<init>", "(J)V", "differenceMilliseconds", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "addingMilliseconds", "deltaMilliseconds", "systemElapsedRealtime", "getSystemElapsedRealtime", "()J", "systemTimeMilliseconds", "getSystemTimeMilliseconds", "toDate", "Ljava/util/Date;", "equals", "", "", "compareTo", "", "hashCode", "toString", "", "plus", "Lcom/amazon/alexa/voice/tta/metrics/EventTime$Interval;", "minus", "TimeProvider", "DefaultClock", "Interval", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class EventTime implements Comparable<EventTime> {

    /* renamed from: DefaultClock, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static TimeProvider systemElapsedRealtime;

    @JvmField
    @NotNull
    public static TimeProvider systemTime;
    private final long millisecondsSinceBoot;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/voice/tta/metrics/EventTime$TimeProvider;", "", "milliseconds", "", "getMilliseconds", "()J", "Companion", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @VisibleForTesting
    public interface TimeProvider {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/voice/tta/metrics/EventTime$TimeProvider$Companion;", "", "<init>", "()V", "fromFunction", "Lcom/amazon/alexa/voice/tta/metrics/EventTime$TimeProvider;", "func", "Lkotlin/Function0;", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @NotNull
            public final TimeProvider fromFunction(@NotNull final Function0<Long> func) {
                func.getClass();
                return new TimeProvider() { // from class: com.amazon.alexa.voice.tta.metrics.EventTime$TimeProvider$Companion$fromFunction$1
                    @Override // com.amazon.alexa.voice.tta.metrics.EventTime.TimeProvider
                    public long getMilliseconds() {
                        return func.invoke().longValue();
                    }
                };
            }
        }

        long getMilliseconds();
    }

    static {
        TimeProvider.Companion companion = TimeProvider.INSTANCE;
        systemElapsedRealtime = companion.fromFunction(EventTime$DefaultClock$systemElapsedRealtime$1.INSTANCE);
        systemTime = companion.fromFunction(EventTime$DefaultClock$systemTime$1.INSTANCE);
    }

    private EventTime(long j) {
        this.millisecondsSinceBoot = j;
    }

    @JvmStatic
    @NotNull
    public static final EventTime fromSystemElapsedRealtime(long j) {
        return INSTANCE.fromSystemElapsedRealtime(j);
    }

    @JvmStatic
    @NotNull
    public static EventTime fromSystemTimeMilliseconds(long j) {
        return INSTANCE.fromSystemTimeMilliseconds(j);
    }

    @JvmStatic
    @NotNull
    public static EventTime now() {
        return INSTANCE.now();
    }

    @NotNull
    public final EventTime addingMilliseconds(long deltaMilliseconds) {
        return new EventTime(this.millisecondsSinceBoot + deltaMilliseconds);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull EventTime other) {
        other.getClass();
        return Intrinsics.compare(this.millisecondsSinceBoot, other.millisecondsSinceBoot);
    }

    public final long differenceMilliseconds(@NotNull EventTime other) {
        other.getClass();
        return this.millisecondsSinceBoot - other.millisecondsSinceBoot;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof EventTime) && this.millisecondsSinceBoot == ((EventTime) other).millisecondsSinceBoot;
    }

    /* renamed from: getSystemElapsedRealtime, reason: from getter */
    public final long getMillisecondsSinceBoot() {
        return this.millisecondsSinceBoot;
    }

    public final long getSystemTimeMilliseconds() {
        return (systemTime.getMilliseconds() + this.millisecondsSinceBoot) - systemElapsedRealtime.getMilliseconds();
    }

    public int hashCode() {
        return Long.hashCode(this.millisecondsSinceBoot);
    }

    @NotNull
    public final EventTime minus(@NotNull Interval other) {
        other.getClass();
        return new EventTime(other.getMilliseconds() + this.millisecondsSinceBoot);
    }

    @NotNull
    public final EventTime plus(@NotNull Interval other) {
        other.getClass();
        return new EventTime(other.getMilliseconds() + this.millisecondsSinceBoot);
    }

    @NotNull
    public final Date toDate() {
        return new Date(getSystemTimeMilliseconds());
    }

    @NotNull
    public String toString() {
        return AppLaunchChecker$$ExternalSyntheticOutline0.m("EventTime(", this.millisecondsSinceBoot, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\u0011\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0010H\u0086\u0002J\u0011\u0010\u0011\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u0012\u001a\u00020\u0000H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/voice/tta/metrics/EventTime$Interval;", "", "milliseconds", "", "<init>", "(J)V", "getMilliseconds", "()J", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "compareTo", "", "hashCode", "plus", "Lcom/amazon/alexa/voice/tta/metrics/EventTime;", "minus", "unaryMinus", "Companion", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Interval implements Comparable<Interval> {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final Interval ZERO = new Interval(0);
        private final long milliseconds;

        private Interval(long j) {
            this.milliseconds = j;
        }

        @JvmStatic
        @NotNull
        public static final Interval fromMilliseconds(long j) {
            return INSTANCE.fromMilliseconds(j);
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull Interval other) {
            other.getClass();
            return Intrinsics.compare(this.milliseconds, other.milliseconds);
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof Interval) && this.milliseconds == ((Interval) other).milliseconds;
        }

        public final long getMilliseconds() {
            return this.milliseconds;
        }

        public int hashCode() {
            return Long.hashCode(this.milliseconds);
        }

        @NotNull
        public final Interval minus(@NotNull Interval other) {
            other.getClass();
            return new Interval(this.milliseconds - other.milliseconds);
        }

        @NotNull
        public final Interval plus(@NotNull Interval other) {
            other.getClass();
            return new Interval(this.milliseconds + other.milliseconds);
        }

        @NotNull
        public final Interval unaryMinus() {
            return new Interval(-this.milliseconds);
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/voice/tta/metrics/EventTime$Interval$Companion;", "", "<init>", "()V", "ZERO", "Lcom/amazon/alexa/voice/tta/metrics/EventTime$Interval;", "getZERO", "()Lcom/amazon/alexa/voice/tta/metrics/EventTime$Interval;", "fromMilliseconds", "millis", "", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final Interval fromMilliseconds(long millis) {
                return new Interval(millis, null);
            }

            @NotNull
            public final Interval getZERO() {
                return Interval.ZERO;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Interval(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        @NotNull
        public final EventTime plus(@NotNull EventTime other) {
            other.getClass();
            return other.addingMilliseconds(this.milliseconds);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0017J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\rH\u0017R\u0018\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/voice/tta/metrics/EventTime$DefaultClock;", "Lcom/amazon/alexa/voice/tta/metrics/EventClock;", "<init>", "()V", "systemElapsedRealtime", "Lcom/amazon/alexa/voice/tta/metrics/EventTime$TimeProvider;", "getSystemElapsedRealtime$annotations", "systemTime", "getSystemTime$annotations", "now", "Lcom/amazon/alexa/voice/tta/metrics/EventTime;", "fromSystemElapsedRealtime", "systemRealtimeMilliseconds", "", "fromSystemTimeMilliseconds", "systemTimeMilliseconds", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.amazon.alexa.voice.tta.metrics.EventTime$DefaultClock, reason: from kotlin metadata */
    public static final class Companion implements EventClock {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final EventTime fromSystemElapsedRealtime(long systemRealtimeMilliseconds) {
            return new EventTime(systemRealtimeMilliseconds, null);
        }

        @Override // com.amazon.alexa.voice.tta.metrics.EventClock
        @JvmStatic
        @NotNull
        public EventTime fromSystemTimeMilliseconds(long systemTimeMilliseconds) {
            now();
            return new EventTime((EventTime.systemElapsedRealtime.getMilliseconds() + systemTimeMilliseconds) - EventTime.systemTime.getMilliseconds(), null);
        }

        @Override // com.amazon.alexa.voice.tta.metrics.EventClock
        @JvmStatic
        @NotNull
        public EventTime now() {
            return fromSystemElapsedRealtime(EventTime.systemElapsedRealtime.getMilliseconds());
        }

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSystemElapsedRealtime$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getSystemTime$annotations() {
        }
    }

    public /* synthetic */ EventTime(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @NotNull
    public final Interval minus(@NotNull EventTime other) {
        other.getClass();
        return Interval.INSTANCE.fromMilliseconds(this.millisecondsSinceBoot - other.millisecondsSinceBoot);
    }
}
