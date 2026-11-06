package com.google.android.gms.auth.api.phone;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface SmsCodeBrowserClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @NonNull
    Task<Void> startSmsCodeRetriever();
}
