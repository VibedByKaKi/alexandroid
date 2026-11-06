package com.amazon.alexa.accessory.frames.media.models;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"accessoryId", "parentMediaId"}, entity = Media.class, onDelete = 5, parentColumns = {"accessoryId", VoiceBridgePayloadUtil.PayloadKey.PLAYER_INFO_ID})}, primaryKeys = {"accessoryId", "id"})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/models/Thumbnail;", "", "accessoryId", "", "id", "", "fileLocation", "parentMediaId", "createdAt", "<init>", "(Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Builder", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class Thumbnail {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public String accessoryId;

    @JvmField
    @ColumnInfo(name = "createdAt")
    @Nullable
    public String createdAt;

    @JvmField
    @ColumnInfo(name = "fileLocation")
    @Nullable
    public String fileLocation;

    @JvmField
    public long id;

    @JvmField
    @ColumnInfo(name = "parentMediaId")
    public long parentMediaId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/models/Thumbnail$Builder;", "", "<init>", "()V", "accessoryId", "", "id", "", "fileLocation", "parentMediaId", "createdAt", "value", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/alexa/accessory/frames/media/models/Thumbnail;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nThumbnail.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thumbnail.kt\ncom/amazon/alexa/accessory/frames/media/models/Thumbnail$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
    public static final class Builder {

        @NotNull
        private String accessoryId = "";

        @Nullable
        private String createdAt;

        @Nullable
        private String fileLocation;
        private long id;
        private long parentMediaId;

        @NotNull
        public final Builder accessoryId(@NotNull String value) {
            value.getClass();
            this.accessoryId = value;
            return this;
        }

        @NotNull
        public final Thumbnail build() {
            return new Thumbnail(this.accessoryId, this.id, this.fileLocation, this.parentMediaId, this.createdAt);
        }

        @NotNull
        public final Builder createdAt(@Nullable String value) {
            this.createdAt = value;
            return this;
        }

        @NotNull
        public final Builder fileLocation(@Nullable String value) {
            this.fileLocation = value;
            return this;
        }

        @NotNull
        public final Builder id(long value) {
            this.id = value;
            return this;
        }

        @NotNull
        public final Builder parentMediaId(long value) {
            this.parentMediaId = value;
            return this;
        }
    }

    public /* synthetic */ Thumbnail(String str, long j, String str2, long j2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? null : str3);
    }

    @JvmStatic
    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }

    public static /* synthetic */ Thumbnail copy$default(Thumbnail thumbnail, String str, long j, String str2, long j2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thumbnail.accessoryId;
        }
        if ((i & 2) != 0) {
            j = thumbnail.id;
        }
        if ((i & 4) != 0) {
            str2 = thumbnail.fileLocation;
        }
        if ((i & 8) != 0) {
            j2 = thumbnail.parentMediaId;
        }
        if ((i & 16) != 0) {
            str3 = thumbnail.createdAt;
        }
        String str4 = str2;
        return thumbnail.copy(str, j, str4, j2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessoryId() {
        return this.accessoryId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFileLocation() {
        return this.fileLocation;
    }

    /* renamed from: component4, reason: from getter */
    public final long getParentMediaId() {
        return this.parentMediaId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final Thumbnail copy(@NotNull String accessoryId, long id, @Nullable String fileLocation, long parentMediaId, @Nullable String createdAt) {
        accessoryId.getClass();
        return new Thumbnail(accessoryId, id, fileLocation, parentMediaId, createdAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Thumbnail)) {
            return false;
        }
        Thumbnail thumbnail = (Thumbnail) other;
        return Intrinsics.areEqual(this.accessoryId, thumbnail.accessoryId) && this.id == thumbnail.id && Intrinsics.areEqual(this.fileLocation, thumbnail.fileLocation) && this.parentMediaId == thumbnail.parentMediaId && Intrinsics.areEqual(this.createdAt, thumbnail.createdAt);
    }

    public int hashCode() {
        int m = BitVector$$ExternalSyntheticOutline0.m(this.id, this.accessoryId.hashCode() * 31, 31);
        String str = this.fileLocation;
        int m2 = BitVector$$ExternalSyntheticOutline0.m(this.parentMediaId, (m + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.createdAt;
        return m2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.accessoryId;
        long j = this.id;
        String str2 = this.fileLocation;
        long j2 = this.parentMediaId;
        String str3 = this.createdAt;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("Thumbnail(accessoryId=", str, ", id=", j);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, ", fileLocation=", str2, ", parentMediaId=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(j2, ", createdAt=", str3, m);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/accessory/frames/media/models/Thumbnail$Companion;", "", "<init>", "()V", "builder", "Lcom/amazon/alexa/accessory/frames/media/models/Thumbnail$Builder;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public Thumbnail(@NotNull String str, long j, @Nullable String str2, long j2, @Nullable String str3) {
        str.getClass();
        this.accessoryId = str;
        this.id = j;
        this.fileLocation = str2;
        this.parentMediaId = j2;
        this.createdAt = str3;
    }

    public Thumbnail() {
        this(null, 0L, null, 0L, null, 31, null);
    }
}
