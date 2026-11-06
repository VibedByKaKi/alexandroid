package com.amazon.alexa.voice.ui.onedesign.local.detail;

import com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface LocalDetailContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void back();

        void callBusiness();

        void close();

        LocalCardModel.BusinessModel getBusiness();

        void openLink();

        void showLocation();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void dialPhoneNumber(String str);

        void mapAddress(String str);

        void mapGeoLocation(String str) throws IllegalArgumentException;

        void openLinkUrl(String str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void addressClicked();

        void backClicked();

        void closeClicked();

        void interacted();

        void linkClicked();

        void phoneNumberClicked();

        void start();

        void viewDestroyed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void floodBackgroundToStatusBar();

        void setAccessRestriction(CharSequence charSequence);

        void setAddress(CharSequence charSequence, CharSequence charSequence2);

        void setDescription(CharSequence charSequence, CharSequence charSequence2);

        void setDistance(CharSequence charSequence, CharSequence charSequence2);

        void setEVChargers(CharSequence charSequence);

        void setImageUrl(String str);

        void setLinkText(CharSequence charSequence);

        void setMergedProviderInfo(String str);

        void setName(CharSequence charSequence);

        void setOpeningHours(CharSequence charSequence, CharSequence charSequence2);

        void setParkingType(CharSequence charSequence);

        void setPhoneNumber(CharSequence charSequence, CharSequence charSequence2);

        void setProviderLogoAndDescription(String str, CharSequence charSequence);

        void setRating(CharSequence charSequence, String str, CharSequence charSequence2);

        void setReviewCount(CharSequence charSequence, CharSequence charSequence2);
    }
}
