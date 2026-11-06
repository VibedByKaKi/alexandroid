package com.google.auto.value.processor;

import com.google.auto.value.extension.AutoValueExtension;
import com.google.auto.value.processor.AutoValueishProcessor;
import com.google.auto.value.processor.BuilderRequiredProperties;
import com.google.auto.value.processor.BuilderSpec;
import java.util.AbstractMap;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class GwtSerialization$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ GwtSerialization$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$shouldWriteGwtSerializer$0;
        boolean lambda$primitivePropertiesIn$0;
        boolean lambda$getAnyMissing$0;
        boolean lambda$defineVars$8;
        boolean lambda$defineVars$9;
        boolean lambda$defineVars$10;
        boolean lambda$propertyToGetterName$13;
        boolean lambda$extensionsFromLoader$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$shouldWriteGwtSerializer$0 = GwtSerialization.lambda$shouldWriteGwtSerializer$0((Map.Entry) obj);
                return lambda$shouldWriteGwtSerializer$0;
            case 1:
                lambda$primitivePropertiesIn$0 = BuilderRequiredProperties.NoDefaults.lambda$primitivePropertiesIn$0((AutoValueishProcessor.Property) obj);
                return lambda$primitivePropertiesIn$0;
            case 2:
                lambda$getAnyMissing$0 = BuilderRequiredProperties.WithDefaults.lambda$getAnyMissing$0((BuilderRequiredProperties.BitmaskField) obj);
                return lambda$getAnyMissing$0;
            case 3:
                lambda$defineVars$8 = BuilderSpec.Builder.lambda$defineVars$8((AutoValueishProcessor.Property) obj);
                return lambda$defineVars$8;
            case 4:
                lambda$defineVars$9 = BuilderSpec.Builder.lambda$defineVars$9((AutoValueishProcessor.Property) obj);
                return lambda$defineVars$9;
            case 5:
                lambda$defineVars$10 = BuilderSpec.Builder.lambda$defineVars$10((AutoValueishProcessor.Property) obj);
                return lambda$defineVars$10;
            case 6:
                lambda$propertyToGetterName$13 = AutoBuilderProcessor.lambda$propertyToGetterName$13((AbstractMap.SimpleEntry) obj);
                return lambda$propertyToGetterName$13;
            case 7:
                lambda$extensionsFromLoader$0 = AutoValueProcessor.lambda$extensionsFromLoader$0((AutoValueExtension) obj);
                return lambda$extensionsFromLoader$0;
            case 8:
                return "mutable".equals(obj);
            default:
                return ((AutoValueishProcessor.Property) obj).hasDefault();
        }
    }
}
