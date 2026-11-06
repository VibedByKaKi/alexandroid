package com.amazon.comms.calling.instrumentation;

import com.amazon.comms.instrumentation.EventTracer;
import com.google.common.collect.ImmutableSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class EventTracerConfig {
    public static final String LOG_TAG = "CALLING_EVENT_TRACER";

    @Deprecated
    public static final ImmutableSet<String> METRICS_DOMAINS = ImmutableSet.of("com.amazon.comms.knighttachyon", "com.amazon.comms.headlesstachyon", "com.amazon.comms.rooktachyon", "com.amazon.dee.app", "com.amazon.dee.app.beta");
    public static final String METRICS_SOURCE = "CallingEventTracer";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Event {
        Caller_GuiCallRequestTapped,
        Caller_GuiDropinRequestTapped,
        Caller_GuiOutboundCallRequestSent,
        Caller_BeginCall_Directive,
        Caller_DropIn_BeginCall_Directive,
        Caller_SetRingTone_Directive,
        Caller_INVITE_Sent,
        Caller_Received_200OK,
        Caller_OutgoingCallView_Bound,
        Caller_OutgoingCallView_Unbound,
        Caller_ActiveCallView_Bound,
        Caller_ActiveCallView_Unbound,
        Caller_OutgoingCallTtsSpeechStarted,
        Caller_200OK_Received_DropIn,
        Caller_Received_Warmup,
        Caller_Deferred_BeginCall_Received,
        Caller_Deferred_BeginCall_Processed,
        Update_Media_Session_Started,
        Callee_INVITE_Received,
        Callee_DropIn_INVITE_Received,
        Callee_User_Answers,
        Callee_DropIn_Accepted,
        Callee_IncomingCallView_Bound,
        Callee_IncomingCallView_Unbound,
        Callee_ActiveCallView_Bound,
        Callee_ActiveCallView_Unbound,
        Callee_NotifySpeechletOfInvite,
        Callee_AcceptCall_Directive_DropIn,
        Callee_NotifySpeechletOfCallerId,
        Callee_Received_CallToken,
        EAC_AcceptCall,
        EAC_Redundant_AcceptCall,
        EAC_EarlyAcceptCall,
        EAC_Redundant_EarlyAcceptCall,
        EAC_INVITE,
        EAC_Other_INVITE,
        Webrtc_media_warmup_started,
        Webrtc_media_warmup_completed,
        Webrtc_create_peer_connection,
        Webrtc_create_peer_connection_internal,
        Webrtc_peer_connection_created,
        Webrtc_icegatheringstate_gathering,
        Webrtc_icegatheringstate_complete,
        Webrtc_session_connected,
        Webrtc_session_updated,
        Callee_Send_180Ringing,
        Caller_Received_180Ringing,
        Callee_Send_200OK,
        Call_Confirmed,
        Call_Hangup_Sent,
        Call_Hangup,
        Call_Disconnected,
        Callee_Received_Ring_tts,
        Call_MediaStop,
        Playing_Outgoing_Ringback_Tone,
        Playing_Connected_Tone,
        Playing_Disconnect_Tone,
        Preparing_Tts_Url,
        Playing_First_Incoming_tts,
        Playing_Second_Incoming_tts,
        Callee_Playing_DropIn_Connect_Tone,
        Gui_Answer_Call_OnClicked,
        Call_Accepted_Notify,
        Gui_EndCall_OnClicked,
        Gui_EndInvite_OnClicked,
        Gui_Audio_OnClicked,
        Gui_EnhancedFeatures_InCall_OptIn,
        Call_Early_Media_Notify,
        Callee_Sip_Info_Received,
        Ui_Launched,
        Ui_Shown,
        EndOfUtteranceBeginCallStandard,
        EndOfUtteranceBeginCallDropIn,
        EndOfUtteranceAcceptCall,
        EndOfUtteranceEndCall,
        EndOfUtteranceDTMF,
        call_ice_disconnected,
        call_ice_connected,
        call_ice_reconnected,
        ice_connection_receiving,
        ice_connection_notreceiving,
        reconnect_initiator_network_down,
        reconnect_initiator_network_up,
        reconnect_initiator_signaling_shutdown,
        reconnect_initiator_signaling_init,
        reconnect_initiator_signaling_registered,
        reconnect_initiator_ice_restarted,
        reconnect_initiator_signaling_offer,
        reconnect_receiver_signaling_offered,
        reconnect_receiver_signaling_hangup,
        reconnect_receiver_ice_restarted,
        reconnect_receiver_signaling_answer,
        reconnect_initiator_signaling_answered,
        reconnect_initiator_timeout,
        reconnect_receiver_timeout,
        reconnect_simultaneous_signaling_reset,
        reconnect_simultaneous_signaling_ignore,
        reconnect_initiator_fail,
        reconnect_receiver_fail,
        reconnect_initiator_updatecall_directive_received,
        SendDTMF_Directive_Received,
        DTMF_Sent_To_Sip,
        DTMF_Sent_RFC2833,
        Sip_Info_Response_Received
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Upl_TTRB' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Interval implements EventTracer.Interval<Event> {
        private static final /* synthetic */ Interval[] $VALUES;
        public static final Interval CallLatency_D_J;
        public static final Interval CallLatency_D_J_EarlyMedia;
        public static final Interval CallLatency_F_G;
        public static final Interval CallLatency_F_I;
        public static final Interval CallLatency_N_S;
        public static final Interval CallLatency_O_S;
        public static final Interval CallLatency_R_S;
        public static final Interval CallLatency_T_X;
        public static final Interval Call_audioFlowing_to_audioStop_msecs;
        public static final Interval Call_endCall_to_audioStop_msecs;
        public static final Interval Call_endCall_to_disconnect_msecs;
        public static final Interval CalleeAcceptCallToDropInViewBound;
        public static final Interval CalleeAcceptCallToMediaFlowing;
        public static final Interval CalleeDropInInviteTo200ok;
        public static final Interval CalleeDropInInviteToMedia;
        public static final Interval CalleeInboundCallReceivedToAcceptCall;
        public static final Interval CalleeReceiveCallLeg;
        public static final Interval CalleeSendAnswerLeg;
        public static final Interval Callee_CallToken_to_InviteReceived_msecs;
        public static final Interval Callee_PreparingIncomingTts_to_PlayingIncomingTts_msecs;
        public static final Interval Callee_PreparingSecondIncomingTts_to_PlayingSecondIncomingTts_msecs;
        public static final Interval Callee_acceptCall_to_okSent_msecs;
        public static final Interval Callee_inviteReceived_to_bye_msecs;
        public static final Interval Callee_inviteReceived_to_inboundCallReceived_msecs;
        public static final Interval Callee_inviteReceived_to_ringCall_msecs;
        public static final Interval Callee_okAckreceived_to_audioFlowing_msecs;
        public static final Interval Callee_okSent_to_audioFlowing_msecs;
        public static final Interval Callee_ringCall_to_180Sent_msecs;
        public static final Interval Callee_secondRingCall_to_callerIdTTSReady_msecs;
        public static final Interval Callee_sipInfoReceived_to_inboundCallerIdSent_msecs;
        public static final Interval CallerDropInBeginCallToMedia;
        public static final Interval CallerInviteSentTo200OKDropIn;
        public static final Interval CallerReceiveAnswerLeg;
        public static final Interval CallerSendCallLeg;
        public static final Interval CallerWarmupToBeginCall;
        public static final Interval Caller_180Received_to_outboundRinging_msecs;
        public static final Interval Caller_beginCallReceived_to_Processed;
        public static final Interval Caller_beginCall_to_bye_msecs;
        public static final Interval Caller_beginCall_to_inviteSent_msecs;
        public static final Interval Caller_beginCall_to_outboundRinging_msecs;
        public static final Interval Caller_beginCall_to_setRingTone_msecs;
        public static final Interval Caller_okReceived_to_audioFlowing_msecs;
        public static final Interval Caller_okReceived_to_okAckSent_msecs;
        public static final Interval Caller_setRingTone_to_outboundRinging_msecs;
        public static final Interval Camera_audio_init;
        public static final Interval DTMF_DirectiveReceived_to_INFOSent;
        public static final Interval DTMF_DirectiveReceived_to_RFC2833Sent;
        public static final Interval DTMF_INFOSent_to_INFOReceived;
        public static final Interval DropInAutoAcceptToMediaStreaming;
        public static final Interval DropInInviteToAutoAccept;
        public static final Interval EAC_nonOptimal_invite_to_acceptCall;
        public static final Interval EAC_nonOptimal_invite_to_redundantEarlyAcceptCall;
        public static final Interval EAC_optimal_earlyAcceptCall_to_invite;
        public static final Interval EAC_semiOptimal_invite_to_earlyAcceptCall;
        public static final Interval EAC_semiOptimal_invite_to_redundantAcceptCall;
        public static final Interval EAC_subverted_earlyAcceptCall_to_otherInvite;
        public static final Interval GuiCallRequestToOutboundRequest_guiZ1_guiZ3;
        public static final Interval GuiDropInRequestToOutboundRequest_guiZ1_guiZ3;
        public static final Interval GuiOutboundRequestToBeginCall_guiZ3_C2;
        public static final Interval GuiResponseTo200OKReceived_O_guiP;
        public static final Interval GuiResponseToRingCall_H_guiH;
        public static final Interval GuiUplAnswerCall_guiM1_S;
        public static final Interval GuiUplCallRequestToOutboundTTS_guiZ1_C1;
        public static final Interval GuiUplDropinTTM_guiZ1_S;
        public static final Interval GuiUplEndCall_guiW1_X;
        public static final Interval GuiUplIgnoreCall;
        public static final Interval GuiUplMpuUpgradeDITTM;
        public static final Interval GuiUplMpuUpgradeUTTM;
        public static final Interval ICE;
        public static final Interval SDP;
        public static final Interval TTE_MediaStop;
        public static final Interval Ui_Launched_to_Shown;
        public static final Interval Upl_DITTM;
        public static final Interval Upl_TTE_Media;
        public static final Interval Upl_TTM;
        public static final Interval Upl_TTRB;
        public static final Interval Webrtc_AV_Capabilities;
        public static final Interval Webrtc_media_warmup;
        public static final Interval call_ice_disconnect_duration;
        public static final Interval call_ice_not_receiving_duration;
        public static final Interval reconnect_initiator_fail_duration;
        public static final Interval reconnect_initiator_network_duration;
        public static final Interval reconnect_initiator_registered_updatecall_duration;
        public static final Interval reconnect_initiator_signaling_answered_duration;
        public static final Interval reconnect_initiator_signaling_duration;
        public static final Interval reconnect_initiator_signaling_init_duration;
        public static final Interval reconnect_initiator_signaling_offer_duration;
        public static final Interval reconnect_initiator_signaling_registration_duration;
        public static final Interval reconnect_initiator_signaling_shutdown_duration;
        public static final Interval reconnect_initiator_timeout_duration;
        public static final Interval reconnect_initiator_updatecall_offer_duration;
        public static final Interval reconnect_receiver_fail_duration;
        public static final Interval reconnect_receiver_ice_restart_duration;
        public static final Interval reconnect_receiver_signaling_answer_duration;
        public static final Interval reconnect_receiver_signaling_duration;
        public static final Interval reconnect_receiver_signaling_hangup_duration;
        public static final Interval reconnect_receiver_timeout_duration;
        private final Event mBegin;
        private final Event mEnd;
        private final boolean mRecordMetric;

        private static /* synthetic */ Interval[] $values() {
            return new Interval[]{Upl_TTRB, Upl_DITTM, Upl_TTM, Upl_TTE_Media, CallerSendCallLeg, CallerReceiveAnswerLeg, CallerInviteSentTo200OKDropIn, CallerDropInBeginCallToMedia, CalleeReceiveCallLeg, CalleeSendAnswerLeg, CalleeInboundCallReceivedToAcceptCall, CalleeAcceptCallToMediaFlowing, CalleeAcceptCallToDropInViewBound, CalleeDropInInviteToMedia, CalleeDropInInviteTo200ok, Webrtc_media_warmup, Webrtc_AV_Capabilities, Camera_audio_init, SDP, ICE, CallLatency_D_J, CallLatency_D_J_EarlyMedia, CallLatency_F_G, CallLatency_F_I, CallLatency_O_S, CallLatency_N_S, CallLatency_R_S, CallLatency_T_X, TTE_MediaStop, GuiResponseTo200OKReceived_O_guiP, GuiResponseToRingCall_H_guiH, GuiUplAnswerCall_guiM1_S, GuiUplEndCall_guiW1_X, GuiUplIgnoreCall, DropInInviteToAutoAccept, DropInAutoAcceptToMediaStreaming, GuiCallRequestToOutboundRequest_guiZ1_guiZ3, GuiDropInRequestToOutboundRequest_guiZ1_guiZ3, GuiOutboundRequestToBeginCall_guiZ3_C2, GuiUplCallRequestToOutboundTTS_guiZ1_C1, GuiUplDropinTTM_guiZ1_S, GuiUplMpuUpgradeDITTM, GuiUplMpuUpgradeUTTM, EAC_optimal_earlyAcceptCall_to_invite, EAC_semiOptimal_invite_to_earlyAcceptCall, EAC_semiOptimal_invite_to_redundantAcceptCall, EAC_nonOptimal_invite_to_acceptCall, EAC_nonOptimal_invite_to_redundantEarlyAcceptCall, EAC_subverted_earlyAcceptCall_to_otherInvite, CallerWarmupToBeginCall, Caller_beginCallReceived_to_Processed, Caller_beginCall_to_outboundRinging_msecs, Caller_beginCall_to_setRingTone_msecs, Caller_setRingTone_to_outboundRinging_msecs, Caller_beginCall_to_inviteSent_msecs, Caller_180Received_to_outboundRinging_msecs, Caller_okReceived_to_okAckSent_msecs, Caller_okReceived_to_audioFlowing_msecs, Caller_beginCall_to_bye_msecs, Callee_inviteReceived_to_inboundCallReceived_msecs, Callee_inviteReceived_to_ringCall_msecs, Callee_ringCall_to_180Sent_msecs, Callee_acceptCall_to_okSent_msecs, Callee_okSent_to_audioFlowing_msecs, Callee_okAckreceived_to_audioFlowing_msecs, Callee_inviteReceived_to_bye_msecs, Call_endCall_to_audioStop_msecs, Call_endCall_to_disconnect_msecs, Call_audioFlowing_to_audioStop_msecs, Callee_PreparingIncomingTts_to_PlayingIncomingTts_msecs, Callee_PreparingSecondIncomingTts_to_PlayingSecondIncomingTts_msecs, Callee_CallToken_to_InviteReceived_msecs, Ui_Launched_to_Shown, call_ice_disconnect_duration, call_ice_not_receiving_duration, reconnect_initiator_signaling_duration, reconnect_receiver_signaling_duration, reconnect_initiator_network_duration, reconnect_initiator_signaling_shutdown_duration, reconnect_initiator_signaling_init_duration, reconnect_initiator_signaling_registration_duration, reconnect_initiator_signaling_offer_duration, reconnect_initiator_signaling_answered_duration, reconnect_receiver_signaling_hangup_duration, reconnect_receiver_ice_restart_duration, reconnect_receiver_signaling_answer_duration, reconnect_initiator_timeout_duration, reconnect_receiver_timeout_duration, reconnect_initiator_fail_duration, reconnect_receiver_fail_duration, reconnect_initiator_registered_updatecall_duration, reconnect_initiator_updatecall_offer_duration, Callee_sipInfoReceived_to_inboundCallerIdSent_msecs, Callee_secondRingCall_to_callerIdTTSReady_msecs, DTMF_DirectiveReceived_to_INFOSent, DTMF_INFOSent_to_INFOReceived, DTMF_DirectiveReceived_to_RFC2833Sent};
        }

        static {
            Event event = Event.EndOfUtteranceBeginCallStandard;
            Event event2 = Event.Playing_Outgoing_Ringback_Tone;
            Upl_TTRB = new Interval("Upl_TTRB", 0, true, event, event2);
            Event event3 = Event.EndOfUtteranceBeginCallDropIn;
            Event event4 = Event.Webrtc_session_connected;
            Upl_DITTM = new Interval("Upl_DITTM", 1, true, event3, event4);
            Upl_TTM = new Interval("Upl_TTM", 2, true, Event.EndOfUtteranceAcceptCall, event4);
            Event event5 = Event.EndOfUtteranceEndCall;
            Event event6 = Event.Call_MediaStop;
            Upl_TTE_Media = new Interval("Upl_TTE_Media", 3, true, event5, event6);
            Event event7 = Event.Caller_BeginCall_Directive;
            Event event8 = Event.Caller_INVITE_Sent;
            CallerSendCallLeg = new Interval("CallerSendCallLeg", 4, true, event7, event8);
            Event event9 = Event.Caller_Received_200OK;
            Event event10 = Event.Caller_ActiveCallView_Bound;
            CallerReceiveAnswerLeg = new Interval("CallerReceiveAnswerLeg", 5, true, event9, event10);
            CallerInviteSentTo200OKDropIn = new Interval("CallerInviteSentTo200OKDropIn", 6, true, event8, Event.Caller_200OK_Received_DropIn);
            CallerDropInBeginCallToMedia = new Interval("CallerDropInBeginCallToMedia", 7, true, Event.Caller_DropIn_BeginCall_Directive, event4);
            Event event11 = Event.Callee_INVITE_Received;
            Event event12 = Event.Callee_IncomingCallView_Bound;
            CalleeReceiveCallLeg = new Interval("CalleeReceiveCallLeg", 8, true, event11, event12);
            Event event13 = Event.Callee_User_Answers;
            Event event14 = Event.Callee_ActiveCallView_Bound;
            CalleeSendAnswerLeg = new Interval("CalleeSendAnswerLeg", 9, true, event13, event14);
            Event event15 = Event.Callee_NotifySpeechletOfInvite;
            Event event16 = Event.Callee_AcceptCall_Directive_DropIn;
            CalleeInboundCallReceivedToAcceptCall = new Interval("CalleeInboundCallReceivedToAcceptCall", 10, true, event15, event16);
            CalleeAcceptCallToMediaFlowing = new Interval("CalleeAcceptCallToMediaFlowing", 11, true, event16, event4);
            CalleeAcceptCallToDropInViewBound = new Interval("CalleeAcceptCallToDropInViewBound", 12, true, event16, event14);
            Event event17 = Event.Callee_DropIn_INVITE_Received;
            CalleeDropInInviteToMedia = new Interval("CalleeDropInInviteToMedia", 13, true, event17, event4);
            Event event18 = Event.Callee_Send_200OK;
            CalleeDropInInviteTo200ok = new Interval("CalleeDropInInviteTo200ok", 14, true, event17, event18);
            Webrtc_media_warmup = new Interval("Webrtc_media_warmup", 15, true, Event.Webrtc_media_warmup_started, Event.Webrtc_media_warmup_completed);
            Event event19 = Event.Webrtc_create_peer_connection;
            Event event20 = Event.Webrtc_create_peer_connection_internal;
            Webrtc_AV_Capabilities = new Interval("Webrtc_AV_Capabilities", 16, true, event19, event20);
            Event event21 = Event.Webrtc_peer_connection_created;
            Camera_audio_init = new Interval("Camera_audio_init", 17, true, event20, event21);
            Event event22 = Event.Webrtc_icegatheringstate_gathering;
            SDP = new Interval("SDP", 18, true, event21, event22);
            ICE = new Interval("ICE", 19, true, event22, Event.Webrtc_icegatheringstate_complete);
            Event event23 = Event.Caller_Received_180Ringing;
            CallLatency_D_J = new Interval("CallLatency_D_J", 20, true, event8, event23);
            CallLatency_D_J_EarlyMedia = new Interval("CallLatency_D_J_EarlyMedia", 21, true, event8, Event.Call_Early_Media_Notify);
            CallLatency_F_G = new Interval("CallLatency_F_G", 22, true, event11, event15);
            Event event24 = Event.Callee_Send_180Ringing;
            CallLatency_F_I = new Interval("CallLatency_F_I", 23, true, event11, event24);
            CallLatency_O_S = new Interval("CallLatency_O_S", 24, true, event9, event4);
            CallLatency_N_S = new Interval("CallLatency_N_S", 25, true, event18, event4);
            Event event25 = Event.Call_Confirmed;
            CallLatency_R_S = new Interval("CallLatency_R_S", 26, true, event25, event4);
            Event event26 = Event.Call_Hangup;
            Event event27 = Event.Call_Disconnected;
            CallLatency_T_X = new Interval("CallLatency_T_X", 27, true, event26, event27);
            TTE_MediaStop = new Interval("TTE_MediaStop", 28, true, event26, event6);
            GuiResponseTo200OKReceived_O_guiP = new Interval("GuiResponseTo200OKReceived_O_guiP", 29, true, event9, event10);
            Event event28 = Event.Callee_Received_Ring_tts;
            GuiResponseToRingCall_H_guiH = new Interval("GuiResponseToRingCall_H_guiH", 30, true, event28, event12);
            GuiUplAnswerCall_guiM1_S = new Interval("GuiUplAnswerCall_guiM1_S", 31, true, Event.Gui_Answer_Call_OnClicked, event4);
            GuiUplEndCall_guiW1_X = new Interval("GuiUplEndCall_guiW1_X", 32, true, Event.Gui_EndCall_OnClicked, event26);
            GuiUplIgnoreCall = new Interval("GuiUplIgnoreCall", 33, true, Event.Gui_EndInvite_OnClicked, event26);
            Event event29 = Event.Callee_DropIn_Accepted;
            DropInInviteToAutoAccept = new Interval("DropInInviteToAutoAccept", 34, true, event11, event29);
            DropInAutoAcceptToMediaStreaming = new Interval("DropInAutoAcceptToMediaStreaming", 35, true, event29, event4);
            Event event30 = Event.Caller_GuiCallRequestTapped;
            Event event31 = Event.Caller_GuiOutboundCallRequestSent;
            GuiCallRequestToOutboundRequest_guiZ1_guiZ3 = new Interval("GuiCallRequestToOutboundRequest_guiZ1_guiZ3", 36, true, event30, event31);
            Event event32 = Event.Caller_GuiDropinRequestTapped;
            GuiDropInRequestToOutboundRequest_guiZ1_guiZ3 = new Interval("GuiDropInRequestToOutboundRequest_guiZ1_guiZ3", 37, true, event32, event31);
            GuiOutboundRequestToBeginCall_guiZ3_C2 = new Interval("GuiOutboundRequestToBeginCall_guiZ3_C2", 38, true, event31, event7);
            GuiUplCallRequestToOutboundTTS_guiZ1_C1 = new Interval("GuiUplCallRequestToOutboundTTS_guiZ1_C1", 39, true, event30, Event.Caller_OutgoingCallTtsSpeechStarted);
            GuiUplDropinTTM_guiZ1_S = new Interval("GuiUplDropinTTM_guiZ1_S", 40, true, event32, event4);
            Event event33 = Event.Gui_EnhancedFeatures_InCall_OptIn;
            Event event34 = Event.Webrtc_session_updated;
            GuiUplMpuUpgradeDITTM = new Interval("GuiUplMpuUpgradeDITTM", 41, true, event33, event34);
            GuiUplMpuUpgradeUTTM = new Interval("GuiUplMpuUpgradeUTTM", 42, true, Event.Update_Media_Session_Started, event34);
            Event event35 = Event.EAC_EarlyAcceptCall;
            Event event36 = Event.EAC_INVITE;
            EAC_optimal_earlyAcceptCall_to_invite = new Interval("EAC_optimal_earlyAcceptCall_to_invite", 43, true, event35, event36);
            EAC_semiOptimal_invite_to_earlyAcceptCall = new Interval("EAC_semiOptimal_invite_to_earlyAcceptCall", 44, true, event36, event35);
            EAC_semiOptimal_invite_to_redundantAcceptCall = new Interval("EAC_semiOptimal_invite_to_redundantAcceptCall", 45, true, event36, Event.EAC_Redundant_AcceptCall);
            EAC_nonOptimal_invite_to_acceptCall = new Interval("EAC_nonOptimal_invite_to_acceptCall", 46, true, event36, Event.EAC_AcceptCall);
            EAC_nonOptimal_invite_to_redundantEarlyAcceptCall = new Interval("EAC_nonOptimal_invite_to_redundantEarlyAcceptCall", 47, true, event36, Event.EAC_Redundant_EarlyAcceptCall);
            EAC_subverted_earlyAcceptCall_to_otherInvite = new Interval("EAC_subverted_earlyAcceptCall_to_otherInvite", 48, true, event35, Event.EAC_Other_INVITE);
            CallerWarmupToBeginCall = new Interval("CallerWarmupToBeginCall", 49, true, Event.Caller_Received_Warmup, event7);
            Caller_beginCallReceived_to_Processed = new Interval("Caller_beginCallReceived_to_Processed", 50, true, Event.Caller_Deferred_BeginCall_Received, Event.Caller_Deferred_BeginCall_Processed);
            Caller_beginCall_to_outboundRinging_msecs = new Interval("Caller_beginCall_to_outboundRinging_msecs", 51, true, event7, event23);
            Event event37 = Event.Caller_SetRingTone_Directive;
            Caller_beginCall_to_setRingTone_msecs = new Interval("Caller_beginCall_to_setRingTone_msecs", 52, true, event7, event37);
            Caller_setRingTone_to_outboundRinging_msecs = new Interval("Caller_setRingTone_to_outboundRinging_msecs", 53, true, event37, event2);
            Caller_beginCall_to_inviteSent_msecs = new Interval("Caller_beginCall_to_inviteSent_msecs", 54, true, event7, event8);
            Caller_180Received_to_outboundRinging_msecs = new Interval("Caller_180Received_to_outboundRinging_msecs", 55, true, event23, event2);
            Caller_okReceived_to_okAckSent_msecs = new Interval("Caller_okReceived_to_okAckSent_msecs", 56, true, event9, event25);
            Caller_okReceived_to_audioFlowing_msecs = new Interval("Caller_okReceived_to_audioFlowing_msecs", 57, true, event9, event4);
            Caller_beginCall_to_bye_msecs = new Interval("Caller_beginCall_to_bye_msecs", 58, true, event7, event26);
            Callee_inviteReceived_to_inboundCallReceived_msecs = new Interval("Callee_inviteReceived_to_inboundCallReceived_msecs", 59, true, event11, event15);
            Callee_inviteReceived_to_ringCall_msecs = new Interval("Callee_inviteReceived_to_ringCall_msecs", 60, true, event11, event28);
            Callee_ringCall_to_180Sent_msecs = new Interval("Callee_ringCall_to_180Sent_msecs", 61, true, event28, event24);
            Callee_acceptCall_to_okSent_msecs = new Interval("Callee_acceptCall_to_okSent_msecs", 62, true, event13, event18);
            Callee_okSent_to_audioFlowing_msecs = new Interval("Callee_okSent_to_audioFlowing_msecs", 63, true, event18, event4);
            Callee_okAckreceived_to_audioFlowing_msecs = new Interval("Callee_okAckreceived_to_audioFlowing_msecs", 64, true, event25, event4);
            Callee_inviteReceived_to_bye_msecs = new Interval("Callee_inviteReceived_to_bye_msecs", 65, true, event11, event26);
            Call_endCall_to_audioStop_msecs = new Interval("Call_endCall_to_audioStop_msecs", 66, true, event26, event6);
            Call_endCall_to_disconnect_msecs = new Interval("Call_endCall_to_disconnect_msecs", 67, true, event26, event27);
            Call_audioFlowing_to_audioStop_msecs = new Interval("Call_audioFlowing_to_audioStop_msecs", 68, true, event4, event6);
            Event event38 = Event.Preparing_Tts_Url;
            Callee_PreparingIncomingTts_to_PlayingIncomingTts_msecs = new Interval("Callee_PreparingIncomingTts_to_PlayingIncomingTts_msecs", 69, true, event38, Event.Playing_First_Incoming_tts);
            Event event39 = Event.Playing_Second_Incoming_tts;
            Callee_PreparingSecondIncomingTts_to_PlayingSecondIncomingTts_msecs = new Interval("Callee_PreparingSecondIncomingTts_to_PlayingSecondIncomingTts_msecs", 70, true, event38, event39);
            Callee_CallToken_to_InviteReceived_msecs = new Interval("Callee_CallToken_to_InviteReceived_msecs", 71, true, Event.Callee_Received_CallToken, event11);
            Ui_Launched_to_Shown = new Interval("Ui_Launched_to_Shown", 72, true, Event.Ui_Launched, Event.Ui_Shown);
            Event event40 = Event.call_ice_disconnected;
            call_ice_disconnect_duration = new Interval("call_ice_disconnect_duration", 73, true, event40, Event.call_ice_reconnected);
            call_ice_not_receiving_duration = new Interval("call_ice_not_receiving_duration", 74, true, Event.ice_connection_notreceiving, Event.ice_connection_receiving);
            Event event41 = Event.reconnect_initiator_network_down;
            Event event42 = Event.reconnect_initiator_signaling_answered;
            reconnect_initiator_signaling_duration = new Interval("reconnect_initiator_signaling_duration", 75, true, event41, event42);
            Event event43 = Event.reconnect_receiver_signaling_offered;
            Event event44 = Event.reconnect_receiver_signaling_answer;
            reconnect_receiver_signaling_duration = new Interval("reconnect_receiver_signaling_duration", 76, true, event43, event44);
            Event event45 = Event.reconnect_initiator_network_up;
            reconnect_initiator_network_duration = new Interval("reconnect_initiator_network_duration", 77, true, event41, event45);
            reconnect_initiator_signaling_shutdown_duration = new Interval("reconnect_initiator_signaling_shutdown_duration", 78, true, event41, Event.reconnect_initiator_signaling_shutdown);
            Event event46 = Event.reconnect_initiator_signaling_init;
            reconnect_initiator_signaling_init_duration = new Interval("reconnect_initiator_signaling_init_duration", 79, true, event45, event46);
            Event event47 = Event.reconnect_initiator_signaling_registered;
            reconnect_initiator_signaling_registration_duration = new Interval("reconnect_initiator_signaling_registration_duration", 80, true, event46, event47);
            Event event48 = Event.reconnect_initiator_signaling_offer;
            reconnect_initiator_signaling_offer_duration = new Interval("reconnect_initiator_signaling_offer_duration", 81, true, event47, event48);
            reconnect_initiator_signaling_answered_duration = new Interval("reconnect_initiator_signaling_answered_duration", 82, true, event48, event42);
            Event event49 = Event.reconnect_receiver_signaling_hangup;
            reconnect_receiver_signaling_hangup_duration = new Interval("reconnect_receiver_signaling_hangup_duration", 83, true, event43, event49);
            Event event50 = Event.reconnect_receiver_ice_restarted;
            reconnect_receiver_ice_restart_duration = new Interval("reconnect_receiver_ice_restart_duration", 84, true, event49, event50);
            reconnect_receiver_signaling_answer_duration = new Interval("reconnect_receiver_signaling_answer_duration", 85, true, event50, event44);
            reconnect_initiator_timeout_duration = new Interval("reconnect_initiator_timeout_duration", 86, true, event40, Event.reconnect_initiator_timeout);
            reconnect_receiver_timeout_duration = new Interval("reconnect_receiver_timeout_duration", 87, true, event40, Event.reconnect_receiver_timeout);
            reconnect_initiator_fail_duration = new Interval("reconnect_initiator_fail_duration", 88, true, event45, Event.reconnect_initiator_fail);
            reconnect_receiver_fail_duration = new Interval("reconnect_receiver_fail_duration", 89, true, event49, Event.reconnect_receiver_fail);
            Event event51 = Event.reconnect_initiator_updatecall_directive_received;
            reconnect_initiator_registered_updatecall_duration = new Interval("reconnect_initiator_registered_updatecall_duration", 90, true, event47, event51);
            reconnect_initiator_updatecall_offer_duration = new Interval("reconnect_initiator_updatecall_offer_duration", 91, true, event51, event48);
            Callee_sipInfoReceived_to_inboundCallerIdSent_msecs = new Interval("Callee_sipInfoReceived_to_inboundCallerIdSent_msecs", 92, true, Event.Callee_Sip_Info_Received, Event.Callee_NotifySpeechletOfCallerId);
            Callee_secondRingCall_to_callerIdTTSReady_msecs = new Interval("Callee_secondRingCall_to_callerIdTTSReady_msecs", 93, true, event28, event39);
            Event event52 = Event.SendDTMF_Directive_Received;
            Event event53 = Event.DTMF_Sent_To_Sip;
            DTMF_DirectiveReceived_to_INFOSent = new Interval("DTMF_DirectiveReceived_to_INFOSent", 94, true, event52, event53);
            DTMF_INFOSent_to_INFOReceived = new Interval("DTMF_INFOSent_to_INFOReceived", 95, true, event53, Event.Sip_Info_Response_Received);
            DTMF_DirectiveReceived_to_RFC2833Sent = new Interval("DTMF_DirectiveReceived_to_RFC2833Sent", 96, true, event52, Event.DTMF_Sent_RFC2833);
            $VALUES = $values();
        }

        private Interval(String str, int i, boolean z, Event event, Event event2) {
            this.mRecordMetric = z;
            this.mBegin = event;
            this.mEnd = event2;
        }

        public static Interval valueOf(String str) {
            return (Interval) Enum.valueOf(Interval.class, str);
        }

        public static Interval[] values() {
            return (Interval[]) $VALUES.clone();
        }

        @Override // com.amazon.comms.instrumentation.EventTracer.Interval
        public boolean recordMetric() {
            return this.mRecordMetric;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.comms.instrumentation.EventTracer.Interval
        public Event getBegin() {
            return this.mBegin;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.comms.instrumentation.EventTracer.Interval
        public Event getEnd() {
            return this.mEnd;
        }
    }
}
