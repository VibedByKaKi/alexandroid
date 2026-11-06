package com.amazon.alexa.wakeword.davs;

import com.amazon.alexa.utils.validation.Assertions;
import com.amazon.dee.app.services.environment.Endpoints;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SpeakerVerificationModelArtifactInfo extends ArtifactInfo {
    private static final String ARTIFACT_KEY = "speaker-verification-model";
    private static final String ARTIFACT_TYPE = "lowpower-speaker-verification";
    private static final Map<String, List<String>> DEFAULT_FILTERS;
    private static final List<String> ENGINE_COMPAT_ID_LIST_VALUE;
    private static final String FILTER_KEY_ENGINE_COMPATIBILITY_ID_LIST = "engineCompatibilityIdList";
    private static final String FILTER_KEY_FILTER_VERSION = "filterVersion";
    private static final String FILTER_KEY_LOCALE = "locale";
    private static final String FILTER_KEY_USE_CASE = "useCase";
    private static final String FILTER_KEY_WAKEWORD1 = "wakeword1";
    private final String locale;

    static {
        List<String> singletonList = Collections.singletonList(Endpoints.CURRENT_SCHEMA_VERSION);
        ENGINE_COMPAT_ID_LIST_VALUE = singletonList;
        HashMap hashMap = new HashMap();
        DEFAULT_FILTERS = hashMap;
        hashMap.put(FILTER_KEY_USE_CASE, Collections.singletonList("SV_1400K-far-field-standalone-arm"));
        hashMap.put(FILTER_KEY_ENGINE_COMPATIBILITY_ID_LIST, singletonList);
        hashMap.put(FILTER_KEY_FILTER_VERSION, Collections.singletonList("2"));
        hashMap.put(FILTER_KEY_WAKEWORD1, Collections.singletonList("alexa"));
    }

    @Deprecated
    public SpeakerVerificationModelArtifactInfo(String str) {
        super(ARTIFACT_TYPE, ARTIFACT_KEY);
        Assertions.notEmpty(str, "locale is empty");
        this.locale = str;
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactInfo
    public Map<String, List<String>> getDavsFilters() {
        HashMap hashMap = new HashMap(DEFAULT_FILTERS);
        hashMap.put("locale", Collections.singletonList(this.locale));
        return Collections.unmodifiableMap(hashMap);
    }

    public String getEngineCompatibilityId() {
        return ENGINE_COMPAT_ID_LIST_VALUE.get(0);
    }

    public String getLocale() {
        return this.locale;
    }
}
