package org.bouncycastle.crypto.prng;

import com.amazon.alexa.accessory.internal.bluetooth.GenericAccessProfile;
import com.amazon.alexa.presence.bleconn.service.protocols.relationships.RequesterRelationshipsPacketV1;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import okio.Utf8;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;

/* loaded from: classes11.dex */
public class VMPCRandomGenerator implements RandomGenerator {
    private byte n = 0;
    private byte[] P = {ByteSourceJsonBootstrapper.UTF8_BOM_2, JsonWriter.COMMA, 98, Byte.MAX_VALUE, -75, -86, -44, 13, -127, -2, -78, -126, -53, -96, -95, 8, 24, 113, 86, -24, 73, 2, 16, -60, -34, 53, -91, -20, Byte.MIN_VALUE, 18, -72, 105, -38, 47, 117, -52, -94, 9, 54, 3, 97, 45, -3, -32, -35, 5, 67, -112, -83, -56, -31, -81, 87, -101, 76, -40, 81, -82, 80, -123, 60, 10, -28, -13, -100, GenericAccessProfile.TRANSPORT_DISCOVERY_DATA, GenericAccessProfile.LE_SECURE_CONNECTIONS_RANDOM_VALUE, 83, -55, -125, -105, 70, -79, -103, 100, 49, 119, -43, 29, -42, 120, -67, 94, -80, -118, 34, 56, -8, 104, GenericAccessProfile.MESH_BEACON, GenericAccessProfile.MESH_MESSAGE, -59, -45, -9, PSSSigner.TRAILER_IMPLICIT, 111, -33, 4, -27, -107, 62, GenericAccessProfile.INDOOR_POSITIONING, -122, -90, 11, -113, -15, GenericAccessProfile.URI, 14, -41, 64, -77, -49, 126, 6, 21, -102, 77, 28, -93, -37, 50, -110, 88, 17, GenericAccessProfile.LE_SUPPORTED_FEATURES, -12, 89, -48, 78, 106, 23, JsonWriter.ARRAY_START, -84, -1, 7, -64, 101, 121, -4, -57, -51, 118, 66, JsonWriter.ARRAY_END, -25, JsonWriter.SEMI, 52, 122, 48, GenericAccessProfile.CHANNEL_MAP_UPDATE_INDICATION, 15, 115, 1, -7, -47, -46, 25, -23, -111, -71, 90, -19, 65, 109, -76, -61, -98, ByteSourceJsonBootstrapper.UTF8_BOM_3, 99, -6, 31, 51, 96, 71, -119, RequesterRelationshipsPacketV1.HEADER_MASK_VERSION, -106, 26, 95, -109, 61, 55, 75, -39, -88, -63, 27, -10, 57, -117, -73, 12, 32, -50, -120, 110, -74, 116, -114, -115, 22, GenericAccessProfile.PB_ADV, -14, -121, -11, -21, 112, -29, -5, 85, -97, -58, 68, 74, 69, JsonWriter.OBJECT_END, -30, 107, JsonWriter.ESCAPE, 108, 102, -87, -116, -18, -124, 19, -89, 30, -99, -36, 103, 72, -70, 46, -26, -92, -85, 124, -108, 0, GenericAccessProfile.SERVICE_DATA_128BIT, ByteSourceJsonBootstrapper.UTF8_BOM_1, -22, -66, -54, 114, 79, 82, -104, Utf8.REPLACEMENT_BYTE, -62, 20, JsonWriter.OBJECT_START, 59, 84};
    private byte s = -66;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b : bArr) {
            byte[] bArr2 = this.P;
            byte b2 = this.s;
            byte b3 = this.n;
            byte b4 = bArr2[(b2 + bArr2[b3 & 255] + b) & 255];
            this.s = b4;
            byte b5 = bArr2[b3 & 255];
            bArr2[b3 & 255] = bArr2[b4 & 255];
            bArr2[b4 & 255] = b5;
            this.n = (byte) ((b3 + 1) & 255);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i, int i2) {
        synchronized (this.P) {
            int i3 = i2 + i;
            while (i != i3) {
                try {
                    byte[] bArr2 = this.P;
                    byte b = this.s;
                    byte b2 = this.n;
                    byte b3 = bArr2[(b + bArr2[b2 & 255]) & 255];
                    this.s = b3;
                    bArr[i] = bArr2[(bArr2[bArr2[b3 & 255] & 255] + 1) & 255];
                    byte b4 = bArr2[b2 & 255];
                    bArr2[b2 & 255] = bArr2[b3 & 255];
                    bArr2[b3 & 255] = b4;
                    this.n = (byte) ((b2 + 1) & 255);
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j) {
        addSeedMaterial(Pack.longToBigEndian(j));
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }
}
