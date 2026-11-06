package com.amazon.tarazed.logging;

import com.amazon.dee.sdk.iotsoftap.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/tarazed/logging/TarazedLogFormatter;", "Ljava/util/logging/Formatter;", "()V", "FILE_SEPARATOR", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "format", "", "record", "Ljava/util/logging/LogRecord;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TarazedLogFormatter extends Formatter {
    public static final char FILE_SEPARATOR = 28;

    @NotNull
    public static final TarazedLogFormatter INSTANCE = new TarazedLogFormatter();

    @NotNull
    private static final SimpleDateFormat dateFormat;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS", Locale.US);
        dateFormat = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Constants.UTC));
    }

    private TarazedLogFormatter() {
    }

    @Override // java.util.logging.Formatter
    @NotNull
    public synchronized String format(@NotNull LogRecord record) {
        Date date;
        String format;
        String replace$default;
        String str;
        try {
            record.getClass();
            date = new Date(record.getMillis());
            format = dateFormat.format(date);
            String message = record.getMessage();
            message.getClass();
            replace$default = StringsKt__StringsJVMKt.replace$default(message, '\n', FILE_SEPARATOR, false, 4, (Object) null);
            if (record.getThrown() != null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                printWriter.println();
                record.getThrown().printStackTrace(printWriter);
                printWriter.close();
                String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                str = StringsKt__StringsJVMKt.replace$default(stringWriter2, '\n', FILE_SEPARATOR, false, 4, (Object) null);
            } else {
                str = "";
            }
        } catch (Throwable th) {
            throw th;
        }
        return date.getTime() + " " + format + " [" + record.getLevel() + "] [" + record.getSourceClassName() + "] " + replace$default + " " + str + "\n";
    }
}
