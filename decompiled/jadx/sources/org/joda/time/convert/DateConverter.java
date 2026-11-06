package org.joda.time.convert;

import java.util.Date;
import org.joda.time.Chronology;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
final class DateConverter extends AbstractConverter implements InstantConverter, PartialConverter {
    static final DateConverter INSTANCE = new DateConverter();

    @Override // org.joda.time.convert.AbstractConverter, org.joda.time.convert.InstantConverter
    public long getInstantMillis(Object obj, Chronology chronology) {
        return ((Date) obj).getTime();
    }

    @Override // org.joda.time.convert.Converter
    public Class<?> getSupportedType() {
        return Date.class;
    }
}
