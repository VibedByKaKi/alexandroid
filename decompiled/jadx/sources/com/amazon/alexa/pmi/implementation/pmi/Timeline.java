package com.amazon.alexa.pmi.implementation.pmi;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.pmi.TimelineEvent;
import com.amazon.alexa.pmi.TimelineExitCode;
import com.amazon.alexa.pmi.TimelineInput;
import com.amazon.alexa.pmi.implementation.pmi.ReduceResult;
import com.amazon.deecomms.common.metrics.MetricKeys;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0000J\u0016\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\bJ\u000e\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020\bJ\u000e\u0010>\u001a\u0002072\u0006\u0010?\u001a\u00020%J9\u0010@\u001a\u0002HA\"\u0004\b\u0000\u0010A2\u0006\u0010B\u001a\u0002HA2\u001e\u0010C\u001a\u001a\u0012\u0004\u0012\u0002HA\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002HA0E0D¢\u0006\u0002\u0010FR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u001d\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001e\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\"@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\"\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0013\u001a\u0004\u0018\u00010%@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0011\u0010-\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b-\u0010$R\u0011\u0010.\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b.\u0010$R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0000008F¢\u0006\u0006\u001a\u0004\b1\u0010\u001aR\u0011\u00102\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105¨\u0006G"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/pmi/Timeline;", "", "id", "", "Lcom/amazon/alexa/pmi/TimelineID;", "input", "Lcom/amazon/alexa/pmi/TimelineInput;", "startTimeMs", "", "registrationTimeMs", "<init>", "(ILcom/amazon/alexa/pmi/TimelineInput;JJ)V", "getId", "()I", "getInput", "()Lcom/amazon/alexa/pmi/TimelineInput;", "getStartTimeMs", "()J", "getRegistrationTimeMs", "value", "parentTimeline", "getParentTimeline", "()Lcom/amazon/alexa/pmi/implementation/pmi/Timeline;", "childTimelines", "", "getChildTimelines", "()Ljava/util/List;", "events", "Lcom/amazon/alexa/pmi/TimelineEvent;", "getEvents", "eventTimestamps", "", "getEventTimestamps", "()Ljava/util/Map;", "", "isOpen", "()Z", "Lcom/amazon/alexa/pmi/TimelineExitCode;", "exitCode", "getExitCode", "()Lcom/amazon/alexa/pmi/TimelineExitCode;", "closedAtMs", "getClosedAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "isComplete", "isLeaf", "hierarchy", "", "getHierarchy", "hierarchicalName", "", "getHierarchicalName", "()Ljava/lang/String;", "addChild", "", MetricKeys.VALUE_IS_CHILD, "recordEvent", "event", "timestampMs", "close", "atMs", "setExitCode", "code", "reduce", ExifInterface.GPS_DIRECTION_TRUE, "initialValue", "reducer", "Lkotlin/Function2;", "Lcom/amazon/alexa/pmi/implementation/pmi/ReduceResult;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class Timeline {

    @NotNull
    private final List<Timeline> childTimelines;

    @Nullable
    private Long closedAtMs;

    @NotNull
    private final Map<TimelineEvent, Long> eventTimestamps;

    @NotNull
    private final List<TimelineEvent> events;

    @Nullable
    private TimelineExitCode exitCode;
    private final int id;

    @NotNull
    private final TimelineInput input;
    private boolean isOpen;

    @Nullable
    private Timeline parentTimeline;
    private final long registrationTimeMs;
    private final long startTimeMs;

    public Timeline(int i, @NotNull TimelineInput timelineInput, long j, long j2) {
        timelineInput.getClass();
        this.id = i;
        this.input = timelineInput;
        this.startTimeMs = j;
        this.registrationTimeMs = j2;
        this.childTimelines = new ArrayList();
        this.events = new ArrayList();
        this.eventTimestamps = new LinkedHashMap();
        this.isOpen = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_hierarchicalName_$lambda$0(Timeline timeline) {
        timeline.getClass();
        return timeline.input.getName();
    }

    public final void addChild(@NotNull Timeline child) {
        child.getClass();
        this.childTimelines.add(child);
        child.parentTimeline = this;
    }

    public final void close(long atMs) {
        this.isOpen = false;
        this.closedAtMs = Long.valueOf(atMs);
    }

    @NotNull
    public final List<Timeline> getChildTimelines() {
        return this.childTimelines;
    }

    @Nullable
    public final Long getClosedAtMs() {
        return this.closedAtMs;
    }

    @NotNull
    public final Map<TimelineEvent, Long> getEventTimestamps() {
        return this.eventTimestamps;
    }

    @NotNull
    public final List<TimelineEvent> getEvents() {
        return this.events;
    }

    @Nullable
    public final TimelineExitCode getExitCode() {
        return this.exitCode;
    }

    @NotNull
    public final String getHierarchicalName() {
        return CollectionsKt.joinToString$default(getHierarchy(), ".", null, null, new Timeline$$ExternalSyntheticLambda0(0), 30);
    }

    @NotNull
    public final List<Timeline> getHierarchy() {
        ArrayList arrayList = new ArrayList();
        while (this != null) {
            arrayList.add(this);
            this = this.parentTimeline;
        }
        return CollectionsKt.reversed(arrayList);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final TimelineInput getInput() {
        return this.input;
    }

    @Nullable
    public final Timeline getParentTimeline() {
        return this.parentTimeline;
    }

    public final long getRegistrationTimeMs() {
        return this.registrationTimeMs;
    }

    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final boolean isComplete() {
        return this.eventTimestamps.keySet().containsAll(this.input.getRegisteredEvents());
    }

    public final boolean isLeaf() {
        return this.childTimelines.isEmpty();
    }

    /* renamed from: isOpen, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    public final void recordEvent(@NotNull TimelineEvent event, long timestampMs) {
        event.getClass();
        this.events.add(event);
        this.eventTimestamps.put(event, Long.valueOf(timestampMs));
    }

    public final <T> T reduce(T initialValue, @NotNull Function2<? super T, ? super Timeline, ? extends ReduceResult<? extends T>> reducer) {
        reducer.getClass();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this);
        while (!arrayDeque.isEmpty()) {
            Timeline timeline = (Timeline) arrayDeque.removeFirst();
            ReduceResult<? extends T> invoke = reducer.invoke(initialValue, timeline);
            if (!(invoke instanceof ReduceResult.Continue)) {
                if (invoke instanceof ReduceResult.Stop) {
                    return (T) ((ReduceResult.Stop) invoke).getValue();
                }
                PathKt$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            initialValue = (T) ((ReduceResult.Continue) invoke).getValue();
            arrayDeque.addAll(timeline.childTimelines);
        }
        return initialValue;
    }

    public final void setExitCode(@NotNull TimelineExitCode code) {
        code.getClass();
        this.exitCode = code;
    }
}
