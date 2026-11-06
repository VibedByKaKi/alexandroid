package com.google.auto.value.extension.toprettystring.processor;

import autovalue.shaded.com.squareup.javapoet.CodeBlock;
import com.google.auto.value.extension.toprettystring.processor.ToPrettyStringExtension;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ExtensionClassTypeSpecBuilder$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ExtensionClassTypeSpecBuilder$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$constructor$1;
        CodeBlock lambda$loopMethodBody$9;
        switch (this.$r8$classId) {
            case 0:
                lambda$constructor$1 = ExtensionClassTypeSpecBuilder.lambda$constructor$1((String) obj);
                return lambda$constructor$1;
            default:
                lambda$loopMethodBody$9 = ToPrettyStringExtension.ToPrettyStringImplementation.lambda$loopMethodBody$9((CodeBlock) obj);
                return lambda$loopMethodBody$9;
        }
    }
}
