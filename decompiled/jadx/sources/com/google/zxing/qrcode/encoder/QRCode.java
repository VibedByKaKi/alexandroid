package com.google.zxing.qrcode.encoder;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class QRCode {
    public static final int NUM_MASK_PATTERNS = 8;
    private ErrorCorrectionLevel ecLevel;
    private int maskPattern = -1;
    private ByteMatrix matrix;
    private Mode mode;
    private Version version;

    public static boolean isValidMaskPattern(int i) {
        return i >= 0 && i < 8;
    }

    public ErrorCorrectionLevel getECLevel() {
        return this.ecLevel;
    }

    public int getMaskPattern() {
        return this.maskPattern;
    }

    public ByteMatrix getMatrix() {
        return this.matrix;
    }

    public Mode getMode() {
        return this.mode;
    }

    public Version getVersion() {
        return this.version;
    }

    public void setECLevel(ErrorCorrectionLevel errorCorrectionLevel) {
        this.ecLevel = errorCorrectionLevel;
    }

    public void setMaskPattern(int i) {
        this.maskPattern = i;
    }

    public void setMatrix(ByteMatrix byteMatrix) {
        this.matrix = byteMatrix;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public String toString() {
        StringBuilder m = ParcelCompat$$ExternalSyntheticOutline0.m(200, "<<\n mode: ");
        m.append(this.mode);
        m.append("\n ecLevel: ");
        m.append(this.ecLevel);
        m.append("\n version: ");
        m.append(this.version);
        m.append("\n maskPattern: ");
        m.append(this.maskPattern);
        if (this.matrix == null) {
            m.append("\n matrix: null\n");
        } else {
            m.append("\n matrix:\n");
            m.append(this.matrix);
        }
        m.append(">>\n");
        return m.toString();
    }
}
