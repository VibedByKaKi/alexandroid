package com.amazon.deecomms.calling.ui;

import com.amazon.deecomms.calling.initiation.InitiationLogicFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class COBOWarningActivity_MembersInjector implements MembersInjector<COBOWarningActivity> {
    private final Provider<InitiationLogicFactory> initiationLogicFactoryProvider;

    public COBOWarningActivity_MembersInjector(Provider<InitiationLogicFactory> provider) {
        this.initiationLogicFactoryProvider = provider;
    }

    public static MembersInjector<COBOWarningActivity> create(Provider<InitiationLogicFactory> provider) {
        return new COBOWarningActivity_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.calling.ui.COBOWarningActivity.initiationLogicFactory")
    public static void injectInitiationLogicFactory(COBOWarningActivity cOBOWarningActivity, InitiationLogicFactory initiationLogicFactory) {
        cOBOWarningActivity.initiationLogicFactory = initiationLogicFactory;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(COBOWarningActivity cOBOWarningActivity) {
        injectInitiationLogicFactory(cOBOWarningActivity, this.initiationLogicFactoryProvider.get());
    }
}
