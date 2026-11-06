package com.google.android.gms.identitycredentials.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0004\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"CLIENT_KEY", "Lcom/google/android/gms/common/api/Api$ClientKey;", "Lcom/google/android/gms/identitycredentials/internal/IdentityCredentialClientImpl;", "clientBuilder", "com/google/android/gms/identitycredentials/internal/InternalIdentityCredentialClientKt$clientBuilder$1", "Lcom/google/android/gms/identitycredentials/internal/InternalIdentityCredentialClientKt$clientBuilder$1;", "API", "Lcom/google/android/gms/common/api/Api;", "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalIdentityCredentialClientKt {

    @NotNull
    private static final Api<Api.ApiOptions.NoOptions> API;

    @NotNull
    private static final Api.ClientKey<IdentityCredentialClientImpl> CLIENT_KEY;

    @NotNull
    private static final InternalIdentityCredentialClientKt$clientBuilder$1 clientBuilder;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClientKt$clientBuilder$1] */
    static {
        Api.ClientKey<IdentityCredentialClientImpl> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        ?? r1 = new Api.AbstractClientBuilder<IdentityCredentialClientImpl, Api.ApiOptions.NoOptions>() { // from class: com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClientKt$clientBuilder$1
            @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
            @NonNull
            public IdentityCredentialClientImpl buildClient(@NonNull Context context, @NonNull Looper looper, @NonNull ClientSettings commonSettings, @NonNull Api.ApiOptions.NoOptions apiOptions, @NonNull ConnectionCallbacks connectedListener, @NonNull OnConnectionFailedListener connectionFailedListener) {
                context.getClass();
                looper.getClass();
                commonSettings.getClass();
                apiOptions.getClass();
                connectedListener.getClass();
                connectionFailedListener.getClass();
                return new IdentityCredentialClientImpl(context, looper, commonSettings, connectedListener, connectionFailedListener);
            }
        };
        clientBuilder = r1;
        API = new Api<>("IdentityCredentials.API", r1, clientKey);
    }
}
