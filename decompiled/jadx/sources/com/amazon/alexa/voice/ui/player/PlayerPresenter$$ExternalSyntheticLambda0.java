package com.amazon.alexa.voice.ui.player;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class PlayerPresenter$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PlayerPresenter f$0;

    public /* synthetic */ PlayerPresenter$$ExternalSyntheticLambda0(PlayerPresenter playerPresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = playerPresenter;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        PlayerPresenter playerPresenter = this.f$0;
        switch (i) {
            case 0:
                playerPresenter.lambda$start$0((PlayerCardModel) obj);
                break;
            case 1:
                playerPresenter.lambda$start$1((Long) obj);
                break;
            case 2:
                playerPresenter.lambda$start$2((Boolean) obj);
                break;
            default:
                playerPresenter.lambda$playPauseClicked$3((Boolean) obj);
                break;
        }
    }
}
