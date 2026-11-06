package com.amazon.alexa.accessory.capabilities.mediia;

import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.protocol.Media;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaCapability$$ExternalSyntheticLambda3 implements Consumer {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MediaCapability$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Logger.e("Failed to send PlaybackStatusChanged event.", (Throwable) obj);
                break;
            case 1:
                Logger.e("Failed to handle playback event:", (Throwable) obj);
                break;
            default:
                MediaCapability.lambda$getRegisterForMediaEventsHandler$5((Media.PlaybackStatus) obj);
                break;
        }
    }
}
