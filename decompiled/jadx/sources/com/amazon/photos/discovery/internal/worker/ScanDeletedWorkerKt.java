package com.amazon.photos.discovery.internal.worker;

import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"MAX_ATTEMPTS", "", "PREF_LAST_PROCESSED_ID", "", Constants.LOG_TAG, "AndroidPhotosDiscovery_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScanDeletedWorkerKt {
    private static final int MAX_ATTEMPTS = 3;

    @NotNull
    public static final String PREF_LAST_PROCESSED_ID = "deleted_worker_last_processed";

    @NotNull
    private static final String TAG = "ScanDeletedWorker";
}
