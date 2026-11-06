package com.amazon.credentiallocker;

import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Generated
@CoralSuppressWarnings
@Documentation("ThreadParty is a parameter of ThreadNetwork that indicates if the given network is 1P, 2P, or 3P.\n        Party information like this is needed because treatment of Thread network processes like creation and\n        deletion are dependent on the origins of the network in question.")
/* loaded from: classes19.dex */
public class ThreadParty {
    public static final String First = "First";
    public static final String Second = "Second";
    public static final String Third = "Third";
    private static final String[] values = {First, Second, Third};

    private ThreadParty() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
