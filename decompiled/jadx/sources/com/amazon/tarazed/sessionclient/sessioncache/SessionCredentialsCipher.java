package com.amazon.tarazed.sessionclient.sessioncache;

import com.amazon.tarazed.sessionclient.model.createcredentials.CreateCredentialsResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/amazon/tarazed/sessionclient/sessioncache/SessionCredentialsCipher;", "", "decryptCredentials", "Lcom/amazon/tarazed/sessionclient/model/createcredentials/CreateCredentialsResponse;", "cachedCredentials", "Lcom/amazon/tarazed/sessionclient/sessioncache/CachedSessionCredentials;", "deleteKeyIfExists", "", "encryptCredentials", "Lcom/amazon/tarazed/sessionclient/sessioncache/EncryptedCredentialsData;", "credentials", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface SessionCredentialsCipher {
    @NotNull
    CreateCredentialsResponse decryptCredentials(@NotNull CachedSessionCredentials cachedCredentials);

    void deleteKeyIfExists();

    @NotNull
    EncryptedCredentialsData encryptCredentials(@NotNull CreateCredentialsResponse credentials);
}
