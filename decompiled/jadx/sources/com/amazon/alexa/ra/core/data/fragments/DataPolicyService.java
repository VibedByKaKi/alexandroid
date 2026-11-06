package com.amazon.alexa.ra.core.data.fragments;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.utils.JSONConvertible;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/DataPolicyService;", "Lcom/amazon/alexa/ra/core/data/utils/JSONConvertible;", "namespace", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNamespace", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class DataPolicyService implements JSONConvertible {
    public static final int $stable = 0;

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String NAMESPACE = "namespace";

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName("namespace")
    @NotNull
    private final String namespace;

    public DataPolicyService(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.namespace = str;
        this.name = str2;
    }

    public static /* synthetic */ DataPolicyService copy$default(DataPolicyService dataPolicyService, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dataPolicyService.namespace;
        }
        if ((i & 2) != 0) {
            str2 = dataPolicyService.name;
        }
        return dataPolicyService.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getNamespace() {
        return this.namespace;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final DataPolicyService copy(@NotNull String namespace, @NotNull String name) {
        namespace.getClass();
        name.getClass();
        return new DataPolicyService(namespace, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataPolicyService)) {
            return false;
        }
        DataPolicyService dataPolicyService = (DataPolicyService) other;
        return Intrinsics.areEqual(this.namespace, dataPolicyService.namespace) && Intrinsics.areEqual(this.name, dataPolicyService.name);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.namespace.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("DataPolicyService(namespace=", this.namespace, ", name=", this.name, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
