package com.amazon.identity.auth.device;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class wc implements m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Uri f1047a;
    public final /* synthetic */ String b;

    public wc(Uri uri, String str) {
        this.f1047a = uri;
        this.b = str;
    }

    @Override // com.amazon.identity.auth.device.m8
    public final Object a(ContentProviderClient contentProviderClient) {
        Bundle bundle;
        Cursor query = contentProviderClient.query(this.f1047a, xc.m, this.b, null, null);
        try {
            if (query == null) {
                Log.e(yf.a("IMPDataProviderDataStorage"), "Got a invalid cursor calling IMPDataProvider");
                bundle = new Bundle();
                if (query == null) {
                    return bundle;
                }
            } else {
                Bundle extras = query.getExtras();
                if (extras == null) {
                    Log.e(yf.a("IMPDataProviderDataStorage"), "Corrupted value returned");
                    Bundle bundle2 = new Bundle();
                    query.close();
                    return bundle2;
                }
                bundle = extras;
            }
            query.close();
            return bundle;
        } finally {
        }
    }
}
