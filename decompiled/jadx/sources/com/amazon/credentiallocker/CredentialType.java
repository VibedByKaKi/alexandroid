package com.amazon.credentiallocker;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
/* loaded from: classes19.dex */
public class CredentialType {
    public static final String Thread = "Thread";
    public static final String Wifi = "Wifi";
    private static final String[] values = {"Wifi", "Thread"};

    private CredentialType() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
