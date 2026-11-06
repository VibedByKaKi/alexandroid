package com.amazon.tarazed.logging;

import com.amazonaws.services.logs.model.InputLogEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00060\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/tarazed/logging/TarazedLogParser;", "", "appender", "Lcom/amazon/tarazed/logging/TarazedLogFileAppender;", "(Lcom/amazon/tarazed/logging/TarazedLogFileAppender;)V", "parseLogEvents", "", "Lcom/amazonaws/services/logs/model/InputLogEvent;", "Lcom/amazon/tarazed/logging/api/InputLogEvent;", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TarazedLogParser {
    public static final int MAX_LOG_AGE_MILLIS = 259200000;
    public static final int ONE_DAY_IN_MILLIS = 86400000;

    @NotNull
    private final TarazedLogFileAppender appender;

    public TarazedLogParser(@NotNull TarazedLogFileAppender tarazedLogFileAppender) {
        tarazedLogFileAppender.getClass();
        this.appender = tarazedLogFileAppender;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
    @NotNull
    public final Collection<Collection<InputLogEvent>> parseLogEvents() {
        final ArrayList arrayList = new ArrayList();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new ArrayList();
        final Ref.LongRef longRef = new Ref.LongRef();
        final long timeInMillis = Calendar.getInstance().getTimeInMillis() - MAX_LOG_AGE_MILLIS;
        this.appender.forEachLine(new Function1<String, Unit>() { // from class: com.amazon.tarazed.logging.TarazedLogParser$parseLogEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [T, java.util.ArrayList] */
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str) {
                String replace$default;
                str.getClass();
                replace$default = StringsKt__StringsJVMKt.replace$default(str, TarazedLogFormatter.FILE_SEPARATOR, '\n', false, 4, (Object) null);
                int length = replace$default.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (replace$default.charAt(i) == ' ') {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    i = replace$default.length();
                }
                try {
                    long parseLong = Long.parseLong(replace$default.substring(0, i));
                    if (parseLong <= timeInMillis) {
                        return;
                    }
                    Ref.LongRef longRef2 = longRef;
                    if (longRef2.element == 0) {
                        longRef2.element = parseLong;
                    }
                    if (parseLong - longRef2.element >= 86400000) {
                        arrayList.add(objectRef.element);
                        objectRef.element = new ArrayList();
                        longRef.element = parseLong;
                    }
                    int i2 = i + 1;
                    String substring = i2 < replace$default.length() ? replace$default.substring(i2, replace$default.length()) : "";
                    List<InputLogEvent> list = objectRef.element;
                    InputLogEvent withMessage = new InputLogEvent().withTimestamp(Long.valueOf(parseLong)).withMessage(substring);
                    withMessage.getClass();
                    list.add(withMessage);
                } catch (Exception unused) {
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }
        });
        arrayList.add(objectRef.element);
        return arrayList;
    }
}
