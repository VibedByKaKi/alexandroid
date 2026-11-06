package com.amazon.alexa.voice.ra;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes19.dex */
public final class UserProfileContentProvider_MembersInjector implements MembersInjector<UserProfileContentProvider> {
    private final Provider<Context> contextProvider;

    public UserProfileContentProvider_MembersInjector(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static MembersInjector<UserProfileContentProvider> create(Provider<Context> provider) {
        return new UserProfileContentProvider_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.voice.ra.UserProfileContentProvider.context")
    public static void injectContext(UserProfileContentProvider userProfileContentProvider, Context context) {
        userProfileContentProvider.context = context;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(UserProfileContentProvider userProfileContentProvider) {
        injectContext(userProfileContentProvider, this.contextProvider.get());
    }
}
