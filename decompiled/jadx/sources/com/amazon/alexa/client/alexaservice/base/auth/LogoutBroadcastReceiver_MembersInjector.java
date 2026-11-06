package com.amazon.alexa.client.alexaservice.base.auth;

import com.amazon.alexa.auth.AccountManager;
import com.amazon.alexa.client.alexaservice.base.device.UserDependentStorage;
import com.amazon.alexa.client.alexaservice.base.metrics.ConversationLoadSourceStore;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class LogoutBroadcastReceiver_MembersInjector implements MembersInjector<LogoutBroadcastReceiver> {
    private final Provider<AccountManager> accountManagerProvider;
    private final Provider<ConversationLoadSourceStore> conversationLoadSourceStoreProvider;
    private final Provider<UserDependentStorage> userDependentStorageProvider;

    public LogoutBroadcastReceiver_MembersInjector(Provider<UserDependentStorage> provider, Provider<AccountManager> provider2, Provider<ConversationLoadSourceStore> provider3) {
        this.userDependentStorageProvider = provider;
        this.accountManagerProvider = provider2;
        this.conversationLoadSourceStoreProvider = provider3;
    }

    public static MembersInjector<LogoutBroadcastReceiver> create(Provider<UserDependentStorage> provider, Provider<AccountManager> provider2, Provider<ConversationLoadSourceStore> provider3) {
        return new LogoutBroadcastReceiver_MembersInjector(provider, provider2, provider3);
    }

    @InjectedFieldSignature("com.amazon.alexa.client.alexaservice.base.auth.LogoutBroadcastReceiver.accountManager")
    public static void injectAccountManager(LogoutBroadcastReceiver logoutBroadcastReceiver, AccountManager accountManager) {
        logoutBroadcastReceiver.accountManager = accountManager;
    }

    @InjectedFieldSignature("com.amazon.alexa.client.alexaservice.base.auth.LogoutBroadcastReceiver.conversationLoadSourceStore")
    public static void injectConversationLoadSourceStore(LogoutBroadcastReceiver logoutBroadcastReceiver, ConversationLoadSourceStore conversationLoadSourceStore) {
        logoutBroadcastReceiver.conversationLoadSourceStore = conversationLoadSourceStore;
    }

    @InjectedFieldSignature("com.amazon.alexa.client.alexaservice.base.auth.LogoutBroadcastReceiver.userDependentStorage")
    public static void injectUserDependentStorage(LogoutBroadcastReceiver logoutBroadcastReceiver, UserDependentStorage userDependentStorage) {
        logoutBroadcastReceiver.userDependentStorage = userDependentStorage;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LogoutBroadcastReceiver logoutBroadcastReceiver) {
        injectUserDependentStorage(logoutBroadcastReceiver, this.userDependentStorageProvider.get());
        injectAccountManager(logoutBroadcastReceiver, this.accountManagerProvider.get());
        injectConversationLoadSourceStore(logoutBroadcastReceiver, this.conversationLoadSourceStoreProvider.get());
    }
}
