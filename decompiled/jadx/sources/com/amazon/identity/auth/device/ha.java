package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.amazon.identity.auth.device.api.DeviceDataKeys;
import com.amazon.identity.auth.device.api.DeviceDataStoreException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ha implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f699a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ia c;

    public ha(ia iaVar, Uri uri, String str) {
        this.c = iaVar;
        this.f699a = uri;
        this.b = str;
    }

    @Override // com.amazon.identity.auth.device.m8
    public final Object a(ContentProviderClient contentProviderClient) {
        Cursor query = contentProviderClient.query(this.f699a, ia.f, this.b, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    this.c.getClass();
                    ia.a(query);
                    int columnIndex = query.getColumnIndex("value");
                    String str = null;
                    String string = columnIndex == -1 ? null : query.getString(columnIndex);
                    int columnIndex2 = query.getColumnIndex("isPersistent");
                    if (columnIndex2 != -1) {
                        str = query.getString(columnIndex2);
                    }
                    boolean parseBoolean = Boolean.parseBoolean(str);
                    yf.a("DeviceDataCommunication");
                    "user".equalsIgnoreCase(Build.TYPE);
                    ja jaVar = new ja(parseBoolean, string);
                    query.close();
                    return jaVar;
                }
            } finally {
            }
        }
        String str2 = "Key " + this.b + " was not found in the device data store.";
        if (this.b.equals(DeviceDataKeys.KEY_KE_DEVICE) || this.b.equals(DeviceDataKeys.KEY_RE_DEVICE)) {
            String str3 = this.b;
            str2 = str2.concat(" This device does not support " + str3 + ". This error is expected if the device not support " + str3 + ".");
        }
        throw new DeviceDataStoreException(str2);
    }
}
