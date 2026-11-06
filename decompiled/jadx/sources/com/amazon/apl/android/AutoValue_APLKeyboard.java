package com.amazon.apl.android;

import androidx.annotation.NonNull;
import com.amazon.apl.android.APLKeyboard;
import com.amazon.apl.enums.KeyHandlerType;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_APLKeyboard extends APLKeyboard {
    private final boolean alt;
    private final String code;
    private final boolean ctrl;
    private final String key;
    private final boolean meta;
    private final boolean repeat;
    private final boolean shift;
    private final KeyHandlerType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends APLKeyboard.Builder {
        private Boolean alt;
        private String code;
        private Boolean ctrl;
        private String key;
        private Boolean meta;
        private Boolean repeat;
        private Boolean shift;
        private KeyHandlerType type;

        @Override // com.amazon.apl.android.APLKeyboard.Builder
        public APLKeyboard.Builder alt(boolean z) {
            this.alt = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.APLKeyboard.Builder
        public APLKeyboard build() {
            String str = this.type == null ? " type" : "";
            if (this.key == null) {
                str = str.concat(" key");
            }
            if (this.code == null) {
                str = str.concat(" code");
            }
            if (this.repeat == null) {
                str = str.concat(" repeat");
            }
            if (this.shift == null) {
                str = str.concat(" shift");
            }
            if (this.alt == null) {
                str = str.concat(" alt");
            }
            if (this.ctrl == null) {
                str = str.concat(" ctrl");
            }
            if (this.meta == null) {
                str = str.concat(" meta");
            }
            if (str.isEmpty()) {
                return new AutoValue_APLKeyboard(this.type, this.key, this.code, this.repeat.booleanValue(), this.shift.booleanValue(), this.alt.booleanValue(), this.ctrl.booleanValue(), this.meta.booleanValue());
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.APLKeyboard.Builder
        public APLKeyboard.Builder code(String str) {
            if (str != null) {
                this.code = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null code");
            return null;
        }

        @Override // com.amazon.apl.android.APLKeyboard.Builder
        public APLKeyboard.Builder ctrl(boolean z) {
            this.ctrl = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.APLKeyboard.Builder
        public APLKeyboard.Builder key(String str) {
            if (str != null) {
                this.key = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null key");
            return null;
        }

        @Override // com.amazon.apl.android.APLKeyboard.Builder
        public APLKeyboard.Builder meta(boolean z) {
            this.meta = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.APLKeyboard.Builder
        public APLKeyboard.Builder repeat(boolean z) {
            this.repeat = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.APLKeyboard.Builder
        public APLKeyboard.Builder shift(boolean z) {
            this.shift = Boolean.valueOf(z);
            return this;
        }

        @Override // com.amazon.apl.android.APLKeyboard.Builder
        public APLKeyboard.Builder type(KeyHandlerType keyHandlerType) {
            if (keyHandlerType != null) {
                this.type = keyHandlerType;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null type");
            return null;
        }
    }

    private AutoValue_APLKeyboard(KeyHandlerType keyHandlerType, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.type = keyHandlerType;
        this.key = str;
        this.code = str2;
        this.repeat = z;
        this.shift = z2;
        this.alt = z3;
        this.ctrl = z4;
        this.meta = z5;
    }

    @Override // com.amazon.apl.android.APLKeyboard
    public boolean alt() {
        return this.alt;
    }

    @Override // com.amazon.apl.android.APLKeyboard
    @NonNull
    public String code() {
        return this.code;
    }

    @Override // com.amazon.apl.android.APLKeyboard
    public boolean ctrl() {
        return this.ctrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof APLKeyboard) {
            APLKeyboard aPLKeyboard = (APLKeyboard) obj;
            if (this.type.equals(aPLKeyboard.type()) && this.key.equals(aPLKeyboard.key()) && this.code.equals(aPLKeyboard.code()) && this.repeat == aPLKeyboard.repeat() && this.shift == aPLKeyboard.shift() && this.alt == aPLKeyboard.alt() && this.ctrl == aPLKeyboard.ctrl() && this.meta == aPLKeyboard.meta()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((this.type.hashCode() ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003) ^ this.code.hashCode()) * 1000003) ^ (this.repeat ? 1231 : 1237)) * 1000003) ^ (this.shift ? 1231 : 1237)) * 1000003) ^ (this.alt ? 1231 : 1237)) * 1000003) ^ (this.ctrl ? 1231 : 1237)) * 1000003) ^ (this.meta ? 1231 : 1237);
    }

    @Override // com.amazon.apl.android.APLKeyboard
    @NonNull
    public String key() {
        return this.key;
    }

    @Override // com.amazon.apl.android.APLKeyboard
    public boolean meta() {
        return this.meta;
    }

    @Override // com.amazon.apl.android.APLKeyboard
    public boolean repeat() {
        return this.repeat;
    }

    @Override // com.amazon.apl.android.APLKeyboard
    public boolean shift() {
        return this.shift;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("APLKeyboard{type=");
        sb.append(this.type);
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", code=");
        sb.append(this.code);
        sb.append(", repeat=");
        sb.append(this.repeat);
        sb.append(", shift=");
        sb.append(this.shift);
        sb.append(", alt=");
        sb.append(this.alt);
        sb.append(", ctrl=");
        sb.append(this.ctrl);
        sb.append(", meta=");
        return a$$ExternalSyntheticOutline0.m(sb, this.meta, StringSubstitutor.DEFAULT_VAR_END);
    }

    @Override // com.amazon.apl.android.APLKeyboard
    @NonNull
    public KeyHandlerType type() {
        return this.type;
    }
}
