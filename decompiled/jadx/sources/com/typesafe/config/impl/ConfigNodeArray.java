package com.typesafe.config.impl;

import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class ConfigNodeArray extends ConfigNodeComplexValue {
    public ConfigNodeArray(Collection<AbstractConfigNode> collection) {
        super(collection);
    }

    @Override // com.typesafe.config.impl.ConfigNodeComplexValue
    public ConfigNodeArray newNode(Collection<AbstractConfigNode> collection) {
        return new ConfigNodeArray(collection);
    }

    @Override // com.typesafe.config.impl.ConfigNodeComplexValue
    public /* bridge */ /* synthetic */ ConfigNodeComplexValue newNode(Collection collection) {
        return newNode((Collection<AbstractConfigNode>) collection);
    }
}
