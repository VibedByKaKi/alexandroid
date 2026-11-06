package com.amazon.alexa.ra.core.data.fragments;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.konan.library.NativeLibraryConstantsKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/ItemGraphic;", "", "type", "", "value", NativeLibraryConstantsKt.KONAN_DISTRIBUTION_SOURCES_DIR, "", "Lcom/amazon/alexa/ra/core/data/fragments/ImageData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getValue", "getSources", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ItemGraphic {

    @NotNull
    public static final String TYPE = "type";

    @NotNull
    public static final String TYPE_ICON = "icon";

    @NotNull
    public static final String TYPE_IMAGE = "image";

    @NotNull
    public static final String VALUE = "value";

    @NotNull
    private final List<ImageData> sources;

    @NotNull
    private final String type;

    @NotNull
    private final String value;
    public static final int $stable = 8;

    public ItemGraphic(@NotNull String str, @NotNull String str2, @NotNull List<ImageData> list) {
        ChatData$$ExternalSyntheticOutline0.m(str, str2, list);
        this.type = str;
        this.value = str2;
        this.sources = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ItemGraphic copy$default(ItemGraphic itemGraphic, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemGraphic.type;
        }
        if ((i & 2) != 0) {
            str2 = itemGraphic.value;
        }
        if ((i & 4) != 0) {
            list = itemGraphic.sources;
        }
        return itemGraphic.copy(str, str2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final List<ImageData> component3() {
        return this.sources;
    }

    @NotNull
    public final ItemGraphic copy(@NotNull String type, @NotNull String value, @NotNull List<ImageData> sources) {
        type.getClass();
        value.getClass();
        sources.getClass();
        return new ItemGraphic(type, value, sources);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemGraphic)) {
            return false;
        }
        ItemGraphic itemGraphic = (ItemGraphic) other;
        return Intrinsics.areEqual(this.type, itemGraphic.type) && Intrinsics.areEqual(this.value, itemGraphic.value) && Intrinsics.areEqual(this.sources, itemGraphic.sources);
    }

    @NotNull
    public final List<ImageData> getSources() {
        return this.sources;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.sources.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.type.hashCode() * 31, 31, this.value);
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.sources, ErrorUtils$$ExternalSyntheticOutline0.m("ItemGraphic(type=", this.type, ", value=", this.value, ", sources="));
    }

    public /* synthetic */ ItemGraphic(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }
}
