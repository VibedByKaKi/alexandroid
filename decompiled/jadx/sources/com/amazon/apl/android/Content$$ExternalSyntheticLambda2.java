package com.amazon.apl.android;

import com.amazon.apl.android.dependencies.IContentDataRetriever;
import com.amazon.apl.android.dependencies.IContentRetriever;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class Content$$ExternalSyntheticLambda2 implements IContentDataRetriever {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Content$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public final void fetch(String str, IContentRetriever.SuccessCallback<String, String> successCallback, IContentRetriever.FailureCallback<String> failureCallback) {
        String str2 = str;
        switch (this.$r8$classId) {
            case 0:
                failureCallback.onFailure(str2, "Not implemented.");
                break;
            default:
                failureCallback.onFailure(str2, "Content datasources not implemented.");
                break;
        }
    }
}
