package dagger.spi.model;

import com.google.auto.value.AutoValue;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;
import dagger.spi.shaded.androidx.room.compiler.processing.compat.XConverters;
import javax.lang.model.element.Element;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class DaggerElement {
    public static DaggerElement from(XElement xElement) {
        return new AutoValue_DaggerElement(xElement);
    }

    public Element java() {
        return XConverters.toJavac(xprocessing());
    }

    public final String toString() {
        return xprocessing().toString();
    }

    public abstract XElement xprocessing();
}
