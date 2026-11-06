package org.apache.logging.log4j;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.http.client.methods.HttpTrace;
import org.apache.logging.log4j.spi.StandardLevel;
import org.apache.logging.log4j.util.Strings;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class Level implements Comparable<Level>, Serializable {
    public static final String CATEGORY = "Level";
    private static final long serialVersionUID = 1581082;
    private final int intLevel;
    private final String name;
    private final StandardLevel standardLevel;
    private static final Level[] EMPTY_ARRAY = new Level[0];
    private static final ConcurrentMap<String, Level> LEVELS = new ConcurrentHashMap();
    public static final Level OFF = new Level("OFF", StandardLevel.OFF.intLevel());
    public static final Level FATAL = new Level("FATAL", StandardLevel.FATAL.intLevel());
    public static final Level ERROR = new Level("ERROR", StandardLevel.ERROR.intLevel());
    public static final Level WARN = new Level("WARN", StandardLevel.WARN.intLevel());
    public static final Level INFO = new Level("INFO", StandardLevel.INFO.intLevel());
    public static final Level DEBUG = new Level("DEBUG", StandardLevel.DEBUG.intLevel());
    public static final Level TRACE = new Level(HttpTrace.METHOD_NAME, StandardLevel.TRACE.intLevel());
    public static final Level ALL = new Level("ALL", StandardLevel.ALL.intLevel());

    private Level(String str, int i) {
        if (Strings.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Illegal null or empty Level name.");
            throw null;
        }
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Illegal Level int less than zero.");
            throw null;
        }
        this.name = str;
        this.intLevel = i;
        this.standardLevel = StandardLevel.getStandardLevel(i);
        if (LEVELS.putIfAbsent(Strings.toRootUpperCase(str.trim()), this) == null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m("Level ", str, " has already been defined."));
        throw null;
    }

    public static Level forName(String str, int i) {
        if (Strings.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("Illegal null or empty Level name.");
            return null;
        }
        String rootUpperCase = Strings.toRootUpperCase(str.trim());
        Level level = LEVELS.get(rootUpperCase);
        if (level != null) {
            return level;
        }
        try {
            return new Level(str, i);
        } catch (IllegalStateException unused) {
            return LEVELS.get(rootUpperCase);
        }
    }

    public static Level getLevel(String str) {
        if (!Strings.isEmpty(str)) {
            return LEVELS.get(Strings.toRootUpperCase(str.trim()));
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Illegal null or empty Level name.");
        return null;
    }

    private Object readResolve() {
        return valueOf(this.name);
    }

    public static Level toLevel(String str, Level level) {
        Level level2;
        return (str == null || (level2 = LEVELS.get(Strings.toRootUpperCase(str.trim()))) == null) ? level : level2;
    }

    public static Level valueOf(String str) {
        Objects.requireNonNull(str, "No level name given.");
        String rootUpperCase = Strings.toRootUpperCase(str.trim());
        Level level = LEVELS.get(rootUpperCase);
        if (level != null) {
            return level;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown level constant [", rootUpperCase, "]."));
        return null;
    }

    public static Level[] values() {
        return (Level[]) LEVELS.values().toArray(EMPTY_ARRAY);
    }

    public Level clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Override // java.lang.Comparable
    public int compareTo(Level level) {
        int i = this.intLevel;
        int i2 = level.intLevel;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Level) && obj == this;
    }

    public Class<Level> getDeclaringClass() {
        return Level.class;
    }

    public StandardLevel getStandardLevel() {
        return this.standardLevel;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public int intLevel() {
        return this.intLevel;
    }

    public boolean isInRange(Level level, Level level2) {
        int i = this.intLevel;
        return i >= level.intLevel && i <= level2.intLevel;
    }

    public boolean isLessSpecificThan(Level level) {
        return this.intLevel >= level.intLevel;
    }

    public boolean isMoreSpecificThan(Level level) {
        return this.intLevel <= level.intLevel;
    }

    public String name() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }

    public static Level toLevel(String str) {
        return toLevel(str, DEBUG);
    }

    public static <T extends Enum<T>> T valueOf(Class<T> cls, String str) {
        return (T) Enum.valueOf(cls, str);
    }
}
