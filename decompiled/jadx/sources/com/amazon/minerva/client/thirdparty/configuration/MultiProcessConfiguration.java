package com.amazon.minerva.client.thirdparty.configuration;

import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MultiProcessConfiguration {
    private String mMainProcessName;
    private Set<String> mSecondaryProcessNames;

    public MultiProcessConfiguration(String str, Set<String> set) {
        this.mMainProcessName = str;
        this.mSecondaryProcessNames = set;
    }

    public String getMainProcessName() {
        return this.mMainProcessName;
    }

    public boolean isSecondaryProcessNameOnList(String str) {
        Set<String> set = this.mSecondaryProcessNames;
        if (set != null) {
            return set.contains(str);
        }
        return false;
    }
}
