package com.amazon.alexa.voice.ui.onedesign.standard;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface StandardContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void close();

        void dismiss();

        StandardCardModel getCard();

        void openLink();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void close();

        void dismiss();

        void openLinkUrl(@NonNull CharSequence charSequence);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void closeClicked();

        void dismiss();

        void interacted();

        void linkClicked();

        void start();

        void viewDestroyed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void floodBackgroundToStatusBar();

        void setContent(@NonNull CharSequence charSequence);

        void setImageAttribution(@Nullable CharSequence charSequence);

        void setImageUrl(@Nullable CharSequence charSequence);

        void setLinkText(@Nullable CharSequence charSequence);

        void setSubTitle(@Nullable CharSequence charSequence);

        void setTitle(@Nullable CharSequence charSequence);

        void setVisibleLayout(int i);
    }
}
