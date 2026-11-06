package com.amazon.alexa.api.compat;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaPhotoCaptureControllerAdapterV2;", "Lcom/amazon/alexa/api/AlexaPhotoCaptureController;", "modelController", "Lcom/amazon/alexa/api/compat/model/AlexaPhotoCaptureController;", "<init>", "(Lcom/amazon/alexa/api/compat/model/AlexaPhotoCaptureController;)V", "initialize", "", "reporter", "Lcom/amazon/alexa/api/AlexaPhotoCaptureReporter;", "capture", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaPhotoCaptureControllerAdapterV2 implements com.amazon.alexa.api.AlexaPhotoCaptureController {

    @NotNull
    private final com.amazon.alexa.api.compat.model.AlexaPhotoCaptureController modelController;

    public AlexaPhotoCaptureControllerAdapterV2(@NotNull com.amazon.alexa.api.compat.model.AlexaPhotoCaptureController alexaPhotoCaptureController) {
        alexaPhotoCaptureController.getClass();
        this.modelController = alexaPhotoCaptureController;
    }

    @Override // com.amazon.alexa.api.AlexaPhotoCaptureController
    public void capture() {
        this.modelController.capture();
    }

    @Override // com.amazon.alexa.api.AlexaPhotoCaptureController
    public void initialize(@NotNull com.amazon.alexa.api.AlexaPhotoCaptureReporter reporter) {
        reporter.getClass();
        this.modelController.initialize(new AlexaPhotoCaptureReporterAdapterV2(reporter));
    }
}
