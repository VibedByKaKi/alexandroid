package com.amazon.alexa.mosaic.apl.actions;

import com.amazon.alexa.mosaic.apl.actions.AutoValue_RenderDocumentAction;
import com.google.auto.value.AutoValue;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes18.dex */
public abstract class RenderDocumentAction {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract RenderDocumentAction build();

        public Builder data(String str) {
            try {
                return data(new JSONObject(str));
            } catch (JSONException unused) {
                Single$$ExternalSyntheticBUOutline0.m$3("Invalid JSON data");
                return null;
            }
        }

        public abstract Builder data(JSONObject jSONObject);

        public abstract Builder document(String str);
    }

    public static Builder builder() {
        return new AutoValue_RenderDocumentAction.Builder();
    }

    public abstract JSONObject data();

    public abstract String document();
}
