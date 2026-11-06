package com.amazon.comms.calling.service;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.comms.calling.service.Call;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HistoricalCall {
    private final String callId;
    private final boolean dropIn;
    private final Participant localParticipant;
    private final Call.Side origin;
    private final Participant remoteParticipant;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class HistoricalCallBuilder {
        private String callId;
        private boolean dropIn;
        private Participant localParticipant;
        private Call.Side origin;
        private Participant remoteParticipant;

        public HistoricalCall build() {
            return new HistoricalCall(this.callId, this.origin, this.localParticipant, this.remoteParticipant, this.dropIn);
        }

        public HistoricalCallBuilder callId(String str) {
            this.callId = str;
            return this;
        }

        public HistoricalCallBuilder dropIn(boolean z) {
            this.dropIn = z;
            return this;
        }

        public HistoricalCallBuilder localParticipant(Participant participant) {
            this.localParticipant = participant;
            return this;
        }

        public HistoricalCallBuilder origin(Call.Side side) {
            this.origin = side;
            return this;
        }

        public HistoricalCallBuilder remoteParticipant(Participant participant) {
            this.remoteParticipant = participant;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HistoricalCall.HistoricalCallBuilder(callId=");
            sb.append(this.callId);
            sb.append(", origin=");
            sb.append(this.origin);
            sb.append(", localParticipant=");
            sb.append(this.localParticipant);
            sb.append(", remoteParticipant=");
            sb.append(this.remoteParticipant);
            sb.append(", dropIn=");
            return a$$ExternalSyntheticOutline0.m(sb, this.dropIn, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public HistoricalCallBuilder withCall(Call call) {
            return callId(call.getCallId()).origin(call.getOrigin()).localParticipant(call.getLocalParticipant()).remoteParticipant(call.getRemoteParticipant()).dropIn(call.isDropInCall());
        }
    }

    public HistoricalCall(String str, Call.Side side, Participant participant, Participant participant2, boolean z) {
        this.callId = str;
        this.origin = side;
        this.localParticipant = participant;
        this.remoteParticipant = participant2;
        this.dropIn = z;
    }

    public static HistoricalCallBuilder builder() {
        return new HistoricalCallBuilder();
    }

    public String getCallId() {
        return this.callId;
    }

    public Participant getLocalParticipant() {
        return this.localParticipant;
    }

    public Call.Side getOrigin() {
        return this.origin;
    }

    public Participant getRemoteParticipant() {
        return this.remoteParticipant;
    }

    public boolean isDropIn() {
        return this.dropIn;
    }
}
