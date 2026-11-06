package com.here.sdk.core;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class InetAddressConverter {
    public static InetAddress convertFromInternal(InetAddressInternal inetAddressInternal) {
        try {
            return InetAddress.getByName(inetAddressInternal.address);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static InetAddressInternal convertToInternal(InetAddress inetAddress) {
        return new InetAddressInternal(inetAddress.getHostAddress());
    }
}
