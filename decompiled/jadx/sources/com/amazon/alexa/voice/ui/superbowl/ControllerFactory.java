package com.amazon.alexa.voice.ui.superbowl;

import com.amazon.regulator.ViewController;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ControllerFactory<T extends ViewController> {
    T create(JSONObject jSONObject) throws JSONException;
}
