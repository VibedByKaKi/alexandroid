package com.imagepicker;

import android.util.Log;
import androidx.annotation.Nullable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
abstract class Metadata {
    protected String datetime;
    protected int height;
    protected int width;

    public abstract String getDateTime();

    @Nullable
    public String getDateTimeInUTC(String str, String str2) {
        try {
            Locale locale = Locale.US;
            Date parse = new SimpleDateFormat(str2, locale).parse(str);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", locale);
            if (parse != null) {
                return simpleDateFormat.format(parse);
            }
            return null;
        } catch (Exception e) {
            Log.e("RNIP", "Could not parse image datetime to UTC: " + e.getMessage());
            return null;
        }
    }

    public abstract int getHeight();

    public abstract int getWidth();
}
