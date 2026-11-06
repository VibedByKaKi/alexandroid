package com.amazon.alexa.accessory.persistence;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface DatabaseScheme {
    int getVersion();

    void onCreate(SQLiteDatabase sQLiteDatabase);

    void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2);

    void onOpen(SQLiteDatabase sQLiteDatabase);

    void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2);
}
