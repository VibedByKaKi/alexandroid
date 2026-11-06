package com.amazon.alexa.accessory.vision;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class SessionCorrelationIdProvider {
    private final Map<String, Map<Long, String>> correlationIdMap = new HashMap();
    private final Object lock = new Object();

    public String getOrCreateCorrelationId(String str, long j) {
        String str2;
        Preconditions.notNull(str, LiveTranslationCapabilityConstants.KEY_SESSION_ID);
        synchronized (this.lock) {
            try {
                Map<Long, String> map = this.correlationIdMap.get(str);
                if (map == null) {
                    map = new HashMap<>();
                    this.correlationIdMap.put(str, map);
                }
                str2 = map.get(Long.valueOf(j));
                if (str2 == null) {
                    str2 = UUID.randomUUID().toString();
                    map.put(Long.valueOf(j), str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public void removeSession(String str) {
        Preconditions.notNull(str, LiveTranslationCapabilityConstants.KEY_SESSION_ID);
        synchronized (this.lock) {
            this.correlationIdMap.remove(str);
        }
    }
}
