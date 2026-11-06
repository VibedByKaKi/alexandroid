package com.google.auto.value.extension.memoized.processor;

import autovalue.shaded.com.google.common.collect.ImmutableMap;
import com.google.auto.value.extension.memoized.processor.MemoizeExtension;
import java.util.Set;
import java.util.function.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MemoizeExtension$Generator$$ExternalSyntheticLambda6 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MemoizeExtension$Generator$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String lambda$constructor$2;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                lambda$constructor$2 = MemoizeExtension.Generator.lambda$constructor$2((Set) obj2, (String) obj);
                return lambda$constructor$2;
            default:
                return (String) ((ImmutableMap) obj2).get((String) obj);
        }
    }
}
