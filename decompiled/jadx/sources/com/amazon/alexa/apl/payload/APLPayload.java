package com.amazon.alexa.apl.payload;

import android.util.Log;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/apl/payload/APLPayload;", "", "mPresentationToken", "", "(Ljava/lang/String;)V", "getMPresentationToken", "()Ljava/lang/String;", "toJson", "Lorg/json/JSONObject;", "toString", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class APLPayload {

    @NotNull
    public static final String FIELD_PRESENTATION_TOKEN = "presentationToken";

    @NotNull
    private static final String TAG = "APLPayload";

    @NotNull
    private final String mPresentationToken;

    public APLPayload(@NotNull String str) {
        str.getClass();
        this.mPresentationToken = str;
    }

    @NotNull
    public String getMPresentationToken() {
        return this.mPresentationToken;
    }

    @NotNull
    public JSONObject toJson() throws JSONException {
        JSONObject put = new JSONObject().put("presentationToken", getMPresentationToken());
        put.getClass();
        return put;
    }

    @NotNull
    public String toString() {
        try {
            String jSONObject = toJson().toString();
            jSONObject.getClass();
            return jSONObject;
        } catch (JSONException unused) {
            Log.e(TAG, "JSONException");
            return "";
        }
    }
}
