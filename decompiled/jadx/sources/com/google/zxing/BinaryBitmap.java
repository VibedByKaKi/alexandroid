package com.google.zxing;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class BinaryBitmap {
    private final Binarizer binarizer;
    private BitMatrix matrix;

    public BinaryBitmap(Binarizer binarizer) {
        if (binarizer != null) {
            this.binarizer = binarizer;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Binarizer must be non-null.");
            throw null;
        }
    }

    public BinaryBitmap crop(int i, int i2, int i3, int i4) {
        return new BinaryBitmap(this.binarizer.createBinarizer(this.binarizer.getLuminanceSource().crop(i, i2, i3, i4)));
    }

    public BitMatrix getBlackMatrix() throws NotFoundException {
        if (this.matrix == null) {
            this.matrix = this.binarizer.getBlackMatrix();
        }
        return this.matrix;
    }

    public BitArray getBlackRow(int i, BitArray bitArray) throws NotFoundException {
        return this.binarizer.getBlackRow(i, bitArray);
    }

    public int getHeight() {
        return this.binarizer.getHeight();
    }

    public int getWidth() {
        return this.binarizer.getWidth();
    }

    public boolean isCropSupported() {
        return this.binarizer.getLuminanceSource().isCropSupported();
    }

    public boolean isRotateSupported() {
        return this.binarizer.getLuminanceSource().isRotateSupported();
    }

    public BinaryBitmap rotateCounterClockwise() {
        return new BinaryBitmap(this.binarizer.createBinarizer(this.binarizer.getLuminanceSource().rotateCounterClockwise()));
    }

    public BinaryBitmap rotateCounterClockwise45() {
        return new BinaryBitmap(this.binarizer.createBinarizer(this.binarizer.getLuminanceSource().rotateCounterClockwise45()));
    }

    public String toString() {
        try {
            return getBlackMatrix().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
