package com.amazon.deecomms.contacts.util;

import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.deecomms.common.network.ACMSClient;
import com.amazon.deecomms.contacts.model.Contacts;
import com.amazon.deecomms.core.CapabilitiesManager;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public class ContactDownloader {
    private static final String ACMS_QUERY_PARAM_BULK_IMPORT = "bulkImportOnly";
    private static final String ACMS_QUERY_PARAM_BULK_IMPORT_VALUE = "true";
    public static final String ACMS_QUERY_PARAM_DEDUPE_MODE = "dedupeMode";
    public static final String ACMS_QUERY_PARAM_DEDUPE_MODE_REMOVE_CLOUD_ONLY_CONTACT_DUPLICATES = "RemoveCloudOnlyContactDuplicates";
    public static final String ACMS_QUERY_PARAM_HOMEGROUP = "homeGroupId";
    public static final String ACMS_QUERY_PARAM_INCLUDE_NON_ALEXA_CONTACTS = "includeNonAlexaContacts";
    public static final String ACMS_QUERY_PARAM_INCLUDE_NON_ALEXA_CONTACTS_VALUE = "true";
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ContactDownloader.class);

    @Inject
    CapabilitiesManager capabilitiesManager;
    private Contacts mBulkImportedContacts = null;
    private Contacts mAlexaContactsAndHGContacts = null;
    private Contacts mContactsAndHGContacts = null;
    private final ACMSClient mContactsServiceClient = new ACMSClient(MetricKeys.OP_GET_CONTACTS);

    public ContactDownloader() {
        CommsDaggerWrapper.getComponent().inject(this);
    }

    @NonNull
    private Set<String> getCommsIdsAsSet(@Nullable List<String> list) {
        HashSet newHashSet = Sets.newHashSet();
        if (list != null) {
            newHashSet.addAll(list);
        }
        return newHashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e2 A[Catch: Exception -> 0x0116, TryCatch #5 {Exception -> 0x0116, blocks: (B:28:0x00b5, B:29:0x00b8, B:30:0x00dc, B:32:0x00e2, B:34:0x00fa, B:36:0x0108, B:39:0x010e, B:42:0x011b, B:43:0x0122, B:45:0x0128, B:46:0x012b, B:56:0x0131, B:57:0x0135, B:59:0x013b, B:62:0x0147, B:49:0x0151, B:51:0x0157, B:52:0x015a, B:67:0x015f, B:71:0x0195), top: B:27:0x00b5, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean downloadContacts(java.util.Map<java.lang.String, java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.deecomms.contacts.util.ContactDownloader.downloadContacts(java.util.Map):boolean");
    }

    @Nullable
    public Contacts getAlexaContactsAndHomeGroups() {
        return this.mAlexaContactsAndHGContacts;
    }

    @Nullable
    public Contacts getBulkImportedContacts() {
        return this.mBulkImportedContacts;
    }

    @Nullable
    public Contacts getContactsAndHomeGroups() {
        return this.mContactsAndHGContacts;
    }

    public boolean downloadContacts() {
        String homeGroupId = CommsDaggerWrapper.getComponent().getCommsIdentityManager().getHomeGroupId("ContactDownloader.downloadContacts", false);
        if (TextUtils.isEmpty(homeGroupId)) {
            LOG.e("Unable to download contacts. homegroup is null");
            return false;
        }
        String bool = (this.capabilitiesManager.isLightyearEnabled() ? Boolean.TRUE : Boolean.FALSE).toString();
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("includePreferencesByLevel", Constants.ACMS_CONTACT_PREFERENCE_LEVEL_HG);
        arrayMap.put("homeGroupId", homeGroupId);
        Boolean bool2 = Boolean.TRUE;
        arrayMap.put("includeHomeGroupMembers", bool2.toString());
        arrayMap.put("dedupeMode", ACMS_QUERY_PARAM_DEDUPE_MODE_REMOVE_CLOUD_ONLY_CONTACT_DUPLICATES);
        arrayMap.put("includeNonAlexaContacts", bool2.toString());
        arrayMap.put("includeMergedContacts", bool);
        LOG.i("getContactsDebugging: download contacts in ContactsDownloader");
        return downloadContacts(arrayMap);
    }
}
