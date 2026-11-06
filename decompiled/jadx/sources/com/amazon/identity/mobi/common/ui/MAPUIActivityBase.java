package com.amazon.identity.mobi.common.ui;

import android.app.Activity;
import android.util.Log;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MAPUIActivityBase extends Activity {
    private int getResourceId(String str, String str2) {
        int identifier = getResources().getIdentifier(str2, str, getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        Log.e("MAPActivityBase", a$$ExternalSyntheticOutline0.m("The ", str, " resource ", str2, " has not been found"));
        Single$$ExternalSyntheticBUOutline0.m$3(TableInfo$$ExternalSyntheticOutline0.m$1(str, " Resource ", str2, " not found"));
        return 0;
    }

    public int getAnimId(String str) {
        return getResourceId("anim", str);
    }

    public int getId(String str) {
        return getResourceId("id", str);
    }

    public int getLayoutId(String str) {
        return getResourceId("layout", str);
    }
}
