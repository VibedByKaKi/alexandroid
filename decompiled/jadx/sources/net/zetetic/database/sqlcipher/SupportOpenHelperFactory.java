package net.zetetic.database.sqlcipher;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class SupportOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    private static final int UNCHANGED = -1;
    private final boolean enableWriteAheadLogging;
    private final SQLiteDatabaseHook hook;
    private final int minimumSupportedVersion;
    private final byte[] password;

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.password = bArr;
        this.hook = sQLiteDatabaseHook;
        this.enableWriteAheadLogging = z;
        this.minimumSupportedVersion = i;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    @NonNull
    public SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        int i = this.minimumSupportedVersion;
        byte[] bArr = this.password;
        return i == -1 ? new SupportHelper(configuration, bArr, this.hook, this.enableWriteAheadLogging) : new SupportHelper(configuration, bArr, this.hook, this.enableWriteAheadLogging, i);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(bArr, sQLiteDatabaseHook, z, -1);
    }

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }
}
