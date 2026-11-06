package com.amazon.comms.calling.data.repo;

import com.amazon.comms.calling.domain.repo.UserInfoRepository;
import com.amazon.comms.calling.foundation.features.providers.IdentityServiceProvider;
import com.amazon.commscore.api.identity.MarketplaceInfo;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/data/repo/UserInfoRepositoryImpl;", "Lcom/amazon/comms/calling/domain/repo/UserInfoRepository;", "identity", "Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;", "<init>", "(Lcom/amazon/comms/calling/foundation/features/providers/IdentityServiceProvider;)V", "getPreferredMarketplace", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class UserInfoRepositoryImpl implements UserInfoRepository {

    @NotNull
    private final IdentityServiceProvider identity;

    @Inject
    public UserInfoRepositoryImpl(@NotNull IdentityServiceProvider identityServiceProvider) {
        identityServiceProvider.getClass();
        this.identity = identityServiceProvider;
    }

    @Override // com.amazon.comms.calling.domain.repo.UserInfoRepository
    @Nullable
    public String getPreferredMarketplace() {
        MarketplaceInfo marketplaceInfo = this.identity.getMarketplaceInfo();
        if (marketplaceInfo != null) {
            return marketplaceInfo.getPfmCode();
        }
        return null;
    }
}
