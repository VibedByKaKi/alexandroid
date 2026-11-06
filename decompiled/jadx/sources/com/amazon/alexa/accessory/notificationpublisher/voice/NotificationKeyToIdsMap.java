package com.amazon.alexa.accessory.notificationpublisher.voice;

import android.text.TextUtils;
import com.amazon.alexa.externalnotifications.capability.models.NotificationId;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NotificationKeyToIdsMap {
    private final Map<String, Set<NotificationId>> notificationKeyToIdsMap = new HashMap();

    public synchronized Set<NotificationId> getAndRemove(String str) {
        if (TextUtils.isEmpty(str) || !this.notificationKeyToIdsMap.containsKey(str)) {
            return new HashSet();
        }
        return this.notificationKeyToIdsMap.remove(str);
    }

    public synchronized void put(String str, NotificationId notificationId) {
        try {
            if (!TextUtils.isEmpty(str) && notificationId != null) {
                if (this.notificationKeyToIdsMap.get(str) == null) {
                    this.notificationKeyToIdsMap.put(str, new HashSet());
                }
                this.notificationKeyToIdsMap.get(str).add(notificationId);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
