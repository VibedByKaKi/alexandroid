package com.amazon.apl.android.dependencies.impl;

import androidx.annotation.NonNull;
import com.amazon.apl.android.dependencies.IMediaPlayer;
import com.amazon.apl.android.primitive.MediaSources;
import com.amazon.apl.enums.AudioTrack;
import com.amazon.apl.enums.VideoScale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NoOpMediaPlayer implements IMediaPlayer {
    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    @NonNull
    public IMediaPlayer.IMediaListener.MediaState getCurrentMediaState() {
        return null;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public int getCurrentSeekPosition() {
        return 0;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public int getCurrentTrackIndex() {
        return 0;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public int getDuration() {
        return 0;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public int getTrackCount() {
        return 0;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public boolean isMuted() {
        return false;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public boolean isPlaying() {
        return false;
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void mute() {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void next() {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void pause() {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void play() {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void previous() {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void release() {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void rewind() {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void stop() {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void unmute() {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void addMediaStateListener(@NonNull IMediaPlayer.IMediaListener iMediaListener) {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void removeMediaStateListener(@NonNull IMediaPlayer.IMediaListener iMediaListener) {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void seek(int i) {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void seekTo(int i) {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void setAudioTrack(@NonNull AudioTrack audioTrack) {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void setMediaSources(@NonNull MediaSources mediaSources) {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void setTrack(int i) {
    }

    @Override // com.amazon.apl.android.dependencies.IMediaPlayer
    public void setVideoScale(@NonNull VideoScale videoScale) {
    }
}
