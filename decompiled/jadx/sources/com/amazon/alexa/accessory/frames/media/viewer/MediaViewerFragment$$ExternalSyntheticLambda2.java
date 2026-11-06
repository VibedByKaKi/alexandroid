package com.amazon.alexa.accessory.frames.media.viewer;

import android.view.View;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaViewerFragment$$ExternalSyntheticLambda2 implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaViewerFragment f$0;

    public /* synthetic */ MediaViewerFragment$$ExternalSyntheticLambda2(MediaViewerFragment mediaViewerFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaViewerFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        MediaViewerFragment mediaViewerFragment = this.f$0;
        switch (i) {
            case 0:
                mediaViewerFragment.lambda$setupHeader$5(view);
                break;
            case 1:
                mediaViewerFragment.lambda$setupFooter$6(view);
                break;
            case 2:
                mediaViewerFragment.lambda$setupFooter$7(view);
                break;
            default:
                mediaViewerFragment.lambda$setupFooter$8(view);
                break;
        }
    }
}
