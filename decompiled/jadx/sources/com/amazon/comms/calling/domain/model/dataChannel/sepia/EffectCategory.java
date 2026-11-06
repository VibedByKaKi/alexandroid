package com.amazon.comms.calling.domain.model.dataChannel.sepia;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/EffectCategory;", "", "name", "", Content.THUMBNAIL, "icons", "", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaIcon;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getThumbnail", "getIcons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class EffectCategory {

    @SerializedName("icons")
    @Nullable
    private final List<SepiaIcon> icons;

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName(Content.THUMBNAIL)
    @Nullable
    private final String thumbnail;

    public EffectCategory(@NotNull String str, @Nullable String str2, @Nullable List<SepiaIcon> list) {
        str.getClass();
        this.name = str;
        this.thumbnail = str2;
        this.icons = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EffectCategory copy$default(EffectCategory effectCategory, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = effectCategory.name;
        }
        if ((i & 2) != 0) {
            str2 = effectCategory.thumbnail;
        }
        if ((i & 4) != 0) {
            list = effectCategory.icons;
        }
        return effectCategory.copy(str, str2, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    public final List<SepiaIcon> component3() {
        return this.icons;
    }

    @NotNull
    public final EffectCategory copy(@NotNull String name, @Nullable String thumbnail, @Nullable List<SepiaIcon> icons) {
        name.getClass();
        return new EffectCategory(name, thumbnail, icons);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EffectCategory)) {
            return false;
        }
        EffectCategory effectCategory = (EffectCategory) other;
        return Intrinsics.areEqual(this.name, effectCategory.name) && Intrinsics.areEqual(this.thumbnail, effectCategory.thumbnail) && Intrinsics.areEqual(this.icons, effectCategory.icons);
    }

    @Nullable
    public final List<SepiaIcon> getIcons() {
        return this.icons;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.thumbnail;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<SepiaIcon> list = this.icons;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.icons, ErrorUtils$$ExternalSyntheticOutline0.m("EffectCategory(name=", this.name, ", thumbnail=", this.thumbnail, ", icons="));
    }
}
