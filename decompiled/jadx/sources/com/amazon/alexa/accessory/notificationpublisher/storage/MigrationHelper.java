package com.amazon.alexa.accessory.notificationpublisher.storage;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class MigrationHelper {
    private static final String TAG = "MigrationHelper";
    private static boolean isApproveInvitationOnAccessoryFetched;
    private static boolean isForwardNotificationToAccessoryFetched;
    private static boolean isStatusEnablementFetched;

    @VisibleForTesting
    static Boolean oldZionApproveInvitationOnAccessory;

    @VisibleForTesting
    static Boolean oldZionForwardNotificationToAccessory;

    @VisibleForTesting
    static Boolean oldZionStatusEnablement;

    private MigrationHelper() {
    }

    public static synchronized boolean isApproveInvitationOnAccessoryFetched() {
        boolean z;
        synchronized (MigrationHelper.class) {
            z = isApproveInvitationOnAccessoryFetched;
        }
        return z;
    }

    public static synchronized boolean isForwardNotificationToAccessoryFetched() {
        boolean z;
        synchronized (MigrationHelper.class) {
            z = isForwardNotificationToAccessoryFetched;
        }
        return z;
    }

    public static synchronized boolean isStatusEnablementFetched() {
        boolean z;
        synchronized (MigrationHelper.class) {
            z = isStatusEnablementFetched;
        }
        return z;
    }

    public static synchronized void reset() {
        synchronized (MigrationHelper.class) {
            Log.d(TAG, "Reset");
            isForwardNotificationToAccessoryFetched = false;
            isStatusEnablementFetched = false;
            isApproveInvitationOnAccessoryFetched = false;
            oldZionApproveInvitationOnAccessory = null;
            oldZionForwardNotificationToAccessory = null;
            oldZionStatusEnablement = null;
        }
    }

    public static synchronized void setOldZionApproveInvitationOnAccessory(Boolean bool) {
        synchronized (MigrationHelper.class) {
            oldZionApproveInvitationOnAccessory = bool;
        }
    }

    public static synchronized void setOldZionForwardNotificationToAccessory(Boolean bool) {
        synchronized (MigrationHelper.class) {
            oldZionForwardNotificationToAccessory = bool;
        }
    }

    public static synchronized void setOldZionStatusEnablement(Boolean bool) {
        synchronized (MigrationHelper.class) {
            oldZionStatusEnablement = bool;
        }
    }

    public static synchronized void updateFetchStatus(String str) {
        synchronized (MigrationHelper.class) {
            try {
                String str2 = TAG;
                Log.d(str2, "Update Fetch Status: " + str);
                int hashCode = str.hashCode();
                if (hashCode != -502436310) {
                    if (hashCode != 1846186485) {
                        if (hashCode == 1869150543 && str.equals(SettingsStorageModule.VIP_FILTER_APPROVE_INVITATION_ON_ACCESSORY)) {
                            isApproveInvitationOnAccessoryFetched = true;
                            if (oldZionApproveInvitationOnAccessory != null) {
                                Log.d(str2, "Update Approve Invitation On Approve for Zion");
                                VipFilterSettingStorageHelper.getInstance().put("A3IYPH06PH1HRA", SettingsStorageModule.VIP_FILTER_APPROVE_INVITATION_ON_ACCESSORY, oldZionApproveInvitationOnAccessory, SettingsStorageModule.VIP_FILTER_APPROVE_INVITATION_ON_ACCESSORY);
                            }
                        }
                    } else if (str.equals(SettingsStorageModule.VIP_FILTER_STATUS_ENABLEMENT_KEY)) {
                        isStatusEnablementFetched = true;
                        if (oldZionStatusEnablement != null) {
                            Log.d(str2, "Update Status Enablement for Zion");
                            VipFilterSettingStorageHelper.getInstance().put("A3IYPH06PH1HRA", SettingsStorageModule.VIP_FILTER_STATUS_ENABLEMENT_KEY, oldZionStatusEnablement, SettingsStorageModule.VIP_FILTER_STATUS_ENABLEMENT_KEY);
                        }
                    }
                } else if (str.equals(SettingsStorageModule.VIP_FILTER_FORWARD_NOTIFICATION_TO_ACCESSORY_ENABLEMENT_KEY)) {
                    isForwardNotificationToAccessoryFetched = true;
                    if (oldZionForwardNotificationToAccessory != null) {
                        Log.d(str2, "Update forward notification to Accessory for Zion");
                        VipFilterSettingStorageHelper.getInstance().put("A3IYPH06PH1HRA", SettingsStorageModule.VIP_FILTER_FORWARD_NOTIFICATION_TO_ACCESSORY_ENABLEMENT_KEY, oldZionForwardNotificationToAccessory, SettingsStorageModule.VIP_FILTER_FORWARD_NOTIFICATION_TO_ACCESSORY_ENABLEMENT_KEY);
                    }
                }
            } catch (Exception e) {
                Log.e(TAG, "Exception on update fetch status", e);
            } finally {
            }
        }
    }
}
