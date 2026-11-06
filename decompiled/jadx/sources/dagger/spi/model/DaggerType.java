package dagger.spi.model;

import com.google.auto.value.AutoValue;
import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import dagger.internal.codegen.xprocessing.XTypes;
import dagger.spi.shaded.androidx.room.compiler.processing.XType;
import dagger.spi.shaded.androidx.room.compiler.processing.compat.XConverters;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class DaggerType {
    public static DaggerType from(XType xType) {
        Preconditions.checkNotNull(xType);
        return new AutoValue_DaggerType(XTypes.equivalence().wrap(xType));
    }

    public abstract Equivalence.Wrapper<XType> equivalenceWrapper();

    public TypeMirror java() {
        return XConverters.toJavac(xprocessing());
    }

    public final String toString() {
        return XTypes.toStableString(xprocessing());
    }

    public XType xprocessing() {
        return equivalenceWrapper().get();
    }
}
