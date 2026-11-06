package com.amazon.alexa.assistant.ui.theme;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/assistant/ui/theme/IconConfiguration;", "", "slots", "", "Lcom/amazon/alexa/assistant/ui/theme/IconSlot;", "", "<init>", "(Ljava/util/Map;)V", "getSlots", "()Ljava/util/Map;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class IconConfiguration {
    public static final int $stable = 8;

    @NotNull
    private final Map<IconSlot, Integer> slots;

    public /* synthetic */ IconConfiguration(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IconConfiguration copy$default(IconConfiguration iconConfiguration, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = iconConfiguration.slots;
        }
        return iconConfiguration.copy(map);
    }

    @NotNull
    public final Map<IconSlot, Integer> component1() {
        return this.slots;
    }

    @NotNull
    public final IconConfiguration copy(@NotNull Map<IconSlot, Integer> slots) {
        slots.getClass();
        return new IconConfiguration(slots);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IconConfiguration) && Intrinsics.areEqual(this.slots, ((IconConfiguration) other).slots);
    }

    @NotNull
    public final Map<IconSlot, Integer> getSlots() {
        return this.slots;
    }

    public int hashCode() {
        return this.slots.hashCode();
    }

    @NotNull
    public String toString() {
        return "IconConfiguration(slots=" + this.slots + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public IconConfiguration(@NotNull Map<IconSlot, Integer> map) {
        map.getClass();
        this.slots = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IconConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
