package com.amazon.alexa.accessory.frames.media.viewer;

import android.content.Context;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class MediaViewerFragment$$ExternalSyntheticLambda13 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Serializable f$1;

    public /* synthetic */ MediaViewerFragment$$ExternalSyntheticLambda13(String str, Context context) {
        this.$r8$classId = 1;
        this.f$1 = str;
        this.f$0 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                MediaViewerFragment.lambda$showToast$16((Context) this.f$0, (String) this.f$1);
                break;
            case 1:
                MediaViewerViewModel.lambda$recordViewMetric$1((String) this.f$1, (Context) this.f$0);
                break;
            default:
                ((MediaViewerFragment) this.f$0).lambda$loadRevertIndexAndRefreshFooter$11((HashMap) this.f$1);
                break;
        }
    }

    public /* synthetic */ MediaViewerFragment$$ExternalSyntheticLambda13(Object obj, Serializable serializable, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = serializable;
    }
}
