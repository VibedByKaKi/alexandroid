package com.amazon.tarazed.sessionclient.sessioncache;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.tarazed.notification.type.TarazedLaunchRequest;
import com.amazon.tarazed.sessionclient.model.createcredentials.CreateCredentialsResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/tarazed/sessionclient/sessioncache/SessionClientCache;", "", "clearLaunchRequest", "", "getLaunchRequest", "Lcom/amazon/tarazed/notification/type/TarazedLaunchRequest;", "getSessionCredentials", "Lcom/amazon/tarazed/sessionclient/model/createcredentials/CreateCredentialsResponse;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "", "putLaunchRequest", Post23SessionClientCache.LAUNCH_REQUEST_CACHE, "putSessionCredentials", Post23SessionClientCache.CACHE_DIR, "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface SessionClientCache {
    void clearLaunchRequest();

    @Nullable
    TarazedLaunchRequest getLaunchRequest();

    @Nullable
    CreateCredentialsResponse getSessionCredentials(@NotNull String sessionId);

    void putLaunchRequest(@NotNull TarazedLaunchRequest launchRequest);

    void putSessionCredentials(@NotNull String sessionId, @NotNull CreateCredentialsResponse sessionCredentials);
}
