package org.apache.thrift.orig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TNonblockingMultiFetchStats {
    private int maxResponseBytes;
    private int numConnectErrorServers;
    private int numInvalidFrameSize;
    private int numOverflowedRecvBuf;
    private int numReadCompletedServers;
    private int numTotalServers;
    private long readTime;
    private int totalRecvBufBytes;

    public TNonblockingMultiFetchStats() {
        clear();
    }

    public void clear() {
        this.numTotalServers = 0;
        this.numReadCompletedServers = 0;
        this.numConnectErrorServers = 0;
        this.totalRecvBufBytes = 0;
        this.maxResponseBytes = 0;
        this.numOverflowedRecvBuf = 0;
        this.numInvalidFrameSize = 0;
        this.readTime = 0L;
    }

    public int getMaxResponseBytes() {
        return this.maxResponseBytes;
    }

    public int getNumConnectErrorServers() {
        return this.numConnectErrorServers;
    }

    public int getNumInvalidFrameSize() {
        return this.numInvalidFrameSize;
    }

    public int getNumOverflowedRecvBuf() {
        return this.numOverflowedRecvBuf;
    }

    public int getNumReadCompletedServers() {
        return this.numReadCompletedServers;
    }

    public int getNumTotalServers() {
        return this.numTotalServers;
    }

    public long getReadTime() {
        return this.readTime;
    }

    public int getTotalRecvBufBytes() {
        return this.totalRecvBufBytes;
    }

    public void incNumConnectErrorServers() {
        this.numConnectErrorServers++;
    }

    public void incNumInvalidFrameSize() {
        this.numInvalidFrameSize++;
    }

    public void incNumOverflowedRecvBuf() {
        this.numOverflowedRecvBuf++;
    }

    public void incNumReadCompletedServers() {
        this.numReadCompletedServers++;
    }

    public void incTotalRecvBufBytes(int i) {
        this.totalRecvBufBytes += i;
    }

    public void setMaxResponseBytes(int i) {
        this.maxResponseBytes = i;
    }

    public void setNumTotalServers(int i) {
        this.numTotalServers = i;
    }

    public void setReadTime(long j) {
        this.readTime = j;
    }

    public String toString() {
        return String.format("numTotalServers=%d, numReadCompletedServers=%d, numConnectErrorServers=%d, numUnresponsiveServers=%d, totalRecvBufBytes=%fM, maxResponseBytes=%d, numOverflowedRecvBuf=%d, numInvalidFrameSize=%d, readTime=%dms", Integer.valueOf(this.numTotalServers), Integer.valueOf(this.numReadCompletedServers), Integer.valueOf(this.numConnectErrorServers), Integer.valueOf((this.numTotalServers - this.numReadCompletedServers) - this.numConnectErrorServers), Double.valueOf((this.totalRecvBufBytes / 1024.0d) / 1024.0d), Integer.valueOf(this.maxResponseBytes), Integer.valueOf(this.numOverflowedRecvBuf), Integer.valueOf(this.numInvalidFrameSize), Long.valueOf(this.readTime));
    }
}
