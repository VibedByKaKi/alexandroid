package com.amazon.apl.android.sgcontent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.media.MediaPlayer;
import com.amazon.apl.enums.VideoScale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VideoNode extends Node {
    public VideoNode(long j) {
        super(j);
    }

    private static native MediaPlayer nGetMediaPlayer(long j);

    private static native int nGetVideoScale(long j);

    @Nullable
    public MediaPlayer getMediaPlayer() {
        return nGetMediaPlayer(this.mAddress);
    }

    @NonNull
    public VideoScale getVideoScale() {
        return VideoScale.valueOf(nGetVideoScale(this.mAddress));
    }
}
