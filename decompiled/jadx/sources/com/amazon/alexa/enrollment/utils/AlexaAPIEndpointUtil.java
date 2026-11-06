package com.amazon.alexa.enrollment.utils;

import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaAPIEndpointUtil {
    private static final String EU_DEVO_ALEXA_ENDPOINT = "https://api-amazonalexa-eu.integ.amazon.com";
    private static final String EU_GAMMA_ALEXA_ENDPOINT = "https://api-amazonalexa-gamma-eu-dub.dub.proxy.amazon.com";
    private static final String EU_PROD_ALEXA_ENDPOINT = "https://api.eu.amazonalexa.com";
    private static final String EU_REGION = "EU";
    private static final String FE_DEVO_ALEXA_ENDPOINT = "https://api-amazonalexa-fe.integ.amazon.com";
    private static final String FE_GAMMA_ALEXA_ENDPOINT = "https://api-amazonalexa-gamma-fe-pdx.pdx.proxy.amazon.com";
    private static final String FE_PROD_ALEXA_ENDPOINT = "https://api.fe.amazonalexa.com";
    private static final String FE_REGION = "FE";
    private static final String NA_DEVO_ALEXA_ENDPOINT = "https://api-amazonalexa.integ.amazon.com";
    private static final String NA_GAMMA_ALEXA_ENDPOINT = "https://api-amazonalexa-gamma.amazon.com";
    private static final String NA_PROD_ALEXA_ENDPOINT = "https://api.amazonalexa.com";
    private static final String NA_REGION = "NA";
    private static final String TAG = "VoxEn_AlexaAPIEndpointUtil";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum APIEndPoint {
        NA_ALPHA("https://api-amazonalexa.integ.amazon.com"),
        NA_BETA("https://api-amazonalexa.integ.amazon.com"),
        NA_GAMMA("https://api-amazonalexa-gamma.amazon.com"),
        NA_PROD("https://api.amazonalexa.com"),
        EU_ALPHA("https://api-amazonalexa-eu.integ.amazon.com"),
        EU_BETA("https://api-amazonalexa-eu.integ.amazon.com"),
        EU_GAMMA("https://api-amazonalexa-gamma-eu-dub.dub.proxy.amazon.com"),
        EU_PROD("https://api.eu.amazonalexa.com"),
        FE_ALPHA("https://api-amazonalexa-fe.integ.amazon.com"),
        FE_BETA("https://api-amazonalexa-fe.integ.amazon.com"),
        FE_GAMMA("https://api-amazonalexa-gamma-fe-pdx.pdx.proxy.amazon.com"),
        FE_PROD("https://api.fe.amazonalexa.com");

        private final String endPoint;

        APIEndPoint(String str) {
            this.endPoint = str;
        }

        public static APIEndPoint fromRegionAndStage(String str) {
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                Log.e(AlexaAPIEndpointUtil.TAG, "Invalid region" + str);
                return NA_PROD;
            }
        }

        public String getEndPoint() {
            return this.endPoint;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum CountryCodeToRegion {
        US("NA"),
        CA("NA"),
        MX("NA"),
        BR("NA"),
        ES("EU"),
        DE("EU"),
        FR("EU"),
        IT("EU"),
        IN("EU"),
        GB("EU"),
        AU(AlexaAPIEndpointUtil.FE_REGION),
        JP(AlexaAPIEndpointUtil.FE_REGION);

        private final String region;

        CountryCodeToRegion(String str) {
            this.region = str;
        }

        public static CountryCodeToRegion fromCountryCodeName(String str) {
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                Log.e(AlexaAPIEndpointUtil.TAG, "Invalid country code " + str);
                return US;
            }
        }

        public String getRegion() {
            return this.region;
        }
    }

    public String getEndpoint(String str, String str2) {
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(CountryCodeToRegion.fromCountryCodeName(str).getRegion(), "_");
        m1m.append(str2.toUpperCase());
        return APIEndPoint.fromRegionAndStage(m1m.toString()).getEndPoint();
    }
}
