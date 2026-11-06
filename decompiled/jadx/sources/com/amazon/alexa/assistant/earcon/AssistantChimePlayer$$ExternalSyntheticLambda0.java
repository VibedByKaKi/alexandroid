package com.amazon.alexa.assistant.earcon;

import android.media.SoundPool;
import com.amazon.alexa.ra.sdk.audio.AbstractSoundPoolAudioPlayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class AssistantChimePlayer$$ExternalSyntheticLambda0 implements SoundPool.OnLoadCompleteListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AssistantChimePlayer$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        int i3 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i3) {
            case 0:
                AssistantChimePlayer.initSoundPool$lambda$1((AssistantChimePlayer) obj, soundPool, i, i2);
                break;
            default:
                AbstractSoundPoolAudioPlayer.onLoadCompleteListener$lambda$1((AbstractSoundPoolAudioPlayer) obj, soundPool, i, i2);
                break;
        }
    }
}
