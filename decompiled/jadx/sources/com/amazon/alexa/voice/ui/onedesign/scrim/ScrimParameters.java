package com.amazon.alexa.voice.ui.onedesign.scrim;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ScrimParameters implements ScrimParametersModel {
    public static final Parcelable.Creator<ScrimParameters> CREATOR = new Parcelable.Creator<ScrimParameters>() { // from class: com.amazon.alexa.voice.ui.onedesign.scrim.ScrimParameters.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScrimParameters createFromParcel(Parcel parcel) {
            return new ScrimParameters(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ScrimParameters[] newArray(int i) {
            return new ScrimParameters[i];
        }
    };
    private final boolean hideCancelButton;
    private final String hint;
    private final boolean showHint;
    private final boolean showTTAIngress;
    private final boolean transparentBackground;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        boolean hideCancelButton;
        String hint;
        boolean showHint;
        boolean showTTAIngress;
        boolean transparentBackground;

        public ScrimParameters build() {
            return new ScrimParameters(this);
        }

        public Builder hideCancelButton(boolean z) {
            this.hideCancelButton = z;
            return this;
        }

        public Builder hint(String str) {
            this.hint = str;
            return this;
        }

        public Builder showHint(boolean z) {
            this.showHint = z;
            return this;
        }

        public Builder showTTAIngress(boolean z) {
            this.showTTAIngress = z;
            return this;
        }

        public Builder transparentBackground(boolean z) {
            this.transparentBackground = z;
            return this;
        }
    }

    public ScrimParameters(Parcel parcel) {
        this.hint = parcel.readString();
        this.showHint = parcel.readByte() != 0;
        this.transparentBackground = parcel.readByte() != 0;
        this.hideCancelButton = parcel.readByte() != 0;
        this.showTTAIngress = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrimParameters.class != obj.getClass()) {
            return false;
        }
        ScrimParameters scrimParameters = (ScrimParameters) obj;
        String str = this.hint;
        String str2 = scrimParameters.hint;
        if (str == null ? str2 == null : str.equals(str2)) {
            return this.showHint == scrimParameters.showHint && this.transparentBackground == scrimParameters.transparentBackground && this.hideCancelButton == scrimParameters.hideCancelButton && this.showTTAIngress == scrimParameters.showTTAIngress;
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.scrim.ScrimParametersModel
    public boolean getHideCancelButton() {
        return this.hideCancelButton;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.scrim.ScrimParametersModel
    public String getHint() {
        return this.hint;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.scrim.ScrimParametersModel
    public boolean getShowHint() {
        return this.showHint;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.scrim.ScrimParametersModel
    public boolean getShowTTAIngress() {
        return this.showTTAIngress;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.scrim.ScrimParametersModel
    public boolean getTransparentBackground() {
        return this.transparentBackground;
    }

    public int hashCode() {
        String str = this.hint;
        return ((((((((JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31) + (this.showHint ? 1 : 0)) * 31) + (this.transparentBackground ? 1 : 0)) * 31) + (this.hideCancelButton ? 1 : 0)) * 31) + (this.showTTAIngress ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ScrimParameters{hint=");
        sb.append(this.hint);
        sb.append(", showHint=");
        sb.append(this.showHint);
        sb.append(", transparentBackground=");
        sb.append(this.transparentBackground);
        sb.append(", hideCancelButton=");
        sb.append(this.hideCancelButton);
        sb.append(", showTTAIngress=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.showTTAIngress, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hint);
        parcel.writeByte(this.showHint ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.transparentBackground ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hideCancelButton ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showTTAIngress ? (byte) 1 : (byte) 0);
    }

    public ScrimParameters(Builder builder) {
        this.hint = builder.hint;
        this.showHint = builder.showHint;
        this.transparentBackground = builder.transparentBackground;
        this.hideCancelButton = builder.hideCancelButton;
        this.showTTAIngress = builder.showTTAIngress;
    }
}
