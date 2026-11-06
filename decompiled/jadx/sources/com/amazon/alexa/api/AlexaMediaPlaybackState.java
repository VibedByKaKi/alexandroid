package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.api.Bundles;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class AlexaMediaPlaybackState {
    private final long bufferedPosition;
    private final long currentPosition;
    private final long lastPositionUpdateTime;

    @Nullable
    private final String mediaItemIdentifier;

    @Nullable
    private final AlexaPlaybackState playbackActions;

    @NonNull
    private final AlexaPlayerInfoState playerState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Adapter implements BundleAdapter<AlexaMediaPlaybackState> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum PlaybackStateKeys implements Bundles.Key {
            MEDIA_ITEM_IDENTIFIER,
            PLAYBACK_ACTIONS,
            PLAYBACK_STATE,
            CURRENT_POSITION,
            BUFFERED_POSITION,
            LAST_POSITION_UPDATE_TIME
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.api.BundleAdapter
        public AlexaMediaPlaybackState createFromBundle(Bundle bundle) {
            return AlexaMediaPlaybackState.builder().setPlaybackActions((AlexaPlaybackState) Bundles.getOptionalParcelable(bundle, PlaybackStateKeys.PLAYBACK_ACTIONS, AlexaPlaybackState.class)).setPlayerState((AlexaPlayerInfoState) Bundles.getOptionalParcelable(bundle, PlaybackStateKeys.PLAYBACK_STATE, AlexaPlayerInfoState.class)).setMediaItemIdentifier(Bundles.getString(bundle, PlaybackStateKeys.MEDIA_ITEM_IDENTIFIER)).setCurrentPosition(Bundles.getLong(bundle, PlaybackStateKeys.CURRENT_POSITION)).setBufferedPosition(Bundles.getLong(bundle, PlaybackStateKeys.BUFFERED_POSITION)).setLastPositionUpdateTime(Bundles.getLong(bundle, PlaybackStateKeys.LAST_POSITION_UPDATE_TIME)).build();
        }

        @Override // com.amazon.alexa.api.BundleAdapter
        public Bundle toBundle(AlexaMediaPlaybackState alexaMediaPlaybackState) {
            Bundle bundle = new Bundle();
            bundle.putString(PlaybackStateKeys.MEDIA_ITEM_IDENTIFIER.name(), alexaMediaPlaybackState.mediaItemIdentifier);
            bundle.putParcelable(PlaybackStateKeys.PLAYBACK_ACTIONS.name(), alexaMediaPlaybackState.playbackActions);
            bundle.putLong(PlaybackStateKeys.CURRENT_POSITION.name(), alexaMediaPlaybackState.currentPosition);
            bundle.putLong(PlaybackStateKeys.LAST_POSITION_UPDATE_TIME.name(), alexaMediaPlaybackState.lastPositionUpdateTime);
            bundle.putLong(PlaybackStateKeys.BUFFERED_POSITION.name(), alexaMediaPlaybackState.bufferedPosition);
            bundle.putParcelable(PlaybackStateKeys.PLAYBACK_STATE.name(), alexaMediaPlaybackState.playerState);
            return bundle;
        }
    }

    private AlexaMediaPlaybackState(Builder builder) {
        this.mediaItemIdentifier = builder.mediaItemIdentifier;
        this.playerState = builder.playerState;
        this.currentPosition = builder.currentPosition;
        this.bufferedPosition = builder.bufferedPosition;
        this.playbackActions = builder.playbackActions;
        this.lastPositionUpdateTime = builder.lastPositionUpdateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public long getBufferedPosition() {
        return this.bufferedPosition;
    }

    public long getCurrentPosition() {
        return this.currentPosition;
    }

    public long getLastPositionUpdateTime() {
        return this.lastPositionUpdateTime;
    }

    public String getMediaItemIdentifier() {
        return this.mediaItemIdentifier;
    }

    public AlexaPlaybackState getPlaybackActions() {
        return this.playbackActions;
    }

    public AlexaPlayerInfoState getPlayerState() {
        return this.playerState;
    }

    public String toString() {
        return "AlexaMediaPlaybackState [mediaItemIdentifier=" + this.mediaItemIdentifier + ", currentPosition=" + this.currentPosition + ", playbackActions=" + this.playbackActions + ", bufferedPosition=" + this.bufferedPosition + ", lastPositionUpdateTime=" + this.lastPositionUpdateTime + ", playerState=" + this.playerState.name() + MarkdownConstants.RIGHT_BRACKET;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private long bufferedPosition;
        private long currentPosition;
        private long lastPositionUpdateTime;
        private String mediaItemIdentifier;
        private AlexaPlaybackState playbackActions;
        private AlexaPlayerInfoState playerState;

        public AlexaMediaPlaybackState build() {
            Preconditions.isFalse(this.playerState == null, "player state cannot be null");
            return new AlexaMediaPlaybackState(this);
        }

        public Builder setBufferedPosition(long j) {
            this.bufferedPosition = j;
            return this;
        }

        public Builder setCurrentPosition(long j) {
            this.currentPosition = j;
            return this;
        }

        public Builder setLastPositionUpdateTime(long j) {
            this.lastPositionUpdateTime = j;
            return this;
        }

        public Builder setMediaItemIdentifier(String str) {
            this.mediaItemIdentifier = str;
            return this;
        }

        public Builder setPlaybackActions(AlexaPlaybackState alexaPlaybackState) {
            this.playbackActions = alexaPlaybackState;
            return this;
        }

        public Builder setPlayerState(AlexaPlayerInfoState alexaPlayerInfoState) {
            this.playerState = alexaPlayerInfoState;
            return this;
        }

        private Builder() {
        }
    }
}
