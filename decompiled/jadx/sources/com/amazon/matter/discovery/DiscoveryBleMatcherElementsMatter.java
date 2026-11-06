package com.amazon.matter.discovery;

import android.bluetooth.le.ScanRecord;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.SetupPayload;
import com.amazon.alexa.matter.utils.logging.MatterLogger;
import com.amazon.alexa.matter.utils.logging.PrefixLogger;
import com.amazon.coral.google.common.math.Stats$$ExternalSyntheticLambda5;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Optional;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public final class DiscoveryBleMatcherElementsMatter {
    private static final byte EXPECTED_ADVERTISEMENT_VERSION = 0;
    private static final short LONG_DISCRIMINATOR_MASK = 4095;
    private static final short SHORT_DISCRIMINATOR_MASK = 3840;
    private static final String TAG = "DiscoveryServiceBleImpl";

    @NonNull
    private final MatterLogger mLogger;

    @Inject
    public DiscoveryBleMatcherElementsMatter(@NonNull MatterLogger matterLogger) {
        this.mLogger = PrefixLogger.scopedTo(DiscoveryBleMatcherElementsMatter.class, matterLogger);
    }

    public static boolean isServiceDataMatchSetupPayload(@NonNull byte[] bArr, @NonNull SetupPayload setupPayload) {
        boolean isShortDiscriminator = setupPayload.isShortDiscriminator();
        short discriminator = (short) (((short) setupPayload.getDiscriminator()) & LONG_DISCRIMINATOR_MASK);
        Short sh = (Short) Optional.ofNullable(setupPayload.getVendorID()).map(new Stats$$ExternalSyntheticLambda5(11)).orElse((short) 0);
        short shortValue = sh.shortValue();
        Short sh2 = (Short) Optional.ofNullable(setupPayload.getProductID()).map(new Stats$$ExternalSyntheticLambda5(11)).orElse((short) 0);
        short shortValue2 = sh2.shortValue();
        String str = TAG;
        if (bArr.length != 8) {
            Log.e(str, String.format("Unexpected serviceData length (%d != %d)", 8, Integer.valueOf(bArr.length)));
            return false;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        byte b = wrap.get();
        short s = wrap.getShort();
        byte b2 = (byte) ((s >> 12) & 15);
        short s2 = (short) (s & LONG_DISCRIMINATOR_MASK);
        short s3 = wrap.getShort();
        short s4 = wrap.getShort();
        if (b != 0) {
            String.format("The device's Matter BLE OpCode (0x%02x) indicates device is not Commissionable (0x00).", Byte.valueOf(b));
            return false;
        }
        if (b2 != 0) {
            String.format("The device's Advertisement version (%d) does not match the expected version (%d).", Byte.valueOf(b2), (byte) 0);
            return false;
        }
        if (isShortDiscriminator) {
            discriminator = (short) ((discriminator << 8) & 3840);
            s2 = (short) (s2 & SHORT_DISCRIMINATOR_MASK);
            if (shortValue == 0) {
                s4 = 0;
                s3 = 0;
            }
            if (shortValue2 == 0) {
                s4 = 0;
            }
        }
        if (discriminator != s2) {
            String.format("The device's discriminator (%d) does not match the expected discriminator (%d).", Short.valueOf(s2), Short.valueOf(discriminator));
            return false;
        }
        if (shortValue != 0 && s3 != 0 && shortValue != s3) {
            String.format("The device's vendorId (%d) does not match the expected vendorId (%d).", Short.valueOf(s3), sh);
            return false;
        }
        if (shortValue2 == 0 || s4 == 0 || shortValue2 == s4) {
            return true;
        }
        String.format("The device's productId (%d) does not match the expected productId (%d).", Short.valueOf(s4), sh2);
        return false;
    }

    public boolean matches(@NonNull ScanRecord scanRecord, @NonNull SetupPayload setupPayload) {
        byte[] serviceData = scanRecord.getServiceData(DiscoveryServiceBleImpl.MATTER_SERVICE_DATA_UUID);
        if (serviceData != null) {
            return isServiceDataMatchSetupPayload(serviceData, setupPayload);
        }
        this.mLogger.debug("onScanResult(...): Null service data for UUID '0000FFF6-0000-1000-8000-00805F9B34FB', not a Matter device");
        return false;
    }
}
