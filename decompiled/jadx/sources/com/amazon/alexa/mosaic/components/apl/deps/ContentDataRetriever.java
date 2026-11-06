package com.amazon.alexa.mosaic.components.apl.deps;

import androidx.annotation.NonNull;
import com.amazon.apl.android.dependencies.IContentDataRetriever;
import com.amazon.apl.android.dependencies.IContentRetriever;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ContentDataRetriever implements IContentDataRetriever {
    public static final String DATA_SOURCES = "datasources";
    private static final String TAG = "ContentDataRetriever";
    private final JSONObject dataSources;

    public ContentDataRetriever(@NonNull JSONObject jSONObject) {
        this.dataSources = jSONObject.has("datasources") ? jSONObject.optJSONObject("datasources") : new JSONObject();
    }

    @Override // com.amazon.apl.android.dependencies.IContentRetriever
    public void fetch(@NonNull String str, @NonNull IContentRetriever.SuccessCallback<String, String> successCallback, @NonNull IContentRetriever.FailureCallback<String> failureCallback) {
        boolean has = this.dataSources.has(str);
        JSONObject jSONObject = this.dataSources;
        successCallback.onSuccess(str, has ? jSONObject.optString(str) : jSONObject.toString());
    }
}
