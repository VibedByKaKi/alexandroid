package com.amazon.alexa.accessory.frames.ota;

import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.protocol.Assettransfer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class OtaErrorCode {
    public static final int BLUETOOTH_CONNECTION_LOST = -202;
    public static final int DISK_SPACE_FULL = -205;
    public static final int DOWNLOAD_FAILED_P2P = -204;
    public static final int DOWNLOAD_FAILED_WIFI_D2C = -203;
    public static final int GENERIC = -201;
    public static final int SOFTAP_SETUP_FAILED = -206;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.frames.ota.OtaErrorCode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$TransferErrorCode;

        static {
            int[] iArr = new int[Assettransfer.TransferErrorCode.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$TransferErrorCode = iArr;
            try {
                iArr[Assettransfer.TransferErrorCode.TRANSFER_ERROR_CONNECTION_LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$TransferErrorCode[Assettransfer.TransferErrorCode.TRANSFER_ERROR_STORAGE_FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private OtaErrorCode() {
    }

    public static int fromDeviceTransferErrorCode(Assettransfer.TransferErrorCode transferErrorCode) {
        return AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Assettransfer$TransferErrorCode[transferErrorCode.ordinal()] != 1 ? GENERIC : DOWNLOAD_FAILED_WIFI_D2C;
    }

    @Nullable
    public static Assettransfer.TransferErrorCode toDeviceTransferErrorCode(int i) {
        switch (i) {
            case SOFTAP_SETUP_FAILED /* -206 */:
                return Assettransfer.TransferErrorCode.TRANSFER_ERROR_CONNECTION_REFUSED;
            case DISK_SPACE_FULL /* -205 */:
                return Assettransfer.TransferErrorCode.TRANSFER_ERROR_STORAGE_FULL;
            case DOWNLOAD_FAILED_P2P /* -204 */:
                return Assettransfer.TransferErrorCode.TRANSFER_ERROR_DOWNLOAD_FAILED;
            case DOWNLOAD_FAILED_WIFI_D2C /* -203 */:
                return Assettransfer.TransferErrorCode.TRANSFER_ERROR_POOR_WIFI_CONNECTION;
            case BLUETOOTH_CONNECTION_LOST /* -202 */:
                return Assettransfer.TransferErrorCode.TRANSFER_ERROR_CONNECTION_LOST;
            default:
                return Assettransfer.TransferErrorCode.TRANSFER_ERROR_TIMEOUT;
        }
    }
}
