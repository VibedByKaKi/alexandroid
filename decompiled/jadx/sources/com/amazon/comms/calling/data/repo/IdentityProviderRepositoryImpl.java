package com.amazon.comms.calling.data.repo;

import com.amazon.comms.calling.domain.repo.IdentityProviderRepository;
import com.amazon.comms.calling.foundation.features.providers.IdentityServiceProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/comms/calling/data/repo/IdentityProviderRepositoryImpl;", "Lcom/amazon/comms/calling/domain/repo/IdentityProviderRepository;", "identityServiceProvider", "Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;", "<init>", "(Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;)V", "getCommsId", "", "getHomegroupId", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class IdentityProviderRepositoryImpl implements IdentityProviderRepository {

    @NotNull
    private final IdentityServiceProvider identityServiceProvider;

    @Inject
    public IdentityProviderRepositoryImpl(@NotNull IdentityServiceProvider identityServiceProvider) {
        identityServiceProvider.getClass();
        this.identityServiceProvider = identityServiceProvider;
    }

    @Override // com.amazon.comms.calling.domain.repo.IdentityProviderRepository
    @Nullable
    public String getCommsId() {
        return this.identityServiceProvider.getCommsId();
    }

    @Override // com.amazon.comms.calling.domain.repo.IdentityProviderRepository
    @Nullable
    public String getHomegroupId() {
        return this.identityServiceProvider.getHomegroupId();
    }
}
