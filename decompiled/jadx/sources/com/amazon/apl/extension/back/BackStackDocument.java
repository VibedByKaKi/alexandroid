package com.amazon.apl.extension.back;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.apl.android.DocumentState;
import com.amazon.apl.viewhost.internal.SavedDocument;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BackStackDocument {
    private static final String TAG = "BackStackDocument";

    @NonNull
    private final Map<String, Object> mDocumentExtras = new HashMap(8);

    @NonNull
    private final String mDocumentId;
    private DocumentState mDocumentState;
    private SavedDocument mSavedDocument;

    public BackStackDocument(@NonNull String str, @NonNull DocumentState documentState) {
        this.mDocumentId = str;
        this.mDocumentState = documentState;
    }

    public void finish() {
        DocumentState documentState = this.mDocumentState;
        if (documentState == null) {
            this.mSavedDocument.finish();
        } else {
            documentState.finish();
        }
    }

    @NonNull
    public String getDocumentId() {
        return this.mDocumentId;
    }

    public DocumentState getDocumentState() {
        return this.mDocumentState;
    }

    @NonNull
    public <T> T getExtra(@NonNull String str, @NonNull T t) {
        try {
            T t2 = (T) this.mDocumentExtras.get(str);
            Objects.requireNonNull(t2);
            return t2;
        } catch (ClassCastException e) {
            Log.w(TAG, "Type mismatch for key: " + str, e);
            return t;
        } catch (NullPointerException unused) {
            a$$ExternalSyntheticOutline0.m3m("Key not found: ", str, TAG);
            return t;
        }
    }

    public SavedDocument getSavedDocument() {
        return this.mSavedDocument;
    }

    public boolean hasExtra(@NonNull String str) {
        return this.mDocumentExtras.containsKey(str);
    }

    public <T> BackStackDocument putExtra(@NonNull String str, @NonNull T t) {
        this.mDocumentExtras.put(str, t);
        return this;
    }

    public BackStackDocument(@NonNull String str, @NonNull SavedDocument savedDocument) {
        this.mDocumentId = str;
        this.mSavedDocument = savedDocument;
    }
}
