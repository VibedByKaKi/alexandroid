package com.amazon.alexa.accessory.notificationpublisher.reply;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import com.google.common.base.Strings;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ReplyTransientStorage {
    public static final String NOTIFICATION_UUID = "NOTIFICATION_UUID";
    public static final String REPLY_TEXT = "REPLY_TEXT";
    public static final String TAG = "ReplyTransientStorage";
    private static ReplyTransientStorage instance;
    private final Map<String, String> payload = new HashMap();
    private int retryCount = 0;

    private ReplyTransientStorage() {
    }

    public static synchronized ReplyTransientStorage getInstance() {
        ReplyTransientStorage replyTransientStorage;
        synchronized (ReplyTransientStorage.class) {
            try {
                if (instance == null) {
                    instance = new ReplyTransientStorage();
                }
                replyTransientStorage = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return replyTransientStorage;
    }

    public static synchronized void releaseInstance() {
        synchronized (ReplyTransientStorage.class) {
            try {
                ReplyTransientStorage replyTransientStorage = instance;
                if (replyTransientStorage != null) {
                    replyTransientStorage.payload.clear();
                }
                instance = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void clearPayload() {
        Map<String, String> map = this.payload;
        if (map != null && !map.isEmpty()) {
            Log.i(TAG, "clearPayload");
            this.payload.clear();
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ReplyTransientStorage m9653clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone a singleton");
    }

    public String getNotificationUuid() {
        return this.payload.get(NOTIFICATION_UUID);
    }

    public synchronized Map<String, String> getPayload() {
        return this.payload;
    }

    public synchronized int getRetryCount() {
        return this.retryCount;
    }

    public String getTranscribedText() {
        return this.payload.get(REPLY_TEXT);
    }

    public synchronized void incrementCounter() {
        this.retryCount++;
    }

    public boolean isPayloadValid(@NonNull String str) {
        if (Strings.isNullOrEmpty(str)) {
            Log.i(TAG, "isPayloadValid - Empty notificationUuid");
            return false;
        }
        String str2 = this.payload.get(REPLY_TEXT);
        String str3 = this.payload.get(NOTIFICATION_UUID);
        return (Strings.isNullOrEmpty(str2) || Strings.isNullOrEmpty(str3) || !str3.equalsIgnoreCase(str)) ? false : true;
    }

    public synchronized void resetCounter() {
        this.retryCount = 0;
    }

    public synchronized void setPayload(@NonNull String str, @NonNull String str2) {
        Log.i(TAG, "setPayload");
        this.payload.put(NOTIFICATION_UUID, str);
        this.payload.put(REPLY_TEXT, str2);
    }
}
