package com.typesafe.config;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class ConfigParseOptions {
    final boolean allowMissing;
    final ClassLoader classLoader;
    final ConfigIncluder includer;
    final String originDescription;
    final ConfigSyntax syntax;

    private ConfigParseOptions(ConfigSyntax configSyntax, String str, boolean z, ConfigIncluder configIncluder, ClassLoader classLoader) {
        this.syntax = configSyntax;
        this.originDescription = str;
        this.allowMissing = z;
        this.includer = configIncluder;
        this.classLoader = classLoader;
    }

    public static ConfigParseOptions defaults() {
        return new ConfigParseOptions(null, null, true, null, null);
    }

    public ConfigParseOptions appendIncluder(ConfigIncluder configIncluder) {
        if (configIncluder != null) {
            ConfigIncluder configIncluder2 = this.includer;
            return configIncluder2 == configIncluder ? this : configIncluder2 != null ? setIncluder(configIncluder2.withFallback(configIncluder)) : setIncluder(configIncluder);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("null includer passed to appendIncluder");
        return null;
    }

    public boolean getAllowMissing() {
        return this.allowMissing;
    }

    public ClassLoader getClassLoader() {
        ClassLoader classLoader = this.classLoader;
        return classLoader == null ? Thread.currentThread().getContextClassLoader() : classLoader;
    }

    public ConfigIncluder getIncluder() {
        return this.includer;
    }

    public String getOriginDescription() {
        return this.originDescription;
    }

    public ConfigSyntax getSyntax() {
        return this.syntax;
    }

    public ConfigParseOptions prependIncluder(ConfigIncluder configIncluder) {
        if (configIncluder != null) {
            ConfigIncluder configIncluder2 = this.includer;
            return configIncluder2 == configIncluder ? this : configIncluder2 != null ? setIncluder(configIncluder.withFallback(configIncluder2)) : setIncluder(configIncluder);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("null includer passed to prependIncluder");
        return null;
    }

    public ConfigParseOptions setAllowMissing(boolean z) {
        return this.allowMissing == z ? this : new ConfigParseOptions(this.syntax, this.originDescription, z, this.includer, this.classLoader);
    }

    public ConfigParseOptions setClassLoader(ClassLoader classLoader) {
        return this.classLoader == classLoader ? this : new ConfigParseOptions(this.syntax, this.originDescription, this.allowMissing, this.includer, classLoader);
    }

    public ConfigParseOptions setIncluder(ConfigIncluder configIncluder) {
        return this.includer == configIncluder ? this : new ConfigParseOptions(this.syntax, this.originDescription, this.allowMissing, configIncluder, this.classLoader);
    }

    public ConfigParseOptions setOriginDescription(String str) {
        String str2 = this.originDescription;
        return (str2 != str && (str2 == null || str == null || !str2.equals(str))) ? new ConfigParseOptions(this.syntax, str, this.allowMissing, this.includer, this.classLoader) : this;
    }

    public ConfigParseOptions setSyntax(ConfigSyntax configSyntax) {
        return this.syntax == configSyntax ? this : new ConfigParseOptions(configSyntax, this.originDescription, this.allowMissing, this.includer, this.classLoader);
    }

    public ConfigParseOptions withFallbackOriginDescription(String str) {
        return this.originDescription == null ? setOriginDescription(str) : this;
    }
}
