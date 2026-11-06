package com.amazon.deecomms.oobe;

import android.app.Activity;
import android.content.DialogInterface;
import com.amazon.deecomms.oobe.OOBEActivity;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class OOBEActivity$12$$ExternalSyntheticLambda0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Runnable f$0;
    public final /* synthetic */ Activity f$1;

    public /* synthetic */ OOBEActivity$12$$ExternalSyntheticLambda0(Activity activity, int i, Runnable runnable) {
        this.$r8$classId = i;
        this.f$0 = runnable;
        this.f$1 = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((OOBEActivity.AnonymousClass12) this.f$0).lambda$run$0(this.f$1, dialogInterface, i);
                break;
            case 1:
                ((OOBEActivity.AnonymousClass12) this.f$0).lambda$run$1(this.f$1, dialogInterface, i);
                break;
            default:
                ((OOBEActivity.AnonymousClass13) this.f$0).lambda$run$0(this.f$1, dialogInterface, i);
                break;
        }
    }
}
