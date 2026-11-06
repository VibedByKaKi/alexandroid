package com.amazon.alexa.biloba.utils;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CustomTextHelper_Factory implements Factory<CustomTextHelper> {
    private static final CustomTextHelper_Factory INSTANCE = new CustomTextHelper_Factory();

    public static CustomTextHelper_Factory create() {
        return INSTANCE;
    }

    public static CustomTextHelper newInstance() {
        return new CustomTextHelper();
    }

    @Override // javax.inject.Provider
    public CustomTextHelper get() {
        return new CustomTextHelper();
    }
}
