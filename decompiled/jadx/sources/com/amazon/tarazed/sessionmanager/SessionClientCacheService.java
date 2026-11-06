package com.amazon.tarazed.sessionmanager;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.tarazed.dagger.injectors.LibraryInjector;
import com.amazon.tarazed.notification.type.TarazedLaunchRequest;
import com.amazon.tarazed.sessionclient.model.createcredentials.CreateCredentialsResponse;
import com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache;
import com.amazon.tarazed.sessionclient.sessioncache.Post23SessionClientCache;
import com.amazon.tarazed.sessionclient.sessioncache.SessionClientCache;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/amazon/tarazed/sessionmanager/SessionClientCacheService;", "Landroid/app/Service;", "()V", "sessionClientCache", "Lcom/amazon/tarazed/sessionclient/sessioncache/SessionClientCache;", "getSessionClientCache", "()Lcom/amazon/tarazed/sessionclient/sessioncache/SessionClientCache;", "setSessionClientCache", "(Lcom/amazon/tarazed/sessionclient/sessioncache/SessionClientCache;)V", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onCreate", "", "LocalBinder", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SessionClientCacheService extends Service {

    @Inject
    public SessionClientCache sessionClientCache;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/tarazed/sessionmanager/SessionClientCacheService$LocalBinder;", "Lcom/amazon/tarazed/sessionclient/sessioncache/ISessionClientCache$Stub;", "sessionClientCache", "Lcom/amazon/tarazed/sessionclient/sessioncache/SessionClientCache;", "(Lcom/amazon/tarazed/sessionclient/sessioncache/SessionClientCache;)V", "clearLaunchRequest", "", "getLaunchRequest", "", "getSessionCredentials", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "putLaunchRequest", Post23SessionClientCache.LAUNCH_REQUEST_CACHE, "putSessionCredentials", "createCredentialsResponse", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LocalBinder extends ISessionClientCache.Stub {

        @NotNull
        private final SessionClientCache sessionClientCache;

        public LocalBinder(@NotNull SessionClientCache sessionClientCache) {
            sessionClientCache.getClass();
            this.sessionClientCache = sessionClientCache;
        }

        @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
        public void clearLaunchRequest() {
            this.sessionClientCache.clearLaunchRequest();
        }

        @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
        @Nullable
        public String getLaunchRequest() {
            TarazedLaunchRequest launchRequest = this.sessionClientCache.getLaunchRequest();
            if (launchRequest != null) {
                return JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.amazon.tarazed.sessionmanager.SessionClientCacheService$LocalBinder$getLaunchRequest$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                        invoke2(jsonBuilder);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull JsonBuilder jsonBuilder) {
                        jsonBuilder.getClass();
                        jsonBuilder.setIgnoreUnknownKeys(true);
                    }
                }, 1, null).encodeToString(TarazedLaunchRequest.INSTANCE.serializer(), launchRequest);
            }
            return null;
        }

        @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
        @Nullable
        public String getSessionCredentials(@NotNull String sessionId) {
            sessionId.getClass();
            CreateCredentialsResponse sessionCredentials = this.sessionClientCache.getSessionCredentials(sessionId);
            if (sessionCredentials != null) {
                return JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.amazon.tarazed.sessionmanager.SessionClientCacheService$LocalBinder$getSessionCredentials$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                        invoke2(jsonBuilder);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull JsonBuilder jsonBuilder) {
                        jsonBuilder.getClass();
                        jsonBuilder.setIgnoreUnknownKeys(true);
                    }
                }, 1, null).encodeToString(CreateCredentialsResponse.INSTANCE.serializer(), sessionCredentials);
            }
            return null;
        }

        @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
        public void putLaunchRequest(@NotNull String launchRequest) {
            launchRequest.getClass();
            this.sessionClientCache.putLaunchRequest((TarazedLaunchRequest) JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.amazon.tarazed.sessionmanager.SessionClientCacheService$LocalBinder$putLaunchRequest$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                    invoke2(jsonBuilder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull JsonBuilder jsonBuilder) {
                    jsonBuilder.getClass();
                    jsonBuilder.setIgnoreUnknownKeys(true);
                }
            }, 1, null).decodeFromString(TarazedLaunchRequest.INSTANCE.serializer(), launchRequest));
        }

        @Override // com.amazon.tarazed.sessionclient.sessioncache.ISessionClientCache
        public void putSessionCredentials(@NotNull String sessionId, @NotNull String createCredentialsResponse) {
            sessionId.getClass();
            createCredentialsResponse.getClass();
            this.sessionClientCache.putSessionCredentials(sessionId, (CreateCredentialsResponse) JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.amazon.tarazed.sessionmanager.SessionClientCacheService$LocalBinder$putSessionCredentials$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                    invoke2(jsonBuilder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull JsonBuilder jsonBuilder) {
                    jsonBuilder.getClass();
                    jsonBuilder.setIgnoreUnknownKeys(true);
                }
            }, 1, null).decodeFromString(CreateCredentialsResponse.INSTANCE.serializer(), createCredentialsResponse));
        }
    }

    @NotNull
    public final SessionClientCache getSessionClientCache() {
        SessionClientCache sessionClientCache = this.sessionClientCache;
        if (sessionClientCache != null) {
            return sessionClientCache;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionClientCache");
        return null;
    }

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@NotNull Intent p0) {
        p0.getClass();
        return new LocalBinder(getSessionClientCache());
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LibraryInjector.getComponent().inject(this);
    }

    public final void setSessionClientCache(@NotNull SessionClientCache sessionClientCache) {
        sessionClientCache.getClass();
        this.sessionClientCache = sessionClientCache;
    }
}
