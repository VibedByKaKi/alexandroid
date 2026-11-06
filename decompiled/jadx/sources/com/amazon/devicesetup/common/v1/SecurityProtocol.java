package com.amazon.devicesetup.common.v1;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("Wi-Fi security protocol.")
/* loaded from: classes5.dex */
public class SecurityProtocol {
    public static final String OPEN = "OPEN";
    public static final String OTHER = "OTHER";
    public static final String WEP = "WEP";
    public static final String WPA_PSK = "WPA_PSK";
    private static final String[] values = {WPA_PSK, "WEP", "OPEN", "OTHER"};

    private SecurityProtocol() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
