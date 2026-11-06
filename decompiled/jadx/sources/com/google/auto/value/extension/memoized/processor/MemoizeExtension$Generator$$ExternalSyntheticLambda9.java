package com.google.auto.value.extension.memoized.processor;

import autovalue.shaded.com.squareup.javapoet.AnnotationSpec;
import autovalue.shaded.com.squareup.javapoet.TypeSpec;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MemoizeExtension$Generator$$ExternalSyntheticLambda9 implements Consumer {
    public final /* synthetic */ TypeSpec.Builder f$0;

    public /* synthetic */ MemoizeExtension$Generator$$ExternalSyntheticLambda9(TypeSpec.Builder builder) {
        this.f$0 = builder;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f$0.addAnnotation((AnnotationSpec) obj);
    }
}
