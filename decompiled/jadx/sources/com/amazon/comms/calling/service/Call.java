package com.amazon.comms.calling.service;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.calling.service.DropInController;
import com.amazon.comms.calling.sipclient.CallDetails;
import com.amazon.comms.calling.sipclient.SipHeaders;
import com.amazon.comms.instrumentation.EventTracer;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Map;
import lombok.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface Call {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AcceptParams {
        private final boolean callReconnectInitiation;
        private final boolean calleeDropInPermission;
        private final String calleeName;
        private final boolean callerDropInPermission;
        private final String callerName;
        private final DropInController.UserPreference dropInUserPreference;
        private final double frostedTransitionTime;
        private final double totalFrostTime;
        private final boolean videoEnabled;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class AcceptParamsBuilder {
            private boolean callReconnectInitiation$set;
            private boolean callReconnectInitiation$value;
            private boolean calleeDropInPermission;
            private String calleeName;
            private boolean callerDropInPermission;
            private String callerName;
            private DropInController.UserPreference dropInUserPreference;
            private double frostedTransitionTime;
            private double totalFrostTime;
            private boolean videoEnabled = true;

            public AcceptParams build() {
                boolean z = this.callReconnectInitiation$value;
                if (!this.callReconnectInitiation$set) {
                    z = AcceptParams.$default$callReconnectInitiation();
                }
                return new AcceptParams(this.dropInUserPreference, this.totalFrostTime, this.frostedTransitionTime, this.videoEnabled, this.callerName, this.calleeName, this.callerDropInPermission, this.calleeDropInPermission, z);
            }

            public AcceptParamsBuilder callReconnectInitiation(boolean z) {
                this.callReconnectInitiation$value = z;
                this.callReconnectInitiation$set = true;
                return this;
            }

            public AcceptParamsBuilder calleeDropInPermission(boolean z) {
                this.calleeDropInPermission = z;
                return this;
            }

            public AcceptParamsBuilder calleeName(String str) {
                this.calleeName = str;
                return this;
            }

            public AcceptParamsBuilder callerDropInPermission(boolean z) {
                this.callerDropInPermission = z;
                return this;
            }

            public AcceptParamsBuilder callerName(String str) {
                this.callerName = str;
                return this;
            }

            public AcceptParamsBuilder dropInUserPreference(DropInController.UserPreference userPreference) {
                this.dropInUserPreference = userPreference;
                return this;
            }

            public AcceptParamsBuilder frostedTransitionTime(double d) {
                this.frostedTransitionTime = d;
                return this;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Call.AcceptParams.AcceptParamsBuilder(dropInUserPreference=");
                sb.append(this.dropInUserPreference);
                sb.append(", totalFrostTime=");
                sb.append(this.totalFrostTime);
                sb.append(", frostedTransitionTime=");
                sb.append(this.frostedTransitionTime);
                sb.append(", videoEnabled=");
                sb.append(this.videoEnabled);
                sb.append(", callerName=");
                sb.append(this.callerName);
                sb.append(", calleeName=");
                sb.append(this.calleeName);
                sb.append(", callerDropInPermission=");
                sb.append(this.callerDropInPermission);
                sb.append(", calleeDropInPermission=");
                sb.append(this.calleeDropInPermission);
                sb.append(", callReconnectInitiation$value=");
                return a$$ExternalSyntheticOutline0.m(sb, this.callReconnectInitiation$value, MarkdownConstants.RIGHT_PARENTHESIS);
            }

            public AcceptParamsBuilder totalFrostTime(double d) {
                this.totalFrostTime = d;
                return this;
            }

            public AcceptParamsBuilder videoEnabled(boolean z) {
                this.videoEnabled = z;
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean $default$callReconnectInitiation() {
            return false;
        }

        public AcceptParams(DropInController.UserPreference userPreference, double d, double d2, boolean z, String str, String str2, boolean z2, boolean z3, boolean z4) {
            this.dropInUserPreference = userPreference;
            this.totalFrostTime = d;
            this.frostedTransitionTime = d2;
            this.videoEnabled = z;
            this.callerName = str;
            this.calleeName = str2;
            this.callerDropInPermission = z2;
            this.calleeDropInPermission = z3;
            this.callReconnectInitiation = z4;
        }

        public static AcceptParamsBuilder builder() {
            return new AcceptParamsBuilder();
        }

        public String getCalleeName() {
            return this.calleeName;
        }

        public String getCallerName() {
            return this.callerName;
        }

        public DropInController.UserPreference getDropInUserPreference() {
            return this.dropInUserPreference;
        }

        public double getFrostedTransitionTime() {
            return this.frostedTransitionTime;
        }

        public double getTotalFrostTime() {
            return this.totalFrostTime;
        }

        public boolean isCallReconnectInitiation() {
            return this.callReconnectInitiation;
        }

        public boolean isCalleeDropInPermission() {
            return this.calleeDropInPermission;
        }

        public boolean isCallerDropInPermission() {
            return this.callerDropInPermission;
        }

        public boolean isVideoEnabled() {
            return this.videoEnabled;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CallInfoParams {
        private final String calleeEndpointDescription;
        private final String calleeName;
        private final String callerEndpointDescription;
        private final String callerName;
        private final Map<State, TimeoutRule> stateTransitionTimeouts;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public static class CallInfoParamsBuilder {
            private String calleeEndpointDescription;
            private String calleeName;
            private String callerEndpointDescription;
            private String callerName;
            private Map<State, TimeoutRule> stateTransitionTimeouts;

            public CallInfoParams build() {
                return new CallInfoParams(this.callerName, this.callerEndpointDescription, this.calleeName, this.calleeEndpointDescription, this.stateTransitionTimeouts);
            }

            public CallInfoParamsBuilder calleeEndpointDescription(String str) {
                this.calleeEndpointDescription = str;
                return this;
            }

            public CallInfoParamsBuilder calleeName(String str) {
                this.calleeName = str;
                return this;
            }

            public CallInfoParamsBuilder callerEndpointDescription(String str) {
                this.callerEndpointDescription = str;
                return this;
            }

            public CallInfoParamsBuilder callerName(String str) {
                this.callerName = str;
                return this;
            }

            public CallInfoParamsBuilder stateTransitionTimeouts(Map<State, TimeoutRule> map) {
                this.stateTransitionTimeouts = map;
                return this;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Call.CallInfoParams.CallInfoParamsBuilder(callerName=");
                sb.append(this.callerName);
                sb.append(", callerEndpointDescription=");
                sb.append(this.callerEndpointDescription);
                sb.append(", calleeName=");
                sb.append(this.calleeName);
                sb.append(", calleeEndpointDescription=");
                sb.append(this.calleeEndpointDescription);
                sb.append(", stateTransitionTimeouts=");
                return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.stateTransitionTimeouts, MarkdownConstants.RIGHT_PARENTHESIS);
            }
        }

        public CallInfoParams(String str, String str2, String str3, String str4, Map<State, TimeoutRule> map) {
            this.callerName = str;
            this.callerEndpointDescription = str2;
            this.calleeName = str3;
            this.calleeEndpointDescription = str4;
            this.stateTransitionTimeouts = map;
        }

        public static CallInfoParamsBuilder builder() {
            return new CallInfoParamsBuilder();
        }

        public String getCalleeEndpointDescription() {
            return this.calleeEndpointDescription;
        }

        public String getCalleeName() {
            return this.calleeName;
        }

        public String getCallerEndpointDescription() {
            return this.callerEndpointDescription;
        }

        public String getCallerName() {
            return this.callerName;
        }

        public Map<State, TimeoutRule> getStateTransitionTimeouts() {
            return this.stateTransitionTimeouts;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum HangupRequest {
        Everywhere,
        ThisDevice
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Side {
        Local,
        Remote
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SignalingType {
        SessionInitiationProtocol,
        Alexa
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State {
        Created,
        Ringing,
        Active,
        OnLocalHold,
        OnRemoteHold,
        Complete
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum VideoEffect {
        None,
        Frosted
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class VideoViewDimensions {
        private final int rotation;
        private final int videoHeight;
        private final int videoWidth;

        public VideoViewDimensions(int i, int i2, int i3) {
            this.videoWidth = i;
            this.videoHeight = i2;
            this.rotation = i3;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getVideoHeight() {
            return this.videoHeight;
        }

        public int getVideoWidth() {
            return this.videoWidth;
        }
    }

    void accept(AcceptParams acceptParams);

    void acknowledgeCall();

    CallDetails getCallDetails();

    String getCallId();

    DropInController getDropInController();

    EventTracer getEventTracer();

    SipHeaders getIncomingHeaders();

    MediaStateChangeTrigger getLastMediaStateChangeTrigger();

    Participant getLocalParticipant();

    VideoViewDimensions getLocalVideoViewDimensions();

    MediaStats getMediaStats();

    MediaStatus getMediaStatus();

    Side getOrigin();

    SipHeaders getOutgoingHeaders();

    String getProvider();

    Participant getRemoteParticipant();

    VideoViewDimensions getRemoteVideoViewDimensions();

    SignalingType getSignalingType();

    State getState();

    VideoEffect getVideoEffect();

    void hangup(HangupRequest hangupRequest);

    boolean isAccepted();

    boolean isCheckInCall();

    boolean isDropInCall();

    boolean isVideoRequested();

    void notifyRinging();

    void registerCallListener(CallListener callListener);

    void registerCameraEventsListener(CameraEventsListener cameraEventsListener);

    void registerCameraPreSwitchListener(CameraPreSwitchListener cameraPreSwitchListener);

    void registerDataChannelEventListener(DataChannelEventListener dataChannelEventListener);

    void registerMediaListener(MediaListener mediaListener);

    void registerRealTimeTextListener(RealTimeTextListener realTimeTextListener);

    void sendData(@NonNull DataChannelDTO dataChannelDTO);

    void sendDtmfTones(String str, int i, int i2);

    void sendRealTimeTextData(byte[] bArr);

    void setAudioAttributeCapable(boolean z);

    void setLocalAudioState(boolean z);

    void setLocalMediaCapability(boolean z, boolean z2);

    void setLocalVideoPermitted(boolean z);

    void setLocalVideoState(boolean z);

    void setVideoEffect(VideoEffect videoEffect, double d);

    void switchCamera();

    void switchCamera(String str);

    void switchCameraPostSetup(String str);

    void transferAudioToOutputDevice(int i);

    void unregisterCallListener(CallListener callListener);

    void unregisterCameraEventsListener(CameraEventsListener cameraEventsListener);

    void unregisterCameraPreSwitchListener(CameraPreSwitchListener cameraPreSwitchListener);

    void unregisterDataChannelEventListener(DataChannelEventListener dataChannelEventListener);

    void unregisterMediaListener(MediaListener mediaListener);

    void unregisterRealTimeTextListener(RealTimeTextListener realTimeTextListener);

    void updateCallInfo(CallInfoParams callInfoParams);
}
