package com.amazon.alexa.accessory.capabilities.accessproof;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AccessProofWire {
    public static final String CAMERA_STREAM = "camera.stream";
    public static final int CHECKSUM_BYTES = 32;
    public static final long COMPLETED_RETENTION_MILLIS = 30000;
    public static final long DEVICE_FEATURES_TIMEOUT_MILLIS = 5000;
    public static final int MAX_ASSERTION_BYTES = 512;
    public static final int MAX_CHALLENGE_BYTES = 64;
    public static final int MAX_CHUNK_BYTES = 512;
    public static final int MAX_CHUNK_COUNT = 16;
    public static final int MAX_KEY_ID_BYTES = 64;
    public static final int MAX_OBJECT_BYTES = 8192;
    public static final int MAX_SCOPE_BYTES = 64;
    public static final int MAX_SCOPE_COUNT = 8;
    public static final int MAX_TXN_ID_BYTES = 64;
    public static final String MIC_STREAM = "mic.stream";
    public static final long REASSEMBLY_INACTIVITY_MILLIS = 5000;
    private static final Pattern SCOPE_SYNTAX = Pattern.compile("[a-z][a-z0-9_]*(\\.[a-z][a-z0-9_]*)+");
    public static final int THIRD_PARTY_SDK_AUTHORIZATION_FEATURE_ID = 40;
    public static final long VERIFIER_DEADLINE_MILLIS = 5000;

    private AccessProofWire() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isValidScopeSet(List<String> list) {
        if (list == null || list.isEmpty() || list.size() > 8) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str : list) {
            if (!isWellFormedScope(str) || !hashSet.add(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWellFormedScope(String str) {
        if (str == null || str.isEmpty() || str.getBytes(StandardCharsets.UTF_8).length > 64) {
            return false;
        }
        return SCOPE_SYNTAX.matcher(str).matches();
    }
}
