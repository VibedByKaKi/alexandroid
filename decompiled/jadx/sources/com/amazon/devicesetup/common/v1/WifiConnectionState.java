package com.amazon.devicesetup.common.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("Wi-Fi connection state.")
/* loaded from: classes5.dex */
public class WifiConnectionState {
    public static final String ASSOCIATED = "ASSOCIATED";
    public static final String AUTHENTICATED = "AUTHENTICATED";
    public static final String DISCONNECTED = "DISCONNECTED";
    public static final String FAILED = "FAILED";
    public static final String UNAUTHENTICATED = "UNAUTHENTICATED";
    public static final String IDLE = "IDLE";
    private static final String[] values = {IDLE, "DISCONNECTED", "UNAUTHENTICATED", "AUTHENTICATED", "ASSOCIATED", "FAILED"};

    private WifiConnectionState() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
