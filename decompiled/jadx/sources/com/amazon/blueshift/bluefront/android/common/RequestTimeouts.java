package com.amazon.blueshift.bluefront.android.common;

import com.google.common.base.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class RequestTimeouts {
    public static final int DEFAULT_CONNECTION_TIMEOUT_MILLIS = 3000;
    public static final int DEFAULT_RESPONSE_TIMEOUT_MILLIS = 5000;
    private final int mConnectionTimeoutMillis;
    private final int mResponseTimeoutMillis;

    public RequestTimeouts(int i, int i2) {
        Preconditions.checkArgument(i > 0, "Response timeout must be positive.");
        Preconditions.checkArgument(i2 > 0, "Connection timeout must be positive.");
        this.mResponseTimeoutMillis = i;
        this.mConnectionTimeoutMillis = i2;
    }

    public int getConnectionTimeoutMillis() {
        return this.mConnectionTimeoutMillis;
    }

    public int getResponseTimeoutMillis() {
        return this.mResponseTimeoutMillis;
    }

    public RequestTimeouts() {
        this(5000, 3000);
    }
}
