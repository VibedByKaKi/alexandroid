package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class mm implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f815a;

    public mm(Uri uri) {
        this.f815a = uri;
    }

    @Override // com.amazon.identity.auth.device.m8
    public final Object a(ContentProviderClient contentProviderClient) {
        Uri uri = this.f815a;
        List list = ff.b;
        Cursor query = contentProviderClient.query(uri, (String[]) list.toArray(new String[list.size()]), null, null, null);
        if (query == null) {
            return null;
        }
        try {
            LinkedList linkedList = new LinkedList();
            if (query.moveToFirst()) {
                do {
                    HashMap hashMap = new HashMap();
                    for (String str : ff.b) {
                        String string = query.getString(query.getColumnIndex(str));
                        if (str != null) {
                            hashMap.put(str, string);
                        }
                    }
                    linkedList.add(hashMap);
                } while (query.moveToNext());
            }
            return linkedList;
        } finally {
            query.close();
        }
    }
}
