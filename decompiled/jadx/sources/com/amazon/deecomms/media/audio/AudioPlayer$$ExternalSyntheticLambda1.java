package com.amazon.deecomms.media.audio;

import android.media.AudioManager;
import com.amazon.alexa.accessory.frames.routines.TapRoutinesAudioPlayerManager;
import com.amazon.alexa.accessory.frames.smartPlay.SmartPlayManager;
import com.amazon.alexa.accessory.frames.translation.audio.TranslationAudioPlayer;
import com.amazon.alexa.accessory.frames.translation.audio.TranslationPromptPlayer;
import com.amazon.alexa.ra.core.features.dictation.AudioRecordMicSource;
import com.amazon.apl.android.dependencies.impl.MediaPlayer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class AudioPlayer$$ExternalSyntheticLambda1 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AudioPlayer$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 0:
                ((AudioPlayer) obj).lambda$new$0(i);
                break;
            case 1:
                ((TapRoutinesAudioPlayerManager) obj).lambda$new$0(i);
                break;
            case 2:
                ((SmartPlayManager) obj).lambda$new$0(i);
                break;
            case 3:
                TranslationAudioPlayer.focusChangeListener$lambda$0((TranslationAudioPlayer) obj, i);
                break;
            case 4:
                TranslationPromptPlayer.focusChangeListener$lambda$0((TranslationPromptPlayer) obj, i);
                break;
            case 5:
                AudioRecordMicSource.requestAudioFocus$lambda$1((AudioRecordMicSource) obj, i);
                break;
            case 6:
                ((MediaPlayer) obj).lambda$new$5(i);
                break;
            default:
                ((AudioRecorder) obj).lambda$new$0(i);
                break;
        }
    }
}
