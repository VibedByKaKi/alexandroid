package com.amazon.alexa.accessory.notificationpublisher.voice;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.notificationpublisher.voice.NotificationUploadTracker;
import com.amazon.alexa.externalnotifications.capability.models.NotificationId;
import com.google.auto.value.AutoValue;
import dagger.internal.Preconditions;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes15.dex */
public class NotificationUploadTracker {
    private static final int MAX_NOTIFICATION_IDS_IN_STORAGE = 200;
    private static final int NOTIFICATION_ID_CACHE_MAX_AGE_IN_DAYS = 2;
    private static final String TAG = "NotificationUploadTracker";
    private static final String UPLOADED_NOTIFICATIONS_KEY = "uploaded_notifications";
    private final Handler backgroundHandler;
    private final MetricsRecorder metricsRecorder;
    private final SharedPreferences sharedPreferences;
    private final List<UploadedNotification> uploadedNotifications = Collections.synchronizedList(new ArrayList());

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class UploadedNotification {
        public static UploadedNotification create(NotificationId notificationId, long j) {
            return new AutoValue_NotificationUploadTracker_UploadedNotification(notificationId, j);
        }

        @Nullable
        public static UploadedNotification deserialize(String str) {
            if (str != null && !str.isEmpty()) {
                String[] split = str.split(",");
                if (split.length != 2) {
                    return null;
                }
                String str2 = split[0];
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
                try {
                    return create(NotificationId.create(str2), Long.parseLong(split[1]));
                } catch (NumberFormatException e) {
                    Log.e(NotificationUploadTracker.TAG, "Failed to deserialize UploadedNotification object with error", e);
                }
            }
            return null;
        }

        public abstract NotificationId getNotificationId();

        public abstract long getTimestamp();

        public String serialize() {
            return getNotificationId().getValue() + "," + getTimestamp();
        }
    }

    public NotificationUploadTracker(Context context, @Nullable MetricsRecorder metricsRecorder, Handler handler) {
        Preconditions.checkNotNull(context, "Context cannot be null");
        Preconditions.checkNotNull(handler, "Background handler can't be null");
        this.sharedPreferences = context.getSharedPreferences("notification_uploads", 0);
        this.backgroundHandler = handler;
        this.metricsRecorder = metricsRecorder;
        handler.post(new NotificationUploadTracker$$ExternalSyntheticLambda0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$cleanupOldNotifications$1(long j, UploadedNotification uploadedNotification) {
        return j - uploadedNotification.getTimestamp() > 172800000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$saveToSharedPreferences$0() {
        HashSet hashSet = new HashSet();
        Iterator<UploadedNotification> it2 = this.uploadedNotifications.iterator();
        while (it2.hasNext()) {
            String serialize = it2.next().serialize();
            if (serialize != null) {
                hashSet.add(serialize);
            }
        }
        hashSet.size();
        logStorageSizeEstimateInKb(hashSet);
        this.sharedPreferences.edit().putStringSet(UPLOADED_NOTIFICATIONS_KEY, hashSet).apply();
    }

    private void logStorageSizeEstimateInKb(@Nullable Set<String> set) {
        MetricsRecorder metricsRecorder;
        if (set == null || (metricsRecorder = this.metricsRecorder) == null) {
            return;
        }
        metricsRecorder.recordCounter(MetricsConstants.DUPLICATE_PREVENTION_NOTIFICATION_ID_COUNT_STORAGE, set.size());
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new ByteArrayOutputStream(), StandardCharsets.UTF_8));
            try {
                Iterator<String> it2 = set.iterator();
                while (it2.hasNext()) {
                    bufferedWriter.write(it2.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
                bufferedWriter.close();
                this.metricsRecorder.recordCounter(MetricsConstants.DUPLICATE_PREVENTION_NOTIFICATION_ID_STORAGE_SIZE_IN_KB, r0.size() / 1024.0d);
            } finally {
            }
        } catch (IOException unused) {
            Log.e(TAG, "Failed to estimate size");
        }
    }

    @VisibleForTesting
    public void cleanupOldNotifications() {
        final long time = new Date().getTime();
        this.uploadedNotifications.removeIf(new Predicate() { // from class: com.amazon.alexa.accessory.notificationpublisher.voice.NotificationUploadTracker$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$cleanupOldNotifications$1;
                lambda$cleanupOldNotifications$1 = NotificationUploadTracker.lambda$cleanupOldNotifications$1(time, (NotificationUploadTracker.UploadedNotification) obj);
                return lambda$cleanupOldNotifications$1;
            }
        });
        saveToSharedPreferences();
    }

    public boolean isNotificationUploaded(NotificationId notificationId) {
        Iterator<UploadedNotification> it2 = this.uploadedNotifications.iterator();
        while (it2.hasNext()) {
            if (it2.next().getNotificationId().equals(notificationId)) {
                return true;
            }
        }
        return false;
    }

    public void loadFromSharedPreferences() {
        try {
            Set<String> stringSet = this.sharedPreferences.getStringSet(UPLOADED_NOTIFICATIONS_KEY, new HashSet());
            this.uploadedNotifications.clear();
            Iterator<String> it2 = stringSet.iterator();
            while (it2.hasNext()) {
                UploadedNotification deserialize = UploadedNotification.deserialize(it2.next());
                if (deserialize != null) {
                    this.uploadedNotifications.add(deserialize);
                }
            }
            this.uploadedNotifications.size();
            cleanupOldNotifications();
        } catch (Exception unused) {
        }
    }

    public void markNotificationUploaded(NotificationId notificationId) {
        if (this.uploadedNotifications.size() >= 200) {
            Log.w(TAG, "MAX_NOTIFICATION_IDS_IN_STORAGE reached,not tracking any more notification uploads");
        } else {
            this.uploadedNotifications.add(UploadedNotification.create(notificationId, new Date().getTime()));
            saveToSharedPreferences();
        }
    }

    public void saveToSharedPreferences() {
        this.backgroundHandler.post(new NotificationUploadTracker$$ExternalSyntheticLambda0(this, 1));
    }

    public void teardown() {
        cleanupOldNotifications();
    }
}
