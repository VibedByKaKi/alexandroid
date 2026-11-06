package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public abstract class OptionalPendingResult<R extends Result> extends PendingResult<R> {
    @NonNull
    public abstract R get();

    public abstract boolean isDone();
}
