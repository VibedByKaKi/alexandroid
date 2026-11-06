package com.amazon.identity.auth.device;

import android.text.TextUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class in {

    /* renamed from: a, reason: collision with root package name */
    public final String f732a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public in(String str) {
        this.f732a = str;
    }

    public final in a(String str, String str2) {
        this.b.add(str);
        this.c.add(str + " " + str2);
        return this;
    }

    public final String toString() {
        String str = this.f732a;
        ArrayList arrayList = this.c;
        return a$$ExternalSyntheticOutline0.m("CREATE TABLE ", str, " (", arrayList == null ? null : TextUtils.join(", ", arrayList), ");");
    }
}
