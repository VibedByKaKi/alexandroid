package com.amazon.photos.autosave.internal.upload;

import com.amazon.photos.uploader.Priority;
import com.amazon.photos.uploader.Queue;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/photos/autosave/internal/upload/AutosaveUploadConfigurationProvider;", "", "()V", AutosaveUploadConfigurationProvider.PHOTOS_QUEUE, "", AutosaveUploadConfigurationProvider.VIDEOS_QUEUE, "getAutosaveQueues", "", "Lcom/amazon/photos/uploader/Queue;", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AutosaveUploadConfigurationProvider {

    @NotNull
    public static final AutosaveUploadConfigurationProvider INSTANCE = new AutosaveUploadConfigurationProvider();

    @NotNull
    public static final String PHOTOS_QUEUE = "PHOTOS_QUEUE";

    @NotNull
    public static final String VIDEOS_QUEUE = "VIDEOS_QUEUE";

    private AutosaveUploadConfigurationProvider() {
    }

    @NotNull
    public final Set<Queue> getAutosaveQueues() {
        return SetsKt.setOf((Object[]) new Queue[]{new Queue(PHOTOS_QUEUE, Priority.MEDIUM, SetsKt.emptySet()), new Queue(VIDEOS_QUEUE, Priority.LOW, SetsKt.emptySet())});
    }
}
