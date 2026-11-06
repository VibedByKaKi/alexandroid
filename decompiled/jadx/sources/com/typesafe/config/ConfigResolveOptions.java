package com.typesafe.config;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class ConfigResolveOptions {
    private final boolean allowUnresolved;
    private final boolean useSystemEnvironment;

    private ConfigResolveOptions(boolean z, boolean z2) {
        this.useSystemEnvironment = z;
        this.allowUnresolved = z2;
    }

    public static ConfigResolveOptions defaults() {
        return new ConfigResolveOptions(true, false);
    }

    public static ConfigResolveOptions noSystem() {
        return defaults().setUseSystemEnvironment(false);
    }

    public boolean getAllowUnresolved() {
        return this.allowUnresolved;
    }

    public boolean getUseSystemEnvironment() {
        return this.useSystemEnvironment;
    }

    public ConfigResolveOptions setAllowUnresolved(boolean z) {
        return new ConfigResolveOptions(this.useSystemEnvironment, z);
    }

    public ConfigResolveOptions setUseSystemEnvironment(boolean z) {
        return new ConfigResolveOptions(z, this.allowUnresolved);
    }
}
