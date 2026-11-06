package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/Greeting;", "", "primaryText", "", "secondaryText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPrimaryText", "()Ljava/lang/String;", "setPrimaryText", "(Ljava/lang/String;)V", "getSecondaryText", "setSecondaryText", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class Greeting {
    public static final int $stable = 8;

    @Nullable
    private String primaryText;

    @Nullable
    private String secondaryText;

    public /* synthetic */ Greeting(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ Greeting copy$default(Greeting greeting, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = greeting.primaryText;
        }
        if ((i & 2) != 0) {
            str2 = greeting.secondaryText;
        }
        return greeting.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPrimaryText() {
        return this.primaryText;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    @NotNull
    public final Greeting copy(@JsonProperty("primaryText") @Nullable String primaryText, @JsonProperty("secondaryText") @Nullable String secondaryText) {
        return new Greeting(primaryText, secondaryText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Greeting)) {
            return false;
        }
        Greeting greeting = (Greeting) other;
        return Intrinsics.areEqual(this.primaryText, greeting.primaryText) && Intrinsics.areEqual(this.secondaryText, greeting.secondaryText);
    }

    @Nullable
    public final String getPrimaryText() {
        return this.primaryText;
    }

    @Nullable
    public final String getSecondaryText() {
        return this.secondaryText;
    }

    public int hashCode() {
        String str = this.primaryText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondaryText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setPrimaryText(@Nullable String str) {
        this.primaryText = str;
    }

    public final void setSecondaryText(@Nullable String str) {
        this.secondaryText = str;
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("Greeting(primaryText=", this.primaryText, ", secondaryText=", this.secondaryText, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @JsonCreator
    public Greeting(@JsonProperty("primaryText") @Nullable String str, @JsonProperty("secondaryText") @Nullable String str2) {
        this.primaryText = str;
        this.secondaryText = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public Greeting() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
