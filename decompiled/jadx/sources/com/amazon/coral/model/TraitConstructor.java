package com.amazon.coral.model;

import com.amazon.coral.model.Model;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class TraitConstructor {
    private final Constructor<? extends Traits> constructorMethod;
    private final List<String> paramList;
    private final Map<String, Class<?>> propertyParamTypes;
    private final Class<? extends Traits> type;
    private final Collection<Set<String>> validPropertySets;

    public TraitConstructor(Class<? extends Traits> cls, Constructor<? extends Traits> constructor, List<String> list, Map<String, Class<?>> map, Collection<Set<String>> collection) {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("type cannot be null");
            throw null;
        }
        if (constructor == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("constructorMethod cannot be null");
            throw null;
        }
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("paramList cannot be null");
            throw null;
        }
        if (map == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("propertyParamsTemplate cannot be null");
            throw null;
        }
        if (collection == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("validPropertySets cannot be null");
            throw null;
        }
        this.type = cls;
        this.constructorMethod = constructor;
        this.paramList = list;
        this.propertyParamTypes = map;
        this.validPropertySets = collection;
    }

    private void addParam(List<Object> list, Class<?> cls, String str) {
        Class cls2 = Boolean.TYPE;
        if (str == null) {
            if (!cls.isPrimitive()) {
                list.add(null);
                return;
            }
            str = cls.equals(cls2) ? "false" : com.amazon.alexa.ra.core.data.model.Constants.FEEDBACK_TYPE_DISLIKE;
        }
        if (cls.equals(Integer.TYPE) || cls.equals(Integer.class)) {
            list.add(Integer.valueOf(str));
            return;
        }
        if (cls.equals(Short.TYPE) || cls.equals(Short.class)) {
            list.add(Short.valueOf(str));
            return;
        }
        if (cls.equals(Long.TYPE) || cls.equals(Long.class)) {
            list.add(Long.valueOf(str));
            return;
        }
        if (cls.equals(Float.TYPE) || cls.equals(Float.class)) {
            list.add(Float.valueOf(str));
            return;
        }
        if (cls.equals(Double.TYPE) || cls.equals(Double.class)) {
            list.add(Double.valueOf(str));
            return;
        }
        if (cls.equals(cls2) || cls.equals(Boolean.class)) {
            list.add(Boolean.valueOf(str));
        } else {
            if (!cls.equals(String.class)) {
                throw new ModelIndexFactoryException("unknown type");
            }
            list.add(str);
        }
    }

    public Traits newInstance(Model.Id id, String str, String str2, Map<String, String> map) {
        if (!this.validPropertySets.contains(map.keySet())) {
            TraitConstructor$$ExternalSyntheticBUOutline0.m("Invalid combination of properties for trait '", this.type.getCanonicalName(), "'  @", str2);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.type);
        arrayList.add(id);
        arrayList.add(str);
        arrayList.add(str2);
        for (String str3 : this.paramList) {
            Class<?> cls = this.propertyParamTypes.get(str3);
            if (cls == null) {
                throw new ModelIndexFactoryException(a$$ExternalSyntheticOutline0.m("Unable to determine type for property '", str3, "'"));
            }
            addParam(arrayList, cls, map.get(str3));
        }
        try {
            return this.constructorMethod.newInstance(arrayList.toArray());
        } catch (IllegalAccessException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        } catch (InstantiationException e2) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e2);
            return null;
        } catch (InvocationTargetException e3) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e3);
            return null;
        }
    }
}
