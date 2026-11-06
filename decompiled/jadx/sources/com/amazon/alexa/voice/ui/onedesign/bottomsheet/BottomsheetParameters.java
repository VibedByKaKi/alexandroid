package com.amazon.alexa.voice.ui.onedesign.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class BottomsheetParameters implements BottomsheetParametersModel {
    public static final Parcelable.Creator<BottomsheetParameters> CREATOR = new Parcelable.Creator<BottomsheetParameters>() { // from class: com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomsheetParameters.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BottomsheetParameters createFromParcel(Parcel parcel) {
            return new BottomsheetParameters(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BottomsheetParameters[] newArray(int i) {
            return new BottomsheetParameters[i];
        }
    };
    private final boolean hideOverflowMenu;
    private final String hint;
    private final boolean remarkableAlexaEnabled;
    private final boolean showHint;
    private final boolean showRemarkableAlexa;
    private final boolean typeSupported;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        boolean hideOverflowMenu;
        String hint;
        boolean remarkableAlexaEnabled;
        boolean showHint;
        boolean showRemarkableAlexa;
        boolean typeSupported;

        public BottomsheetParameters build() {
            return new BottomsheetParameters(this);
        }

        public Builder hideOverflowMenu(boolean z) {
            this.hideOverflowMenu = z;
            return this;
        }

        public Builder hint(String str) {
            this.hint = str;
            return this;
        }

        public Builder remarkableAlexaEnabled(boolean z) {
            this.remarkableAlexaEnabled = z;
            return this;
        }

        public Builder showHint(boolean z) {
            this.showHint = z;
            return this;
        }

        public Builder showRemarkableAlexa(boolean z) {
            this.showRemarkableAlexa = z;
            return this;
        }

        public Builder typeSupported(boolean z) {
            this.typeSupported = z;
            return this;
        }
    }

    public BottomsheetParameters(Parcel parcel) {
        this.remarkableAlexaEnabled = parcel.readByte() != 0;
        this.showRemarkableAlexa = parcel.readByte() != 0;
        this.hint = parcel.readString();
        this.showHint = parcel.readByte() != 0;
        this.hideOverflowMenu = parcel.readByte() != 0;
        this.typeSupported = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BottomsheetParameters.class != obj.getClass()) {
            return false;
        }
        BottomsheetParameters bottomsheetParameters = (BottomsheetParameters) obj;
        if (this.remarkableAlexaEnabled != bottomsheetParameters.remarkableAlexaEnabled || this.showRemarkableAlexa != bottomsheetParameters.showRemarkableAlexa) {
            return false;
        }
        String str = this.hint;
        String str2 = bottomsheetParameters.hint;
        if (str == null ? str2 == null : str.equals(str2)) {
            return this.showHint == bottomsheetParameters.showHint && this.hideOverflowMenu == bottomsheetParameters.hideOverflowMenu && this.typeSupported == bottomsheetParameters.typeSupported;
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomsheetParametersModel
    public boolean getHideOverflowMenu() {
        return this.hideOverflowMenu;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomsheetParametersModel
    public String getHint() {
        return this.hint;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomsheetParametersModel
    public boolean getShowHint() {
        return this.showHint;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomsheetParametersModel
    public boolean getShowRemarkableAlexa() {
        return this.showRemarkableAlexa;
    }

    public int hashCode() {
        int i = (((JfifUtil.MARKER_EOI + (this.remarkableAlexaEnabled ? 1 : 0)) * 31) + (this.showRemarkableAlexa ? 1 : 0)) * 31;
        String str = this.hint;
        return ((((((i + (str != null ? str.hashCode() : 0)) * 31) + (this.showHint ? 1 : 0)) * 31) + (this.hideOverflowMenu ? 1 : 0)) * 31) + (this.typeSupported ? 1 : 0);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomsheetParametersModel
    public boolean isRemarkableAlexaEnabled() {
        return this.remarkableAlexaEnabled;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.bottomsheet.BottomsheetParametersModel
    public boolean isTypeSupported() {
        return this.typeSupported;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BottomsheetParameters{remarkableAlexaEnabled=");
        sb.append(this.remarkableAlexaEnabled);
        sb.append(", showRemarkableAlexa=");
        sb.append(this.showRemarkableAlexa);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", showHint=");
        sb.append(this.showHint);
        sb.append(", hideOverflowMenu=");
        sb.append(this.hideOverflowMenu);
        sb.append(", typeSupported=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.typeSupported, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.remarkableAlexaEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.showRemarkableAlexa ? (byte) 1 : (byte) 0);
        parcel.writeString(this.hint);
        parcel.writeByte(this.showHint ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hideOverflowMenu ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.typeSupported ? (byte) 1 : (byte) 0);
    }

    public BottomsheetParameters(Builder builder) {
        this.remarkableAlexaEnabled = builder.remarkableAlexaEnabled;
        this.showRemarkableAlexa = builder.showRemarkableAlexa;
        this.hint = builder.hint;
        this.showHint = builder.showHint;
        this.hideOverflowMenu = builder.hideOverflowMenu;
        this.typeSupported = builder.typeSupported;
    }
}
