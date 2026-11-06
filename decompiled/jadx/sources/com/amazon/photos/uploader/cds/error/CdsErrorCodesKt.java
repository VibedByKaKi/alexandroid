package com.amazon.photos.uploader.cds.error;

import com.amazon.clouddrive.cdasdk.cdus.UploadErrorCode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toUploadErrorCode", "Lcom/amazon/clouddrive/cdasdk/cdus/UploadErrorCode;", "", "AndroidPhotosUploader_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CdsErrorCodesKt {
    @Nullable
    public static final UploadErrorCode toUploadErrorCode(@NotNull String str) {
        str.getClass();
        try {
            return UploadErrorCode.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
