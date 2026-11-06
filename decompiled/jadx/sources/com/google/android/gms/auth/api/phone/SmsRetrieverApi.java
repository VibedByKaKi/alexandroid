package com.google.android.gms.auth.api.phone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface SmsRetrieverApi {
    @NonNull
    Task<Void> startSmsRetriever();

    @NonNull
    Task<Void> startSmsUserConsent(@Nullable String str);
}
