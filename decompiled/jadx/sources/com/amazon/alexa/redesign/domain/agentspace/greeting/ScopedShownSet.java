package com.amazon.alexa.redesign.domain.agentspace.greeting;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/ScopedShownSet;", "", PermissionsResponse.SCOPE_KEY, "", "shownIds", "", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "getScope", "()Ljava/lang/String;", "getShownIds", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ScopedShownSet {
    public static final int $stable = 8;

    @NotNull
    private final String scope;

    @NotNull
    private final Set<String> shownIds;

    public ScopedShownSet(@NotNull String str, @NotNull Set<String> set) {
        str.getClass();
        set.getClass();
        this.scope = str;
        this.shownIds = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScopedShownSet copy$default(ScopedShownSet scopedShownSet, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scopedShownSet.scope;
        }
        if ((i & 2) != 0) {
            set = scopedShownSet.shownIds;
        }
        return scopedShownSet.copy(str, set);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    @NotNull
    public final Set<String> component2() {
        return this.shownIds;
    }

    @NotNull
    public final ScopedShownSet copy(@NotNull String scope, @NotNull Set<String> shownIds) {
        scope.getClass();
        shownIds.getClass();
        return new ScopedShownSet(scope, shownIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScopedShownSet)) {
            return false;
        }
        ScopedShownSet scopedShownSet = (ScopedShownSet) other;
        return Intrinsics.areEqual(this.scope, scopedShownSet.scope) && Intrinsics.areEqual(this.shownIds, scopedShownSet.shownIds);
    }

    @NotNull
    public final String getScope() {
        return this.scope;
    }

    @NotNull
    public final Set<String> getShownIds() {
        return this.shownIds;
    }

    public int hashCode() {
        return this.shownIds.hashCode() + (this.scope.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ScopedShownSet(scope=" + this.scope + ", shownIds=" + this.shownIds + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
