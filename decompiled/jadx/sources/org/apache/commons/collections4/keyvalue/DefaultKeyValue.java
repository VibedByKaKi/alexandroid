package org.apache.commons.collections4.keyvalue;

import java.util.Map;
import org.apache.commons.collections4.KeyValue;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class DefaultKeyValue<K, V> extends AbstractKeyValue<K, V> {
    public DefaultKeyValue(KeyValue<? extends K, ? extends V> keyValue) {
        super(keyValue.getKey(), keyValue.getValue());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DefaultKeyValue)) {
            return false;
        }
        DefaultKeyValue defaultKeyValue = (DefaultKeyValue) obj;
        if (getKey() != null ? getKey().equals(defaultKeyValue.getKey()) : defaultKeyValue.getKey() == null) {
            if (getValue() != null ? getValue().equals(defaultKeyValue.getValue()) : defaultKeyValue.getValue() == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (getKey() == null ? 0 : getKey().hashCode()) ^ (getValue() != null ? getValue().hashCode() : 0);
    }

    @Override // org.apache.commons.collections4.keyvalue.AbstractKeyValue
    public K setKey(K k) {
        if (k != this) {
            return (K) super.setKey(k);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("DefaultKeyValue may not contain itself as a key.");
        return null;
    }

    @Override // org.apache.commons.collections4.keyvalue.AbstractKeyValue, java.util.Map.Entry
    public V setValue(V v) {
        if (v != this) {
            return (V) super.setValue(v);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("DefaultKeyValue may not contain itself as a value.");
        return null;
    }

    public Map.Entry<K, V> toMapEntry() {
        return new DefaultMapEntry(this);
    }

    public DefaultKeyValue(K k, V v) {
        super(k, v);
    }

    public DefaultKeyValue() {
        super(null, null);
    }

    public DefaultKeyValue(Map.Entry<? extends K, ? extends V> entry) {
        super(entry.getKey(), entry.getValue());
    }
}
