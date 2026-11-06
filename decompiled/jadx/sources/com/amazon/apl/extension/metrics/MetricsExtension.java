package com.amazon.apl.extension.metrics;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.ExtensionCommandDefinition;
import com.amazon.apl.android.ExtensionEventHandler;
import com.amazon.apl.android.LegacyLocalExtension;
import com.amazon.apl.android.dependencies.IExtensionEventCallback;
import com.amazon.apl.android.providers.ITelemetryProvider;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MetricsExtension extends LegacyLocalExtension {
    private static final String DEFAULT_APPLICATION_ID = "APL-Android-MetricsExtension";
    private static final String ENVIRONMENT_MAX_METRIC_ID = "maxMetricIdAllowed";
    private static final String SETTING_APPLICATION_ID = "applicationId";
    private static final String SETTING_EXPERIENCE_ID = "experienceId";
    private static final String TAG = "MetricsExtension";
    public static final String URI = "aplext:metrics:10";
    private String mApplicationId;
    private String mExperienceId;
    private int mMaxMetricIdAllowed = 25;

    @NonNull
    private String mMetricDomain;
    private int mMetricIdCounter;

    @NonNull
    private final ITelemetryProvider mTelemetryProvider;

    @Deprecated
    public MetricsExtension(@NonNull ITelemetryProvider iTelemetryProvider, @Nullable Map<String, Object> map) {
        this.mTelemetryProvider = iTelemetryProvider;
        this.mApplicationId = getStringSetting(map, SETTING_APPLICATION_ID, DEFAULT_APPLICATION_ID);
        String stringSetting = getStringSetting(map, "experienceId", "");
        this.mExperienceId = stringSetting;
        boolean isEmpty = TextUtils.isEmpty(stringSetting);
        String str = this.mApplicationId;
        if (!isEmpty) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ".");
            m1m.append(this.mExperienceId);
            str = m1m.toString();
        }
        this.mMetricDomain = str;
    }

    private int getMetricId(@NonNull String str) {
        return this.mTelemetryProvider.getMetricId(this.mMetricDomain, str);
    }

    private int getOrCreateMetricId(@NonNull String str, ITelemetryProvider.Type type) {
        int metricId = getMetricId(str);
        if (metricId != -1 || this.mMetricIdCounter >= this.mMaxMetricIdAllowed) {
            return metricId;
        }
        int createMetricId = this.mTelemetryProvider.createMetricId(this.mMetricDomain, str, type);
        this.mMetricIdCounter++;
        return createMetricId;
    }

    @Nullable
    private <T> T getPropertyValue(Map<String, Object> map, String str, Class<T> cls) {
        try {
            Object obj = map.get(str);
            if (obj == null) {
                return null;
            }
            return cls.cast(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    private String getStringSetting(@Nullable Map<String, Object> map, @NonNull String str, @NonNull String str2) {
        Object obj;
        return (map == null || map.isEmpty() || (obj = map.get(str)) == null || !(obj instanceof String)) ? str2 : (String) obj;
    }

    private void incrementCounter(@NonNull String str, int i) {
        this.mTelemetryProvider.incrementCount(getOrCreateMetricId(str, ITelemetryProvider.Type.COUNTER), i);
    }

    private void startTimer(@NonNull String str) {
        this.mTelemetryProvider.startTimer(getOrCreateMetricId(str, ITelemetryProvider.Type.TIMER));
    }

    private void stopTimer(@NonNull String str) {
        int metricId = getMetricId(str);
        if (metricId == -1) {
            return;
        }
        this.mTelemetryProvider.stopTimer(metricId);
    }

    @Override // com.amazon.apl.android.ILegacyLocalExtension
    public void applySettings(Map<String, Object> map) {
        this.mApplicationId = getStringSetting(map, SETTING_APPLICATION_ID, DEFAULT_APPLICATION_ID);
        String stringSetting = getStringSetting(map, "experienceId", "");
        this.mExperienceId = stringSetting;
        boolean isEmpty = TextUtils.isEmpty(stringSetting);
        String str = this.mApplicationId;
        if (!isEmpty) {
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ".");
            m1m.append(this.mExperienceId);
            str = m1m.toString();
        }
        this.mMetricDomain = str;
    }

    public String getApplicationId() {
        return this.mApplicationId;
    }

    @Override // com.amazon.apl.android.providers.IExtension
    @NonNull
    public List<ExtensionCommandDefinition> getCommandDefinitions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ExtensionCommandDefinition(URI, "IncrementCounter").allowFastMode(true).property("metricId", "", true).property("amount", 1, false));
        arrayList.add(new ExtensionCommandDefinition(URI, "StartTimer").allowFastMode(true).property("metricId", "", true));
        arrayList.add(new ExtensionCommandDefinition(URI, "StopTimer").allowFastMode(true).property("metricId", "", true));
        return arrayList;
    }

    @Override // com.amazon.apl.android.providers.IExtension
    @Nullable
    public Object getEnvironment() {
        HashMap hashMap = new HashMap();
        hashMap.put(ENVIRONMENT_MAX_METRIC_ID, Integer.valueOf(this.mMaxMetricIdAllowed));
        return hashMap;
    }

    @Override // com.amazon.apl.android.providers.IExtension
    @NonNull
    public List<ExtensionEventHandler> getEventHandlers() {
        return Collections.EMPTY_LIST;
    }

    public String getExperienceId() {
        return this.mExperienceId;
    }

    @Override // com.amazon.apl.android.providers.IExtension
    @NonNull
    public String getUri() {
        return URI;
    }

    @Override // com.amazon.apl.android.dependencies.IExtensionEventCallback
    public void onExtensionEvent(String str, String str2, Map<String, Object> map, Map<String, Object> map2, IExtensionEventCallback.IExtensionEventCallbackResult iExtensionEventCallbackResult) {
        if (TextUtils.isEmpty(str)) {
            Log.wtf(TAG, "Extension event has no name!");
        }
        if (TextUtils.isEmpty(str2) || !URI.equals(str2)) {
            Log.wtf(TAG, "Extension event has uri: " + str2 + ", but expected: aplext:metrics:10");
            return;
        }
        if (map2 == null || map2.isEmpty()) {
            Log.wtf(TAG, "Extension event has no properties!");
            return;
        }
        String str3 = (String) getPropertyValue(map2, "metricId", String.class);
        if (TextUtils.isEmpty(str3)) {
            Log.wtf(TAG, "For command: " + str + ", required \"name\" property is missing!");
            return;
        }
        str.getClass();
        switch (str) {
            case "IncrementCounter":
                Integer num = (Integer) getPropertyValue(map2, "amount", Integer.class);
                incrementCounter(str3, num != null ? num.intValue() : 1);
                break;
            case "StopTimer":
                stopTimer(str3);
                break;
            case "StartTimer":
                startTimer(str3);
                break;
        }
    }

    public void setMaxMetricIdAllowed(int i) {
        this.mMaxMetricIdAllowed = i;
    }

    @Override // com.amazon.apl.android.LegacyLocalExtension, com.amazon.apl.android.providers.IExtension
    public IExtensionEventCallback getCallback() {
        return this;
    }

    public MetricsExtension(@NonNull ITelemetryProvider iTelemetryProvider) {
        this.mTelemetryProvider = iTelemetryProvider;
    }
}
