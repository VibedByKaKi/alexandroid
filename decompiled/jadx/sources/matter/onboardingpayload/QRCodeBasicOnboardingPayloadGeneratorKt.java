package matter.onboardingpayload;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n\u001a*\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0002\u001a0\u0010\f\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0002\u001a2\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0002¨\u0006\u0016"}, d2 = {"payloadBase38RepresentationWithTLV", "", "payload", "Lmatter/onboardingpayload/OnboardingPayload;", "outBuffer", "", "bits", "", "tlvDataStart", "tlvDataLengthInBytes", "", "generateBitSet", "populateBits", "offset", "Ljava/util/concurrent/atomic/AtomicInteger;", "input", "", "numberOfBits", "totalPayloadDataSizeInBits", "populateTLVBits", "tlvBuf", "tlvBufSizeInBytes", "AlexaMobileAndroidMatter_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class QRCodeBasicOnboardingPayloadGeneratorKt {
    private static final void generateBitSet(OnboardingPayload onboardingPayload, byte[] bArr, byte[] bArr2, int i) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        int i2 = (i * 8) + 88;
        if (bArr.length * 8 < i2) {
            Buffer$$ExternalSyntheticBUOutline0.m("Buffer is too small");
            return;
        }
        populateBits(bArr, atomicInteger, onboardingPayload.getVersion(), 3, 88);
        populateBits(bArr, atomicInteger, onboardingPayload.getVendorId(), 16, 88);
        populateBits(bArr, atomicInteger, onboardingPayload.getProductId(), 16, 88);
        populateBits(bArr, atomicInteger, onboardingPayload.getCommissioningFlow(), 2, 88);
        populateBits(bArr, atomicInteger, onboardingPayload.getRendezvousInformation(), 8, 88);
        populateBits(bArr, atomicInteger, onboardingPayload.getDiscriminator(), 12, 88);
        populateBits(bArr, atomicInteger, onboardingPayload.getSetupPinCode(), 27, 88);
        populateBits(bArr, atomicInteger, 0L, 4, 88);
        populateTLVBits(bArr, atomicInteger, bArr2, i, i2);
    }

    public static final void payloadBase38RepresentationWithTLV(@NotNull OnboardingPayload onboardingPayload, @NotNull char[] cArr, @NotNull byte[] bArr, @Nullable byte[] bArr2, int i) {
        onboardingPayload.getClass();
        cArr.getClass();
        bArr.getClass();
        ArraysKt___ArraysJvmKt.fill$default(bArr, (byte) 0, 0, 0, 6, (Object) null);
        generateBitSet(onboardingPayload, bArr, bArr2, i);
        if (cArr.length < 3) {
            Buffer$$ExternalSyntheticBUOutline0.m("Buffer is too small");
            return;
        }
        char[] copyOfRange = ArraysKt.copyOfRange(cArr, 3, cArr.length);
        for (int i2 = 0; i2 < 3; i2++) {
            cArr[i2] = OnboardingPayloadKt.kQRCodePrefix.charAt(i2);
        }
        Base38Kt.base38Encode(bArr, copyOfRange);
        ArraysKt___ArraysJvmKt.copyInto$default(copyOfRange, cArr, 3, 0, 0, 12, (Object) null);
    }

    private static final void populateBits(byte[] bArr, AtomicInteger atomicInteger, long j, int i, int i2) {
        if (atomicInteger.get() + i > i2) {
            Buffer$$ExternalSyntheticBUOutline0.m("Invalid argument");
            return;
        }
        if (j >= (1 << i)) {
            Buffer$$ExternalSyntheticBUOutline0.m("Invalid argument");
            return;
        }
        int i3 = atomicInteger.get();
        atomicInteger.addAndGet(i);
        while (j != 0) {
            if ((j & 1) != 0) {
                int i4 = i3 / 8;
                bArr[i4] = (byte) ((1 << (i3 % 8)) | bArr[i4]);
            }
            i3++;
            j >>= 1;
        }
    }

    private static final void populateTLVBits(byte[] bArr, AtomicInteger atomicInteger, byte[] bArr2, int i, int i2) {
        if (bArr2 == null) {
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            populateBits(bArr, atomicInteger, UByte.m25312constructorimpl(bArr2[i3]) & 255, 8, i2);
        }
    }
}
