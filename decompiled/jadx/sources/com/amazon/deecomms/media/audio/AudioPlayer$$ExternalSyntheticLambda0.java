package com.amazon.deecomms.media.audio;

import android.media.MediaPlayer;
import com.amazon.alexa.accessory.frames.translation.audio.TranslationAudioPlayer;
import com.amazon.alexa.accessorykit.echoauto.MonitoredMediaPlayerWrapper;
import com.amazon.alexa.ra.core.features.livemode.LiveModeFtueAudioPlayer;
import com.amazon.comms.calling.infrastructure.CallAudioPlayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class AudioPlayer$$ExternalSyntheticLambda0 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AudioPlayer$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        boolean lambda$playAudio$1;
        boolean playFromAssets$lambda$3;
        boolean lambda$new$1;
        boolean startPlayback$lambda$5$lambda$4;
        boolean lambda$new$6;
        boolean handlePlay$lambda$4$lambda$3;
        int i3 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i3) {
            case 0:
                lambda$playAudio$1 = AudioPlayer.lambda$playAudio$1((MediaPlayer.OnErrorListener) obj, mediaPlayer, i, i2);
                return lambda$playAudio$1;
            case 1:
                playFromAssets$lambda$3 = TranslationAudioPlayer.playFromAssets$lambda$3((TranslationAudioPlayer) obj, mediaPlayer, i, i2);
                return playFromAssets$lambda$3;
            case 2:
                lambda$new$1 = ((MonitoredMediaPlayerWrapper) obj).lambda$new$1(mediaPlayer, i, i2);
                return lambda$new$1;
            case 3:
                startPlayback$lambda$5$lambda$4 = LiveModeFtueAudioPlayer.startPlayback$lambda$5$lambda$4((LiveModeFtueAudioPlayer) obj, mediaPlayer, i, i2);
                return startPlayback$lambda$5$lambda$4;
            case 4:
                lambda$new$6 = ((com.amazon.apl.android.dependencies.impl.MediaPlayer) obj).lambda$new$6(mediaPlayer, i, i2);
                return lambda$new$6;
            default:
                handlePlay$lambda$4$lambda$3 = CallAudioPlayer.handlePlay$lambda$4$lambda$3((CallAudioPlayer) obj, mediaPlayer, i, i2);
                return handlePlay$lambda$4$lambda$3;
        }
    }
}
