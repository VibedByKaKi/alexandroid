package matter.onboardingpayload;

import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lmatter/onboardingpayload/QRCodeBasicOnboardingPayloadGenerator;", "", "payload", "Lmatter/onboardingpayload/OnboardingPayload;", "<init>", "(Lmatter/onboardingpayload/OnboardingPayload;)V", "payloadBase38Representation", "", "outBuffer", "", "AlexaMobileAndroidMatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class QRCodeBasicOnboardingPayloadGenerator {

    @NotNull
    private final OnboardingPayload payload;

    public QRCodeBasicOnboardingPayloadGenerator(@NotNull OnboardingPayload onboardingPayload) {
        onboardingPayload.getClass();
        this.payload = onboardingPayload;
    }

    public final void payloadBase38Representation(@NotNull char[] outBuffer) {
        outBuffer.getClass();
        byte[] bArr = new byte[11];
        if (this.payload.isValidQRCodePayload()) {
            QRCodeBasicOnboardingPayloadGeneratorKt.payloadBase38RepresentationWithTLV(this.payload, outBuffer, bArr, null, 0);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m("Invalid argument");
        }
    }
}
