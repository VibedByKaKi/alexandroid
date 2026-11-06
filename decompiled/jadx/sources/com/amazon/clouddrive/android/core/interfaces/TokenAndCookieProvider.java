package com.amazon.clouddrive.android.core.interfaces;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface TokenAndCookieProvider {
    @Nullable
    @WorkerThread
    String getAccessTokenBlocking(@NonNull Context context);

    @Nullable
    @WorkerThread
    String[] getCookiesBlocking(@NonNull Context context, @NonNull String str);

    @Nullable
    @WorkerThread
    Bundle getCookiesBundleBlocking(@NonNull Context context, @NonNull String str, @Nullable Bundle bundle);
}
