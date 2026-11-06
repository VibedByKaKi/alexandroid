package com.amazon.apl.viewhost.internal.message.action;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.apl.viewhost.DocumentHandle;
import com.amazon.apl.viewhost.message.action.ActionMessage;
import com.amazon.apl.viewhost.primitives.Decodable;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ActionMessageImpl extends ActionMessage {
    private static final String TAG = "ActionMessageImpl";

    @NonNull
    private final DocumentHandle mDocument;
    private final int mId;

    @NonNull
    private final Decodable mPayload;
    private final String mType;
    private final WeakReference<ResponseListener> mWeakListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResponseListener {
        void onFailure(String str);

        void onSuccess(Decodable decodable);
    }

    public ActionMessageImpl(int i, DocumentHandle documentHandle, String str, Decodable decodable, ResponseListener responseListener) {
        this.mId = i;
        this.mDocument = documentHandle;
        this.mType = str;
        this.mPayload = decodable;
        this.mWeakListener = new WeakReference<>(responseListener);
    }

    @Override // com.amazon.apl.viewhost.message.action.ActionMessage
    public boolean fail(String str) {
        ResponseListener responseListener = this.mWeakListener.get();
        if (responseListener == null) {
            Log.w(TAG, "Ignoring failure for " + this.mType + " message, consumer has gone away.");
            return false;
        }
        responseListener.onFailure(str);
        return true;
    }

    @Override // com.amazon.apl.viewhost.message.BaseMessage
    public DocumentHandle getDocument() {
        return this.mDocument;
    }

    @Override // com.amazon.apl.viewhost.message.BaseMessage
    public int getId() {
        return this.mId;
    }

    @Override // com.amazon.apl.viewhost.message.GenericMessage
    public Decodable getPayload() {
        return this.mPayload;
    }

    @Override // com.amazon.apl.viewhost.message.GenericMessage
    public String getType() {
        return this.mType;
    }

    @Override // com.amazon.apl.viewhost.message.action.ActionMessage
    public boolean succeed(Decodable decodable) {
        ResponseListener responseListener = this.mWeakListener.get();
        if (responseListener == null) {
            Log.w(TAG, "Ignoring success for " + this.mType + " message, consumer has gone away.");
            return false;
        }
        responseListener.onSuccess(decodable);
        return true;
    }

    public ActionMessageImpl(final int i, DocumentHandle documentHandle, final String str, Decodable decodable) {
        this(i, documentHandle, str, decodable, new ResponseListener() { // from class: com.amazon.apl.viewhost.internal.message.action.ActionMessageImpl.1
            @Override // com.amazon.apl.viewhost.internal.message.action.ActionMessageImpl.ResponseListener
            public void onFailure(String str2) {
                Log.w(ActionMessageImpl.TAG, String.format("%s message (id=%d) failed. Reason given was: %s", str, Integer.valueOf(i), str2));
            }

            @Override // com.amazon.apl.viewhost.internal.message.action.ActionMessageImpl.ResponseListener
            public void onSuccess(Decodable decodable2) {
                Log.i(ActionMessageImpl.TAG, String.format("%s message (id=%d) succeeded.", str, Integer.valueOf(i)));
            }
        });
    }

    @Override // com.amazon.apl.viewhost.message.action.ActionMessage
    public boolean succeed() {
        return succeed(null);
    }
}
