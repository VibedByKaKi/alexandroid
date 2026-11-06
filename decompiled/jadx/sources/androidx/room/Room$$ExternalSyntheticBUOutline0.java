package androidx.room;

import android.app.ApplicationExitInfo;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import autovalue.shaded.com.google.common.base.VerifyException;
import com.amazon.alexa.accessory.User;
import com.amazon.alexa.accessory.avsclient.context.AlexaIOComponentsSupplier;
import com.amazon.alexa.accessory.capabilities.crypto.KeyExchangeCapability;
import com.amazon.alexa.accessory.capabilities.firmware.FirmwareCapability;
import com.amazon.alexa.accessory.capabilities.speech.SpeechRecognitionCapability;
import com.amazon.alexa.accessory.internal.SuccessResponseAction;
import com.amazon.alexa.accessory.metrics.Stopwatch;
import com.amazon.alexa.accessory.protocol.Accessories;
import com.amazon.alexa.accessory.repositories.device.DeviceFeature;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class Room$$ExternalSyntheticBUOutline0 implements Id3Decoder.FramePredicate, Predicate, SuccessResponseAction.Mapper, KeyExchangeCapability.IrrecoverableErrorCallback, Stopwatch.CurrentTimeSupplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Room$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IOException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void m$2(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void m$3(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        boolean lambda$static$0;
        boolean lambda$static$1;
        switch (this.$r8$classId) {
            case 1:
                lambda$static$0 = Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
                return lambda$static$0;
            default:
                lambda$static$1 = Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
                return lambda$static$1;
        }
    }

    @Override // com.amazon.alexa.accessory.metrics.Stopwatch.CurrentTimeSupplier
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // com.amazon.alexa.accessory.internal.SuccessResponseAction.Mapper
    public Object map(Accessories.Response response) {
        switch (this.$r8$classId) {
            case 18:
                return response.getCameraActionResponse();
            case 19:
                return response.getSetCameraSettingsResponse();
            case 20:
                return response.getGetCameraSettingsResponse();
            case 21:
                return response.getCblInformation();
            case 22:
            case 23:
            case 24:
            case 25:
            default:
                return response.getState();
            case 26:
                return response.getInputBehaviorConfigurationSet();
            case 27:
                return response.getSetNaturalTurnDetectionStateResponse();
        }
    }

    @Override // com.amazon.alexa.accessory.capabilities.crypto.KeyExchangeCapability.IrrecoverableErrorCallback
    public void onIrrecoverableError() {
        KeyExchangeCapability.lambda$new$0();
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean lambda$observeUserChanges$9;
        boolean lambda$observeDAVSArtifactsAvailability$45;
        boolean lambda$prepareArtifactPackage$35;
        boolean lambda$initializeSpeechRelatedFeatures$11;
        switch (this.$r8$classId) {
            case 17:
                lambda$observeUserChanges$9 = AlexaIOComponentsSupplier.lambda$observeUserChanges$9((User) obj);
                return lambda$observeUserChanges$9;
            case 24:
                lambda$observeDAVSArtifactsAvailability$45 = FirmwareCapability.lambda$observeDAVSArtifactsAvailability$45((Boolean) obj);
                return lambda$observeDAVSArtifactsAvailability$45;
            case 25:
                lambda$prepareArtifactPackage$35 = FirmwareCapability.lambda$prepareArtifactPackage$35((Accessories.Response) obj);
                return lambda$prepareArtifactPackage$35;
            default:
                lambda$initializeSpeechRelatedFeatures$11 = SpeechRecognitionCapability.lambda$initializeSpeechRelatedFeatures$11((DeviceFeature) obj);
                return lambda$initializeSpeechRelatedFeatures$11;
        }
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void m$1(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void m(String str) {
        throw new VerifyException(str);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) {
        throw new IOException(str + obj + obj2);
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo m(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new RuntimeException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void m(String str, Object[] objArr) {
        throw new IllegalStateException(String.format(str, objArr));
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2, Object obj3) {
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
