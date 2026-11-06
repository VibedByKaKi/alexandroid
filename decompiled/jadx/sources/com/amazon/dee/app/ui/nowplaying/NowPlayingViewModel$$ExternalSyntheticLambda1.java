package com.amazon.dee.app.ui.nowplaying;

import com.amazon.dee.app.ui.nowplaying.VoicePlaybackEventTranslator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NowPlayingViewModel$$ExternalSyntheticLambda1 implements VoicePlaybackEventTranslator.FlashBriefingCardGate, CardDismissListener {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ NowPlayingViewModel$$ExternalSyntheticLambda1(Object obj) {
        this.f$0 = obj;
    }

    @Override // com.amazon.dee.app.ui.nowplaying.VoicePlaybackEventTranslator.FlashBriefingCardGate
    public boolean isCardHidden() {
        return ((NowPlayingViewModel) this.f$0).isFlashBriefingCardHidden();
    }

    @Override // com.amazon.dee.app.ui.nowplaying.CardDismissListener
    public void onCardDismissed() {
        ((VoicePlaybackEventTranslator) this.f$0).lambda$init$0();
    }
}
