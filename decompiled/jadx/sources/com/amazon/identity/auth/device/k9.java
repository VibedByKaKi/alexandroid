package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class k9 implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f768a;

    public k9(Uri uri) {
        this.f768a = uri;
    }

    @Override // com.amazon.identity.auth.device.m8
    public final Object a(ContentProviderClient contentProviderClient) {
        Cursor query = contentProviderClient.query(this.f768a, new String[]{"value"}, null, null, null);
        String str = null;
        if (query == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                str = query.getString(query.getColumnIndex("value"));
            }
            return str;
        } finally {
            query.close();
        }
    }
}
