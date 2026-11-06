package com.facebook.imagepipeline.multiuri;

import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class MultiUri {

    @Nullable
    private ImageRequest mHighResImageRequest;

    @Nullable
    private ImageRequest mLowResImageRequest;

    @Nullable
    private ImageRequest[] mMultiImageRequests;

    private MultiUri(Builder builder) {
        this.mLowResImageRequest = builder.mLowResImageRequest;
        this.mHighResImageRequest = builder.mHighResImageRequest;
        this.mMultiImageRequests = builder.mMultiImageRequests;
    }

    public static Builder create() {
        return new Builder(0);
    }

    @Nullable
    public ImageRequest getHighResImageRequest() {
        return this.mHighResImageRequest;
    }

    @Nullable
    public ImageRequest getLowResImageRequest() {
        return this.mLowResImageRequest;
    }

    @Nullable
    public ImageRequest[] getMultiImageRequests() {
        return this.mMultiImageRequests;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private ImageRequest mHighResImageRequest;

        @Nullable
        private ImageRequest mLowResImageRequest;

        @Nullable
        private ImageRequest[] mMultiImageRequests;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public MultiUri build() {
            return new MultiUri(this, 0);
        }

        public Builder setHighResImageRequest(@Nullable ImageRequest imageRequest) {
            this.mHighResImageRequest = imageRequest;
            return this;
        }

        public Builder setImageRequests(@Nullable ImageRequest... imageRequestArr) {
            this.mMultiImageRequests = imageRequestArr;
            return this;
        }

        public Builder setLowResImageRequest(@Nullable ImageRequest imageRequest) {
            this.mLowResImageRequest = imageRequest;
            return this;
        }

        private Builder() {
        }
    }

    public /* synthetic */ MultiUri(Builder builder, int i) {
        this(builder);
    }
}
