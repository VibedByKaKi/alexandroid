package com.amazon.alexa.assistant.foundation.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/AlexaProduct;", "", "hostAppName", "", "foregroundApplicationId", "agentModeRef", "datamartNamespace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHostAppName", "()Ljava/lang/String;", "getForegroundApplicationId", "getAgentModeRef", "getDatamartNamespace", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AlexaProduct {

    @Nullable
    private final String agentModeRef;

    @Nullable
    private final String datamartNamespace;

    @Nullable
    private final String foregroundApplicationId;

    @NotNull
    private final String hostAppName;

    public /* synthetic */ AlexaProduct(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ AlexaProduct copy$default(AlexaProduct alexaProduct, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = alexaProduct.hostAppName;
        }
        if ((i & 2) != 0) {
            str2 = alexaProduct.foregroundApplicationId;
        }
        if ((i & 4) != 0) {
            str3 = alexaProduct.agentModeRef;
        }
        if ((i & 8) != 0) {
            str4 = alexaProduct.datamartNamespace;
        }
        return alexaProduct.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getHostAppName() {
        return this.hostAppName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getForegroundApplicationId() {
        return this.foregroundApplicationId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAgentModeRef() {
        return this.agentModeRef;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getDatamartNamespace() {
        return this.datamartNamespace;
    }

    @NotNull
    public final AlexaProduct copy(@NotNull String hostAppName, @Nullable String foregroundApplicationId, @Nullable String agentModeRef, @Nullable String datamartNamespace) {
        hostAppName.getClass();
        return new AlexaProduct(hostAppName, foregroundApplicationId, agentModeRef, datamartNamespace);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlexaProduct)) {
            return false;
        }
        AlexaProduct alexaProduct = (AlexaProduct) other;
        return Intrinsics.areEqual(this.hostAppName, alexaProduct.hostAppName) && Intrinsics.areEqual(this.foregroundApplicationId, alexaProduct.foregroundApplicationId) && Intrinsics.areEqual(this.agentModeRef, alexaProduct.agentModeRef) && Intrinsics.areEqual(this.datamartNamespace, alexaProduct.datamartNamespace);
    }

    @Nullable
    public final String getAgentModeRef() {
        return this.agentModeRef;
    }

    @Nullable
    public final String getDatamartNamespace() {
        return this.datamartNamespace;
    }

    @Nullable
    public final String getForegroundApplicationId() {
        return this.foregroundApplicationId;
    }

    @NotNull
    public final String getHostAppName() {
        return this.hostAppName;
    }

    public int hashCode() {
        int hashCode = this.hostAppName.hashCode() * 31;
        String str = this.foregroundApplicationId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.agentModeRef;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.datamartNamespace;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.hostAppName;
        String str2 = this.foregroundApplicationId;
        return DoubleList$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("AlexaProduct(hostAppName=", str, ", foregroundApplicationId=", str2, ", agentModeRef="), this.agentModeRef, ", datamartNamespace=", this.datamartNamespace, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public AlexaProduct(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        str.getClass();
        this.hostAppName = str;
        this.foregroundApplicationId = str2;
        this.agentModeRef = str3;
        this.datamartNamespace = str4;
    }
}
