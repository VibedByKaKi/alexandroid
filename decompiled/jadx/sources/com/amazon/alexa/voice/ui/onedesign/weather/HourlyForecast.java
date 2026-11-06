package com.amazon.alexa.voice.ui.onedesign.weather;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class HourlyForecast implements HourlyForecastModel {
    public static final Parcelable.Creator<HourlyForecast> CREATOR = new Parcelable.Creator<HourlyForecast>() { // from class: com.amazon.alexa.voice.ui.onedesign.weather.HourlyForecast.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HourlyForecast createFromParcel(Parcel parcel) {
            return new HourlyForecast(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HourlyForecast[] newArray(int i) {
            return new HourlyForecast[i];
        }
    };
    private final CharSequence hourlyDescriptiveText;
    private final CharSequence hourlyTemperature;
    private final int iconId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        CharSequence hourlyDescriptiveText;
        CharSequence hourlyTemperature;
        int iconId;

        public HourlyForecast build() {
            return new HourlyForecast(this);
        }

        public Builder hourlyDescriptiveText(CharSequence charSequence) {
            this.hourlyDescriptiveText = charSequence;
            return this;
        }

        public Builder hourlyTemperature(CharSequence charSequence) {
            this.hourlyTemperature = charSequence;
            return this;
        }

        public Builder iconId(int i) {
            this.iconId = i;
            return this;
        }
    }

    public HourlyForecast(Parcel parcel) {
        this.iconId = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.hourlyTemperature = (CharSequence) creator.createFromParcel(parcel);
        this.hourlyDescriptiveText = (CharSequence) creator.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HourlyForecast.class != obj.getClass()) {
            return false;
        }
        HourlyForecast hourlyForecast = (HourlyForecast) obj;
        if (this.iconId != hourlyForecast.iconId) {
            return false;
        }
        CharSequence charSequence = this.hourlyTemperature;
        CharSequence charSequence2 = hourlyForecast.hourlyTemperature;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        CharSequence charSequence3 = this.hourlyDescriptiveText;
        CharSequence charSequence4 = hourlyForecast.hourlyDescriptiveText;
        return charSequence3 == null ? charSequence4 == null : charSequence3.equals(charSequence4);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.HourlyForecastModel
    public CharSequence getHourlyDescriptiveText() {
        return this.hourlyDescriptiveText;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.HourlyForecastModel
    public CharSequence getHourlyTemperature() {
        return this.hourlyTemperature;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.HourlyForecastModel
    public int getIconId() {
        return this.iconId;
    }

    public int hashCode() {
        int i = (JfifUtil.MARKER_EOI + this.iconId) * 31;
        CharSequence charSequence = this.hourlyTemperature;
        int hashCode = (i + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.hourlyDescriptiveText;
        return hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public String toString() {
        return "HourlyForecast{iconId=" + this.iconId + ", hourlyTemperature=" + ((Object) this.hourlyTemperature) + ", hourlyDescriptiveText=" + ((Object) this.hourlyDescriptiveText) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.iconId);
        TextUtils.writeToParcel(this.hourlyTemperature, parcel, i);
        TextUtils.writeToParcel(this.hourlyDescriptiveText, parcel, i);
    }

    public HourlyForecast(Builder builder) {
        this.iconId = builder.iconId;
        this.hourlyTemperature = builder.hourlyTemperature;
        this.hourlyDescriptiveText = builder.hourlyDescriptiveText;
    }
}
