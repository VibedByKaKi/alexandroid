package com.amazon.whisperjoin.common.sharedtypes.devices;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceCapabilities {
    private static final Set<String> sProductsUsingRTOS;
    private static final Set<String> sProductsWithTokenVendedFromDSS;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("89SM");
        hashSet.add("CbtN");
        sProductsWithTokenVendedFromDSS = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add("ebK3");
        hashSet2.add("Q9Lm");
        sProductsUsingRTOS = Collections.unmodifiableSet(hashSet2);
    }

    public static boolean ifRTOSSdk(String str) {
        return sProductsUsingRTOS.contains(str);
    }

    public static boolean isTokenVendedFromDSS(String str) {
        return sProductsWithTokenVendedFromDSS.contains(str);
    }
}
