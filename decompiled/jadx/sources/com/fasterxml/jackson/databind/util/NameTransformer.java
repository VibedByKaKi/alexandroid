package com.fasterxml.jackson.databind.util;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class NameTransformer {
    public static final NameTransformer NOP = new NopTransformer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Chained extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;
        protected final NameTransformer _t1;
        protected final NameTransformer _t2;

        public Chained(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
            this._t1 = nameTransformer;
            this._t2 = nameTransformer2;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            String reverse = this._t1.reverse(str);
            return reverse != null ? this._t2.reverse(reverse) : reverse;
        }

        public String toString() {
            return "[ChainedTransformer(" + this._t1 + ", " + this._t2 + ")]";
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return this._t1.transform(this._t2.transform(str));
        }
    }

    public static NameTransformer chainedTransformer(NameTransformer nameTransformer, NameTransformer nameTransformer2) {
        return new Chained(nameTransformer, nameTransformer2);
    }

    public static NameTransformer simpleTransformer(final String str, final String str2) {
        boolean z = false;
        boolean z2 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z = true;
        }
        return z2 ? z ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.1
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String reverse(String str3) {
                if (!str3.startsWith(str)) {
                    return null;
                }
                String substring = str3.substring(str.length());
                if (substring.endsWith(str2)) {
                    return substring.substring(0, substring.length() - str2.length());
                }
                return null;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("[PreAndSuffixTransformer('");
                sb.append(str);
                sb.append("','");
                return a$$ExternalSyntheticOutline0.m(sb, str2, "')]");
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                return str + str3 + str2;
            }
        } : new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.2
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String reverse(String str3) {
                if (str3.startsWith(str)) {
                    return str3.substring(str.length());
                }
                return null;
            }

            public String toString() {
                return a$$ExternalSyntheticOutline0.m(new StringBuilder("[PrefixTransformer('"), str, "')]");
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                return a$$ExternalSyntheticOutline0.m(new StringBuilder(), str, str3);
            }
        } : z ? new NameTransformer() { // from class: com.fasterxml.jackson.databind.util.NameTransformer.3
            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String reverse(String str3) {
                if (str3.endsWith(str2)) {
                    return str3.substring(0, str3.length() - str2.length());
                }
                return null;
            }

            public String toString() {
                return a$$ExternalSyntheticOutline0.m(new StringBuilder("[SuffixTransformer('"), str2, "')]");
            }

            @Override // com.fasterxml.jackson.databind.util.NameTransformer
            public String transform(String str3) {
                StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str3);
                m.append(str2);
                return m.toString();
            }
        } : NOP;
    }

    public abstract String reverse(String str);

    public abstract String transform(String str);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NopTransformer extends NameTransformer implements Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String reverse(String str) {
            return str;
        }

        @Override // com.fasterxml.jackson.databind.util.NameTransformer
        public String transform(String str) {
            return str;
        }
    }
}
