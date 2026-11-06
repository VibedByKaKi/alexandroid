package com.amazon.alexa.accessory.frames.media.viewer;

import androidx.lifecycle.Observer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaViewerFragment$$ExternalSyntheticLambda4 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MediaViewerFragment f$0;

    public /* synthetic */ MediaViewerFragment$$ExternalSyntheticLambda4(MediaViewerFragment mediaViewerFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaViewerFragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        MediaViewerFragment mediaViewerFragment = this.f$0;
        OneShotEvent oneShotEvent = (OneShotEvent) obj;
        switch (i) {
            case 0:
                mediaViewerFragment.lambda$observeDeletionResults$2(oneShotEvent);
                break;
            default:
                mediaViewerFragment.lambda$observeRevertResults$3(oneShotEvent);
                break;
        }
    }
}
