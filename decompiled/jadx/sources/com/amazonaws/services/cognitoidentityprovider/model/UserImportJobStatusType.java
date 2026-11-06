package com.amazonaws.services.cognitoidentityprovider.model;

import com.amazon.alexa.sendtoapp.notification.SendToAppNotificationsMetricsConstants;
import com.amazon.photos.uploader.internal.workers.UploadWorker;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public enum UserImportJobStatusType {
    Created("Created"),
    Pending("Pending"),
    InProgress("InProgress"),
    Stopping("Stopping"),
    Expired(SendToAppNotificationsMetricsConstants.EXPIRED_EVENT_NAME),
    Stopped("Stopped"),
    Failed(UploadWorker.FAILED_PREFIX),
    Succeeded("Succeeded");

    private static final Map<String, UserImportJobStatusType> enumMap;
    private String value;

    static {
        UserImportJobStatusType userImportJobStatusType = Created;
        UserImportJobStatusType userImportJobStatusType2 = Pending;
        UserImportJobStatusType userImportJobStatusType3 = InProgress;
        UserImportJobStatusType userImportJobStatusType4 = Stopping;
        UserImportJobStatusType userImportJobStatusType5 = Expired;
        UserImportJobStatusType userImportJobStatusType6 = Stopped;
        UserImportJobStatusType userImportJobStatusType7 = Failed;
        UserImportJobStatusType userImportJobStatusType8 = Succeeded;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("Created", userImportJobStatusType);
        hashMap.put("Pending", userImportJobStatusType2);
        hashMap.put("InProgress", userImportJobStatusType3);
        hashMap.put("Stopping", userImportJobStatusType4);
        hashMap.put(SendToAppNotificationsMetricsConstants.EXPIRED_EVENT_NAME, userImportJobStatusType5);
        hashMap.put("Stopped", userImportJobStatusType6);
        hashMap.put(UploadWorker.FAILED_PREFIX, userImportJobStatusType7);
        hashMap.put("Succeeded", userImportJobStatusType8);
    }

    UserImportJobStatusType(String str) {
        this.value = str;
    }

    public static UserImportJobStatusType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Value cannot be null or empty!");
            return null;
        }
        Map<String, UserImportJobStatusType> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Cannot create enum from ", str, " value!"));
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
