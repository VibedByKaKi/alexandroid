package com.amazon.alexa.apl.aploptions;

import android.util.Log;
import com.amazon.apl.android.dependencies.IContentDataRetriever;
import com.amazon.apl.android.dependencies.IContentRetriever;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/apl/aploptions/ContentDataRetriever;", "Lcom/amazon/apl/android/dependencies/IContentDataRetriever;", "currentDocument", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", MetricsConstants.Id.HTTP_CLIENT_FETCH, "", "source", "", "successCallback", "Lcom/amazon/apl/android/dependencies/IContentRetriever$SuccessCallback;", "failureCallback", "Lcom/amazon/apl/android/dependencies/IContentRetriever$FailureCallback;", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ContentDataRetriever implements IContentDataRetriever {
    private static final String TAG = "ContentDataRetriever";

    @NotNull
    private final JSONObject currentDocument;

    public ContentDataRetriever(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        this.currentDocument = jSONObject;
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public void fetch(@NotNull String source, @NotNull IContentRetriever.SuccessCallback<String, String> successCallback, @NotNull IContentRetriever.FailureCallback<String> failureCallback) {
        JSONObject jSONObject;
        String jSONObject2;
        source.getClass();
        successCallback.getClass();
        failureCallback.getClass();
        try {
            jSONObject = this.currentDocument.getJSONObject("datasources");
            jSONObject.getClass();
        } catch (JSONException unused) {
            Log.e(TAG, "JSONException");
            jSONObject = new JSONObject();
        }
        if (jSONObject.has(source)) {
            jSONObject2 = jSONObject.optString(source);
            jSONObject2.getClass();
        } else {
            jSONObject2 = jSONObject.toString();
            jSONObject2.getClass();
        }
        successCallback.onSuccess(source, jSONObject2);
    }
}
