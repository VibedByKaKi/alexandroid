package com.amazon.alexa.protocols.datastore;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface DataStoreService {
    public static final String COLUMN_NAME_KEY = "key";
    public static final String COLUMN_NAME_VALUE = "value";
    public static final String TABLE_NAME = "DataItem";

    void clear();

    String retrieveValue(String str);

    void storeValue(String str, String str2);
}
