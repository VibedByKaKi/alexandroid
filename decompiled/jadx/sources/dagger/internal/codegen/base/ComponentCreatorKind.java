package dagger.internal.codegen.base;

import com.google.common.base.Ascii;
import com.google.common.base.CaseFormat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public enum ComponentCreatorKind {
    BUILDER,
    FACTORY;

    public String methodName() {
        return Ascii.toLowerCase(name());
    }

    public String typeName() {
        return CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name());
    }
}
