package com.dee.app.contacts.common.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GenericType<T> {
    private final Class<T> type;

    public GenericType(Class<T> cls) {
        this.type = cls;
    }

    public Class<T> getType() {
        return this.type;
    }
}
