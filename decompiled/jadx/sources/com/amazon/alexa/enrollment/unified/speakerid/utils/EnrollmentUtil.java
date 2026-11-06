package com.amazon.alexa.enrollment.unified.speakerid.utils;

import android.text.TextUtils;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.protocols.environment.EnvironmentService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class EnrollmentUtil {
    private static final String EMPTY_STRING = "";
    private static final String HTTPS_STRING = "https://";
    private static final String NA_PROD_ALEXA_API_ENDPOINT = "https://api.amazonalexa.com";
    private static final String TAG = "EnrollmentUtil";

    private EnrollmentUtil() {
    }

    public static String getAlexaAPIEndpoint(EnvironmentService environmentService) {
        String apiGatewayEndpoint = environmentService.getApiGatewayEndpoint();
        if (TextUtils.isEmpty(apiGatewayEndpoint != null ? apiGatewayEndpoint.replace(HTTPS_STRING, "") : "")) {
            Log.e(TAG, "Unable to fetch Alexa API endpoint and defaulting to NA endpoint");
            return "https://api.amazonalexa.com";
        }
        Log.i(TAG, "Fetched the Alexa API endpoint " + apiGatewayEndpoint);
        return apiGatewayEndpoint;
    }
}
