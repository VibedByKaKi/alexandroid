package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.TokenManagement;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class wl {
    public static HashMap a(Context context, String str) {
        try {
            Bundle bundle = new TokenManagement(context).getToken(str, "com.amazon.dcp.sso.token.oauth.amazon.access_token", null, null).get(1000L, TimeUnit.MILLISECONDS);
            HashMap hashMap = new HashMap();
            hashMap.put("x-amz-access-token", bundle.getString("value_key"));
            return hashMap;
        } catch (Exception unused) {
            Log.e(yf.a("ProfilePickerUtils"), "Cannot get access token header");
            return null;
        }
    }
}
