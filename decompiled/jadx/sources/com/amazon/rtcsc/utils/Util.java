package com.amazon.rtcsc.utils;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Util {
    public static Object nullCheck(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(BitVector$$ExternalSyntheticOutline0.m(str, " cannot be null"));
        return null;
    }
}
