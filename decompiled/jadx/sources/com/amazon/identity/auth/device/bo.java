package com.amazon.identity.auth.device;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    public final String f539a;

    public bo(String str) {
        if (str == null) {
            Log.w(yf.a("SoftwareVersion"), "SoftwareVersion: isValidVersion: returning false because a null version was given.");
        } else if (str.length() < 1 || str.length() > 37) {
            Log.w(yf.a("SoftwareVersion"), "SoftwareVersion: isValidVersion: returning false because an invalid length was given (must be between 1 and 37 characters).");
        } else {
            if (str.matches("[0-9]*")) {
                this.f539a = str;
                return;
            }
            Log.w(yf.a("SoftwareVersion"), "SoftwareVersion: isValidVersion: returning false because version contains invalid characters (can only contain digits)");
        }
        Log.e(yf.a("SoftwareVersion"), "SoftwareVersion: constructed with invalid software version. Was not set.");
        this.f539a = null;
    }

    public final boolean a() {
        if (this.f539a != null) {
            return true;
        }
        Log.w(yf.a("SoftwareVersion"), "SoftwareVersion: isValid: returning false because a valid software version has not been set.");
        return false;
    }
}
