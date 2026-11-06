package org.apache.commons.io.input;

import java.io.InputStream;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class CircularInputStream extends InputStream {
    private long byteCount;
    private int position = -1;
    private final byte[] repeatedContent;
    private final long targetByteCount;

    public CircularInputStream(byte[] bArr, long j) {
        this.repeatedContent = validate(bArr);
        if (bArr.length != 0) {
            this.targetByteCount = j;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("repeatContent is empty.");
            throw null;
        }
    }

    private static byte[] validate(byte[] bArr) {
        Objects.requireNonNull(bArr, "repeatContent");
        for (byte b : bArr) {
            if (b == -1) {
                Single$$ExternalSyntheticBUOutline0.m$3("repeatContent contains the end-of-stream marker -1");
                return null;
            }
        }
        return bArr;
    }

    @Override // java.io.InputStream
    public int read() {
        long j = this.targetByteCount;
        if (j >= 0) {
            long j2 = this.byteCount;
            if (j2 == j) {
                return -1;
            }
            this.byteCount = j2 + 1;
        }
        int i = this.position + 1;
        byte[] bArr = this.repeatedContent;
        int length = i % bArr.length;
        this.position = length;
        return bArr[length] & 255;
    }
}
