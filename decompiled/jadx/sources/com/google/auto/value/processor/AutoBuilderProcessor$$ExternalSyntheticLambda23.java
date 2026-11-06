package com.google.auto.value.processor;

import autovalue.shaded.com.google.common.collect.ImmutableSet;
import java.util.function.Predicate;
import javax.lang.model.element.TypeElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class AutoBuilderProcessor$$ExternalSyntheticLambda23 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AutoBuilderProcessor f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ AutoBuilderProcessor$$ExternalSyntheticLambda23(AutoBuilderProcessor autoBuilderProcessor, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = autoBuilderProcessor;
        this.f$1 = obj;
    }

    private final boolean test$com$google$auto$value$processor$AutoBuilderProcessor$$ExternalSyntheticLambda23(Object obj) {
        boolean lambda$findRelevantExecutables$19;
        lambda$findRelevantExecutables$19 = this.f$0.lambda$findRelevantExecutables$19((TypeElement) this.f$1, (Executable) obj);
        return lambda$findRelevantExecutables$19;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$matchingExecutable$20;
        switch (this.$r8$classId) {
            case 0:
                return test$com$google$auto$value$processor$AutoBuilderProcessor$$ExternalSyntheticLambda23(obj);
            default:
                lambda$matchingExecutable$20 = this.f$0.lambda$matchingExecutable$20((ImmutableSet) this.f$1, (Executable) obj);
                return lambda$matchingExecutable$20;
        }
    }
}
