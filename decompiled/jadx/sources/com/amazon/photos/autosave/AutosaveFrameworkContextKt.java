package com.amazon.photos.autosave;

import com.amazon.photos.uploader.UploadFrameworkContext;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toUploadFrameworkContext", "Lcom/amazon/photos/uploader/UploadFrameworkContext;", "Lcom/amazon/photos/autosave/AutosaveFrameworkContext;", "AndroidPhotosAutosave_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AutosaveFrameworkContextKt {
    @NotNull
    public static final UploadFrameworkContext toUploadFrameworkContext(@NotNull AutosaveFrameworkContext autosaveFrameworkContext) {
        autosaveFrameworkContext.getClass();
        return new UploadFrameworkContext(autosaveFrameworkContext.getDirectedId(), autosaveFrameworkContext.getApplicationContext(), autosaveFrameworkContext.getApplicationId(), autosaveFrameworkContext.getApplicationName(), null, 16, null);
    }
}
