package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.RetryPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExperimentalRetryPolicy
/* loaded from: classes.dex */
public interface RetryPolicyInternal extends RetryPolicy {
    @NonNull
    RetryPolicy copy(long j);
}
