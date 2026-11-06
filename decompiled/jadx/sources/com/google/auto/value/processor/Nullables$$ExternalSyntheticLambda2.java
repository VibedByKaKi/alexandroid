package com.google.auto.value.processor;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.processing.ProcessingEnvironment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Nullables$$ExternalSyntheticLambda2 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Nullables$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final Object get$com$google$auto$value$processor$Nullables$$ExternalSyntheticLambda2() {
        Optional defaultNullableTypeAnnotation;
        defaultNullableTypeAnnotation = Nullables.defaultNullableTypeAnnotation((ProcessingEnvironment) this.f$0);
        return defaultNullableTypeAnnotation;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Stream lambda$findRelevantExecutables$16;
        switch (this.$r8$classId) {
            case 0:
                return get$com$google$auto$value$processor$Nullables$$ExternalSyntheticLambda2();
            case 1:
                return ((Executable) this.f$0).invoke();
            default:
                lambda$findRelevantExecutables$16 = AutoBuilderProcessor.lambda$findRelevantExecutables$16((List) this.f$0);
                return lambda$findRelevantExecutables$16;
        }
    }
}
