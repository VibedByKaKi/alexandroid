package com.facebook.react.devsupport;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final /* synthetic */ class RedBoxContentView$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RedBoxContentView f$0;

    public /* synthetic */ RedBoxContentView$$ExternalSyntheticLambda0(RedBoxContentView redBoxContentView, int i) {
        this.$r8$classId = i;
        this.f$0 = redBoxContentView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        RedBoxContentView redBoxContentView = this.f$0;
        switch (i) {
            case 0:
                RedBoxContentView.reportButtonOnClickListener$lambda$0(redBoxContentView, view);
                break;
            case 1:
                RedBoxContentView.init$lambda$2(redBoxContentView, view);
                break;
            default:
                RedBoxContentView.init$lambda$3(redBoxContentView, view);
                break;
        }
    }
}
