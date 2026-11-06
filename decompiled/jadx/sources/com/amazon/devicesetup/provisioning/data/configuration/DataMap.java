package com.amazon.devicesetup.provisioning.data.configuration;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DataMap {
    private final Map<String, DataMapValue> mDataMap = new HashMap();

    private DataMapValue getDataMapValue(String str) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("key can not be null");
            return null;
        }
        DataMapValue dataMapValue = this.mDataMap.get(str);
        if (dataMapValue != null) {
            return dataMapValue;
        }
        PathKt$$ExternalSyntheticBUOutline0.m("No DataMapValue for key ".concat(str));
        return null;
    }

    private void putDataMapValue(String str, DataMapValue dataMapValue) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("key can not be null");
            return;
        }
        if (dataMapValue == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("value can not be null");
        } else if (this.mDataMap.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m("Value already exists for key: ".concat(str));
        } else {
            this.mDataMap.put(str, dataMapValue);
        }
    }

    public boolean containsKey(String str) {
        if (str != null) {
            return this.mDataMap.containsKey(str);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("key can not be null");
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Map<String, DataMapValue> map = this.mDataMap;
            Map<String, DataMapValue> map2 = ((DataMap) obj).mDataMap;
            try {
                for (String str : map2.keySet()) {
                    if (!map.get(str).equals(map2.get(str))) {
                        return false;
                    }
                }
                Iterator<String> it2 = map.keySet().iterator();
                while (it2.hasNext()) {
                    if (!map2.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
            } catch (NullPointerException unused) {
            }
        }
        return false;
    }

    public Boolean getBooleanValue(String str) {
        return getDataMapValue(str).getBooleanValue();
    }

    public Integer getIntegerValue(String str) {
        DataMapValue dataMapValue = getDataMapValue(str);
        if (dataMapValue.getIntegerValue() != null) {
            return dataMapValue.getIntegerValue();
        }
        PathKt$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("No integer value found for key: ", str));
        return null;
    }

    public Map<String, DataMapValue> getMap() {
        return Collections.unmodifiableMap(this.mDataMap);
    }

    public int getSize() {
        return this.mDataMap.size();
    }

    public String getStringValue(String str) {
        return getDataMapValue(str).getStringValue();
    }

    public byte[] getValue(String str) {
        return getDataMapValue(str).getBytesValue();
    }

    public int hashCode() {
        return Objects.hashCode(this.mDataMap);
    }

    public boolean isEmpty() {
        return this.mDataMap.isEmpty();
    }

    public void putAllValues(DataMap dataMap) {
        for (Map.Entry<String, DataMapValue> entry : dataMap.getMap().entrySet()) {
            putDataMapValue(entry.getKey(), entry.getValue());
        }
    }

    public void putBooleanValue(String str, Boolean bool) {
        putDataMapValue(str, new DataMapValue(bool));
    }

    public void putIntegerValue(String str, Integer num) {
        putDataMapValue(str, new DataMapValue(num));
    }

    public void putStringValue(String str, String str2) {
        putDataMapValue(str, new DataMapValue(str2));
    }

    public void putValue(String str, byte[] bArr) {
        putDataMapValue(str, new DataMapValue(bArr));
    }

    public void removeValue(String str) {
        if (str != null) {
            this.mDataMap.remove(str);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("key can not be null");
        }
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mDataMap", this.mDataMap).toString();
    }
}
