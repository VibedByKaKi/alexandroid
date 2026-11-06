package com.dee.app.contacts.common.utils;

import androidx.annotation.Nullable;
import com.amazon.commscore.api.identity.AlexaCommsCoreIdentityService;
import com.dee.app.contacts.common.constants.AppUrlConstants;
import com.dee.app.contacts.common.constants.Constants;
import java.text.MessageFormat;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class NetworkUtils {
    private static final ContactsLogger LOG = ContactsLogger.getLogger(Constants.LOG_TAG, NetworkUtils.class);
    private final AlexaCommsCoreIdentityService mCommsIdentityManager;

    @Inject
    public NetworkUtils(@Nullable AlexaCommsCoreIdentityService alexaCommsCoreIdentityService) {
        this.mCommsIdentityManager = alexaCommsCoreIdentityService;
    }

    private String getOwnerHgId(String str) {
        String homeGroupId = getHomeGroupId();
        if (StringUtils.isBlank(str) && StringUtils.isBlank(homeGroupId)) {
            return null;
        }
        return StringUtils.isBlank(str) ? homeGroupId : str;
    }

    private String getOwnerId(String str) {
        String commsId = getCommsId();
        if (StringUtils.isBlank(str) && StringUtils.isBlank(commsId)) {
            return null;
        }
        return StringUtils.isBlank(str) ? commsId : str;
    }

    public String batchUpdateContactsURL(String str) {
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format("/users/{0}/contacts", ownerId);
    }

    public String canSyncContactsURL(String str) {
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format(AppUrlConstants.CAN_SYNC_URL, ownerId);
    }

    public String deleteAddressBooksURL(String str) {
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format("/users/{0}/addressbooks", ownerId);
    }

    public String getAccountsURL() {
        return AppUrlConstants.GET_ACCOUNTS_URL;
    }

    public String getActiveContactsURL() {
        return AppUrlConstants.GET_ACTIVE_CONTACTS;
    }

    public String getAddressBooksURL(String str) {
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format("/users/{0}/addressbooks", ownerId);
    }

    public String getCommsId() {
        AlexaCommsCoreIdentityService alexaCommsCoreIdentityService = this.mCommsIdentityManager;
        if (alexaCommsCoreIdentityService == null || alexaCommsCoreIdentityService.getIdentity() == null) {
            return null;
        }
        return this.mCommsIdentityManager.getIdentity().getCommsId();
    }

    public String getContactByContactIdURL(String str, String str2) {
        if (StringUtils.isBlank(str2)) {
            return null;
        }
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format(AppUrlConstants.GET_CONTACT_BY_CONTACT_ID_URL, ownerId, str2);
    }

    public String getContactPreferenceURL(String str, String str2, String str3) {
        if (StringUtils.isBlank(str2) || StringUtils.isBlank(str3)) {
            return null;
        }
        String ownerHgId = getOwnerHgId(str);
        if (StringUtils.isBlank(ownerHgId)) {
            return null;
        }
        return MessageFormat.format("/users/{0}/contacts/{1}/preferences/{2}", ownerHgId, str2, str3);
    }

    public String getContactURL(String str, String str2) {
        if (StringUtils.isBlank(str2)) {
            return null;
        }
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format("/users/{0}/contact/{1}?view=full", ownerId, str2);
    }

    public String getContactsV2URL(String str) {
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format(AppUrlConstants.GET_CONTACTS_V2_URL, ownerId);
    }

    public String getDevicesURL(String str) {
        String ownerHgId = getOwnerHgId(str);
        if (StringUtils.isBlank(ownerHgId)) {
            return null;
        }
        return MessageFormat.format("/homegroups/{0}/devices?target=false", ownerHgId);
    }

    public String getHomeGroupId() {
        AlexaCommsCoreIdentityService alexaCommsCoreIdentityService = this.mCommsIdentityManager;
        if (alexaCommsCoreIdentityService == null || alexaCommsCoreIdentityService.getIdentity() == null) {
            return null;
        }
        return this.mCommsIdentityManager.getIdentity().getHomegroupId();
    }

    public String getIdentityPreferenceURL(String str, String str2) {
        if (StringUtils.isBlank(str2)) {
            return null;
        }
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format("/users/{0}/preferences/{1}", ownerId, str2);
    }

    public String getMasterDeviceIdURL(String str) {
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format(AppUrlConstants.GET_MASTER_DEVICE_ID_URL, ownerId);
    }

    public String getPhoneNumberVerificationURL() {
        return AppUrlConstants.GET_PNV_URL;
    }

    public String getPreferenceForOwnerURL(String str, String str2) {
        if (StringUtils.isBlank(str2)) {
            return null;
        }
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format(AppUrlConstants.GET_OWNER_PREFERENCE_URL, ownerId, str2);
    }

    public String getSetContactPreferenceURL(String str, String str2) {
        if (StringUtils.isBlank(str2)) {
            return null;
        }
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format("/users/{0}/contacts/{1}/preferences", ownerId, str2);
    }

    public String getSetIdentityPreferenceURL(String str, String str2) {
        if (StringUtils.isBlank(str2)) {
            return null;
        }
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format("/users/{0}/preferences/{1}", ownerId, str2);
    }

    public String setPreferenceForOwnerURL(String str) {
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format(AppUrlConstants.SET_OWNER_PREFERENCE_URL, ownerId);
    }

    public String syncContactURL(String str) {
        String ownerId = getOwnerId(str);
        if (StringUtils.isBlank(ownerId)) {
            return null;
        }
        return MessageFormat.format("/users/{0}/contacts", ownerId);
    }
}
