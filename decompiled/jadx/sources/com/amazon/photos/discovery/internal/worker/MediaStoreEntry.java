package com.amazon.photos.discovery.internal.worker;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.photos.discovery.internal.model.MutableLocalFolder;
import com.amazon.photos.discovery.internal.model.MutableLocalItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/amazon/photos/discovery/internal/worker/MediaStoreEntry;", "", "localItem", "Lcom/amazon/photos/discovery/internal/model/MutableLocalItem;", "localFolder", "Lcom/amazon/photos/discovery/internal/model/MutableLocalFolder;", "(Lcom/amazon/photos/discovery/internal/model/MutableLocalItem;Lcom/amazon/photos/discovery/internal/model/MutableLocalFolder;)V", "getLocalFolder", "()Lcom/amazon/photos/discovery/internal/model/MutableLocalFolder;", "getLocalItem", "()Lcom/amazon/photos/discovery/internal/model/MutableLocalItem;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MediaStoreEntry {

    @NotNull
    private final MutableLocalFolder localFolder;

    @NotNull
    private final MutableLocalItem localItem;

    public MediaStoreEntry(@NotNull MutableLocalItem mutableLocalItem, @NotNull MutableLocalFolder mutableLocalFolder) {
        mutableLocalItem.getClass();
        mutableLocalFolder.getClass();
        this.localItem = mutableLocalItem;
        this.localFolder = mutableLocalFolder;
    }

    public static /* synthetic */ MediaStoreEntry copy$default(MediaStoreEntry mediaStoreEntry, MutableLocalItem mutableLocalItem, MutableLocalFolder mutableLocalFolder, int i, Object obj) {
        if ((i & 1) != 0) {
            mutableLocalItem = mediaStoreEntry.localItem;
        }
        if ((i & 2) != 0) {
            mutableLocalFolder = mediaStoreEntry.localFolder;
        }
        return mediaStoreEntry.copy(mutableLocalItem, mutableLocalFolder);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MutableLocalItem getLocalItem() {
        return this.localItem;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MutableLocalFolder getLocalFolder() {
        return this.localFolder;
    }

    @NotNull
    public final MediaStoreEntry copy(@NotNull MutableLocalItem localItem, @NotNull MutableLocalFolder localFolder) {
        localItem.getClass();
        localFolder.getClass();
        return new MediaStoreEntry(localItem, localFolder);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaStoreEntry)) {
            return false;
        }
        MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) other;
        return Intrinsics.areEqual(this.localItem, mediaStoreEntry.localItem) && Intrinsics.areEqual(this.localFolder, mediaStoreEntry.localFolder);
    }

    @NotNull
    public final MutableLocalFolder getLocalFolder() {
        return this.localFolder;
    }

    @NotNull
    public final MutableLocalItem getLocalItem() {
        return this.localItem;
    }

    public int hashCode() {
        return this.localFolder.hashCode() + (this.localItem.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MediaStoreEntry(localItem=" + this.localItem + ", localFolder=" + this.localFolder + ')';
    }
}
