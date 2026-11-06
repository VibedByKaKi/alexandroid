package com.amazonaws.mobileconnectors.remoteconfiguration.internal;

import com.amazonaws.mobileconnectors.remoteconfiguration.Configuration;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ConfigurationImpl implements Configuration {
    private final String json;
    private final Date timestamp;

    public ConfigurationImpl(String str, Date date) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("The JSON may not be null.");
            throw null;
        }
        this.json = str;
        this.timestamp = date;
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Configuration
    public JSONObject getAsJsonObject() {
        try {
            return new JSONObject(this.json);
        } catch (JSONException e) {
            Single$$ExternalSyntheticBUOutline0.m$1("The configuration is invalid.", e);
            return null;
        }
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Configuration
    public String getAsJsonString() {
        return this.json;
    }

    @Override // com.amazonaws.mobileconnectors.remoteconfiguration.Configuration
    public Date getTimestamp() {
        return this.timestamp;
    }

    public ConfigurationImpl(String str) {
        this(str, null);
    }
}
