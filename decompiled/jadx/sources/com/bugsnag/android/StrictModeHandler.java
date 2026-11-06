package com.bugsnag.android;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class StrictModeHandler {
    private static final int DETECT_CUSTOM = 8;
    private static final int DETECT_DISK_READ = 2;
    private static final int DETECT_DISK_WRITE = 1;
    private static final int DETECT_NETWORK = 4;
    private static final int DETECT_RESOURCE_MISMATCH = 16;
    private static final int DETECT_VM_ACTIVITY_LEAKS = 1024;
    private static final int DETECT_VM_CLEARTEXT_NETWORK = 16384;
    private static final int DETECT_VM_CLOSABLE_LEAKS = 512;
    private static final int DETECT_VM_CURSOR_LEAKS = 256;
    private static final int DETECT_VM_FILE_URI_EXPOSURE = 8192;
    private static final int DETECT_VM_INSTANCE_LEAKS = 2048;
    private static final int DETECT_VM_REGISTRATION_LEAKS = 4096;

    @SuppressLint({"UseSparseArrays"})
    private static final Map<Integer, String> POLICY_CODE_MAP;
    private static final String STRICT_MODE_CLZ_NAME = "android.os.strictmode";

    static {
        HashMap hashMap = new HashMap();
        POLICY_CODE_MAP = hashMap;
        hashMap.put(1, "DiskWrite");
        hashMap.put(2, "DiskRead");
        hashMap.put(4, "NetworkOperation");
        hashMap.put(8, "CustomSlowCall");
        hashMap.put(16, "ResourceMismatch");
        hashMap.put(256, "CursorLeak");
        hashMap.put(512, "CloseableLeak");
        hashMap.put(1024, "ActivityLeak");
        hashMap.put(2048, "InstanceLeak");
        hashMap.put(4096, "RegistrationLeak");
        hashMap.put(8192, "FileUriLeak");
        hashMap.put(16384, "CleartextNetwork");
    }

    private Throwable getRootCause(Throwable th) {
        return (Throwable) ErrorUtils$$ExternalSyntheticOutline0.m(ThrowableUtils.safeUnrollCauses(th), 1);
    }

    @Nullable
    public String getViolationDescription(String str) {
        if (TextUtils.isEmpty(str)) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        int lastIndexOf = str.lastIndexOf("violation=");
        if (lastIndexOf == -1) {
            return null;
        }
        String replace = str.substring(lastIndexOf).replace("violation=", "");
        if (!TextUtils.isDigitsOnly(replace)) {
            return null;
        }
        return POLICY_CODE_MAP.get(Integer.valueOf(replace));
    }

    public boolean isStrictModeThrowable(Throwable th) {
        return getRootCause(th).getClass().getName().toLowerCase(Locale.US).startsWith(STRICT_MODE_CLZ_NAME);
    }
}
