package com.amazon.apl.android.component;

import android.net.Uri;
import com.amazon.apl.android.VectorGraphic;
import com.amazon.apl.android.dependencies.IContentRetriever;
import com.amazon.apl.android.graphic.APLVectorGraphicView;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class VectorGraphicViewAdapter$$ExternalSyntheticLambda2 implements IContentRetriever.SuccessCallback, IContentRetriever.FailureCallbackV2 {
    public final /* synthetic */ VectorGraphicViewAdapter f$0;
    public final /* synthetic */ APLVectorGraphicView f$1;
    public final /* synthetic */ VectorGraphic f$2;

    public /* synthetic */ VectorGraphicViewAdapter$$ExternalSyntheticLambda2(VectorGraphic vectorGraphic, VectorGraphicViewAdapter vectorGraphicViewAdapter, APLVectorGraphicView aPLVectorGraphicView) {
        this.f$0 = vectorGraphicViewAdapter;
        this.f$1 = aPLVectorGraphicView;
        this.f$2 = vectorGraphic;
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever.FailureCallbackV2
    public void onFailure(Object obj, String str, int i) {
        this.f$0.lambda$applySource$3(this.f$1, this.f$2, (Uri) obj, str, i);
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever.SuccessCallback
    public void onSuccess(Object obj, Object obj2) {
        this.f$0.lambda$applySource$1(this.f$1, this.f$2, (Uri) obj, (String) obj2);
    }
}
