package com.amazon.deecomms.calling.incallexperiences.effects;

import com.amazon.deecomms.calling.incallexperiences.reactions.ui.ReactionsMenuButtonFragment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ReactionsMenuPresenter$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactionsMenuButtonFragment f$0;

    public /* synthetic */ ReactionsMenuPresenter$$ExternalSyntheticLambda2(ReactionsMenuButtonFragment reactionsMenuButtonFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = reactionsMenuButtonFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ReactionsMenuButtonFragment reactionsMenuButtonFragment = this.f$0;
        switch (i) {
            case 0:
                ReactionsMenuPresenter.lambda$new$1(reactionsMenuButtonFragment);
                break;
            case 1:
                reactionsMenuButtonFragment.lambda$showButton$1();
                break;
            case 2:
                reactionsMenuButtonFragment.lambda$hideButton$4();
                break;
            case 3:
                reactionsMenuButtonFragment.lambda$hideMenu$6();
                break;
            case 4:
                reactionsMenuButtonFragment.lambda$disableMenu$8();
                break;
            case 5:
                reactionsMenuButtonFragment.lambda$enableMenu$7();
                break;
            case 6:
                reactionsMenuButtonFragment.lambda$showMenu$2();
                break;
            case 7:
                reactionsMenuButtonFragment.lambda$showMenu$3();
                break;
            case 8:
                reactionsMenuButtonFragment.lambda$hideMenu$5();
                break;
            default:
                reactionsMenuButtonFragment.lambda$refreshMenu$0();
                break;
        }
    }
}
