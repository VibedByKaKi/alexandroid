package com.amazon.alexa.accessory.frames.media;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaImportService$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaImportService f$0;

    public /* synthetic */ MediaImportService$$ExternalSyntheticLambda2(MediaImportService mediaImportService, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaImportService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        MediaImportService mediaImportService = this.f$0;
        switch (i) {
            case 0:
                mediaImportService.lambda$cleanupNanAndFallback$9();
                break;
            case 1:
                mediaImportService.completeImportBridges();
                break;
            case 2:
                mediaImportService.lambda$buildAmaChannel$3();
                break;
            case 3:
                mediaImportService.handleTransferError();
                break;
            case 4:
                mediaImportService.triggerBatchAck();
                break;
            case 5:
                mediaImportService.releaseTransport();
                break;
            case 6:
                mediaImportService.lambda$buildAssetPipeline$1();
                break;
            case 7:
                mediaImportService.onDownloadsComplete();
                break;
            default:
                mediaImportService.finalizeImport();
                break;
        }
    }
}
