package org.apache.commons.net.ntp;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TimeInfo {
    private List<String> comments;
    private Long delayMillis;
    private boolean detailsComputed;
    private final NtpV3Packet message;
    private Long offsetMillis;
    private final long returnTimeMillis;

    public TimeInfo(NtpV3Packet ntpV3Packet, long j, List<String> list, boolean z) {
        if (ntpV3Packet == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("message cannot be null");
            throw null;
        }
        this.returnTimeMillis = j;
        this.message = ntpV3Packet;
        this.comments = list;
        if (z) {
            computeDetails();
        }
    }

    public void addComment(String str) {
        if (this.comments == null) {
            this.comments = new ArrayList();
        }
        this.comments.add(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void computeDetails() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ntp.TimeInfo.computeDetails():void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TimeInfo timeInfo = (TimeInfo) obj;
            if (this.returnTimeMillis == timeInfo.returnTimeMillis && this.message.equals(timeInfo.message)) {
                return true;
            }
        }
        return false;
    }

    public InetAddress getAddress() {
        DatagramPacket datagramPacket = this.message.getDatagramPacket();
        if (datagramPacket == null) {
            return null;
        }
        return datagramPacket.getAddress();
    }

    public List<String> getComments() {
        return this.comments;
    }

    public Long getDelay() {
        return this.delayMillis;
    }

    public NtpV3Packet getMessage() {
        return this.message;
    }

    public Long getOffset() {
        return this.offsetMillis;
    }

    public long getReturnTime() {
        return this.returnTimeMillis;
    }

    public int hashCode() {
        return this.message.hashCode() + (((int) this.returnTimeMillis) * 31);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j, List<String> list) {
        this(ntpV3Packet, j, list, true);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j, boolean z) {
        this(ntpV3Packet, j, null, z);
    }

    public TimeInfo(NtpV3Packet ntpV3Packet, long j) {
        this(ntpV3Packet, j, null, true);
    }
}
