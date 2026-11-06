package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaCameraCaptureError;
import com.amazon.alexa.api.AlexaCameraCaptureInitiator;
import com.amazon.alexa.api.AlexaCaptureId;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/api/compat/AlexaPhotoCaptureReporterAdapter;", "Lcom/amazon/alexa/api/compat/AlexaPhotoCaptureReporter;", "photoCaptureReporter", "Lcom/amazon/alexa/api/AlexaPhotoCaptureReporter;", "<init>", "(Lcom/amazon/alexa/api/AlexaPhotoCaptureReporter;)V", "reportCapture", "", "captureId", "Lcom/amazon/alexa/api/AlexaCaptureId;", "captureInitiator", "Lcom/amazon/alexa/api/AlexaCameraCaptureInitiator;", "reportError", "captureError", "Lcom/amazon/alexa/api/AlexaCameraCaptureError;", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaPhotoCaptureReporterAdapter implements AlexaPhotoCaptureReporter {

    @NotNull
    private final com.amazon.alexa.api.AlexaPhotoCaptureReporter photoCaptureReporter;

    public AlexaPhotoCaptureReporterAdapter(@NotNull com.amazon.alexa.api.AlexaPhotoCaptureReporter alexaPhotoCaptureReporter) {
        alexaPhotoCaptureReporter.getClass();
        this.photoCaptureReporter = alexaPhotoCaptureReporter;
    }

    @Override // com.amazon.alexa.api.compat.AlexaPhotoCaptureReporter
    public void reportCapture(@NotNull AlexaCaptureId captureId, @NotNull AlexaCameraCaptureInitiator captureInitiator) {
        captureId.getClass();
        captureInitiator.getClass();
        this.photoCaptureReporter.reportCapture(captureId, captureInitiator);
    }

    @Override // com.amazon.alexa.api.compat.AlexaPhotoCaptureReporter
    public void reportError(@NotNull AlexaCameraCaptureError captureError, @NotNull AlexaCameraCaptureInitiator captureInitiator) {
        captureError.getClass();
        captureInitiator.getClass();
        this.photoCaptureReporter.reportError(captureError, captureInitiator);
    }
}
