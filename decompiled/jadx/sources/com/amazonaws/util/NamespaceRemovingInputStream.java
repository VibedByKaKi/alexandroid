package com.amazonaws.util;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class NamespaceRemovingInputStream extends SdkFilterInputStream {
    private static final int BUFFER_SIZE = 200;
    private boolean hasRemovedNamespace;
    private final byte[] lookAheadData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class StringPrefixSlicer {
        private String s;

        public StringPrefixSlicer(String str) {
            this.s = str;
        }

        public String getString() {
            return this.s;
        }

        public boolean removePrefix(String str) {
            if (!this.s.startsWith(str)) {
                return false;
            }
            this.s = this.s.substring(str.length());
            return true;
        }

        public boolean removePrefixEndingWith(String str) {
            int indexOf = this.s.indexOf(str);
            if (indexOf < 0) {
                return false;
            }
            this.s = ParcelCompat$$ExternalSyntheticOutline0.m(indexOf, str, this.s);
            return true;
        }

        public boolean removeRepeatingPrefix(String str) {
            if (!this.s.startsWith(str)) {
                return false;
            }
            while (this.s.startsWith(str)) {
                this.s = this.s.substring(str.length());
            }
            return true;
        }
    }

    public NamespaceRemovingInputStream(InputStream inputStream) {
        super(new BufferedInputStream(inputStream));
        this.lookAheadData = new byte[200];
        this.hasRemovedNamespace = false;
    }

    private int matchXmlNamespaceAttribute(String str) {
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        if (!stringPrefixSlicer.removePrefix("xmlns")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (!stringPrefixSlicer.removePrefix("=")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (stringPrefixSlicer.removePrefix(DeviceConfigConstants.DOUBLE_QUOTE) && stringPrefixSlicer.removePrefixEndingWith(DeviceConfigConstants.DOUBLE_QUOTE)) {
            return str.length() - stringPrefixSlicer.getString().length();
        }
        return -1;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int read = ((FilterInputStream) this).in.read();
        if (read != 120 || this.hasRemovedNamespace) {
            return read;
        }
        int i = 0;
        this.lookAheadData[0] = (byte) read;
        ((FilterInputStream) this).in.mark(this.lookAheadData.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.lookAheadData;
        int read2 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        int matchXmlNamespaceAttribute = matchXmlNamespaceAttribute(new String(this.lookAheadData, 0, read2 + 1, StringUtils.UTF8));
        if (matchXmlNamespaceAttribute <= 0) {
            return read;
        }
        while (true) {
            int i2 = matchXmlNamespaceAttribute - 1;
            InputStream inputStream2 = ((FilterInputStream) this).in;
            if (i >= i2) {
                int read3 = inputStream2.read();
                this.hasRemovedNamespace = true;
                return read3;
            }
            inputStream2.read();
            i++;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            int read = read();
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            bArr[i3 + i] = (byte) read;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
