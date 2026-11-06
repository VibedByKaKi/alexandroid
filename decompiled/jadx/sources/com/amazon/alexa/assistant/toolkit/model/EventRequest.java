package com.amazon.alexa.assistant.toolkit.model;

import com.amazon.alexa.assistant.foundation.model.Context;
import com.amazon.alexa.assistant.foundation.model.Event;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\b\"J\u001d\u0010#\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010%\u001a\u00020\u0010HÆ\u0003Jd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u001c\b\u0002\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\b'J\u0013\u0010(\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R%\u0010\b\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/model/EventRequest;", "", "event", "Lcom/amazon/alexa/assistant/foundation/model/Event;", "context", "Lcom/amazon/alexa/assistant/foundation/model/Context;", "timeout", "Lkotlin/time/Duration;", "completion", "Lkotlin/Function1;", "Lkotlin/Result;", "", "", "cancellationJob", "Lkotlinx/coroutines/Job;", "holdForReconnect", "", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/Event;Lcom/amazon/alexa/assistant/foundation/model/Context;Lkotlin/time/Duration;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/Job;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEvent", "()Lcom/amazon/alexa/assistant/foundation/model/Event;", "getContext", "()Lcom/amazon/alexa/assistant/foundation/model/Context;", "getTimeout-FghU774", "()Lkotlin/time/Duration;", "getCompletion", "()Lkotlin/jvm/functions/Function1;", "getCancellationJob", "()Lkotlinx/coroutines/Job;", "getHoldForReconnect", "()Z", "component1", "component2", "component3", "component3-FghU774", "component4", "component5", "component6", "copy", "copy-fUqyM7Y", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EventRequest {

    @Nullable
    private final Job cancellationJob;

    @Nullable
    private final Function1<Result<Integer>, Unit> completion;

    @Nullable
    private final Context context;

    @NotNull
    private final Event event;
    private final boolean holdForReconnect;

    @Nullable
    private final Duration timeout;

    public /* synthetic */ EventRequest(Event event, Context context, Duration duration, Function1 function1, Job job, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(event, (i & 2) != 0 ? null : context, (i & 4) != 0 ? null : duration, (i & 8) != 0 ? null : function1, (i & 16) != 0 ? null : job, (i & 32) != 0 ? false : z, null);
    }

    /* renamed from: copy-fUqyM7Y$default, reason: not valid java name */
    public static /* synthetic */ EventRequest m15089copyfUqyM7Y$default(EventRequest eventRequest, Event event, Context context, Duration duration, Function1 function1, Job job, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            event = eventRequest.event;
        }
        if ((i & 2) != 0) {
            context = eventRequest.context;
        }
        if ((i & 4) != 0) {
            duration = eventRequest.timeout;
        }
        if ((i & 8) != 0) {
            function1 = eventRequest.completion;
        }
        if ((i & 16) != 0) {
            job = eventRequest.cancellationJob;
        }
        if ((i & 32) != 0) {
            z = eventRequest.holdForReconnect;
        }
        Job job2 = job;
        boolean z2 = z;
        return eventRequest.m15091copyfUqyM7Y(event, context, duration, function1, job2, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    /* renamed from: component3-FghU774, reason: not valid java name and from getter */
    public final Duration getTimeout() {
        return this.timeout;
    }

    @Nullable
    public final Function1<Result<Integer>, Unit> component4() {
        return this.completion;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Job getCancellationJob() {
        return this.cancellationJob;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHoldForReconnect() {
        return this.holdForReconnect;
    }

    @NotNull
    /* renamed from: copy-fUqyM7Y, reason: not valid java name */
    public final EventRequest m15091copyfUqyM7Y(@NotNull Event event, @Nullable Context context, @Nullable Duration timeout, @Nullable Function1<? super Result<Integer>, Unit> completion, @Nullable Job cancellationJob, boolean holdForReconnect) {
        event.getClass();
        return new EventRequest(event, context, timeout, completion, cancellationJob, holdForReconnect, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventRequest)) {
            return false;
        }
        EventRequest eventRequest = (EventRequest) other;
        return Intrinsics.areEqual(this.event, eventRequest.event) && Intrinsics.areEqual(this.context, eventRequest.context) && Intrinsics.areEqual(this.timeout, eventRequest.timeout) && Intrinsics.areEqual(this.completion, eventRequest.completion) && Intrinsics.areEqual(this.cancellationJob, eventRequest.cancellationJob) && this.holdForReconnect == eventRequest.holdForReconnect;
    }

    @Nullable
    public final Job getCancellationJob() {
        return this.cancellationJob;
    }

    @Nullable
    public final Function1<Result<Integer>, Unit> getCompletion() {
        return this.completion;
    }

    @Nullable
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Event getEvent() {
        return this.event;
    }

    public final boolean getHoldForReconnect() {
        return this.holdForReconnect;
    }

    @Nullable
    /* renamed from: getTimeout-FghU774, reason: not valid java name */
    public final Duration m15092getTimeoutFghU774() {
        return this.timeout;
    }

    public int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        Context context = this.context;
        int hashCode2 = (hashCode + (context == null ? 0 : context.hashCode())) * 31;
        Duration duration = this.timeout;
        int m26682hashCodeimpl = (hashCode2 + (duration == null ? 0 : Duration.m26682hashCodeimpl(duration.getRawValue()))) * 31;
        Function1<Result<Integer>, Unit> function1 = this.completion;
        int hashCode3 = (m26682hashCodeimpl + (function1 == null ? 0 : function1.hashCode())) * 31;
        Job job = this.cancellationJob;
        return Boolean.hashCode(this.holdForReconnect) + ((hashCode3 + (job != null ? job.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "EventRequest(event=" + this.event + ", context=" + this.context + ", timeout=" + this.timeout + ", completion=" + this.completion + ", cancellationJob=" + this.cancellationJob + ", holdForReconnect=" + this.holdForReconnect + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private EventRequest(Event event, Context context, Duration duration, Function1<? super Result<Integer>, Unit> function1, Job job, boolean z) {
        event.getClass();
        this.event = event;
        this.context = context;
        this.timeout = duration;
        this.completion = function1;
        this.cancellationJob = job;
        this.holdForReconnect = z;
    }

    public /* synthetic */ EventRequest(Event event, Context context, Duration duration, Function1 function1, Job job, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(event, context, duration, function1, job, z);
    }
}
