package com.amazon.identity.auth.device;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class ym {
    public static boolean a(String str) {
        return str == null || str.equals("");
    }

    public static boolean b(String str) {
        if (a(str)) {
            Log.i(yf.a("RequestValidationHelper"), "isValidDeviceSerialNumber: returning false because a null or empty device serial number was given.");
            return false;
        }
        if (str == null || !str.matches("[a-zA-Z0-9]*")) {
            Log.i(yf.a("RequestValidationHelper"), "isValidDeviceSerialNumber: returning false because a non alpha numeric serial number was given.");
            return false;
        }
        if (str.length() <= 51) {
            return true;
        }
        Log.w(yf.a("RequestValidationHelper"), "isValidDeviceSerialNumber: returning false because a serial number that is too long (more than 51 characters) was given.");
        return false;
    }
}
