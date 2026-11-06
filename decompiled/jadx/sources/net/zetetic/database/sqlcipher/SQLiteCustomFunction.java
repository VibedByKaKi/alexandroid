package net.zetetic.database.sqlcipher;

import net.zetetic.database.sqlcipher.SQLiteDatabase;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final class SQLiteCustomFunction {
    public final SQLiteDatabase.CustomFunction callback;
    public final String name;
    public final int numArgs;

    public SQLiteCustomFunction(String str, int i, SQLiteDatabase.CustomFunction customFunction) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("name must not be null.");
            throw null;
        }
        this.name = str;
        this.numArgs = i;
        this.callback = customFunction;
    }

    private void dispatchCallback(String[] strArr) {
        this.callback.callback(strArr);
    }
}
