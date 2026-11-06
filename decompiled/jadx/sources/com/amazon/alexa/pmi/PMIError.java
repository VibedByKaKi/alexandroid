package com.amazon.alexa.pmi;

import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0007\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/pmi/PMIError;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "<init>", "(Ljava/lang/String;)V", "ParentNotFound", "ParentClosed", "RegistrationDeadlineExceeded", "EventSubsetViolation", "DuplicateEvent", "EventOutOfOrder", "Lcom/amazon/alexa/pmi/PMIError$DuplicateEvent;", "Lcom/amazon/alexa/pmi/PMIError$EventOutOfOrder;", "Lcom/amazon/alexa/pmi/PMIError$EventSubsetViolation;", "Lcom/amazon/alexa/pmi/PMIError$ParentClosed;", "Lcom/amazon/alexa/pmi/PMIError$ParentNotFound;", "Lcom/amazon/alexa/pmi/PMIError$RegistrationDeadlineExceeded;", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public abstract class PMIError extends RuntimeException {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/pmi/PMIError$DuplicateEvent;", "Lcom/amazon/alexa/pmi/PMIError;", "timelineID", "", "Lcom/amazon/alexa/pmi/TimelineID;", "event", "Lcom/amazon/alexa/pmi/TimelineEvent;", "<init>", "(ILcom/amazon/alexa/pmi/TimelineEvent;)V", "getTimelineID", "()I", "getEvent", "()Lcom/amazon/alexa/pmi/TimelineEvent;", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DuplicateEvent extends PMIError {

        @NotNull
        private final TimelineEvent event;
        private final int timelineID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DuplicateEvent(int i, @NotNull TimelineEvent timelineEvent) {
            super("Duplicate event " + timelineEvent.name() + " received for timeline " + i, null);
            timelineEvent.getClass();
            this.timelineID = i;
            this.event = timelineEvent;
        }

        @NotNull
        public final TimelineEvent getEvent() {
            return this.event;
        }

        public final int getTimelineID() {
            return this.timelineID;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/pmi/PMIError$EventOutOfOrder;", "Lcom/amazon/alexa/pmi/PMIError;", "timelineID", "", "Lcom/amazon/alexa/pmi/TimelineID;", VoiceBridgePayloadUtil.PayloadCommand.PREVIOUS, "Lcom/amazon/alexa/pmi/TimelineEvent;", "current", "<init>", "(ILcom/amazon/alexa/pmi/TimelineEvent;Lcom/amazon/alexa/pmi/TimelineEvent;)V", "getTimelineID", "()I", "getPrevious", "()Lcom/amazon/alexa/pmi/TimelineEvent;", "getCurrent", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EventOutOfOrder extends PMIError {

        @NotNull
        private final TimelineEvent current;

        @NotNull
        private final TimelineEvent previous;
        private final int timelineID;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EventOutOfOrder(int r6, @org.jetbrains.annotations.NotNull com.amazon.alexa.pmi.TimelineEvent r7, @org.jetbrains.annotations.NotNull com.amazon.alexa.pmi.TimelineEvent r8) {
            /*
                r5 = this;
                r7.getClass()
                r8.getClass()
                java.lang.String r0 = r8.name()
                java.lang.String r1 = r7.name()
                java.lang.String r2 = " recorded out of order for timeline "
                java.lang.String r3 = ", previous: "
                java.lang.String r4 = "Event "
                java.lang.StringBuilder r0 = androidx.collection.DoubleList$$ExternalSyntheticOutline0.m(r6, r4, r0, r2, r3)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r5.<init>(r0, r1)
                r5.timelineID = r6
                r5.previous = r7
                r5.current = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.pmi.PMIError.EventOutOfOrder.<init>(int, com.amazon.alexa.pmi.TimelineEvent, com.amazon.alexa.pmi.TimelineEvent):void");
        }

        @NotNull
        public final TimelineEvent getCurrent() {
            return this.current;
        }

        @NotNull
        public final TimelineEvent getPrevious() {
            return this.previous;
        }

        public final int getTimelineID() {
            return this.timelineID;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/pmi/PMIError$EventSubsetViolation;", "Lcom/amazon/alexa/pmi/PMIError;", "childEvents", "", "Lcom/amazon/alexa/pmi/TimelineEvent;", "parentEvents", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getChildEvents", "()Ljava/util/List;", "getParentEvents", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EventSubsetViolation extends PMIError {

        @NotNull
        private final List<TimelineEvent> childEvents;

        @NotNull
        private final List<TimelineEvent> parentEvents;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public EventSubsetViolation(@NotNull List<? extends TimelineEvent> list, @NotNull List<? extends TimelineEvent> list2) {
            super("Child events " + list + " not subset of parent events " + list2, null);
            list.getClass();
            list2.getClass();
            this.childEvents = list;
            this.parentEvents = list2;
        }

        @NotNull
        public final List<TimelineEvent> getChildEvents() {
            return this.childEvents;
        }

        @NotNull
        public final List<TimelineEvent> getParentEvents() {
            return this.parentEvents;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/pmi/PMIError$ParentClosed;", "Lcom/amazon/alexa/pmi/PMIError;", "timelineID", "", "Lcom/amazon/alexa/pmi/TimelineID;", "name", "", "<init>", "(ILjava/lang/String;)V", "getTimelineID", "()I", "getName", "()Ljava/lang/String;", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ParentClosed extends PMIError {

        @NotNull
        private final String name;
        private final int timelineID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ParentClosed(int i, @NotNull String str) {
            super("Parent timeline " + i + " (" + str + ") is closed", null);
            str.getClass();
            this.timelineID = i;
            this.name = str;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getTimelineID() {
            return this.timelineID;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/pmi/PMIError$ParentNotFound;", "Lcom/amazon/alexa/pmi/PMIError;", "timelineID", "", "Lcom/amazon/alexa/pmi/TimelineID;", "<init>", "(I)V", "getTimelineID", "()I", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ParentNotFound extends PMIError {
        private final int timelineID;

        public ParentNotFound(int i) {
            super(a$$ExternalSyntheticOutline0.m(i, "Parent timeline ", " not found"), null);
            this.timelineID = i;
        }

        public final int getTimelineID() {
            return this.timelineID;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/pmi/PMIError$RegistrationDeadlineExceeded;", "Lcom/amazon/alexa/pmi/PMIError;", "timelineID", "", "Lcom/amazon/alexa/pmi/TimelineID;", "name", "", "excessMs", "", "<init>", "(ILjava/lang/String;J)V", "getTimelineID", "()I", "getName", "()Ljava/lang/String;", "getExcessMs", "()J", "AlexaMobileAndroidPerfMetricsInstrumentationAPI_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RegistrationDeadlineExceeded extends PMIError {
        private final long excessMs;

        @NotNull
        private final String name;
        private final int timelineID;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RegistrationDeadlineExceeded(int r4, @org.jetbrains.annotations.NotNull java.lang.String r5, long r6) {
            /*
                r3 = this;
                r5.getClass()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Registration deadline exceeded for parent "
                r0.<init>(r1)
                r0.append(r4)
                java.lang.String r1 = " ("
                r0.append(r1)
                r0.append(r5)
                java.lang.String r1 = ") by "
                java.lang.String r2 = "ms"
                java.lang.String r0 = defpackage.a$$ExternalSyntheticOutline0.m(r6, r1, r2, r0)
                r1 = 0
                r3.<init>(r0, r1)
                r3.timelineID = r4
                r3.name = r5
                r3.excessMs = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.pmi.PMIError.RegistrationDeadlineExceeded.<init>(int, java.lang.String, long):void");
        }

        public final long getExcessMs() {
            return this.excessMs;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getTimelineID() {
            return this.timelineID;
        }
    }

    public /* synthetic */ PMIError(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private PMIError(String str) {
        super(str);
    }
}
