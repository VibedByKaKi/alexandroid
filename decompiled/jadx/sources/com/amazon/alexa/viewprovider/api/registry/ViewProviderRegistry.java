package com.amazon.alexa.viewprovider.api.registry;

import com.amazon.alexa.viewprovider.api.event.EventCapture;
import com.amazon.alexa.viewprovider.api.view.ViewModule;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface ViewProviderRegistry {
    ViewModule createViewModule(JSONObject jSONObject, EventCapture eventCapture);
}
