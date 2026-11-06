package com.amazon.apl.android.content;

import android.net.Uri;
import com.amazon.apl.android.dependencies.IContentRetriever;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class ContentRetriever$$ExternalSyntheticLambda2 implements IContentRetriever.FailureCallbackV2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ IContentRetriever.FailureCallback f$0;

    public /* synthetic */ ContentRetriever$$ExternalSyntheticLambda2(IContentRetriever.FailureCallback failureCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = failureCallback;
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever.FailureCallbackV2
    public final void onFailure(Object obj, String str, int i) {
        int i2 = this.$r8$classId;
        IContentRetriever.FailureCallback failureCallback = this.f$0;
        Uri uri = (Uri) obj;
        switch (i2) {
            case 0:
                failureCallback.onFailure(uri, str);
                break;
            default:
                failureCallback.onFailure(uri, str);
                break;
        }
    }
}
