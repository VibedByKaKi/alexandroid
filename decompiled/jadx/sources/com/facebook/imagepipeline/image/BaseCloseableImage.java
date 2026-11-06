package com.facebook.imagepipeline.image;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public abstract class BaseCloseableImage implements CloseableImage {
    private static final Set<String> mImageExtrasList = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    @Nullable
    private ImageInfo mCacheImageInfo;
    private Map<String, Object> mExtras = new HashMap();

    @Override // com.facebook.fresco.middleware.HasExtraData
    public <T> T getExtra(String str, @Nullable T t) {
        T t2 = (T) this.mExtras.get(str);
        return t2 == null ? t : t2;
    }

    @Override // com.facebook.imagepipeline.image.HasImageMetadata, com.facebook.fresco.middleware.HasExtraData
    public Map<String, Object> getExtras() {
        return this.mExtras;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public ImageInfo getImageInfo() {
        if (this.mCacheImageInfo == null) {
            this.mCacheImageInfo = new ImageInfoImpl(getWidth(), getHeight(), getSizeInBytes(), getQualityInfo(), getExtras());
        }
        return this.mCacheImageInfo;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage, com.facebook.imagepipeline.image.ImageInfo
    public QualityInfo getQualityInfo() {
        return ImmutableQualityInfo.FULL_QUALITY;
    }

    @Override // com.facebook.imagepipeline.image.CloseableImage
    public boolean isStateful() {
        return false;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public <E> void putExtra(String str, @Nullable E e) {
        if (mImageExtrasList.contains(str)) {
            this.mExtras.put(str, e);
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public void putExtras(@Nullable Map<String, ? extends Object> map) {
        if (map == null) {
            return;
        }
        for (String str : mImageExtrasList) {
            Object obj = map.get(str);
            if (obj != null) {
                this.mExtras.put(str, obj);
            }
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public <T> T getExtra(String str) {
        return (T) getExtra(str, null);
    }
}
