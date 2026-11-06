package com.amazon.alexa.accessory.notificationpublisher.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.notificationpublisher.exceptions.RxBlockingCallException;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class VipFilterSettingStorageHelper {
    public static final String EMPTY_STRING = "";
    private static final String LOCAL_STORAGE_TAG = "VIP_FILTER";
    private static final String TAG = "VipFilterSettingStorageHelper";
    private static VipFilterSettingStorageHelper vipFilterSettingStorageHelper;
    private StorageWrapper storageWrapper;
    public static final Set<String> VIP_FILTER_SETTING_KEYS = new ImmutableSet.Builder().add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_APPROVE_INVITATION_ON_ACCESSORY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_APP_SINGLE_NAMED_GROUP_STATUS).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_APP_STATUS).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_APP_UNNAMED_GROUP_STATUS_KEY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_CONTACT_STATUS_KEY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_FORWARD_NOTIFICATION_TO_ACCESSORY_ENABLEMENT_KEY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_NOTIFICATION_CONTENT_READOUT_ENABLEMENT_KEY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_NOTIFICATION_CONTENT_SUMMARY_ENABLEMENT_KEY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_STATUS_ENABLEMENT_KEY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_SYNC_STATUS_ENABLEMENT_KEY).add((ImmutableSet.Builder) SettingsStorageModule.LOW_DISTRACTION_MODE_KEY).add((ImmutableSet.Builder) SettingsStorageModule.SILENT_DISTRACTION_MODE_KEY).add((ImmutableSet.Builder) SettingsStorageModule.GROUP_MESSAGES_MASTER_TOGGLE_KEY).add((ImmutableSet.Builder) SettingsStorageModule.REPLY_FTU_FEATURE_EDUCATION_COMPLETE_KEY).add((ImmutableSet.Builder) SettingsStorageModule.GROUP_MESSAGES_USER_EDUCATION_COMPLETE_KEY).add((ImmutableSet.Builder) SettingsStorageModule.FOCUS_FILTER_REJECTED_INVITATION_NUM_KEY).add((ImmutableSet.Builder) SettingsStorageModule.FOCUS_FILTER_OPENED_NOTIFICATION_NUM_KEY).build();
    private static final Set<String> VIP_FILTER_STRING_STRING_PAIR_SETTINGS = new ImmutableSet.Builder().add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_APPROVE_INVITATION_ON_ACCESSORY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_FORWARD_NOTIFICATION_TO_ACCESSORY_ENABLEMENT_KEY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_NOTIFICATION_CONTENT_READOUT_ENABLEMENT_KEY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_NOTIFICATION_CONTENT_SUMMARY_ENABLEMENT_KEY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_STATUS_ENABLEMENT_KEY).add((ImmutableSet.Builder) SettingsStorageModule.VIP_FILTER_SYNC_STATUS_ENABLEMENT_KEY).add((ImmutableSet.Builder) SettingsStorageModule.LOW_DISTRACTION_MODE_KEY).add((ImmutableSet.Builder) SettingsStorageModule.SILENT_DISTRACTION_MODE_KEY).add((ImmutableSet.Builder) SettingsStorageModule.GROUP_MESSAGES_MASTER_TOGGLE_KEY).add((ImmutableSet.Builder) SettingsStorageModule.GROUP_MESSAGES_USER_EDUCATION_COMPLETE_KEY).add((ImmutableSet.Builder) SettingsStorageModule.REPLY_FTU_FEATURE_EDUCATION_COMPLETE_KEY).add((ImmutableSet.Builder) SettingsStorageModule.FOCUS_FILTER_REJECTED_INVITATION_NUM_KEY).add((ImmutableSet.Builder) SettingsStorageModule.FOCUS_FILTER_OPENED_NOTIFICATION_NUM_KEY).build();
    public static final JSONObject EMPTY_JSON_OBJECT = new JSONObject();

    @VisibleForTesting
    public VipFilterSettingStorageHelper(StorageWrapper storageWrapper) {
        this.storageWrapper = storageWrapper;
    }

    private Object convertToBooleanForEnablementSettings(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "Alexa.Accessories.VipFilter.notificationContentReadoutEnablement":
            case "Alexa.Accessories.VipFilter.forwardNotificationToAccessoryEnablement":
            case "Alexa.Accessories.VipFilter.notificationContentSummaryEnablement":
            case "Alexa.Accessories.VipFilter.statusEnablement":
            case "Alexa.Accessories.VipFilter.approveInvitationOnAccessory":
                return Boolean.valueOf("ENABLED".equalsIgnoreCase(obj.toString()));
            default:
                return obj;
        }
    }

    private Object convertToEnabledForEnablementSettings(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "Alexa.Accessories.VipFilter.notificationContentReadoutEnablement":
            case "Alexa.Accessories.VipFilter.forwardNotificationToAccessoryEnablement":
            case "Alexa.Accessories.VipFilter.notificationContentSummaryEnablement":
            case "Alexa.Accessories.VipFilter.statusEnablement":
            case "Alexa.Accessories.VipFilter.approveInvitationOnAccessory":
                return ((Boolean) obj).booleanValue() ? "ENABLED" : "DISABLED";
            default:
                return obj;
        }
    }

    public static VipFilterSettingStorageHelper getInstance() {
        if (vipFilterSettingStorageHelper == null) {
            vipFilterSettingStorageHelper = new VipFilterSettingStorageHelper();
        }
        return vipFilterSettingStorageHelper;
    }

    private synchronized StorageWrapper getStorageWrapper() {
        StorageWrapper storageWrapper = this.storageWrapper;
        if (storageWrapper != null) {
            return storageWrapper;
        }
        StorageWrapper storageWrapper2 = new StorageWrapper(LOCAL_STORAGE_TAG);
        this.storageWrapper = storageWrapper2;
        return storageWrapper2;
    }

    public void clear(@NonNull String str) throws IllegalArgumentException, RxBlockingCallException, JSONException {
        Locale locale = Locale.US;
        Log.d(TAG, a$$ExternalSyntheticOutline0.m("clear - device type: ", str));
        try {
            for (String str2 : VIP_FILTER_SETTING_KEYS) {
                JSONObject jSONObject = (JSONObject) getStorageWrapper().get(str2);
                if (jSONObject != null && jSONObject.has(str)) {
                    if (!SettingsStorageModule.VIP_FILTER_CONTACT_STATUS_KEY.equals(str2)) {
                        if (!SettingsStorageModule.VIP_FILTER_APP_STATUS.equals(str2)) {
                            if (!SettingsStorageModule.VIP_FILTER_APP_SINGLE_NAMED_GROUP_STATUS.equals(str2)) {
                                if (SettingsStorageModule.VIP_FILTER_APP_UNNAMED_GROUP_STATUS_KEY.equals(str2)) {
                                }
                                jSONObject.remove(str);
                                getStorageWrapper().putLocal(str2, jSONObject);
                            }
                        }
                    }
                    getStorageWrapper().putCloud(str2, EMPTY_JSON_OBJECT, str2);
                    jSONObject.remove(str);
                    getStorageWrapper().putLocal(str2, jSONObject);
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to clear for " + str, e);
            throw e;
        }
    }

    public Object get(@NonNull String str, @NonNull String str2) throws JSONException, RxBlockingCallException {
        String str3 = TAG;
        Log.d(str3, "get - deviceType: " + str + " key: " + str2);
        try {
            JSONObject jSONObject = (JSONObject) getStorageWrapper().get(str2);
            Log.d(str3, "get -- value: " + jSONObject);
            return (jSONObject == null || !jSONObject.has(str)) ? VIP_FILTER_STRING_STRING_PAIR_SETTINGS.contains(str2) ? "" : EMPTY_JSON_OBJECT : convertToBooleanForEnablementSettings(str2, jSONObject.get(str));
        } catch (Exception e) {
            Log.e(TAG, a$$ExternalSyntheticOutline0.m("Failed to get setting: ", str2, " for deviceType: ", str), e);
            throw e;
        }
    }

    public void put(@NonNull String str, @NonNull String str2, @NonNull Object obj, @Nullable String str3) throws RxBlockingCallException, JSONException {
        JSONObject jSONObject;
        Locale locale = Locale.US;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("put - deviceType: ", str, ", key: ", str2, ", cloudKey: ");
        m.append(str3);
        String sb = m.toString();
        String str4 = TAG;
        Log.d(str4, sb);
        try {
            if (Strings.isNullOrEmpty(str3)) {
                str3 = str2;
            }
            Object obj2 = getStorageWrapper().get(str2);
            if (obj2 == null) {
                Log.d(str4, "Creating a new setting for this device type: " + str);
                jSONObject = new JSONObject();
            } else {
                jSONObject = (JSONObject) obj2;
            }
            jSONObject.put(str, convertToEnabledForEnablementSettings(str2, obj));
            getStorageWrapper().put(str2, jSONObject, str3);
        } catch (Exception e) {
            Log.e(TAG, a$$ExternalSyntheticOutline0.m("Failed to put setting: ", str2, " for deviceType: ", str), e);
            throw e;
        }
    }

    public void putLocal(@NonNull String str, @NonNull String str2, @NonNull Object obj) throws JSONException, RxBlockingCallException {
        try {
            Object obj2 = getStorageWrapper().get(str2);
            JSONObject jSONObject = obj2 == null ? new JSONObject() : (JSONObject) obj2;
            jSONObject.put(str, obj);
            getStorageWrapper().putLocal(str2, jSONObject);
        } catch (RxBlockingCallException e) {
            e.printStackTrace();
            throw e;
        } catch (JSONException e2) {
            e2.printStackTrace();
            throw e2;
        }
    }

    public void putLocalSync(@NonNull String str, @NonNull String str2, @NonNull Object obj) throws JSONException, RxBlockingCallException {
        try {
            Object obj2 = getStorageWrapper().get(str2);
            JSONObject jSONObject = obj2 == null ? new JSONObject() : (JSONObject) obj2;
            jSONObject.put(str, obj);
            getStorageWrapper().putLocalSync(str2, jSONObject);
        } catch (RxBlockingCallException e) {
            e.printStackTrace();
            throw e;
        } catch (JSONException e2) {
            e2.printStackTrace();
            throw e2;
        }
    }

    public void remove(@NonNull String str, @NonNull String str2, @Nullable String str3) throws JSONException, RxBlockingCallException {
        Locale locale = Locale.US;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("remove - device type: ", str, ", key: ", str2, ", cloudKey: ");
        m.append(str3);
        String sb = m.toString();
        String str4 = TAG;
        Log.d(str4, sb);
        try {
            JSONObject jSONObject = (JSONObject) getStorageWrapper().get(str2);
            if (jSONObject == null || !jSONObject.has(str)) {
                Log.d(str4, "There is not matching device type to remove: " + str);
            } else {
                jSONObject.remove(str);
                if (Strings.isNullOrEmpty(str3)) {
                    str3 = str2;
                }
                getStorageWrapper().put(str2, jSONObject, str3);
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to remove key: " + str2 + " for deviceType: " + str);
            throw e;
        }
    }

    public void startFetchFromCloudAsyncTask() {
        Log.d(TAG, "Starts fetching VIP Filter settings.");
        getStorageWrapper().startFetchFromCloudAsyncTask();
    }

    private VipFilterSettingStorageHelper() {
    }
}
