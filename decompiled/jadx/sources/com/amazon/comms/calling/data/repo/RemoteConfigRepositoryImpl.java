package com.amazon.comms.calling.data.repo;

import com.amazon.comms.calling.domain.repo.RemoteConfigRepository;
import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import com.amazon.commscore.api.remoteconfiguration.RemoteConfigValue;
import javax.inject.Inject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/data/repo/RemoteConfigRepositoryImpl;", "Lcom/amazon/comms/calling/domain/repo/RemoteConfigRepository;", "arcusConfig", "Lcom/amazon/commscore/api/remoteconfiguration/AlexaCommsCoreRemoteConfigurationService;", "<init>", "(Lcom/amazon/commscore/api/remoteconfiguration/AlexaCommsCoreRemoteConfigurationService;)V", "getRemoteConfiguration", "Lcom/amazon/commscore/api/remoteconfiguration/RemoteConfigValue;", "key", "", "obj", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RemoteConfigRepositoryImpl implements RemoteConfigRepository {

    @NotNull
    private final AlexaCommsCoreRemoteConfigurationService arcusConfig;

    @Inject
    public RemoteConfigRepositoryImpl(@NotNull AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService) {
        alexaCommsCoreRemoteConfigurationService.getClass();
        this.arcusConfig = alexaCommsCoreRemoteConfigurationService;
    }

    @Override // com.amazon.comms.calling.domain.repo.RemoteConfigRepository
    @NotNull
    public RemoteConfigValue getRemoteConfiguration(@NotNull String key, @NotNull Object obj) {
        key.getClass();
        obj.getClass();
        RemoteConfigValue remoteConfiguration = this.arcusConfig.getRemoteConfiguration(key, obj);
        remoteConfiguration.getClass();
        return remoteConfiguration;
    }
}
