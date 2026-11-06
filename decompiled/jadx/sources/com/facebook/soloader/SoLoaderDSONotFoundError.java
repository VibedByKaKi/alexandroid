package com.facebook.soloader;

import android.content.Context;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotStripAny
/* loaded from: classes7.dex */
public class SoLoaderDSONotFoundError extends SoLoaderULError {
    public SoLoaderDSONotFoundError(String str) {
        super(str);
    }

    public static SoLoaderDSONotFoundError create(String str, @Nullable Context context, SoSource[] soSourceArr) {
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < soSourceArr.length; i++) {
            m2m.append("\n\t\tSoSource ");
            m2m.append(i);
            m2m.append(": ");
            m2m.append(soSourceArr[i].toString());
        }
        if (context != null) {
            m2m.append("\n\tNative lib dir: ");
            m2m.append(context.getApplicationInfo().nativeLibraryDir);
            m2m.append("\n");
        }
        return new SoLoaderDSONotFoundError(str, m2m.toString());
    }

    public SoLoaderDSONotFoundError(String str, String str2) {
        super(str, str2);
    }
}
