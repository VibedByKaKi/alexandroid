package com.amazon.alexa.voice.ui.onedesign.weather;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.annotation.UiModel;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface WeatherCardModel extends Parcelable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface ForecastModel extends Parcelable {
        CharSequence getDate();

        CharSequence getHighTemperature();

        int getIcon();

        CharSequence getLowTemperature();
    }

    @NonNull
    CharSequence getCurrentTemperature();

    CharSequence getCurrentWeatherAlert();

    CharSequence getCurrentWeatherDescription();

    List<? extends ForecastModel> getDailyForecasts();

    CharSequence getHighTemperature();

    List<? extends HourlyForecastModel> getHourlyForecasts();

    int getIcon();

    CharSequence getLowTemperature();

    CharSequence getShortDescriptionDate();

    CharSequence getShortTitle();

    @NonNull
    CharSequence getSubTitle();

    @NonNull
    CharSequence getTitle();

    CharSequence getWeatherDataProvider();
}
