package com.amazon.alexa.accessory.speech;

import com.amazon.alexa.accessory.Accessory;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessorySpeechProviderManager$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AccessorySpeechProviderManager$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                AccessorySpeechProviderManager.lambda$registerUserSpeechProvider$1((Accessory) obj2, (Throwable) obj);
                break;
            case 1:
                ((AccessoryAudioPlaybackStatusListener) obj2).lambda$initializeDeviceType$0((String) obj);
                break;
            default:
                ((AccessoryAudioPlaybackStatusListener) obj2).lambda$initializeDeviceType$1((Throwable) obj);
                break;
        }
    }
}
