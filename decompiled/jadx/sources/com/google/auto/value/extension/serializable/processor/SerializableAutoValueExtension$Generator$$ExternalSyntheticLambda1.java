package com.google.auto.value.extension.serializable.processor;

import autovalue.shaded.com.squareup.javapoet.CodeBlock;
import com.google.auto.value.extension.serializable.processor.SerializableAutoValueExtension;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class SerializableAutoValueExtension$Generator$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ SerializableAutoValueExtension$Generator$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        CodeBlock lambda$writeReplace$1;
        PropertyMirror propertyMirror = (PropertyMirror) obj;
        switch (this.$r8$classId) {
            case 0:
                lambda$writeReplace$1 = SerializableAutoValueExtension.Generator.lambda$writeReplace$1(propertyMirror);
                return lambda$writeReplace$1;
            case 1:
                return propertyMirror.getName();
            default:
                return propertyMirror.getType();
        }
    }
}
