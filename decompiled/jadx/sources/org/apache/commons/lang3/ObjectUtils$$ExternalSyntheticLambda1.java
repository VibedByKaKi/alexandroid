package org.apache.commons.lang3;

import java.lang.annotation.Annotation;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class ObjectUtils$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ObjectUtils$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return Objects.isNull(obj);
            case 1:
                return Annotation.class.isAssignableFrom((Class) obj);
            case 2:
                return StringUtils.isEmpty((String) obj);
            default:
                return Objects.nonNull((Supplier) obj);
        }
    }
}
