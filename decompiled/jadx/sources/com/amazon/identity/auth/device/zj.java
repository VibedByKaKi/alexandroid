package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class zj {
    public static String a(Collection collection) {
        Parcel obtain = Parcel.obtain();
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList.add(new HashMap((Map) it2.next()));
            }
            obtain.writeSerializable(arrayList);
            String encodeToString = Base64.encodeToString(obtain.marshall(), 0);
            obtain.recycle();
            return encodeToString;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public static Bundle b(String str) {
        if (str == null) {
            return null;
        }
        try {
            Parcel a2 = a(str);
            if (a2 == null) {
                return null;
            }
            try {
                return a2.readBundle();
            } finally {
                a2.recycle();
            }
        } catch (Exception e) {
            Log.w(yf.a("ParcelUtils"), "Failed to deserialize parcel", e);
            return null;
        }
    }

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeBundle(bundle);
            return Base64.encodeToString(obtain.marshall(), 0);
        } finally {
            obtain.recycle();
        }
    }

    public static Parcel a(String str) {
        byte[] decode = Base64.decode(str, 0);
        if (decode == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
        return obtain;
    }
}
