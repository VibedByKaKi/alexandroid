package dagger.spi.model;

import com.google.auto.value.AutoValue;
import com.squareup.javapoet.ClassName;
import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import dagger.spi.shaded.androidx.room.compiler.processing.compat.XConverters;
import javax.lang.model.element.TypeElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class DaggerTypeElement {
    public static DaggerTypeElement from(XTypeElement xTypeElement) {
        return new AutoValue_DaggerTypeElement(xTypeElement);
    }

    public ClassName className() {
        return xprocessing().getClassName();
    }

    public TypeElement java() {
        return XConverters.toJavac(xprocessing());
    }

    public final String toString() {
        return xprocessing().toString();
    }

    public abstract XTypeElement xprocessing();
}
