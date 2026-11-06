package com.amazon.dee.app.ui.video;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class VideoActivity$$ExternalSyntheticLambda2 implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ VideoActivity$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((VideoActivity) obj).lambda$onResume$0(mediaPlayer);
                break;
            default:
                ((com.amazon.apl.android.dependencies.impl.MediaPlayer) obj).lambda$new$0(mediaPlayer);
                break;
        }
    }
}
