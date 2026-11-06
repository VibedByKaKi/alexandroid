package com.google.auto.value.processor;

import com.google.auto.value.processor.PropertyBuilderClassifier;
import java.util.function.Consumer;
import javax.lang.model.element.TypeElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class BuilderSpec$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BuilderSpec$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final void accept$com$google$auto$value$processor$BuilderSpec$$ExternalSyntheticLambda0(Object obj) {
        ((BuilderSpec) this.f$0).lambda$getBuilder$0((TypeElement) this.f$1, (String) obj);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                accept$com$google$auto$value$processor$BuilderSpec$$ExternalSyntheticLambda0(obj);
                break;
            default:
                ((BuilderMethodClassifier) this.f$0).lambda$classifyPropertyBuilderOneArg$1((String) this.f$1, (PropertyBuilderClassifier.PropertyBuilder) obj);
                break;
        }
    }
}
