package com.bugsnag.android;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.EndpointsBundleKeys;
import com.bugsnag.android.internal.ImmutableConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ConfigSerializer implements MapSerializer<ImmutableConfig> {
    private Collection<String> serializeBreadrumbTypes(ImmutableConfig immutableConfig) {
        Set<BreadcrumbType> enabledBreadcrumbTypes = immutableConfig.getEnabledBreadcrumbTypes();
        if (enabledBreadcrumbTypes == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Iterator<BreadcrumbType> it2 = enabledBreadcrumbTypes.iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getType());
        }
        return hashSet;
    }

    private Map<String, Object> serializeEndpoints(ImmutableConfig immutableConfig) {
        HashMap hashMap = new HashMap();
        EndpointConfiguration endpoints = immutableConfig.getEndpoints();
        hashMap.put("notify", endpoints.getNotify());
        hashMap.put("sessions", endpoints.getSessions());
        return hashMap;
    }

    private Map<String, Object> serializeErrorTypes(ImmutableConfig immutableConfig) {
        HashMap hashMap = new HashMap();
        ErrorTypes enabledErrorTypes = immutableConfig.getEnabledErrorTypes();
        hashMap.put("anrs", Boolean.valueOf(enabledErrorTypes.getAnrs()));
        hashMap.put("ndkCrashes", Boolean.valueOf(enabledErrorTypes.getNdkCrashes()));
        hashMap.put("unhandledExceptions", Boolean.valueOf(enabledErrorTypes.getUnhandledExceptions()));
        hashMap.put("unhandledRejections", Boolean.valueOf(enabledErrorTypes.getUnhandledRejections()));
        return hashMap;
    }

    /* renamed from: serialize, reason: avoid collision after fix types in other method */
    public void serialize2(Map<String, Object> map, ImmutableConfig immutableConfig) {
        map.put("apiKey", immutableConfig.getApiKey());
        map.put("autoDetectErrors", Boolean.valueOf(immutableConfig.getAutoDetectErrors()));
        map.put("autoTrackSessions", Boolean.valueOf(immutableConfig.getAutoTrackSessions()));
        map.put("sendThreads", immutableConfig.getSendThreads().toString());
        map.put("discardClasses", immutableConfig.getDiscardClasses());
        map.put("projectPackages", immutableConfig.getProjectPackages());
        map.put("enabledReleaseStages", immutableConfig.getEnabledReleaseStages());
        map.put("releaseStage", immutableConfig.getReleaseStage());
        map.put("buildUuid", immutableConfig.getBuildUuid());
        if (immutableConfig.getAppVersion() != null) {
            map.put("appVersion", immutableConfig.getAppVersion());
        }
        map.put("versionCode", immutableConfig.getVersionCode());
        map.put("type", immutableConfig.getAppType());
        map.put("persistUser", Boolean.valueOf(immutableConfig.getPersistUser()));
        map.put("launchCrashThresholdMs", Integer.valueOf((int) immutableConfig.getLaunchDurationMillis()));
        map.put("maxBreadcrumbs", Integer.valueOf(immutableConfig.getMaxBreadcrumbs()));
        map.put("enabledBreadcrumbTypes", serializeBreadrumbTypes(immutableConfig));
        map.put("enabledErrorTypes", serializeErrorTypes(immutableConfig));
        map.put(EndpointsBundleKeys.ENDPOINTS, serializeEndpoints(immutableConfig));
    }

    @Override // com.bugsnag.android.MapSerializer
    public /* bridge */ /* synthetic */ void serialize(Map map, ImmutableConfig immutableConfig) {
        serialize2((Map<String, Object>) map, immutableConfig);
    }
}
