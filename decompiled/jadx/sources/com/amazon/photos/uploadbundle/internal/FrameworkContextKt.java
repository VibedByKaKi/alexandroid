package com.amazon.photos.uploadbundle.internal;

import com.amazon.photos.autosave.AutosaveFrameworkContext;
import com.amazon.photos.uploader.UploadFrameworkContext;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"toAutosaveFrameworkContext", "Lcom/amazon/photos/autosave/AutosaveFrameworkContext;", "Lcom/amazon/photos/uploadbundle/internal/FrameworkContext;", "toUploadFrameworkContext", "Lcom/amazon/photos/uploader/UploadFrameworkContext;", "AndroidPhotosUploadBundle_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FrameworkContextKt {
    @NotNull
    public static final AutosaveFrameworkContext toAutosaveFrameworkContext(@NotNull FrameworkContext frameworkContext) {
        frameworkContext.getClass();
        return new AutosaveFrameworkContext(frameworkContext.getDirectedId(), frameworkContext.getApplicationContext(), frameworkContext.getApplicationId(), frameworkContext.getApplicationName());
    }

    @NotNull
    public static final UploadFrameworkContext toUploadFrameworkContext(@NotNull FrameworkContext frameworkContext) {
        frameworkContext.getClass();
        return new UploadFrameworkContext(frameworkContext.getDirectedId(), frameworkContext.getApplicationContext(), frameworkContext.getApplicationId(), frameworkContext.getApplicationName(), null, 16, null);
    }
}
