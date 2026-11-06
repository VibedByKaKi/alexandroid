package com.amazon.alexa.assistant.toolkit.audio;

import android.media.AudioManager;
import com.amazon.alexa.assistant.toolkit.audio.device.CommunicationDeviceType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class DefaultAudioController$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DefaultAudioController f$0;

    public /* synthetic */ DefaultAudioController$$ExternalSyntheticLambda1(DefaultAudioController defaultAudioController, int i) {
        this.$r8$classId = i;
        this.f$0 = defaultAudioController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit _init_$lambda$2;
        Unit cleanup$lambda$20;
        Unit speakerphone$lambda$14$lambda$11;
        Unit speakerphone$lambda$14$lambda$12;
        int i = this.$r8$classId;
        DefaultAudioController defaultAudioController = this.f$0;
        switch (i) {
            case 0:
                _init_$lambda$2 = DefaultAudioController._init_$lambda$2(defaultAudioController, (AudioManager) obj);
                return _init_$lambda$2;
            case 1:
                cleanup$lambda$20 = DefaultAudioController.cleanup$lambda$20(defaultAudioController, (AudioManager) obj);
                return cleanup$lambda$20;
            case 2:
                speakerphone$lambda$14$lambda$11 = DefaultAudioController.setSpeakerphone$lambda$14$lambda$11(defaultAudioController, (CommunicationDeviceType) obj);
                return speakerphone$lambda$14$lambda$11;
            default:
                speakerphone$lambda$14$lambda$12 = DefaultAudioController.setSpeakerphone$lambda$14$lambda$12(defaultAudioController, (RuntimeException) obj);
                return speakerphone$lambda$14$lambda$12;
        }
    }
}
