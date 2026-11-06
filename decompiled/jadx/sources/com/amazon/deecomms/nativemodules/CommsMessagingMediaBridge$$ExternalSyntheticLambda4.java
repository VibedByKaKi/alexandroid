package com.amazon.deecomms.nativemodules;

import android.media.MediaPlayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class CommsMessagingMediaBridge$$ExternalSyntheticLambda4 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ CommsMessagingMediaBridge$$ExternalSyntheticLambda4(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                CommsMessagingMediaBridge.lambda$playAudioFile$2(str, mediaPlayer);
                break;
            default:
                CommsMessagingMediaDelegate.lambda$playAudioFile$2(str, mediaPlayer);
                break;
        }
    }
}
