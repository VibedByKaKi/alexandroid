package com.amazon.identity.frc.FrcCookiesManager;

import android.text.TextUtils;
import android.util.Log;
import com.amazon.identity.frc.FrcCookiesManager;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class b extends JSONObject {
    @Override // org.json.JSONObject
    public final JSONObject put(String str, Object obj) {
        if ((obj == null || TextUtils.isEmpty(obj.toString().trim())) && FrcCookiesManager.b.contains(str)) {
            Log.e(FrcCookiesManager.c, "MissingMandatoryFrcCookie:" + str);
        }
        return ((obj instanceof String) && TextUtils.isEmpty((String) obj)) ? this : super.put(str, obj);
    }
}
