package net.zetetic.database.sqlcipher;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class SQLiteDatabaseConfiguration {
    private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    public static final String MEMORY_DB_PATH = ":memory:";
    public final ArrayList<SQLiteCustomFunction> customFunctions;
    public SQLiteDatabaseHook databaseHook;
    public boolean foreignKeyConstraintsEnabled;
    public final String label;
    public Locale locale;
    public int maxSqlCacheSize;
    public int openFlags;
    public byte[] password;
    public final String path;

    public SQLiteDatabaseConfiguration(String str, int i, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.customFunctions = new ArrayList<>();
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("path must not be null.");
            throw null;
        }
        this.path = str;
        this.label = stripPathForLogs(str);
        this.openFlags = i;
        this.password = bArr;
        this.databaseHook = sQLiteDatabaseHook;
        this.maxSqlCacheSize = 25;
        this.locale = Locale.getDefault();
    }

    private static String stripPathForLogs(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf >= 0) {
            str = (String) str.subSequence(0, indexOf);
        }
        return str.indexOf(64) == -1 ? str : EMAIL_IN_DB_PATTERN.matcher(str).replaceAll("XX@YY");
    }

    public boolean isInMemoryDb() {
        return this.path.equalsIgnoreCase(MEMORY_DB_PATH);
    }

    public void updateParametersFrom(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("other must not be null.");
            return;
        }
        if (!this.path.equals(sQLiteDatabaseConfiguration.path)) {
            Single$$ExternalSyntheticBUOutline0.m$3("other configuration must refer to the same database.");
            return;
        }
        this.openFlags = sQLiteDatabaseConfiguration.openFlags;
        this.maxSqlCacheSize = sQLiteDatabaseConfiguration.maxSqlCacheSize;
        this.locale = sQLiteDatabaseConfiguration.locale;
        this.foreignKeyConstraintsEnabled = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
        this.password = sQLiteDatabaseConfiguration.password;
        this.databaseHook = sQLiteDatabaseConfiguration.databaseHook;
        this.customFunctions.clear();
        this.customFunctions.addAll(sQLiteDatabaseConfiguration.customFunctions);
    }

    public SQLiteDatabaseConfiguration(String str, int i) {
        this(str, i, null, null);
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.customFunctions = new ArrayList<>();
        if (sQLiteDatabaseConfiguration != null) {
            this.path = sQLiteDatabaseConfiguration.path;
            this.label = sQLiteDatabaseConfiguration.label;
            updateParametersFrom(sQLiteDatabaseConfiguration);
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("other must not be null.");
        throw null;
    }
}
