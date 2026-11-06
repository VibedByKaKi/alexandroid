package com.amazon.whisperjoin.deviceprovisioningservice.ble;

import android.annotation.TargetApi;
import android.bluetooth.le.ScanFilter;
import android.os.ParcelUuid;
import com.amazon.whisperjoin.common.sharedtypes.ble.BleConstants;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ScanFilters {
    private static final byte BOND_STATUS = 5;
    private static final byte PLATFORM_ID = 16;
    public static final String UUID_PHILIPS_ADVERTISEMENT = "0000FE0F-0000-1000-8000-00805f9b34fb";
    private static final ParcelUuid PHILIPS_PARCEL_UUID = ParcelUuid.fromString(UUID_PHILIPS_ADVERTISEMENT);
    private static final byte[] SERVICE_DATA_FILTER_VALUE = {0, 16, 0, 0, 5};
    private static final byte[] SERVICE_DATA_FILTER_MASK = {0, -1, 0, 0, 15};

    @TargetApi(21)
    public static List<ScanFilter> getDefaultScanFilters() {
        return Arrays.asList(whisperJoinFilterForVersion((byte) 0), whisperJoinFilterForVersion((byte) 1), whisperJoinFilterForVersion((byte) 2));
    }

    @TargetApi(21)
    public static List<ScanFilter> getScanFiltersForWJandPhilips() {
        ScanFilter.Builder builder = new ScanFilter.Builder();
        ParcelUuid parcelUuid = PHILIPS_PARCEL_UUID;
        return Arrays.asList(whisperJoinFilterForVersion((byte) 0), whisperJoinFilterForVersion((byte) 1), whisperJoinFilterForVersion((byte) 2), builder.setServiceUuid(parcelUuid).setServiceData(parcelUuid, SERVICE_DATA_FILTER_VALUE, SERVICE_DATA_FILTER_MASK).build());
    }

    private static ScanFilter whisperJoinFilterForVersion(byte b) {
        return new ScanFilter.Builder().setServiceData(BleConstants.WHISPER_JOIN_PARCEL_UUID, new byte[]{b}).build();
    }
}
