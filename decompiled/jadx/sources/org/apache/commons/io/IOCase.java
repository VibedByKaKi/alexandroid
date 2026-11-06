package org.apache.commons.io;

import com.amazon.alexa.assistant.capability.system.model.SystemEvent;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public enum IOCase {
    SENSITIVE("Sensitive", true),
    INSENSITIVE("Insensitive", false),
    SYSTEM(SystemEvent.NAMESPACE, !FilenameUtils.isSystemWindows());

    private static final long serialVersionUID = -6343169151696340687L;
    private final String name;
    private final transient boolean sensitive;

    IOCase(String str, boolean z) {
        this.name = str;
        this.sensitive = z;
    }

    public static IOCase forName(String str) {
        for (IOCase iOCase : values()) {
            if (iOCase.getName().equals(str)) {
                return iOCase;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Invalid IOCase name: ", str));
        return null;
    }

    public static boolean isCaseSensitive(IOCase iOCase) {
        return (iOCase == null || iOCase.isCaseSensitive()) ? false : true;
    }

    private Object readResolve() {
        return forName(this.name);
    }

    public int checkCompareTo(String str, String str2) {
        Objects.requireNonNull(str, "str1");
        Objects.requireNonNull(str2, "str2");
        return this.sensitive ? str.compareTo(str2) : str.compareToIgnoreCase(str2);
    }

    public boolean checkEndsWith(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        int length = str2.length();
        return str.regionMatches(!this.sensitive, str.length() - length, str2, 0, length);
    }

    public boolean checkEquals(String str, String str2) {
        Objects.requireNonNull(str, "str1");
        Objects.requireNonNull(str2, "str2");
        return this.sensitive ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public int checkIndexOf(String str, int i, String str2) {
        int length = str.length() - str2.length();
        if (length < i) {
            return -1;
        }
        while (i <= length) {
            if (checkRegionMatches(str, i, str2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean checkRegionMatches(String str, int i, String str2) {
        return str.regionMatches(!this.sensitive, i, str2, 0, str2.length());
    }

    public boolean checkStartsWith(String str, String str2) {
        return (str == null || str2 == null || !str.regionMatches(this.sensitive ^ true, 0, str2, 0, str2.length())) ? false : true;
    }

    public String getName() {
        return this.name;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }

    public boolean isCaseSensitive() {
        return this.sensitive;
    }
}
