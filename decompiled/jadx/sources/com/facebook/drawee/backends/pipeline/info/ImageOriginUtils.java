package com.facebook.drawee.backends.pipeline.info;

import com.facebook.infer.annotation.Nullsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class ImageOriginUtils {
    private ImageOriginUtils() {
    }

    public static int mapProducerNameToImageOrigin(String str) {
        str.getClass();
        switch (str) {
            case "QualifiedResourceFetchProducer":
            case "LocalResourceFetchProducer":
            case "LocalFileFetchProducer":
            case "VideoThumbnailProducer":
            case "LocalAssetFetchProducer":
            case "DataFetchProducer":
            case "LocalContentUriThumbnailFetchProducer":
            case "LocalContentUriFetchProducer":
                return 7;
            case "BitmapMemoryCacheGetProducer":
            case "BitmapMemoryCacheProducer":
            case "PostprocessedBitmapMemoryCacheProducer":
                return 5;
            case "EncodedMemoryCacheProducer":
                return 4;
            case "NetworkFetchProducer":
                return 2;
            case "DiskCacheProducer":
            case "PartialDiskCacheProducer":
                return 3;
            default:
                return 1;
        }
    }

    public static String toString(int i) {
        switch (i) {
            case 2:
                return "network";
            case 3:
                return "disk";
            case 4:
                return "memory_encoded";
            case 5:
                return "memory_bitmap";
            case 6:
                return "memory_bitmap_shortcut";
            case 7:
                return "local";
            default:
                return "unknown";
        }
    }
}
