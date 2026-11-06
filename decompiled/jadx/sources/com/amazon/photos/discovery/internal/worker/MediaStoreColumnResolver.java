package com.amazon.photos.discovery.internal.worker;

import com.amazon.photos.discovery.model.ItemType;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/amazon/photos/discovery/internal/worker/MediaStoreColumnResolver;", "", "()V", "Companion", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MediaStoreColumnResolver {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/amazon/photos/discovery/internal/worker/MediaStoreColumnResolver$Companion;", "", "()V", "getBucketDisplayNameColumn", "", "itemType", "Lcom/amazon/photos/discovery/model/ItemType;", "getBucketIdColumn", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ItemType.values().length];
                try {
                    iArr[ItemType.PHOTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ItemType.VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getBucketDisplayNameColumn(@NotNull ItemType itemType) {
            itemType.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[itemType.ordinal()];
            if (i == 1 || i == 2) {
                return "bucket_display_name";
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        @NotNull
        public final String getBucketIdColumn(@NotNull ItemType itemType) {
            itemType.getClass();
            int i = WhenMappings.$EnumSwitchMapping$0[itemType.ordinal()];
            if (i == 1 || i == 2) {
                return "bucket_id";
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        private Companion() {
        }
    }
}
