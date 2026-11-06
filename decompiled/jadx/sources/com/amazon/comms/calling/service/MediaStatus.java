package com.amazon.comms.calling.service;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MediaStatus {
    private final boolean localAudioCapable;
    private final boolean localAudioEnabled;
    private final boolean localRealTimeTextEnabled;
    private final boolean localVideoCapable;
    private final boolean localVideoEnabled;
    private final boolean realTimeTextRequested;
    private final boolean remoteAudioCapable;
    private final boolean remoteAudioEnabled;
    private final boolean remoteAudioRequested;
    private final boolean remoteRealTimeTextEnabled;
    private final boolean remoteVideoCapable;
    private final boolean remoteVideoEnabled;
    private final boolean remoteVideoRequested;

    public MediaStatus(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.localAudioCapable = z;
        this.localVideoCapable = z2;
        this.remoteAudioCapable = z3;
        this.remoteVideoCapable = z4;
        this.localAudioEnabled = z5;
        this.localVideoEnabled = z6;
        this.remoteAudioEnabled = z7;
        this.remoteVideoEnabled = z8;
        this.remoteAudioRequested = z9;
        this.remoteVideoRequested = z10;
        this.localRealTimeTextEnabled = z11;
        this.remoteRealTimeTextEnabled = z12;
        this.realTimeTextRequested = z13;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof MediaStatus;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) obj;
        return mediaStatus.canEqual(this) && isLocalAudioCapable() == mediaStatus.isLocalAudioCapable() && isLocalVideoCapable() == mediaStatus.isLocalVideoCapable() && isRemoteAudioCapable() == mediaStatus.isRemoteAudioCapable() && isRemoteVideoCapable() == mediaStatus.isRemoteVideoCapable() && isLocalAudioEnabled() == mediaStatus.isLocalAudioEnabled() && isLocalVideoEnabled() == mediaStatus.isLocalVideoEnabled() && isRemoteAudioEnabled() == mediaStatus.isRemoteAudioEnabled() && isRemoteVideoEnabled() == mediaStatus.isRemoteVideoEnabled() && isRemoteAudioRequested() == mediaStatus.isRemoteAudioRequested() && isRemoteVideoRequested() == mediaStatus.isRemoteVideoRequested() && isLocalRealTimeTextEnabled() == mediaStatus.isLocalRealTimeTextEnabled() && isRemoteRealTimeTextEnabled() == mediaStatus.isRemoteRealTimeTextEnabled() && isRealTimeTextRequested() == mediaStatus.isRealTimeTextRequested();
    }

    public int hashCode() {
        return (((((((((((((((((((((((((isLocalAudioCapable() ? 79 : 97) + 59) * 59) + (isLocalVideoCapable() ? 79 : 97)) * 59) + (isRemoteAudioCapable() ? 79 : 97)) * 59) + (isRemoteVideoCapable() ? 79 : 97)) * 59) + (isLocalAudioEnabled() ? 79 : 97)) * 59) + (isLocalVideoEnabled() ? 79 : 97)) * 59) + (isRemoteAudioEnabled() ? 79 : 97)) * 59) + (isRemoteVideoEnabled() ? 79 : 97)) * 59) + (isRemoteAudioRequested() ? 79 : 97)) * 59) + (isRemoteVideoRequested() ? 79 : 97)) * 59) + (isLocalRealTimeTextEnabled() ? 79 : 97)) * 59) + (isRemoteRealTimeTextEnabled() ? 79 : 97)) * 59) + (isRealTimeTextRequested() ? 79 : 97);
    }

    public boolean isLocalAudioCapable() {
        return this.localAudioCapable;
    }

    public boolean isLocalAudioEnabled() {
        return this.localAudioEnabled;
    }

    public boolean isLocalRealTimeTextEnabled() {
        return this.localRealTimeTextEnabled;
    }

    public boolean isLocalVideoCapable() {
        return this.localVideoCapable;
    }

    public boolean isLocalVideoEnabled() {
        return this.localVideoEnabled;
    }

    public boolean isRealTimeTextRequested() {
        return this.realTimeTextRequested;
    }

    public boolean isRemoteAudioCapable() {
        return this.remoteAudioCapable;
    }

    public boolean isRemoteAudioEnabled() {
        return this.remoteAudioEnabled;
    }

    public boolean isRemoteAudioRequested() {
        return this.remoteAudioRequested;
    }

    public boolean isRemoteRealTimeTextEnabled() {
        return this.remoteRealTimeTextEnabled;
    }

    public boolean isRemoteVideoCapable() {
        return this.remoteVideoCapable;
    }

    public boolean isRemoteVideoEnabled() {
        return this.remoteVideoEnabled;
    }

    public boolean isRemoteVideoRequested() {
        return this.remoteVideoRequested;
    }

    public String toString() {
        boolean z = this.localAudioCapable;
        boolean z2 = this.localVideoCapable;
        boolean z3 = this.remoteAudioCapable;
        boolean z4 = this.remoteVideoCapable;
        boolean z5 = this.localAudioEnabled;
        boolean z6 = this.localVideoEnabled;
        boolean z7 = this.remoteAudioEnabled;
        boolean z8 = this.remoteVideoEnabled;
        boolean z9 = this.remoteAudioRequested;
        boolean z10 = this.remoteVideoRequested;
        boolean z11 = this.localRealTimeTextEnabled;
        boolean z12 = this.remoteRealTimeTextEnabled;
        boolean z13 = this.realTimeTextRequested;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("Capabilities: {local:[", z, ", ", z2, "], remote:[");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z3, ", ", z4, "]}, State: {local:[");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z5, ", ", z6, "], remote:[");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z7, ", ", z8, "]}, Requested: {remote:[");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z9, ", ", z10, "]}, RealTimeText Enabled: {local: [");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z11, "], remote: [", z12, "]}, RealTimeText Requested: {[");
        return a$$ExternalSyntheticOutline0.m(m, z13, "]}");
    }
}
