package com.amazon.alexa.client.metrics.mobilytics;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaMetadataBundleKey;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MobilyticsCustomDataMapper {
    static final String KEY_AUDIO_INFO = "audioInfo";
    static final String KEY_ENDPOINT_INFO = "endpointInfo";

    @VisibleForTesting
    static final String KEY_EVENT_CONTENT = "eventContent";
    static final String KEY_EXCEPTION_INFO = "exceptionInfo";
    static final String KEY_EXTERNAL_VALUES = "externalValues";

    @VisibleForTesting
    static final String KEY_UI_MESSAGE = "uiMessage";
    static final String KEY_VOICE_INTERACTION_INFO = "voiceInteractionInfo";

    @VisibleForTesting
    static final String METADATA_FORMAT = "%1$s=%2$s";
    private static final String METADATA_SEPARATOR = "|";
    private static final String TAG = "MobilyticsCustomDataMapper";
    private static final ImmutableMap<String, String> metadataKeysMap = ImmutableMap.builder().put(AlexaMetadataBundleKey.CLIENT_AMF_VERSION.name(), "endpointInfo").put(AlexaMetadataBundleKey.CLIENT_PACKAGE_NAME.name(), "endpointInfo").put(AlexaMetadataBundleKey.CLIENT_VERSION_NAME.name(), "endpointInfo").put(AlexaMetadataBundleKey.CLIENT_VERSION_CODE.name(), "endpointInfo").put(AlexaMetadataBundleKey.LEADER_AMF_VERSION.name(), "endpointInfo").put(AlexaMetadataBundleKey.LEADER_PACKAGE_NAME.name(), "endpointInfo").put(AlexaMetadataBundleKey.LEADER_VERSION_NAME.name(), "endpointInfo").put(AlexaMetadataBundleKey.LEADER_VERSION_CODE.name(), "endpointInfo").put(AlexaMetadataBundleKey.NETWORK_TYPE.name(), "endpointInfo").put(AlexaMetadataBundleKey.LOCAL_TIMEZONE.name(), "endpointInfo").put(AlexaMetadataBundleKey.EVENT_TIMESTAMP.name(), "eventContent").put(AlexaMetadataBundleKey.DIALOG_REQUEST_ID.name(), "eventContent").put(AlexaMetadataBundleKey.REQUEST_ID.name(), "eventContent").put(AlexaMetadataBundleKey.EVENT_VALUE.name(), "eventContent").put(AlexaMetadataBundleKey.LOCALE.name(), "eventContent").put(AlexaMetadataBundleKey.DIALOG_ID.name(), "eventContent").put(AlexaMetadataBundleKey.STATUS_CODE.name(), "eventContent").put(AlexaMetadataBundleKey.SOURCE.name(), "eventContent").put(AlexaMetadataBundleKey.TITLE.name(), "eventContent").put(AlexaMetadataBundleKey.ERROR_SOURCE.name(), "eventContent").put(AlexaMetadataBundleKey.AUDIO_ITEM_IDENTIFIER.name(), "audioInfo").put(AlexaMetadataBundleKey.PLAY_TOKEN.name(), "audioInfo").put(AlexaMetadataBundleKey.URL_DOMAIN.name(), "audioInfo").put(AlexaMetadataBundleKey.FILE_EXTENSION.name(), "audioInfo").put(AlexaMetadataBundleKey.AUDIO_MEDIA_URI.name(), "audioInfo").put(AlexaMetadataBundleKey.EVENT_REALTIME_MS.name(), "uiMessage").put(AlexaMetadataBundleKey.LATENCY_REALTIME_MS.name(), "uiMessage").put(AlexaMetadataBundleKey.CARD_NAME.name(), "uiMessage").put(AlexaMetadataBundleKey.CARD_WAS_INTERACTED_WITH.name(), "uiMessage").put(AlexaMetadataBundleKey.ERROR_TYPE.name(), "uiMessage").put(AlexaMetadataBundleKey.MESSAGE.name(), "uiMessage").put(AlexaMetadataBundleKey.SUCCESS.name(), "uiMessage").put(AlexaMetadataBundleKey.SOURCE_CONTEXT.name(), "uiMessage").put(AlexaMetadataBundleKey.AVS_EXCEPTION_CODE.name(), "exceptionInfo").put(AlexaMetadataBundleKey.AVS_EXCEPTION_DESCRIPTION.name(), "exceptionInfo").put(AlexaMetadataBundleKey.SDK_EXCEPTION_ERROR_TYPE.name(), "exceptionInfo").put(AlexaMetadataBundleKey.SDK_EXCEPTION_ERROR_MESSAGE.name(), "exceptionInfo").put(AlexaMetadataBundleKey.SDK_EXCEPTION_UNPARSED_DIRECTIVE.name(), "exceptionInfo").put(AlexaMetadataBundleKey.SDK_EXCEPTION_USER_FACING.name(), "exceptionInfo").put(AlexaMetadataBundleKey.CAPABILITY_PACKAGE.name(), "externalValues").put(AlexaMetadataBundleKey.CAPABILITY_SERVICE.name(), "externalValues").put(AlexaMetadataBundleKey.CAPABILITY_NAMESPACE.name(), "externalValues").put(AlexaMetadataBundleKey.EXTERNAL_COMPONENT_STATE_PROVIDERS_COUNT.name(), "externalValues").put(AlexaMetadataBundleKey.IS_ENCRYPTED_SHARED_PREFS.name(), "externalValues").put(AlexaMetricsConstants.AssistantSdkFaultContext.TRANSPORT_STATE, "externalValues").put(AlexaMetricsConstants.AssistantSdkFaultContext.EXCEPTION_CLASS_NAME, "externalValues").put(AlexaMetricsConstants.AssistantSdkFaultContext.NETWORK_TRANSPORT_TYPE, "externalValues").put(AlexaMetricsConstants.AssistantSdkFaultContext.NETWORK_CHANGE_BUCKET, "externalValues").put(AlexaMetricsConstants.AssistantSdkFaultContext.NETWORK_VALIDATED, "externalValues").put(AlexaMetricsConstants.AssistantSdkFaultContext.UPTIME_BUCKET, "externalValues").put(AlexaMetricsConstants.AssistantSdkFaultContext.FOREGROUND_BUCKET, "externalValues").put(AlexaMetricsConstants.AssistantSdkFaultContext.CONNECTED_BUCKET, "externalValues").put(AlexaMetricsConstants.AssistantSdkFaultContext.AUTH_TOKEN_PRESENT, "externalValues").put(AlexaMetricsConstants.AssistantSdkFaultContext.AUTH_TOKEN_AGE_BUCKET, "externalValues").put(AlexaMetadataBundleKey.VOICE_INTERACTION_PROGRESS.name(), "voiceInteractionInfo").put(AlexaMetadataBundleKey.SOFTWARE_VERSION.name(), "voiceInteractionInfo").put(AlexaMetadataBundleKey.API_CALL_ID.name(), "voiceInteractionInfo").put(AlexaMetadataBundleKey.USER_SPEECH_INVOCATION_TYPE.name(), "voiceInteractionInfo").put(AlexaMetadataBundleKey.USER_SPEECH_INGRESS_TYPE.name(), "voiceInteractionInfo").build();

    @Inject
    public MobilyticsCustomDataMapper() {
    }

    public Map<String, Object> adaptToProvisionedMetadataKeys(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                String str = metadataKeysMap.get(key);
                if (str == null) {
                    hashMap.put(key, value.toString());
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (hashMap.containsKey(str)) {
                        sb.append(hashMap.get(str));
                        sb.append("|");
                        sb.append(String.format(METADATA_FORMAT, key, value));
                    } else {
                        sb.append(String.format(METADATA_FORMAT, key, value));
                    }
                    hashMap.put(str, sb.toString());
                }
            }
        }
        return hashMap;
    }
}
