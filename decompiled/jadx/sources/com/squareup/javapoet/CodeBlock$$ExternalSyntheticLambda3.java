package com.squareup.javapoet;

import com.squareup.javapoet.AnnotationSpec;
import com.squareup.javapoet.CodeBlock;
import java.util.List;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class CodeBlock$$ExternalSyntheticLambda3 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CodeBlock$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        List lambda$addMember$0;
        switch (this.$r8$classId) {
            case 0:
                return ((CodeBlock.CodeBlockJoiner) obj).join();
            default:
                lambda$addMember$0 = AnnotationSpec.Builder.lambda$addMember$0((String) obj);
                return lambda$addMember$0;
        }
    }
}
