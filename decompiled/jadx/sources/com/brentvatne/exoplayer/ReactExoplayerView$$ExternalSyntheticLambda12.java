package com.brentvatne.exoplayer;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class ReactExoplayerView$$ExternalSyntheticLambda12 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReactExoplayerView f$0;

    public /* synthetic */ ReactExoplayerView$$ExternalSyntheticLambda12(ReactExoplayerView reactExoplayerView, int i) {
        this.$r8$classId = i;
        this.f$0 = reactExoplayerView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$r8$classId;
        ReactExoplayerView reactExoplayerView = this.f$0;
        switch (i2) {
            case 0:
                reactExoplayerView.lambda$openSettings$3(dialogInterface, i);
                break;
            default:
                reactExoplayerView.lambda$showPlaybackSpeedOptions$4(dialogInterface, i);
                break;
        }
    }
}
