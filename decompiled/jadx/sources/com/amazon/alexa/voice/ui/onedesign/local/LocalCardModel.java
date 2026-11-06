package com.amazon.alexa.voice.ui.onedesign.local;

import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.annotation.UiModel;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UiModel(builder = true)
/* loaded from: classes20.dex */
public interface LocalCardModel extends Parcelable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @UiModel(builder = true)
    public interface BusinessModel extends Parcelable {
        String getAccessRestriction();

        @NonNull
        CharSequence getAddress();

        @NonNull
        List<CharSequence> getCategories();

        String getDataSource();

        @NonNull
        CharSequence getDistanceUnit();

        float getDistanceValue();

        List<CharSequence> getElectricVehicleChargers();

        CharSequence getGeoLocation();

        @NonNull
        String getImageUrl();

        String getLinkUrl();

        String getMergedProviderInfo();

        @NonNull
        CharSequence getName();

        @NonNull
        List<CharSequence> getOpeningHours();

        String getParkingType();

        CharSequence getPhoneNumber();

        @NonNull
        String getProviderLogoUrl();

        float getRating();

        int getReviewCount();

        String getSpecialBusinessHoursDisplayMessage();

        String getSpecialBusinessHoursDisplayType();

        CharSequence getSpendiness();

        @NonNull
        String getStarRatingUrl();

        String goToActionText();

        String goToActionUrl();
    }

    @NonNull
    List<? extends BusinessModel> getBusinessList();

    @NonNull
    String getSortKey();

    @NonNull
    CharSequence getTitle();
}
