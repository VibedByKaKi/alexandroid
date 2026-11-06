package com.amazon.identity.auth.device;

import android.util.Log;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class gm {

    /* renamed from: a, reason: collision with root package name */
    public String f685a;
    public String b;
    public String c;

    public final void a(String str) {
        String substring;
        if (!ym.b(str)) {
            Log.e(yf.a("RegisterRequest"), "setDeviceSerialNumber: device serial number was invalid. Cannot be set.");
            return;
        }
        this.b = str;
        if (str != null) {
            try {
                substring = oo.d(str).substring(23, 31);
            } catch (NoSuchAlgorithmException e) {
                Log.e(yf.a("PIDGenerator"), "SHA-256 algorithm does not exist.  PANICK!", e);
            }
            this.c = substring;
        }
        substring = null;
        this.c = substring;
    }
}
