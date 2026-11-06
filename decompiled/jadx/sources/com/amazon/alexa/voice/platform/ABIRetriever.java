package com.amazon.alexa.voice.platform;

import android.os.Build;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ABIRetriever {
    private static final String TAG = "ABIRetriever";

    public String getMostPreferredABI() {
        String str = Build.SUPPORTED_ABIS[0];
        a$$ExternalSyntheticOutline0.m3m(" Architecture ", str, TAG);
        return str;
    }
}
