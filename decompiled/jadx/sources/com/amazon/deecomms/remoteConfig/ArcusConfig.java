package com.amazon.deecomms.remoteConfig;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.R;
import com.amazon.deecomms.api.MarketplaceUtils;
import com.amazon.deecomms.api.metrics.CounterMetric;
import com.amazon.deecomms.auth.Stage;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.metrics.MetricsHelper;
import com.amazon.deecomms.common.util.FileUtils;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazonaws.mobileconnectors.remoteconfiguration.Attributes;
import com.amazonaws.mobileconnectors.remoteconfiguration.RemoteConfigurationManager;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class ArcusConfig {
    private static final String KEY_RULES = "_rules";
    private static final String KEY_RULE_ENV = "environment";
    private static final String KEY_SEGMENT = "segment";
    private static final String KEY_SEGMENTS = "segments";
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ArcusConfig.class);
    public static final String PATH_SEPARATOR = "\\.";
    private static final String SEGMENT_KEY_ENV = "environment";
    private static final String SEGMENT_KEY_PLATFORM = "platform";
    private static final String SEGMENT_VALUE_PLATFORM = "android";
    private static final String VAR_DEFAULT = "Default";
    private static final String VAR_PFM = "${PFM}";
    private Context context;
    private JSONObject localConfig;
    private Stage stage;

    public ArcusConfig(@NonNull Context context, @NonNull Stage stage) {
        this.context = context;
        this.stage = stage;
        getLocalConfig();
        getRemoteConfig();
    }

    @Nullable
    private Object getCloudConfigObject(@NonNull String... strArr) {
        try {
            return getObjectFromJson(RemoteConfigurationManager.getInstance(this.stage.getArcusConfigId()).openConfiguration().getAsJsonObject(), strArr);
        } catch (RuntimeException e) {
            CounterMetric generateOperational = CounterMetric.generateOperational(MetricKeys.ARCUS_OPEN_CONFIG_FAIL);
            generateOperational.getMetadata().put("source", "ArcusConfig");
            generateOperational.getMetadata().put("errorSource", e.getClass().getSimpleName());
            MetricsHelper.recordSingleOccurrence(generateOperational);
            return null;
        }
    }

    @Nullable
    private Object getConfigObject(@NonNull String... strArr) {
        Object cloudConfigObject;
        boolean pathContainsDefaultableVariable = pathContainsDefaultableVariable(strArr);
        String[] replaceVariablesInPath = replaceVariablesInPath(false, strArr);
        String[] replaceVariablesInPath2 = replaceVariablesInPath(true, strArr);
        try {
            Object cloudConfigObject2 = getCloudConfigObject(replaceVariablesInPath);
            if (cloudConfigObject2 != null) {
                return cloudConfigObject2;
            }
            if (pathContainsDefaultableVariable && (cloudConfigObject = getCloudConfigObject(replaceVariablesInPath2)) != null) {
                return cloudConfigObject;
            }
            Object localObjectValue = getLocalObjectValue(replaceVariablesInPath);
            if (localObjectValue != null) {
                return localObjectValue;
            }
            if (pathContainsDefaultableVariable) {
                return getLocalObjectValue(replaceVariablesInPath2);
            }
            return null;
        } catch (NullPointerException e) {
            LOG.e("getting config resulted in a null pointer", e);
            return null;
        }
    }

    private void getLocalConfig() {
        LOG.i("Initializing default config values");
        this.localConfig = FileUtils.readJsonFile(this.context, R.raw.default_config);
    }

    @Nullable
    private static Object getObjectFromJson(@NonNull JSONObject jSONObject, @NonNull String... strArr) {
        for (int i = 0; i < strArr.length - 1; i++) {
            try {
                jSONObject = jSONObject.getJSONObject(strArr[i]);
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject.opt(strArr[strArr.length - 1]);
    }

    private void getRemoteConfig() {
        try {
            Attributes openAttributes = RemoteConfigurationManager.forAppId(this.context, this.stage.getArcusConfigId()).createOrGet().openAttributes();
            openAttributes.addAttribute("platform", SEGMENT_VALUE_PLATFORM);
            openAttributes.addAttribute("environment", this.stage.getArcusEquivalentStage().toLowerCase());
        } catch (RuntimeException e) {
            CounterMetric generateOperational = CounterMetric.generateOperational(MetricKeys.ARCUS_LOAD_FAIL);
            generateOperational.getMetadata().put("source", e.getClass().getSimpleName());
            generateOperational.getMetadata().put("errorSource", MetricKeys.VALUE_ARCUS_FAILED_TO_INITIALIZE_EXCEPTION);
            MetricsHelper.recordSingleOccurrence(generateOperational);
        }
    }

    private boolean isSegmentSatisfyRules(@NonNull JSONObject jSONObject) {
        String optString;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(KEY_RULES);
            if (jSONObject2 == null || (optString = jSONObject2.optString("environment", null)) == null) {
                return true;
            }
            return optString.equalsIgnoreCase(this.stage.name());
        } catch (JSONException unused) {
            return false;
        }
    }

    private boolean pathContainsDefaultableVariable(@NonNull String... strArr) {
        for (String str : strArr) {
            if (VAR_PFM.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    private String[] replaceVariablesInPath(boolean z, @NonNull String... strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (!VAR_PFM.equals(strArr[i])) {
                strArr2[i] = strArr[i];
            } else if (z) {
                strArr2[i] = "Default";
            } else {
                strArr2[i] = MarketplaceUtils.getCommsSupportedPFM(CommsDaggerWrapper.getComponent().getCommsIdentityManager().getPreferredMarketplace(false));
            }
        }
        return strArr2;
    }

    @Nullable
    private Integer toInteger(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            return Integer.valueOf((int) Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    private static String toString(@Nullable Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public Integer getConfigInteger(@NonNull String str) {
        return toInteger(getConfigObject(str.split(PATH_SEPARATOR)));
    }

    public String getConfigString(@NonNull String str) {
        return toString(getConfigObject(str.split(PATH_SEPARATOR)));
    }

    public Set<String> getConfigValueSet(@NonNull String str) {
        String configString = getConfigString(str);
        return configString == null ? new HashSet() : new HashSet(Arrays.asList(configString.split(",")));
    }

    @Nullable
    public Object getLocalObjectValue(@NonNull String... strArr) {
        Object objectFromJson;
        try {
            JSONArray jSONArray = this.localConfig.getJSONArray(KEY_SEGMENTS);
            for (int length = jSONArray.length() - 1; length >= 0; length--) {
                JSONObject jSONObject = jSONArray.getJSONObject(length);
                if (isSegmentSatisfyRules(jSONObject) && (objectFromJson = getObjectFromJson(jSONObject.getJSONObject(KEY_SEGMENT), strArr)) != null) {
                    return objectFromJson;
                }
            }
            LOG.w("client asked for a value with an unknown key: " + Arrays.toString(strArr));
        } catch (JSONException unused) {
        }
        return null;
    }

    public Integer getConfigInteger(@NonNull String... strArr) {
        return toInteger(getConfigObject(strArr));
    }

    public String getConfigString(@NonNull String... strArr) {
        return toString(getConfigObject(strArr));
    }

    @NonNull
    public String[] replaceVariablesInPath(@NonNull String... strArr) {
        return replaceVariablesInPath(false, strArr);
    }

    @Nullable
    public Object getConfigObject(String str) {
        return getConfigObject(str.split(PATH_SEPARATOR));
    }
}
