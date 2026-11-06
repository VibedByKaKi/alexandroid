package com.typesafe.config;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface ConfigList extends List<ConfigValue>, ConfigValue {
    @Override // com.typesafe.config.ConfigValue
    List<Object> unwrapped();

    @Override // com.typesafe.config.ConfigValue
    ConfigList withOrigin(ConfigOrigin configOrigin);
}
