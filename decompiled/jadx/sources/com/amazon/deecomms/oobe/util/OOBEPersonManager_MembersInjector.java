package com.amazon.deecomms.oobe.util;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class OOBEPersonManager_MembersInjector implements MembersInjector<OOBEPersonManager> {
    private final Provider<Context> mContextProvider;

    public OOBEPersonManager_MembersInjector(Provider<Context> provider) {
        this.mContextProvider = provider;
    }

    public static MembersInjector<OOBEPersonManager> create(Provider<Context> provider) {
        return new OOBEPersonManager_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.oobe.util.OOBEPersonManager.mContext")
    public static void injectMContext(OOBEPersonManager oOBEPersonManager, Context context) {
        oOBEPersonManager.mContext = context;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(OOBEPersonManager oOBEPersonManager) {
        injectMContext(oOBEPersonManager, this.mContextProvider.get());
    }
}
