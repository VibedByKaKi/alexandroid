package com.google.auto.value.processor;

import java.util.function.Function;
import javax.lang.model.element.Name;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class EclipseHack$$ExternalSyntheticLambda1 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Name lambda$getEnclosingType$1;
        lambda$getEnclosingType$1 = EclipseHack.lambda$getEnclosingType$1((TypeMirror) obj);
        return lambda$getEnclosingType$1;
    }
}
