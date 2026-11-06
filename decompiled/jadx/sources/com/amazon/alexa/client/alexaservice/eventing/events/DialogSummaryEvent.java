package com.amazon.alexa.client.alexaservice.eventing.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.client.core.messages.Header;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class DialogSummaryEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class DirectiveInfo {
        public static DirectiveInfo create(Header header, long j) {
            return new AutoValue_DialogSummaryEvent_DirectiveInfo(header, j);
        }

        public abstract Header getHeader();

        public abstract long getTimestamp();
    }

    public static DialogSummaryEvent create(DialogRequestIdentifier dialogRequestIdentifier, DialogInteractionResult.Type type, @Nullable String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<DirectiveInfo> list, boolean z6) {
        return new AutoValue_DialogSummaryEvent(dialogRequestIdentifier, type, str, z, z2, z3, z4, z5, list, z6);
    }

    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract List<DirectiveInfo> getDirectives();

    @Nullable
    public abstract String getFailureMessage();

    public abstract DialogInteractionResult.Type getStatus();

    public abstract boolean hasAgentResponse();

    public abstract boolean hasPreambleResponse();

    public abstract boolean hasRPC();

    public abstract boolean hasRPS();

    public abstract boolean isNetworkFailure();

    public abstract boolean isThirdPartySkill();
}
