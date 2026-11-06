package com.amazon.alexa.featurefeedbackservice.storage;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.configmanager.ConfigRefreshStatus;
import com.amazon.alexa.featurefeedbackservice.configuration.FeatureFeedbackServiceConfiguration;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazon.alexa.featurefeedbackservice.util.ValidationUtils;
import com.google.gson.Gson;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SharedPreferenceRepo {
    private static final String TAG = "SharedPreferenceRepo";
    private Context context;
    private Gson gson;

    @Inject
    public SharedPreferenceRepo(@NonNull Context context, @NonNull Gson gson) {
        ValidationUtils.validateNonNullObject("context", context);
        ValidationUtils.validateNonNullObject("gson", gson);
        this.context = context;
        this.gson = gson;
    }

    private <T> T getObject(String str, Class<T> cls) {
        String string = getString(str);
        if (string == null || string.length() <= 0) {
            return null;
        }
        return (T) this.gson.fromJson(string, (Class) cls);
    }

    private String getString(String str) {
        return this.context.getSharedPreferences(Constants.Storage.FEATURE_FEEDBACK_SERVICE_PREF_STORE, 0).getString(str, null);
    }

    private void setObject(String str, Object obj) {
        setString(str, this.gson.toJson(obj));
    }

    private void setString(String str, String str2) {
        this.context.getSharedPreferences(Constants.Storage.FEATURE_FEEDBACK_SERVICE_PREF_STORE, 0).edit().putString(str, str2).apply();
    }

    public FeatureFeedbackServiceConfiguration getConfig() {
        FeatureFeedbackServiceConfiguration featureFeedbackServiceConfiguration = (FeatureFeedbackServiceConfiguration) getObject(Constants.Storage.FEATURE_FEEDBACK_SERVICE_CONFIG_KEY, FeatureFeedbackServiceConfiguration.class);
        return featureFeedbackServiceConfiguration == null ? new FeatureFeedbackServiceConfiguration() : featureFeedbackServiceConfiguration;
    }

    public ConfigRefreshStatus getConfigRefreshStatus() {
        ConfigRefreshStatus configRefreshStatus = (ConfigRefreshStatus) getObject(Constants.Storage.CONFIG_REFRESH_STATUS_KEY, ConfigRefreshStatus.class);
        return configRefreshStatus == null ? new ConfigRefreshStatus() : configRefreshStatus;
    }

    public Long getLocalGuardrailTimestamp(String str) {
        if (getString(a$$ExternalSyntheticOutline0.m(Constants.Storage.FEATURE_FEEDBACK_SERVICE_LOCAL_GUARDRAILS_NAMESPACE, str)) == null) {
            return 0L;
        }
        try {
            return Long.valueOf(Long.parseLong(getString(Constants.Storage.FEATURE_FEEDBACK_SERVICE_LOCAL_GUARDRAILS_NAMESPACE + str)));
        } catch (NumberFormatException e) {
            Log.e(TAG, "Error parsing string from repo: " + e.getLocalizedMessage());
            return 0L;
        }
    }

    public void setConfig(FeatureFeedbackServiceConfiguration featureFeedbackServiceConfiguration) {
        setObject(Constants.Storage.FEATURE_FEEDBACK_SERVICE_CONFIG_KEY, featureFeedbackServiceConfiguration);
    }

    public void setConfigRefreshStatus(ConfigRefreshStatus configRefreshStatus) {
        setObject(Constants.Storage.CONFIG_REFRESH_STATUS_KEY, configRefreshStatus);
    }

    public void setLocalGuardrailTimestamp(String str, Long l) {
        setString(a$$ExternalSyntheticOutline0.m(Constants.Storage.FEATURE_FEEDBACK_SERVICE_LOCAL_GUARDRAILS_NAMESPACE, str), l.toString());
    }
}
