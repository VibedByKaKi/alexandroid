package com.amazon.identity.mobi.common.utils;

import android.text.TextUtils;
import android.util.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class UrlCommonUtils {
    public static final Pattern AMAZON_HOST_PATTERN = Pattern.compile("(^|\\.)amazon\\.(ae|ca|cn|com|de|eg|es|eu|fr|in|it|nl|pl|pt|sa|se|sg|cl|ie|co\\.(jp|uk|za|th|id)|com\\.(au|br|mx|sg|tr|co|ng|be))$");
    private static final Pattern PRIME_VIDEO_HOST_PATTERN = Pattern.compile("(^|\\.)primevideo\\.com$");
    private static final Pattern AUDIBLE_HOST_PATTERN = Pattern.compile("(^|\\.)audible\\.(com|co\\.uk|de|fr|ca|in|it|es|co\\.jp|com\\.au|com\\.br)$");
    private static final Pattern GOODREADS_HOST_PATTERN = Pattern.compile("(^|\\.)goodreads\\.com$");

    public static URL createUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            Log.e("UrlCommonUtils", "Failed to construct URL object.", e);
            return null;
        }
    }

    public static boolean isAmazonOwnedDomain(String str) {
        try {
            String host = new URL(str).getHost();
            if (host != null) {
                return isTrustedDomain(host);
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    public static boolean isTrustedDomain(String str) {
        return TextUtils.isEmpty(str) || AMAZON_HOST_PATTERN.matcher(str).find() || PRIME_VIDEO_HOST_PATTERN.matcher(str).find() || AUDIBLE_HOST_PATTERN.matcher(str).find() || GOODREADS_HOST_PATTERN.matcher(str).find();
    }
}
