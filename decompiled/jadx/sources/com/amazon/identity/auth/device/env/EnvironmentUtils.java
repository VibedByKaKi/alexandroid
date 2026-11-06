package com.amazon.identity.auth.device.env;

import android.content.Context;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.identity.auth.device.a4;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.s0;
import com.amazon.identity.auth.device.yf;
import com.amazon.identity.mobi.common.env.MAPCommonEnvironmentUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class EnvironmentUtils implements MAPCommonEnvironmentUtils {
    static final Map<String, String> ASSOC_HANDLE_MAP = new HashMap();
    static final Map<String, String> DOMAIN_PANDA_ENDPOINT_MAP;
    public static final int HTTPS_PORT = 443;
    public static final String HTTPS_PROTOCOL = "https";
    private static final String TAG = "EnvironmentUtils";
    static volatile EnvironmentUtils sInstance;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Environment {
        prod
    }

    static {
        HashMap hashMap = new HashMap();
        DOMAIN_PANDA_ENDPOINT_MAP = hashMap;
        sInstance = new a();
        hashMap.put(".amazon.com", ".amazon.com");
        hashMap.put(".amazon.ca", ".amazon.ca");
        hashMap.put(".amazon.com.br", ".amazon.com.br");
        hashMap.put(".amazon.com.mx", ".amazon.com.mx");
        hashMap.put(".amazon.com.co", ".amazon.com.co");
        hashMap.put(".amazon.cl", ".amazon.cl");
        hashMap.put(".amazon.com.au", ".amazon.com.au");
        hashMap.put(".amazon.co.jp", ".amazon.co.jp");
        hashMap.put(".amazon.com.sg", ".amazon.co.jp");
        hashMap.put(".amazon.sg", ".amazon.co.jp");
        hashMap.put(".amazon.co.th", ".amazon.co.jp");
        hashMap.put(".amazon.co.id", ".amazon.co.jp");
        hashMap.put(".amazon.cn", ".amazon.cn");
        hashMap.put(".amazon.nl", ".amazon.nl");
        hashMap.put(".amazon.it", ".amazon.it");
        hashMap.put(".amazon.de", ".amazon.de");
        hashMap.put(".amazon.co.uk", ".amazon.co.uk");
        hashMap.put(".amazon.es", ".amazon.es");
        hashMap.put(".amazon.fr", ".amazon.fr");
        hashMap.put(".amazon.in", ".amazon.in");
        hashMap.put(".amazon.com.tr", ".amazon.co.uk");
        hashMap.put(".amazon.eg", ".amazon.co.uk");
        hashMap.put(".amazon.ae", ".amazon.co.uk");
        hashMap.put(".amazon.sa", ".amazon.co.uk");
        hashMap.put(".amazon.se", ".amazon.co.uk");
        hashMap.put(".amazon.pl", ".amazon.co.uk");
        hashMap.put(".amazon.com.ng", ".amazon.co.uk");
        hashMap.put(".amazon.co.za", ".amazon.co.uk");
        hashMap.put(".amazon.com.be", ".amazon.co.uk");
        hashMap.put(".amazon.ie", ".amazon.co.uk");
    }

    public static EnvironmentUtils getInstance() {
        return sInstance;
    }

    public static boolean isCurrentEnvironmentProd() {
        return true;
    }

    public static void toggleEnvironment(Context context) {
        toggleEnvironmentTo(Environment.prod);
    }

    public static void toggleEnvironmentTo(Environment environment) {
        sInstance = new a();
    }

    public abstract String getAmazonCNDomain();

    @Override // com.amazon.identity.mobi.common.env.MAPCommonEnvironmentUtils
    public String getAmazonHostFromPartialDomain(String str) {
        return getAuthPortalHostFromPartialDomain(str);
    }

    public abstract String getAmazonJPDomain();

    public abstract String getAmazonUKDomain();

    public abstract String getAmazonUSDomain();

    public String getAuthPortalHost(Bundle bundle) {
        String authPortalHostFromBundle = getAuthPortalHostFromBundle(bundle);
        return !TextUtils.isEmpty(authPortalHostFromBundle) ? authPortalHostFromBundle : getAuthPortalHostFromPartialDomain(a4.a(bundle));
    }

    public abstract String getAuthPortalHostFromBundle(Bundle bundle);

    public abstract String getAuthPortalHostFromPartialDomain(String str);

    public abstract int getAuthPortalPort();

    public String getClientPassedAuthPortalHost(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString(MAPAccountManager.KEY_SIGN_IN_ENDPOINT);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    public abstract String getCompleteAuthPortalEndpoint(Bundle bundle);

    public abstract Environment getCurrentEnvironment();

    public abstract String getDCAHost();

    public abstract String getDefaultAmazonDomain();

    public String getDefaultAssocHandle(String str) {
        return ASSOC_HANDLE_MAP.get(str);
    }

    public abstract String getDomainWithoutWWW(String str);

    public abstract String getFIRSHost();

    public abstract String getPVTinyURLPatternString();

    public String getPandaDomainHeader(Bundle bundle) {
        Bundle bundle2;
        if (bundle != null && (bundle2 = bundle.getBundle(MAPAccountManager.KEY_MARKETPLACE_BUNDLE)) != null) {
            String string = bundle2.getString(MAPAccountManager.KEY_MARKETPLACE_DOMAIN);
            if (!TextUtils.isEmpty(string)) {
                Log.i(yf.a(TAG), s0.a("Using client passed marketplace domain root: ", string));
                return string;
            }
        }
        return getPandaDomainHeader(a4.a(bundle));
    }

    public String getPandaEndpointDomain(String str) {
        if (TextUtils.isEmpty(str)) {
            return getAmazonUSDomain();
        }
        String domainWithoutWWW = getDomainWithoutWWW(str);
        Map<String, String> map = DOMAIN_PANDA_ENDPOINT_MAP;
        if (map.containsKey(domainWithoutWWW)) {
            return map.get(domainWithoutWWW);
        }
        return null;
    }

    public abstract String getPandaHost(String str);

    public abstract int getPandaPort();

    public URL getPandaURL(String str, String str2) throws MalformedURLException {
        return new URL("https", str, getPandaPort(), str2);
    }

    @Override // com.amazon.identity.mobi.common.env.MAPCommonEnvironmentUtils
    public void handleWebViewReceivedSslError(WebViewClient webViewClient, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public abstract boolean startWithPandaPrefix(String str);

    public String getPandaDomainHeader(String str) {
        return getPandaHost(str);
    }
}
