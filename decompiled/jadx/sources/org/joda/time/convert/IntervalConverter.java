package org.joda.time.convert;

import org.joda.time.Chronology;
import org.joda.time.ReadWritableInterval;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface IntervalConverter extends Converter {
    boolean isReadableInterval(Object obj, Chronology chronology);

    void setInto(ReadWritableInterval readWritableInterval, Object obj, Chronology chronology);
}
