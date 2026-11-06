package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class on implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f862a;
    public final /* synthetic */ ContentValues b;
    public final /* synthetic */ qn c;

    public on(qn qnVar, Uri uri, ContentValues contentValues) {
        this.c = qnVar;
        this.f862a = uri;
        this.b = contentValues;
    }

    @Override // com.amazon.identity.auth.device.m8
    public final Object a(ContentProviderClient contentProviderClient) {
        return this.c.b.insert(this.f862a, this.b);
    }
}
