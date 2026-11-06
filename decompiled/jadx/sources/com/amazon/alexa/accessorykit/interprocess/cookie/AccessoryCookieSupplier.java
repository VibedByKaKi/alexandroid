package com.amazon.alexa.accessorykit.interprocess.cookie;

import android.content.Context;
import com.amazon.alexa.accessory.internal.cookie.CookieManagerWrapper;
import com.amazon.alexa.accessory.internal.cookie.CookieSupplier;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AccessoryCookieSupplier implements CookieSupplier {
    private static final String TAG = "AccessoryCookieSupplier:";
    private final Context context;
    private final CookieManagerWrapper cookieManagerWrapper;

    public AccessoryCookieSupplier(Context context, CookieManagerWrapper cookieManagerWrapper) {
        Preconditions.notNull(context, "context");
        Preconditions.notNull(cookieManagerWrapper, "cookieManagerWrapper");
        this.context = context;
        this.cookieManagerWrapper = cookieManagerWrapper;
    }

    @Override // com.amazon.alexa.accessory.internal.cookie.CookieSupplier
    public String getCookie(String str) {
        String cookie = CookiePreferences.getInstance(this.context).getCookie();
        Logger.d("%s getCookie - retrieved cookie value from store = %s", TAG, cookie);
        return cookie == null ? this.cookieManagerWrapper.getCookie(str) : cookie;
    }
}
