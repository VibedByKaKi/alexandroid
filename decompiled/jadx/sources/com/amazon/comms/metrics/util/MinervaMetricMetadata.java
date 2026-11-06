package com.amazon.comms.metrics.util;

import com.amazon.comms.ringservice.MetricsSession;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum MinervaMetricMetadata {
    CALLER_OK_RECEIVED_TO_OK_ACK_SENT_MSECS("Caller_okReceived_to_okAckSent_msecs", "89zg544o", MinervaSchemaId.callerLatencySchemaId),
    CALLER_180RECEIVED_TO_OUTBOUND_RINGING_MSECS("Caller_180Received_to_outboundRinging_msecs", "89zg544o", MinervaSchemaId.callerLatencySchemaId),
    CALLER_INVITE_SENT_TO_200OK_DROPIN("CallerInviteSentTo200OKDropIn", "89zg544o", MinervaSchemaId.callerLatencySchemaId),
    CALLER_SEND_CALL_LEG("CallerSendCallLeg", "89zg544o", MinervaSchemaId.callerLatencySchemaId),
    CALLER_OK_RECEIVED_TO_AUDIO_FLOWING_MSECS("Caller_okReceived_to_audioFlowing_msecs", "89zg544o", MinervaSchemaId.callerLatencySchemaId),
    CALLER_SET_RINGTONE_TO_OUTBOUND_RINGING_MSECS("Caller_setRingTone_to_outboundRinging_msecs", "89zg544o", MinervaSchemaId.callerLatencySchemaId),
    CALLER_DROPIN_BEGIN_CALL_TO_MEDIA("CallerDropInBeginCallToMedia", "89zg544o", MinervaSchemaId.callerLatencySchemaId),
    CALLER_BEGIN_CALL_RECEIVED_TO_PROCESSED("Caller_beginCallReceived_to_Processed", "89zg544o", MinervaSchemaId.callerBeginCallLatencySchemaId),
    CALLER_BEGIN_CALL_TO_BYE_MSECS("Caller_beginCall_to_bye_msecs", "89zg544o", MinervaSchemaId.callerBeginCallLatencySchemaId),
    CALLER_BEGIN_CALL_TO_INVITE_SENT_MSECS("Caller_beginCall_to_inviteSent_msecs", "89zg544o", MinervaSchemaId.callerBeginCallLatencySchemaId),
    CALLER_BEGIN_CALL_TO_OUTBOUND_RINGING_MSECS("Caller_beginCall_to_outboundRinging_msecs", "89zg544o", MinervaSchemaId.callerBeginCallLatencySchemaId),
    CALLER_BEGIN_CALL_TO_SETRINGTONE_MSECS("Caller_beginCall_to_setRingTone_msecs", "89zg544o", MinervaSchemaId.callerBeginCallLatencySchemaId),
    CALLEE_OK_SENT_TO_AUDIO_FLOWING_MSECS("Callee_okSent_to_audioFlowing_msecs", "89zg544o", MinervaSchemaId.calleeLatencySchemaId),
    CALLEE_ACCEPT_CALL_TO_OK_SENT_MSECS("Callee_acceptCall_to_okSent_msecs", "89zg544o", MinervaSchemaId.calleeLatencySchemaId),
    CALLEE_OK_ACK_RECEIVED_TO_AUDIO_FLOWING_MSECS("Callee_okAckreceived_to_audioFlowing_msecs", "89zg544o", MinervaSchemaId.calleeLatencySchemaId),
    CALLEE_INVITE_RECEIVED_TO_INBOUND_CALL_RECEIVED_MSECS("Callee_inviteReceived_to_inboundCallReceived_msecs", "89zg544o", MinervaSchemaId.calleeLatencySchemaId),
    CALLEE_INVITE_RECEIVED_TO_RING_CALL_MSECS("Callee_inviteReceived_to_ringCall_msecs", "89zg544o", MinervaSchemaId.calleeLatencySchemaId),
    CALLEE_INVITE_RECEIVED_TO_BYE_MSECS("Callee_inviteReceived_to_bye_msecs", "89zg544o", MinervaSchemaId.calleeLatencySchemaId),
    CALLEE_PREPARING_INCOMING_TTS_TO_PLAYING_INCOMING_TTS_MSECS("Callee_PreparingIncomingTts_to_PlayingIncomingTts_msecs", "89zg544o", MinervaSchemaId.calleeLatencySchemaId),
    CALLEE_PREPARING_SECOND_INCOMING_TTS_TO_PLAYING_SECOND_INCOMING_TTS_MSECS("Callee_PreparingSecondIncomingTts_to_PlayingSecondIncomingTts_msecs", "89zg544o", MinervaSchemaId.calleeLatencySchemaId),
    CALLEE_CALL_TOKEN_TO_INVITE_RECEIVED_MSECS("Callee_CallToken_to_InviteReceived_msecs", "89zg544o", MinervaSchemaId.calleeLatencySchemaId),
    UPL_TTM("Upl_TTM", "89zg544o", MinervaSchemaId.uplSchemaId),
    UPL_TTRB("Upl_TTRB", "89zg544o", MinervaSchemaId.uplSchemaId),
    UPL_TTE_MEDIA("Upl_TTE_Media", "89zg544o", MinervaSchemaId.uplSchemaId),
    UPL_DITTM("Upl_DITTM", "89zg544o", MinervaSchemaId.uplSchemaId),
    UPL_UTTM("GuiUplMpuUpgradeUTTM", "89zg544o", MinervaSchemaId.mpuUpgradeSchemaId),
    CALL_LATENCY_R_S("CallLatency_R_S", "89zg544o", MinervaSchemaId.callLatencySchemaId),
    CALL_LATENCY_F_G("CallLatency_F_G", "89zg544o", MinervaSchemaId.callLatencySchemaId),
    CALL_LATENCY_D_J_EARLYMEDIA("CallLatency_D_J_EarlyMedia", "89zg544o", MinervaSchemaId.callLatencySchemaId),
    CALL_LATENCY_O_S("CallLatency_O_S", "89zg544o", MinervaSchemaId.callLatencySchemaId),
    CALL_LATENCY_D_J("CallLatency_D_J", "89zg544o", MinervaSchemaId.callLatencySchemaId),
    CALL_LATENCY_N_S("CallLatency_N_S", "89zg544o", MinervaSchemaId.callLatencySchemaId),
    CALL_LATENCY_T_X("CallLatency_T_X", "89zg544o", MinervaSchemaId.callLatencySchemaId),
    CALL_ICE_DISCONNECT_DURATION("call_ice_disconnect_duration", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    CALL_ICE_NOT_RECEIVING_DURATION("call_ice_not_receiving_duration", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    CALL_END_CALL_TO_DISCONNECT_MSECS("Call_endCall_to_disconnect_msecs", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    CALL_END_CALL_TO_AUDIO_STOP_MSECS("Call_endCall_to_audioStop_msecs", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    CALL_AUDIO_FLOWING_TO_AUDIO_STOP_MSECS("Call_audioFlowing_to_audioStop_msecs", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    DROPIN_INVITE_TO_AUTO_ACCEPT("DropInInviteToAutoAccept", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    RECONNECT_RECEIVER_SIGNALING_ANSWER_DURATION("reconnect_receiver_signaling_answer_duration", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    RECONNECT_RECEIVER_SIGNALING_DURATION("reconnect_receiver_signaling_duration", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    RECONNECT_RECEIVER_SIGNALING_HANGUP_DURATION("reconnect_receiver_signaling_hangup_duration", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    RECONNECT_RECEIVER_ICE_RESTART_DURATION("reconnect_receiver_ice_restart_duration", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    RECONNECT_RECEIVER_FAIL_DURATION("reconnect_receiver_fail_duration", "89zg544o", MinervaSchemaId.reconnectIntervalsSchemaId),
    WEBRTC_AV_CAPABILITIES("Webrtc_AV_Capabilities", "89zg544o", MinervaSchemaId.webRTCSchemaId),
    CAMERA_AUDIO_INIT("Camera_audio_init", "89zg544o", MinervaSchemaId.webRTCSchemaId),
    ICE("ICE", "89zg544o", MinervaSchemaId.webRTCSchemaId),
    SDP("SDP", "89zg544o", MinervaSchemaId.webRTCSchemaId),
    ACTIVE_CALL_END_WITH_A_NET_IFACE_EVENT_AND_ICE_DISCONNECTED("ActiveCallEndWithANetIfaceEventAndIceDisconnected", "ltklivhj", MinervaSchemaId.callReconnectSchemaId),
    ACTIVE_CALL_END_WITH_ICE_DISCONNECTED("ActiveCallEndWithIceDisconnected", "ltklivhj", MinervaSchemaId.callReconnectSchemaId),
    ACTIVE_CALL_NET_IFACE_UP_EVENTS("ActiveCallNetIfaceUpEvents", "ltklivhj", MinervaSchemaId.callReconnectSchemaId),
    HANGUP_WITH_A_NET_IFACE_EVENT_AND_NO_ICE_CONNECTION_EVER("HangupWithANetIfaceEventAndNoIceConnectionEver", "ltklivhj", MinervaSchemaId.callReconnectSchemaId),
    RECEIVED_CALL_TOKEN("ReceivedCallToken", "ltklivhj", MinervaSchemaId.callReconnectSchemaId),
    RECEIVED_INVITE_FOR_CALL_TOKEN("ReceivedInviteForCallToken", "ltklivhj", MinervaSchemaId.callReconnectSchemaId),
    RING_SERVICE("RingService", "ltklivhj", MinervaSchemaId.callReconnectSchemaId),
    ACTIVE_CALL_END_WITH_AT_LEAST_A_NET_INTERFACE_EVENT("ActiveCallEndWithAtLeastANetInterfaceEvent", "ltklivhj", MinervaSchemaId.callReconnectSchemaId),
    ACTIVE_CALL_NET_IFACE_DOWN_EVENTS("ActiveCallNetIfaceDownEvents", "ltklivhj", MinervaSchemaId.callReconnectSchemaId),
    CALLEE_DROPIN_MIC_MUTED("CalleeDropInMicMuted", "ltklivhj", MinervaSchemaId.callReconnectSchemaId),
    CALL_SUMMARY("CallSummary", "ltklivhj", MinervaSchemaId.callSummarySchemaId),
    THERMAL_MITIGATION_SUMMARY("ThermalMitigationSummary", "ltklivhj", MinervaSchemaId.thermalMitigationSummarySchemaId),
    CONNECTED_CALL_ATTRIBUTES("ConnectedCallAttributes", "ltklivhj", MinervaSchemaId.connectedCallAttributesSchemaId),
    ICE_CONNECTION_RECEIVING("IceConnectionReceiving", "ajied03y", MinervaSchemaId.iceConnectSchemaId),
    ICE_CONNECTION_NOT_RECEIVING("IceConnectionNotReceiving", "ajied03y", MinervaSchemaId.iceConnectSchemaId),
    FIRST_ICE_CONNECT("FirstIceConnect", "ajied03y", MinervaSchemaId.iceConnectSchemaId),
    ICE_RECONNECT("IceReconnect", "ajied03y", MinervaSchemaId.iceConnectSchemaId),
    ICE_DISCONNECT_POST_CONNECT("IceDisconnectPostConnect", "ajied03y", MinervaSchemaId.iceConnectSchemaId),
    ICE_FAIL_POST_CONNECT("IceFailPostConnect", "ajied03y", MinervaSchemaId.iceConnectSchemaId),
    ICE_FAIL_WITHOUT_CONNECT("IceFailWithoutConnect", "ajied03y", MinervaSchemaId.iceConnectSchemaId),
    PEER_CONNECTION_STATS("PeerConnectionStats", "ajied03y", MinervaSchemaId.peerConnectionStatsSchemaId),
    PEER_CONNECTION_TYPE("PeerConnectionType", "ajied03y", MinervaSchemaId.peerConnectionTypeSchemaId),
    SMART_MOTION_METRICS("Comms", "wqdljwjq", MinervaSchemaId.smartMotionSchemaId),
    DEVICE_CALLING_SERVICE_ERROR(MetricsSession.METRIC_DEVICE_CALLING_SERVICE_ERROR, "ei2mskie", MinervaSchemaId.callErrorSchemaId),
    DEVICE_CALLING_SERVICE_SIP_ERROR(MetricsSession.METRIC_DEVICE_CALLING_SERVICE_SIP_ERROR, "ei2mskie", MinervaSchemaId.sipErrorSchemaId),
    BackgroundIndicator("GeneralCommsBackgroundIndicator", "ngkeujnp", MinervaSchemaId.generalBackgroundIndicatorSchemaId),
    VIEW_CONTROLLER_STATE_MACHINE("ViewControllerStateMachine", "6lc0p121", MinervaSchemaId.viewControllerStateMachineSchemaId),
    RING_SERVICE_CALL("RingService_Call", "6lc0p121", MinervaSchemaId.ringServiceCallSchemaId),
    INCOMING_CALL_VIEW_BUTTON("IncomingCallView_Button", "6lc0p121", MinervaSchemaId.incomingCallViewButtonSchemaId),
    MPU_UPGRADE_VIEW_BUTTON("MpuUpgradeView_Button", "6lc0p121", MinervaSchemaId.mpuUpgradeViewButtonSchemaId),
    APP_LIFECYCLE("AppLifecycle", "6lc0p121", MinervaSchemaId.appLifecycle),
    TEST_METRIC_NAME("testMetricName", "7levstx1", MinervaSchemaId.testSchemaId);

    public final String groupId;
    public final String metricName;
    public final String schemaId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MinervaGroupId {
        private static final String backgroundIndicatorGroupId = "ngkeujnp";
        private static final String callSummaryGroupId = "ltklivhj";
        private static final String callingEventTracerGroupId = "89zg544o";
        private static final String errorMetricsGroupId = "ei2mskie";
        private static final String peerConnectionGroupId = "ajied03y";
        private static final String smartMotionGroupId = "wqdljwjq";
        private static final String testGroupId = "7levstx1";
        private static final String uiGroupId = "6lc0p121";

        private MinervaGroupId() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MinervaSchemaId {
        public static final String appLifecycle = "phsh/2/03330460";
        public static final String callErrorSchemaId = "4f0b/2/04330460";
        public static final String callLatencySchemaId = "hlc2/2/03330660";
        public static final String callReconnectSchemaId = "pym9/2/03330400";
        public static final String callSummarySchemaId = "8ffr/2/03330660";
        public static final String calleeLatencySchemaId = "x7qc/2/02330660";
        public static final String callerBeginCallLatencySchemaId = "xnlu/2/02330660";
        public static final String callerLatencySchemaId = "99ew/2/03330660";
        public static final String connectedCallAttributesSchemaId = "v38c/2/02330400";
        public static final String generalBackgroundIndicatorSchemaId = "ym37/2/03330460";
        public static final String iceConnectSchemaId = "4ngz/2/03330400";
        public static final String incomingCallViewButtonSchemaId = "pj1b/2/02330460";
        public static final String mpuUpgradeSchemaId = "02aj/2/03330460";
        public static final String mpuUpgradeViewButtonSchemaId = "wng2/2/02330460";
        public static final String peerConnectionStatsSchemaId = "0rim/2/02330660";
        public static final String peerConnectionTypeSchemaId = "5417/2/03330400";
        public static final String reconnectIntervalsSchemaId = "zkcs/2/03330660";
        public static final String ringServiceCallSchemaId = "es4n/2/03330460";
        public static final String sipErrorSchemaId = "nf2h/2/02330460";
        public static final String smartMotionSchemaId = "cp89/2/02330460";
        public static final String testSchemaId = "dqph/2/03330400";
        public static final String thermalMitigationSummarySchemaId = "zd2y/2/02330400";
        public static final String uplSchemaId = "rdns/2/03330660";
        public static final String viewControllerStateMachineSchemaId = "7g1l/2/03330460";
        public static final String webRTCSchemaId = "be0a/2/03330660";
    }

    MinervaMetricMetadata(String str, String str2, String str3) {
        this.metricName = str;
        this.groupId = str2;
        this.schemaId = str3;
    }

    public static MinervaMetricMetadata getMinervaMetricMetadata(String str) {
        for (MinervaMetricMetadata minervaMetricMetadata : values()) {
            if (minervaMetricMetadata.metricName.equals(str)) {
                return minervaMetricMetadata;
            }
        }
        return null;
    }
}
