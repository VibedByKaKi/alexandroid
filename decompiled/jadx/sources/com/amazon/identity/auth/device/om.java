package com.amazon.identity.auth.device;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.framework.RemoteMAPException;
import java.util.Collection;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class om {

    /* renamed from: a, reason: collision with root package name */
    public final tn f861a;
    public final qn b;
    public final qm c;

    public om(tn tnVar, qm qmVar) {
        this.f861a = tnVar;
        this.b = new qn(tnVar);
        this.c = qmVar;
    }

    public final boolean a(Collection collection) {
        Uri a2 = ff.a(this.c.c, "/bulk_data");
        ContentValues contentValues = new ContentValues();
        contentValues.put("bulk_data", zj.a(collection));
        try {
            qn qnVar = this.b;
            qnVar.getClass();
            boolean z = ((Uri) qnVar.a(a2, new on(qnVar, a2, contentValues))) != null;
            qm qmVar = this.c;
            if (!z) {
                Log.i(yf.a("RemoteAmazonDataStorage"), a0.a("set bulk data was not successful with package ", qmVar.b, "."));
                return z;
            }
            String str = qmVar.b;
            yf.a("RemoteAmazonDataStorage");
            "user".equalsIgnoreCase(Build.TYPE);
            return z;
        } catch (RemoteMAPException e) {
            Log.i(yf.a("RemoteAmazonDataStorage"), a0.a("set bulk data was not successful with package ", this.c.b, "."), e);
            return false;
        }
    }

    public final boolean b(String str, String str2, String str3, Date date) {
        Uri a2 = ff.a(this.c.c, "/userdata");
        ContentValues contentValues = new ContentValues();
        contentValues.put("directedId", str);
        contentValues.put("key", str2);
        contentValues.put("value", str3);
        contentValues.put("timestamp_key", Long.valueOf(date.getTime()));
        boolean z = this.f861a.getContentResolver().insert(a2, contentValues) != null;
        qm qmVar = this.c;
        if (!z) {
            Log.i(yf.a("RemoteAmazonDataStorage"), a0.a("set userdata was not successful with package ", qmVar.b, "."));
            return z;
        }
        String str4 = qmVar.b;
        yf.a("RemoteAmazonDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        return z;
    }

    public final boolean a(String str, String str2, String str3, Date date) {
        Uri a2 = ff.a(this.c.c, "/tokens");
        ContentValues contentValues = new ContentValues();
        contentValues.put("directedId", str);
        contentValues.put("key", str2);
        contentValues.put("value", str3);
        contentValues.put("timestamp_key", Long.valueOf(date.getTime()));
        boolean z = this.f861a.getContentResolver().insert(a2, contentValues) != null;
        qm qmVar = this.c;
        if (z) {
            String str4 = qmVar.b;
            yf.a("RemoteAmazonDataStorage");
            "user".equalsIgnoreCase(Build.TYPE);
            return z;
        }
        Log.i(yf.a("RemoteAmazonDataStorage"), a0.a("set token was not successful with package ", qmVar.b, "."));
        return z;
    }

    public final String a(String str, String str2) {
        Throwable th;
        Uri a2 = ff.a(this.c.c, "/device_data");
        Cursor cursor = null;
        nm a3 = nm.a((String) null, str2, str, (Date) null);
        try {
            Cursor query = this.f861a.getContentResolver().query(a2, new String[]{"value"}, a3.f840a, a3.b, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex("value"));
                        yf.a("RemoteAmazonDataStorage");
                        "user".equalsIgnoreCase(Build.TYPE);
                        query.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = query;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (query == null) {
                return null;
            }
            query.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
