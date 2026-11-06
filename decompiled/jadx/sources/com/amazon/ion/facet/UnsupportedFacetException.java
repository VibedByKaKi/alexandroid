package com.amazon.ion.facet;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class UnsupportedFacetException extends UnsupportedOperationException {
    private static final long serialVersionUID = 1;
    private Class<?> myFacetType;
    private Object mySubject;

    public UnsupportedFacetException(Class<?> cls, Object obj) {
        this.myFacetType = cls;
        this.mySubject = obj;
    }

    public Class<?> getFacetType() {
        return this.myFacetType;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder("Facet ");
        ParcelCompat$$ExternalSyntheticOutline0.m7655m((Class) this.myFacetType, sb, " is not supported by ");
        sb.append(this.mySubject);
        return sb.toString();
    }

    public Object getSubject() {
        return this.mySubject;
    }
}
