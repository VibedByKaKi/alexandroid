package com.amazon.apl.android.primitive;

import com.amazon.apl.android.media.TextTrack;
import com.amazon.apl.android.primitive.AutoValue_BoundMediaSources_MediaSource;
import com.amazon.apl.android.utils.HttpUtils;
import com.amazon.apl.enums.APLEnum;
import com.amazon.common.BoundObject;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class BoundMediaSources implements IterableProperty<MediaSource> {
    public static final int REPEAT_FOREVER = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class MediaSource {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract MediaSource build();

            public abstract Builder duration(int i);

            public abstract Builder headers(Map<String, String> map);

            public abstract Builder offset(int i);

            public abstract Builder repeatCount(int i);

            public abstract Builder textTracks(List<TextTrack> list);

            public abstract Builder url(String str);
        }

        public static Builder builder() {
            return new AutoValue_BoundMediaSources_MediaSource.Builder();
        }

        public abstract int duration();

        public abstract Map<String, String> headers();

        public abstract int offset();

        public abstract int repeatCount();

        public abstract List<TextTrack> textTracks();

        public abstract String url();
    }

    public static BoundMediaSources create(BoundObject boundObject, APLEnum aPLEnum) {
        return (BoundMediaSources) IterableProperty.create(new BoundMediaSourceGetter(boundObject, aPLEnum));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nGetMediaSourceDurationAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String[] nGetMediaSourceHeadersAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nGetMediaSourceOffsetAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nGetMediaSourceRepeatCountAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native TextTrack[] nGetMediaSourceTextTracksAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String nGetMediaSourceUrlAt(long j, int i, int i2);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BoundMediaSourceGetter extends ArrayGetter<BoundMediaSources, MediaSource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.apl.android.primitive.ArrayGetter
        public BoundMediaSources builder() {
            return new AutoValue_BoundMediaSources(new ArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.apl.android.primitive.ArrayGetter
        public MediaSource get(int i) {
            return MediaSource.builder().url(BoundMediaSources.nGetMediaSourceUrlAt(getNativeHandle(), getIndex(), i)).duration(BoundMediaSources.nGetMediaSourceDurationAt(getNativeHandle(), getIndex(), i)).offset(BoundMediaSources.nGetMediaSourceOffsetAt(getNativeHandle(), getIndex(), i)).repeatCount(BoundMediaSources.nGetMediaSourceRepeatCountAt(getNativeHandle(), getIndex(), i)).headers(HttpUtils.listToHeadersMap(BoundMediaSources.nGetMediaSourceHeadersAt(getNativeHandle(), getIndex(), i))).textTracks(Arrays.asList(BoundMediaSources.nGetMediaSourceTextTracksAt(getNativeHandle(), getIndex(), i))).build();
        }

        private BoundMediaSourceGetter(BoundObject boundObject, APLEnum aPLEnum) {
            super(boundObject, aPLEnum);
        }
    }
}
