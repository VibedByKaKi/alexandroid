package dagger.internal.codegen.binding;

import dagger.spi.shaded.androidx.room.compiler.processing.XAnnotation;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class InjectionAnnotations$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InjectionAnnotations f$0;
    public final /* synthetic */ XElement f$1;

    public /* synthetic */ InjectionAnnotations$$ExternalSyntheticLambda2(InjectionAnnotations injectionAnnotations, XElement xElement, int i) {
        this.$r8$classId = i;
        this.f$0 = injectionAnnotations;
        this.f$1 = xElement;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$getScopes$2(this.f$1, (XAnnotation) obj);
                break;
            default:
                this.f$0.lambda$getQualifiers$7(this.f$1, (XAnnotation) obj);
                break;
        }
    }
}
