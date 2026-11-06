package com.amazon.alexa.mobilytics.connector;

import dagger.internal.Factory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class KinesisThrottleBuffer_Factory implements Factory<KinesisThrottleBuffer> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final KinesisThrottleBuffer_Factory INSTANCE = new KinesisThrottleBuffer_Factory();

        private InstanceHolder() {
        }
    }

    public static KinesisThrottleBuffer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static KinesisThrottleBuffer newInstance() {
        return new KinesisThrottleBuffer();
    }

    @Override // javax.inject.Provider
    public KinesisThrottleBuffer get() {
        return newInstance();
    }
}
