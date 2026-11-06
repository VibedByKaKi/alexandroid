package com.amazon.alexa.presence.bleconn.identity.clients;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.presence.Presence;
import com.amazon.alexa.presence.utils.MetricsUtil;
import com.dee.app.http.CoralService;
import com.dee.app.http.CoralServiceException;
import com.dee.app.metrics.MetricsServiceV2;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class AwssClient {
    private static final String GET_SETTINGS_FOR_PERSON_PARAMETERIZED_URL = "/api/person/settings?principalType=persons;principalId=<personId>;settingKeys=Alexa.Identity.Recognition.phoneId";
    private static final String PHONE_ID_ENABLED = "ENABLED";
    private static final String PHONE_ID_SETTINGS_KEY = "Alexa.Identity.Recognition.phoneId";
    private final CoralService coralService;
    private final MetricsServiceV2 metricsService;
    private final Mobilytics mobilytics;
    private static final String TAG = Presence.tag();
    private static final Gson GSON = new Gson();

    @Inject
    public AwssClient(MetricsServiceV2 metricsServiceV2, Mobilytics mobilytics) {
        this.coralService = (CoralService) Automotive$$ExternalSyntheticOutline0.m(CoralService.class);
        this.metricsService = metricsServiceV2;
        this.mobilytics = mobilytics;
    }

    private String getAwssGetSettingsForPersonUrl(String str) {
        return GET_SETTINGS_FOR_PERSON_PARAMETERIZED_URL.replaceAll("<personId>", str);
    }

    private String getPhoneIdSettingValue(String str) {
        try {
            return ((JsonObject) GSON.fromJson(this.coralService.request(getAwssGetSettingsForPersonUrl(str)).get().asRaw().execute().body().string(), JsonObject.class)).get("settings").getAsJsonObject().get(PHONE_ID_SETTINGS_KEY).toString();
        } catch (CoralServiceException unused) {
            Log.w(TAG, "Failed retrieve phone ID settings from AWSS due to coral service excepti");
            return "";
        } catch (IOException unused2) {
            Log.w(TAG, "Failed to deserialize the response body");
            return "";
        } catch (Throwable unused3) {
            Log.w(TAG, "Failed to retrieve setting, return null");
            return "";
        }
    }

    public boolean isPhoneIdEnabled(String str) {
        String replaceAll = getPhoneIdSettingValue(str).replaceAll("\"|\\\\", "");
        if (replaceAll != null && !replaceAll.isEmpty()) {
            return replaceAll.equalsIgnoreCase("ENABLED");
        }
        Log.w(TAG, "Failed to get Phone ID setting value, setting as disabled");
        MetricsUtil.recordCount(this.metricsService, this.mobilytics, "presence", MetricsUtil.Method.AWSS_FAILED_TO_RETRIEVE_PHONE_ID_SETTING);
        return false;
    }

    @VisibleForTesting
    public AwssClient(CoralService coralService, MetricsServiceV2 metricsServiceV2, Mobilytics mobilytics) {
        this.coralService = coralService;
        this.metricsService = metricsServiceV2;
        this.mobilytics = mobilytics;
    }
}
