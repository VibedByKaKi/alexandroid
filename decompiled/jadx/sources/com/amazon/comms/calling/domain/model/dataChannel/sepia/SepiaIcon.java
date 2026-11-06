package com.amazon.comms.calling.domain.model.dataChannel.sepia;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import com.amazon.alexa.ra.core.data.fragments.Content;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaIcon;", "", "id", "", "name", Content.THUMBNAIL, VoiceChatContract.COLUMN_IS_ACTIVE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getThumbnail", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class SepiaIcon {

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName(VoiceChatContract.COLUMN_IS_ACTIVE)
    private final boolean isActive;

    @SerializedName("name")
    @NotNull
    private final String name;

    @SerializedName(Content.THUMBNAIL)
    @NotNull
    private final String thumbnail;

    public SepiaIcon(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.id = str;
        this.name = str2;
        this.thumbnail = str3;
        this.isActive = z;
    }

    public static /* synthetic */ SepiaIcon copy$default(SepiaIcon sepiaIcon, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sepiaIcon.id;
        }
        if ((i & 2) != 0) {
            str2 = sepiaIcon.name;
        }
        if ((i & 4) != 0) {
            str3 = sepiaIcon.thumbnail;
        }
        if ((i & 8) != 0) {
            z = sepiaIcon.isActive;
        }
        return sepiaIcon.copy(str, str2, str3, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public final SepiaIcon copy(@NotNull String id, @NotNull String name, @NotNull String thumbnail, boolean isActive) {
        id.getClass();
        name.getClass();
        thumbnail.getClass();
        return new SepiaIcon(id, name, thumbnail, isActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SepiaIcon)) {
            return false;
        }
        SepiaIcon sepiaIcon = (SepiaIcon) other;
        return Intrinsics.areEqual(this.id, sepiaIcon.id) && Intrinsics.areEqual(this.name, sepiaIcon.name) && Intrinsics.areEqual(this.thumbnail, sepiaIcon.thumbnail) && this.isActive == sepiaIcon.isActive;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isActive) + b.a(this.thumbnail, b.a(this.name, this.id.hashCode() * 31, 31), 31);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.thumbnail;
        boolean z = this.isActive;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SepiaIcon(id=", str, ", name=", str2, ", thumbnail=");
        m.append(str3);
        m.append(", isActive=");
        m.append(z);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
