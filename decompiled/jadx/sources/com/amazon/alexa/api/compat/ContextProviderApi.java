package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaContext;
import com.amazon.alexa.api.AlexaContextsProvider;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\u0007\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\tH&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/api/compat/ContextProviderApi;", "", "registerContextsProvider", "", "alexaContextsProvider", "Lcom/amazon/alexa/api/AlexaContextsProvider;", "deregisterContextsProvider", "setContextCachingEnabled", "enableContextCaching", "", "namespaces", "", "", "cacheContexts", "alexaContexts", "Lcom/amazon/alexa/api/AlexaContext;", "clearContextCache", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ContextProviderApi {
    void cacheContexts(@NotNull Set<? extends AlexaContext> alexaContexts);

    void clearContextCache();

    void clearContextCache(@NotNull Set<String> namespaces);

    void deregisterContextsProvider(@NotNull AlexaContextsProvider alexaContextsProvider);

    void registerContextsProvider(@NotNull AlexaContextsProvider alexaContextsProvider);

    void setContextCachingEnabled(@NotNull Set<String> namespaces, boolean enableContextCaching);

    void setContextCachingEnabled(boolean enableContextCaching);
}
