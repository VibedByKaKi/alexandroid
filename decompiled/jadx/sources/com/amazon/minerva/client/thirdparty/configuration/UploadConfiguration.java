package com.amazon.minerva.client.thirdparty.configuration;

import android.util.Log;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.minerva.client.thirdparty.serializer.MetricBatchBinarySerializer;
import com.amazon.minerva.client.thirdparty.serializer.MetricBatchSerializer;
import com.amazon.minerva.client.thirdparty.serializer.MetricBatchTextSerializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UploadConfiguration {
    private static final String TAG = "UploadConfiguration";
    private int mConnectTimeoutMillis;
    private String mIonFormat;
    private String mKpiRegion;
    private int mReadTimeoutMillis;
    private String mUrlEndpoint;
    private long mWakeLockTimeoutMillis;

    public UploadConfiguration(String str, String str2, int i, int i2, long j, String str3) {
        if (isValidInput(str, str2, i, i2, j, str3)) {
            this.mUrlEndpoint = str;
            this.mIonFormat = str2;
            this.mConnectTimeoutMillis = i;
            this.mReadTimeoutMillis = i2;
            this.mWakeLockTimeoutMillis = j;
            this.mKpiRegion = str3;
        }
    }

    private boolean isValidInput(String str, String str2, long j, long j2, long j3, String str3) {
        if (str == null || str.length() == 0) {
            AppLaunchChecker$$ExternalSyntheticOutline0.m("Invalid urlEndpoint: ", str, ".", TAG);
            return false;
        }
        if (str2 == null || str2.length() == 0) {
            AppLaunchChecker$$ExternalSyntheticOutline0.m("Invalid ionFormat: ", str2, ".", TAG);
            return false;
        }
        if (j <= 0) {
            Log.e(TAG, String.format("Invalid connectTimeoutMillis: %d.", Long.valueOf(j)));
            return false;
        }
        if (j2 <= 0) {
            Log.e(TAG, String.format("Invalid readTimeoutMillis: %d.", Long.valueOf(j2)));
            return false;
        }
        if (j3 <= 0) {
            Log.e(TAG, String.format("Invalid wakeLockTimeoutMillis: %d.", Long.valueOf(j3)));
            return false;
        }
        if (str3 != null && str3.length() != 0) {
            return true;
        }
        AppLaunchChecker$$ExternalSyntheticOutline0.m("Invalid kpiRegion: ", str3, ".", TAG);
        return false;
    }

    public MetricBatchSerializer createMetricBatchSerializer() {
        return this.mIonFormat.equals("text/x-amzn-ion") ? new MetricBatchTextSerializer() : new MetricBatchBinarySerializer();
    }

    public int getConnectTimeoutMillis() {
        return this.mConnectTimeoutMillis;
    }

    public String getIonFormat() {
        return this.mIonFormat;
    }

    public String getKPIRegion() {
        return this.mKpiRegion;
    }

    public int getReadTimeoutMillis() {
        return this.mReadTimeoutMillis;
    }

    public String getUrlEndpoint() {
        return this.mUrlEndpoint;
    }

    public long getWakeLockTimeoutMillis() {
        return this.mWakeLockTimeoutMillis;
    }
}
