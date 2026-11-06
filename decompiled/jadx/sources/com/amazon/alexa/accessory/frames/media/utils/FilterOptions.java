package com.amazon.alexa.accessory.frames.media.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class FilterOptions {
    private final CaptureMethodFilter captureMethodFilter;
    private final MediaTypeFilter mediaTypeFilter;

    private FilterOptions(Builder builder) {
        this.captureMethodFilter = builder.captureMethodFilter;
        this.mediaTypeFilter = builder.mediaTypeFilter;
    }

    public static FilterOptions createDefault() {
        return new Builder().build();
    }

    public CaptureMethodFilter getCaptureMethodFilter() {
        return this.captureMethodFilter;
    }

    public MediaTypeFilter getMediaTypeFilter() {
        return this.mediaTypeFilter;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private CaptureMethodFilter captureMethodFilter = CaptureMethodFilter.ALL;
        private MediaTypeFilter mediaTypeFilter = MediaTypeFilter.ALL;

        public FilterOptions build() {
            return new FilterOptions(this, 0);
        }

        public Builder captureMethodFilter(CaptureMethodFilter captureMethodFilter) {
            if (captureMethodFilter == null) {
                captureMethodFilter = CaptureMethodFilter.ALL;
            }
            this.captureMethodFilter = captureMethodFilter;
            return this;
        }

        public Builder mediaTypeFilter(MediaTypeFilter mediaTypeFilter) {
            if (mediaTypeFilter == null) {
                mediaTypeFilter = MediaTypeFilter.ALL;
            }
            this.mediaTypeFilter = mediaTypeFilter;
            return this;
        }

        public Builder captureMethodFilter(String str) {
            this.captureMethodFilter = CaptureMethodFilter.fromString(str);
            return this;
        }

        public Builder mediaTypeFilter(String str) {
            this.mediaTypeFilter = MediaTypeFilter.fromString(str);
            return this;
        }
    }

    public /* synthetic */ FilterOptions(Builder builder, int i) {
        this(builder);
    }
}
