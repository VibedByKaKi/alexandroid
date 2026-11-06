package com.google.auto.value.extension.serializable.serializer.impl;

import autovalue.shaded.com.squareup.javapoet.CodeBlock;
import com.google.auto.value.extension.serializable.serializer.interfaces.Serializer;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ImmutableMapSerializerExtension$ImmutableMapSerializer$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Serializer f$0;

    public /* synthetic */ ImmutableMapSerializerExtension$ImmutableMapSerializer$$ExternalSyntheticLambda0(Serializer serializer, int i) {
        this.$r8$classId = i;
        this.f$0 = serializer;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.$r8$classId;
        Serializer serializer = this.f$0;
        CodeBlock codeBlock = (CodeBlock) obj;
        switch (i) {
            case 0:
                return serializer.toProxy(codeBlock);
            default:
                return serializer.fromProxy(codeBlock);
        }
    }
}
