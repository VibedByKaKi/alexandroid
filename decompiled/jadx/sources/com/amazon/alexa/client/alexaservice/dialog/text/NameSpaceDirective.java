package com.amazon.alexa.client.alexaservice.dialog.text;

import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Namespace;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class NameSpaceDirective {
    private final Name name;
    private final Namespace namespace;

    public NameSpaceDirective(@NonNull Namespace namespace, @NonNull Name name) {
        this.namespace = namespace;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NameSpaceDirective nameSpaceDirective = (NameSpaceDirective) obj;
        if (this.namespace.getValue().equals(nameSpaceDirective.namespace.getValue())) {
            return this.name.getValue().equals(nameSpaceDirective.name.getValue());
        }
        return false;
    }

    public Name getName() {
        return this.name;
    }

    public Namespace getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        return this.name.getValue().hashCode() + (this.namespace.getValue().hashCode() * 31);
    }

    public String toString() {
        return "NameSpaceDirective{namespace=" + this.namespace + ", name=" + this.name + AbstractJsonLexerKt.END_OBJ;
    }
}
