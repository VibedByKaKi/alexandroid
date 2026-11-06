package com.amazon.alexa.voice.ui.onedesign.ftue.primer;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface PrimerContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void askForOsPermissions();

        void close();

        void deferPrimer();

        void validatePermissions();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        @NonNull
        String[] getMinimumRequiredPermissions();

        @NonNull
        String[] getPermissions();

        void notifyVoicePermissionGrantedListener();

        void showPermissionSettings();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void allowClicked();

        void closeClicked();

        void laterClicked();

        void permissionsResultReceived();

        void start();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void floodBackgroundToStatusBar();

        void setAllowButtonText(@NonNull CharSequence charSequence);

        void setLaterButtonText(@NonNull CharSequence charSequence);

        void setPermissionsListText(@NonNull CharSequence charSequence);

        void setPermissionsRationale(@NonNull CharSequence charSequence);

        void setPermissionsTitle(@NonNull CharSequence charSequence);
    }
}
