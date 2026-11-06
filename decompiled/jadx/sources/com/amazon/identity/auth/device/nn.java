package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.net.Uri;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class nn implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f841a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ qn d;

    public nn(qn qnVar, Uri uri, String str, String[] strArr) {
        this.d = qnVar;
        this.f841a = uri;
        this.b = str;
        this.c = strArr;
    }

    @Override // com.amazon.identity.auth.device.m8
    public final Object a(ContentProviderClient contentProviderClient) {
        return Integer.valueOf(this.d.b.delete(this.f841a, this.b, this.c));
    }
}
