package com.google.auto.value.processor;

import autovalue.shaded.com.google.common.collect.ImmutableList;
import com.google.auto.value.processor.AutoValueishProcessor;
import com.google.auto.value.processor.BuilderRequiredProperties;
import java.util.Map;
import java.util.function.Function;
import javax.lang.model.element.TypeElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AutoOneOfProcessor$$ExternalSyntheticLambda2 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AutoOneOfProcessor$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        String transformName;
        TypeElement lambda$process$0;
        String lambda$getConvertingSetterFunction$2;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                transformName = ((AutoOneOfProcessor) obj2).transformName((String) obj);
                return transformName;
            case 1:
                lambda$process$0 = ((AutoValueishProcessor) obj2).lambda$process$0((Map.Entry) obj);
                return lambda$process$0;
            case 2:
                lambda$getConvertingSetterFunction$2 = BuilderMethodClassifier.lambda$getConvertingSetterFunction$2((String) obj2, (String) obj);
                return lambda$getConvertingSetterFunction$2;
            case 3:
                return ((BuilderRequiredProperties.NoDefaults) obj2).missingRequiredProperty((AutoValueishProcessor.Property) obj);
            default:
                return (AutoValueishProcessor.Property) ((ImmutableList) obj2).get(((Integer) obj).intValue());
        }
    }
}
