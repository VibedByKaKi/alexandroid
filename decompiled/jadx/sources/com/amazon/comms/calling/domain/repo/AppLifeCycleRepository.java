package com.amazon.comms.calling.domain.repo;

import com.amazon.comms.calling.domain.model.AppLifeCycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/AppLifeCycleRepository;", "", "updateAppLifeCycle", "", "appLifeCycle", "Lcom/amazon/comms/calling/domain/model/AppLifeCycle;", "(Lcom/amazon/comms/calling/domain/model/AppLifeCycle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAppForeground", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface AppLifeCycleRepository {
    boolean isAppForeground();

    @Nullable
    Object updateAppLifeCycle(@NotNull AppLifeCycle appLifeCycle, @NotNull Continuation<? super Unit> continuation);
}
