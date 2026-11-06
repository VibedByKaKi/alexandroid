package com.amazon.alexa.accessory.frames.accessproof;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Locale;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class KeyRecordStore {
    private static final char FIELD_SEPARATOR = '|';
    private static final String KEY_PREFIX = "accessproof.keyrecord.";
    private static final String RECORD_VERSION = "1";
    private final KeyValueStore store;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class KeyRecord {
        private final byte[] attestationApplicationId;
        private final byte[] publicKey;

        public KeyRecord(byte[] bArr, byte[] bArr2) {
            this.publicKey = (byte[]) bArr.clone();
            this.attestationApplicationId = (byte[]) bArr2.clone();
        }

        public byte[] attestationApplicationId() {
            return (byte[]) this.attestationApplicationId.clone();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeyRecord)) {
                return false;
            }
            KeyRecord keyRecord = (KeyRecord) obj;
            return Arrays.equals(this.publicKey, keyRecord.publicKey) && Arrays.equals(this.attestationApplicationId, keyRecord.attestationApplicationId);
        }

        public int hashCode() {
            return Arrays.hashCode(this.attestationApplicationId) + (Arrays.hashCode(this.publicKey) * 31);
        }

        public byte[] publicKey() {
            return (byte[]) this.publicKey.clone();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("KeyRecord{publicKey=");
            sb.append(this.publicKey.length);
            sb.append("B, appId=");
            return a$$ExternalSyntheticOutline0.m(sb, this.attestationApplicationId.length, "B}");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Resolution {
        FOUND,
        NEEDS_ATTESTATION
    }

    public KeyRecordStore(KeyValueStore keyValueStore) {
        if (keyValueStore != null) {
            this.store = keyValueStore;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("a KeyRecordStore needs a backing store");
            throw null;
        }
    }

    private static KeyRecord deserialize(String str) {
        String[] split = str.split("\\|", -1);
        if (split.length != 3 || !"1".equals(split[0])) {
            return null;
        }
        byte[] fromHex = fromHex(split[1]);
        byte[] fromHex2 = fromHex(split[2]);
        if (fromHex == null || fromHex2 == null || fromHex.length == 0 || fromHex2.length == 0) {
            return null;
        }
        return new KeyRecord(fromHex, fromHex2);
    }

    private static byte[] fromHex(String str) {
        if (str == null || str.isEmpty() || (str.length() & 1) != 0) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(str.charAt(i2), 16);
            int digit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (digit < 0 || digit2 < 0) {
                return null;
            }
            bArr[i] = (byte) (digit2 | (digit << 4));
        }
        return bArr;
    }

    private static String serialize(KeyRecord keyRecord) {
        return "1|" + toHex(keyRecord.publicKey()) + FIELD_SEPARATOR + toHex(keyRecord.attestationApplicationId());
    }

    private static String storageKey(String str) {
        return KEY_PREFIX + str.trim().toLowerCase(Locale.ROOT);
    }

    private static String toHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(Character.forDigit((b >> 4) & 15, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    public synchronized boolean establish(String str, byte[] bArr, byte[] bArr2) {
        boolean z = false;
        if (str != null) {
            if (!str.trim().isEmpty()) {
                if (bArr != null && bArr.length != 0) {
                    if (bArr2 != null && bArr2.length != 0) {
                        if (resolve(str).isFound()) {
                            return false;
                        }
                        KeyRecord keyRecord = new KeyRecord(bArr, bArr2);
                        try {
                            this.store.write(storageKey(str), serialize(keyRecord));
                            Resolved resolve = resolve(str);
                            if (resolve.isFound()) {
                                if (keyRecord.equals(resolve.record())) {
                                    z = true;
                                }
                            }
                            return z;
                        } catch (RuntimeException unused) {
                            return false;
                        }
                    }
                    return false;
                }
                return false;
            }
        }
        return false;
    }

    public synchronized void forget(String str) {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                try {
                    this.store.remove(storageKey(str));
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public synchronized Resolved resolve(String str) {
        int i = 0;
        KeyRecord keyRecord = null;
        if (str != null) {
            if (!str.trim().isEmpty()) {
                try {
                    String read = this.store.read(storageKey(str));
                    if (read == null) {
                        return new Resolved(Resolution.NEEDS_ATTESTATION, keyRecord, i);
                    }
                    KeyRecord deserialize = deserialize(read);
                    if (deserialize == null) {
                        return new Resolved(Resolution.NEEDS_ATTESTATION, keyRecord, i);
                    }
                    return new Resolved(Resolution.FOUND, deserialize, i);
                } catch (RuntimeException unused) {
                    return new Resolved(Resolution.NEEDS_ATTESTATION, keyRecord, i);
                }
            }
        }
        return new Resolved(Resolution.NEEDS_ATTESTATION, keyRecord, i);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Resolved {
        private final KeyRecord record;
        private final Resolution resolution;

        private Resolved(Resolution resolution, KeyRecord keyRecord) {
            this.resolution = resolution;
            this.record = keyRecord;
        }

        public boolean isFound() {
            return this.resolution == Resolution.FOUND;
        }

        public KeyRecord record() {
            return this.record;
        }

        public Resolution resolution() {
            return this.resolution;
        }

        public /* synthetic */ Resolved(Resolution resolution, KeyRecord keyRecord, int i) {
            this(resolution, keyRecord);
        }
    }
}
