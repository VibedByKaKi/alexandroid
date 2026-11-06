package com.amazon.alexa.client.alexaservice.audio.audioplayer.payload;

import com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.PlaybackReports;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
final class AutoValue_PlaybackReports extends PlaybackReports {
    private final long endOffset;
    private final PlaybackAttributes playbackAttributes;
    private final long startOffset;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends PlaybackReports.Builder {
        private Long endOffset;
        private PlaybackAttributes playbackAttributes;
        private Long startOffset;

        @Override // com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.PlaybackReports.Builder
        public PlaybackReports build() {
            String str = this.startOffset == null ? " startOffset" : "";
            if (this.endOffset == null) {
                str = str.concat(" endOffset");
            }
            if (this.playbackAttributes == null) {
                str = str.concat(" playbackAttributes");
            }
            if (str.isEmpty()) {
                return new AutoValue_PlaybackReports(this.startOffset.longValue(), this.endOffset.longValue(), this.playbackAttributes, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.PlaybackReports.Builder
        public PlaybackReports.Builder setEndOffset(long j) {
            this.endOffset = Long.valueOf(j);
            return this;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.PlaybackReports.Builder
        public PlaybackReports.Builder setPlaybackAttributes(PlaybackAttributes playbackAttributes) {
            if (playbackAttributes != null) {
                this.playbackAttributes = playbackAttributes;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null playbackAttributes");
            return null;
        }

        @Override // com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.PlaybackReports.Builder
        public PlaybackReports.Builder setStartOffset(long j) {
            this.startOffset = Long.valueOf(j);
            return this;
        }
    }

    private AutoValue_PlaybackReports(long j, long j2, PlaybackAttributes playbackAttributes) {
        this.startOffset = j;
        this.endOffset = j2;
        this.playbackAttributes = playbackAttributes;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlaybackReports) {
            PlaybackReports playbackReports = (PlaybackReports) obj;
            if (this.startOffset == playbackReports.getStartOffset() && this.endOffset == playbackReports.getEndOffset() && this.playbackAttributes.equals(playbackReports.getPlaybackAttributes())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.PlaybackReports
    public long getEndOffset() {
        return this.endOffset;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.PlaybackReports
    public PlaybackAttributes getPlaybackAttributes() {
        return this.playbackAttributes;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.audioplayer.payload.PlaybackReports
    public long getStartOffset() {
        return this.startOffset;
    }

    public int hashCode() {
        long j = this.startOffset;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.endOffset;
        return this.playbackAttributes.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "PlaybackReports{startOffset=" + this.startOffset + ", endOffset=" + this.endOffset + ", playbackAttributes=" + this.playbackAttributes + StringSubstitutor.DEFAULT_VAR_END;
    }

    public /* synthetic */ AutoValue_PlaybackReports(long j, long j2, PlaybackAttributes playbackAttributes, int i) {
        this(j, j2, playbackAttributes);
    }
}
