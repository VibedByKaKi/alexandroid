package com.facebook.imagepipeline.core;

import com.facebook.imagepipeline.core.ImagePipelineExperiments;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ImagePipelineExperiments$Builder$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImagePipelineExperiments.Builder f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ ImagePipelineExperiments$Builder$$ExternalSyntheticLambda0(ImagePipelineExperiments.Builder builder, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = builder;
        this.f$1 = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit keepCancelledFetchAsLowPriority$lambda$23;
        Unit shouldUseDecodingBufferHelper$lambda$5;
        Unit experimentalThreadHandoffQueueEnabled$lambda$21;
        Unit cancelDecodeOnCacheMiss$lambda$33;
        Unit nativeCodeDisabled$lambda$15;
        Unit ignoreCacheSizeMismatch$lambda$2;
        Unit binaryXmlEnabled$lambda$35;
        Unit storeCacheEntrySize$lambda$1;
        Unit handOffOnUiThreadOnly$lambda$0;
        Unit balancedAnimationStrategy$lambda$12;
        Unit allowDelay$lambda$30;
        Unit webpSupportEnabled$lambda$3;
        Unit isDiskCacheProbingEnabled$lambda$27;
        Unit shouldDownscaleFrameToDrawableDimensions$lambda$19;
        Unit downsampleIfLargeBitmap$lambda$24;
        Unit useDownsampligRatioForResizing$lambda$6;
        Unit gingerbreadDecoderEnabled$lambda$18;
        Unit decodeCancellationEnabled$lambda$8;
        Unit ensureTranscoderLibraryLoaded$lambda$26;
        Unit isEncodedMemoryCacheProbingEnabled$lambda$28;
        Unit encodedCacheEnabled$lambda$25;
        Unit allowProgressiveOnPrefetch$lambda$31;
        Unit prefetchShortcutEnabled$lambda$4;
        Unit partialImageCachingEnabled$lambda$7;
        switch (this.$r8$classId) {
            case 0:
                keepCancelledFetchAsLowPriority$lambda$23 = ImagePipelineExperiments.Builder.setKeepCancelledFetchAsLowPriority$lambda$23(this.f$0, this.f$1);
                return keepCancelledFetchAsLowPriority$lambda$23;
            case 1:
                shouldUseDecodingBufferHelper$lambda$5 = ImagePipelineExperiments.Builder.setShouldUseDecodingBufferHelper$lambda$5(this.f$0, this.f$1);
                return shouldUseDecodingBufferHelper$lambda$5;
            case 2:
                experimentalThreadHandoffQueueEnabled$lambda$21 = ImagePipelineExperiments.Builder.setExperimentalThreadHandoffQueueEnabled$lambda$21(this.f$0, this.f$1);
                return experimentalThreadHandoffQueueEnabled$lambda$21;
            case 3:
                cancelDecodeOnCacheMiss$lambda$33 = ImagePipelineExperiments.Builder.setCancelDecodeOnCacheMiss$lambda$33(this.f$0, this.f$1);
                return cancelDecodeOnCacheMiss$lambda$33;
            case 4:
                nativeCodeDisabled$lambda$15 = ImagePipelineExperiments.Builder.setNativeCodeDisabled$lambda$15(this.f$0, this.f$1);
                return nativeCodeDisabled$lambda$15;
            case 5:
                ignoreCacheSizeMismatch$lambda$2 = ImagePipelineExperiments.Builder.setIgnoreCacheSizeMismatch$lambda$2(this.f$0, this.f$1);
                return ignoreCacheSizeMismatch$lambda$2;
            case 6:
                binaryXmlEnabled$lambda$35 = ImagePipelineExperiments.Builder.setBinaryXmlEnabled$lambda$35(this.f$0, this.f$1);
                return binaryXmlEnabled$lambda$35;
            case 7:
                storeCacheEntrySize$lambda$1 = ImagePipelineExperiments.Builder.setStoreCacheEntrySize$lambda$1(this.f$0, this.f$1);
                return storeCacheEntrySize$lambda$1;
            case 8:
                handOffOnUiThreadOnly$lambda$0 = ImagePipelineExperiments.Builder.setHandOffOnUiThreadOnly$lambda$0(this.f$0, this.f$1);
                return handOffOnUiThreadOnly$lambda$0;
            case 9:
                balancedAnimationStrategy$lambda$12 = ImagePipelineExperiments.Builder.setBalancedAnimationStrategy$lambda$12(this.f$0, this.f$1);
                return balancedAnimationStrategy$lambda$12;
            case 10:
                allowDelay$lambda$30 = ImagePipelineExperiments.Builder.setAllowDelay$lambda$30(this.f$0, this.f$1);
                return allowDelay$lambda$30;
            case 11:
                webpSupportEnabled$lambda$3 = ImagePipelineExperiments.Builder.setWebpSupportEnabled$lambda$3(this.f$0, this.f$1);
                return webpSupportEnabled$lambda$3;
            case 12:
                isDiskCacheProbingEnabled$lambda$27 = ImagePipelineExperiments.Builder.setIsDiskCacheProbingEnabled$lambda$27(this.f$0, this.f$1);
                return isDiskCacheProbingEnabled$lambda$27;
            case 13:
                shouldDownscaleFrameToDrawableDimensions$lambda$19 = ImagePipelineExperiments.Builder.setShouldDownscaleFrameToDrawableDimensions$lambda$19(this.f$0, this.f$1);
                return shouldDownscaleFrameToDrawableDimensions$lambda$19;
            case 14:
                downsampleIfLargeBitmap$lambda$24 = ImagePipelineExperiments.Builder.setDownsampleIfLargeBitmap$lambda$24(this.f$0, this.f$1);
                return downsampleIfLargeBitmap$lambda$24;
            case 15:
                useDownsampligRatioForResizing$lambda$6 = ImagePipelineExperiments.Builder.setUseDownsampligRatioForResizing$lambda$6(this.f$0, this.f$1);
                return useDownsampligRatioForResizing$lambda$6;
            case 16:
                gingerbreadDecoderEnabled$lambda$18 = ImagePipelineExperiments.Builder.setGingerbreadDecoderEnabled$lambda$18(this.f$0, this.f$1);
                return gingerbreadDecoderEnabled$lambda$18;
            case 17:
                decodeCancellationEnabled$lambda$8 = ImagePipelineExperiments.Builder.setDecodeCancellationEnabled$lambda$8(this.f$0, this.f$1);
                return decodeCancellationEnabled$lambda$8;
            case 18:
                ensureTranscoderLibraryLoaded$lambda$26 = ImagePipelineExperiments.Builder.setEnsureTranscoderLibraryLoaded$lambda$26(this.f$0, this.f$1);
                return ensureTranscoderLibraryLoaded$lambda$26;
            case 19:
                isEncodedMemoryCacheProbingEnabled$lambda$28 = ImagePipelineExperiments.Builder.setIsEncodedMemoryCacheProbingEnabled$lambda$28(this.f$0, this.f$1);
                return isEncodedMemoryCacheProbingEnabled$lambda$28;
            case 20:
                encodedCacheEnabled$lambda$25 = ImagePipelineExperiments.Builder.setEncodedCacheEnabled$lambda$25(this.f$0, this.f$1);
                return encodedCacheEnabled$lambda$25;
            case 21:
                allowProgressiveOnPrefetch$lambda$31 = ImagePipelineExperiments.Builder.setAllowProgressiveOnPrefetch$lambda$31(this.f$0, this.f$1);
                return allowProgressiveOnPrefetch$lambda$31;
            case 22:
                prefetchShortcutEnabled$lambda$4 = ImagePipelineExperiments.Builder.setPrefetchShortcutEnabled$lambda$4(this.f$0, this.f$1);
                return prefetchShortcutEnabled$lambda$4;
            default:
                partialImageCachingEnabled$lambda$7 = ImagePipelineExperiments.Builder.setPartialImageCachingEnabled$lambda$7(this.f$0, this.f$1);
                return partialImageCachingEnabled$lambda$7;
        }
    }
}
