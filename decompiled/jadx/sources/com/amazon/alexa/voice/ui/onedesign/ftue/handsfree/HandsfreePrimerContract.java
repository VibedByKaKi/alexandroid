package com.amazon.alexa.voice.ui.onedesign.ftue.handsfree;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface HandsfreePrimerContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void deferPrimer();

        void geoLocationLegalClicked();

        void learnMoreClicked(@NonNull String str);

        void requestPermissions();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void openGeoLocationLegal();

        void openLearnMore(@NonNull CharSequence charSequence);

        void requestPermissions();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void allowClicked();

        void geoLocationLegalClicked();

        void laterClicked();

        void learnMoreClicked();

        void start();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void floodBackgroundToStatusBar();

        void removeLaterButton();

        void setAllowButtonText(@NonNull CharSequence charSequence);

        void setGeoLocationInfo(@NonNull CharSequence charSequence);

        void setHandsfreeSettingsInfo(CharSequence charSequence);

        void setLaterButtonText(@NonNull CharSequence charSequence);

        void setRationale(CharSequence charSequence, CharSequence charSequence2);

        void setStatusBarHeightAsTopPadding();

        void setTitle(@NonNull CharSequence charSequence);

        void setUsage(CharSequence charSequence, CharSequence charSequence2);

        void showHandsfreeSettingsInfo(boolean z);

        void shrinkTopMargin();
    }
}
