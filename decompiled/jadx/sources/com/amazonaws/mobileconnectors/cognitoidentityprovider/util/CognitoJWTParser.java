package com.amazonaws.mobileconnectors.cognitoidentityprovider.util;

import android.util.Base64;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import com.amazonaws.util.Classes$$ExternalSyntheticBUOutline0;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CognitoJWTParser {
    private static final int HEADER = 0;
    private static final int JWT_PARTS = 3;
    private static final int PAYLOAD = 1;
    private static final int SIGNATURE = 2;

    public static String getClaim(String str, String str2) {
        try {
            Object obj = getPayload(str).get(str2);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Exception unused) {
            Classes$$ExternalSyntheticBUOutline0.m$2("invalid token");
            return null;
        }
    }

    public static JSONObject getHeader(String str) {
        try {
            validateJWT(str);
            return new JSONObject(new String(Base64.decode(str.split(ArcusConfig.PATH_SEPARATOR)[0], 8), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            Classes$$ExternalSyntheticBUOutline0.m$2(e.getMessage());
            return null;
        } catch (JSONException e2) {
            Classes$$ExternalSyntheticBUOutline0.m$2(e2.getMessage());
            return null;
        } catch (Exception unused) {
            Classes$$ExternalSyntheticBUOutline0.m$2("error in parsing JSON");
            return null;
        }
    }

    public static JSONObject getPayload(String str) {
        try {
            validateJWT(str);
            return new JSONObject(new String(Base64.decode(str.split(ArcusConfig.PATH_SEPARATOR)[1], 8), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            Classes$$ExternalSyntheticBUOutline0.m$2(e.getMessage());
            return null;
        } catch (JSONException e2) {
            Classes$$ExternalSyntheticBUOutline0.m$2(e2.getMessage());
            return null;
        } catch (Exception unused) {
            Classes$$ExternalSyntheticBUOutline0.m$2("error in parsing JSON");
            return null;
        }
    }

    public static String getSignature(String str) {
        try {
            validateJWT(str);
            return new String(Base64.decode(str.split(ArcusConfig.PATH_SEPARATOR)[2], 8), "UTF-8");
        } catch (Exception unused) {
            Classes$$ExternalSyntheticBUOutline0.m$2("error in parsing JSON");
            return null;
        }
    }

    public static boolean hasClaim(String str, String str2) {
        try {
            return getPayload(str).has(str2);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void validateJWT(String str) {
        if (str.split(ArcusConfig.PATH_SEPARATOR).length == 3) {
            return;
        }
        Classes$$ExternalSyntheticBUOutline0.m$2("not a JSON Web Token");
    }
}
