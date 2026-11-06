package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import com.amazon.alexa.client.alexaservice.eventing.events.LivePreviewObservedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.SpeakDirectiveReceivedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.SpeechPlaybackEndedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.SpeechPlaybackStartedEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class SelfBargeInObserver$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ SelfBargeInObserver$$ExternalSyntheticLambda5(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((SelfBargeInObserver) this.f$0).lambda$handleLivePreview$8((SelfBargeInDialogState) this.f$1);
                break;
            case 1:
                ((PerDridCaptionAccumulator) this.f$0).lambda$armIdleTimer$0((DialogRequestIdentifier) this.f$1);
                break;
            case 2:
                ((SelfBargeInObserver) this.f$0).lambda$on$7((LivePreviewObservedEvent) this.f$1);
                break;
            case 3:
                ((SelfBargeInObserver) this.f$0).lambda$on$1((SpeakDirectiveReceivedEvent) this.f$1);
                break;
            case 4:
                ((SelfBargeInObserver) this.f$0).lambda$on$2((SpeechPlaybackStartedEvent) this.f$1);
                break;
            default:
                ((SelfBargeInObserver) this.f$0).lambda$on$3((SpeechPlaybackEndedEvent) this.f$1);
                break;
        }
    }
}
