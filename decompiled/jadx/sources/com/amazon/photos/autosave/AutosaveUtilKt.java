package com.amazon.photos.autosave;

import com.amazon.photos.autosave.internal.upload.AutosaveUploadConfigurationProvider;
import com.amazon.photos.uploader.UploadRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isFromAutosave", "", "Lcom/amazon/photos/uploader/UploadRequest;", "AndroidPhotosAutosave_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AutosaveUtilKt {
    public static final boolean isFromAutosave(@NotNull UploadRequest uploadRequest) {
        uploadRequest.getClass();
        return Intrinsics.areEqual(uploadRequest.getQueue(), AutosaveUploadConfigurationProvider.PHOTOS_QUEUE) || Intrinsics.areEqual(uploadRequest.getQueue(), AutosaveUploadConfigurationProvider.VIDEOS_QUEUE);
    }
}
