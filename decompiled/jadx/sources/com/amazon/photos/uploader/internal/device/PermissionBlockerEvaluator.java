package com.amazon.photos.uploader.internal.device;

import com.amazon.photos.uploader.blockers.Blocker;
import com.amazon.photos.uploader.blockers.GlobalBlockerEvaluator;
import com.amazon.photos.uploader.blockers.NetworkPermissionBlocker;
import com.amazon.photos.uploader.blockers.StoragePermissionBlocker;
import com.amazon.photos.uploader.internal.utils.SystemUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/amazon/photos/uploader/internal/device/PermissionBlockerEvaluator;", "Lcom/amazon/photos/uploader/blockers/GlobalBlockerEvaluator;", "systemUtil", "Lcom/amazon/photos/uploader/internal/utils/SystemUtil;", "(Lcom/amazon/photos/uploader/internal/utils/SystemUtil;)V", "getSystemUtil", "()Lcom/amazon/photos/uploader/internal/utils/SystemUtil;", "getBlocker", "Lcom/amazon/photos/uploader/blockers/Blocker;", "isPermissionDenied", "", "permission", "", "isStoragePermissionDenied", "queryBlocker", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PermissionBlockerEvaluator implements GlobalBlockerEvaluator {

    @NotNull
    private final SystemUtil systemUtil;

    public PermissionBlockerEvaluator(@NotNull SystemUtil systemUtil) {
        systemUtil.getClass();
        this.systemUtil = systemUtil;
    }

    private final boolean isPermissionDenied(String permission) {
        return this.systemUtil.getPermission(permission) == -1;
    }

    private final boolean isStoragePermissionDenied() {
        if (this.systemUtil.isAtLeastApi(34)) {
            return isPermissionDenied("android.permission.READ_MEDIA_VISUAL_USER_SELECTED") && (isPermissionDenied("android.permission.READ_MEDIA_IMAGES") || isPermissionDenied("android.permission.READ_MEDIA_VIDEO"));
        }
        return this.systemUtil.isAtLeastApi(33) ? isPermissionDenied("android.permission.READ_MEDIA_IMAGES") || isPermissionDenied("android.permission.READ_MEDIA_VIDEO") : isPermissionDenied("android.permission.READ_EXTERNAL_STORAGE");
    }

    @Override // com.amazon.photos.uploader.blockers.GlobalBlockerEvaluator
    @Nullable
    public Blocker getBlocker() {
        return queryBlocker();
    }

    @NotNull
    public final SystemUtil getSystemUtil() {
        return this.systemUtil;
    }

    @Override // com.amazon.photos.uploader.blockers.GlobalBlockerEvaluator
    @Nullable
    public Blocker queryBlocker() {
        if (isStoragePermissionDenied()) {
            return StoragePermissionBlocker.INSTANCE;
        }
        if (isPermissionDenied("android.permission.ACCESS_NETWORK_STATE")) {
            return NetworkPermissionBlocker.INSTANCE;
        }
        return null;
    }
}
