package com.amazon.credentiallocker;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("NetworkTags represent attributes of Networks that are separate from the content of the credentials and\n        themselves. Tags should not contain '#'.")
/* loaded from: classes19.dex */
public class NetworkTag {
    public static final String Public = "Public";
    public static final String Internal = "Internal";
    public static final String Pseudo = "Pseudo";
    private static final String[] values = {Public, Internal, Pseudo};

    private NetworkTag() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
