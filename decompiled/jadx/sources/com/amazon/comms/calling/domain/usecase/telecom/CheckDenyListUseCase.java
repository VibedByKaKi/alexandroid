package com.amazon.comms.calling.domain.usecase.telecom;

import android.os.Build;
import com.amazon.alexa.smarthomecameras.constants.MobilyticsConstants;
import com.amazon.comms.calling.dependency.DefaultDispatcher;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/telecom/CheckDenyListUseCase;", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "manufacturersList", "", "", "modelsList", "execute", "", "name", "model", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CheckDenyListUseCase {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(CheckDenyListUseCase.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final List<String> manufacturersList;

    @NotNull
    private final List<String> modelsList;

    @Inject
    public CheckDenyListUseCase(@DefaultDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        coroutineDispatcher.getClass();
        this.dispatcher = coroutineDispatcher;
        this.LOG = new CallingLogger();
        this.manufacturersList = CollectionsKt.listOf((Object[]) new String[]{"realme", "oppo", "oneplus", "huawei", MobilyticsConstants.PROVIDER_1P});
        this.modelsList = CollectionsKt.emptyList();
    }

    public static /* synthetic */ Object execute$default(CheckDenyListUseCase checkDenyListUseCase, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = Build.MANUFACTURER;
        }
        if ((i & 2) != 0) {
            str2 = Build.MODEL;
        }
        return checkDenyListUseCase.execute(str, str2, continuation);
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    public final Object execute(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        getLOG().i("CheckDenyListUseCase --> MANUFACTURER: " + str + ", model: " + str2);
        return BuildersKt.withContext(this.dispatcher, new CheckDenyListUseCase$execute$2(this, str, str2, null), continuation);
    }
}
