package com.amazon.identity.auth.device.utils;

import android.content.Context;
import android.util.Log;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.identity.auth.device.yf;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class c {
    public static int a(Context context, String str, String str2) {
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        Log.w(yf.a("ResourceHelper"), a$$ExternalSyntheticOutline0.m("The ", str, " resource ", str2, " has not been found"));
        throw new ResourceHelper$ResourceNotFoundException(TableInfo$$ExternalSyntheticOutline0.m$1(str, " Resource ", str2, " not found"));
    }
}
