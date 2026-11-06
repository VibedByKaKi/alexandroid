package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class hc implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f701a;
    public final /* synthetic */ String b;

    public hc(Uri uri, String str) {
        this.f701a = uri;
        this.b = str;
    }

    @Override // com.amazon.identity.auth.device.m8
    public final Object a(ContentProviderClient contentProviderClient) {
        Cursor query = contentProviderClient.query(this.f701a, mc.j, this.b, null, null);
        try {
            if (query == null) {
                throw new RuntimeException("Got a null cursor calling Generic IPC central store.");
            }
            if (!query.moveToFirst()) {
                throw new RuntimeException("Got an empty cursor calling Generic IPC central store.");
            }
            int columnIndex = query.getColumnIndex("bundle_value");
            Bundle b = zj.b(columnIndex == -1 ? null : query.getString(columnIndex));
            if (b == null) {
                throw new RuntimeException("Corrupted value returned.");
            }
            query.close();
            return b;
        } finally {
        }
    }
}
