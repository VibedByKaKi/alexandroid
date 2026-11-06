package com.amazon.alexa.mosaic.components.apl.models;

import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class VisualContextEvent implements IVisualContextEvent {
    private final String mPresentationToken;
    private final String mPresentationUri;
    private final JSONObject mVisualContext;

    public VisualContextEvent(String str, String str2, JSONObject jSONObject) {
        this.mPresentationUri = str;
        this.mPresentationToken = str2;
        this.mVisualContext = jSONObject;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.models.IVisualContextEvent
    public String getPresentationToken() {
        return this.mPresentationToken;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.models.IVisualContextEvent
    public String getPresentationUri() {
        return this.mPresentationUri;
    }

    @Override // com.amazon.alexa.mosaic.components.apl.models.IVisualContextEvent
    public JSONObject getVisualContext() {
        return this.mVisualContext;
    }
}
