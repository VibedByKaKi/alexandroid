package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.database.Cursor;
import com.amazon.identity.auth.device.framework.RemoteMAPException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class v3 implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1019a;

    public v3(String str) {
        this.f1019a = str;
    }

    @Override // com.amazon.identity.auth.device.m8
    public final Object a(ContentProviderClient contentProviderClient) {
        String[] strArr = {this.f1019a};
        Cursor query = contentProviderClient.query(qa.f896a, strArr, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    int columnIndex = query.getColumnIndex(strArr[0]);
                    String string = columnIndex == -1 ? null : query.getString(columnIndex);
                    query.close();
                    return string;
                }
            } finally {
            }
        }
        throw new RemoteMAPException("Null or empty result returned from Amazon Device Information Provider.");
    }
}
