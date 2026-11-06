package com.google.zxing.common;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class ECIEncoderSet {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final List<CharsetEncoder> ENCODERS = new ArrayList();
    private final CharsetEncoder[] encoders;
    private final int priorityEncoderIndex;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i = 0; i < 20; i++) {
            String str = strArr[i];
            if (CharacterSetECI.getCharacterSetECIByName(str) != null) {
                try {
                    ENCODERS.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public ECIEncoderSet(String str, Charset charset, int i) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i2 = 0;
        boolean z2 = charset != null && charset.name().startsWith("UTF");
        for (int i3 = 0; i3 < str.length(); i3++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                CharsetEncoder charsetEncoder = (CharsetEncoder) it2.next();
                char charAt = str.charAt(i3);
                if (charAt == i || charsetEncoder.canEncode(charAt)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                Iterator<CharsetEncoder> it3 = ENCODERS.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    CharsetEncoder next = it3.next();
                    if (next.canEncode(str.charAt(i3))) {
                        arrayList.add(next);
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                z2 = true;
            }
        }
        if (arrayList.size() != 1 || z2) {
            this.encoders = new CharsetEncoder[arrayList.size() + 2];
            Iterator it4 = arrayList.iterator();
            int i4 = 0;
            while (it4.hasNext()) {
                this.encoders[i4] = (CharsetEncoder) it4.next();
                i4++;
            }
            this.encoders[i4] = StandardCharsets.UTF_8.newEncoder();
            this.encoders[i4 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.encoders = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.encoders;
                if (i2 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i2] != null && charset.name().equals(this.encoders[i2].charset().name())) {
                    break;
                } else {
                    i2++;
                }
            }
            this.priorityEncoderIndex = i2;
        }
        i2 = -1;
        this.priorityEncoderIndex = i2;
    }

    public boolean canEncode(char c, int i) {
        return this.encoders[i].canEncode("" + c);
    }

    public byte[] encode(char c, int i) {
        return BitVector$$ExternalSyntheticOutline0.m("", c).getBytes(this.encoders[i].charset());
    }

    public Charset getCharset(int i) {
        return this.encoders[i].charset();
    }

    public String getCharsetName(int i) {
        return this.encoders[i].charset().name();
    }

    public int getECIValue(int i) {
        return CharacterSetECI.getCharacterSetECI(this.encoders[i].charset()).getValue();
    }

    public int getPriorityEncoderIndex() {
        return this.priorityEncoderIndex;
    }

    public int length() {
        return this.encoders.length;
    }

    public byte[] encode(String str, int i) {
        return str.getBytes(this.encoders[i].charset());
    }
}
