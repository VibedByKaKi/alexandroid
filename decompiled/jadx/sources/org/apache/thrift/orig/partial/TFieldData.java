package org.apache.thrift.orig.partial;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TFieldData {
    public static int encode(byte b, short s) {
        return (b & 255) | (s << 8);
    }

    public static short getId(int i) {
        return (short) ((i & 16776960) >> 8);
    }

    public static byte getType(int i) {
        return (byte) (i & 255);
    }

    public static int encode(byte b) {
        return b & 255;
    }
}
