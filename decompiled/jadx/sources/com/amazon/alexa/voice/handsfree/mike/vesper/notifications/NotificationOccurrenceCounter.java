package com.amazon.alexa.voice.handsfree.mike.vesper.notifications;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NotificationOccurrenceCounter {
    static final String APP_DOWNLOAD_COUNT_SHARED_PREFS_KEY = "APP_DOWNLOAD_COUNT";

    @VisibleForTesting
    static final String SHARED_PREFERENCE_FILE_NAME = "NotificationOccurrenceCounter";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LazyHolder {
        private static final NotificationOccurrenceCounter INSTANCE = new NotificationOccurrenceCounter(0);

        private LazyHolder() {
        }
    }

    public /* synthetic */ NotificationOccurrenceCounter(int i) {
        this();
    }

    @NonNull
    public static NotificationOccurrenceCounter getInstance() {
        return LazyHolder.INSTANCE;
    }

    public int getNotificationCount(@NonNull Context context) {
        return context.getSharedPreferences(SHARED_PREFERENCE_FILE_NAME, 0).getInt(APP_DOWNLOAD_COUNT_SHARED_PREFS_KEY, 0);
    }

    public void incrementNotificationCount(@NonNull Context context) {
        context.getSharedPreferences(SHARED_PREFERENCE_FILE_NAME, 0).edit().putInt(APP_DOWNLOAD_COUNT_SHARED_PREFS_KEY, getNotificationCount(context) + 1).apply();
    }

    private NotificationOccurrenceCounter() {
    }
}
