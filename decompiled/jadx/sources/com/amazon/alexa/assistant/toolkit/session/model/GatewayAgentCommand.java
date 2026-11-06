package com.amazon.alexa.assistant.toolkit.session.model;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/model/GatewayAgentCommand;", "", "<init>", "()V", "VerifyGateway", "Lcom/amazon/alexa/assistant/toolkit/session/model/GatewayAgentCommand$VerifyGateway;", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class GatewayAgentCommand {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/session/model/GatewayAgentCommand$VerifyGateway;", "Lcom/amazon/alexa/assistant/toolkit/session/model/GatewayAgentCommand;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VerifyGateway extends GatewayAgentCommand {

        @NotNull
        public static final VerifyGateway INSTANCE = new VerifyGateway();

        private VerifyGateway() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof VerifyGateway);
        }

        public int hashCode() {
            return 1149267618;
        }

        @NotNull
        public String toString() {
            return "VerifyGateway";
        }
    }

    public /* synthetic */ GatewayAgentCommand(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GatewayAgentCommand() {
    }
}
