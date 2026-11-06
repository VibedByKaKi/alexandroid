package com.ReactNativeBlobUtil;

import android.net.Uri;
import android.util.Base64;
import com.ReactNativeBlobUtil.Utils.PathResolver;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ReactNativeBlobUtilUtils {
    public static X509TrustManager sharedTrustManager;

    public static void emitWarningEvent(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", LogLevel.WARN);
        createMap.putString(MessagingControllerConstant.MESSAGING_CONTROLLER_DETAIL_KEY, str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) ReactNativeBlobUtilImpl.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(ReactNativeBlobUtilConst.EVENT_MESSAGE, createMap);
    }

    public static String getMD5(String str) {
        try {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
                messageDigest.update(str.getBytes());
                byte[] digest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(String.format(Locale.ROOT, "%02x", Integer.valueOf(b & 255)));
                }
                return sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static OkHttpClient.Builder getUnsafeOkHttpClient(OkHttpClient okHttpClient) {
        try {
            X509TrustManager x509TrustManager = sharedTrustManager;
            if (x509TrustManager == null) {
                throw new IllegalStateException("Use of own trust manager but none defined");
            }
            TrustManager[] trustManagerArr = {x509TrustManager};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            newBuilder.sslSocketFactory(socketFactory, sharedTrustManager);
            newBuilder.hostnameVerifier(new HostnameVerifier() { // from class: com.ReactNativeBlobUtil.ReactNativeBlobUtilUtils.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    return true;
                }
            });
            return newBuilder;
        } catch (Exception e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    public static boolean isAsset(String str) {
        return str != null && str.startsWith(ReactNativeBlobUtilConst.FILE_PREFIX_BUNDLE_ASSET);
    }

    public static boolean isContentUri(String str) {
        return str != null && str.startsWith(ReactNativeBlobUtilConst.FILE_PREFIX_CONTENT);
    }

    public static String normalizePath(String str) {
        if (str == null) {
            return null;
        }
        if (str.matches("\\w+\\:.*")) {
            if (str.startsWith("file://")) {
                return str.replace("file://", "");
            }
            Uri parse = Uri.parse(str);
            if (!str.startsWith(ReactNativeBlobUtilConst.FILE_PREFIX_BUNDLE_ASSET)) {
                return PathResolver.getRealPathFromURI(ReactNativeBlobUtilImpl.RCTContext, parse);
            }
        }
        return str;
    }

    public static byte[] stringToBytes(String str, String str2) {
        return str2.equalsIgnoreCase("ascii") ? str.getBytes(Charset.forName("US-ASCII")) : str2.toLowerCase(Locale.ROOT).contains(ReactNativeBlobUtilConst.RNFB_RESPONSE_BASE64) ? Base64.decode(str, 2) : str2.equalsIgnoreCase(ReactNativeBlobUtilConst.RNFB_RESPONSE_UTF8) ? str.getBytes(Charset.forName("UTF-8")) : str.getBytes(Charset.forName("US-ASCII"));
    }
}
