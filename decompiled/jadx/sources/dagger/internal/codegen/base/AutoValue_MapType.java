package dagger.internal.codegen.base;

import com.squareup.javapoet.TypeName;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_MapType extends MapType {
    private final TypeName typeName;

    public AutoValue_MapType(TypeName typeName) {
        if (typeName != null) {
            this.typeName = typeName;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null typeName");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MapType) {
            return this.typeName.equals(((MapType) obj).typeName());
        }
        return false;
    }

    public int hashCode() {
        return this.typeName.hashCode() ^ 1000003;
    }

    public String toString() {
        return "MapType{typeName=" + this.typeName + StringSubstitutor.DEFAULT_VAR_END;
    }

    @Override // dagger.internal.codegen.base.MapType
    public TypeName typeName() {
        return this.typeName;
    }
}
