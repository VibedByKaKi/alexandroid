package com.amazon.deecomms.calling.incallexperiences.effects.contracts;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface CallCaptioningPresenterContract {
    void hideButton();

    boolean isCallCaptioningAvailable();

    boolean isCallCaptioningEnabled();

    void lowerCaptions();

    void onCallCaptioningOffButtonTapped();

    void onCallCaptioningOnButtonTapped();

    void raiseCaptions();

    boolean shouldShowButton();

    void showButton();

    void showGrayedOutButton();

    void showToast(Context context, int i);

    void showToast(Context context, String str);

    void tearDownCallCaptioning();
}
