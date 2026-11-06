package com.amazon.alexa.accessory.internal.bluetooth;

import com.amazon.alexa.accessory.internal.util.ByteUtils;
import com.amazon.coral.org.json.XML$$ExternalSyntheticBUOutline0;
import dagger.internal.codegen.base.Formatter;
import java.util.HashMap;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class BleAdvertisementData {
    private final GapProfileMap gapProfileMap;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class GapProfileMap extends HashMap<Byte, byte[]> {
        private void checkPacketType(Byte b) {
            if (GenericAccessProfile.GAP_ASSIGNED_NUMBERS.contains(b)) {
                return;
            }
            XML$$ExternalSyntheticBUOutline0.m(b, " is not a GAP packet type number");
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public byte[] get(Object obj) {
            checkPacketType((Byte) obj);
            return (byte[]) super.get(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public byte[] put(Byte b, byte[] bArr) {
            checkPacketType(b);
            return (byte[]) super.put((GapProfileMap) b, (Byte) bArr);
        }
    }

    public BleAdvertisementData(byte[] bArr) {
        this.gapProfileMap = BluetoothUtils.parseLeAdvertisementData(bArr);
    }

    public byte[] getDataForADType(byte b) {
        return this.gapProfileMap.get((Object) Byte.valueOf(b));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        for (Byte b : this.gapProfileMap.keySet()) {
            b.byteValue();
            byte[] bArr = this.gapProfileMap.get((Object) b);
            sb.append(Formatter.INDENT);
            sb.append(String.format(Locale.US, "%02X: ", b));
            sb.append(ByteUtils.bytesToHex(bArr));
            sb.append('\n');
        }
        sb.append("    }\n");
        return "BleAdvertisementData{gapProfileMap=" + sb.toString() + AbstractJsonLexerKt.END_OBJ;
    }
}
