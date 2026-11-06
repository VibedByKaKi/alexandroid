package com.amazon.clouddrive.cdasdk;

import androidx.annotation.NonNull;
import com.amazon.clouddrive.cdasdk.SdkMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class NoOpSdkMetrics implements SdkMetrics {
    @Override // com.amazon.clouddrive.cdasdk.SdkMetrics
    public void recordCallError(@NonNull SdkMetrics.Service service, @NonNull String str, @NonNull Exception exc) {
    }

    @Override // com.amazon.clouddrive.cdasdk.SdkMetrics
    public void recordCallSuccess(@NonNull SdkMetrics.Service service, @NonNull String str, long j) {
    }
}
