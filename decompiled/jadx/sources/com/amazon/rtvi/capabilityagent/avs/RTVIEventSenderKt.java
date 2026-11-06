package com.amazon.rtvi.capabilityagent.avs;

import com.dee.app.contacts.common.constants.Constants;
import com.facebook.imageutils.BitmapUtil$$ExternalSyntheticLambda0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {Constants.LOG_TAG, "", "COMPAT_DELIVERY_TIMEOUT_MS", "", "compatDeliveryTimeouts", "Ljava/util/concurrent/ScheduledExecutorService;", "getCompatDeliveryTimeouts", "()Ljava/util/concurrent/ScheduledExecutorService;", "compatDeliveryTimeouts$delegate", "Lkotlin/Lazy;", "RTVIAndroidAlexaAvsSdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRTVIEventSender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RTVIEventSender.kt\ncom/amazon/rtvi/capabilityagent/avs/RTVIEventSenderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,279:1\n1#2:280\n*E\n"})
/* loaded from: classes13.dex */
public final class RTVIEventSenderKt {
    private static final long COMPAT_DELIVERY_TIMEOUT_MS = 10000;

    @NotNull
    private static final String TAG = "RTVICCS-EventSender";

    @NotNull
    private static final Lazy compatDeliveryTimeouts$delegate = LazyKt.lazy(new BitmapUtil$$ExternalSyntheticLambda0(23));

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScheduledExecutorService compatDeliveryTimeouts_delegate$lambda$2() {
        return Executors.newSingleThreadScheduledExecutor(new ReadAheadInputStream$$ExternalSyntheticLambda1(19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread compatDeliveryTimeouts_delegate$lambda$2$lambda$1(Runnable runnable) {
        Thread thread = new Thread(runnable, TAG);
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScheduledExecutorService getCompatDeliveryTimeouts() {
        Object value = compatDeliveryTimeouts$delegate.getValue();
        value.getClass();
        return (ScheduledExecutorService) value;
    }
}
