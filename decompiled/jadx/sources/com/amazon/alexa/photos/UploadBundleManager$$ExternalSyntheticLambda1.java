package com.amazon.alexa.photos;

import com.amazon.photos.autosave.model.MediaType;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final /* synthetic */ class UploadBundleManager$$ExternalSyntheticLambda1 implements Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ UploadBundleManager f$0;

    public /* synthetic */ UploadBundleManager$$ExternalSyntheticLambda1(UploadBundleManager uploadBundleManager, int i) {
        this.$r8$classId = i;
        this.f$0 = uploadBundleManager;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean lambda$getAllSourcesAutoSaveStatus$2;
        boolean lambda$getAllMediaTypeAutoSaveStatus$1;
        int i = this.$r8$classId;
        UploadBundleManager uploadBundleManager = this.f$0;
        switch (i) {
            case 0:
                lambda$getAllSourcesAutoSaveStatus$2 = uploadBundleManager.lambda$getAllSourcesAutoSaveStatus$2((PhotosSource) obj);
                return lambda$getAllSourcesAutoSaveStatus$2;
            default:
                lambda$getAllMediaTypeAutoSaveStatus$1 = uploadBundleManager.lambda$getAllMediaTypeAutoSaveStatus$1((MediaType) obj);
                return lambda$getAllMediaTypeAutoSaveStatus$1;
        }
    }
}
