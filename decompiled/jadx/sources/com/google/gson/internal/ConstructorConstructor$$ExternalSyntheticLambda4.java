package com.google.gson.internal;

import expo.modules.kotlin.allocators.UnsafeAllocator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class ConstructorConstructor$$ExternalSyntheticLambda4 implements ObjectConstructor, expo.modules.kotlin.allocators.UnsafeAllocator {
    public final /* synthetic */ Class f$0;

    public /* synthetic */ ConstructorConstructor$$ExternalSyntheticLambda4(Class cls) {
        this.f$0 = cls;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        Object lambda$newUnsafeAllocator$3;
        lambda$newUnsafeAllocator$3 = ConstructorConstructor.lambda$newUnsafeAllocator$3(this.f$0);
        return lambda$newUnsafeAllocator$3;
    }

    @Override // expo.modules.kotlin.allocators.UnsafeAllocator
    public Object newInstance() {
        Object createAllocator$lambda$2;
        createAllocator$lambda$2 = UnsafeAllocator.Companion.createAllocator$lambda$2(this.f$0);
        return createAllocator$lambda$2;
    }
}
