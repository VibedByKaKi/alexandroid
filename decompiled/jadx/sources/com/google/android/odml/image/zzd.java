package com.google.android.odml.image;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final /* synthetic */ class zzd {
    static final /* synthetic */ int[] zza;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        zza = iArr;
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zza[Bitmap.Config.ARGB_8888.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
