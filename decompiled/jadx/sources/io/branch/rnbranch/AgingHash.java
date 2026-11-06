package io.branch.rnbranch;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class AgingHash<KeyType, ValueType> {
    private HashMap<KeyType, AgingItem<ValueType>> mHash = new HashMap<>();
    private long mTtlMillis;

    public AgingHash(long j) {
        this.mTtlMillis = j;
    }

    private void ageItems() {
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Map.Entry<KeyType, AgingItem<ValueType>>> it2 = this.mHash.entrySet().iterator();
        while (it2.hasNext()) {
            if (currentTimeMillis - it2.next().getValue().getAccessTime() >= this.mTtlMillis) {
                it2.remove();
            }
        }
    }

    public ValueType get(KeyType keytype) {
        AgingItem<ValueType> agingItem = this.mHash.get(keytype);
        if (agingItem == null) {
            return null;
        }
        return agingItem.get();
    }

    public long getTtlMillis() {
        return this.mTtlMillis;
    }

    public void put(KeyType keytype, ValueType valuetype) {
        ageItems();
        this.mHash.put(keytype, new AgingItem<>(valuetype));
    }

    public void remove(KeyType keytype) {
        this.mHash.remove(keytype);
    }
}
