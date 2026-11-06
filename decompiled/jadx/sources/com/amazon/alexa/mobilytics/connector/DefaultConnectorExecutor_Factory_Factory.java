package com.amazon.alexa.mobilytics.connector;

import com.amazon.alexa.mobilytics.connector.DefaultConnectorExecutor;
import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class DefaultConnectorExecutor_Factory_Factory implements Factory<DefaultConnectorExecutor.Factory> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final DefaultConnectorExecutor_Factory_Factory INSTANCE = new DefaultConnectorExecutor_Factory_Factory();

        private InstanceHolder() {
        }
    }

    public static DefaultConnectorExecutor_Factory_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultConnectorExecutor.Factory newInstance() {
        return new DefaultConnectorExecutor.Factory();
    }

    @Override // javax.inject.Provider
    public DefaultConnectorExecutor.Factory get() {
        return newInstance();
    }
}
