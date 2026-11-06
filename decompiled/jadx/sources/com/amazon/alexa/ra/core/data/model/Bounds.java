package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/Bounds;", "", "x", "", "y", "width", "height", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getX", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getY", "getWidth", "getHeight", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/amazon/alexa/ra/core/data/model/Bounds;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class Bounds {
    public static final int $stable = 0;

    @SerializedName("height")
    @Nullable
    private final Integer height;

    @SerializedName("width")
    @Nullable
    private final Integer width;

    @SerializedName("x")
    @Nullable
    private final Integer x;

    @SerializedName("y")
    @Nullable
    private final Integer y;

    public /* synthetic */ Bounds(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 200 : num, (i & 2) != 0 ? 200 : num2, (i & 4) != 0 ? 400 : num3, (i & 8) != 0 ? 600 : num4);
    }

    public static /* synthetic */ Bounds copy$default(Bounds bounds, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bounds.x;
        }
        if ((i & 2) != 0) {
            num2 = bounds.y;
        }
        if ((i & 4) != 0) {
            num3 = bounds.width;
        }
        if ((i & 8) != 0) {
            num4 = bounds.height;
        }
        return bounds.copy(num, num2, num3, num4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getX() {
        return this.x;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getY() {
        return this.y;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @NotNull
    public final Bounds copy(@Nullable Integer x, @Nullable Integer y, @Nullable Integer width, @Nullable Integer height) {
        return new Bounds(x, y, width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bounds)) {
            return false;
        }
        Bounds bounds = (Bounds) other;
        return Intrinsics.areEqual(this.x, bounds.x) && Intrinsics.areEqual(this.y, bounds.y) && Intrinsics.areEqual(this.width, bounds.width) && Intrinsics.areEqual(this.height, bounds.height);
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    public final Integer getX() {
        return this.x;
    }

    @Nullable
    public final Integer getY() {
        return this.y;
    }

    public int hashCode() {
        Integer num = this.x;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.y;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.width;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.height;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Bounds(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public Bounds(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.x = num;
        this.y = num2;
        this.width = num3;
        this.height = num4;
    }

    public Bounds() {
        this(null, null, null, null, 15, null);
    }
}
