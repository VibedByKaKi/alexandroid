package com.amazon.photos.uploader.cds.multipart;

import androidx.room.TypeConverter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/PartInfoConverters;", "", "()V", "fromPartInfoState", "", "state", "Lcom/amazon/photos/uploader/cds/multipart/PartUploadState;", "fromPartInfoStateString", "partInfoState", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartInfoConverters {
    @TypeConverter
    @NotNull
    public final String fromPartInfoState(@NotNull PartUploadState state) {
        state.getClass();
        return state.name();
    }

    @TypeConverter
    @NotNull
    public final PartUploadState fromPartInfoStateString(@NotNull String partInfoState) {
        partInfoState.getClass();
        return PartUploadState.valueOf(partInfoState);
    }
}
