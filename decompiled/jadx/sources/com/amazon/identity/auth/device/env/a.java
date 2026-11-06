package com.amazon.identity.auth.device.env;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.identity.auth.device.d0;
import com.amazon.identity.auth.device.env.EnvironmentUtils;
import com.amazon.identity.auth.device.yf;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a extends EnvironmentUtils {
    static {
        Map<String, String> map = EnvironmentUtils.ASSOC_HANDLE_MAP;
        map.put("www.amazon.com.mx", "amzn_device_mx");
        map.put("www.amazon.co.uk", "amzn_device_uk");
        map.put("www.amazon.ca", "amzn_device_ca");
        map.put("www.amazon.de", "amzn_device_de");
        map.put("www.amazon.fr", "amzn_device_fr");
        map.put("www.amazon.it", "amzn_device_it");
        map.put("www.amazon.in", "amzn_device_in");
        map.put("www.amazon.es", "amzn_device_es");
        map.put("www.amazon.co.jp", "amzn_device_jp");
        map.put("www.amazon.com.br", "amzn_device_br");
        map.put("www.amazon.nl", "amzn_device_nl");
        map.put("www.amazon.com.au", "amzn_device_au");
        map.put("www.amazon.com.sa", "amzn_device_sa");
        map.put("www.amazon.ae", "amzn_device_ae");
        map.put("www.amazon.se", "amzn_device_se");
        map.put("www.amazon.pl", "amzn_device_pl");
        map.put("www.amazon.com.co", "amzn_device_co");
        map.put("www.amazon.cl", "amzn_device_cl");
        map.put("www.amazon.com.ng", "amzn_device_ng");
        map.put("www.amazon.co.za", "amzn_device_za");
        map.put("www.amazon.com.be", "amzn_device_be");
        map.put("www.amazon.ie", "amzn_device_ie");
        map.put("www.amazon.co.th", "amzn_device_th");
        map.put("www.amazon.co.id", "amzn_device_id");
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getAmazonCNDomain() {
        return ".amazon.cn";
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getAmazonJPDomain() {
        return ".amazon.co.jp";
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getAmazonUKDomain() {
        return ".amazon.co.uk";
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getAmazonUSDomain() {
        return ".amazon.com";
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getAuthPortalHostFromBundle(Bundle bundle) {
        return getClientPassedAuthPortalHost(bundle);
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getAuthPortalHostFromPartialDomain(String str) {
        if (TextUtils.isEmpty(str)) {
            yf.a("ProdUtils");
            "user".equalsIgnoreCase(Build.TYPE);
            return "www.amazon.com";
        }
        if (str.startsWith(".")) {
            return "www".concat(str);
        }
        if (str.startsWith("amazon.")) {
            return "www.".concat(str);
        }
        if (str.startsWith("www")) {
            return str;
        }
        Single$$ExternalSyntheticBUOutline0.m(d0.a("Input was non-empty and doesn't look like a valid partial domain in production: ", str, ". If you were attempting to hit devo or pre-prod, please try following the steps to switch again."));
        return null;
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final int getAuthPortalPort() {
        return 443;
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getCompleteAuthPortalEndpoint(Bundle bundle) {
        return getAuthPortalHost(bundle);
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final EnvironmentUtils.Environment getCurrentEnvironment() {
        return EnvironmentUtils.Environment.prod;
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getDCAHost() {
        return "dcape-na.amazon.com";
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getDefaultAmazonDomain() {
        return "www.amazon.com";
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getDomainWithoutWWW(String str) {
        return str.startsWith("www.") ? str.substring(3) : !str.startsWith(".") ? ".".concat(str) : str;
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getFIRSHost() {
        return "firs-ta-g7g.amazon.com";
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getPVTinyURLPatternString() {
        return "(https:\\/\\/|http:\\/\\/)?(z\\.cn|amzn\\.asia|a\\.co|amzn\\.co|amzn\\.eu)\\/\\S*#verify";
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final String getPandaHost(String str) {
        if (TextUtils.isEmpty(str)) {
            yf.a("ProdUtils");
            "user".equalsIgnoreCase(Build.TYPE);
            return "api.amazon.com";
        }
        if (str.startsWith(".")) {
            return DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY.concat(str);
        }
        if (str.startsWith("amazon.")) {
            return "api.".concat(str);
        }
        if (str.startsWith("api.")) {
            return str;
        }
        if (str.startsWith("www")) {
            return DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY.concat(str.substring(3));
        }
        Single$$ExternalSyntheticBUOutline0.m(d0.a("Input was non-empty and doesn't look like a valid partial domain in production: ", str, ". If you were attempting to hit devo or pre-prod, please try following the steps to switch again."));
        return null;
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final int getPandaPort() {
        return 443;
    }

    @Override // com.amazon.identity.auth.device.env.EnvironmentUtils
    public final boolean startWithPandaPrefix(String str) {
        return str.matches("api.amazon.*");
    }
}
