package com.amazon.clouddrive.cdasdk;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SdkMetrics {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Service {
        CDS,
        Prompto,
        APS,
        OneLens,
        CDTS,
        CDP,
        CDUS,
        CDDS,
        CDRS,
        DPS
    }

    void recordCallError(@NonNull Service service, @NonNull String str, @NonNull Exception exc);

    void recordCallSuccess(@NonNull Service service, @NonNull String str, long j);
}
