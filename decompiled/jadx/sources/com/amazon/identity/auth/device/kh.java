package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.api.AuthenticationType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class kh {
    public static boolean a(fr frVar) {
        if (!"true".equals(new ap().a("persist.map.use_oauth"))) {
            return false;
        }
        AuthenticationType authenticationType = AuthenticationType.OAuth;
        frVar.k = authenticationType;
        if (authenticationType != null) {
            frVar.j = authenticationType != AuthenticationType.None;
        }
        return true;
    }
}
