package com.amazon.photos.autosave.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(indices = {@Index(unique = true, value = {"local_item_id"})}, tableName = "autosave_item")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006'"}, d2 = {"Lcom/amazon/photos/autosave/model/AutosaveItem;", "", "id", "", "localItemId", "unifiedId", "folderId", "filePath", "", "state", "Lcom/amazon/photos/autosave/model/AutosaveState;", "mediaType", "Lcom/amazon/photos/autosave/model/MediaType;", "(JJJJLjava/lang/String;Lcom/amazon/photos/autosave/model/AutosaveState;Lcom/amazon/photos/autosave/model/MediaType;)V", "getFilePath", "()Ljava/lang/String;", "getFolderId", "()J", "getId", "getLocalItemId", "getMediaType", "()Lcom/amazon/photos/autosave/model/MediaType;", "getState", "()Lcom/amazon/photos/autosave/model/AutosaveState;", "getUnifiedId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosAutosave_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AutosaveItem {

    @ColumnInfo(name = "file_path")
    @NotNull
    private final String filePath;

    @ColumnInfo(name = "folder_id")
    private final long folderId;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private final long id;

    @ColumnInfo(name = "local_item_id")
    private final long localItemId;

    @ColumnInfo(name = "media_type")
    @NotNull
    private final MediaType mediaType;

    @ColumnInfo(name = "state")
    @NotNull
    private final AutosaveState state;

    @ColumnInfo(name = "unified_id")
    private final long unifiedId;

    public AutosaveItem(long j, long j2, long j3, long j4, @NotNull String str, @NotNull AutosaveState autosaveState, @NotNull MediaType mediaType) {
        str.getClass();
        autosaveState.getClass();
        mediaType.getClass();
        this.id = j;
        this.localItemId = j2;
        this.unifiedId = j3;
        this.folderId = j4;
        this.filePath = str;
        this.state = autosaveState;
        this.mediaType = mediaType;
    }

    public static /* synthetic */ AutosaveItem copy$default(AutosaveItem autosaveItem, long j, long j2, long j3, long j4, String str, AutosaveState autosaveState, MediaType mediaType, int i, Object obj) {
        if ((i & 1) != 0) {
            j = autosaveItem.id;
        }
        return autosaveItem.copy(j, (i & 2) != 0 ? autosaveItem.localItemId : j2, (i & 4) != 0 ? autosaveItem.unifiedId : j3, (i & 8) != 0 ? autosaveItem.folderId : j4, (i & 16) != 0 ? autosaveItem.filePath : str, (i & 32) != 0 ? autosaveItem.state : autosaveState, (i & 64) != 0 ? autosaveItem.mediaType : mediaType);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLocalItemId() {
        return this.localItemId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getUnifiedId() {
        return this.unifiedId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getFolderId() {
        return this.folderId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final AutosaveState getState() {
        return this.state;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final MediaType getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final AutosaveItem copy(long id, long localItemId, long unifiedId, long folderId, @NotNull String filePath, @NotNull AutosaveState state, @NotNull MediaType mediaType) {
        filePath.getClass();
        state.getClass();
        mediaType.getClass();
        return new AutosaveItem(id, localItemId, unifiedId, folderId, filePath, state, mediaType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutosaveItem)) {
            return false;
        }
        AutosaveItem autosaveItem = (AutosaveItem) other;
        return this.id == autosaveItem.id && this.localItemId == autosaveItem.localItemId && this.unifiedId == autosaveItem.unifiedId && this.folderId == autosaveItem.folderId && Intrinsics.areEqual(this.filePath, autosaveItem.filePath) && this.state == autosaveItem.state && this.mediaType == autosaveItem.mediaType;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public final long getFolderId() {
        return this.folderId;
    }

    public final long getId() {
        return this.id;
    }

    public final long getLocalItemId() {
        return this.localItemId;
    }

    @NotNull
    public final MediaType getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final AutosaveState getState() {
        return this.state;
    }

    public final long getUnifiedId() {
        return this.unifiedId;
    }

    public int hashCode() {
        return this.mediaType.hashCode() + ((this.state.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(BitVector$$ExternalSyntheticOutline0.m(this.folderId, BitVector$$ExternalSyntheticOutline0.m(this.unifiedId, BitVector$$ExternalSyntheticOutline0.m(this.localItemId, Long.hashCode(this.id) * 31, 31), 31), 31), 31, this.filePath)) * 31);
    }

    @NotNull
    public String toString() {
        return "AutosaveItem(id=" + this.id + ", localItemId=" + this.localItemId + ", unifiedId=" + this.unifiedId + ", folderId=" + this.folderId + ", filePath=" + this.filePath + ", state=" + this.state + ", mediaType=" + this.mediaType + ')';
    }

    public /* synthetic */ AutosaveItem(long j, long j2, long j3, long j4, String str, AutosaveState autosaveState, MediaType mediaType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, j3, j4, str, autosaveState, mediaType);
    }
}
