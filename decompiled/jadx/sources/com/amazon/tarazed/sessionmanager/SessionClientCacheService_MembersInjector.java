package com.amazon.tarazed.sessionmanager;

import com.amazon.tarazed.sessionclient.sessioncache.SessionClientCache;
import dagger.MembersInjector;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class SessionClientCacheService_MembersInjector implements MembersInjector<SessionClientCacheService> {
    private final Provider<SessionClientCache> sessionClientCacheProvider;

    public SessionClientCacheService_MembersInjector(Provider<SessionClientCache> provider) {
        this.sessionClientCacheProvider = provider;
    }

    public static MembersInjector<SessionClientCacheService> create(Provider<SessionClientCache> provider) {
        return new SessionClientCacheService_MembersInjector(provider);
    }

    public static void injectSessionClientCache(SessionClientCacheService sessionClientCacheService, SessionClientCache sessionClientCache) {
        sessionClientCacheService.sessionClientCache = sessionClientCache;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(SessionClientCacheService sessionClientCacheService) {
        injectSessionClientCache(sessionClientCacheService, this.sessionClientCacheProvider.get());
    }
}
