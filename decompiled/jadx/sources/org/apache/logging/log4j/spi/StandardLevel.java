package org.apache.logging.log4j.spi;

import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public enum StandardLevel {
    OFF(0),
    FATAL(100),
    ERROR(200),
    WARN(300),
    INFO(400),
    DEBUG(500),
    TRACE(600),
    ALL(Integer.MAX_VALUE);

    private static final EnumSet<StandardLevel> LEVELSET = EnumSet.allOf(StandardLevel.class);
    private final int intLevel;

    StandardLevel(int i) {
        this.intLevel = i;
    }

    public static StandardLevel getStandardLevel(int i) {
        StandardLevel standardLevel = OFF;
        Iterator<E> it2 = LEVELSET.iterator();
        while (it2.hasNext()) {
            StandardLevel standardLevel2 = (StandardLevel) it2.next();
            if (standardLevel2.intLevel() > i) {
                break;
            }
            standardLevel = standardLevel2;
        }
        return standardLevel;
    }

    public int intLevel() {
        return this.intLevel;
    }
}
