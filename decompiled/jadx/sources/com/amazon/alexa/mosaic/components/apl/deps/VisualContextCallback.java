package com.amazon.alexa.mosaic.components.apl.deps;

import com.amazon.alexa.mosaic.components.apl.interfaces.IVisualContextEventListener;
import com.amazon.alexa.mosaic.components.apl.models.VisualContextEvent;
import com.amazon.apl.android.dependencies.IVisualContextListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class VisualContextCallback implements IVisualContextListener {
    private static final String TAG = "VisualContextCallback";
    private final String mPresentationToken;
    private final String mPresentationUri;
    private final IVisualContextEventListener mVisualContextCallback;

    public VisualContextCallback(String str, String str2, IVisualContextEventListener iVisualContextEventListener) {
        this.mPresentationUri = str;
        this.mPresentationToken = str2;
        this.mVisualContextCallback = iVisualContextEventListener;
    }

    @Override // com.amazon.apl.android.dependencies.IVisualContextListener
    public void onVisualContextUpdate(JSONObject jSONObject) {
        jSONObject.toString();
        this.mVisualContextCallback.onVisualContextEvent(new VisualContextEvent(this.mPresentationUri, this.mPresentationToken, jSONObject));
    }
}
