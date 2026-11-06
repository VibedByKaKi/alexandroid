package com.amazon.alexa.handsfree.protocols.utils;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AlexaAppSignInContract {
    boolean getSignInState(Context context, boolean z);

    void setup(Context context, boolean z);

    void teardown(Context context);
}
