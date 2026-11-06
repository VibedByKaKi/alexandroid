package com.amazon.alexa.cantilever.utils;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CookiesDomainUtil {
    private static final String DOMAIN_PATTERN = "\\.amazon\\..+";
    private static final String TAG = "CookiesDomainUtil";

    private CookiesDomainUtil() {
    }

    @Nullable
    public static String getCookiesDomain(@NonNull String str) {
        try {
            String host = new URL(str).getHost();
            String substring = (TextUtils.isEmpty(host) || !host.contains(".")) ? null : host.substring(host.indexOf("."));
            if (substring != null) {
                try {
                    if (!substring.matches(DOMAIN_PATTERN)) {
                        Log.i(TAG, substring.concat(" isn't a valid cookie domain, returning null."));
                        return null;
                    }
                } catch (MalformedURLException unused) {
                    return substring;
                }
            }
            return substring;
        } catch (MalformedURLException unused2) {
            return null;
        }
    }
}
