package com.amazon.alexa.voice.ui.onedesign.weather;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel;
import com.facebook.imageutils.JfifUtil;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class WeatherCard implements WeatherCardModel {
    public static final Parcelable.Creator<WeatherCard> CREATOR = new Parcelable.Creator<WeatherCard>() { // from class: com.amazon.alexa.voice.ui.onedesign.weather.WeatherCard.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WeatherCard createFromParcel(Parcel parcel) {
            return new WeatherCard(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WeatherCard[] newArray(int i) {
            return new WeatherCard[i];
        }
    };
    private final CharSequence currentTemperature;
    private final CharSequence currentWeatherAlert;
    private final CharSequence currentWeatherDescription;
    private final List<? extends WeatherCardModel.ForecastModel> dailyForecasts;
    private final CharSequence highTemperature;
    private final List<? extends HourlyForecastModel> hourlyForecasts;
    private final int icon;
    private final CharSequence lowTemperature;
    private final CharSequence shortDescriptionDate;
    private final CharSequence shortTitle;
    private final CharSequence subTitle;
    private final CharSequence title;
    private final CharSequence weatherDataProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        CharSequence currentTemperature;
        CharSequence currentWeatherAlert;
        CharSequence currentWeatherDescription;
        List<? extends WeatherCardModel.ForecastModel> dailyForecasts;
        CharSequence highTemperature;
        List<? extends HourlyForecastModel> hourlyForecasts;
        int icon;
        CharSequence lowTemperature;
        CharSequence shortDescriptionDate;
        CharSequence shortTitle;
        CharSequence subTitle;
        CharSequence title;
        CharSequence weatherDataProvider;

        public WeatherCard build() {
            if (this.title == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("title == null");
                return null;
            }
            if (this.subTitle == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("subTitle == null");
                return null;
            }
            if (this.currentTemperature != null) {
                return new WeatherCard(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("currentTemperature == null");
            return null;
        }

        public Builder currentTemperature(@NonNull CharSequence charSequence) {
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

        public Builder dailyForecasts(List<? extends WeatherCardModel.ForecastModel> list) {
            this.dailyForecasts = list;
            return this;
        }

        public Builder highTemperature(CharSequence charSequence) {
            this.highTemperature = charSequence;
            return this;
        }

        public Builder hourlyForecasts(List<? extends HourlyForecastModel> list) {
            this.hourlyForecasts = list;
            return this;
        }

        public Builder icon(int i) {
            this.icon = i;
            return this;
        }

        public Builder lowTemperature(CharSequence charSequence) {
            this.lowTemperature = charSequence;
            return this;
        }

        public Builder shortDescriptionDate(CharSequence charSequence) {
            this.shortDescriptionDate = charSequence;
            return this;
        }

        public Builder shortTitle(CharSequence charSequence) {
            this.shortTitle = charSequence;
            return this;
        }

        public Builder subTitle(@NonNull CharSequence charSequence) {
            this.subTitle = charSequence;
            return this;
        }

        public Builder title(@NonNull CharSequence charSequence) {
            this.title = charSequence;
            return this;
        }

        public Builder weatherDataProvider(CharSequence charSequence) {
            this.weatherDataProvider = charSequence;
            return this;
        }
    }

    public WeatherCard(Parcel parcel) {
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.title = (CharSequence) creator.createFromParcel(parcel);
        this.subTitle = (CharSequence) creator.createFromParcel(parcel);
        this.shortDescriptionDate = (CharSequence) creator.createFromParcel(parcel);
        this.shortTitle = (CharSequence) creator.createFromParcel(parcel);
        this.currentTemperature = (CharSequence) creator.createFromParcel(parcel);
        this.lowTemperature = (CharSequence) creator.createFromParcel(parcel);
        this.highTemperature = (CharSequence) creator.createFromParcel(parcel);
        this.icon = parcel.readInt();
        this.currentWeatherDescription = (CharSequence) creator.createFromParcel(parcel);
        this.weatherDataProvider = (CharSequence) creator.createFromParcel(parcel);
        this.currentWeatherAlert = (CharSequence) creator.createFromParcel(parcel);
        this.dailyForecasts = parcel.createTypedArrayList(Forecast.CREATOR);
        this.hourlyForecasts = parcel.createTypedArrayList(HourlyForecast.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WeatherCard.class != obj.getClass()) {
            return false;
        }
        WeatherCard weatherCard = (WeatherCard) obj;
        if (!this.title.equals(weatherCard.title) || !this.subTitle.equals(weatherCard.subTitle)) {
            return false;
        }
        CharSequence charSequence = this.shortDescriptionDate;
        CharSequence charSequence2 = weatherCard.shortDescriptionDate;
        if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
            return false;
        }
        CharSequence charSequence3 = this.shortTitle;
        CharSequence charSequence4 = weatherCard.shortTitle;
        if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
            return false;
        }
        if (!this.currentTemperature.equals(weatherCard.currentTemperature)) {
            return false;
        }
        CharSequence charSequence5 = this.lowTemperature;
        CharSequence charSequence6 = weatherCard.lowTemperature;
        if (charSequence5 == null ? charSequence6 != null : !charSequence5.equals(charSequence6)) {
            return false;
        }
        CharSequence charSequence7 = this.highTemperature;
        CharSequence charSequence8 = weatherCard.highTemperature;
        if (charSequence7 == null ? charSequence8 != null : !charSequence7.equals(charSequence8)) {
            return false;
        }
        if (this.icon != weatherCard.icon) {
            return false;
        }
        CharSequence charSequence9 = this.currentWeatherDescription;
        CharSequence charSequence10 = weatherCard.currentWeatherDescription;
        if (charSequence9 == null ? charSequence10 != null : !charSequence9.equals(charSequence10)) {
            return false;
        }
        CharSequence charSequence11 = this.weatherDataProvider;
        CharSequence charSequence12 = weatherCard.weatherDataProvider;
        if (charSequence11 == null ? charSequence12 != null : !charSequence11.equals(charSequence12)) {
            return false;
        }
        CharSequence charSequence13 = this.currentWeatherAlert;
        CharSequence charSequence14 = weatherCard.currentWeatherAlert;
        if (charSequence13 == null ? charSequence14 != null : !charSequence13.equals(charSequence14)) {
            return false;
        }
        List<? extends WeatherCardModel.ForecastModel> list = this.dailyForecasts;
        List<? extends WeatherCardModel.ForecastModel> list2 = weatherCard.dailyForecasts;
        if (list == null ? list2 != null : !list.equals(list2)) {
            return false;
        }
        List<? extends HourlyForecastModel> list3 = this.hourlyForecasts;
        List<? extends HourlyForecastModel> list4 = weatherCard.hourlyForecasts;
        return list3 == null ? list4 == null : list3.equals(list4);
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public CharSequence getCurrentTemperature() {
        return this.currentTemperature;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public CharSequence getCurrentWeatherAlert() {
        return this.currentWeatherAlert;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public CharSequence getCurrentWeatherDescription() {
        return this.currentWeatherDescription;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public List<? extends WeatherCardModel.ForecastModel> getDailyForecasts() {
        return this.dailyForecasts;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public CharSequence getHighTemperature() {
        return this.highTemperature;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public List<? extends HourlyForecastModel> getHourlyForecasts() {
        return this.hourlyForecasts;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public int getIcon() {
        return this.icon;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public CharSequence getLowTemperature() {
        return this.lowTemperature;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public CharSequence getShortDescriptionDate() {
        return this.shortDescriptionDate;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public CharSequence getShortTitle() {
        return this.shortTitle;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public CharSequence getSubTitle() {
        return this.subTitle;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public CharSequence getTitle() {
        return this.title;
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel
    public CharSequence getWeatherDataProvider() {
        return this.weatherDataProvider;
    }

    public int hashCode() {
        int m = ChatData$$ExternalSyntheticOutline0.m(this.subTitle, ChatData$$ExternalSyntheticOutline0.m(this.title, JfifUtil.MARKER_EOI, 31), 31);
        CharSequence charSequence = this.shortDescriptionDate;
        int hashCode = (m + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.shortTitle;
        int m2 = ChatData$$ExternalSyntheticOutline0.m(this.currentTemperature, (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31, 31);
        CharSequence charSequence3 = this.lowTemperature;
        int hashCode2 = (m2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31;
        CharSequence charSequence4 = this.highTemperature;
        int hashCode3 = (((hashCode2 + (charSequence4 != null ? charSequence4.hashCode() : 0)) * 31) + this.icon) * 31;
        CharSequence charSequence5 = this.currentWeatherDescription;
        int hashCode4 = (hashCode3 + (charSequence5 != null ? charSequence5.hashCode() : 0)) * 31;
        CharSequence charSequence6 = this.weatherDataProvider;
        int hashCode5 = (hashCode4 + (charSequence6 != null ? charSequence6.hashCode() : 0)) * 31;
        CharSequence charSequence7 = this.currentWeatherAlert;
        int hashCode6 = (hashCode5 + (charSequence7 != null ? charSequence7.hashCode() : 0)) * 31;
        List<? extends WeatherCardModel.ForecastModel> list = this.dailyForecasts;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        List<? extends HourlyForecastModel> list2 = this.hourlyForecasts;
        return hashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WeatherCard{title=");
        sb.append((Object) this.title);
        sb.append(", subTitle=");
        sb.append((Object) this.subTitle);
        sb.append(", shortDescriptionDate=");
        sb.append((Object) this.shortDescriptionDate);
        sb.append(", shortTitle=");
        sb.append((Object) this.shortTitle);
        sb.append(", currentTemperature=");
        sb.append((Object) this.currentTemperature);
        sb.append(", lowTemperature=");
        sb.append((Object) this.lowTemperature);
        sb.append(", highTemperature=");
        sb.append((Object) this.highTemperature);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", currentWeatherDescription=");
        sb.append((Object) this.currentWeatherDescription);
        sb.append(", weatherDataProvider=");
        sb.append((Object) this.weatherDataProvider);
        sb.append(", currentWeatherAlert=");
        sb.append((Object) this.currentWeatherAlert);
        sb.append(", dailyForecasts=");
        sb.append(this.dailyForecasts);
        sb.append(", hourlyForecasts=");
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, this.hourlyForecasts, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.title, parcel, i);
        TextUtils.writeToParcel(this.subTitle, parcel, i);
        TextUtils.writeToParcel(this.shortDescriptionDate, parcel, i);
        TextUtils.writeToParcel(this.shortTitle, parcel, i);
        TextUtils.writeToParcel(this.currentTemperature, parcel, i);
        TextUtils.writeToParcel(this.lowTemperature, parcel, i);
        TextUtils.writeToParcel(this.highTemperature, parcel, i);
        parcel.writeInt(this.icon);
        TextUtils.writeToParcel(this.currentWeatherDescription, parcel, i);
        TextUtils.writeToParcel(this.weatherDataProvider, parcel, i);
        TextUtils.writeToParcel(this.currentWeatherAlert, parcel, i);
        parcel.writeTypedList(this.dailyForecasts);
        parcel.writeTypedList(this.hourlyForecasts);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Forecast implements WeatherCardModel.ForecastModel {
        public static final Parcelable.Creator<Forecast> CREATOR = new Parcelable.Creator<Forecast>() { // from class: com.amazon.alexa.voice.ui.onedesign.weather.WeatherCard.Forecast.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Forecast createFromParcel(Parcel parcel) {
                return new Forecast(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Forecast[] newArray(int i) {
                return new Forecast[i];
            }
        };
        private final CharSequence date;
        private final CharSequence highTemperature;
        private final int icon;
        private final CharSequence lowTemperature;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static final class Builder {
            CharSequence date;
            CharSequence highTemperature;
            int icon;
            CharSequence lowTemperature;

            public Forecast build() {
                return new Forecast(this);
            }

            public Builder date(CharSequence charSequence) {
                this.date = charSequence;
                return this;
            }

            public Builder highTemperature(CharSequence charSequence) {
                this.highTemperature = charSequence;
                return this;
            }

            public Builder icon(int i) {
                this.icon = i;
                return this;
            }

            public Builder lowTemperature(CharSequence charSequence) {
                this.lowTemperature = charSequence;
                return this;
            }
        }

        public Forecast(Parcel parcel) {
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            this.date = (CharSequence) creator.createFromParcel(parcel);
            this.lowTemperature = (CharSequence) creator.createFromParcel(parcel);
            this.highTemperature = (CharSequence) creator.createFromParcel(parcel);
            this.icon = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Forecast.class != obj.getClass()) {
                return false;
            }
            Forecast forecast = (Forecast) obj;
            CharSequence charSequence = this.date;
            CharSequence charSequence2 = forecast.date;
            if (charSequence == null ? charSequence2 != null : !charSequence.equals(charSequence2)) {
                return false;
            }
            CharSequence charSequence3 = this.lowTemperature;
            CharSequence charSequence4 = forecast.lowTemperature;
            if (charSequence3 == null ? charSequence4 != null : !charSequence3.equals(charSequence4)) {
                return false;
            }
            CharSequence charSequence5 = this.highTemperature;
            CharSequence charSequence6 = forecast.highTemperature;
            if (charSequence5 == null ? charSequence6 == null : charSequence5.equals(charSequence6)) {
                return this.icon == forecast.icon;
            }
            return false;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel.ForecastModel
        public CharSequence getDate() {
            return this.date;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel.ForecastModel
        public CharSequence getHighTemperature() {
            return this.highTemperature;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel.ForecastModel
        public int getIcon() {
            return this.icon;
        }

        @Override // com.amazon.alexa.voice.ui.onedesign.weather.WeatherCardModel.ForecastModel
        public CharSequence getLowTemperature() {
            return this.lowTemperature;
        }

        public int hashCode() {
            CharSequence charSequence = this.date;
            int hashCode = (JfifUtil.MARKER_EOI + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
            CharSequence charSequence2 = this.lowTemperature;
            int hashCode2 = (hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31;
            CharSequence charSequence3 = this.highTemperature;
            return ((hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31) + this.icon;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Forecast{date=");
            sb.append((Object) this.date);
            sb.append(", lowTemperature=");
            sb.append((Object) this.lowTemperature);
            sb.append(", highTemperature=");
            sb.append((Object) this.highTemperature);
            sb.append(", icon=");
            return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.icon, AbstractJsonLexerKt.END_OBJ);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            TextUtils.writeToParcel(this.date, parcel, i);
            TextUtils.writeToParcel(this.lowTemperature, parcel, i);
            TextUtils.writeToParcel(this.highTemperature, parcel, i);
            parcel.writeInt(this.icon);
        }

        public Forecast(Builder builder) {
            this.date = builder.date;
            this.lowTemperature = builder.lowTemperature;
            this.highTemperature = builder.highTemperature;
            this.icon = builder.icon;
        }
    }

    public WeatherCard(Builder builder) {
        this.title = builder.title;
        this.subTitle = builder.subTitle;
        this.shortDescriptionDate = builder.shortDescriptionDate;
        this.shortTitle = builder.shortTitle;
        this.currentTemperature = builder.currentTemperature;
        this.lowTemperature = builder.lowTemperature;
        this.highTemperature = builder.highTemperature;
        this.icon = builder.icon;
        this.currentWeatherDescription = builder.currentWeatherDescription;
        this.weatherDataProvider = builder.weatherDataProvider;
        this.currentWeatherAlert = builder.currentWeatherAlert;
        this.dailyForecasts = builder.dailyForecasts;
        this.hourlyForecasts = builder.hourlyForecasts;
    }
}
