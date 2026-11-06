package com.amazon.alexa.hho.navigation.transit.model.response;

import com.amazon.alexa.hho.navigation.transit.model.NavigationSession;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/response/UpdateNavigationSessionResponse;", "", "navigationSession", "Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSession;", "<init>", "(Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSession;)V", "getNavigationSession", "()Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSession;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UpdateNavigationSessionResponse {

    @NotNull
    private final NavigationSession navigationSession;

    public UpdateNavigationSessionResponse(@NotNull NavigationSession navigationSession) {
        navigationSession.getClass();
        this.navigationSession = navigationSession;
    }

    public static /* synthetic */ UpdateNavigationSessionResponse copy$default(UpdateNavigationSessionResponse updateNavigationSessionResponse, NavigationSession navigationSession, int i, Object obj) {
        if ((i & 1) != 0) {
            navigationSession = updateNavigationSessionResponse.navigationSession;
        }
        return updateNavigationSessionResponse.copy(navigationSession);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NavigationSession getNavigationSession() {
        return this.navigationSession;
    }

    @NotNull
    public final UpdateNavigationSessionResponse copy(@NotNull NavigationSession navigationSession) {
        navigationSession.getClass();
        return new UpdateNavigationSessionResponse(navigationSession);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateNavigationSessionResponse) && Intrinsics.areEqual(this.navigationSession, ((UpdateNavigationSessionResponse) other).navigationSession);
    }

    @NotNull
    public final NavigationSession getNavigationSession() {
        return this.navigationSession;
    }

    public int hashCode() {
        return this.navigationSession.hashCode();
    }

    @NotNull
    public String toString() {
        return "UpdateNavigationSessionResponse(navigationSession=" + this.navigationSession + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
