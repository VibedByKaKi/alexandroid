package com.amazon.deecomms.calling.incallexperiences.effects.contracts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface EffectsMenuViewContract {
    void hideButton();

    void hideMenu();

    void refreshMenu();

    void setPresenter(EffectsMenuPresenterContract effectsMenuPresenterContract);

    void setThumbnails(List<Drawable> list);

    void showButton();

    void showGrayedOutButton();

    void showToast(Context context, int i);

    void showToast(Context context, String str);
}
