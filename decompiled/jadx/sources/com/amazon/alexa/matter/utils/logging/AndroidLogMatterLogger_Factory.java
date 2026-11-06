package com.amazon.alexa.matter.utils.logging;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class AndroidLogMatterLogger_Factory implements Factory<AndroidLogMatterLogger> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final AndroidLogMatterLogger_Factory INSTANCE = new AndroidLogMatterLogger_Factory();

        private InstanceHolder() {
        }
    }

    public static AndroidLogMatterLogger_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AndroidLogMatterLogger newInstance() {
        return new AndroidLogMatterLogger();
    }

    @Override // javax.inject.Provider
    public AndroidLogMatterLogger get() {
        return newInstance();
    }
}
