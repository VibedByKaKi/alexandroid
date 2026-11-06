package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;", "", "id", "", "greetingText", "templateKeys", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getGreetingText", "getTemplateKeys", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class GreetingItemDomain {
    public static final int $stable = 8;

    @Nullable
    private final String greetingText;

    @Nullable
    private final String id;

    @Nullable
    private final List<String> templateKeys;

    public /* synthetic */ GreetingItemDomain(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GreetingItemDomain copy$default(GreetingItemDomain greetingItemDomain, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = greetingItemDomain.id;
        }
        if ((i & 2) != 0) {
            str2 = greetingItemDomain.greetingText;
        }
        if ((i & 4) != 0) {
            list = greetingItemDomain.templateKeys;
        }
        return greetingItemDomain.copy(str, str2, list);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getGreetingText() {
        return this.greetingText;
    }

    @Nullable
    public final List<String> component3() {
        return this.templateKeys;
    }

    @NotNull
    public final GreetingItemDomain copy(@Nullable String id, @Nullable String greetingText, @Nullable List<String> templateKeys) {
        return new GreetingItemDomain(id, greetingText, templateKeys);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GreetingItemDomain)) {
            return false;
        }
        GreetingItemDomain greetingItemDomain = (GreetingItemDomain) other;
        return Intrinsics.areEqual(this.id, greetingItemDomain.id) && Intrinsics.areEqual(this.greetingText, greetingItemDomain.greetingText) && Intrinsics.areEqual(this.templateKeys, greetingItemDomain.templateKeys);
    }

    @Nullable
    public final String getGreetingText() {
        return this.greetingText;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final List<String> getTemplateKeys() {
        return this.templateKeys;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.greetingText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.templateKeys;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.templateKeys, ErrorUtils$$ExternalSyntheticOutline0.m("GreetingItemDomain(id=", this.id, ", greetingText=", this.greetingText, ", templateKeys="));
    }

    public GreetingItemDomain(@Nullable String str, @Nullable String str2, @Nullable List<String> list) {
        this.id = str;
        this.greetingText = str2;
        this.templateKeys = list;
    }

    public GreetingItemDomain() {
        this(null, null, null, 7, null);
    }
}
