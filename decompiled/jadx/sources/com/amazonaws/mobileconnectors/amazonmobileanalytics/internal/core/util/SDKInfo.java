package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class SDKInfo {
    private final String name;
    private final String version;

    public SDKInfo(String str, String str2) {
        this.name = str;
        this.version = str2;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return this.name + "-" + this.version;
    }
}
