package com.here.sdk.mapview;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.here.NativeBase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class IconProviderInternal extends NativeBase {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @FunctionalInterface
    public interface CreateIconCallback {
        void onCreateIconReply(@Nullable byte[] bArr, @Nullable String str, @Nullable IconProviderError iconProviderError);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CreateIconCallbackImpl extends NativeBase implements CreateIconCallback {
        public CreateIconCallbackImpl(long j, Object obj) {
            super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.IconProviderInternal.CreateIconCallbackImpl.1
                @Override // com.here.NativeBase.Disposer
                public void disposeNative(long j2) {
                    CreateIconCallbackImpl.disposeNativeHandle(j2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native void disposeNativeHandle(long j);

        @Override // com.here.sdk.mapview.IconProviderInternal.CreateIconCallback
        public native void onCreateIconReply(@Nullable byte[] bArr, @Nullable String str, @Nullable IconProviderError iconProviderError);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class VehicleRestrictionIconAttributes {

        @NonNull
        public String countryCode;
        public boolean isActive;
        public boolean isTimeDependant;

        @NonNull
        public String localizedText;

        @NonNull
        public String restrictionCategory;

        @NonNull
        public String restrictionType;

        public VehicleRestrictionIconAttributes(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, boolean z, boolean z2) {
            this.restrictionCategory = str;
            this.restrictionType = str2;
            this.countryCode = str3;
            this.localizedText = str4;
            this.isTimeDependant = z;
            this.isActive = z2;
        }
    }

    public IconProviderInternal(@NonNull MapContext mapContext) {
        this(create(mapContext), null);
        cacheThisInstance();
    }

    private native void cacheThisInstance();

    private static native long create(@NonNull MapContext mapContext);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void disposeNativeHandle(long j);

    public native void createRoadShieldIcon(@NonNull RoadShieldIconProperties roadShieldIconProperties, @NonNull MapScheme mapScheme, @NonNull IconProviderAssetType iconProviderAssetType, long j, long j2, @NonNull CreateIconCallback createIconCallback);

    public native void createVehicleRestrictionIcon(@NonNull VehicleRestrictionIconAttributes vehicleRestrictionIconAttributes, @NonNull MapScheme mapScheme, @NonNull IconProviderAssetType iconProviderAssetType, long j, long j2, @NonNull CreateIconCallback createIconCallback);

    public IconProviderInternal(long j, Object obj) {
        super(j, new NativeBase.Disposer() { // from class: com.here.sdk.mapview.IconProviderInternal.1
            @Override // com.here.NativeBase.Disposer
            public void disposeNative(long j2) {
                IconProviderInternal.disposeNativeHandle(j2);
            }
        });
    }
}
