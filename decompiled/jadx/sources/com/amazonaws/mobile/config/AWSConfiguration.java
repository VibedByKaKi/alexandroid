package com.amazonaws.mobile.config;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.content.Context;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class AWSConfiguration {
    private static final String DEFAULT = "Default";
    private static final String DEFAULT_IDENTIFIER = "awsconfiguration";
    private String configName;
    private JSONObject mJSONObject;

    public AWSConfiguration(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("JSONObject cannot be null.");
            throw null;
        }
        this.configName = str;
        this.mJSONObject = jSONObject;
    }

    private static int getConfigResourceId(Context context) {
        try {
            return context.getResources().getIdentifier(DEFAULT_IDENTIFIER, "raw", context.getPackageName());
        } catch (Exception e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to read awsconfiguration.json please check that it is correctly formed.", e);
            return 0;
        }
    }

    private void readInputJson(Context context, int i) {
        try {
            Scanner scanner = new Scanner(context.getResources().openRawResource(i));
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine());
            }
            scanner.close();
            this.mJSONObject = new JSONObject(sb.toString());
        } catch (Exception e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to read awsconfiguration.json please check that it is correctly formed.", e);
        }
    }

    public String getConfiguration() {
        return this.configName;
    }

    public String getUserAgent() {
        try {
            return this.mJSONObject.getString("UserAgent");
        } catch (JSONException unused) {
            return "";
        }
    }

    public String getUserAgentOverride() {
        try {
            return this.mJSONObject.getString("UserAgentOverride");
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject optJsonObject(String str) {
        try {
            JSONObject jSONObject = this.mJSONObject.getJSONObject(str);
            if (jSONObject.has(this.configName)) {
                jSONObject = jSONObject.getJSONObject(this.configName);
            }
            return new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
            return null;
        }
    }

    public void setConfiguration(String str) {
        this.configName = str;
    }

    public String toString() {
        return this.mJSONObject.toString();
    }

    public AWSConfiguration(JSONObject jSONObject) {
        this(jSONObject, "Default");
    }

    public AWSConfiguration(Context context) {
        this(context, getConfigResourceId(context));
    }

    public AWSConfiguration(Context context, int i) {
        this(context, i, "Default");
    }

    public AWSConfiguration(Context context, int i, String str) {
        this.configName = str;
        readInputJson(context, i);
    }
}
