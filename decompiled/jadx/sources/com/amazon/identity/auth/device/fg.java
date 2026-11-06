package com.amazon.identity.auth.device;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.amazon.alexa.configservice.metrics.MetricsConstants;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class fg {
    public static String a(URL url, IOException iOException, Context context) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(b(url));
        sb.append(":");
        sb.append(iOException.getClass().getSimpleName());
        sb.append(":");
        try {
            str = a(context) ? "Connected" : MetricsConstants.Error.NOT_CONNECTED;
        } catch (SecurityException e) {
            Log.e(yf.a("SSOMetrics"), "We do not have permission to get the network state. Please make sure the permission android.permission.ACCESS_NETWORK_STATE is included in your manifest", e);
            str = "NetworkStatusUnknown";
        }
        sb.append(str);
        return sb.toString();
    }

    public static String b(String str) {
        return str == null ? "CannotGetURL" : str.contains("/ap/signin") ? "/ap/signin" : str.contains("/ap/forgotpassword") ? "/ap/forgotpassword" : str.contains("/ap/register") ? "/ap/register" : str.contains("/ap/challenge") ? "/ap/challenge" : str.contains("/ap/mfa") ? "/ap/mfa" : str.contains("/ap/dcq") ? "/ap/dcq" : "NonMAPURL";
    }

    public static String c(String str) {
        return str == null ? "CannotGetURL" : str.contains("getNewDeviceCredentials") ? "getNewDeviceCredentials" : str.contains("registerAssociatedDevice") ? "registerAssociatedDevice" : str.contains("registerDeviceWithToken") ? "registerDeviceWithToken" : str.contains("registerDeviceToSecondaryCustomer") ? "registerDeviceToSecondaryCustomer" : str.contains("registerDevice") ? "registerDevice" : str.contains("renameFiona") ? "renameFiona" : str.contains("disownFiona") ? "disownFiona" : str.contains("/auth/register") ? "/auth/register" : str.contains("/auth/signin") ? "/auth/signin" : str.contains("/ap/exchangetoken") ? "/ap/exchangetoken" : "NonMAPURL";
    }

    public static String b(URL url) {
        return url.getPath() + ":" + url.getHost() + ":IOException";
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static String a(URL url, int i) {
        return c(url) + ":" + i;
    }

    public static String a(URL url, int i, String str) {
        if (str == null) {
            return a(url, i);
        }
        return a(url, i) + ":" + str;
    }

    public static String a(String str) {
        try {
            return b(str) + ":" + new URL(str).getHost();
        } catch (MalformedURLException unused) {
            return "CannotGetURL";
        }
    }

    public static String a(URL url) {
        return c(url) + ":Availability";
    }

    public static String c(URL url) {
        return url.getPath() + ":" + url.getHost();
    }
}
