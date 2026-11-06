package com.amazon.minerva.identifiers.schemaid.attribute.attributes;

import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class VersionedAttributes {
    protected final Map<IAttributeEnum, Boolean> booleanMap = new HashMap();
    protected final Map<IAttributeEnum, Integer> integerMap = new HashMap();

    public Boolean getBooleanValue(IAttributeEnum iAttributeEnum) {
        if (this.booleanMap.containsKey(iAttributeEnum)) {
            return this.booleanMap.get(iAttributeEnum);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Unexpected value: ".concat(String.valueOf(iAttributeEnum)));
        return null;
    }

    public Integer getIntegerValue(IAttributeEnum iAttributeEnum) {
        if (this.integerMap.containsKey(iAttributeEnum)) {
            return this.integerMap.get(iAttributeEnum);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Unexpected value: ".concat(String.valueOf(iAttributeEnum)));
        return null;
    }

    public void setBooleanValue(IAttributeEnum iAttributeEnum, Boolean bool) throws IllegalStateException {
        this.booleanMap.put(iAttributeEnum, bool);
    }

    public void setIntegerValue(IAttributeEnum iAttributeEnum, Integer num) throws IllegalStateException {
        this.integerMap.put(iAttributeEnum, num);
    }
}
