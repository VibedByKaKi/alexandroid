package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/ExpandExperienceDomain;", "Lcom/amazon/alexa/redesign/entity/agentforward/network/ContentActionDomain;", "appComponent", "Lcom/amazon/alexa/redesign/entity/agentforward/network/AppComponentDomain;", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/network/AppComponentDomain;)V", "getAppComponent", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/AppComponentDomain;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ExpandExperienceDomain implements ContentActionDomain {
    public static final int $stable = 8;

    @Nullable
    private final AppComponentDomain appComponent;

    public /* synthetic */ ExpandExperienceDomain(AppComponentDomain appComponentDomain, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : appComponentDomain);
    }

    public static /* synthetic */ ExpandExperienceDomain copy$default(ExpandExperienceDomain expandExperienceDomain, AppComponentDomain appComponentDomain, int i, Object obj) {
        if ((i & 1) != 0) {
            appComponentDomain = expandExperienceDomain.appComponent;
        }
        return expandExperienceDomain.copy(appComponentDomain);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final AppComponentDomain getAppComponent() {
        return this.appComponent;
    }

    @NotNull
    public final ExpandExperienceDomain copy(@Nullable AppComponentDomain appComponent) {
        return new ExpandExperienceDomain(appComponent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExpandExperienceDomain) && Intrinsics.areEqual(this.appComponent, ((ExpandExperienceDomain) other).appComponent);
    }

    @Nullable
    public final AppComponentDomain getAppComponent() {
        return this.appComponent;
    }

    public int hashCode() {
        AppComponentDomain appComponentDomain = this.appComponent;
        if (appComponentDomain == null) {
            return 0;
        }
        return appComponentDomain.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExpandExperienceDomain(appComponent=" + this.appComponent + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ExpandExperienceDomain(@Nullable AppComponentDomain appComponentDomain) {
        this.appComponent = appComponentDomain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandExperienceDomain() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
