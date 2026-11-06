package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
class ApiType_PhotoCaptureReporterWrapper extends PhotoCaptureReporter implements AlexaPhotoCaptureReporter {
    private final AlexaPhotoCaptureReporter alexaPhotoCaptureReporter;

    public ApiType_PhotoCaptureReporterWrapper(AlexaPhotoCaptureReporter alexaPhotoCaptureReporter) {
        this.alexaPhotoCaptureReporter = alexaPhotoCaptureReporter;
    }

    @Override // com.amazon.alexa.api.PhotoCaptureReporter, com.amazon.alexa.api.AlexaPhotoCaptureReporter
    public void reportCapture(AlexaCaptureId alexaCaptureId, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator) {
        this.alexaPhotoCaptureReporter.reportCapture(alexaCaptureId, alexaCameraCaptureInitiator);
    }

    @Override // com.amazon.alexa.api.PhotoCaptureReporter, com.amazon.alexa.api.AlexaPhotoCaptureReporter
    public void reportError(AlexaCameraCaptureError alexaCameraCaptureError, AlexaCameraCaptureInitiator alexaCameraCaptureInitiator) {
        this.alexaPhotoCaptureReporter.reportError(alexaCameraCaptureError, alexaCameraCaptureInitiator);
    }
}
