package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.dee.application.service.common.logging.RedactInLogs;
import com.fasterxml.jackson.annotation.JsonInclude;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@RedactInLogs
/* loaded from: classes20.dex */
public class CallMediaState {
    public static final String MEDIA_OFF = "OFF";
    public static final String MEDIA_ON = "ON";
    public static final String VIDEO_FROST = "FROST";
    private String outboundAudio;
    private String outboundVideo;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CallMediaStateBuilder {
        private String outboundAudio;
        private String outboundVideo;

        public CallMediaState build() {
            return new CallMediaState(this.outboundAudio, this.outboundVideo, 0);
        }

        public CallMediaStateBuilder outboundAudio(String str) {
            this.outboundAudio = str;
            return this;
        }

        public CallMediaStateBuilder outboundVideo(String str) {
            this.outboundVideo = str;
            return this;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("CallMediaState.CallMediaStateBuilder(outboundAudio=", this.outboundAudio, ", outboundVideo=", this.outboundVideo, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    private CallMediaState(String str, String str2) {
        this.outboundAudio = str;
        this.outboundVideo = str2;
    }

    public static CallMediaStateBuilder builder() {
        return new CallMediaStateBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof CallMediaState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CallMediaState)) {
            return false;
        }
        CallMediaState callMediaState = (CallMediaState) obj;
        if (!callMediaState.canEqual(this)) {
            return false;
        }
        String outboundAudio = getOutboundAudio();
        String outboundAudio2 = callMediaState.getOutboundAudio();
        if (outboundAudio != null ? !outboundAudio.equals(outboundAudio2) : outboundAudio2 != null) {
            return false;
        }
        String outboundVideo = getOutboundVideo();
        String outboundVideo2 = callMediaState.getOutboundVideo();
        return outboundVideo != null ? outboundVideo.equals(outboundVideo2) : outboundVideo2 == null;
    }

    public String getOutboundAudio() {
        return this.outboundAudio;
    }

    public String getOutboundVideo() {
        return this.outboundVideo;
    }

    public int hashCode() {
        String outboundAudio = getOutboundAudio();
        int hashCode = outboundAudio == null ? 43 : outboundAudio.hashCode();
        String outboundVideo = getOutboundVideo();
        return ((hashCode + 59) * 59) + (outboundVideo != null ? outboundVideo.hashCode() : 43);
    }

    public void setOutboundAudio(String str) {
        this.outboundAudio = str;
    }

    public void setOutboundVideo(String str) {
        this.outboundVideo = str;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("CallMediaState(outboundAudio=", getOutboundAudio(), ", outboundVideo=", getOutboundVideo(), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public CallMediaState() {
    }

    public /* synthetic */ CallMediaState(String str, String str2, int i) {
        this(str, str2);
    }
}
