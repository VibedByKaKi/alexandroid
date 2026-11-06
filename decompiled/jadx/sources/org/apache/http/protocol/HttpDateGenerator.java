package org.apache.http.protocol;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.commons.lang3.time.TimeZones;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Contract(threading = ThreadingBehavior.SAFE)
/* loaded from: classes11.dex */
public class HttpDateGenerator {
    public static final TimeZone GMT = TimeZone.getTimeZone(TimeZones.GMT_ID);
    public static final String PATTERN_RFC1123 = "EEE, dd MMM yyyy HH:mm:ss zzz";
    private long dateAsLong = 0;
    private String dateAsText = null;
    private final DateFormat dateformat;

    public HttpDateGenerator() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        this.dateformat = simpleDateFormat;
        simpleDateFormat.setTimeZone(GMT);
    }

    public synchronized String getCurrentDate() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.dateAsLong > 1000) {
                this.dateAsText = this.dateformat.format(new Date(currentTimeMillis));
                this.dateAsLong = currentTimeMillis;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.dateAsText;
    }
}
