package com.amazon.alexa.mobilytics.configuration;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MigrationBypassPolicyConfig {
    private Map<String, BypassRule> bypass = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BypassRule {
        public List<String> appComponents;
        public List<String> eventNames;
        public List<String> subComponents;
    }

    @NonNull
    public Map<String, BypassRule> bypass() {
        Map<String, BypassRule> map = this.bypass;
        return map == null ? Collections.EMPTY_MAP : map;
    }
}
