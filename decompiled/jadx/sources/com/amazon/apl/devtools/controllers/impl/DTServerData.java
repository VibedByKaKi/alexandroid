package com.amazon.apl.devtools.controllers.impl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DTServerData {
    private static final int DEFAULT_PORT = 9092;
    public static final int MAX_RETRIES = 15;
    private static DTServerData sInstance;
    private int mPortNumer = DEFAULT_PORT;
    private int mRetryCount = 0;

    private DTServerData() {
    }

    public static DTServerData getInstance() {
        if (sInstance == null) {
            sInstance = new DTServerData();
        }
        return sInstance;
    }

    public int getPortNumber() {
        return this.mPortNumer;
    }

    public int getRetryCount() {
        return this.mRetryCount;
    }

    public void incrementRetryCount() {
        this.mRetryCount++;
    }

    public void reset() {
        this.mRetryCount = 0;
        this.mPortNumer = DEFAULT_PORT;
    }

    public void setPortNumber(int i) {
        this.mPortNumer = i;
    }
}
