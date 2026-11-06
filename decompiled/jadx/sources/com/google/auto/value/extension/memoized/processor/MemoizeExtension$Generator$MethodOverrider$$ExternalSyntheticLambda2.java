package com.google.auto.value.extension.memoized.processor;

import autovalue.shaded.com.squareup.javapoet.TypeName;
import java.util.function.Function;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MemoizeExtension$Generator$MethodOverrider$$ExternalSyntheticLambda2 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return TypeName.get((TypeMirror) obj);
    }
}
