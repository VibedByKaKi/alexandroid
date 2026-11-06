package com.amazon.deecomms.calling.model;

import androidx.annotation.NonNull;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class InitiateOutboundCallRequest {

    @JsonProperty("callMediaStreams")
    public List<String> callMediaStreams;

    @JsonProperty("callTarget")
    public CallTarget callTarget;

    @JsonProperty("clientMetricsInfo")
    public ClientMetricsInfo clientMetricsInfo;

    @JsonProperty("isDropIn")
    public boolean isDropIn;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CallTarget {

        @JsonProperty("deviceEndpoint")
        public String deviceEndpoint;

        @JsonProperty(FragmentMetaData.GROUP_ID)
        public String groupId;

        @JsonProperty("groupIdentityType")
        public String groupIdentityType;

        @JsonProperty("targetCommsId")
        public String targetCommsId;

        @JsonProperty(MessagingControllerConstant.MESSAGING_CONTROLLER_PAYLOAD_TYPE)
        public String type;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ClientMetricsInfo {

        @JsonProperty("callInitiationTime")
        String callInitiationTime;

        public ClientMetricsInfo(@NonNull String str) {
            this.callInitiationTime = str;
        }
    }
}
