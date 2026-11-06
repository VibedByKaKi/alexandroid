package com.amazon.ptz.dagger;

import com.amazon.alexa.rangecontroller.lib.model.serialization.RcSerializer;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes5.dex */
public class SerializationModule {
    @Provides
    @Singleton
    public RcSerializer provideRcSerializer() {
        return RcSerializer.INSTANCE;
    }
}
