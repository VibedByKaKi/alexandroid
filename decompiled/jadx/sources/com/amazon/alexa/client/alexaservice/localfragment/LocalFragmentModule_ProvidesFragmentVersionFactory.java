package com.amazon.alexa.client.alexaservice.localfragment;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class LocalFragmentModule_ProvidesFragmentVersionFactory implements Factory<String> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class InstanceHolder {
        private static final LocalFragmentModule_ProvidesFragmentVersionFactory INSTANCE = new LocalFragmentModule_ProvidesFragmentVersionFactory();

        private InstanceHolder() {
        }
    }

    public static LocalFragmentModule_ProvidesFragmentVersionFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static String providesFragmentVersion() {
        return (String) Preconditions.checkNotNullFromProvides(LocalFragmentModule.providesFragmentVersion());
    }

    @Override // javax.inject.Provider
    public String get() {
        return providesFragmentVersion();
    }
}
