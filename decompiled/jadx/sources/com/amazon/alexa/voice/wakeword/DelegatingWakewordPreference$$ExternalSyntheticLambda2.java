package com.amazon.alexa.voice.wakeword;

import com.amazon.alexa.voice.wakeword.VoiceOverWakeWordPrecondition;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class DelegatingWakewordPreference$$ExternalSyntheticLambda2 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ DelegatingWakewordPreference$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((DelegatingWakewordPreference) obj2).lambda$enableWakeword$4((Throwable) obj);
                break;
            case 1:
                ((VoiceOverWakeWordPrecondition.VoiceOverChecker) obj2).lambda$scheduleVoiceOverSpeakingPuller$0((Long) obj);
                break;
            default:
                ((DisposableWakeWordPrecondition) obj2).updateCurrentValue(((Boolean) obj).booleanValue());
                break;
        }
    }
}
