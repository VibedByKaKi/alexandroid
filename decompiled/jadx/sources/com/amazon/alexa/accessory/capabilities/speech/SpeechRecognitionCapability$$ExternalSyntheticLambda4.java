package com.amazon.alexa.accessory.capabilities.speech;

import com.amazon.alexa.accessory.protocol.Firmware;
import com.amazon.alexa.accessory.repositories.device.DeviceFeature;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class SpeechRecognitionCapability$$ExternalSyntheticLambda4 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SpeechRecognitionCapability f$0;

    public /* synthetic */ SpeechRecognitionCapability$$ExternalSyntheticLambda4(SpeechRecognitionCapability speechRecognitionCapability, int i) {
        this.$r8$classId = i;
        this.f$0 = speechRecognitionCapability;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        SpeechRecognitionCapability speechRecognitionCapability = this.f$0;
        switch (i) {
            case 0:
                speechRecognitionCapability.lambda$initializeSpeechRelatedFeatures$12((DeviceFeature) obj);
                break;
            case 1:
                speechRecognitionCapability.lambda$onInitialize$6((Firmware.FirmwareInformation) obj);
                break;
            case 2:
                speechRecognitionCapability.lambda$onInitialize$7((Throwable) obj);
                break;
            case 3:
                speechRecognitionCapability.lambda$onInitialize$9((String) obj);
                break;
            case 4:
                speechRecognitionCapability.lambda$onInitialize$10((Throwable) obj);
                break;
            default:
                speechRecognitionCapability.lambda$onInitialize$3((Throwable) obj);
                break;
        }
    }
}
