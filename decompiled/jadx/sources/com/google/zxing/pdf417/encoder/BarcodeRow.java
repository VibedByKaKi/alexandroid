package com.google.zxing.pdf417.encoder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class BarcodeRow {
    private int currentLocation = 0;
    private final byte[] row;

    public BarcodeRow(int i) {
        this.row = new byte[i];
    }

    private void set(int i, boolean z) {
        this.row[i] = z ? (byte) 1 : (byte) 0;
    }

    public void addBar(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.currentLocation;
            this.currentLocation = i3 + 1;
            set(i3, z);
        }
    }

    public byte[] getScaledRow(int i) {
        int length = this.row.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.row[i2 / i];
        }
        return bArr;
    }

    public void set(int i, byte b) {
        this.row[i] = b;
    }
}
