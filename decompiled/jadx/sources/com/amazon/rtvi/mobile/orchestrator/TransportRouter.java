package com.amazon.rtvi.mobile.orchestrator;

import com.amazon.alexa.accessory.frames.amazonphotos.AmazonPhotosConstants;
import com.amazon.rtvi.alexa.model.enums.CaptureMode;
import com.amazon.rtvi.alexa.model.events.EnrichmentsGenerated;
import com.amazon.rtvi.alexa.model.events.FrameData;
import com.amazon.rtvi.alexa.model.events.RTVIEvent;
import com.amazon.rtvi.mobile.alexa.AlexaEventSender;
import com.amazon.rtvi.mobile.alexa.DataPlaneSender;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/amazon/rtvi/mobile/orchestrator/TransportRouter;", "", "control", "Lcom/amazon/rtvi/mobile/alexa/AlexaEventSender;", "data", "Lcom/amazon/rtvi/mobile/alexa/DataPlaneSender;", "dataPlaneEnabled", "Lkotlin/Function0;", "", "<init>", "(Lcom/amazon/rtvi/mobile/alexa/AlexaEventSender;Lcom/amazon/rtvi/mobile/alexa/DataPlaneSender;Lkotlin/jvm/functions/Function0;)V", "send", "", "event", "Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", "payload", "", AmazonPhotosConstants.CAPTURE_MODE_KEY, "Lcom/amazon/rtvi/alexa/model/enums/CaptureMode;", "warmUp", "useDataPlane", "isDataPlane", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TransportRouter {

    @NotNull
    private final AlexaEventSender control;

    @NotNull
    private final DataPlaneSender data;

    @NotNull
    private final Function0<Boolean> dataPlaneEnabled;

    public TransportRouter(@NotNull AlexaEventSender alexaEventSender, @NotNull DataPlaneSender dataPlaneSender, @NotNull Function0<Boolean> function0) {
        alexaEventSender.getClass();
        dataPlaneSender.getClass();
        function0.getClass();
        this.control = alexaEventSender;
        this.data = dataPlaneSender;
        this.dataPlaneEnabled = function0;
    }

    private final boolean isDataPlane(RTVIEvent event) {
        return (event instanceof FrameData) || (event instanceof EnrichmentsGenerated);
    }

    private final boolean useDataPlane(RTVIEvent event) {
        return this.dataPlaneEnabled.invoke().booleanValue() && isDataPlane(event);
    }

    public final void send(@NotNull RTVIEvent event, @Nullable String payload, @Nullable CaptureMode captureMode) {
        event.getClass();
        if (useDataPlane(event)) {
            this.data.sendEvent(event, payload, captureMode);
        } else {
            this.control.sendEvent(event, payload);
        }
    }

    public final void warmUp() {
        this.data.warmUp();
    }
}
