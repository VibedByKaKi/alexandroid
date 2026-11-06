package com.amazon.apl.android.font;

import com.amazon.apl.android.font.FontKey;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_FontKey extends FontKey {
    private final String family;
    private final boolean italic;
    private final String language;
    private final int weight;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends FontKey.Builder {
        private String family;
        private Boolean italic;
        private String language;
        private Integer weight;

        @Override // com.amazon.apl.android.font.FontKey.Builder
        public FontKey build() {
            String str = this.family == null ? " family" : "";
            if (this.weight == null) {
                str = str.concat(" weight");
            }
            if (this.italic == null) {
                str = str.concat(" italic");
            }
            if (this.language == null) {
                str = str.concat(" language");
            }
            if (str.isEmpty()) {
                return new AutoValue_FontKey(this.family, this.weight.intValue(), this.italic.booleanValue(), this.language);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.font.FontKey.Builder
        public FontKey.Builder family(String str) {
            if (str != null) {
                this.family = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null family");
            return null;
        }

        @Override // com.amazon.apl.android.font.FontKey.Builder
        public FontKey.Builder italic(boolean z) {
            this.italic = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.font.FontKey.Builder
        public FontKey.Builder language(String str) {
            if (str != null) {
                this.language = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null language");
            return null;
        }

        @Override // com.amazon.apl.android.font.FontKey.Builder
        public FontKey.Builder weight(int i) {
            this.weight = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_FontKey(String str, int i, boolean z, String str2) {
        this.family = str;
        this.weight = i;
        this.italic = z;
        this.language = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FontKey) {
            FontKey fontKey = (FontKey) obj;
            if (this.family.equals(fontKey.getFamily()) && this.weight == fontKey.getWeight() && this.italic == fontKey.isItalic() && this.language.equals(fontKey.getLanguage())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.font.FontKey
    public String getFamily() {
        return this.family;
    }

    @Override // com.amazon.apl.android.font.FontKey
    public String getLanguage() {
        return this.language;
    }

    @Override // com.amazon.apl.android.font.FontKey
    public int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.language.hashCode() ^ ((((((this.family.hashCode() ^ 1000003) * 1000003) ^ this.weight) * 1000003) ^ (this.italic ? 1231 : 1237)) * 1000003);
    }

    @Override // com.amazon.apl.android.font.FontKey
    public boolean isItalic() {
        return this.italic;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FontKey{family=");
        sb.append(this.family);
        sb.append(", weight=");
        sb.append(this.weight);
        sb.append(", italic=");
        sb.append(this.italic);
        sb.append(", language=");
        return a$$ExternalSyntheticOutline0.m(sb, this.language, StringSubstitutor.DEFAULT_VAR_END);
    }
}
