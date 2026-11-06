package com.amazon.credentiallocker;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("Type of wifi network wpa, wep, guest, etc. You can select WPAPSK for wpa and NONE for any other network.")
/* loaded from: classes19.dex */
public class KeyManagement {
    public static final String NONE = "NONE";
    public static final String WPA2_EAP = "WPA2_EAP";
    public static final String WPAPSK = "WPAPSK";
    private static final String[] values = {"NONE", "WPAPSK", "WPA2_EAP"};

    private KeyManagement() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
