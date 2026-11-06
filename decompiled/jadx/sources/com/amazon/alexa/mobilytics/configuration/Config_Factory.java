package com.amazon.alexa.mobilytics.configuration;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class Config_Factory implements Factory<Config> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final Config_Factory INSTANCE = new Config_Factory();

        private InstanceHolder() {
        }
    }

    public static Config_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Config newInstance() {
        return new Config();
    }

    @Override // javax.inject.Provider
    public Config get() {
        return newInstance();
    }
}
