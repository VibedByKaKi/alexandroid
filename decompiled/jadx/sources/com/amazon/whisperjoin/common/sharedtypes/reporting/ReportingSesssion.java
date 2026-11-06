package com.amazon.whisperjoin.common.sharedtypes.reporting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ReportingSesssion {
    private int mSequenceNumber = 1;
    private final String mUrl;

    public ReportingSesssion(String str) {
        this.mUrl = str;
    }

    public int getNextSequenceNumber() {
        int i = this.mSequenceNumber;
        this.mSequenceNumber = i + 1;
        return i;
    }

    public String getUrl() {
        return this.mUrl;
    }
}
