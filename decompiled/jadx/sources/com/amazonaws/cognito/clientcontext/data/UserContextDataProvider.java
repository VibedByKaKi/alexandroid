package com.amazonaws.cognito.clientcontext.data;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazonaws.cognito.clientcontext.datacollection.ContextDataAggregator;
import com.amazonaws.cognito.clientcontext.util.SignatureGenerator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UserContextDataProvider {
    private static final String TAG = "UserContextDataProvider";
    public static final String VERSION = "ANDROID20171114";
    private ContextDataAggregator aggregator;
    private SignatureGenerator signatureGenerator;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ContextDataJsonKeys {
        private static final String CONTEXT_DATA = "contextData";
        private static final String DATA_PAYLOAD = "payload";
        private static final String SIGNATURE = "signature";
        private static final String TIMESTAMP_MILLI_SEC = "timestamp";
        private static final String USERNAME = "username";
        private static final String USER_POOL_ID = "userPoolId";
        private static final String VERSION = "version";

        private ContextDataJsonKeys() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InstanceHolder {
        private static final UserContextDataProvider INSTANCE = new UserContextDataProvider();

        private InstanceHolder() {
        }
    }

    private UserContextDataProvider() {
        this(ContextDataAggregator.getInstance(), new SignatureGenerator());
    }

    public static UserContextDataProvider getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private JSONObject getJsonPayload(Map<String, String> map, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("contextData", new JSONObject((Map<?, ?>) map));
        jSONObject.put(HintConstants.AUTOFILL_HINT_USERNAME, str);
        jSONObject.put("userPoolId", str2);
        jSONObject.put("timestamp", getTimestamp());
        return jSONObject;
    }

    private JSONObject getJsonResponse(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("payload", str);
        jSONObject.put(PayloadUtils.PayloadKeys.SIGNATURE, str2);
        jSONObject.put("version", VERSION);
        return jSONObject;
    }

    public String getEncodedContextData(Context context, String str, String str2, String str3) {
        new JSONObject();
        try {
            String jSONObject = getJsonPayload(this.aggregator.getAggregatedData(context), str, str2).toString();
            return getEncodedResponse(getJsonResponse(jSONObject, this.signatureGenerator.getSignature(jSONObject, str3, VERSION)));
        } catch (Exception unused) {
            Log.e(TAG, "Exception in creating JSON from context data");
            return null;
        }
    }

    public String getEncodedResponse(JSONObject jSONObject) {
        return Base64.encodeToString(jSONObject.toString().getBytes(ConfigurationConstant.DEFAULT_CHARSET), 0);
    }

    public String getTimestamp() {
        return String.valueOf(System.currentTimeMillis());
    }

    public UserContextDataProvider(ContextDataAggregator contextDataAggregator, SignatureGenerator signatureGenerator) {
        this.aggregator = contextDataAggregator;
        this.signatureGenerator = signatureGenerator;
    }
}
