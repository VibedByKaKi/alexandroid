package com.amazon.alexa.featureservice.database.roomdb;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Migrations {
    static final Migration MIGRATION_1_2;
    static final Migration MIGRATION_2_3;

    static {
        int i = 2;
        MIGRATION_1_2 = new Migration(1, i) { // from class: com.amazon.alexa.featureservice.database.roomdb.Migrations.1
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("ALTER TABLE feature ADD COLUMN deprecated INTEGER NOT NULL DEFAULT 1");
            }
        };
        MIGRATION_2_3 = new Migration(i, 3) { // from class: com.amazon.alexa.featureservice.database.roomdb.Migrations.2
            @Override // androidx.room.migration.Migration
            public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExperimentTrigger (feature_name TEXT NOT NULL, namespace TEXT NOT NULL, allocation_id TEXT NOT NULL, treatment_used TEXT NOT NULL, time_used INTEGER NOT NULL, uploaded INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (feature_name, namespace))");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_ExperimentTrigger_uploaded ON ExperimentTrigger(uploaded)");
                supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_Feature_deprecated ON Feature(deprecated)");
            }
        };
    }

    private Migrations() {
    }
}
