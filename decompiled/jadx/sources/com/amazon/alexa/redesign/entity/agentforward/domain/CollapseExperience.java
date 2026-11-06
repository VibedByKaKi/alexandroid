package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/CollapseExperience;", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;", "appComponent", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/AppComponent;", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/AppComponent;)V", "getAppComponent", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/AppComponent;", "setAppComponent", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class CollapseExperience implements ContentAction {
    public static final int $stable = 8;

    @Nullable
    private AppComponent appComponent;

    public /* synthetic */ CollapseExperience(AppComponent appComponent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : appComponent);
    }

    public static /* synthetic */ CollapseExperience copy$default(CollapseExperience collapseExperience, AppComponent appComponent, int i, Object obj) {
        if ((i & 1) != 0) {
            appComponent = collapseExperience.appComponent;
        }
        return collapseExperience.copy(appComponent);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final AppComponent getAppComponent() {
        return this.appComponent;
    }

    @NotNull
    public final CollapseExperience copy(@JsonProperty("appComponent") @Nullable AppComponent appComponent) {
        return new CollapseExperience(appComponent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CollapseExperience) && Intrinsics.areEqual(this.appComponent, ((CollapseExperience) other).appComponent);
    }

    @Nullable
    public final AppComponent getAppComponent() {
        return this.appComponent;
    }

    public int hashCode() {
        AppComponent appComponent = this.appComponent;
        if (appComponent == null) {
            return 0;
        }
        return appComponent.hashCode();
    }

    public final void setAppComponent(@Nullable AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    @NotNull
    public String toString() {
        return "CollapseExperience(appComponent=" + this.appComponent + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public CollapseExperience(@JsonProperty("appComponent") @Nullable AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public CollapseExperience() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
