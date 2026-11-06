package dagger.spi.model;

import com.google.auto.value.AutoValue;
import com.google.common.base.Preconditions;
import dagger.spi.shaded.androidx.room.compiler.processing.XExecutableElement;
import dagger.spi.shaded.androidx.room.compiler.processing.compat.XConverters;
import javax.lang.model.element.ExecutableElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class DaggerExecutableElement {
    public static DaggerExecutableElement from(XExecutableElement xExecutableElement) {
        return new AutoValue_DaggerExecutableElement((XExecutableElement) Preconditions.checkNotNull(xExecutableElement));
    }

    public ExecutableElement java() {
        return XConverters.toJavac(xprocessing());
    }

    public final String toString() {
        return xprocessing().toString();
    }

    public abstract XExecutableElement xprocessing();
}
