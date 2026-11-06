package com.amazon.coral.model;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TraitPropertyDescriptor {
    private final String attributeName;
    private final boolean emitIfNull;
    private final String name;
    private final Method propertyGetter;

    public TraitPropertyDescriptor(String str, String str2, boolean z, Method method) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("name cannot be null");
            throw null;
        }
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("attributeName cannot be null");
            throw null;
        }
        if (method == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("propertyGetter cannot be null");
            throw null;
        }
        this.name = str;
        this.attributeName = str2;
        this.emitIfNull = z;
        this.propertyGetter = method;
    }

    public boolean emitIfNull() {
        return this.emitIfNull;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getName() {
        return this.name;
    }

    public Class<?> getPropertyType() {
        return this.propertyGetter.getReturnType();
    }

    public Object getValueFrom(Traits traits) {
        try {
            return this.propertyGetter.invoke(traits, null);
        } catch (IllegalAccessException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (InvocationTargetException e2) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        }
    }
}
