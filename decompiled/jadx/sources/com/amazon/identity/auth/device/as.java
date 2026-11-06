package com.amazon.identity.auth.device;

import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Element;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class as extends cs {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f523a;

    public as(HashMap hashMap) {
        this.f523a = hashMap;
    }

    @Override // com.amazon.identity.auth.device.cs
    public final void a(Element element) {
        HashMap hashMap = this.f523a;
        if (hashMap == null || hashMap.size() == 0) {
            return;
        }
        bs bsVar = new bs("deviceTypeSoftwareVersionMap", null, new cs[0]);
        for (Map.Entry entry : this.f523a.entrySet()) {
            ao aoVar = (ao) entry.getValue();
            if (aoVar == null || aoVar.f464a == null || aoVar.b == null || entry.getKey() == null) {
                yf.b("XMLDeviceTypeSoftwareVersionMap", "Skipping version for entry %s - version not present", entry.getKey());
            } else {
                bsVar.c.add(new bs("entry", null, new yr("deviceType", (String) entry.getKey()), new yr("version", ((ao) entry.getValue()).f464a.toString()), new yr("softwareComponentId", ((ao) entry.getValue()).b)));
            }
        }
        element.appendChild(bsVar.b(element.getOwnerDocument()));
    }
}
