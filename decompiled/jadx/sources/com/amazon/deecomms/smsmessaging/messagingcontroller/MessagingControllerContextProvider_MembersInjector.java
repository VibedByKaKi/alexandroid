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
public final class MessagingControllerContextProvider_MembersInjector implements MembersInjector<MessagingControllerContextProvider> {
    private final Provider<Context> mContextProvider;

    public MessagingControllerContextProvider_MembersInjector(Provider<Context> provider) {
        this.mContextProvider = provider;
    }

    public static MembersInjector<MessagingControllerContextProvider> create(Provider<Context> provider) {
        return new MessagingControllerContextProvider_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerContextProvider.mContext")
    public static void injectMContext(MessagingControllerContextProvider messagingControllerContextProvider, Context context) {
        messagingControllerContextProvider.mContext = context;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(MessagingControllerContextProvider messagingControllerContextProvider) {
        injectMContext(messagingControllerContextProvider, this.mContextProvider.get());
    }
}
