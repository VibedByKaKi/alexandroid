package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.framework.RemoteMAPException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class x3 {
    public static String a(qn qnVar, String str) {
        try {
            return (String) qnVar.a(ra.f915a, new v3(str));
        } catch (RemoteMAPException e) {
            jg.a("CouldNotContactADIP:".concat(str));
            throw e;
        }
    }
}
