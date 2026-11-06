package dagger.spi.model;

import dagger.spi.shaded.androidx.room.compiler.processing.XExecutableElement;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
final class AutoValue_DaggerExecutableElement extends DaggerExecutableElement {
    private final XExecutableElement xprocessing;

    public AutoValue_DaggerExecutableElement(XExecutableElement xExecutableElement) {
        if (xExecutableElement != null) {
            this.xprocessing = xExecutableElement;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null xprocessing");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DaggerExecutableElement) {
            return this.xprocessing.equals(((DaggerExecutableElement) obj).xprocessing());
        }
        return false;
    }

    public int hashCode() {
        return this.xprocessing.hashCode() ^ 1000003;
    }

    @Override // dagger.spi.model.DaggerExecutableElement
    public XExecutableElement xprocessing() {
        return this.xprocessing;
    }
}
