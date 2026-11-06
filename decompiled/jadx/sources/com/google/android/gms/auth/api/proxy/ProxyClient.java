package com.google.android.gms.auth.api.proxy;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.AuthProxyOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes7.dex */
public interface ProxyClient extends HasApiKey<AuthProxyOptions> {
    @NonNull
    @KeepForSdk
    Task<String> getSpatulaHeader();

    @NonNull
    @KeepForSdk
    Task<ProxyResponse> performProxyRequest(@NonNull ProxyRequest proxyRequest);
}
