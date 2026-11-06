package com.amazon.apl.viewhost.config;

import com.amazon.apl.android.RootConfig;
import com.amazon.apl.viewhost.DocumentHandle;
import com.amazon.apl.viewhost.PreparedDocument;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface EmbeddedDocumentFactory {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface EmbeddedDocumentRequest {
        void fail(String str);

        DocumentHandle getRequestingDocument();

        RootConfig getRootConfig();

        String getSource();

        @Deprecated
        void resolve(PreparedDocument preparedDocument);

        void resolve(EmbeddedDocumentResponse embeddedDocumentResponse);
    }

    void onDocumentRequested(EmbeddedDocumentRequest embeddedDocumentRequest);
}
