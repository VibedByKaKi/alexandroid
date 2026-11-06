package org.joda.time.format;

import androidx.exifinterface.media.ExifInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ISOPeriodFormat {
    private static PeriodFormatter cAlternate;
    private static PeriodFormatter cAlternateExtended;
    private static PeriodFormatter cAlternateExtendedWihWeeks;
    private static PeriodFormatter cAlternateWithWeeks;
    private static PeriodFormatter cStandard;

    public static PeriodFormatter alternate() {
        if (cAlternate == null) {
            cAlternate = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendMonths().appendDays().appendSeparatorIfFieldsAfter(ExifInterface.GPS_DIRECTION_TRUE).appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternate;
    }

    public static PeriodFormatter alternateExtended() {
        if (cAlternateExtended == null) {
            cAlternateExtended = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator("-").minimumPrintedDigits(2).appendMonths().appendSeparator("-").appendDays().appendSeparatorIfFieldsAfter(ExifInterface.GPS_DIRECTION_TRUE).appendHours().appendSeparator(":").appendMinutes().appendSeparator(":").appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateExtended;
    }

    public static PeriodFormatter alternateExtendedWithWeeks() {
        if (cAlternateExtendedWihWeeks == null) {
            cAlternateExtendedWihWeeks = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().appendSeparator("-").minimumPrintedDigits(2).appendPrefix(ExifInterface.LONGITUDE_WEST).appendWeeks().appendSeparator("-").appendDays().appendSeparatorIfFieldsAfter(ExifInterface.GPS_DIRECTION_TRUE).appendHours().appendSeparator(":").appendMinutes().appendSeparator(":").appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateExtendedWihWeeks;
    }

    public static PeriodFormatter alternateWithWeeks() {
        if (cAlternateWithWeeks == null) {
            cAlternateWithWeeks = new PeriodFormatterBuilder().appendLiteral("P").printZeroAlways().minimumPrintedDigits(4).appendYears().minimumPrintedDigits(2).appendPrefix(ExifInterface.LONGITUDE_WEST).appendWeeks().appendDays().appendSeparatorIfFieldsAfter(ExifInterface.GPS_DIRECTION_TRUE).appendHours().appendMinutes().appendSecondsWithOptionalMillis().toFormatter();
        }
        return cAlternateWithWeeks;
    }

    public static PeriodFormatter standard() {
        if (cStandard == null) {
            cStandard = new PeriodFormatterBuilder().appendLiteral("P").appendYears().appendSuffix("Y").appendMonths().appendSuffix("M").appendWeeks().appendSuffix(ExifInterface.LONGITUDE_WEST).appendDays().appendSuffix("D").appendSeparatorIfFieldsAfter(ExifInterface.GPS_DIRECTION_TRUE).appendHours().appendSuffix("H").appendMinutes().appendSuffix("M").appendSecondsWithOptionalMillis().appendSuffix(ExifInterface.LATITUDE_SOUTH).toFormatter();
        }
        return cStandard;
    }
}
