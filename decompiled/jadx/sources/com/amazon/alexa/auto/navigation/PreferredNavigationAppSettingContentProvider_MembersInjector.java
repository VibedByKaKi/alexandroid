package com.amazon.alexa.auto.navigation;

import android.content.UriMatcher;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Named;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class PreferredNavigationAppSettingContentProvider_MembersInjector implements MembersInjector<PreferredNavigationAppSettingContentProvider> {
    private final Provider<PreferredNavigationAppSettingManager> preferredNavAppManagerProvider;
    private final Provider<UriMatcher> uriMatcherProvider;

    public PreferredNavigationAppSettingContentProvider_MembersInjector(Provider<UriMatcher> provider, Provider<PreferredNavigationAppSettingManager> provider2) {
        this.uriMatcherProvider = provider;
        this.preferredNavAppManagerProvider = provider2;
    }

    public static MembersInjector<PreferredNavigationAppSettingContentProvider> create(Provider<UriMatcher> provider, Provider<PreferredNavigationAppSettingManager> provider2) {
        return new PreferredNavigationAppSettingContentProvider_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.alexa.auto.navigation.PreferredNavigationAppSettingContentProvider.preferredNavAppManager")
    public static void injectPreferredNavAppManager(PreferredNavigationAppSettingContentProvider preferredNavigationAppSettingContentProvider, Object obj) {
        preferredNavigationAppSettingContentProvider.preferredNavAppManager = (PreferredNavigationAppSettingManager) obj;
    }

    @InjectedFieldSignature("com.amazon.alexa.auto.navigation.PreferredNavigationAppSettingContentProvider.uriMatcher")
    @Named("preferred_nav_app_content_uri_matcher")
    public static void injectUriMatcher(PreferredNavigationAppSettingContentProvider preferredNavigationAppSettingContentProvider, UriMatcher uriMatcher) {
        preferredNavigationAppSettingContentProvider.uriMatcher = uriMatcher;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PreferredNavigationAppSettingContentProvider preferredNavigationAppSettingContentProvider) {
        injectUriMatcher(preferredNavigationAppSettingContentProvider, this.uriMatcherProvider.get());
        injectPreferredNavAppManager(preferredNavigationAppSettingContentProvider, this.preferredNavAppManagerProvider.get());
    }
}
