package com.amazon.alexa.accessorykit.interprocess.cookie;

import android.content.Context;
import com.amazon.alexa.accessory.avsclient.utils.GsonJsonConverter;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessorykit.finishsetup.persistence.AccessoryPersistentStorage;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.google.gson.Gson;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class CookiePreferences {
    static final String COOKIE_KEY = "cookie";
    static final String COOKIE_NAMESPACE = "cookie-preferences";
    private static final String TAG = "CookiePreferences:";
    private static CookiePreferences instance;
    private final PersistentStorage store;

    private CookiePreferences(PersistentStorage.Factory factory) {
        Preconditions.notNull(factory, "factory");
        this.store = factory.create(COOKIE_NAMESPACE);
    }

    public static CookiePreferences getInstance(Context context) {
        Preconditions.notNull(context, "context");
        if (instance == null) {
            synchronized (CookiePreferences.class) {
                try {
                    if (instance == null) {
                        instance = new CookiePreferences(new AccessoryPersistentStorage.Factory(context, new GsonJsonConverter(new Gson())));
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public String getCookie() {
        return this.store.getString("cookie");
    }

    public void setCookie(String str) {
        Logger.d("%s Storing cookie: %s", TAG, str);
        this.store.edit().set("cookie", str).commit();
    }
}
