package com.amazon.alexa.matter.commissioner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes14.dex */
public class InMemoryCommissioningSessionStore implements CommissioningSessionStore {
    private static final int MAX_CAPACITY = 2;
    private final Map<String, CommissioningSession> mIdToSessionMap = new LinkedHashMap<String, CommissioningSession>() { // from class: com.amazon.alexa.matter.commissioner.InMemoryCommissioningSessionStore.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, CommissioningSession> entry) {
            if (size() <= 2) {
                return false;
            }
            CommissioningSession value = entry.getValue();
            if (value == null) {
                return true;
            }
            value.close();
            return true;
        }
    };

    @Inject
    public InMemoryCommissioningSessionStore() {
    }

    @Override // com.amazon.alexa.matter.commissioner.CommissioningSessionStore
    @Nullable
    public CommissioningSession get(@NonNull String str) {
        return this.mIdToSessionMap.get(str);
    }

    @Override // com.amazon.alexa.matter.commissioner.CommissioningSessionStore
    public void put(@NonNull CommissioningSession commissioningSession) {
        this.mIdToSessionMap.put(commissioningSession.getID(), commissioningSession);
    }

    @Override // com.amazon.alexa.matter.commissioner.CommissioningSessionStore
    public void remove(@NonNull String str) {
        this.mIdToSessionMap.remove(str);
    }
}
