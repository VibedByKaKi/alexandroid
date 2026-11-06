package com.amazon.alexa.location;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.location.models.ALSTriggerEvent;
import com.amazon.alexa.location.utils.Clock;
import com.amazon.alexa.location.utils.MobilyticsUtil;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class TriggerDeduper {
    private static final String COMPONENT_NAME = MobilyticsUtil.getComponentName("trigger_deduper");
    private static final long EVICTION_AGE_MILLIS = 600000;
    static final String METRIC_TRIGGER_DEDUPLICATED = "trigger_deduplicated";
    static final String METRIC_TRIGGER_DEDUPLICATED_SAME_DIRECTION = "trigger_deduplicated_same_direction";
    static final String METRIC_TRIGGER_DEDUPLICATED_TIME_WINDOW = "trigger_deduplicated_time_window";
    private static final String TAG = "TriggerDeduper";
    private final Clock clock;
    private final long duplicateTimeIntervalMillis;
    private final Object historyLock = new Object();
    private final ConcurrentHashMap<String, TriggerRequestHistory> historyMap = new ConcurrentHashMap<>();
    private final LazyComponent<Mobilytics> mobilytics;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.location.TriggerDeduper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$location$TriggerDeduper$TriggerRequestStatus;

        static {
            int[] iArr = new int[TriggerRequestStatus.values().length];
            $SwitchMap$com$amazon$alexa$location$TriggerDeduper$TriggerRequestStatus = iArr;
            try {
                iArr[TriggerRequestStatus.INCOMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$location$TriggerDeduper$TriggerRequestStatus[TriggerRequestStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$location$TriggerDeduper$TriggerRequestStatus[TriggerRequestStatus.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TriggerRequestHistory {

        @NonNull
        public final String fenceId;
        public final long sentTimeMillis;

        @NonNull
        public final TriggerRequestStatus status;

        @NonNull
        public final ALSTriggerEvent triggerEvent;

        public TriggerRequestHistory(@NonNull String str, @NonNull ALSTriggerEvent aLSTriggerEvent, @NonNull TriggerRequestStatus triggerRequestStatus, long j) {
            this.fenceId = str;
            this.triggerEvent = aLSTriggerEvent;
            this.status = triggerRequestStatus;
            this.sentTimeMillis = j;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TriggerRequestStatus {
        INCOMPLETE,
        SUCCESS,
        FAILED
    }

    public TriggerDeduper(long j, @NonNull LazyComponent<Mobilytics> lazyComponent, @NonNull Clock clock) {
        this.duplicateTimeIntervalMillis = j;
        this.mobilytics = lazyComponent;
        this.clock = clock;
    }

    private void evictStaleEntries() {
        long millis = this.clock.millis() - 600000;
        Iterator<Map.Entry<String, TriggerRequestHistory>> it2 = this.historyMap.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().sentTimeMillis < millis) {
                it2.remove();
            }
        }
    }

    public void clear() {
        this.historyMap.clear();
    }

    @VisibleForTesting
    public long getDuplicateTimeIntervalMillis() {
        return this.duplicateTimeIntervalMillis;
    }

    public boolean isDuplicate(@NonNull String str, @NonNull ALSTriggerEvent aLSTriggerEvent, boolean z) {
        evictStaleEntries();
        if (isDuplicateInTimeWindow(str, aLSTriggerEvent)) {
            Objects.toString(aLSTriggerEvent);
            Mobilytics mobilytics = this.mobilytics.get();
            String str2 = COMPONENT_NAME;
            mobilytics.recordOccurrence(METRIC_TRIGGER_DEDUPLICATED_TIME_WINDOW, true, str2, str2, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
            mobilytics.recordOccurrence(METRIC_TRIGGER_DEDUPLICATED, true, str2, str2, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
            return true;
        }
        if (!z || !isDuplicateSameDirection(str, aLSTriggerEvent)) {
            return false;
        }
        Objects.toString(aLSTriggerEvent);
        Mobilytics mobilytics2 = this.mobilytics.get();
        String str3 = COMPONENT_NAME;
        mobilytics2.recordOccurrence(METRIC_TRIGGER_DEDUPLICATED_SAME_DIRECTION, true, str3, str3, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
        mobilytics2.recordOccurrence(METRIC_TRIGGER_DEDUPLICATED, true, str3, str3, OwnerIdentifier.APP_LOCATION_LIBRARIES_ANDROID);
        return true;
    }

    @VisibleForTesting
    public boolean isDuplicateInTimeWindow(@NonNull String str, @NonNull ALSTriggerEvent aLSTriggerEvent) {
        TriggerRequestHistory triggerRequestHistory = this.historyMap.get(str);
        return triggerRequestHistory != null && triggerRequestHistory.triggerEvent == aLSTriggerEvent && AnonymousClass1.$SwitchMap$com$amazon$alexa$location$TriggerDeduper$TriggerRequestStatus[triggerRequestHistory.status.ordinal()] == 3 && this.clock.millis() - triggerRequestHistory.sentTimeMillis <= this.duplicateTimeIntervalMillis;
    }

    @VisibleForTesting
    public boolean isDuplicateSameDirection(@NonNull String str, @NonNull ALSTriggerEvent aLSTriggerEvent) {
        TriggerRequestHistory triggerRequestHistory = this.historyMap.get(str);
        return triggerRequestHistory != null && AnonymousClass1.$SwitchMap$com$amazon$alexa$location$TriggerDeduper$TriggerRequestStatus[triggerRequestHistory.status.ordinal()] == 3 && triggerRequestHistory.triggerEvent == aLSTriggerEvent;
    }

    public void recordTriggerFailed(@NonNull String str, @NonNull ALSTriggerEvent aLSTriggerEvent) {
        synchronized (this.historyLock) {
            try {
                TriggerRequestHistory triggerRequestHistory = this.historyMap.get(str);
                if (triggerRequestHistory != null && triggerRequestHistory.triggerEvent == aLSTriggerEvent && triggerRequestHistory.status == TriggerRequestStatus.INCOMPLETE) {
                    this.historyMap.put(str, new TriggerRequestHistory(str, aLSTriggerEvent, TriggerRequestStatus.FAILED, triggerRequestHistory.sentTimeMillis));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void recordTriggerStarted(@NonNull String str, @NonNull ALSTriggerEvent aLSTriggerEvent) {
        this.historyMap.put(str, new TriggerRequestHistory(str, aLSTriggerEvent, TriggerRequestStatus.INCOMPLETE, this.clock.millis()));
    }

    public void recordTriggerSuccess(@NonNull String str, @NonNull ALSTriggerEvent aLSTriggerEvent) {
        this.historyMap.put(str, new TriggerRequestHistory(str, aLSTriggerEvent, TriggerRequestStatus.SUCCESS, this.clock.millis()));
    }
}
