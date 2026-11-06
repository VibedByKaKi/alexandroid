package com.google.auto.value.extension.toprettystring.processor;

import autovalue.shaded.com.squareup.javapoet.CodeBlock;
import com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension;
import java.util.function.Supplier;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ToPrettyStringExtension$ToPrettyStringImplementation$$ExternalSyntheticLambda1 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ToPrettyStringExtension.ToPrettyStringImplementation f$0;
    public final /* synthetic */ TypeMirror f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ ToPrettyStringExtension$ToPrettyStringImplementation$$ExternalSyntheticLambda1(ToPrettyStringExtension.ToPrettyStringImplementation toPrettyStringImplementation, TypeMirror typeMirror, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = toPrettyStringImplementation;
        this.f$1 = typeMirror;
        this.f$2 = obj;
    }

    private final Object get$com$google$auto$value$extension$toprettystring$processor$ToPrettyStringExtension$ToPrettyStringImplementation$$ExternalSyntheticLambda1() {
        CodeBlock lambda$formatMap$7;
        lambda$formatMap$7 = this.f$0.lambda$formatMap$7(this.f$1, (TypeMirror) this.f$2);
        return lambda$formatMap$7;
    }

    private final Object get$com$google$auto$value$extension$toprettystring$processor$ToPrettyStringExtension$ToPrettyStringImplementation$$ExternalSyntheticLambda5() {
        CodeBlock lambda$formatMultimap$8;
        lambda$formatMultimap$8 = this.f$0.lambda$formatMultimap$8(this.f$1, (TypeMirror) this.f$2);
        return lambda$formatMultimap$8;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        CodeBlock lambda$format$6;
        switch (this.$r8$classId) {
            case 0:
                return get$com$google$auto$value$extension$toprettystring$processor$ToPrettyStringExtension$ToPrettyStringImplementation$$ExternalSyntheticLambda1();
            case 1:
                return get$com$google$auto$value$extension$toprettystring$processor$ToPrettyStringExtension$ToPrettyStringImplementation$$ExternalSyntheticLambda5();
            default:
                lambda$format$6 = this.f$0.lambda$format$6(this.f$1, (ToPrettyStringExtension.PrettyPrintableKind) this.f$2);
                return lambda$format$6;
        }
    }
}
