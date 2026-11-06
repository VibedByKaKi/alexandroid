package com.amazon.alexa.voice.ui.onedesign.weather;

import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class WeatherToday implements WeatherTodayModel {
    private final CharSequence currentTemperature;
    private final CharSequence currentWeatherAlert;
    private final CharSequence currentWeatherDescription;
    private final CharSequence highTemperature;
    private final int iconId;
    private final CharSequence lowTemperature;
    private final CharSequence realFeel;
    private final CharSequence weatherDataProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        CharSequence currentTemperature;
        CharSequence currentWeatherAlert;
        CharSequence currentWeatherDescription;
        CharSequence highTemperature;
        int iconId;
        CharSequence lowTemperature;
        CharSequence realFeel;
        CharSequence weatherDataProvider;

        public WeatherToday build() {
            return new WeatherToday(this);
        }

        public Builder currentTemperature(CharSequence charSequence) {
            this.currentTemperature = charSequence;
            return this;
        }

        public Builder currentWeatherAlert(CharSequence charSequence) {
            this.currentWeatherAlert = charSequence;
            return this;
        }

        public Builder currentWeatherDescription(CharSequence charSequence) {
            this.currentWeatherDescription = charSequence;
            return this;
        }

        public Builder highTemperature(CharSequence charSequence) {
            this.highTemperature = charSequence;
            return this;
        }

        public Builder iconId(int i) {
            this.iconId = i;
            return this;
        }

        public Builder lowTemperature(CharSequence charSequence) {
            this.lowTemperature = charSequence;
            return this;
        }

        public Builder realFeel(CharSequence charSequence) {
            this.realFeel = charSequence;
            return this;
        }

        public Builder weatherDataProvider(CharSequence charSequence) {
            this.weatherDataProvider = charSequence;
            return this;
        }
    }

    public WeatherToday(Builder builder) {
        this.iconId = builder.iconId;
        this.currentTemperature = builder.currentTemperature;
        this.highTemperature = builder.highTemperature;
        this.lowTemperature = builder.lowTemperature;
        this.realFeel = builder.realFeel;
        this.currentWeatherAlert = builder.currentWeatherAlert;
        this.currentWeatherDescription = builder.currentWeatherDescription;
        this.weatherDataProvider = builder.weatherDataProvider;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WeatherToday.class != obj.getClass()) {
            return false;
        }
        WeatherToday weatherToday = (WeatherToday) obj;
        if (this.iconId != weatherToday.iconId) {
            return false;
        }
        CharSequence charSequence = this.currentTemperature;
        CharSequence charSequence2 = weatherToday.currentTemperature;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        CharSequence charSequence3 = this.highTemperature;
        CharSequence charSequence4 = weatherToday.highTemperature;
        if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
            return false;
        }
        CharSequence charSequence5 = this.lowTemperature;
        CharSequence charSequence6 = weatherToday.lowTemperature;
        if (charSequence5 == null ? charSequence6 != null : !charSequence5.equals(charSequence6)) {
            return false;
        }
        CharSequence charSequence7 = this.realFeel;
        CharSequence charSequence8 = weatherToday.realFeel;
        if (charSequence7 == null ? charSequence8 != null : !charSequence7.equals(charSequence8)) {
            return false;
        }
        CharSequence charSequence9 = this.currentWeatherAlert;
        CharSequence charSequence10 = weatherToday.currentWeatherAlert;
        if (charSequence9 == null ? charSequence10 != null : !charSequence9.equals(charSequence10)) {
            return false;
        }
        CharSequence charSequence11 = this.currentWeatherDescription;
        CharSequence charSequence12 = weatherToday.currentWeatherDescription;
        if (charSequence11 == null ? charSequence12 != null : !charSequence11.equals(charSequence12)) {
            return false;
        }
        CharSequence charSequence13 = this.weatherDataProvider;
        CharSequence charSequence14 = weatherToday.weatherDataProvider;
        return charSequence13 == null ? charSequence14 == null : charSequence13.equals(charSequence14);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherTodayModel
    public CharSequence getCurrentTemperature() {
        return this.currentTemperature;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherTodayModel
    public CharSequence getCurrentWeatherAlert() {
        return this.currentWeatherAlert;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherTodayModel
    public CharSequence getCurrentWeatherDescription() {
        return this.currentWeatherDescription;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherTodayModel
    public CharSequence getHighTemperature() {
        return this.highTemperature;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherTodayModel
    public int getIconId() {
        return this.iconId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherTodayModel
    public CharSequence getLowTemperature() {
        return this.lowTemperature;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherTodayModel
    public CharSequence getRealFeel() {
        return this.realFeel;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherTodayModel
    public CharSequence getWeatherDataProvider() {
        return this.weatherDataProvider;
    }

    public int hashCode() {
        int i = (JfifUtil.MARKER_EOI + this.iconId) * 31;
        CharSequence charSequence = this.currentTemperature;
        int hashCode = (i + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.highTemperature;
        int hashCode2 = (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
        CharSequence charSequence3 = this.lowTemperature;
        int hashCode3 = (hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31;
        CharSequence charSequence4 = this.realFeel;
        int hashCode4 = (hashCode3 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31;
        CharSequence charSequence5 = this.currentWeatherAlert;
        int hashCode5 = (hashCode4 + (charSequence5 != null ? charSequence5.hashCode() : 0)) * 31;
        CharSequence charSequence6 = this.currentWeatherDescription;
        int hashCode6 = (hashCode5 + (charSequence6 != null ? charSequence6.hashCode() : 0)) * 31;
        CharSequence charSequence7 = this.weatherDataProvider;
        return hashCode6 + (charSequence7 != null ? charSequence7.hashCode() : 0);
    }

    public String toString() {
        return "WeatherToday{iconId=" + this.iconId + ", currentTemperature=" + ((Object) this.currentTemperature) + ", highTemperature=" + ((Object) this.highTemperature) + ", lowTemperature=" + ((Object) this.lowTemperature) + ", realFeel=" + ((Object) this.realFeel) + ", currentWeatherAlert=" + ((Object) this.currentWeatherAlert) + ", currentWeatherDescription=" + ((Object) this.currentWeatherDescription) + ", weatherDataProvider=" + ((Object) this.weatherDataProvider) + AbstractJsonLexerKt.END_OBJ;
    }
}
