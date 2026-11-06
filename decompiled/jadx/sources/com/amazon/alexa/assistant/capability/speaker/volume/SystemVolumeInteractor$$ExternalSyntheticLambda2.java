package com.amazon.alexa.assistant.capability.speaker.volume;

import android.media.AudioManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class SystemVolumeInteractor$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SystemVolumeInteractor f$0;

    public /* synthetic */ SystemVolumeInteractor$$ExternalSyntheticLambda2(SystemVolumeInteractor systemVolumeInteractor, int i) {
        this.$r8$classId = i;
        this.f$0 = systemVolumeInteractor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit _init_$lambda$0;
        int volume$lambda$4$lambda$3;
        int i = this.$r8$classId;
        SystemVolumeInteractor systemVolumeInteractor = this.f$0;
        AudioManager audioManager = (AudioManager) obj;
        switch (i) {
            case 0:
                _init_$lambda$0 = SystemVolumeInteractor._init_$lambda$0(systemVolumeInteractor, audioManager);
                return _init_$lambda$0;
            default:
                volume$lambda$4$lambda$3 = SystemVolumeInteractor.getVolume$lambda$4$lambda$3(systemVolumeInteractor, audioManager);
                return Integer.valueOf(volume$lambda$4$lambda$3);
        }
    }
}
