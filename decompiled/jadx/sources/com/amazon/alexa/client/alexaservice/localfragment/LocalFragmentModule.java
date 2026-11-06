package com.amazon.alexa.client.alexaservice.localfragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public abstract class LocalFragmentModule {
    private static final String FRAGMENT_VERSION = "2024.1";

    @Provides
    @Singleton
    @Named(ThirdPartySkillCaptionBasedFragmentProvider.FRAGMENT_VERSION_NAME)
    public static String providesFragmentVersion() {
        return "2024.1";
    }

    @Singleton
    @Binds
    public abstract LocalFragmentResultCallback bindLocalFragmentResultCallback(LocalFragmentAuthority localFragmentAuthority);
}
