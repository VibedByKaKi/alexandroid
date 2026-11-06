package com.amazon.alexa.ra.core.data.model;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.mobile.heremapsexplore.Constants.ReactProperties;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0004\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/ItemValue;", "", "current", "", ReactProperties.GEOFENCE_MINIMUM_RANGE, ReactProperties.GEOFENCE_MAXIMUM_RANGE, "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "getCurrent", "()Ljava/lang/Number;", "getMin", "getMax", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ItemValue {
    public static final int $stable = 8;

    @SerializedName("current")
    @NotNull
    private final Number current;

    @SerializedName(ReactProperties.GEOFENCE_MAXIMUM_RANGE)
    @Nullable
    private final Number max;

    @SerializedName(ReactProperties.GEOFENCE_MINIMUM_RANGE)
    @Nullable
    private final Number min;

    public /* synthetic */ ItemValue(Number number, Number number2, Number number3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : number, (i & 2) != 0 ? 0 : number2, (i & 4) != 0 ? 0 : number3);
    }

    public static /* synthetic */ ItemValue copy$default(ItemValue itemValue, Number number, Number number2, Number number3, int i, Object obj) {
        if ((i & 1) != 0) {
            number = itemValue.current;
        }
        if ((i & 2) != 0) {
            number2 = itemValue.min;
        }
        if ((i & 4) != 0) {
            number3 = itemValue.max;
        }
        return itemValue.copy(number, number2, number3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Number getCurrent() {
        return this.current;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Number getMin() {
        return this.min;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Number getMax() {
        return this.max;
    }

    @NotNull
    public final ItemValue copy(@NotNull Number current, @Nullable Number min, @Nullable Number max) {
        current.getClass();
        return new ItemValue(current, min, max);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemValue)) {
            return false;
        }
        ItemValue itemValue = (ItemValue) other;
        return Intrinsics.areEqual(this.current, itemValue.current) && Intrinsics.areEqual(this.min, itemValue.min) && Intrinsics.areEqual(this.max, itemValue.max);
    }

    @NotNull
    public final Number getCurrent() {
        return this.current;
    }

    @Nullable
    public final Number getMax() {
        return this.max;
    }

    @Nullable
    public final Number getMin() {
        return this.min;
    }

    public int hashCode() {
        int hashCode = this.current.hashCode() * 31;
        Number number = this.min;
        int hashCode2 = (hashCode + (number == null ? 0 : number.hashCode())) * 31;
        Number number2 = this.max;
        return hashCode2 + (number2 != null ? number2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ItemValue(current=" + this.current + ", min=" + this.min + ", max=" + this.max + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public ItemValue(@NotNull Number number, @Nullable Number number2, @Nullable Number number3) {
        number.getClass();
        this.current = number;
        this.min = number2;
        this.max = number3;
    }

    public ItemValue() {
        this(null, null, null, 7, null);
    }
}
