package com.google.common.math;

import androidx.emoji2.text.flatbuffer.Utf8Old;
import com.amazon.alexa.app.notification.actions.handlers.RemindersHandler;
import com.amazon.alexa.app.notification.messaging.adm.PhoenixMessageHandler;
import com.amazon.alexa.app.notification.messaging.firebase.FirebaseMessageHandler;
import com.amazon.alexa.configservice.metadata.MetadataProvider;
import com.amazon.alexa.notification.actions.reminders.RemindersActionHandler;
import com.amazon.coral.util.ISO8601;
import com.dee.app.http.CoralServiceException;
import com.fasterxml.jackson.core.util.JsonRecyclerPools;
import com.fasterxml.jackson.core.util.RecyclerPool;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.function.Supplier;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.ReadAheadInputStream;
import org.apache.commons.lang3.function.Suppliers;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.logging.log4j.message.ThreadDumpMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Stats$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Stats$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Utf8Old.Cache lambda$static$0;
        Boolean bool;
        CoralServiceException lambda$fetchReminderNotification$4;
        RuntimeException lambda$markReminderAsDone$5;
        RuntimeException lambda$getComponentWithRetry$0;
        RuntimeException lambda$getComponentWithRetry$02;
        String lambda$getMetadataValue$0;
        CoralServiceException lambda$fetchReminderNotification$1;
        RuntimeException lambda$markReminderAsDone$2;
        Calendar lambda$static$02;
        RecyclerPool.StatefulImplBase construct;
        RecyclerPool.StatefulImplBase construct2;
        char[] charArray;
        byte[] lambda$static$03;
        Object lambda$static$04;
        ParameterizedMessage.FormatBufferHolder lambda$static$05;
        ThreadDumpMessage.ThreadInfoFactory initFactory;
        ThreadDumpMessage.ThreadInfoFactory lambda$initFactory$0;
        switch (this.$r8$classId) {
            case 0:
                return new StatsAccumulator();
            case 1:
                lambda$static$0 = Utf8Old.lambda$static$0();
                return lambda$static$0;
            case 2:
                return Long.valueOf(System.currentTimeMillis());
            case 3:
                bool = Boolean.FALSE;
                return bool;
            case 4:
                lambda$fetchReminderNotification$4 = RemindersHandler.lambda$fetchReminderNotification$4();
                return lambda$fetchReminderNotification$4;
            case 5:
                lambda$markReminderAsDone$5 = RemindersHandler.lambda$markReminderAsDone$5();
                return lambda$markReminderAsDone$5;
            case 6:
                lambda$getComponentWithRetry$0 = PhoenixMessageHandler.lambda$getComponentWithRetry$0();
                return lambda$getComponentWithRetry$0;
            case 7:
                lambda$getComponentWithRetry$02 = FirebaseMessageHandler.lambda$getComponentWithRetry$0();
                return lambda$getComponentWithRetry$02;
            case 8:
                lambda$getMetadataValue$0 = MetadataProvider.lambda$getMetadataValue$0();
                return lambda$getMetadataValue$0;
            case 9:
                lambda$fetchReminderNotification$1 = RemindersActionHandler.lambda$fetchReminderNotification$1();
                return lambda$fetchReminderNotification$1;
            case 10:
                lambda$markReminderAsDone$2 = RemindersActionHandler.lambda$markReminderAsDone$2();
                return lambda$markReminderAsDone$2;
            case 11:
                return new com.amazon.coral.google.common.math.StatsAccumulator();
            case 12:
                return new LinkedHashSet();
            case 13:
                lambda$static$02 = ISO8601.lambda$static$0();
                return lambda$static$02;
            case 14:
                construct = JsonRecyclerPools.ConcurrentDequePool.construct();
                return construct;
            case 15:
                construct2 = JsonRecyclerPools.LockFreePool.construct();
                return construct2;
            case 16:
                return Flowable.empty();
            case 17:
                return Maybe.empty();
            case 18:
                return Observable.empty();
            case 19:
                return IOUtils.byteArray();
            case 20:
                charArray = IOUtils.charArray();
                return charArray;
            case 21:
                lambda$static$03 = ReadAheadInputStream.lambda$static$0();
                return lambda$static$03;
            case 22:
                return new HashSet();
            case 23:
                return new WeakHashMap();
            case 24:
                lambda$static$04 = Suppliers.lambda$static$0();
                return lambda$static$04;
            case 25:
                return new StringBuilder();
            case 26:
                return TimeZone.getDefault();
            case 27:
                lambda$static$05 = ParameterizedMessage.lambda$static$0();
                return lambda$static$05;
            case 28:
                initFactory = ThreadDumpMessage.initFactory();
                return initFactory;
            default:
                lambda$initFactory$0 = ThreadDumpMessage.lambda$initFactory$0();
                return lambda$initFactory$0;
        }
    }
}
