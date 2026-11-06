package com.amazon.dee.app.ui.video;

import android.media.MediaPlayer;
import com.amazon.alexa.accessory.frames.translation.audio.TranslationAudioPlayer;
import com.amazon.alexa.accessorykit.echoauto.MonitoredMediaPlayerWrapper;
import com.amazon.alexa.ra.core.features.livemode.LiveModeFtueAudioPlayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class VideoActivity$$ExternalSyntheticLambda0 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ VideoActivity$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((VideoActivity) obj).lambda$setUpVideoView$1(mediaPlayer);
                break;
            case 1:
                TranslationAudioPlayer.playFromAssets$lambda$2((TranslationAudioPlayer) obj, mediaPlayer);
                break;
            case 2:
                ((MonitoredMediaPlayerWrapper) obj).lambda$new$0(mediaPlayer);
                break;
            case 3:
                LiveModeFtueAudioPlayer.startPlayback$lambda$5$lambda$3((LiveModeFtueAudioPlayer) obj, mediaPlayer);
                break;
            default:
                ((com.amazon.apl.android.dependencies.impl.MediaPlayer) obj).lambda$new$3(mediaPlayer);
                break;
        }
    }
}
