package com.amazon.deecomms.calling.model;

import androidx.annotation.NonNull;
import com.google.common.base.Optional;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BeginCallMapper {
    @Inject
    public BeginCallMapper() {
    }

    public Optional<InitiateOutboundCallRequest> map(@NonNull BeginCallPayload beginCallPayload) {
        String str = "";
        for (Map<String, Object> map : beginCallPayload.sipCommand.payload.headers) {
            if (map.containsKey("X-Alexa-GroupId")) {
                Object obj = map.get("X-Alexa-GroupId");
                Objects.requireNonNull(obj);
                str = obj.toString();
            }
        }
        return StringUtils.isEmpty(str) ? Optional.absent() : Optional.of(new InitiateOutboundCallRequestBuilder(Arrays.asList("AUDIO", "VIDEO")).withGroupTarget("GROUP_CONTACT", str, false).build());
    }
}
