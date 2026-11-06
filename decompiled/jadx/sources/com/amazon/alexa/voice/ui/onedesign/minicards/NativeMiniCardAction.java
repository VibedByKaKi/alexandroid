package com.amazon.alexa.voice.ui.onedesign.minicards;

import com.amazon.alexa.voice.ui.onedesign.minicards.AutoValue_NativeMiniCardAction;
import com.amazon.alexa.voice.ui.onedesign.util.JSONUtils;
import com.google.auto.value.AutoValue;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class NativeMiniCardAction {
    private static final String PAYLOAD = "payload";
    private static final String TYPE = "type";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract NativeMiniCardAction build();

        public abstract Builder payload(String str);

        public abstract Builder type(NativeMiniCardActionType nativeMiniCardActionType);
    }

    public static NativeMiniCardAction from(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new AutoValue_NativeMiniCardAction.Builder().type(NativeMiniCardActionType.from(JSONUtils.optionalString(jSONObject, "type"))).payload(JSONUtils.optionalString(jSONObject, "payload")).build();
    }

    public abstract String getPayload();

    public abstract NativeMiniCardActionType getType();
}
