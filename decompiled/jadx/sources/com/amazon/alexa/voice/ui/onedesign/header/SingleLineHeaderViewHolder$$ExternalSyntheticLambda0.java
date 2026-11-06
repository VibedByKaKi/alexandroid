package com.amazon.alexa.voice.ui.onedesign.header;

import android.view.View;
import com.amazon.alexa.voice.ui.onedesign.widget.OnCloseClickListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class SingleLineHeaderViewHolder$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OnCloseClickListener f$0;

    public /* synthetic */ SingleLineHeaderViewHolder$$ExternalSyntheticLambda0(OnCloseClickListener onCloseClickListener, int i) {
        this.$r8$classId = i;
        this.f$0 = onCloseClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        OnCloseClickListener onCloseClickListener = this.f$0;
        switch (i) {
            case 0:
                onCloseClickListener.onCloseClicked();
                break;
            default:
                onCloseClickListener.onCloseClicked();
                break;
        }
    }
}
