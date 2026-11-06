package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class x7 implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f1061a;
    public final /* synthetic */ String b;

    public x7(Uri uri, String str) {
        this.f1061a = uri;
        this.b = str;
    }

    @Override // com.amazon.identity.auth.device.m8
    public final Object a(ContentProviderClient contentProviderClient) {
        Cursor query = contentProviderClient.query(this.f1061a, (String[]) y7.f.toArray(new String[0]), this.b, null, null);
        try {
            Bundle a2 = y7.a(query, this.b);
            if (query != null) {
                query.close();
            }
            return a2;
        } finally {
        }
    }
}
