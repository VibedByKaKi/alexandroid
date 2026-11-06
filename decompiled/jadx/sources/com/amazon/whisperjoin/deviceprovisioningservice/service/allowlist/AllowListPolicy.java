package com.amazon.whisperjoin.deviceprovisioningservice.service.allowlist;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.amazon.whisperjoin.common.sharedtypes.radios.ScanningMode;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AllowListPolicy {
    private static final String KEY_LAST_REFRESH = "FFSAllowListPolicy.LastRefresh";
    private static final String KEY_MIN_BATTERY_LEVEL = "FFSAllowListPolicy.MinBatteryLevel";
    private static final String KEY_POLICY_EXPIRES_AT = "FFSAllowListPolicy.ExpiresAt";
    private static final String KEY_SCAN_MODE = "FFSAllowListPolicy.ScanMode";
    private static final String PREFIX = "FFSAllowListPolicy.";
    private static final String TAG = "AllowListPolicy";
    private final long mLastRefresh;
    private final int mMinBatteryLevel;
    private final long mPolicyExpiresAt;
    private final ScanningMode mScanningMode;

    public AllowListPolicy(ScanningMode scanningMode, int i, long j, long j2) {
        if (scanningMode == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("scanningMode can not be null");
            throw null;
        }
        if (i < 0 || i > 100) {
            Single$$ExternalSyntheticBUOutline0.m$3("minBatteryLevel must be within 0 to 100");
            throw null;
        }
        if (j < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("policyExpiresAt must be a positive number");
            throw null;
        }
        if (j2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("lastRefresh must be a positive number");
            throw null;
        }
        this.mScanningMode = scanningMode;
        this.mMinBatteryLevel = i;
        this.mPolicyExpiresAt = j;
        this.mLastRefresh = j2;
    }

    public static AllowListPolicy readFromBundle(Bundle bundle) {
        if (bundle == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bundle can not be null");
            return null;
        }
        try {
            return new AllowListPolicy(ScanningMode.values()[bundle.getInt(KEY_SCAN_MODE, 0)], bundle.getInt(KEY_MIN_BATTERY_LEVEL, -1), bundle.getLong(KEY_POLICY_EXPIRES_AT, -1L), bundle.getLong(KEY_LAST_REFRESH, -1L));
        } catch (IllegalArgumentException unused) {
            WJLog.d(TAG, "No valid AllowListPolicy found in bundle");
            return null;
        }
    }

    public static AllowListPolicy readFromSharedPreferences(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sharedPreferences can not be null");
            return null;
        }
        try {
            return new AllowListPolicy(ScanningMode.values()[sharedPreferences.getInt(KEY_SCAN_MODE, 0)], sharedPreferences.getInt(KEY_MIN_BATTERY_LEVEL, -1), sharedPreferences.getLong(KEY_POLICY_EXPIRES_AT, -1L), sharedPreferences.getLong(KEY_LAST_REFRESH, -1L));
        } catch (IllegalArgumentException unused) {
            WJLog.d(TAG, "No valid AllowListPolicy found in SharedPreferences");
            return null;
        }
    }

    public static void writeToBundle(AllowListPolicy allowListPolicy, Bundle bundle) {
        if (allowListPolicy == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("allowListPolicy can not be null");
            return;
        }
        if (bundle == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bundle can not be null");
            return;
        }
        bundle.putInt(KEY_SCAN_MODE, allowListPolicy.getScanningMode().ordinal());
        bundle.putInt(KEY_MIN_BATTERY_LEVEL, allowListPolicy.getMinBatteryLevel());
        bundle.putLong(KEY_POLICY_EXPIRES_AT, allowListPolicy.getPolicyExpiresAt());
        bundle.putLong(KEY_LAST_REFRESH, allowListPolicy.getLastRefresh());
    }

    public static void writeToSharedPreferences(AllowListPolicy allowListPolicy, SharedPreferences sharedPreferences) {
        if (allowListPolicy == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("allowListPolicy can not be null");
            return;
        }
        if (sharedPreferences == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sharedPreferences can not be null");
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(KEY_SCAN_MODE, allowListPolicy.getScanningMode().ordinal());
        edit.putInt(KEY_MIN_BATTERY_LEVEL, allowListPolicy.getMinBatteryLevel());
        edit.putLong(KEY_POLICY_EXPIRES_AT, allowListPolicy.getPolicyExpiresAt());
        edit.putLong(KEY_LAST_REFRESH, allowListPolicy.getLastRefresh());
        edit.apply();
    }

    public boolean allowedToScan() {
        return !this.mScanningMode.equals(ScanningMode.PROHIBITED);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AllowListPolicy allowListPolicy = (AllowListPolicy) obj;
            if (this.mMinBatteryLevel == allowListPolicy.mMinBatteryLevel && this.mPolicyExpiresAt == allowListPolicy.mPolicyExpiresAt && this.mLastRefresh == allowListPolicy.mLastRefresh && this.mScanningMode == allowListPolicy.mScanningMode) {
                return true;
            }
        }
        return false;
    }

    public long getLastRefresh() {
        return this.mLastRefresh;
    }

    public int getMinBatteryLevel() {
        return this.mMinBatteryLevel;
    }

    public long getPolicyExpiresAt() {
        return this.mPolicyExpiresAt;
    }

    public ScanningMode getScanningMode() {
        return this.mScanningMode;
    }

    public int hashCode() {
        return Objects.hashCode(this.mScanningMode, Integer.valueOf(this.mMinBatteryLevel), Long.valueOf(this.mPolicyExpiresAt), Long.valueOf(this.mLastRefresh));
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mScanningMode", this.mScanningMode).add("mMinBatteryLevel", this.mMinBatteryLevel).add("mPolicyExpiresAt", this.mPolicyExpiresAt).add("mLastRefresh", this.mLastRefresh).toString();
    }
}
