package com.amazon.ptz.dagger;

import com.amazon.alexa.rangecontroller.lib.model.serialization.RcSerializer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class SerializationModule_ProvideRcSerializerFactory implements Factory<RcSerializer> {
    private final SerializationModule module;

    public SerializationModule_ProvideRcSerializerFactory(SerializationModule serializationModule) {
        this.module = serializationModule;
    }

    public static SerializationModule_ProvideRcSerializerFactory create(SerializationModule serializationModule) {
        return new SerializationModule_ProvideRcSerializerFactory(serializationModule);
    }

    public static RcSerializer provideRcSerializer(SerializationModule serializationModule) {
        return (RcSerializer) Preconditions.checkNotNullFromProvides(serializationModule.provideRcSerializer());
    }

    @Override // javax.inject.Provider
    public RcSerializer get() {
        return provideRcSerializer(this.module);
    }
}
