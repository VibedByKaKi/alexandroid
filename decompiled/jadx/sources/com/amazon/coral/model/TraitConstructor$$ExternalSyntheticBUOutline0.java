package com.amazon.coral.model;

import com.amazon.coral.model.DittoConfigTraitsDefaulter;
import com.amazon.coral.model.validation.ModelValidationException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class TraitConstructor$$ExternalSyntheticBUOutline0 implements DittoConfigTraitsDefaulter.TraitsConstructorFunction {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ TraitConstructor$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new ModelValidationException(str + obj + obj2 + obj3 + obj4);
    }

    @Override // com.amazon.coral.model.DittoConfigTraitsDefaulter.TraitsConstructorFunction
    public Object apply(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 1:
                return new AwsJson10DittoConfigTraits((String) obj, (Long) obj2, (Double) obj3);
            case 2:
                return new AwsJson11DittoConfigTraits((String) obj, (Long) obj2, (Double) obj3);
            default:
                return new RestJsonDittoConfigTraits((String) obj, (Long) obj2, (Double) obj3);
        }
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new ModelIndexFactoryException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object[] objArr) {
        throw new ModelValidationException(String.format(str, objArr));
    }
}
