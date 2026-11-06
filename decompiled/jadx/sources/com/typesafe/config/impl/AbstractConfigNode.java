package com.typesafe.config.impl;

import com.typesafe.config.parser.ConfigNode;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
abstract class AbstractConfigNode implements ConfigNode {
    public final boolean equals(Object obj) {
        return (obj instanceof AbstractConfigNode) && render().equals(((AbstractConfigNode) obj).render());
    }

    public final int hashCode() {
        return render().hashCode();
    }

    @Override // com.typesafe.config.parser.ConfigNode
    public final String render() {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it2 = tokens().iterator();
        while (it2.hasNext()) {
            sb.append(((Token) it2.next()).tokenText());
        }
        return sb.toString();
    }

    public abstract Collection<Token> tokens();
}
