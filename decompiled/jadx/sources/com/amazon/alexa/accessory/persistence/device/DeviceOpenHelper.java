package com.amazon.alexa.accessory.persistence.device;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.amazon.alexa.accessory.persistence.DatabaseScheme;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DeviceOpenHelper extends SQLiteOpenHelper {
    private final DatabaseScheme scheme;

    public DeviceOpenHelper(Context context, DatabaseScheme databaseScheme) {
        super(context, "device", (SQLiteDatabase.CursorFactory) null, databaseScheme.getVersion());
        this.scheme = databaseScheme;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.scheme.onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.scheme.onUpgrade(sQLiteDatabase, i, i2);
    }
}
