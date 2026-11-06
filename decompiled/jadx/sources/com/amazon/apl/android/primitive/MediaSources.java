package com.amazon.apl.android.primitive;

import com.amazon.apl.android.media.TextTrack;
import com.amazon.apl.android.primitive.AutoValue_MediaSources_MediaSource;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class MediaSources implements IterableProperty<MediaSource> {
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
            return new AutoValue_MediaSources_MediaSource.Builder();
        }

        public abstract int duration();

        public abstract Map<String, String> headers();

        public abstract int offset();

        public abstract int repeatCount();

        public abstract List<TextTrack> textTracks();

        public abstract String url();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MediaSourceGetter extends SimpleArrayGetter<MediaSources, MediaSource> {
        private MediaSourceGetter() {
        }

        @Override // com.amazon.apl.android.primitive.SimpleArrayGetter
        public MediaSources builder() {
            return new AutoValue_MediaSources(new ArrayList());
        }
    }

    public static MediaSources create() {
        return (MediaSources) IterableProperty.create(new MediaSourceGetter());
    }
}
