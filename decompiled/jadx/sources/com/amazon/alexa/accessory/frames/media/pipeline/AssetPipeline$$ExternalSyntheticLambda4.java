package com.amazon.alexa.accessory.frames.media.pipeline;

import android.net.Uri;
import com.amazon.alexa.accessory.frames.media.MediaDownloader;
import com.amazon.alexa.accessory.frames.media.dto.AssetInfo;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AssetPipeline$$ExternalSyntheticLambda4 implements Callable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ AssetInfo f$0;
    public final /* synthetic */ AssetPipeline f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ AssetPipeline$$ExternalSyntheticLambda4(AssetInfo assetInfo, AssetPipeline assetPipeline, byte[] bArr) {
        this.f$0 = assetInfo;
        this.f$1 = assetPipeline;
        this.f$2 = bArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri persistMedia$lambda$11;
        Boolean transformAndPersistAsset$lambda$4;
        DownloadedAsset downloadAsset$lambda$3;
        switch (this.$r8$classId) {
            case 0:
                persistMedia$lambda$11 = AssetPipeline.persistMedia$lambda$11(this.f$0, this.f$1, (byte[]) this.f$2);
                return persistMedia$lambda$11;
            case 1:
                transformAndPersistAsset$lambda$4 = AssetPipeline.transformAndPersistAsset$lambda$4((DownloadedAsset) this.f$2, this.f$0, this.f$1);
                return transformAndPersistAsset$lambda$4;
            default:
                downloadAsset$lambda$3 = AssetPipeline.downloadAsset$lambda$3(this.f$1, this.f$0, (MediaDownloader) this.f$2);
                return downloadAsset$lambda$3;
        }
    }

    public /* synthetic */ AssetPipeline$$ExternalSyntheticLambda4(AssetPipeline assetPipeline, AssetInfo assetInfo, MediaDownloader mediaDownloader) {
        this.f$1 = assetPipeline;
        this.f$0 = assetInfo;
        this.f$2 = mediaDownloader;
    }

    public /* synthetic */ AssetPipeline$$ExternalSyntheticLambda4(DownloadedAsset downloadedAsset, AssetInfo assetInfo, AssetPipeline assetPipeline) {
        this.f$2 = downloadedAsset;
        this.f$0 = assetInfo;
        this.f$1 = assetPipeline;
    }
}
