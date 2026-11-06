package com.amazon.apl.android;

import com.amazon.apl.android.Content;
import com.amazon.apl.android.dependencies.IContentRetriever;
import com.amazon.apl.android.dependencies.IPackageLoader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class Content$$ExternalSyntheticLambda1 implements IPackageLoader {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Content$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public final void fetch(Content.ImportRequest importRequest, IContentRetriever.SuccessCallback<Content.ImportRequest, APLJSONData> successCallback, IContentRetriever.FailureCallback<Content.ImportRequest> failureCallback) {
        Content.ImportRequest importRequest2 = importRequest;
        switch (this.$r8$classId) {
            case 0:
                failureCallback.onFailure(importRequest2, "Not implemented.");
                break;
            default:
                failureCallback.onFailure(importRequest2, "Content package loading not implemented.");
                break;
        }
    }
}
