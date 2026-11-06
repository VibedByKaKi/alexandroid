package com.amazon.alexa.redesign.presenter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.domain.PublishEventBusMessageUseCase;
import com.amazon.alexa.redesign.repository.ConfigurationRepository;
import com.amazon.alexa.redesign.utils.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/redesign/presenter/GetContentErrorHandler;", "", "eventBusMessageUseCase", "Lcom/amazon/alexa/redesign/domain/PublishEventBusMessageUseCase;", "configurationRepository", "Lcom/amazon/alexa/redesign/repository/ConfigurationRepository;", "<init>", "(Lcom/amazon/alexa/redesign/domain/PublishEventBusMessageUseCase;Lcom/amazon/alexa/redesign/repository/ConfigurationRepository;)V", "handleError", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class GetContentErrorHandler {
    public static final int $stable = 8;

    @NotNull
    private final ConfigurationRepository configurationRepository;

    @NotNull
    private final PublishEventBusMessageUseCase eventBusMessageUseCase;

    public GetContentErrorHandler(@NotNull PublishEventBusMessageUseCase publishEventBusMessageUseCase, @NotNull ConfigurationRepository configurationRepository) {
        publishEventBusMessageUseCase.getClass();
        configurationRepository.getClass();
        this.eventBusMessageUseCase = publishEventBusMessageUseCase;
        this.configurationRepository = configurationRepository;
    }

    public final void handleError() {
        if (this.configurationRepository.getServicesStartMessageSent() || !this.configurationRepository.getIsColdStart()) {
            return;
        }
        this.eventBusMessageUseCase.publishEventBusMessage(Constants.SERVICES_CAN_START);
        this.configurationRepository.setServicesStartMessageSent(true);
    }
}
