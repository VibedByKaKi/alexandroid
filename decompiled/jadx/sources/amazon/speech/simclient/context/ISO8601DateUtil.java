package amazon.speech.simclient.context;

import com.amazon.dee.sdk.iotsoftap.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class ISO8601DateUtil {
    private static final ThreadLocal<SimpleDateFormat> FORMAT = new ThreadLocal<SimpleDateFormat>() { // from class: amazon.speech.simclient.context.ISO8601DateUtil.1
        @Override // java.lang.ThreadLocal
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
            return simpleDateFormat;
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Singleton {
        static final ISO8601DateUtil INSTANCE = new ISO8601DateUtil();

        private Singleton() {
        }
    }

    public static ISO8601DateUtil getInstance() {
        return Singleton.INSTANCE;
    }

    public String getCurrentTimestamp() {
        return getTimestamp(new Date());
    }

    public Date getDateFromTimestamp(String str) throws ParseException {
        return FORMAT.get().parse(str);
    }

    public String getTimestamp(Date date) {
        return FORMAT.get().format(date);
    }

    private ISO8601DateUtil() {
    }
}
