package com.amazon.alexa.voice.ui.onedesign.local.search;

import android.graphics.drawable.Drawable;
import com.amazon.alexa.voice.ui.onedesign.local.LocalCard;
import com.amazon.alexa.voice.ui.onedesign.local.LocalCardModel;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface LocalSearchContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Interactor {
        void close();

        LocalCard getCard();

        void showBusiness(LocalCardModel.BusinessModel businessModel);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Mediator {
        void openBusiness(LocalCardModel.BusinessModel businessModel);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Presenter {
        void closeClicked();

        void end();

        void interacted();

        void itemClicked(LocalSearchItemModel localSearchItemModel);

        void start();

        void viewDestroyed();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View {
        void add(Object obj);

        void floodBackgroundToStatusBar();

        void setImageAttribution(Drawable drawable);

        void setSubTitle(CharSequence charSequence);

        void setTitle(CharSequence charSequence);
    }
}
