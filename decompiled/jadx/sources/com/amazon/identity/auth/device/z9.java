package com.amazon.identity.auth.device;

import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class z9 {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f1105a = new ConcurrentHashMap();
    public static volatile long b;
    public static volatile boolean c;

    static {
        new HashMap();
        b = 60000L;
        c = false;
    }

    public static void a() {
        if (c) {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
                messageDigest.update(stackTraceString.getBytes());
                Boolean bool = (Boolean) f1105a.put(Base64.encodeToString(messageDigest.digest(), 0), Boolean.TRUE);
                yf.a("MAP_OUT_BINDER");
                String str = Build.TYPE;
                "user".equalsIgnoreCase(str);
                if (bool == null || !bool.booleanValue()) {
                    yf.a("HASH_STACK_TRACE");
                    "user".equalsIgnoreCase(str);
                }
            } catch (Exception e) {
                Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            }
        }
    }
}
