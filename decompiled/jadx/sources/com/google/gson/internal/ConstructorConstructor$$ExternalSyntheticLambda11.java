package com.google.gson.internal;

import expo.modules.kotlin.allocators.ObjectConstructorFactory;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ConstructorConstructor$$ExternalSyntheticLambda11 implements ObjectConstructor, expo.modules.kotlin.allocators.ObjectConstructor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Constructor f$0;

    public /* synthetic */ ConstructorConstructor$$ExternalSyntheticLambda11(Constructor constructor, int i) {
        this.$r8$classId = i;
        this.f$0 = constructor;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public final Object construct() {
        Object lambda$newDefaultConstructor$2;
        Object tryToUseDefaultConstructor$lambda$0;
        int i = this.$r8$classId;
        Constructor constructor = this.f$0;
        switch (i) {
            case 0:
                lambda$newDefaultConstructor$2 = ConstructorConstructor.lambda$newDefaultConstructor$2(constructor);
                return lambda$newDefaultConstructor$2;
            default:
                tryToUseDefaultConstructor$lambda$0 = ObjectConstructorFactory.tryToUseDefaultConstructor$lambda$0(constructor);
                return tryToUseDefaultConstructor$lambda$0;
        }
    }
}
