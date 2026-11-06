package com.amazon.comms.calling.domain.usecase.accessory;

import com.amazon.comms.calling.infrastructure.AccessoriesProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/accessory/CheckIfAccessoryConnectedUseCase;", "", "accessoriesProvider", "Lcom/amazon/comms/calling/infrastructure/AccessoriesProvider;", "<init>", "(Lcom/amazon/comms/calling/infrastructure/AccessoriesProvider;)V", "execute", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CheckIfAccessoryConnectedUseCase {

    @NotNull
    private final AccessoriesProvider accessoriesProvider;

    @Inject
    public CheckIfAccessoryConnectedUseCase(@NotNull AccessoriesProvider accessoriesProvider) {
        accessoriesProvider.getClass();
        this.accessoriesProvider = accessoriesProvider;
    }

    public final boolean execute() {
        return this.accessoriesProvider.areAccessoriesConnected();
    }
}
