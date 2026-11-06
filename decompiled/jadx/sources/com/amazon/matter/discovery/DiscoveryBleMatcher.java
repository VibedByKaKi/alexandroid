package com.amazon.matter.discovery;

import android.util.Log;
import com.amazon.alexa.matter.eventbus.schema.SetupPayload;
import com.amazon.coral.google.common.math.Stats$$ExternalSyntheticLambda5;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Optional;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class DiscoveryBleMatcher {
    private static final byte EXPECTED_ADVERTISEMENT_VERSION = 0;
    private static final short SHORT_DISCRIMINATOR_MASK = 3840;
    private static final String TAG = "DiscoveryServiceBleImpl";

    private DiscoveryBleMatcher() {
    }

    private static short bytesToShort(byte b, byte b2) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(b);
        allocate.put(b2);
        return allocate.getShort(0);
    }

    public static boolean isServiceDataMatchSetupPayload(byte[] bArr, SetupPayload setupPayload) {
        boolean isShortDiscriminator = setupPayload.isShortDiscriminator();
        short discriminator = (short) setupPayload.getDiscriminator();
        Short sh = (Short) Optional.ofNullable(setupPayload.getVendorID()).map(new Stats$$ExternalSyntheticLambda5(11)).orElse((short) 0);
        short shortValue = sh.shortValue();
        Short sh2 = (Short) Optional.ofNullable(setupPayload.getProductID()).map(new Stats$$ExternalSyntheticLambda5(11)).orElse((short) 0);
        short shortValue2 = sh2.shortValue();
        if (bArr.length != 8) {
            Log.e(TAG, String.format("Unexpected serviceData length (%d != %d)", 8, Integer.valueOf(bArr.length)));
            return false;
        }
        byte b = bArr[0];
        short bytesToShort = bytesToShort(bArr[1], bArr[2]);
        byte b2 = (byte) ((bytesToShort >> 12) & 15);
        short s = (short) (bytesToShort & 4095);
        short bytesToShort2 = bytesToShort(bArr[3], bArr[4]);
        short bytesToShort3 = bytesToShort(bArr[5], bArr[6]);
        byte b3 = bArr[7];
        if (b != 0) {
            String.format("The device's Matter BLE OpCode (0x%02x) indicates device is not Commissionable (0x00).", Byte.valueOf(b));
            return false;
        }
        if (b2 != 0) {
            String.format("The device's Advertisement version (%d) does not match the expected version (%d).", Byte.valueOf(b2), (byte) 0);
            return false;
        }
        if (isShortDiscriminator) {
            discriminator = (short) (discriminator & SHORT_DISCRIMINATOR_MASK);
            s = (short) (s & SHORT_DISCRIMINATOR_MASK);
            if (shortValue == 0) {
                bytesToShort2 = 0;
                bytesToShort3 = 0;
            }
            if (shortValue2 == 0) {
                bytesToShort3 = 0;
            }
        }
        if (discriminator != s) {
            String.format("The device's discriminator (%d) does not match the expected discriminator (%d).", Short.valueOf(s), Short.valueOf(discriminator));
            return false;
        }
        if (bytesToShort2 != 0 && shortValue != bytesToShort2) {
            String.format("The device's vendorId (%d) does not match the expected vendorId (%d).", Short.valueOf(bytesToShort2), sh);
            return false;
        }
        if (bytesToShort3 != 0 && shortValue2 != bytesToShort3) {
            String.format("The device's productId (%d) does not match the expected productId (%d).", Short.valueOf(bytesToShort3), sh2);
            return false;
        }
        if ((b3 & 254) != 0) {
            String.format("The device's Additional Data Flag (0x%02x) contains invalid data.", Byte.valueOf(b3));
            return false;
        }
        if (1 == b3) {
            String.format("The device's Additional Data Flag (0x%02x) indicates 'additional commissioning-related data' may be accessed by the commissioner via an unencrypted read-only GATT characteristic C3.", Byte.valueOf(b3));
        }
        return true;
    }
}
