package com.amazon.photos.autosave.internal.db;

import androidx.room.TypeConverter;
import com.amazon.photos.autosave.model.AutosaveState;
import com.amazon.photos.autosave.model.MediaType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/photos/autosave/internal/db/Converters;", "", "()V", "fromAutosaveState", "", "state", "Lcom/amazon/photos/autosave/model/AutosaveState;", "fromAutosaveStateString", "uploadState", "fromMediaType", "type", "Lcom/amazon/photos/autosave/model/MediaType;", "fromMediaTypeString", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Converters {
    @TypeConverter
    @NotNull
    public final String fromAutosaveState(@NotNull AutosaveState state) {
        state.getClass();
        return state.name();
    }

    @TypeConverter
    @NotNull
    public final AutosaveState fromAutosaveStateString(@NotNull String uploadState) {
        uploadState.getClass();
        return AutosaveState.valueOf(uploadState);
    }

    @TypeConverter
    @NotNull
    public final String fromMediaType(@NotNull MediaType type) {
        type.getClass();
        return type.name();
    }

    @TypeConverter
    @NotNull
    public final MediaType fromMediaTypeString(@NotNull String type) {
        type.getClass();
        return MediaType.valueOf(type);
    }
}
