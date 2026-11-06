package com.google.auto.value.extension.toprettystring.processor;

import autovalue.shaded.com.squareup.javapoet.CodeBlock;
import com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension;
import java.util.function.Supplier;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ToPrettyStringExtension$ToPrettyStringImplementation$$ExternalSyntheticLambda7 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ToPrettyStringExtension$ToPrettyStringImplementation$$ExternalSyntheticLambda7(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final Object get$com$google$auto$value$extension$toprettystring$processor$ToPrettyStringExtension$ToPrettyStringImplementation$$ExternalSyntheticLambda7() {
        CodeBlock lambda$format$3;
        lambda$format$3 = ((ToPrettyStringExtension.ToPrettyStringImplementation) this.f$0).lambda$format$3((ExecutableElement) this.f$1);
        return lambda$format$3;
    }

    private final Object get$com$google$auto$value$extension$toprettystring$processor$ToPrettyStringExtension$ToPrettyStringImplementation$DelegateMethod$$ExternalSyntheticLambda0() {
        String lambda$invocation$0;
        lambda$invocation$0 = ((ToPrettyStringExtension.ToPrettyStringImplementation.DelegateMethod) this.f$0).lambda$invocation$0((TypeMirror) this.f$1);
        return lambda$invocation$0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.$r8$classId) {
            case 0:
                return get$com$google$auto$value$extension$toprettystring$processor$ToPrettyStringExtension$ToPrettyStringImplementation$$ExternalSyntheticLambda7();
            default:
                return get$com$google$auto$value$extension$toprettystring$processor$ToPrettyStringExtension$ToPrettyStringImplementation$DelegateMethod$$ExternalSyntheticLambda0();
        }
    }
}
