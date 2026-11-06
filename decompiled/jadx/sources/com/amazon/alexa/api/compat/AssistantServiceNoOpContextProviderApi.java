package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.compat.model.AlexaContext;
import com.amazon.alexa.api.compat.model.AlexaContextsProvider;
import com.amazon.alexa.api.compat.model.ContextProperty;
import com.amazon.alexa.api.compat.model.ContextProviderApiV2;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\t\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0016\u0010\u0012\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/api/compat/AssistantServiceNoOpContextProviderApi;", "Lcom/amazon/alexa/api/compat/model/ContextProviderApiV2;", "<init>", "()V", "registerContextsProvider", "", "alexaContextsProvider", "Lcom/amazon/alexa/api/compat/model/AlexaContextsProvider;", "deregisterContextsProvider", "setContextCachingEnabled", "enableContextCaching", "", "namespaces", "", "", "cacheContexts", "alexaContexts", "Lcom/amazon/alexa/api/compat/model/AlexaContext;", "clearContextCache", "getContextProperty", "Lcom/amazon/alexa/api/compat/model/ContextProperty;", "namespace", "Companion", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AssistantServiceNoOpContextProviderApi implements ContextProviderApiV2 {

    @Deprecated
    @NotNull
    public static final String API = "ContextProviderApiV2";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Override // com.amazon.alexa.api.compat.model.ContextProviderApiV2
    public void cacheContexts(@NotNull Set<AlexaContext> alexaContexts) {
        alexaContexts.getClass();
        AssistantServiceUnsupportedApis.INSTANCE.logUnsupported(API, "cacheContexts");
    }

    @Override // com.amazon.alexa.api.compat.model.ContextProviderApiV2
    public void clearContextCache(@NotNull Set<String> namespaces) {
        namespaces.getClass();
        AssistantServiceUnsupportedApis.INSTANCE.logUnsupported(API, "clearContextCache");
    }

    @Override // com.amazon.alexa.api.compat.model.ContextProviderApiV2
    public void deregisterContextsProvider(@NotNull AlexaContextsProvider alexaContextsProvider) {
        alexaContextsProvider.getClass();
        AssistantServiceUnsupportedApis.INSTANCE.logUnsupported(API, "deregisterContextsProvider");
    }

    @Override // com.amazon.alexa.api.compat.model.ContextProviderApiV2
    @Nullable
    public ContextProperty getContextProperty(@NotNull String namespace) {
        namespace.getClass();
        AssistantServiceUnsupportedApis.INSTANCE.logUnsupported(API, "getContextProperty");
        return null;
    }

    @Override // com.amazon.alexa.api.compat.model.ContextProviderApiV2
    public void registerContextsProvider(@NotNull AlexaContextsProvider alexaContextsProvider) {
        alexaContextsProvider.getClass();
        AssistantServiceUnsupportedApis.INSTANCE.logUnsupported(API, "registerContextsProvider");
    }

    @Override // com.amazon.alexa.api.compat.model.ContextProviderApiV2
    public void setContextCachingEnabled(@NotNull Set<String> namespaces, boolean enableContextCaching) {
        namespaces.getClass();
        AssistantServiceUnsupportedApis.INSTANCE.logUnsupported(API, "setContextCachingEnabled");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/api/compat/AssistantServiceNoOpContextProviderApi$Companion;", "", "<init>", "()V", "API", "", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.amazon.alexa.api.compat.model.ContextProviderApiV2
    public void clearContextCache() {
        AssistantServiceUnsupportedApis.INSTANCE.logUnsupported(API, "clearContextCache");
    }

    @Override // com.amazon.alexa.api.compat.model.ContextProviderApiV2
    public void setContextCachingEnabled(boolean enableContextCaching) {
        AssistantServiceUnsupportedApis.INSTANCE.logUnsupported(API, "setContextCachingEnabled");
    }
}
