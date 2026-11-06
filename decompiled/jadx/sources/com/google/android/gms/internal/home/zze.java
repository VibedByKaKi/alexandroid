package com.google.android.gms.internal.home;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zze {
    public static InetAddress zza(String str) {
        int lastIndexOf = str.lastIndexOf(37);
        if (lastIndexOf < 0) {
            return zzbc.zzb(str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1));
            InetAddress zzb = zzbc.zzb(str.substring(0, lastIndexOf));
            if (!(zzb instanceof Inet6Address)) {
                return zzb;
            }
            try {
                return Inet6Address.getByAddress(zzb.getHostAddress(), zzb.getAddress(), parseInt);
            } catch (UnknownHostException e) {
                Single$$ExternalSyntheticBUOutline0.m("Failed to parse address string ".concat(str), e);
                return null;
            }
        } catch (NumberFormatException e2) {
            Single$$ExternalSyntheticBUOutline0.m("Failed to parse scope ID from address ".concat(str), e2);
            return null;
        }
    }
}
