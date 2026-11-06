package com.amazon.photos.discovery.internal.model;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.discovery.internal.util.LocalFolderUtils;
import com.amazon.photos.discovery.model.FolderType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Entity(indices = {@Index(unique = true, value = {"path"})}, tableName = "local_folder")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/amazon/photos/discovery/internal/model/MutableLocalFolder;", "", "id", "", "name", "", "path", "folderType", "Lcom/amazon/photos/discovery/model/FolderType;", "(JLjava/lang/String;Ljava/lang/String;Lcom/amazon/photos/discovery/model/FolderType;)V", "getFolderType", "()Lcom/amazon/photos/discovery/model/FolderType;", "getId", "()J", "getName", "()Ljava/lang/String;", "getPath", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MutableLocalFolder {

    @ColumnInfo(name = "folder_type")
    @NotNull
    private final FolderType folderType;

    @PrimaryKey
    @ColumnInfo(name = "id")
    private final long id;

    @ColumnInfo(name = "name")
    @NotNull
    private final String name;

    @ColumnInfo(name = "path")
    @NotNull
    private final String path;

    public MutableLocalFolder(long j, @NotNull String str, @NotNull String str2, @NotNull FolderType folderType) {
        str.getClass();
        str2.getClass();
        folderType.getClass();
        this.id = j;
        this.name = str;
        this.path = str2;
        this.folderType = folderType;
    }

    public static /* synthetic */ MutableLocalFolder copy$default(MutableLocalFolder mutableLocalFolder, long j, String str, String str2, FolderType folderType, int i, Object obj) {
        if ((i & 1) != 0) {
            j = mutableLocalFolder.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = mutableLocalFolder.name;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = mutableLocalFolder.path;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            folderType = mutableLocalFolder.folderType;
        }
        return mutableLocalFolder.copy(j2, str3, str4, folderType);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final FolderType getFolderType() {
        return this.folderType;
    }

    @NotNull
    public final MutableLocalFolder copy(long id, @NotNull String name, @NotNull String path, @NotNull FolderType folderType) {
        name.getClass();
        path.getClass();
        folderType.getClass();
        return new MutableLocalFolder(id, name, path, folderType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MutableLocalFolder)) {
            return false;
        }
        MutableLocalFolder mutableLocalFolder = (MutableLocalFolder) other;
        return this.id == mutableLocalFolder.id && Intrinsics.areEqual(this.name, mutableLocalFolder.name) && Intrinsics.areEqual(this.path, mutableLocalFolder.path) && this.folderType == mutableLocalFolder.folderType;
    }

    @NotNull
    public final FolderType getFolderType() {
        return this.folderType;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.folderType.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.name), 31, this.path);
    }

    @NotNull
    public String toString() {
        return "MutableLocalFolder(id=" + this.id + ", name=" + this.name + ", path=" + this.path + ", folderType=" + this.folderType + ')';
    }

    public /* synthetic */ MutableLocalFolder(long j, String str, String str2, FolderType folderType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? LocalFolderUtils.getFolderType$AndroidPhotosDiscovery_release$default(LocalFolderUtils.INSTANCE, str2, null, 2, null) : folderType);
    }
}
