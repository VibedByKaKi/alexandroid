package com.amazon.alexa.utils.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.device.FireTabletUtils;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SignatureVerifier {
    static final String DEBUG_FINGERPRINT = "7cac391937981b6134bdce1fd9834c253181f5abf91ded6078210d0f91ace360";
    private static final String ENG_BUILD_TYPE_VALUE = "eng";
    static final String PREPROD_FINGERPRINT = "70d568ec6ae6f338bc1a6399a6537ee06908ca1d72fb8ff04874ab95433b250e";
    static final String RELEASE_FINGERPRINT = "2f19adeb284eb36f7f07786152b9a1d14b21653203ad0b04ebbf9c73ab6d7625";
    private static final String TAG = "SignatureVerifier";
    private static final String USER_DEBUG_BUILD_TYPE_VALUE = "userdebug";

    @Nullable
    static List<Properties> cachedFingerPrintProperties;
    private volatile Boolean isDebugApp;
    private volatile Boolean isFireOS;
    private final PackageManager packageManager;
    private final PackageSignatureUtil packageSignatureUtil;
    private final String selfPackageName;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum VerifyResult {
        VERIFIED,
        NOT_VERIFIED,
        UNKNOWN_PACKAGE,
        PACKAGENAME_NOT_FOUND,
        SIGNATURE_COUNT_EXCEEDED,
        INTERNAL_ERROR_VERIFYING
    }

    public SignatureVerifier(@NonNull Context context, @NonNull PackageSignatureUtil packageSignatureUtil) {
        this.packageManager = context.getPackageManager();
        this.selfPackageName = context.getPackageName();
        this.packageSignatureUtil = packageSignatureUtil;
    }

    private boolean verifyFingerPrints(String str, String str2) {
        List<Properties> list = cachedFingerPrintProperties;
        if (list == null || list.isEmpty()) {
            cachedFingerPrintProperties = getTrustedFingerPrints();
        }
        Iterator<Properties> it2 = cachedFingerPrintProperties.iterator();
        while (it2.hasNext()) {
            if (str.equals(it2.next().getProperty(str2))) {
                return true;
            }
        }
        return false;
    }

    public List<Properties> getTrustedFingerPrints() {
        ArrayList arrayList = new ArrayList();
        if (isSystemBuildDebug()) {
            arrayList.add(TrustedFingerPrintSignature.DEBUG_TRUSTED_FINGERPRINTS);
        }
        arrayList.add(TrustedFingerPrintSignature.QUEBEC_ADDITIONAL_TRUSTED_FINGERPRINT);
        arrayList.add(TrustedFingerPrintSignature.TRUSTED_FINGERPRINTS);
        return arrayList;
    }

    public boolean isFireOS() {
        if (this.isFireOS == null) {
            this.isFireOS = Boolean.valueOf(FireTabletUtils.isFireOS());
        }
        return this.isFireOS.booleanValue();
    }

    public boolean isSelfAppDebug() throws PackageManager.NameNotFoundException {
        if (this.isDebugApp == null) {
            this.isDebugApp = Boolean.valueOf(this.packageSignatureUtil.isDebug(this.packageManager.getApplicationInfo(this.selfPackageName, 128)));
        }
        return this.isDebugApp.booleanValue();
    }

    public boolean isSystemBuildDebug() {
        String str = Build.TYPE;
        return USER_DEBUG_BUILD_TYPE_VALUE.equals(str) || ENG_BUILD_TYPE_VALUE.equals(str);
    }

    public boolean verify(int i) {
        return verifyUid(i) == VerifyResult.VERIFIED;
    }

    public VerifyResult verifyPackage(@NonNull String str) {
        try {
            try {
                if (str.equals(this.selfPackageName)) {
                    return VerifyResult.VERIFIED;
                }
                Signature[] signatureArr = this.packageManager.getPackageInfo(str, 64).signatures;
                if (signatureArr.length != 1) {
                    return VerifyResult.SIGNATURE_COUNT_EXCEEDED;
                }
                String signatureFingerprint = this.packageSignatureUtil.getSignatureFingerprint(signatureArr[0]);
                boolean verifyFingerPrints = verifyFingerPrints(signatureFingerprint, str);
                if (!verifyFingerPrints) {
                    verifyFingerPrints = RELEASE_FINGERPRINT.equals(signatureFingerprint);
                    if (!verifyFingerPrints && isSelfAppDebug()) {
                        verifyFingerPrints = DEBUG_FINGERPRINT.equals(signatureFingerprint);
                    }
                    if (!verifyFingerPrints && isFireOS()) {
                        verifyFingerPrints = DEBUG_FINGERPRINT.equals(signatureFingerprint);
                    }
                    if (!verifyFingerPrints && FireTabletUtils.isKHTablet()) {
                        verifyFingerPrints = PREPROD_FINGERPRINT.equals(signatureFingerprint);
                    }
                }
                return verifyFingerPrints ? VerifyResult.VERIFIED : VerifyResult.NOT_VERIFIED;
            } catch (IOException | NoSuchAlgorithmException | CertificateException e) {
                Log.e(TAG, "Couldn't verify signature " + e.getMessage());
                return VerifyResult.INTERNAL_ERROR_VERIFYING;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e(TAG, "Failed to find other package info to verify signatures");
            return VerifyResult.PACKAGENAME_NOT_FOUND;
        }
    }

    public VerifyResult verifyUid(int i) {
        String nameForUid = this.packageManager.getNameForUid(i);
        return nameForUid == null ? VerifyResult.UNKNOWN_PACKAGE : verifyPackage(nameForUid);
    }

    public boolean verify(@NonNull String str) {
        return verifyPackage(str) == VerifyResult.VERIFIED;
    }

    public SignatureVerifier(@NonNull Context context) {
        this(context, new PackageSignatureUtil());
    }
}
