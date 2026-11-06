package com.amazon.identity.auth.device;

import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class f8 {
    public static final SecureRandom d = new SecureRandom();

    /* renamed from: a, reason: collision with root package name */
    public String f615a;
    public String b;
    public String c;

    public final void a() {
        try {
            byte[] bArr = new byte[32];
            d.nextBytes(bArr);
            String encodeToString = Base64.encodeToString(bArr, 11);
            this.f615a = encodeToString;
            this.b = "SHA-256";
            this.c = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(encodeToString.getBytes()), 11);
            yf.a("CodeChallengeUtil");
            "user".equalsIgnoreCase(Build.TYPE);
        } catch (NoSuchAlgorithmException e) {
            Log.e(yf.a("CodeChallengeUtil"), "Your JRE does not support the required SHA-256 algorithm.", e);
        }
    }
}
