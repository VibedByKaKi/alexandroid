package com.amazon.identity.auth.device;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.identity.auth.device.api.DeviceDataStoreException;
import com.amazon.identity.auth.device.framework.RemoteMAPException;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ia implements ma {
    public static final Uri d = Uri.parse("content://com.amazon.sso.device.data");
    public static final Uri e = Uri.parse("content://com.amazon.sso.device.data.directboot");
    public static final String[] f = {"value", "isPersistent"};

    /* renamed from: a, reason: collision with root package name */
    public final qn f722a;
    public final hl b;
    public final tn c;

    public ia(tn tnVar) {
        qn qnVar = new qn(tnVar);
        hl hlVar = new hl(tnVar);
        this.f722a = qnVar;
        this.b = hlVar;
        this.c = tnVar;
    }

    public static void a(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(AuthorizationDelegateAdapter.FAILURE_EXCEPTION);
        Serializable serializable = null;
        String string = columnIndex == -1 ? null : cursor.getString(columnIndex);
        int columnIndex2 = cursor.getColumnIndex("exception_message");
        String string2 = columnIndex2 == -1 ? null : cursor.getString(columnIndex2);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (string != null) {
            try {
                Parcel a2 = zj.a(string);
                try {
                    serializable = a2.readSerializable();
                } finally {
                    a2.recycle();
                }
            } catch (Exception e2) {
                Log.e(yf.a("DeviceDataCommunication"), "Unable to deserialize exception from DeviceDataProvider", e2);
                throw new DeviceDataStoreException(a0.a("Unable to deserialize exception from DeviceDataProvider, exception message from DeviceDataProvider is ", string2, "."));
            }
        }
        if (serializable instanceof DeviceDataStoreException) {
            throw ((DeviceDataStoreException) serializable);
        }
        StringBuilder sb = new StringBuilder("The output of deserialized exception from DeviceDataProvider is not a DeviceDataStoreException instance. Original exception message is ");
        sb.append(string2);
        sb.append(".");
    }

    public final ja a(Uri uri, String str) {
        try {
            return (ja) this.f722a.a(uri, new ha(this, uri, str));
        } catch (RemoteMAPException e2) {
            Log.e(yf.a("DeviceDataCommunication"), "Got a RemoteMAPException", e2);
            if (e2.getCause() instanceof DeviceDataStoreException) {
                throw ((DeviceDataStoreException) e2.getCause());
            }
            throw new DeviceDataStoreException("Failed to query device data store: " + e2.getMessage());
        }
    }

    @Override // com.amazon.identity.auth.device.ma
    public final ja a(String str) {
        boolean b = this.b.b();
        tn tnVar = this.c;
        if (b) {
            Log.i(yf.a("DeviceDataCommunication"), a$$ExternalSyntheticOutline0.m$1(tnVar.getPackageName(), " try get device data in direct mode for ", str));
            return a(e, str);
        }
        tnVar.getPackageName();
        yf.a("DeviceDataCommunication");
        "user".equalsIgnoreCase(Build.TYPE);
        return a(d, str);
    }
}
