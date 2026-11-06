package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface ClientHealthMetricsStore {
    ClientMetrics loadClientMetrics();

    void recordLogEventDropped(long j, LogEventDropped.Reason reason, String str);

    void resetClientMetrics();
}
