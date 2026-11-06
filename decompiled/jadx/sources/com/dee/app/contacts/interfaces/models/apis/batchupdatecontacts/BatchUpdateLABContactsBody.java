package com.dee.app.contacts.interfaces.models.apis.batchupdatecontacts;

import com.dee.app.contacts.interfaces.models.data.ContactForSync;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BatchUpdateLABContactsBody {
    private String contactSourceType;
    private List<ContactForSync> contactsForSyncList;
    private Boolean isBatchFinalSync;
    private String sourceDeviceId;
    private String sourceDeviceName;

    public BatchUpdateLABContactsBody(String str, String str2, Boolean bool, String str3, List<ContactForSync> list) {
        this.sourceDeviceId = str;
        this.sourceDeviceName = str2;
        this.isBatchFinalSync = bool;
        this.contactsForSyncList = list;
        this.contactSourceType = str3;
    }
}
