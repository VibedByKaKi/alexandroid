package com.amazon.photos.uploader.cds.nodecache;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.ui.web.AlexaDeviceBackgroundImageBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(primaryKeys = {"path"}, tableName = "parent_id")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/photos/uploader/cds/nodecache/ParentId;", "", "path", "", AlexaDeviceBackgroundImageBridge.KEY_NODE_ID, "(Ljava/lang/String;Ljava/lang/String;)V", "getNodeId", "()Ljava/lang/String;", "getPath", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ParentId {

    @ColumnInfo(name = "node_id")
    @NotNull
    private final String nodeId;

    @ColumnInfo(name = "path")
    @NotNull
    private final String path;

    public ParentId(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.path = str;
        this.nodeId = str2;
    }

    public static /* synthetic */ ParentId copy$default(ParentId parentId, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = parentId.path;
        }
        if ((i & 2) != 0) {
            str2 = parentId.nodeId;
        }
        return parentId.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    public final ParentId copy(@NotNull String path, @NotNull String nodeId) {
        path.getClass();
        nodeId.getClass();
        return new ParentId(path, nodeId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParentId)) {
            return false;
        }
        ParentId parentId = (ParentId) other;
        return Intrinsics.areEqual(this.path, parentId.path) && Intrinsics.areEqual(this.nodeId, parentId.nodeId);
    }

    @NotNull
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.nodeId.hashCode() + (this.path.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ParentId(path=");
        sb.append(this.path);
        sb.append(", nodeId=");
        return ArcMode$$ExternalSyntheticOutline0.m(')', this.nodeId, sb);
    }
}
