package com.amazon.whisperbridge.ble;

import android.util.Base64;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class AdvertisementData {
    private static final int ADVERTISED_SDK_VERSION_INDEX_LENGTH = 2;
    public static final int ADVERTISED_SDK_VERSION_INDEX_UNKNOWN = 0;
    public static final byte AUTHENTICATED_SETUP_MASK = 2;
    private static final int CAPABILITY_INDEX_VERSION_LENGTH = 2;
    private static final int CLIENT_NONCE_LENGTH = 3;
    private static final int DEVICE_IDENTITY_LENGTH = 9;
    public static final byte DISTRESS_ADVERTISEMENT_VERSION = 1;
    private static final int DISTRESS_CODE_LENGTH = 1;
    public static final byte ESIM_ADVERTISEMENT_VERSION = 2;
    public static final int FULL_NAME = 9;
    public static final int NO_NAME = -1;
    public static final byte PIN_SETUP_MASK = 4;
    private static final int PRODUCT_INDEX_LENGTH = 4;
    private static final int PURPOSE_CODE_LENGTH = 1;
    private static final byte SERVICE_DATA_TYPE_IDENTIFIER = 22;
    public static final byte SETUP_ADVERTISEMENT_VERSION = 0;
    private static final int SETUP_FLAGS_BYTE_LENGTH = 1;
    public static final int SHORT_NAME = 8;
    private static final String TAG = "com.amazon.whisperbridge.ble.AdvertisementData";
    public static final byte UNAUTHENTICATED_SETUP_MASK = 1;
    private static final String UTF_8_CHARSET_NAME = "UTF-8";
    private static final int WJ_ADVERTISEMENT_MAXIMUM_SUPPORTED_VERSION = 2;
    private static final int WJ_ADVERTISEMENT_V1_MIN_DATA_LENGTH = 20;
    private static final int WJ_ADVERTISEMENT_V1_MIN_DATA_LENGTH_WITH_SDK_VERSION_INDEX = 22;
    private static final int WJ_ADVERTISEMENT_V2_MIN_DATA_LENGTH = 21;
    private static final int WJ_ADVERTISEMENT_V2_MIN_DATA_LENGTH_WITH_SDK_VERSION_INDEX = 23;
    private static final int WJ_ADVERTISEMENT_V3_MIN_DATA_LENGTH = 21;
    private static final int WJ_ADVERTISEMENT_V3_MIN_DATA_LENGTH_WITH_SDK_VERSION_INDEX = 23;
    private static final int WJ_MIN_SERVICE_DATA_LENGTH = 3;
    private final int mAdvertisedSdkVersionIndex;
    private final byte mAdvertisementVersion;
    private final String mClientNonce;
    private final byte[] mData;
    private final String mDeviceIdentity;
    private final String mDeviceName;
    private final int mDeviceNameType;
    private final byte mDistressCode;
    private final String mProductIndex;
    private final byte mPurposeCode;
    private final String mSoftwareVersion;
    private final boolean mSupportedAuthenticatedEcdhe;
    private final boolean mSupportsPin;
    private final boolean mSupportsUnauthenticatedEcdhe;
    private static final Charset UTF_8_CHARSET = Charset.forName("UTF-8");
    private static final byte[] WJV2_16BIT_UUID = {-2, 0};

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BleData {
        private final ByteArrayInputStream mData;
        private final int mLength;
        private final byte mType;

        public BleData(byte b, byte[] bArr, int i, int i2) {
            if (bArr == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("buffer can not be null");
                throw null;
            }
            if (i < 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("offset must be >= 0");
                throw null;
            }
            if (i2 <= 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("length must be > 0");
                throw null;
            }
            if (i + i2 > bArr.length) {
                Single$$ExternalSyntheticBUOutline0.m(bArr.length, ErrorUtils$$ExternalSyntheticOutline0.m29m(i, i2, "offset: ", " and length ", "< buffer.length"));
                throw null;
            }
            this.mType = b;
            this.mData = new ByteArrayInputStream(bArr, i, i2);
            this.mLength = i2;
        }

        public int getLength() {
            return this.mLength;
        }

        public byte getType() {
            return this.mType;
        }

        public byte[] read(int i) {
            byte[] bArr = new byte[i];
            this.mData.read(bArr, 0, i);
            return bArr;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Factory {
        private int mAdvertisedSdkVersionIndex;
        private byte mAdvertisementVersion;
        private String mClientNonce;
        private byte[] mData;
        private String mDeviceIdentity;
        private String mDeviceName;
        private int mDeviceNameType;
        private byte mDistressCode;
        private String mProductIndex;
        private byte mPurposeCode;
        private String mSoftwareVersion;
        private boolean mSupportedAuthenticatedEcdhe;
        private boolean mSupportsPin;
        private boolean mSupportsUnauthenticatedEcdhe;

        private BleData findType(int i) {
            ArrayList<BleData> findTypes = findTypes(i);
            if (findTypes.size() == 0) {
                return null;
            }
            return findTypes.get(0);
        }

        private ArrayList<BleData> findTypes(int i) {
            ArrayList<BleData> arrayList = new ArrayList<>();
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                byte[] bArr = this.mData;
                if (i3 >= bArr.length) {
                    return arrayList;
                }
                byte b = bArr[i2];
                byte b2 = bArr[i3];
                if (b2 == i) {
                    arrayList.add(new BleData(b2, bArr, i2 + 2, b - 1));
                }
                i2 = i2 + b + 1;
            }
        }

        private BleData findWhisperJoinData(ArrayList<BleData> arrayList) {
            if (arrayList == null) {
                return null;
            }
            Iterator<BleData> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                BleData next = it2.next();
                if (next.getLength() >= 3) {
                    byte[] read = next.read(2);
                    if (read[0] == AdvertisementData.WJV2_16BIT_UUID[1] && read[1] == AdvertisementData.WJV2_16BIT_UUID[0]) {
                        byte b = next.read(1)[0];
                        this.mAdvertisementVersion = b;
                        if (isWhisperJoinAdvertisement(b, next.getLength())) {
                            return next;
                        }
                    }
                }
            }
            return null;
        }

        private String getHexString(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (byte b : bArr) {
                sb.append(String.format(Locale.ENGLISH, "%02X", Byte.valueOf(b)));
            }
            return sb.toString();
        }

        private String getUTF8String(BleData bleData, int i) {
            return new String(bleData.read(i), AdvertisementData.UTF_8_CHARSET);
        }

        private boolean isWhisperJoinAdvertisement(byte b, int i) {
            if (b > 2) {
                WJLog.i(AdvertisementData.TAG, String.format(Locale.ENGLISH, "Unsupported WhisperJoin version(0x%02X) detected.", Byte.valueOf(b)));
                return false;
            }
            if (b == 0 && i < 20) {
                String str = AdvertisementData.TAG;
                Locale locale = Locale.ENGLISH;
                WJLog.i(str, "WhisperJoin V1 advertisement data too short. Buffer length: " + i);
                return false;
            }
            if (b == 1 && i < 21) {
                String str2 = AdvertisementData.TAG;
                Locale locale2 = Locale.ENGLISH;
                WJLog.i(str2, "WhisperJoin V2 advertisement data too short. Buffer length: " + i);
                return false;
            }
            if (b != 2 || i >= 21) {
                return true;
            }
            String str3 = AdvertisementData.TAG;
            Locale locale3 = Locale.ENGLISH;
            WJLog.d(str3, "WhisperJoin eSIM advertisement data too short. Buffer length: " + i);
            return false;
        }

        public String asciiStringFromHex(String str) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 2;
                sb.append((char) Integer.parseInt(str.substring(i, i2), 16));
                i = i2;
            }
            return sb.toString();
        }

        public AdvertisementData create(byte[] bArr) {
            if (bArr == null) {
                return null;
            }
            this.mData = (byte[]) bArr.clone();
            BleData findWhisperJoinData = findWhisperJoinData(findTypes(22));
            if (findWhisperJoinData == null) {
                return null;
            }
            this.mDeviceIdentity = Base64.encodeToString(findWhisperJoinData.read(9), 2);
            this.mClientNonce = Base64.encodeToString(findWhisperJoinData.read(3), 2);
            this.mProductIndex = asciiStringFromHex(getHexString(findWhisperJoinData.read(4)));
            this.mSoftwareVersion = getHexString(findWhisperJoinData.read(2));
            byte b = findWhisperJoinData.read(1)[0];
            this.mSupportsUnauthenticatedEcdhe = (b & 1) > 0;
            this.mSupportedAuthenticatedEcdhe = (b & 2) > 0;
            this.mSupportsPin = (4 & b) > 0;
            this.mDistressCode = (byte) 0;
            this.mPurposeCode = (byte) 0;
            byte b2 = this.mAdvertisementVersion;
            if (b2 == 1) {
                this.mDistressCode = findWhisperJoinData.read(1)[0];
            } else if (b2 == 2) {
                this.mPurposeCode = findWhisperJoinData.read(1)[0];
            }
            this.mAdvertisedSdkVersionIndex = 0;
            if ((this.mAdvertisementVersion == 0 && findWhisperJoinData.getLength() >= 22) || ((this.mAdvertisementVersion == 1 && findWhisperJoinData.getLength() >= 23) || (this.mAdvertisementVersion == 2 && findWhisperJoinData.getLength() >= 23))) {
                this.mAdvertisedSdkVersionIndex = parseAdvertisedSdkVersionIndex(findWhisperJoinData.read(2));
            }
            BleData findType = findType(9);
            if (findType != null) {
                this.mDeviceName = getUTF8String(findType, findType.getLength());
                this.mDeviceNameType = 9;
                return new AdvertisementData(this);
            }
            BleData findType2 = findType(8);
            if (findType2 != null) {
                this.mDeviceName = getUTF8String(findType2, findType2.getLength());
                this.mDeviceNameType = 8;
                return new AdvertisementData(this);
            }
            this.mDeviceName = "";
            this.mDeviceNameType = -1;
            return new AdvertisementData(this);
        }

        public int parseAdvertisedSdkVersionIndex(byte[] bArr) {
            if (bArr.length != 2) {
                return 0;
            }
            return ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        }
    }

    private AdvertisementData(Factory factory) {
        this.mAdvertisementVersion = factory.mAdvertisementVersion;
        this.mData = factory.mData;
        this.mDeviceIdentity = factory.mDeviceIdentity;
        this.mClientNonce = factory.mClientNonce;
        this.mProductIndex = factory.mProductIndex;
        this.mSoftwareVersion = factory.mSoftwareVersion;
        this.mDeviceName = factory.mDeviceName;
        this.mDeviceNameType = factory.mDeviceNameType;
        this.mSupportsUnauthenticatedEcdhe = factory.mSupportsUnauthenticatedEcdhe;
        this.mSupportedAuthenticatedEcdhe = factory.mSupportedAuthenticatedEcdhe;
        this.mSupportsPin = factory.mSupportsPin;
        this.mDistressCode = factory.mDistressCode;
        this.mPurposeCode = factory.mPurposeCode;
        this.mAdvertisedSdkVersionIndex = factory.mAdvertisedSdkVersionIndex;
    }

    public int getAdvertisedSdkVersionIndex() {
        return this.mAdvertisedSdkVersionIndex;
    }

    public byte[] getAdvertisementData() {
        return (byte[]) this.mData.clone();
    }

    public byte getAdvertisementVersion() {
        return this.mAdvertisementVersion;
    }

    public String getClientNonce() {
        return this.mClientNonce;
    }

    public String getDeviceIdentity() {
        return this.mDeviceIdentity;
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public byte getDistressCode() {
        return this.mDistressCode;
    }

    public int getNameType() {
        return this.mDeviceNameType;
    }

    public String getProductIndex() {
        return this.mProductIndex;
    }

    public byte getPurposeCode() {
        return this.mPurposeCode;
    }

    public String getSoftwareVersion() {
        return this.mSoftwareVersion;
    }

    public boolean getSupportsAuthenticatedEcdhe() {
        return this.mSupportedAuthenticatedEcdhe;
    }

    public boolean getSupportsPin() {
        return this.mSupportsPin;
    }

    public boolean getSupportsUnauthenticatedEcdhe() {
        return this.mSupportsUnauthenticatedEcdhe;
    }
}
