package com.amazon.alexa.voice.model;

import com.amazon.alexa.voice.ui.util.BooleanProperty;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class DefaultVoiceService$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DefaultVoiceService$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((DefaultVoiceService) obj2).lambda$startVoiceExperience$8((Boolean) obj);
                break;
            default:
                ((BooleanProperty) obj2).set(((Boolean) obj).booleanValue());
                break;
        }
    }
}
