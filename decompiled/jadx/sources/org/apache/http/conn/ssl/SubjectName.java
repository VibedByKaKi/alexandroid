package org.apache.http.conn.ssl;

import org.apache.http.util.Args;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class SubjectName {
    static final int DNS = 2;
    static final int IP = 7;
    private final int type;
    private final String value;

    public SubjectName(String str, int i) {
        this.value = (String) Args.notNull(str, "Value");
        this.type = Args.positive(i, "Type");
    }

    public static SubjectName DNS(String str) {
        return new SubjectName(str, 2);
    }

    public static SubjectName IP(String str) {
        return new SubjectName(str, 7);
    }

    public int getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }
}
