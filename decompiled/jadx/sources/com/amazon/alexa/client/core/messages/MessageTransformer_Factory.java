package com.amazon.alexa.client.core.messages;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class MessageTransformer_Factory implements Factory<MessageTransformer> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final MessageTransformer_Factory INSTANCE = new MessageTransformer_Factory();

        private InstanceHolder() {
        }
    }

    public static MessageTransformer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MessageTransformer newInstance() {
        return new MessageTransformer();
    }

    @Override // javax.inject.Provider
    public MessageTransformer get() {
        return newInstance();
    }
}
