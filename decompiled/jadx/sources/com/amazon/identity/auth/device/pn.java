package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class pn implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f883a;
    public final /* synthetic */ ContentValues b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String[] d;
    public final /* synthetic */ qn e;

    public pn(qn qnVar, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        this.e = qnVar;
        this.f883a = uri;
        this.b = contentValues;
        this.c = str;
        this.d = strArr;
    }

    @Override // com.amazon.identity.auth.device.m8
    public final Object a(ContentProviderClient contentProviderClient) {
        return Integer.valueOf(this.e.b.update(this.f883a, this.b, this.c, this.d));
    }
}
