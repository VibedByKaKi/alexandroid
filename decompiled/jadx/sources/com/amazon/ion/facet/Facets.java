package com.amazon.ion.facet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Facets {
    public static <T> T asFacet(Class<T> cls, Object obj) {
        if (obj instanceof Faceted) {
            return (T) ((Faceted) obj).asFacet(cls);
        }
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public static <T> T assumeFacet(Class<T> cls, Object obj) {
        if (obj instanceof Faceted) {
            T t = (T) ((Faceted) obj).asFacet(cls);
            if (t != null) {
                return t;
            }
        } else if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        throw new UnsupportedFacetException(cls, obj);
    }

    public static <T> T asFacet(Class<T> cls, Faceted faceted) {
        if (faceted == null) {
            return null;
        }
        return (T) faceted.asFacet(cls);
    }

    public static <T> T assumeFacet(Class<T> cls, Faceted faceted) {
        T t;
        if (faceted == null || (t = (T) faceted.asFacet(cls)) == null) {
            throw new UnsupportedFacetException(cls, faceted);
        }
        return t;
    }
}
