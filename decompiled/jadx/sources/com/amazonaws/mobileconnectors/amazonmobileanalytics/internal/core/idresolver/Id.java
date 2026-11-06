package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class Id {
    private static final Id EMPTY_ID = new Id("");
    private final String id;

    public Id(String str) {
        this.id = str;
    }

    public static synchronized Id getEmptyId() {
        Id id;
        synchronized (Id.class) {
            id = EMPTY_ID;
        }
        return id;
    }

    public static Id valueOf(String str) {
        return (str == null || str.equals("")) ? getEmptyId() : new Id(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.id;
        String str2 = ((Id) obj).id;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public String getValue() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        return 31 + (str == null ? 0 : str.hashCode());
    }
}
