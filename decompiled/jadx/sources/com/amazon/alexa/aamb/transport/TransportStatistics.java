package com.amazon.alexa.aamb.transport;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class TransportStatistics {
    public static final int K_FLAG_PING = 1024;
    public static final int K_FLAG_PONG = 2048;
    private static final String TAG = "TransportStatistics";
    private AtomicInteger tcpFrames = new AtomicInteger(0);
    private AtomicInteger pingFrames = new AtomicInteger(0);
    private long pingTime = 0;
    private long roundTripLatency = 0;

    public AtomicInteger getPingFrames() {
        return this.pingFrames;
    }

    public long getPingTime() {
        return this.pingTime;
    }

    public AtomicInteger getTcpFrames() {
        return this.tcpFrames;
    }

    public void setPingTime(long j) {
        this.pingTime = j;
    }

    public void setRoundTripLatency(long j) {
        this.roundTripLatency = j;
    }
}
