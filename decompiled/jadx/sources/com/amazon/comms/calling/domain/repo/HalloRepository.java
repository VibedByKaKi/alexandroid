package com.amazon.comms.calling.domain.repo;

import com.amazon.comms.calling.domain.model.CallExperienceType;
import com.amazon.comms.calling.domain.model.CallModel;
import com.amazon.comms.calling.domain.model.HalloEventType;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J.\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/HalloRepository;", "", "sendHalloEvent", "", "callModel", "Lcom/amazon/comms/calling/domain/model/CallModel;", "halloEventType", "Lcom/amazon/comms/calling/domain/model/HalloEventType;", "sipStatusCode", "", "sendCallTypeEvent", "callFlags", "", "callExperienceType", "Lcom/amazon/comms/calling/domain/model/CallExperienceType;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface HalloRepository {
    void sendCallTypeEvent(@NotNull CallModel callModel, @NotNull HalloEventType halloEventType, @NotNull List<String> callFlags, @NotNull CallExperienceType callExperienceType);

    void sendHalloEvent(@NotNull CallModel callModel, @NotNull HalloEventType halloEventType, @NotNull String sipStatusCode);
}
