package com.amazon.alexa.pmi.implementation.pmi;

import com.amazon.alexa.mobilytics.configuration.Constants;
import com.amazon.alexa.pmi.TimelineEvent;
import com.amazon.alexa.pmi.TimelineInput;
import com.amazon.alexa.routing.api.RouteParameter;
import com.amazon.deecomms.common.metrics.MetricKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/pmi/implementation/pmi/TimelineValidation;", "", "validateParentChild", "Lkotlin/Result;", "", RouteParameter.PARENT, "Lcom/amazon/alexa/pmi/implementation/pmi/Timeline;", MetricKeys.VALUE_IS_CHILD, "Lcom/amazon/alexa/pmi/TimelineInput;", "validateParentChild-gIAlu-s", "(Lcom/amazon/alexa/pmi/implementation/pmi/Timeline;Lcom/amazon/alexa/pmi/TimelineInput;)Ljava/lang/Object;", "validateEventOrder", Constants.TIMELINE, "event", "Lcom/amazon/alexa/pmi/TimelineEvent;", "validateEventOrder-gIAlu-s", "(Lcom/amazon/alexa/pmi/implementation/pmi/Timeline;Lcom/amazon/alexa/pmi/TimelineEvent;)Ljava/lang/Object;", "AlexaMobileAndroidPerfMetricsInstrumentation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface TimelineValidation {
    @NotNull
    /* renamed from: validateEventOrder-gIAlu-s, reason: not valid java name */
    Object mo17373validateEventOrdergIAlus(@NotNull Timeline timeline, @NotNull TimelineEvent event);

    @NotNull
    /* renamed from: validateParentChild-gIAlu-s, reason: not valid java name */
    Object mo17374validateParentChildgIAlus(@NotNull Timeline parent, @NotNull TimelineInput child);
}
