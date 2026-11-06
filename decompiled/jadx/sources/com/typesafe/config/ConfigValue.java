package com.typesafe.config;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface ConfigValue extends ConfigMergeable {
    Config atKey(String str);

    Config atPath(String str);

    ConfigOrigin origin();

    String render();

    String render(ConfigRenderOptions configRenderOptions);

    Object unwrapped();

    ConfigValueType valueType();

    @Override // com.typesafe.config.ConfigMergeable
    ConfigValue withFallback(ConfigMergeable configMergeable);

    ConfigValue withOrigin(ConfigOrigin configOrigin);
}
