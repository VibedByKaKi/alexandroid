package com.amazon.dee.app.elements;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ReactFeatureControllerTransition_MembersInjector implements MembersInjector<ReactFeatureControllerTransition> {
    private final Provider<ReactFeatureManager> reactFeatureManagerProvider;

    public ReactFeatureControllerTransition_MembersInjector(Provider<ReactFeatureManager> provider) {
        this.reactFeatureManagerProvider = provider;
    }

    public static MembersInjector<ReactFeatureControllerTransition> create(Provider<ReactFeatureManager> provider) {
        return new ReactFeatureControllerTransition_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.dee.app.elements.ReactFeatureControllerTransition.reactFeatureManager")
    public static void injectReactFeatureManager(ReactFeatureControllerTransition reactFeatureControllerTransition, ReactFeatureManager reactFeatureManager) {
        reactFeatureControllerTransition.reactFeatureManager = reactFeatureManager;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ReactFeatureControllerTransition reactFeatureControllerTransition) {
        injectReactFeatureManager(reactFeatureControllerTransition, this.reactFeatureManagerProvider.get());
    }
}
