package com.amazon.alexa.hho.navigation.transit.model.response;

import com.amazon.alexa.hho.navigation.transit.model.NavigationInstruction;
import com.amazon.alexa.hho.navigation.transit.model.NavigationSession;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/response/RerouteNavigationSessionResponse;", "", "navigationSession", "Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSession;", "instruction", "Lcom/amazon/alexa/hho/navigation/transit/model/NavigationInstruction;", "<init>", "(Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSession;Lcom/amazon/alexa/hho/navigation/transit/model/NavigationInstruction;)V", "getNavigationSession", "()Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSession;", "getInstruction", "()Lcom/amazon/alexa/hho/navigation/transit/model/NavigationInstruction;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RerouteNavigationSessionResponse {

    @Nullable
    private final NavigationInstruction instruction;

    @NotNull
    private final NavigationSession navigationSession;

    public RerouteNavigationSessionResponse(@NotNull NavigationSession navigationSession, @Nullable NavigationInstruction navigationInstruction) {
        navigationSession.getClass();
        this.navigationSession = navigationSession;
        this.instruction = navigationInstruction;
    }

    public static /* synthetic */ RerouteNavigationSessionResponse copy$default(RerouteNavigationSessionResponse rerouteNavigationSessionResponse, NavigationSession navigationSession, NavigationInstruction navigationInstruction, int i, Object obj) {
        if ((i & 1) != 0) {
            navigationSession = rerouteNavigationSessionResponse.navigationSession;
        }
        if ((i & 2) != 0) {
            navigationInstruction = rerouteNavigationSessionResponse.instruction;
        }
        return rerouteNavigationSessionResponse.copy(navigationSession, navigationInstruction);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NavigationSession getNavigationSession() {
        return this.navigationSession;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final NavigationInstruction getInstruction() {
        return this.instruction;
    }

    @NotNull
    public final RerouteNavigationSessionResponse copy(@NotNull NavigationSession navigationSession, @Nullable NavigationInstruction instruction) {
        navigationSession.getClass();
        return new RerouteNavigationSessionResponse(navigationSession, instruction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RerouteNavigationSessionResponse)) {
            return false;
        }
        RerouteNavigationSessionResponse rerouteNavigationSessionResponse = (RerouteNavigationSessionResponse) other;
        return Intrinsics.areEqual(this.navigationSession, rerouteNavigationSessionResponse.navigationSession) && Intrinsics.areEqual(this.instruction, rerouteNavigationSessionResponse.instruction);
    }

    @Nullable
    public final NavigationInstruction getInstruction() {
        return this.instruction;
    }

    @NotNull
    public final NavigationSession getNavigationSession() {
        return this.navigationSession;
    }

    public int hashCode() {
        int hashCode = this.navigationSession.hashCode() * 31;
        NavigationInstruction navigationInstruction = this.instruction;
        return hashCode + (navigationInstruction == null ? 0 : navigationInstruction.hashCode());
    }

    @NotNull
    public String toString() {
        return "RerouteNavigationSessionResponse(navigationSession=" + this.navigationSession + ", instruction=" + this.instruction + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ RerouteNavigationSessionResponse(NavigationSession navigationSession, NavigationInstruction navigationInstruction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navigationSession, (i & 2) != 0 ? null : navigationInstruction);
    }
}
