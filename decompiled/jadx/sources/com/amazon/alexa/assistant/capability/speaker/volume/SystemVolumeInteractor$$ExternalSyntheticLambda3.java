package com.amazon.alexa.assistant.capability.speaker.volume;

import android.media.AudioManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class SystemVolumeInteractor$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SystemVolumeInteractor f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ SystemVolumeInteractor$$ExternalSyntheticLambda3(SystemVolumeInteractor systemVolumeInteractor, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = systemVolumeInteractor;
        this.f$1 = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit volume$lambda$9$lambda$8;
        Unit adjustVolume$lambda$11$lambda$10;
        switch (this.$r8$classId) {
            case 0:
                volume$lambda$9$lambda$8 = SystemVolumeInteractor.setVolume$lambda$9$lambda$8(this.f$0, this.f$1, (AudioManager) obj);
                return volume$lambda$9$lambda$8;
            default:
                adjustVolume$lambda$11$lambda$10 = SystemVolumeInteractor.adjustVolume$lambda$11$lambda$10(this.f$0, this.f$1, (AudioManager) obj);
                return adjustVolume$lambda$11$lambda$10;
        }
    }
}
