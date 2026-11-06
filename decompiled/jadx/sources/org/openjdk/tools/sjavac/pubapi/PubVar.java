package org.openjdk.tools.sjavac.pubapi;

import java.io.Serializable;
import java.util.Optional;
import java.util.Set;
import org.openjdk.javax.lang.model.element.Modifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class PubVar implements Serializable {
    private static final long serialVersionUID = 5806536061153374575L;
    private final String constValue;
    public final String identifier;
    public final Set<Modifier> modifiers;
    public final TypeDesc type;

    public PubVar(Set<Modifier> set, TypeDesc typeDesc, String str, String str2) {
        this.modifiers = set;
        this.type = typeDesc;
        this.identifier = str;
        this.constValue = str2;
    }

    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) {
            return false;
        }
        PubVar pubVar = (PubVar) obj;
        return this.modifiers.equals(pubVar.modifiers) && this.type.equals(pubVar.type) && this.identifier.equals(pubVar.identifier) && getConstValue().equals(pubVar.getConstValue());
    }

    public Optional<String> getConstValue() {
        return Optional.ofNullable(this.constValue);
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return getConstValue().hashCode() ^ ((this.modifiers.hashCode() ^ this.type.hashCode()) ^ this.identifier.hashCode());
    }

    public String toString() {
        return String.format("%s[modifiers: %s, type: %s, identifier: %s, constValue: %s]", getClass().getSimpleName(), this.modifiers, this.type, this.identifier, this.constValue);
    }
}
