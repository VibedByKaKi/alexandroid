package com.amazon.alexa.client.alexaservice.features.offlineprompts;

import com.amazon.alexa.utils.validation.Assertions;
import com.amazon.alexa.wakeword.davs.ArtifactInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class OfflinePromptsArtifactInfo extends ArtifactInfo {
    private static final String ARTIFACT_KEY = "offline-prompts";
    private static final String ARTIFACT_TYPE = "alexa-voice-sdk";
    private static final Map<String, List<String>> DEFAULT_FILTERS;
    private static final String DEVICE_TYPE = "A2TF17PFR55MTB";
    private static final String FILTER_KEY_DEVICE_TYPE = "deviceType";
    private static final String FILTER_KEY_FILTER_VERSION = "filterVersion";
    private static final String FILTER_KEY_LOCALE = "locale";
    private final String locale;

    static {
        HashMap hashMap = new HashMap();
        DEFAULT_FILTERS = hashMap;
        hashMap.put("deviceType", Collections.singletonList("A2TF17PFR55MTB"));
        hashMap.put(FILTER_KEY_FILTER_VERSION, Collections.singletonList("1"));
    }

    public OfflinePromptsArtifactInfo(String str) {
        super("alexa-voice-sdk", "offline-prompts");
        Assertions.notEmpty(str, "locale is empty");
        this.locale = str;
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactInfo
    public Map<String, List<String>> getDavsFilters() {
        HashMap hashMap = new HashMap(DEFAULT_FILTERS);
        hashMap.put("locale", Collections.singletonList(this.locale));
        return Collections.unmodifiableMap(hashMap);
    }

    public String getLocale() {
        return this.locale;
    }
}
