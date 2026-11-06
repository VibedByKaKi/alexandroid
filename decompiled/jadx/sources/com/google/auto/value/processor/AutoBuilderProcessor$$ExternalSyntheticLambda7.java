package com.google.auto.value.processor;

import java.util.TreeMap;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AutoBuilderProcessor$$ExternalSyntheticLambda7 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AutoBuilderProcessor$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        TreeMap lambda$propertyToGetterName$11;
        switch (this.$r8$classId) {
            case 0:
                lambda$propertyToGetterName$11 = AutoBuilderProcessor.lambda$propertyToGetterName$11();
                return lambda$propertyToGetterName$11;
            default:
                return new TypeMirrorSet();
        }
    }
}
