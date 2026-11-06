package com.amazon.alexa.accessory.frames.media;

import com.amazon.alexa.accessory.frames.media.dto.AssetInfo;
import java.util.function.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaImportService$$ExternalSyntheticLambda29 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaImportService f$0;

    public /* synthetic */ MediaImportService$$ExternalSyntheticLambda29(MediaImportService mediaImportService, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaImportService;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        MediaImportService mediaImportService = this.f$0;
        switch (i) {
            case 0:
                mediaImportService.onOptimisticTileRendered((String) obj);
                break;
            case 1:
                mediaImportService.onAssetStaged((AssetInfo) obj);
                break;
            default:
                mediaImportService.onAssetAccepted((AssetInfo) obj);
                break;
        }
    }
}
