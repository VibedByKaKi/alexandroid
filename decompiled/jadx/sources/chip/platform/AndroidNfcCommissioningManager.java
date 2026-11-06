package chip.platform;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class AndroidNfcCommissioningManager implements NfcCommissioningManager {
    private static final int ISODEP_TIMEOUT_IN_MS = 5000;
    private static final int MAX_CHAINED_RESPONSE_SIZE = 2048;
    private static final String TAG = "AndroidNfcCommissioningManager";
    private static final byte TYPE4_CMD_FIRST_OR_ONLY_OCCURENCE = 12;
    private static final byte TYPE4_CMD_READ_BINARY = -80;
    private static final byte TYPE4_CMD_SELECT = -92;
    private static final byte TYPE4_CMD_SELECT_BY_FILE_ID = 0;
    private static final byte TYPE4_CMD_SELECT_BY_NAME = 4;
    private static final int TYPE4_HEADER_SIZE = 4;
    private static final int TYPE4_MAX_CAPDU_SIZE = 246;
    private static final int TYPE4_MAX_RAPDU_SIZE = 246;
    private static final int TYPE4_SIMPLE_APDU_MAX_RX_SIZE = 250;
    private static final int TYPE4_SIMPLE_APDU_MAX_TX_SIZE = 245;
    private static byte[] chainedResponseBuffer = new byte[2048];
    private static int chainedResponseLen;
    private NfcCallback mNfcCallback;
    private AndroidChipPlatform mPlatform;
    private IsoDep mIsoDep = null;
    private HandlerThread handlerThread = null;
    private Handler workerHandler = null;

    private void addDataToChainedResponseBuffer(byte[] bArr, int i) throws IOException {
        int i2 = chainedResponseLen;
        int i3 = i2 + i;
        byte[] bArr2 = chainedResponseBuffer;
        if (i3 >= bArr2.length) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Error! Too many data for chainedResponseBuffer!");
        } else {
            System.arraycopy(bArr, 0, bArr2, i2, i);
            chainedResponseLen += i;
        }
    }

    private static String convertHexByteArrayToString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x ", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    private static byte[] convertIntTo2BytesHexaFormat(int i) throws IOException {
        if (i >= 0 && i <= 65535) {
            return new byte[]{(byte) ((i >> 8) & 255), (byte) i};
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Failed to convert Int to Hex!");
        return null;
    }

    private void dumpResponse(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            Log.e(TAG, "Error! Empty response!");
        } else {
            new StringBuilder("Response: ").append(convertHexByteArrayToString(bArr));
        }
    }

    private byte[] getChainedResponseBufferData() {
        int i = chainedResponseLen;
        byte[] bArr = new byte[i];
        System.arraycopy(chainedResponseBuffer, 0, bArr, 0, i);
        convertHexByteArrayToString(bArr);
        return bArr;
    }

    private byte[] getResponse(byte b) throws IOException {
        return transceive("getResponse", new byte[]{0, -64, 0, 0, b});
    }

    private void printSw1Sw2(byte b, byte b2) {
        String.format("0x%02X", Byte.valueOf(b));
        String.format("0x%02X", Byte.valueOf(b2));
    }

    private byte[] processAPDUResponse(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length < 2) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Error! Invalid Type4 response");
            return null;
        }
        resetChainedResponseBuffer();
        int length = bArr.length;
        int i = length - 2;
        byte b = bArr[i];
        byte b2 = bArr[length - 1];
        if (IsStatusSuccess(b, b2)) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            return bArr2;
        }
        if (!IsResponseBlockAvailable(b)) {
            printSw1Sw2(b, b2);
            Buffer$$ExternalSyntheticBUOutline0.m$2("Error! Invalid APDU response");
            return null;
        }
        addDataToChainedResponseBuffer(bArr, i);
        while (IsResponseBlockAvailable(b)) {
            if (b2 == 0 || b2 > 250) {
                b2 = -6;
            }
            byte[] response = getResponse(b2);
            if (response == null || response.length < 2) {
                Buffer$$ExternalSyntheticBUOutline0.m$2("Invalid NFC Type4 response");
                return null;
            }
            int length2 = response.length;
            int i2 = length2 - 2;
            b = response[i2];
            b2 = response[length2 - 1];
            if (IsStatusSuccess(b, b2)) {
                addDataToChainedResponseBuffer(response, i2);
            } else {
                if (!IsResponseBlockAvailable(b)) {
                    printSw1Sw2(b, b2);
                    Buffer$$ExternalSyntheticBUOutline0.m$2("Error! Invalid APDU response");
                    return null;
                }
                addDataToChainedResponseBuffer(response, i2);
            }
        }
        return getChainedResponseBufferData();
    }

    private void resetChainedResponseBuffer() {
        chainedResponseLen = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] selectMatterApplication() throws IOException {
        byte[] transceive = transceive("selectMatterApplication", new byte[]{0, TYPE4_CMD_SELECT, 4, 12, 9, -96, 0, 0, 9, 9, -118, 119, -28, 1, 0});
        if (transceive == null || transceive.length < 2) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Invalid NFC Type4 response");
            return null;
        }
        int length = transceive.length;
        int i = length - 2;
        byte b = transceive[i];
        byte b2 = transceive[length - 1];
        if (!IsStatusSuccess(b, b2)) {
            printSw1Sw2(b, b2);
            Buffer$$ExternalSyntheticBUOutline0.m$2("Error! selectMatterApplication failed!");
            return null;
        }
        if (length == 2) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(transceive, 0, bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] sendChainedAPDUs(byte[] bArr) throws IOException {
        int length = bArr.length;
        int length2 = bArr.length;
        byte[] bArr2 = null;
        int i = 0;
        while (length2 > 0) {
            int min = Math.min(length2, 245);
            byte[] bArr3 = new byte[min];
            System.arraycopy(bArr, i, bArr3, 0, min);
            boolean z = min == length2;
            byte[] sendTransportAPDU = sendTransportAPDU(bArr3, z, length);
            if (sendTransportAPDU == null || sendTransportAPDU.length < 2) {
                Buffer$$ExternalSyntheticBUOutline0.m$2("Invalid NFC Type4 response");
                return null;
            }
            int length3 = sendTransportAPDU.length;
            byte b = sendTransportAPDU[length3 - 2];
            byte b2 = sendTransportAPDU[length3 - 1];
            if (z) {
                if (!IsStatusSuccess(b, b2) && !IsResponseBlockAvailable(b)) {
                    printSw1Sw2(b, b2);
                    Buffer$$ExternalSyntheticBUOutline0.m$2("Error during chained APDUs");
                    return null;
                }
            } else if (!IsStatusSuccess(b, b2)) {
                printSw1Sw2(b, b2);
                Buffer$$ExternalSyntheticBUOutline0.m$2("Error during chained APDUs");
                return null;
            }
            i += min;
            length2 -= min;
            bArr2 = sendTransportAPDU;
        }
        if (length2 == 0) {
            return processAPDUResponse(bArr2);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2("Error during APDUs transmission!");
        return null;
    }

    private byte[] sendTransportAPDU(byte[] bArr, boolean z, int i) throws IOException {
        byte[] bArr2 = new byte[bArr.length + 6];
        bArr2[0] = z ? Byte.MIN_VALUE : (byte) -112;
        bArr2[1] = 32;
        bArr2[2] = (byte) (i >> 8);
        bArr2[3] = (byte) i;
        bArr2[4] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
        bArr2[bArr.length + 5] = -6;
        return transceive("sendTransportAPDU", bArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsoDepTimeout(int i) throws IOException {
        IsoDep isoDep = this.mIsoDep;
        if (isoDep == null) {
            Log.e(TAG, "Error! mIsoDep is null!");
            return;
        }
        if (!isoDep.isConnected()) {
            this.mIsoDep.close();
            this.mIsoDep.connect();
        }
        this.mIsoDep.setTimeout(i);
    }

    private byte[] transceive(String str, byte[] bArr) throws IOException {
        IsoDep isoDep = this.mIsoDep;
        if (isoDep == null) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Error! mIsoDep is null!");
            return null;
        }
        if (!isoDep.isConnected()) {
            this.mIsoDep.close();
            this.mIsoDep.connect();
        }
        int length = bArr.length;
        convertHexByteArrayToString(bArr);
        byte[] transceive = this.mIsoDep.transceive(bArr);
        if (transceive == null || transceive.length < 2) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Invalid NFC Type4 response");
            return null;
        }
        dumpResponse(transceive);
        return transceive;
    }

    public boolean IsResponseBlockAvailable(byte b) {
        return b == 97;
    }

    public boolean IsStatusSuccess(byte b, byte b2) {
        return b == -112 && b2 == 0;
    }

    @Override // chip.platform.NfcCommissioningManager
    public NfcCallback getCallback() {
        return this.mNfcCallback;
    }

    @Override // chip.platform.NfcCommissioningManager
    public int init() {
        HandlerThread handlerThread = new HandlerThread("NfcWorkerThread");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.workerHandler = new Handler(this.handlerThread.getLooper()) { // from class: chip.platform.AndroidNfcCommissioningManager.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                try {
                    String unused = AndroidNfcCommissioningManager.TAG;
                    byte[] sendChainedAPDUs = AndroidNfcCommissioningManager.this.sendChainedAPDUs((byte[]) message.obj);
                    if (sendChainedAPDUs != null) {
                        AndroidNfcCommissioningManager.this.mPlatform.onNfcTagResponse(sendChainedAPDUs);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    AndroidNfcCommissioningManager.this.mPlatform.onNfcTagError();
                }
            }
        };
        return 0;
    }

    @Override // chip.platform.NfcCommissioningManager
    public void sendToNfcTag(byte[] bArr) {
        String str = TAG;
        Handler handler = this.workerHandler;
        if (handler == null) {
            Log.e(str, "NFC workerHandler is null!");
            return;
        }
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.obj = bArr.clone();
        this.workerHandler.sendMessage(obtainMessage);
    }

    @Override // chip.platform.NfcCommissioningManager
    public void setAndroidChipPlatform(AndroidChipPlatform androidChipPlatform) {
        this.mPlatform = androidChipPlatform;
    }

    public void setNFCTag(Tag tag) {
        IsoDep isoDep = IsoDep.get(tag);
        this.mIsoDep = isoDep;
        if (isoDep == null) {
            Log.e(TAG, "mIsoDep is null");
        } else {
            isoDep.isExtendedLengthApduSupported();
            this.workerHandler.post(new Runnable() { // from class: chip.platform.AndroidNfcCommissioningManager.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AndroidNfcCommissioningManager.this.selectMatterApplication();
                        AndroidNfcCommissioningManager.this.setIsoDepTimeout(5000);
                    } catch (IOException e) {
                        e.printStackTrace();
                        AndroidNfcCommissioningManager.this.mPlatform.onNfcTagError();
                    }
                }
            });
        }
    }

    @Override // chip.platform.NfcCommissioningManager
    public void setNfcCallback(NfcCallback nfcCallback) {
        this.mNfcCallback = nfcCallback;
    }

    @Override // chip.platform.NfcCommissioningManager
    public void shutdown() {
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.handlerThread = null;
        }
        this.workerHandler = null;
    }
}
