package com.amazon.coral.util;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class TextSequence implements CharSequence {
    protected int hash;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ImmutableCharSequence extends TextSequence {
        private final CharSequence buffer;
        private final int len;
        private final int off;

        public ImmutableCharSequence(CharSequence charSequence, int i, int i2) {
            if (charSequence == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            if (charSequence instanceof ImmutableCharSequence) {
                ImmutableCharSequence immutableCharSequence = (ImmutableCharSequence) charSequence;
                this.buffer = immutableCharSequence.buffer;
                this.off = immutableCharSequence.off + i;
            } else {
                this.buffer = TextSequence.makeImmutable(charSequence);
                this.off = i;
            }
            this.len = i2 - i;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i) {
            if (i >= 0 && i < this.len) {
                return this.buffer.charAt(this.off + i);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(AppLaunchChecker$$ExternalSyntheticOutline0.m7635m(i, " is not within the range [0,"), this.len, MarkdownConstants.RIGHT_PARENTHESIS));
            return (char) 0;
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.len;
        }

        @Override // com.amazon.coral.util.TextSequence
        public CharSequence[] segments() {
            return null;
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i, int i2) {
            int i3 = this.len;
            if (i3 < i2) {
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            if (i > i2 || i < 0) {
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            if (i == 0 && i2 == i3) {
                return this;
            }
            CharSequence charSequence = this.buffer;
            int i4 = this.off;
            return charSequence.subSequence(i + i4, i4 + i2);
        }
    }

    public static int hash(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            i = (i * 31) + charSequence.charAt(i2);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CharSequence makeImmutable(CharSequence charSequence) {
        return ((charSequence instanceof String) || (charSequence instanceof TextSequence)) ? charSequence : charSequence.toString();
    }

    public static TextSequence newInstance(char[] cArr, int i, int i2) {
        if (cArr == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        if (cArr.length < i2) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        if (i <= i2 && i >= 0) {
            return new ImmutableCharacterArray(cArr, i, i2);
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextSequence)) {
            return false;
        }
        TextSequence textSequence = (TextSequence) obj;
        int length = length();
        if (textSequence.length() != length || textSequence.hashCode() != hashCode()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (textSequence.charAt(i) != charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.hash == 0) {
            this.hash = hash(this);
        }
        return this.hash;
    }

    public abstract CharSequence[] segments();

    @Override // java.lang.CharSequence
    public String toString() {
        StringBuilder sb = new StringBuilder(length());
        for (int i = 0; i < length(); i++) {
            sb.append(charAt(i));
        }
        return sb.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ImmutableCharacterArray extends TextSequence {
        private final char[] buffer;
        private final int len;
        private final int off;

        public ImmutableCharacterArray(char[] cArr, int i, int i2) {
            char[] copyOfRange = Arrays.copyOfRange(cArr, i, i2);
            this.buffer = copyOfRange;
            this.off = 0;
            this.len = copyOfRange.length;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i) {
            if (i >= 0 && i < this.len) {
                return this.buffer[this.off + i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(AppLaunchChecker$$ExternalSyntheticOutline0.m7635m(i, " is not within the range [0,"), this.len, MarkdownConstants.RIGHT_PARENTHESIS));
            return (char) 0;
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.len;
        }

        @Override // com.amazon.coral.util.TextSequence
        public CharSequence[] segments() {
            return null;
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i, int i2) {
            int i3 = this.len;
            if (i3 < i2) {
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            if (i <= i2 && i >= 0) {
                return (i == 0 && i2 == i3) ? this : new ImmutableCharacterArray(this, this.off + i, i2 - i);
            }
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        private ImmutableCharacterArray(ImmutableCharacterArray immutableCharacterArray, int i, int i2) {
            this.buffer = immutableCharacterArray.buffer;
            this.off = i;
            this.len = i2;
        }
    }

    public static TextSequence newInstance(CharSequence charSequence, int i, int i2) {
        return new ImmutableCharSequence(charSequence, i, i2);
    }

    public static TextSequence newInstance(CharSequence... charSequenceArr) {
        return new CompositeTextSequence(charSequenceArr);
    }

    public static TextSequence newInstance(char[] cArr) {
        if (cArr != null) {
            return newInstance(cArr, 0, cArr.length);
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static TextSequence newInstance(CharSequence charSequence) {
        if (charSequence != null) {
            if (charSequence instanceof TextSequence) {
                return (TextSequence) charSequence;
            }
            return newInstance(charSequence, 0, charSequence.length());
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CompositeTextSequence extends TextSequence {
        private final int len;
        private final int off;
        private final CharSequence[] segment;

        public CompositeTextSequence(CharSequence... charSequenceArr) {
            if (charSequenceArr == null) {
                Path$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            int length = charSequenceArr.length;
            for (CharSequence charSequence : charSequenceArr) {
                if (charSequence == null) {
                    Path$$ExternalSyntheticBUOutline0.m();
                    throw null;
                }
                if (charSequence instanceof CompositeTextSequence) {
                    length = (((CompositeTextSequence) charSequence).segment.length - 1) + length;
                }
            }
            this.segment = new CharSequence[length];
            int i = 0;
            int i2 = 0;
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence2 instanceof CompositeTextSequence) {
                    CompositeTextSequence compositeTextSequence = (CompositeTextSequence) charSequence2;
                    int i3 = 0;
                    while (true) {
                        CharSequence[] charSequenceArr2 = compositeTextSequence.segment;
                        if (i3 < charSequenceArr2.length) {
                            this.segment[i2] = charSequenceArr2[i3];
                            i += charSequenceArr2[i3].length();
                            i3++;
                            i2++;
                        }
                    }
                } else {
                    this.segment[i2] = TextSequence.makeImmutable(charSequence2);
                    i = charSequence2.length() + i;
                    i2++;
                }
            }
            this.off = 0;
            this.len = i;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i) {
            int length;
            if (i < 0 || i >= this.len) {
                Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(AppLaunchChecker$$ExternalSyntheticOutline0.m7635m(i, " is not within the range [0,"), this.len, MarkdownConstants.RIGHT_PARENTHESIS));
                return (char) 0;
            }
            int i2 = i + this.off;
            int i3 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.segment;
                if (i3 >= charSequenceArr.length || i2 < (length = charSequenceArr[i3].length())) {
                    break;
                }
                i2 -= length;
                i3++;
            }
            return this.segment[i3].charAt(i2);
        }

        public int computeHash() {
            int i = this.off;
            int i2 = this.len + i;
            int i3 = 0;
            int i4 = 0;
            while (i3 < this.segment.length && i2 > 0) {
                while (i < this.segment[i3].length() && i < i2) {
                    i4 = (i4 * 31) + this.segment[i3].charAt(i);
                    i++;
                }
                i2 -= i;
                i3++;
                i = 0;
            }
            return i4;
        }

        @Override // com.amazon.coral.util.TextSequence
        public int hashCode() {
            if (this.hash == 0) {
                this.hash = computeHash();
            }
            return this.hash;
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.len;
        }

        @Override // com.amazon.coral.util.TextSequence
        public CharSequence[] segments() {
            return this.segment;
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i, int i2) {
            int i3 = this.len;
            if (i3 < i2) {
                Path$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            if (i <= i2 && i >= 0) {
                return (i == 0 && i2 == i3) ? this : new CompositeTextSequence(this, this.off + i, i2 - i);
            }
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        private CompositeTextSequence(CompositeTextSequence compositeTextSequence, int i, int i2) {
            this.segment = compositeTextSequence.segment;
            this.off = i;
            this.len = i2;
        }
    }
}
