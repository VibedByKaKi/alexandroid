package com.amazon.deecomms.sharing;

import android.content.Context;
import com.amazon.alexa.sharing.presenter.FallbackStrategyPresenter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class ContentSharingService$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ContentSharingService$$ExternalSyntheticLambda0(Context context, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ContentSharingService.lambda$showErrorToUser$0(this.f$0, this.f$1);
                break;
            case 1:
                FallbackStrategyPresenter.lambda$showErrorToUser$0(this.f$0, this.f$1);
                break;
            default:
                com.amazon.alexa.sharing.sharingsdk.ContentSharingService.lambda$showErrorToUser$0(this.f$0, this.f$1);
                break;
        }
    }
}
