package com.mapbox.maps;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/SnapshotStyleListener;", "", "onDidFailLoadingStyle", "", "message", "", "onDidFinishLoadingStyle", "style", "Lcom/mapbox/maps/Style;", "onDidFullyLoadStyle", "onStyleImageMissing", "imageId", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public interface SnapshotStyleListener {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onDidFailLoadingStyle(@NotNull SnapshotStyleListener snapshotStyleListener, @NotNull String str) {
            str.getClass();
        }

        public static void onDidFullyLoadStyle(@NotNull SnapshotStyleListener snapshotStyleListener, @NotNull Style style) {
            style.getClass();
        }

        public static void onStyleImageMissing(@NotNull SnapshotStyleListener snapshotStyleListener, @NotNull String str) {
            str.getClass();
        }
    }

    void onDidFailLoadingStyle(@NotNull String message);

    void onDidFinishLoadingStyle(@NotNull Style style);

    void onDidFullyLoadStyle(@NotNull Style style);

    void onStyleImageMissing(@NotNull String imageId);
}
