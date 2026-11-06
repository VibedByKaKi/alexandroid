package com.typesafe.config.impl;

import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class SubstitutionExpression {
    private final boolean optional;
    private final Path path;

    public SubstitutionExpression(Path path, boolean z) {
        this.path = path;
        this.optional = z;
    }

    public SubstitutionExpression changePath(Path path) {
        return path == this.path ? this : new SubstitutionExpression(path, this.optional);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SubstitutionExpression) {
            SubstitutionExpression substitutionExpression = (SubstitutionExpression) obj;
            if (substitutionExpression.path.equals(this.path) && substitutionExpression.optional == this.optional) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.path.hashCode() + 41) * 41) + (this.optional ? 1 : 0)) * 41;
    }

    public boolean optional() {
        return this.optional;
    }

    public Path path() {
        return this.path;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(StringSubstitutor.DEFAULT_VAR_START);
        sb.append(this.optional ? "?" : "");
        return a$$ExternalSyntheticOutline0.m(sb, this.path.render(), StringSubstitutor.DEFAULT_VAR_END);
    }
}
