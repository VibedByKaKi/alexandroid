package com.amazon.comms.calling.domain.usecase.ringtone;

import com.amazon.comms.calling.dependency.DefaultDispatcher;
import com.amazon.comms.calling.domain.repo.RingtoneRepository;
import com.amazon.comms.calling.domain.usecase.CoroutineUseCase;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/ringtone/StopRingToneUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "", "ringtoneRepository", "Lcom/amazon/comms/calling/domain/repo/RingtoneRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/RingtoneRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "execute", "parameters", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class StopRingToneUseCase extends CoroutineUseCase<Unit, Unit> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(StopRingToneUseCase.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final RingtoneRepository ringtoneRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public StopRingToneUseCase(@NotNull RingtoneRepository ringtoneRepository, @DefaultDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        ringtoneRepository.getClass();
        coroutineDispatcher.getClass();
        this.ringtoneRepository = ringtoneRepository;
        this.dispatcher = coroutineDispatcher;
        this.LOG = new CallingLogger();
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    @Nullable
    public Object execute(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) {
        getLOG().i("StopRingToneUseCase");
        this.ringtoneRepository.stopIncomingRingtone();
        this.ringtoneRepository.stopOutgoingRingtone();
        return Unit.INSTANCE;
    }
}
