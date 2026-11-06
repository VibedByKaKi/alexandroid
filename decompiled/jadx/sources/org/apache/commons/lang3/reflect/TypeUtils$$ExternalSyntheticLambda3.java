package org.apache.commons.lang3.reflect;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final /* synthetic */ class TypeUtils$$ExternalSyntheticLambda3 implements ObjectConstructor, Typed {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Type f$0;

    public /* synthetic */ TypeUtils$$ExternalSyntheticLambda3(int i, Type type) {
        this.$r8$classId = i;
        this.f$0 = type;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newSpecialCollectionConstructor$1;
        Object lambda$newSpecialCollectionConstructor$0;
        int i = this.$r8$classId;
        Type type = this.f$0;
        switch (i) {
            case 1:
                lambda$newSpecialCollectionConstructor$1 = ConstructorConstructor.lambda$newSpecialCollectionConstructor$1(type);
                return lambda$newSpecialCollectionConstructor$1;
            default:
                lambda$newSpecialCollectionConstructor$0 = ConstructorConstructor.lambda$newSpecialCollectionConstructor$0(type);
                return lambda$newSpecialCollectionConstructor$0;
        }
    }

    @Override // org.apache.commons.lang3.reflect.Typed
    public Type getType() {
        Type lambda$wrap$0;
        lambda$wrap$0 = TypeUtils.lambda$wrap$0(this.f$0);
        return lambda$wrap$0;
    }
}
