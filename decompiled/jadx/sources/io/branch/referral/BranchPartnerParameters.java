package io.branch.referral;

import androidx.annotation.NonNull;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class BranchPartnerParameters {
    private static final Pattern HEXADECIMAL_PATTERN = Pattern.compile("\\p{XDigit}+");
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, String>> partnerParameters = new ConcurrentHashMap<>();

    private void addParameterWithName(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        parametersForPartner(str3).put(str, str2);
    }

    public void addFacebookParameter(@NonNull String str, @NonNull String str2) {
        if (isSha256Hashed(str2)) {
            addParameterWithName(str, str2, "fb");
        } else {
            BranchLogger.w("Invalid partner parameter passed. Value must be a SHA 256 hash.");
        }
    }

    public void addSnapParameter(@NonNull String str, @NonNull String str2) {
        if (isSha256Hashed(str2)) {
            addParameterWithName(str, str2, "snap");
        } else {
            BranchLogger.w("Invalid partner parameter passed. Value must be a SHA 256 hash.");
        }
    }

    public ConcurrentHashMap<String, ConcurrentHashMap<String, String>> allParams() {
        return this.partnerParameters;
    }

    public void clearAllParameters() {
        this.partnerParameters.clear();
    }

    public boolean isHexadecimal(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() == 0) {
            return true;
        }
        return HEXADECIMAL_PATTERN.matcher(str).matches();
    }

    public boolean isSha256Hashed(String str) {
        return str != null && str.length() == 64 && isHexadecimal(str);
    }

    @NonNull
    public ConcurrentHashMap<String, String> parametersForPartner(@NonNull String str) {
        ConcurrentHashMap<String, String> concurrentHashMap = this.partnerParameters.get(str);
        if (concurrentHashMap != null) {
            return concurrentHashMap;
        }
        ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.partnerParameters.put(str, concurrentHashMap2);
        return concurrentHashMap2;
    }
}
