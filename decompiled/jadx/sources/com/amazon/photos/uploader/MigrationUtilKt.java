package com.amazon.photos.uploader;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "MIGRATION_2_3", "getMIGRATION_2_3", "MIGRATION_3_4", "getMIGRATION_3_4", "AndroidPhotosUploader_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MigrationUtilKt {

    @NotNull
    private static final Migration MIGRATION_1_2 = new Migration() { // from class: com.amazon.photos.uploader.MigrationUtilKt$MIGRATION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.getClass();
            database.execSQL("ALTER TABLE upload_request ADD COLUMN parent_id TEXT");
        }
    };

    @NotNull
    private static final Migration MIGRATION_2_3 = new Migration() { // from class: com.amazon.photos.uploader.MigrationUtilKt$MIGRATION_2_3$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.getClass();
            database.execSQL("ALTER TABLE upload_request ADD COLUMN content_uri TEXT NOT NULL DEFAULT 'no_file'");
        }
    };

    @NotNull
    private static final Migration MIGRATION_3_4 = new Migration() { // from class: com.amazon.photos.uploader.MigrationUtilKt$MIGRATION_3_4$1
        @Override // androidx.room.migration.Migration
        public void migrate(@NotNull SupportSQLiteDatabase database) {
            database.getClass();
            database.execSQL("ALTER TABLE upload_request ADD COLUMN visual_collection_parent_id TEXT");
            database.execSQL("ALTER TABLE upload_request ADD COLUMN metadata TEXT");
        }
    };

    @NotNull
    public static final Migration getMIGRATION_1_2() {
        return MIGRATION_1_2;
    }

    @NotNull
    public static final Migration getMIGRATION_2_3() {
        return MIGRATION_2_3;
    }

    @NotNull
    public static final Migration getMIGRATION_3_4() {
        return MIGRATION_3_4;
    }
}
