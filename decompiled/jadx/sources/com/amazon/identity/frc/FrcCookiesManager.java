package com.amazon.identity.frc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazonaws.cognito.clientcontext.datacollection.DataRecordKey;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class FrcCookiesManager {
    public static final HashSet b;
    public static final String c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f1116a;

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        c = FrcCookiesManager.class.getName();
        ChatData$$ExternalSyntheticOutline0.m(hashSet, "ApplicationName", "ApplicationVersion", DataRecordKey.MODEL, "DeviceOSVersion");
        ChatData$$ExternalSyntheticOutline0.m(hashSet, DataRecordKey.DEVICE_WIDTH, DataRecordKey.DEVICE_HEIGHT, DataRecordKey.DEVICE_LANGUAGE, "TimeZone");
    }

    public FrcCookiesManager(Context context) {
        this.f1116a = context;
    }

    public static String b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                Log.e(c, "Network interfaces is null, this should be a bug!");
                return null;
            }
            Iterator it2 = Collections.list(networkInterfaces).iterator();
            String str = null;
            while (it2.hasNext()) {
                for (InetAddress inetAddress : Collections.list(((NetworkInterface) it2.next()).getInetAddresses())) {
                    if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress()) {
                        return inetAddress.getHostAddress();
                    }
                    if (inetAddress.isLoopbackAddress()) {
                        str = inetAddress.getHostAddress().toUpperCase(Locale.US);
                    }
                }
            }
            return str;
        } catch (Exception e) {
            Log.e(c, "Exception happened when tring to get ip address: ".concat(e.getClass().getName()), e);
            return null;
        }
    }

    public static String c() {
        try {
            String format = new SimpleDateFormat("Z", Locale.getDefault()).format(Calendar.getInstance(TimeZone.getTimeZone(TimeZones.GMT_ID), Locale.getDefault()).getTime());
            return format.substring(0, 3) + ":" + format.substring(3, 5);
        } catch (Exception e) {
            Log.e(c, "Unknown exception happened when try to get time zone: ".concat(e.getClass().getName()), e);
            return null;
        }
    }

    public final String a() {
        Integer num;
        String packageName = this.f1116a.getPackageName();
        try {
            num = Integer.valueOf(this.f1116a.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("com.amazon.identity.frc.FrcCookiesManager.c", "Could not find package " + packageName, e);
            num = null;
        }
        if (num != null) {
            return Integer.toString(num.intValue());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getFrcCookies(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.identity.frc.FrcCookiesManager.getFrcCookies(java.lang.String):java.lang.String");
    }

    public static String a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            if (telephonyManager == null) {
                Log.e("com.amazon.identity.frc.FrcCookiesManager.d", "TelephonyManager returned is null");
                telephonyManager = null;
            }
            if (telephonyManager == null) {
                return null;
            }
            return telephonyManager.getNetworkOperatorName();
        } catch (Exception e) {
            Log.e(c, "Unknown exception happened when try to get Carrier: ".concat(e.getClass().getName()), e);
            return null;
        }
    }
}
