package com.amazon.photos.autosave.internal.upload;

import com.amazon.photos.autosave.UploadPriorityResolver;
import com.amazon.photos.discovery.model.LocalItem;
import com.amazon.photos.uploader.Priority;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/amazon/photos/autosave/internal/upload/DefaultPriorityResolver;", "Lcom/amazon/photos/autosave/UploadPriorityResolver;", "()V", "getUploadPriority", "", "localItem", "Lcom/amazon/photos/discovery/model/LocalItem;", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultPriorityResolver implements UploadPriorityResolver {
    @Override // com.amazon.photos.autosave.UploadPriorityResolver
    public int getUploadPriority(@NotNull LocalItem localItem) {
        localItem.getClass();
        return Priority.MEDIUM.getValue();
    }
}
