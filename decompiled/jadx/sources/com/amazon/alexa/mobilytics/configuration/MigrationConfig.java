package com.amazon.alexa.mobilytics.configuration;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class MigrationConfig {
    private Map<String, MigrationEntry> migration = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MigrationEntry {
        public String groupId;
        public String mode;
        public String schemaId;

        public String groupId() {
            return this.groupId;
        }

        public String mode() {
            return this.mode;
        }

        public String schemaId() {
            return this.schemaId;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Mode {
        public static final String MINERVA_KINESIS_DUAL_STREAM = "MINERVA_KINESIS_DUAL_STREAM";
        public static final String MINERVA_NEW_STREAM_ONLY = "MINERVA_NEW_STREAM_ONLY";

        private Mode() {
        }
    }

    @Nullable
    private MigrationEntry entryFor(String str) {
        if (str == null) {
            return null;
        }
        return this.migration.get(str);
    }

    public void clearMigration() {
        this.migration.clear();
    }

    public boolean isParticipating(String str) {
        return entryFor(str) != null;
    }

    public Map<String, MigrationEntry> migration() {
        return this.migration;
    }

    @Nullable
    public String mode(String str) {
        MigrationEntry entryFor = entryFor(str);
        if (entryFor == null) {
            return null;
        }
        return entryFor.mode;
    }

    @Nullable
    public String newGroupId(String str) {
        MigrationEntry entryFor = entryFor(str);
        if (entryFor == null) {
            return null;
        }
        return entryFor.groupId;
    }

    @Nullable
    public String newSchemaId(String str) {
        MigrationEntry entryFor = entryFor(str);
        if (entryFor == null) {
            return null;
        }
        return entryFor.schemaId;
    }
}
