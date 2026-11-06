package com.amazon.alexa.voice.ui.onedesign.tta;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TtaScreenParameters implements TtaScreenParametersModel {
    public static final Parcelable.Creator<TtaScreenParameters> CREATOR = new Parcelable.Creator<TtaScreenParameters>() { // from class: com.amazon.alexa.voice.ui.onedesign.tta.TtaScreenParameters.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TtaScreenParameters createFromParcel(Parcel parcel) {
            return new TtaScreenParameters(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TtaScreenParameters[] newArray(int i) {
            return new TtaScreenParameters[i];
        }
    };
    private final boolean geoLocationInfoEnabled;
    private final String hintText;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        boolean geoLocationInfoEnabled;
        String hintText;

        public TtaScreenParameters build() {
            return new TtaScreenParameters(this);
        }

        public Builder geoLocationInfoEnabled(boolean z) {
            this.geoLocationInfoEnabled = z;
            return this;
        }

        public Builder hintText(String str) {
            this.hintText = str;
            return this;
        }
    }

    public TtaScreenParameters(Parcel parcel) {
        this.hintText = parcel.readString();
        this.geoLocationInfoEnabled = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TtaScreenParameters.class != obj.getClass()) {
            return false;
        }
        TtaScreenParameters ttaScreenParameters = (TtaScreenParameters) obj;
        String str = this.hintText;
        String str2 = ttaScreenParameters.hintText;
        if (str == null ? str2 == null : str.equals(str2)) {
            return this.geoLocationInfoEnabled == ttaScreenParameters.geoLocationInfoEnabled;
        }
        return false;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.TtaScreenParametersModel
    public boolean getGeoLocationInfoEnabled() {
        return this.geoLocationInfoEnabled;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.tta.TtaScreenParametersModel
    public String getHintText() {
        return this.hintText;
    }

    public int hashCode() {
        String str = this.hintText;
        return ((JfifUtil.MARKER_EOI + (str != null ? str.hashCode() : 0)) * 31) + (this.geoLocationInfoEnabled ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TtaScreenParameters{hintText=");
        sb.append(this.hintText);
        sb.append(", geoLocationInfoEnabled=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.geoLocationInfoEnabled, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.hintText);
        parcel.writeByte(this.geoLocationInfoEnabled ? (byte) 1 : (byte) 0);
    }

    public TtaScreenParameters(Builder builder) {
        this.hintText = builder.hintText;
        this.geoLocationInfoEnabled = builder.geoLocationInfoEnabled;
    }
}
