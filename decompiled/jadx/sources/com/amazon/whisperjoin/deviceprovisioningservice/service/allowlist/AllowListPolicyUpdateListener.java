package com.amazon.whisperjoin.deviceprovisioningservice.service.allowlist;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import com.amazon.whisperjoin.deviceprovisioningservice.service.ProvisionerClientData;
import com.amazon.whisperjoin.deviceprovisioningservice.util.IntentActionConstants;
import java.lang.ref.WeakReference;
import javax.annotation.Nonnull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AllowListPolicyUpdateListener {
    private static final String TAG = "AllowListPolicyUpdateListener";
    private final Context mContext;
    private PolicyUpdateReceiver mPolicyUpdateReceiver;
    private final ProvisionerClientData mProvisionerClientData;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AllowListPolicyUpdateCallback {
        void onUpdate(AllowListPolicy allowListPolicy, ProvisionerClientData provisionerClientData);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PolicyUpdateReceiver extends BroadcastReceiver {
        private static final String TAG = "PolicyUpdateReceiver";
        private final WeakReference<AllowListPolicyUpdateCallback> mAllowListPolicyUpdateCallback;
        private final ProvisionerClientData mProvisionerClientData;

        public PolicyUpdateReceiver(@Nonnull ProvisionerClientData provisionerClientData, @Nonnull AllowListPolicyUpdateCallback allowListPolicyUpdateCallback) {
            this.mProvisionerClientData = provisionerClientData;
            this.mAllowListPolicyUpdateCallback = new WeakReference<>(allowListPolicyUpdateCallback);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (this.mAllowListPolicyUpdateCallback.get() == null) {
                return;
            }
            if (!intent.getAction().equals(IntentActionConstants.ALLOWLIST_POLICY_UPDATE_ACTION)) {
                WJLog.e(TAG, "Received incorrect intent: " + intent);
                return;
            }
            Bundle extras = intent.getExtras();
            AllowListPolicy readFromBundle = AllowListPolicy.readFromBundle(extras);
            ProvisionerClientData readFromBundle2 = ProvisionerClientData.readFromBundle(extras);
            if (readFromBundle == null) {
                WJLog.e(TAG, "Received null AllowListPolicy. Ignoring update.");
                return;
            }
            if (readFromBundle2 == null) {
                WJLog.e(TAG, "Received null provisionerClientData. Ignoring Update");
            } else if (this.mProvisionerClientData.equals(readFromBundle2)) {
                this.mAllowListPolicyUpdateCallback.get().onUpdate(readFromBundle, readFromBundle2);
            } else {
                WJLog.e(TAG, "AllowListPolicy's client data doesn't match current client data");
            }
        }
    }

    public AllowListPolicyUpdateListener(@Nonnull Context context, @Nonnull ProvisionerClientData provisionerClientData) {
        this.mContext = context;
        this.mProvisionerClientData = provisionerClientData;
    }

    public void registerForAllowListPolicyUpdates(@Nonnull AllowListPolicyUpdateCallback allowListPolicyUpdateCallback) {
        String str = TAG;
        WJLog.d(str, "registerForAllowListPolicyUpdates");
        if (this.mPolicyUpdateReceiver != null) {
            WJLog.d(str, "Other callback already registered, replacing with new callback");
            unregisterForAllowListPolicyUpdates();
        }
        this.mPolicyUpdateReceiver = new PolicyUpdateReceiver(this.mProvisionerClientData, allowListPolicyUpdateCallback);
        IntentFilter intentFilter = new IntentFilter(IntentActionConstants.ALLOWLIST_POLICY_UPDATE_ACTION);
        int i = Build.VERSION.SDK_INT;
        Context context = this.mContext;
        PolicyUpdateReceiver policyUpdateReceiver = this.mPolicyUpdateReceiver;
        if (i >= 33) {
            context.registerReceiver(policyUpdateReceiver, intentFilter, IntentActionConstants.ALLOWLIST_POLICY_UPDATE_PERMISSION, null, 2);
        } else {
            context.registerReceiver(policyUpdateReceiver, intentFilter, IntentActionConstants.ALLOWLIST_POLICY_UPDATE_PERMISSION, null);
        }
    }

    public void unregisterForAllowListPolicyUpdates() {
        WJLog.d(TAG, "unregisterForAllowListPolicyUpdates");
        PolicyUpdateReceiver policyUpdateReceiver = this.mPolicyUpdateReceiver;
        if (policyUpdateReceiver == null) {
            return;
        }
        this.mContext.unregisterReceiver(policyUpdateReceiver);
        this.mPolicyUpdateReceiver = null;
    }
}
