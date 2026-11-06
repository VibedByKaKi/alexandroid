package com.amazon.deecomms.calling.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.TextResponseMetadataBundleKeys;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
/* loaded from: classes5.dex */
public class RingCallDirective {

    @JsonProperty("displayInfo")
    public DisplayInfo displayInfo;

    @JsonProperty("sipCommand")
    public SipCommand sipCommand;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CalleePartyInfo {

        @JsonProperty("credit")
        public Object credit;

        @JsonProperty("dropInPermission")
        public boolean dropInPermission;

        @JsonProperty("endpointDescription")
        public Object endpointDescription;

        @JsonProperty("name")
        public String name;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CallerPartyInfo {

        @JsonProperty("credit")
        public Object credit;

        @JsonProperty("dropInPermission")
        public boolean dropInPermission;

        @JsonProperty("endpointDescription")
        public Object endpointDescription;

        @JsonProperty("name")
        public String name;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CspInfo {

        @JsonProperty("cspId")
        public String cspId;

        @JsonProperty("cspImage")
        public Object cspImage;

        @JsonProperty(CamerasRouteParameter.DISPLAY_NAME)
        public Object displayName;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class DisplayInfo {

        @JsonProperty("calleePartyInfo")
        public CalleePartyInfo calleePartyInfo;

        @JsonProperty("callerPartyInfo")
        public CallerPartyInfo callerPartyInfo;

        @JsonProperty("cspInfo")
        public CspInfo cspInfo;

        @JsonProperty("dropInInfo")
        public Object dropInInfo;

        @JsonProperty("mediaSettingsInfo")
        public MediaSettingsInfo mediaSettingsInfo;

        @JsonProperty("systemTrayInfo")
        public SystemTrayInfo systemTrayInfo;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class MediaSettingsInfo {

        @JsonProperty("enhancedProcessing")
        public String enhancedProcessing;

        @JsonProperty("isEnhancedProcessingOptInRequired")
        public boolean isEnhancedProcessingOptInRequired;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Payload {

        @JsonProperty("callId")
        public String callId;

        @JsonProperty("incomingTTSURL")
        public String incomingTTSURL;

        @JsonProperty("lightsOn")
        public boolean lightsOn;

        @JsonProperty(TextResponseMetadataBundleKeys.PROMPT_ID)
        public Object promptId;

        @JsonProperty("soundOn")
        public boolean soundOn;

        @JsonProperty("timeouts")
        public Object timeouts;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SipCommand {

        @JsonProperty("audioCategory")
        public String audioCategory;

        @JsonProperty("clientIdentifier")
        public String clientIdentifier;

        @JsonProperty("componentInContentFocus")
        public String componentInContentFocus;

        @JsonProperty("isMixable")
        public boolean isMixable;

        @JsonProperty("payload")
        public Payload payload;

        @JsonProperty("playBehavior")
        public String playBehavior;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SystemTrayInfo {

        @JsonProperty("callDescription")
        public String callDescription;
    }
}
