package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.PerClause;
import org.aspectj.lang.reflect.PerClauseKind;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class PerClauseImpl implements PerClause {
    private final PerClauseKind kind;

    public PerClauseImpl(PerClauseKind perClauseKind) {
        this.kind = perClauseKind;
    }

    @Override // org.aspectj.lang.reflect.PerClause
    public PerClauseKind getKind() {
        return this.kind;
    }

    public String toString() {
        return "issingleton()";
    }
}
