package com.amazon.dee.app.services.testing;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.dee.app.services.security.CertificateReaderService;
import dagger.Lazy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TestArgumentsService {
    private final Map<String, String> arguments;
    private final Lazy<CertificateReaderService> lazyCertificateReaderService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Argument {
        OVERRIDE_FEATURES_BLOCKLIST("config.overrideFeaturesBlocklist"),
        OVERRIDE_FEATURES_ALLOWLIST("config.overrideFeaturesAllowlist"),
        DISABLE_AUTOPAIRING("config.disableAutopairing"),
        DISABLE_RATEAPP("config.disableRateApp"),
        DISABLE_INTERSTITIALS("config.disableInterstitials"),
        LOGIN_NAME("config.loginName"),
        LOGIN_PASSWORD("config.loginPassword"),
        CRASH_REPORTING_ACCOUNT("config.crashReportingAccount"),
        FEATURE_REFRESH_TIME("config.fsv2.featureRefreshTime"),
        SESSION_CHANGE_THRESHOLD("config.fsv2.sessionChangeThreshold");

        private final String name;

        Argument(String str) {
            this.name = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return this.name;
        }
    }

    public TestArgumentsService(Intent intent, Lazy<CertificateReaderService> lazy) {
        this.lazyCertificateReaderService = lazy;
        this.arguments = extractArguments(intent);
    }

    @NonNull
    @VisibleForTesting
    public static Map<String, String> bundleToMap(Bundle bundle) {
        Set<String> keySet = bundle.keySet();
        HashMap hashMap = new HashMap();
        for (String str : keySet) {
            hashMap.put(str, bundle.getString(str));
        }
        return hashMap;
    }

    @VisibleForTesting
    public Map<String, String> extractArguments(Intent intent) {
        return (intent == null || intent.getExtras() == null) ? Collections.EMPTY_MAP : bundleToMap(intent.getExtras());
    }

    public Map<String, String> getArgs() {
        return !isEnabled() ? Collections.EMPTY_MAP : this.arguments;
    }

    public String getValue(Argument argument) {
        if (isEnabled()) {
            return this.arguments.get(argument.toString());
        }
        return null;
    }

    @VisibleForTesting
    public boolean isEnabled() {
        return this.lazyCertificateReaderService.get().isDebugSigned();
    }

    public boolean isSet(Argument... argumentArr) {
        if (!isEnabled()) {
            return false;
        }
        for (Argument argument : argumentArr) {
            if (!this.arguments.containsKey(argument.toString())) {
                return false;
            }
        }
        return true;
    }
}
