package com.amazon.identity.auth.device;

import org.w3c.dom.Element;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class zr extends cs {

    /* renamed from: a, reason: collision with root package name */
    public final String f1115a;

    public zr(String str) {
        this.f1115a = str;
    }

    @Override // com.amazon.identity.auth.device.cs
    public final void a(Element element) {
        element.appendChild(element.getOwnerDocument().createCDATASection(this.f1115a));
    }
}
