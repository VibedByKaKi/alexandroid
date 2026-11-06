package com.amazon.alexa.voiceui.ra;

import android.util.Log;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.voiceui.ra.Hint;
import com.amazon.alexa.voiceui.util.CardUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class HintsProvider {
    public List<Hint> provideHints(String str) throws JSONException, NotARemarkableAlexaCardResponse {
        JSONObject jSONObject = new JSONObject(str);
        if (!jSONObject.optString(Content.CARD_TYPE, "").equals(CardUtils.REMARKABLE_ALEXA_RESPONSE)) {
            Log.w("HintsProvider", " Not a remarkable alexa response");
            throw new NotARemarkableAlexaCardResponse("Not a remarkable alexa card type");
        }
        if (!jSONObject.has("hints")) {
            Log.w("HintsProvider", " No hints");
            return Collections.EMPTY_LIST;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("hints");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("text");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("action");
            String string2 = jSONObject3.getString("payload");
            String string3 = jSONObject3.getString("type");
            if (Hint.ActionType.SEND_TEXT.equals(Hint.ActionType.fromString(string3))) {
                arrayList.add(new Hint(string, string2, Hint.ActionType.fromString(string3)));
            }
        }
        return arrayList;
    }
}
