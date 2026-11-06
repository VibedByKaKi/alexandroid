package com.amazon.alexa.accessory.frames.media.utils;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.frames.R;
import com.amazon.alexa.accessory.frames.utils.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class TimestampUtils {
    private static final String ISO8601_TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static final String MONTH_DAY_DATE_FORMAT = "MMMM d";
    private static final String MONTH_DAY_YEAR_DATE_FORMAT = "MMMM d, yyyy";
    private static final String TAG = "TimestampUtils";
    private static final String TWELVE_HOUR_TIME_FORMAT = "h:mm a";

    private TimestampUtils() {
    }

    @NonNull
    public static String formatDate(@NonNull Context context, @NonNull Date date, @NonNull Locale locale) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date);
        if (isSameDay(calendar, calendar2)) {
            return context.getString(R.string.today);
        }
        if (isYesterday(calendar, calendar2)) {
            return context.getString(R.string.yesterday);
        }
        return new SimpleDateFormat(isSameYear(calendar, calendar2) ? MONTH_DAY_DATE_FORMAT : MONTH_DAY_YEAR_DATE_FORMAT, locale).format(date);
    }

    @NonNull
    public static String formatDuration(int i) {
        return String.format(Locale.US, "%d:%02d", Integer.valueOf(i / 60), Integer.valueOf(i % 60));
    }

    @NonNull
    public static String formatTime(@NonNull Date date, @NonNull Locale locale) {
        return new SimpleDateFormat(TWELVE_HOUR_TIME_FORMAT, locale).format(date);
    }

    public static boolean isSameDay(@NonNull Calendar calendar, @NonNull Calendar calendar2) {
        return isSameYear(calendar, calendar2) && calendar.get(6) == calendar2.get(6);
    }

    public static boolean isSameYear(@NonNull Calendar calendar, @NonNull Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1);
    }

    public static boolean isYesterday(@NonNull Calendar calendar, @NonNull Calendar calendar2) {
        Calendar calendar3 = (Calendar) calendar.clone();
        calendar3.add(6, -1);
        return isSameDay(calendar3, calendar2);
    }

    public static void parseAndFormatTimestamp(@NonNull Context context, @Nullable String str, @NonNull TextView textView, @NonNull TextView textView2) {
        if (str == null || str.isEmpty()) {
            Log.w(TAG, "Null or empty timestamp provided");
            return;
        }
        try {
            Date parseIso8601 = parseIso8601(str);
            if (parseIso8601 == null) {
                Log.w(TAG, "Null date provided");
                return;
            }
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            String formatDate = formatDate(context, parseIso8601, locale);
            String formatTime = formatTime(parseIso8601, locale);
            textView.setText(formatDate);
            textView2.setText(formatTime);
            Log.i(TAG, "Successfully parsed and formatted timestamp");
        } catch (Exception unused) {
            Log.e(TAG, "Failed to parse and format timestamp");
        }
    }

    @Nullable
    public static Date parseIso8601(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            try {
                return new SimpleDateFormat(ISO8601_TIMESTAMP_FORMAT, Locale.US).parse(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }
}
