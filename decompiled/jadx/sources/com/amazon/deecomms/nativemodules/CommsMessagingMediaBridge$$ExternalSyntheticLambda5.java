package com.amazon.deecomms.nativemodules;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsMessagingMediaBridge$$ExternalSyntheticLambda5 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ CommsMessagingMediaBridge$$ExternalSyntheticLambda5(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        boolean lambda$playAudioFile$3;
        int i3 = this.$r8$classId;
        String str = this.f$0;
        switch (i3) {
            case 0:
                lambda$playAudioFile$3 = CommsMessagingMediaBridge.lambda$playAudioFile$3(str, mediaPlayer, i, i2);
                return lambda$playAudioFile$3;
            default:
                return CommsMessagingMediaDelegate.lambda$playAudioFile$3(str, mediaPlayer, i, i2);
        }
    }
}
