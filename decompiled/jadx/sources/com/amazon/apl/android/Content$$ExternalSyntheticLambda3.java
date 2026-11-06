package com.amazon.apl.android;

import com.amazon.apl.android.Content;
import com.amazon.apl.android.dependencies.IContentRetriever;
import com.amazon.apl.android.metrics.ITimer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class Content$$ExternalSyntheticLambda3 implements IContentRetriever.SuccessCallback, IContentRetriever.FailureCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Content f$0;
    public final /* synthetic */ ITimer f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ Content$$ExternalSyntheticLambda3(Content content, ITimer iTimer, long j) {
        this.$r8$classId = 0;
        this.f$0 = content;
        this.f$1 = iTimer;
        this.f$2 = j;
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever.FailureCallback
    public void onFailure(Object obj, String str) {
        switch (this.$r8$classId) {
            case 1:
                this.f$0.lambda$notifyCallback$3(this.f$2, this.f$1, (Content.ImportRequest) obj, str);
                break;
            default:
                this.f$0.lambda$notifyCallback$5(this.f$2, this.f$1, (String) obj, str);
                break;
        }
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever.SuccessCallback
    public void onSuccess(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$notifyCallback$2(this.f$1, this.f$2, (Content.ImportRequest) obj, (APLJSONData) obj2);
                break;
            default:
                this.f$0.lambda$notifyCallback$4(this.f$2, this.f$1, (String) obj, (String) obj2);
                break;
        }
    }

    public /* synthetic */ Content$$ExternalSyntheticLambda3(Content content, long j, ITimer iTimer, int i) {
        this.$r8$classId = i;
        this.f$0 = content;
        this.f$2 = j;
        this.f$1 = iTimer;
    }
}
