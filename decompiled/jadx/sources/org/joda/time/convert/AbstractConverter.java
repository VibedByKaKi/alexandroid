package org.joda.time.convert;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.ReadablePartial;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.format.DateTimeFormatter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class AbstractConverter implements Converter {
    public Chronology getChronology(Object obj, DateTimeZone dateTimeZone) {
        return ISOChronology.getInstance(dateTimeZone);
    }

    public long getInstantMillis(Object obj, Chronology chronology) {
        return DateTimeUtils.currentTimeMillis();
    }

    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology) {
        return chronology.get(readablePartial, getInstantMillis(obj, chronology));
    }

    public PeriodType getPeriodType(Object obj) {
        return PeriodType.standard();
    }

    public boolean isReadableInterval(Object obj, Chronology chronology) {
        return false;
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder("Converter["), getSupportedType() == null ? "null" : getSupportedType().getName(), MarkdownConstants.RIGHT_BRACKET);
    }

    public Chronology getChronology(Object obj, Chronology chronology) {
        return DateTimeUtils.getChronology(chronology);
    }

    public int[] getPartialValues(ReadablePartial readablePartial, Object obj, Chronology chronology, DateTimeFormatter dateTimeFormatter) {
        return getPartialValues(readablePartial, obj, chronology);
    }
}
