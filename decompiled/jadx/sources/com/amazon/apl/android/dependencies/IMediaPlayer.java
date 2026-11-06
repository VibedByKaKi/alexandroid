package com.amazon.apl.android.dependencies;

import android.view.View;
import androidx.annotation.NonNull;
import com.amazon.apl.android.primitive.MediaSources;
import com.amazon.apl.enums.AudioTrack;
import com.amazon.apl.enums.TrackState;
import com.amazon.apl.enums.VideoScale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IMediaPlayer<T extends View> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.dependencies.IMediaPlayer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState;

        static {
            int[] iArr = new int[IMediaListener.MediaState.values().length];
            $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState = iArr;
            try {
                iArr[IMediaListener.MediaState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState[IMediaListener.MediaState.PLAYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState[IMediaListener.MediaState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState[IMediaListener.MediaState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IMediaListener {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum MediaState {
            ERROR,
            IDLE,
            PREPARING,
            READY,
            PLAYING,
            PAUSED,
            TRACK_UPDATE,
            END,
            RELEASED
        }

        void updateMediaState(IMediaPlayer iMediaPlayer);
    }

    void addMediaStateListener(@NonNull IMediaListener iMediaListener);

    default int getCurrentError() {
        return getCurrentMediaState() == IMediaListener.MediaState.ERROR ? 0 : -1;
    }

    @NonNull
    IMediaListener.MediaState getCurrentMediaState();

    int getCurrentSeekPosition();

    int getCurrentTrackIndex();

    int getDuration();

    int getTrackCount();

    default int getTrackState() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$apl$android$dependencies$IMediaPlayer$IMediaListener$MediaState[getCurrentMediaState().ordinal()];
        return ((i == 1 || i == 2 || i == 3) ? TrackState.kTrackReady : i != 4 ? TrackState.kTrackNotReady : TrackState.kTrackFailed).getIndex();
    }

    default boolean isMuted() {
        return false;
    }

    boolean isPlaying();

    void next();

    void pause();

    void play();

    void previous();

    void release();

    void removeMediaStateListener(@NonNull IMediaListener iMediaListener);

    void rewind();

    void seek(int i);

    void setAudioTrack(@NonNull AudioTrack audioTrack);

    void setMediaSources(@NonNull MediaSources mediaSources);

    void setTrack(int i);

    void setVideoScale(@NonNull VideoScale videoScale);

    void stop();

    default void mute() {
    }

    default void releaseAudioFocus() {
    }

    default void unmute() {
    }

    default void seekTo(int i) {
    }
}
