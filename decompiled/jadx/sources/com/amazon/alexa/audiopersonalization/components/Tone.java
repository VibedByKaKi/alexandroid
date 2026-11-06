package com.amazon.alexa.audiopersonalization.components;

import com.amazon.alexa.audiopersonalization.constants.EventBusConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Tone {
    public final String channel;
    public final int duration;
    public final int fade;
    public final int frequency;
    public final String requestId;
    public final double volume;

    public Tone(String str, int i, double d, String str2, int i2, int i3) {
        this.requestId = str;
        this.frequency = i;
        this.volume = d > 0.0d ? d * (-1.0d) : d;
        this.channel = str2;
        this.duration = i2;
        this.fade = i3;
    }

    public static Tone fromJSONObject(JSONObject jSONObject) throws JSONException {
        return new Tone(jSONObject.getString("requestId"), jSONObject.getInt(EventBusConstants.FREQUENCY_KEY), jSONObject.getDouble(EventBusConstants.VOLUME_KEY), jSONObject.getString("channel"), jSONObject.getInt("duration"), jSONObject.getInt("fade"));
    }

    public boolean isLeftChannelOn() {
        return this.channel.equals("left") || this.channel.equals("both");
    }

    public boolean isRightChannelOn() {
        return this.channel.equals("right") || this.channel.equals("both");
    }
}
