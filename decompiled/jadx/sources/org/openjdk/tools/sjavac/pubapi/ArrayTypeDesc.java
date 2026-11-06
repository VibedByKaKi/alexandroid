package org.openjdk.tools.sjavac.pubapi;

import java.io.Serializable;
import org.openjdk.javax.lang.model.type.TypeKind;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class ArrayTypeDesc extends TypeDesc implements Serializable {
    private static final long serialVersionUID = -1177329549163314996L;
    TypeDesc compTypeDesc;

    public ArrayTypeDesc(TypeDesc typeDesc) {
        super(TypeKind.ARRAY);
        this.compTypeDesc = typeDesc;
    }

    @Override // org.openjdk.tools.sjavac.pubapi.TypeDesc
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return this.compTypeDesc.equals(((ArrayTypeDesc) obj).compTypeDesc);
        }
        return false;
    }

    @Override // org.openjdk.tools.sjavac.pubapi.TypeDesc
    public int hashCode() {
        return this.compTypeDesc.hashCode() ^ super.hashCode();
    }
}
