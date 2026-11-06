package com.here.sdk.mapview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.sdk.mapview.IconProviderInternal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class IconProvider {
    private IconProviderInternal mIconProviderInternal;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface IconCallback {
        void onCreateIconReply(@Nullable Bitmap bitmap, @Nullable String str, @Nullable IconProviderError iconProviderError);
    }

    public IconProvider(MapContext mapContext) {
        this.mIconProviderInternal = new IconProviderInternal(mapContext);
    }

    public void createRoadShieldIcon(@NonNull RoadShieldIconProperties roadShieldIconProperties, @NonNull MapScheme mapScheme, @NonNull IconProviderAssetType iconProviderAssetType, long j, long j2, @NonNull final IconCallback iconCallback) {
        this.mIconProviderInternal.createRoadShieldIcon(roadShieldIconProperties, mapScheme, iconProviderAssetType, j, j2, new IconProviderInternal.CreateIconCallback() { // from class: com.here.sdk.mapview.IconProvider.1
            @Override // com.here.sdk.mapview.IconProviderInternal.CreateIconCallback
            public void onCreateIconReply(@Nullable byte[] bArr, @Nullable String str, @Nullable IconProviderError iconProviderError) {
                if (bArr == null || bArr.length == 0) {
                    iconCallback.onCreateIconReply(null, null, iconProviderError);
                } else {
                    iconCallback.onCreateIconReply(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), str, null);
                }
            }
        });
    }
}
