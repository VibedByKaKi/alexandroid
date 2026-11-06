package com.amazon.credentiallocker;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("Type of the authentication method used in the extensible authentication protocol with the WPA2_EAP network type.\n        Currently, we only support EAP-TLS.")
/* loaded from: classes19.dex */
public class EapAuthenticationMethod {
    public static final String EAP_TLS = "EAP_TLS";
    private static final String[] values = {EAP_TLS};

    private EapAuthenticationMethod() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
