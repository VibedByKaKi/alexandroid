package com.amazon.alexa.voice.ui.onedesign.weather;

import com.facebook.imageutils.JfifUtil;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class WeatherForecast implements WeatherForecastModel {
    private final CharSequence date;
    private final CharSequence highTemperature;
    private final int iconId;
    private final CharSequence lowTemperature;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        CharSequence date;
        CharSequence highTemperature;
        int iconId;
        CharSequence lowTemperature;

        public WeatherForecast build() {
            return new WeatherForecast(this);
        }

        public Builder date(CharSequence charSequence) {
            this.date = charSequence;
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
    }

    public WeatherForecast(Builder builder) {
        this.iconId = builder.iconId;
        this.highTemperature = builder.highTemperature;
        this.lowTemperature = builder.lowTemperature;
        this.date = builder.date;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WeatherForecast.class != obj.getClass()) {
            return false;
        }
        WeatherForecast weatherForecast = (WeatherForecast) obj;
        if (this.iconId != weatherForecast.iconId) {
            return false;
        }
        CharSequence charSequence = this.highTemperature;
        CharSequence charSequence2 = weatherForecast.highTemperature;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        CharSequence charSequence3 = this.lowTemperature;
        CharSequence charSequence4 = weatherForecast.lowTemperature;
        if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
            return false;
        }
        CharSequence charSequence5 = this.date;
        CharSequence charSequence6 = weatherForecast.date;
        return charSequence5 == null ? charSequence6 == null : charSequence5.equals(charSequence6);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherForecastModel
    public CharSequence getDate() {
        return this.date;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherForecastModel
    public CharSequence getHighTemperature() {
        return this.highTemperature;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherForecastModel
    public int getIconId() {
        return this.iconId;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherForecastModel
    public CharSequence getLowTemperature() {
        return this.lowTemperature;
    }

    public int hashCode() {
        int i = (JfifUtil.MARKER_EOI + this.iconId) * 31;
        CharSequence charSequence = this.highTemperature;
        int hashCode = (i + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.lowTemperature;
        int hashCode2 = (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
        CharSequence charSequence3 = this.date;
        return hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0);
    }

    public String toString() {
        return "WeatherForecast{iconId=" + this.iconId + ", highTemperature=" + ((Object) this.highTemperature) + ", lowTemperature=" + ((Object) this.lowTemperature) + ", date=" + ((Object) this.date) + AbstractJsonLexerKt.END_OBJ;
    }
}
