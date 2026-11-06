package com.amazon.comms.calling.domain.usecase.audio;

import com.amazon.comms.calling.dependency.IoDispatcher;
import com.amazon.comms.calling.domain.repo.AudioManagementRepository;
import com.amazon.comms.calling.domain.usecase.CoroutineUseCase;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00030\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0094@¢\u0006\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/audio/GetCurrentRouteAndActiveBluetoothDeviceNameUseCase;", "Lcom/amazon/comms/calling/domain/usecase/CoroutineUseCase;", "", "Lkotlin/Pair;", "", "audioManagementRepository", "Lcom/amazon/comms/calling/domain/repo/AudioManagementRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/amazon/comms/calling/domain/repo/AudioManagementRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "execute", "parameters", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class GetCurrentRouteAndActiveBluetoothDeviceNameUseCase extends CoroutineUseCase<Unit, Pair<? extends String, ? extends String>> {

    @NotNull
    private final AudioManagementRepository audioManagementRepository;

    @NotNull
    private final CoroutineDispatcher dispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GetCurrentRouteAndActiveBluetoothDeviceNameUseCase(@NotNull AudioManagementRepository audioManagementRepository, @IoDispatcher @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        audioManagementRepository.getClass();
        coroutineDispatcher.getClass();
        this.audioManagementRepository = audioManagementRepository;
        this.dispatcher = coroutineDispatcher;
    }

    @Nullable
    /* renamed from: execute, reason: avoid collision after fix types in other method */
    public Object execute2(@NotNull Unit unit, @NotNull Continuation<? super Pair<String, String>> continuation) {
        return new Pair(this.audioManagementRepository.getCurrentRoute(), this.audioManagementRepository.getActiveBluetoothDeviceName());
    }

    @Override // com.amazon.comms.calling.domain.usecase.CoroutineUseCase
    public /* bridge */ /* synthetic */ Object execute(Unit unit, Continuation<? super Pair<? extends String, ? extends String>> continuation) {
        return execute2(unit, (Continuation<? super Pair<String, String>>) continuation);
    }
}
