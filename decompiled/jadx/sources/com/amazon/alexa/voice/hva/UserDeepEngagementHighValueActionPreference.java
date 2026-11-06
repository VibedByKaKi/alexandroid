package com.amazon.alexa.voice.hva;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes19.dex */
public class UserDeepEngagementHighValueActionPreference {

    @VisibleForTesting
    static final String COUNTED_DAY_KEY = "hva_deep_engagement_counted_day";

    @VisibleForTesting
    static final String EVENT_PUBLISHED_KEY = "hva_deep_engagement_event_published";

    @VisibleForTesting
    static final String STORAGE_NAME = "voice";

    @VisibleForTesting
    static final String UTTERANCE_COUNT_KEY = "hva_deep_engagement_utterance_count";
    private final PersistentStorage storage;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Counter {
        private final long countedDay;
        private final boolean eventPublished;
        private final int utteranceCount;

        public Counter(long j, int i, boolean z) {
            this.countedDay = j;
            this.utteranceCount = i;
            this.eventPublished = z;
        }

        public long getCountedDay() {
            return this.countedDay;
        }

        public int getUtteranceCount() {
            return this.utteranceCount;
        }

        public boolean isEventPublished() {
            return this.eventPublished;
        }
    }

    @Inject
    public UserDeepEngagementHighValueActionPreference(PersistentStorage.Factory factory) {
        this.storage = factory.create("voice");
    }

    private static int parseInt(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    private static long parseLong(String str, long j) {
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public void clear() {
        this.storage.edit().remove(COUNTED_DAY_KEY).remove(UTTERANCE_COUNT_KEY).remove(EVENT_PUBLISHED_KEY).commit();
    }

    public Counter load(long j) {
        return new Counter(parseLong(this.storage.getString(COUNTED_DAY_KEY, null), j), parseInt(this.storage.getString(UTTERANCE_COUNT_KEY, null), 0), this.storage.getBoolean(EVENT_PUBLISHED_KEY, false));
    }

    public void save(long j, int i, boolean z) {
        this.storage.edit().set(COUNTED_DAY_KEY, String.valueOf(j)).set(UTTERANCE_COUNT_KEY, String.valueOf(i)).set(EVENT_PUBLISHED_KEY, z).commit();
    }
}
