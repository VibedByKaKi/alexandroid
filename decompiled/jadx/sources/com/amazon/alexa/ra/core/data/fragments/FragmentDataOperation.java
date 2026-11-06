package com.amazon.alexa.ra.core.data.fragments;

import androidx.annotation.Keep;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/FragmentDataOperation;", "", "op", "Lcom/amazon/alexa/ra/core/data/fragments/FragmentDataOperationType;", "path", "", "value", "Lkotlinx/serialization/json/JsonElement;", "<init>", "(Lcom/amazon/alexa/ra/core/data/fragments/FragmentDataOperationType;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "getOp", "()Lcom/amazon/alexa/ra/core/data/fragments/FragmentDataOperationType;", "getPath", "()Ljava/lang/String;", "getValue", "()Lkotlinx/serialization/json/JsonElement;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FragmentDataOperation {
    public static final int $stable = 8;

    @SerializedName("op")
    @NotNull
    private final FragmentDataOperationType op;

    @SerializedName("path")
    @NotNull
    private final String path;

    @SerializedName("value")
    @Nullable
    private final JsonElement value;

    public FragmentDataOperation(@NotNull FragmentDataOperationType fragmentDataOperationType, @NotNull String str, @Nullable JsonElement jsonElement) {
        fragmentDataOperationType.getClass();
        str.getClass();
        this.op = fragmentDataOperationType;
        this.path = str;
        this.value = jsonElement;
    }

    public static /* synthetic */ FragmentDataOperation copy$default(FragmentDataOperation fragmentDataOperation, FragmentDataOperationType fragmentDataOperationType, String str, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            fragmentDataOperationType = fragmentDataOperation.op;
        }
        if ((i & 2) != 0) {
            str = fragmentDataOperation.path;
        }
        if ((i & 4) != 0) {
            jsonElement = fragmentDataOperation.value;
        }
        return fragmentDataOperation.copy(fragmentDataOperationType, str, jsonElement);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FragmentDataOperationType getOp() {
        return this.op;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final JsonElement getValue() {
        return this.value;
    }

    @NotNull
    public final FragmentDataOperation copy(@NotNull FragmentDataOperationType op, @NotNull String path, @Nullable JsonElement value) {
        op.getClass();
        path.getClass();
        return new FragmentDataOperation(op, path, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentDataOperation)) {
            return false;
        }
        FragmentDataOperation fragmentDataOperation = (FragmentDataOperation) other;
        return this.op == fragmentDataOperation.op && Intrinsics.areEqual(this.path, fragmentDataOperation.path) && Intrinsics.areEqual(this.value, fragmentDataOperation.value);
    }

    @NotNull
    public final FragmentDataOperationType getOp() {
        return this.op;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final JsonElement getValue() {
        return this.value;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.op.hashCode() * 31, 31, this.path);
        JsonElement jsonElement = this.value;
        return m + (jsonElement == null ? 0 : jsonElement.hashCode());
    }

    @NotNull
    public String toString() {
        return "FragmentDataOperation(op=" + this.op + ", path=" + this.path + ", value=" + this.value + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ FragmentDataOperation(FragmentDataOperationType fragmentDataOperationType, String str, JsonElement jsonElement, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentDataOperationType, str, (i & 4) != 0 ? null : jsonElement);
    }
}
