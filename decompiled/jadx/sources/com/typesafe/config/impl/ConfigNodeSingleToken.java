package com.typesafe.config.impl;

import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
class ConfigNodeSingleToken extends AbstractConfigNode {
    final Token token;

    public ConfigNodeSingleToken(Token token) {
        this.token = token;
    }

    public Token token() {
        return this.token;
    }

    @Override // com.typesafe.config.impl.AbstractConfigNode
    public Collection<Token> tokens() {
        return Collections.singletonList(this.token);
    }
}
