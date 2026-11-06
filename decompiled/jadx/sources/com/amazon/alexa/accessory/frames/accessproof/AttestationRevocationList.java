package com.amazon.alexa.accessory.frames.accessproof;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.utils.Log;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AttestationRevocationList {
    public static final AttestationRevocationList EMPTY = new AttestationRevocationList(Collections.EMPTY_MAP);
    private static final String ENTRIES = "entries";
    private static final String STATUS = "status";

    @VisibleForTesting
    static final String STATUS_URL = "https://android.googleapis.com/attestation/status";
    private final Map<String, String> statusBySerial;

    private AttestationRevocationList(Map<String, String> map) {
        this.statusBySerial = Collections.unmodifiableMap(new HashMap(map));
    }

    private static String canonicalSerial(String str) {
        try {
            return new BigInteger(str, 16).toString(16);
        } catch (NumberFormatException unused) {
            return str.toLowerCase(Locale.ROOT);
        }
    }

    public static AttestationRevocationList parse(String str) {
        AttestationRevocationList parseOrNull = parseOrNull(str);
        return parseOrNull == null ? EMPTY : parseOrNull;
    }

    public static AttestationRevocationList parseOrNull(String str) {
        if (str != null && !str.trim().isEmpty()) {
            try {
                JsonElement parseString = JsonParser.parseString(str);
                if (parseString.isJsonObject() && parseString.getAsJsonObject().has(ENTRIES)) {
                    JsonObject asJsonObject = parseString.getAsJsonObject().getAsJsonObject(ENTRIES);
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                        if (!entry.getValue().isJsonObject()) {
                            throw new IllegalStateException("entry " + entry.getKey() + " is not an object");
                        }
                        JsonObject asJsonObject2 = entry.getValue().getAsJsonObject();
                        if (!asJsonObject2.has("status")) {
                            throw new IllegalStateException("entry " + entry.getKey() + " has no status");
                        }
                        hashMap.put(canonicalSerial(entry.getKey()), asJsonObject2.get("status").getAsString().toUpperCase(Locale.ROOT));
                    }
                    return new AttestationRevocationList(hashMap);
                }
                Log.w("AttestationRevocationList", "status list has no '%s' object", ENTRIES);
                return null;
            } catch (RuntimeException e) {
                Log.e("AttestationRevocationList", "malformed status list (%s)", e.getMessage());
            }
        }
        return null;
    }

    public boolean isRevoked(BigInteger bigInteger) {
        return (bigInteger == null || bigInteger.signum() <= 0 || this.statusBySerial.get(bigInteger.toString(16).toLowerCase(Locale.ROOT)) == null) ? false : true;
    }

    public int size() {
        return this.statusBySerial.size();
    }

    public String statusOf(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() <= 0) {
            return null;
        }
        return this.statusBySerial.get(bigInteger.toString(16).toLowerCase(Locale.ROOT));
    }

    public String toString() {
        return "AttestationRevocationList{" + this.statusBySerial.size() + " entries}";
    }
}
