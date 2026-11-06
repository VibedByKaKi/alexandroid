package com.amazon.alexa.voice.ui.tta;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.tta.TtaResponseCard;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface ModelFactory<T extends TtaResponseCard> {
    T build(@NonNull JSONObject jSONObject) throws JSONException;
}
