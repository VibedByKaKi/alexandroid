package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public abstract class OneDimensionalCodeWriter implements Writer {
    private static final Pattern NUMERIC = Pattern.compile("[0-9]+");

    public static int appendPattern(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    public static void checkNumeric(String str) {
        if (NUMERIC.matcher(str).matches()) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Input should only contain digits 0-9");
    }

    private static BitMatrix renderResult(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        BitMatrix bitMatrix = new BitMatrix(max, max2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bitMatrix.setRegion(i6, 0, i5, max2);
            }
            i7++;
            i6 += i5;
        }
        return bitMatrix;
    }

    @Override // com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Found empty contents");
            return null;
        }
        if (i < 0 || i2 < 0) {
            Duration$$ExternalSyntheticBUOutline0.m(i, i2, "Negative size is not allowed. Input: ");
            return null;
        }
        Collection<BarcodeFormat> supportedWriteFormats = getSupportedWriteFormats();
        if (supportedWriteFormats != null && !supportedWriteFormats.contains(barcodeFormat)) {
            Single$$ExternalSyntheticBUOutline0.m("Can only encode ", supportedWriteFormats, ", but got ", barcodeFormat);
            return null;
        }
        int defaultMargin = getDefaultMargin();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType)) {
                defaultMargin = Integer.parseInt(map.get(encodeHintType).toString());
            }
        }
        return renderResult(encode(str, map), i, i2, defaultMargin);
    }

    public abstract boolean[] encode(String str);

    public int getDefaultMargin() {
        return 10;
    }

    public Collection<BarcodeFormat> getSupportedWriteFormats() {
        return null;
    }

    public boolean[] encode(String str, Map<EncodeHintType, ?> map) {
        return encode(str);
    }

    @Override // com.google.zxing.Writer
    public final BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2) {
        return encode(str, barcodeFormat, i, i2, null);
    }
}
