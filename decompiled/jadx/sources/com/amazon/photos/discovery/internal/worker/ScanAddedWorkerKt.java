package com.amazon.photos.discovery.internal.worker;

import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"INCREMENTAL_SCAN_LOOK_BACK", "", "MAX_ATTEMPTS", "", "PREFERENCE_FIRST_TIME_SCAN_COMPLETE", "", "PREFERENCE_PHOTO_LAST_ADDED_ROW_ID", "PREFERENCE_VIDEO_LAST_ADDED_ROW_ID", "RESULT_ADDED_ITEM_COUNT", Constants.LOG_TAG, "AndroidPhotosDiscovery_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScanAddedWorkerKt {
    public static final long INCREMENTAL_SCAN_LOOK_BACK = 500;
    private static final int MAX_ATTEMPTS = 3;

    @NotNull
    public static final String PREFERENCE_FIRST_TIME_SCAN_COMPLETE = "first_time_folder_scan_complete";

    @NotNull
    public static final String PREFERENCE_PHOTO_LAST_ADDED_ROW_ID = "photo_last_added_row_id";

    @NotNull
    public static final String PREFERENCE_VIDEO_LAST_ADDED_ROW_ID = "video_last_added_row_id";

    @NotNull
    public static final String RESULT_ADDED_ITEM_COUNT = "itemAddedCount";

    @NotNull
    private static final String TAG = "ScanAddedWorker";
}
