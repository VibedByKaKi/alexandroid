package com.amazon.deecomms.smsmessaging.messagingcontroller;

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
public final class MessagingControllerManager_MembersInjector implements MembersInjector<MessagingControllerManager> {
    private final Provider<Context> mContextProvider;

    public MessagingControllerManager_MembersInjector(Provider<Context> provider) {
        this.mContextProvider = provider;
    }

    public static MembersInjector<MessagingControllerManager> create(Provider<Context> provider) {
        return new MessagingControllerManager_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerManager.mContext")
    public static void injectMContext(MessagingControllerManager messagingControllerManager, Context context) {
        messagingControllerManager.mContext = context;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MessagingControllerManager messagingControllerManager) {
        injectMContext(messagingControllerManager, this.mContextProvider.get());
    }
}
