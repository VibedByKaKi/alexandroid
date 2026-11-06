package com.amazon.photos.discovery.internal.dedupe.filter;

import android.content.SharedPreferences;
import com.amazon.clouddrive.android.core.interfaces.Logger;
import com.amazon.photos.discovery.internal.dedupe.metadata.DayAggregations;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/photos/discovery/internal/dedupe/filter/FilterEvents;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "logger", "Lcom/amazon/clouddrive/android/core/interfaces/Logger;", "(Landroid/content/SharedPreferences;Lcom/amazon/clouddrive/android/core/interfaces/Logger;)V", "onDayAggregationsRetrieved", "", "dayAggregations", "Lcom/amazon/photos/discovery/internal/dedupe/metadata/DayAggregations;", "onMediaStoreScanComplete", "lastSeenPhotoRowId", "", "lastSeenVideoRowId", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FilterEvents {

    @NotNull
    private final Logger logger;

    @NotNull
    private final SharedPreferences sharedPreferences;

    public FilterEvents(@NotNull SharedPreferences sharedPreferences, @NotNull Logger logger) {
        sharedPreferences.getClass();
        logger.getClass();
        this.sharedPreferences = sharedPreferences;
        this.logger = logger;
    }

    public final void onDayAggregationsRetrieved(@NotNull DayAggregations dayAggregations) {
        dayAggregations.getClass();
        this.logger.i("OptimizationEvents", "Setting cloud item count to: " + dayAggregations.getTotalCount());
        this.sharedPreferences.edit().putLong(FilterEventsKt.PREFERENCE_CLOUD_OPT_NODE_COUNT, dayAggregations.getTotalCount()).apply();
    }

    public final void onMediaStoreScanComplete(long lastSeenPhotoRowId, long lastSeenVideoRowId) {
        if (this.sharedPreferences.contains(FilterEventsKt.PREFERENCE_CAMERA_OPT_PHOTO_LAST_ROW_ID) && this.sharedPreferences.contains(FilterEventsKt.PREFERENCE_CAMERA_OPT_VIDEO_LAST_ROW_ID)) {
            return;
        }
        Logger logger = this.logger;
        StringBuilder m = a$$ExternalSyntheticOutline0.m("Setting time of MS scan complete for photos: ", lastSeenPhotoRowId, " and for videos: ");
        m.append(lastSeenVideoRowId);
        logger.i("OptimizationEvents", m.toString());
        this.sharedPreferences.edit().putLong(FilterEventsKt.PREFERENCE_CAMERA_OPT_PHOTO_LAST_ROW_ID, lastSeenPhotoRowId).putLong(FilterEventsKt.PREFERENCE_CAMERA_OPT_VIDEO_LAST_ROW_ID, lastSeenVideoRowId).apply();
    }
}
