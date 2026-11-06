package com.amazon.alexa.accessory.notificationpublisher.consumption;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class NotificationQueue extends BaseComponent {
    public static final int EVENT_QUEUE_ADD = 1;
    public static final int EVENT_QUEUE_CLEAR = 2;
    private static final String TAG = "NotificationQueue";
    private static final int capacity = 500;
    private static NotificationQueue queueInstance;
    private JSONObject lastNotInvitationNotification;
    private JSONObject lastNotification;
    private LinkedHashMap<String, JSONObject> queue;

    private NotificationQueue() {
        super(5);
        this.lastNotification = null;
        this.lastNotInvitationNotification = null;
        this.queue = new LinkedHashMap<>();
    }

    private synchronized Map.Entry<String, JSONObject> getFirstEntry() {
        if (this.queue.isEmpty()) {
            return null;
        }
        return this.queue.entrySet().iterator().next();
    }

    public static synchronized NotificationQueue getInstance() {
        NotificationQueue notificationQueue;
        synchronized (NotificationQueue.class) {
            try {
                if (queueInstance == null) {
                    queueInstance = new NotificationQueue();
                }
                notificationQueue = queueInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return notificationQueue;
    }

    public static synchronized void releaseInstance() {
        synchronized (NotificationQueue.class) {
            try {
                NotificationQueue notificationQueue = queueInstance;
                if (notificationQueue != null) {
                    notificationQueue.clearLastNotification();
                }
                queueInstance = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean add(@NonNull String str, @NonNull JSONObject jSONObject) {
        if (this.queue.size() >= 500) {
            Log.w(TAG, "No Enough Space");
            return false;
        }
        this.queue.put(str, jSONObject);
        postEventMessage(1, jSONObject);
        return true;
    }

    public synchronized void clear() {
        this.queue.clear();
        postEventMessage(2, null);
    }

    public synchronized String clearLastNotInvitationNotification() {
        String optString;
        try {
            JSONObject jSONObject = this.lastNotInvitationNotification;
            optString = jSONObject != null ? jSONObject.optString("uuid") : null;
            this.lastNotInvitationNotification = null;
        } catch (Throwable th) {
            throw th;
        }
        return optString;
    }

    public synchronized String clearLastNotification() {
        String optString;
        try {
            JSONObject jSONObject = this.lastNotification;
            optString = jSONObject != null ? jSONObject.optString("uuid") : null;
            this.lastNotification = null;
        } catch (Throwable th) {
            throw th;
        }
        return optString;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public NotificationQueue m9583clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone a singleton");
    }

    public synchronized boolean contains(String str) {
        return this.queue.containsKey(str);
    }

    public synchronized JSONObject get(String str) {
        return this.queue.get(str);
    }

    public synchronized JSONObject getLastNotInvitationNotification() {
        return this.lastNotInvitationNotification;
    }

    public synchronized JSONObject getLastNotification() {
        return this.lastNotification;
    }

    public synchronized JSONObject getLastValue() {
        try {
            if (this.queue.isEmpty()) {
                return null;
            }
            Iterator<Map.Entry<String, JSONObject>> it2 = this.queue.entrySet().iterator();
            Map.Entry<String, JSONObject> entry = null;
            while (it2.hasNext()) {
                entry = it2.next();
            }
            return entry != null ? entry.getValue() : null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Iterator<JSONObject> getNotificationIterator() {
        return this.queue.values().iterator();
    }

    public synchronized Iterator<String> getNotificationKeysIterator() {
        return this.queue.keySet().iterator();
    }

    public synchronized JSONObject getSecondInQueue() {
        if (!this.queue.isEmpty() && this.queue.size() >= 2) {
            Iterator<Map.Entry<String, JSONObject>> it2 = this.queue.entrySet().iterator();
            it2.next();
            return it2.next().getValue();
        }
        return null;
    }

    public synchronized boolean insertToQueueHead(@NonNull String str, @NonNull JSONObject jSONObject) {
        if (this.queue.size() >= 500) {
            Log.w(TAG, "No Enough Space");
            return false;
        }
        LinkedHashMap<String, JSONObject> linkedHashMap = this.queue;
        LinkedHashMap<String, JSONObject> linkedHashMap2 = new LinkedHashMap<>();
        this.queue = linkedHashMap2;
        linkedHashMap2.put(str, jSONObject);
        this.queue.putAll(linkedHashMap);
        return true;
    }

    public synchronized boolean isEmpty() {
        return this.queue.isEmpty();
    }

    public synchronized JSONObject peek() {
        Map.Entry<String, JSONObject> firstEntry = getFirstEntry();
        if (firstEntry == null) {
            return null;
        }
        return firstEntry.getValue();
    }

    public synchronized JSONObject poll() {
        Map.Entry<String, JSONObject> firstEntry = getFirstEntry();
        if (firstEntry == null) {
            return null;
        }
        return this.queue.remove(firstEntry.getKey());
    }

    public synchronized JSONObject remove(String str) {
        return this.queue.remove(str);
    }

    public synchronized void setLastNotInvitationNotification(@NonNull JSONObject jSONObject) {
        this.lastNotInvitationNotification = jSONObject;
    }

    public synchronized void setLastNotification(@NonNull JSONObject jSONObject) {
        this.lastNotification = jSONObject;
    }

    public synchronized int size() {
        return this.queue.size();
    }
}
