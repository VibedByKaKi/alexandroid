package com.amazon.whisperjoin.provisioning.metrics.client;

import android.content.Context;
import com.amazon.minerva.client.thirdparty.api.AmazonMinerva;
import com.amazon.whisperjoin.provisioning.Radios;
import com.amazon.whisperjoin.provisioning.metrics.client.SetupAttemptMetrics;
import com.amazon.whisperjoin.provisioning.metrics.client.helpers.ConnectionMetrics;
import com.amazon.whisperjoin.provisioning.metrics.client.helpers.DeviceMetrics;
import com.amazon.whisperjoin.provisioning.metrics.client.helpers.RegistrationMetrics;
import com.amazon.whisperjoin.provisioning.metrics.client.helpers.SecureSessionMetrics;
import com.amazon.whisperjoin.provisioning.metrics.client.helpers.WifiSetupMetrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class WhisperJoinSetupAttemptMetrics extends SetupAttemptMetrics {
    public InternalMetrics internalMetrics;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder extends SetupAttemptMetrics.Builder<WhisperJoinSetupAttemptMetrics> {
        @Override // com.amazon.whisperjoin.provisioning.metrics.client.SetupAttemptMetrics.Builder
        public WhisperJoinSetupAttemptMetrics build() {
            setActiveRadio(Radios.BLE);
            validateConfiguration();
            return new WhisperJoinSetupAttemptMetrics(this.mContext, this.mMinervaClient, this.mSourceName, this.mAppVersion, this.mDirectedId, this.mActiveRadio, this.mMinSchemaId);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class InternalMetrics {
        public final ConnectionMetrics connectionMetrics;
        public final DeviceMetrics deviceMetrics;
        public RegistrationMetrics registrationMetrics;
        public final SecureSessionMetrics secureSessionMetrics;
        public WifiSetupMetrics wifiSetupMetrics;

        public InternalMetrics(MinervaMetricHelper minervaMetricHelper, Radios radios) {
            this.deviceMetrics = new DeviceMetrics(minervaMetricHelper);
            this.connectionMetrics = new ConnectionMetrics(minervaMetricHelper, radios);
            this.secureSessionMetrics = new SecureSessionMetrics(minervaMetricHelper);
            this.registrationMetrics = new RegistrationMetrics(WhisperJoinSetupAttemptMetrics.this.mMinervaMetricHelper);
            this.wifiSetupMetrics = new WifiSetupMetrics(WhisperJoinSetupAttemptMetrics.this.mMinervaMetricHelper);
        }
    }

    public WhisperJoinSetupAttemptMetrics(Context context, AmazonMinerva amazonMinerva, String str, String str2, String str3, Radios radios, String str4) {
        super(context, amazonMinerva, str, str2, str3, radios, str4);
        this.internalMetrics = new InternalMetrics(this.mMinervaMetricHelper, this.mActiveRadio);
    }
}
