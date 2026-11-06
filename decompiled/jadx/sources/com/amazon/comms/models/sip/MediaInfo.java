package com.amazon.comms.models.sip;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonDeserialize(builder = MediaInfoBuilder.class)
/* loaded from: classes20.dex */
public final class MediaInfo {
    private final SRTPConfig srtp;
    private final RDNEndpoint stun;
    private final RDNEndpoint turnTCP;
    private final RDNEndpoint turnUDP;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @JsonPOJOBuilder(withPrefix = "")
    public static class MediaInfoBuilder {
        private SRTPConfig srtp;
        private RDNEndpoint stun;
        private RDNEndpoint turnTCP;
        private RDNEndpoint turnUDP;

        public MediaInfo build() {
            return new MediaInfo(this.turnUDP, this.turnTCP, this.stun, this.srtp);
        }

        public MediaInfoBuilder srtp(SRTPConfig sRTPConfig) {
            this.srtp = sRTPConfig;
            return this;
        }

        public MediaInfoBuilder stun(RDNEndpoint rDNEndpoint) {
            this.stun = rDNEndpoint;
            return this;
        }

        public String toString() {
            String valueOf = String.valueOf(this.turnUDP);
            String valueOf2 = String.valueOf(this.turnTCP);
            return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("MediaInfo.MediaInfoBuilder(turnUDP=", valueOf, ", turnTCP=", valueOf2, ", stun="), String.valueOf(this.stun), ", srtp=", String.valueOf(this.srtp), MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public MediaInfoBuilder turnTCP(RDNEndpoint rDNEndpoint) {
            this.turnTCP = rDNEndpoint;
            return this;
        }

        public MediaInfoBuilder turnUDP(RDNEndpoint rDNEndpoint) {
            this.turnUDP = rDNEndpoint;
            return this;
        }
    }

    public MediaInfo(RDNEndpoint rDNEndpoint, RDNEndpoint rDNEndpoint2, RDNEndpoint rDNEndpoint3, SRTPConfig sRTPConfig) {
        this.turnUDP = rDNEndpoint;
        this.turnTCP = rDNEndpoint2;
        this.stun = rDNEndpoint3;
        this.srtp = sRTPConfig;
    }

    public static MediaInfoBuilder builder() {
        return new MediaInfoBuilder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        RDNEndpoint turnUDP = getTurnUDP();
        RDNEndpoint turnUDP2 = mediaInfo.getTurnUDP();
        if (turnUDP != null ? !turnUDP.equals(turnUDP2) : turnUDP2 != null) {
            return false;
        }
        RDNEndpoint turnTCP = getTurnTCP();
        RDNEndpoint turnTCP2 = mediaInfo.getTurnTCP();
        if (turnTCP != null ? !turnTCP.equals(turnTCP2) : turnTCP2 != null) {
            return false;
        }
        RDNEndpoint stun = getStun();
        RDNEndpoint stun2 = mediaInfo.getStun();
        if (stun != null ? !stun.equals(stun2) : stun2 != null) {
            return false;
        }
        SRTPConfig srtp = getSrtp();
        SRTPConfig srtp2 = mediaInfo.getSrtp();
        return srtp != null ? srtp.equals(srtp2) : srtp2 == null;
    }

    public SRTPConfig getSrtp() {
        return this.srtp;
    }

    public RDNEndpoint getStun() {
        return this.stun;
    }

    public RDNEndpoint getTurnTCP() {
        return this.turnTCP;
    }

    public RDNEndpoint getTurnUDP() {
        return this.turnUDP;
    }

    public int hashCode() {
        RDNEndpoint turnUDP = getTurnUDP();
        int hashCode = turnUDP == null ? 43 : turnUDP.hashCode();
        RDNEndpoint turnTCP = getTurnTCP();
        int hashCode2 = ((hashCode + 59) * 59) + (turnTCP == null ? 43 : turnTCP.hashCode());
        RDNEndpoint stun = getStun();
        int i = hashCode2 * 59;
        int hashCode3 = stun == null ? 43 : stun.hashCode();
        SRTPConfig srtp = getSrtp();
        return ((i + hashCode3) * 59) + (srtp != null ? srtp.hashCode() : 43);
    }

    public String toString() {
        String valueOf = String.valueOf(getTurnUDP());
        String valueOf2 = String.valueOf(getTurnTCP());
        return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("MediaInfo(turnUDP=", valueOf, ", turnTCP=", valueOf2, ", stun="), String.valueOf(getStun()), ", srtp=", String.valueOf(getSrtp()), MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
