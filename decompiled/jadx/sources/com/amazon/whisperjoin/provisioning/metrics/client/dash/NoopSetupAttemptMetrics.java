package com.amazon.whisperjoin.provisioning.metrics.client.dash;

import android.content.Context;
import com.amazon.minerva.client.thirdparty.api.AmazonMinerva;
import com.amazon.whisperjoin.provisioning.Radios;
import com.amazon.whisperjoin.provisioning.metrics.client.WhisperJoinSetupAttemptMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class NoopSetupAttemptMetrics extends WhisperJoinSetupAttemptMetrics {
    public NoopSetupAttemptMetrics(Context context, AmazonMinerva amazonMinerva, String str, String str2, String str3, Radios radios, String str4) {
        super(context, amazonMinerva, str, str2, str3, radios, str4);
    }

    @Override // com.amazon.whisperjoin.provisioning.metrics.client.SetupAttemptMetrics
    public void onTerminationSuccess() {
    }

    @Override // com.amazon.whisperjoin.provisioning.metrics.client.SetupAttemptMetrics
    public void onTerminationAborted(String str) {
    }

    @Override // com.amazon.whisperjoin.provisioning.metrics.client.SetupAttemptMetrics
    public void onTerminationFailure(String str, Throwable th) {
    }
}
