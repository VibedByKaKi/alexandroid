package com.amazon.alexa.mosaic.apl.dependencies;

import androidx.annotation.NonNull;
import com.amazon.alexa.mosaic.apl.actions.RenderDocumentAction;
import com.amazon.apl.android.dependencies.IContentDataRetriever;
import com.amazon.apl.android.dependencies.IContentRetriever;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ContentDataRetriever implements IContentDataRetriever {
    private final RenderDocumentAction mDocument;

    public ContentDataRetriever(RenderDocumentAction renderDocumentAction) {
        this.mDocument = renderDocumentAction;
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public void fetch(@NonNull String str, @NonNull IContentRetriever.SuccessCallback<String, String> successCallback, @NonNull IContentRetriever.FailureCallback<String> failureCallback) {
        boolean has = this.mDocument.data().has(str);
        RenderDocumentAction renderDocumentAction = this.mDocument;
        successCallback.onSuccess(str, has ? renderDocumentAction.data().optString(str) : renderDocumentAction.data().toString());
    }
}
