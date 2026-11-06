package com.amazon.apl.android.primitive;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.apl.android.media.TextTrack;
import com.amazon.apl.android.primitive.MediaSources;
import java.util.List;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_MediaSources_MediaSource extends MediaSources.MediaSource {
    private final int duration;
    private final Map<String, String> headers;
    private final int offset;
    private final int repeatCount;
    private final List<TextTrack> textTracks;
    private final String url;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends MediaSources.MediaSource.Builder {
        private Integer duration;
        private Map<String, String> headers;
        private Integer offset;
        private Integer repeatCount;
        private List<TextTrack> textTracks;
        private String url;

        @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource.Builder
        public MediaSources.MediaSource build() {
            String str = this.url == null ? " url" : "";
            if (this.duration == null) {
                str = str.concat(" duration");
            }
            if (this.repeatCount == null) {
                str = str.concat(" repeatCount");
            }
            if (this.offset == null) {
                str = str.concat(" offset");
            }
            if (this.headers == null) {
                str = str.concat(" headers");
            }
            if (this.textTracks == null) {
                str = str.concat(" textTracks");
            }
            if (str.isEmpty()) {
                return new AutoValue_MediaSources_MediaSource(this.url, this.duration.intValue(), this.repeatCount.intValue(), this.offset.intValue(), this.headers, this.textTracks);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource.Builder
        public MediaSources.MediaSource.Builder duration(int i) {
            this.duration = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource.Builder
        public MediaSources.MediaSource.Builder headers(Map<String, String> map) {
            if (map != null) {
                this.headers = map;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null headers");
            return null;
        }

        @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource.Builder
        public MediaSources.MediaSource.Builder offset(int i) {
            this.offset = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource.Builder
        public MediaSources.MediaSource.Builder repeatCount(int i) {
            this.repeatCount = Integer.valueOf(i);
            return this;
        }

        @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource.Builder
        public MediaSources.MediaSource.Builder textTracks(List<TextTrack> list) {
            if (list != null) {
                this.textTracks = list;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null textTracks");
            return null;
        }

        @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource.Builder
        public MediaSources.MediaSource.Builder url(String str) {
            if (str != null) {
                this.url = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null url");
            return null;
        }
    }

    private AutoValue_MediaSources_MediaSource(String str, int i, int i2, int i3, Map<String, String> map, List<TextTrack> list) {
        this.url = str;
        this.duration = i;
        this.repeatCount = i2;
        this.offset = i3;
        this.headers = map;
        this.textTracks = list;
    }

    @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource
    public int duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MediaSources.MediaSource) {
            MediaSources.MediaSource mediaSource = (MediaSources.MediaSource) obj;
            if (this.url.equals(mediaSource.url()) && this.duration == mediaSource.duration() && this.repeatCount == mediaSource.repeatCount() && this.offset == mediaSource.offset() && this.headers.equals(mediaSource.headers()) && this.textTracks.equals(mediaSource.textTracks())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.textTracks.hashCode() ^ ((((((((((this.url.hashCode() ^ 1000003) * 1000003) ^ this.duration) * 1000003) ^ this.repeatCount) * 1000003) ^ this.offset) * 1000003) ^ this.headers.hashCode()) * 1000003);
    }

    @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource
    public Map<String, String> headers() {
        return this.headers;
    }

    @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource
    public int offset() {
        return this.offset;
    }

    @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource
    public int repeatCount() {
        return this.repeatCount;
    }

    @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource
    public List<TextTrack> textTracks() {
        return this.textTracks;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MediaSource{url=");
        sb.append(this.url);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", repeatCount=");
        sb.append(this.repeatCount);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", headers=");
        sb.append(this.headers);
        sb.append(", textTracks=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(StringSubstitutor.DEFAULT_VAR_END, this.textTracks, sb);
    }

    @Override // com.amazon.apl.android.primitive.MediaSources.MediaSource
    public String url() {
        return this.url;
    }
}
