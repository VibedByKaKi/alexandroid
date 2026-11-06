package org.openjdk.tools.sjavac.pubapi;

import java.io.Serializable;
import org.openjdk.javax.lang.model.type.TypeKind;
import org.openjdk.tools.javac.util.StringUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class PrimitiveTypeDesc extends TypeDesc implements Serializable {
    private static final long serialVersionUID = 6051065543149129106L;

    public PrimitiveTypeDesc(TypeKind typeKind) {
        super(typeKind);
        if (typeKind.isPrimitive() || typeKind == TypeKind.VOID) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Only primitives or void accepted");
        throw null;
    }

    public String toString() {
        return StringUtils.toLowerCase(this.typeKind.toString());
    }
}
