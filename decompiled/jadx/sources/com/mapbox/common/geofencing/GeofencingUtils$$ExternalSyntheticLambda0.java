package com.mapbox.common.geofencing;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class GeofencingUtils$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ GeofencingUtils$$ExternalSyntheticLambda0(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                GeofencingUtils.setPeer$lambda$0(this.f$0);
                break;
            case 1:
                AddFeatureCallbackNative._init_$lambda$0(this.f$0);
                break;
            case 2:
                AddObserverCallbackNative._init_$lambda$0(this.f$0);
                break;
            case 3:
                ClearFeaturesCallbackNative._init_$lambda$0(this.f$0);
                break;
            case 4:
                ConfigureCallbackNative._init_$lambda$0(this.f$0);
                break;
            case 5:
                GeofencingUtilsUserConsentResponseCallbackNative._init_$lambda$0(this.f$0);
                break;
            case 6:
                GetFeatureCallbackNative._init_$lambda$0(this.f$0);
                break;
            case 7:
                GetOptionsCallbackNative._init_$lambda$0(this.f$0);
                break;
            case 8:
                RemoveFeatureCallbackNative._init_$lambda$0(this.f$0);
                break;
            case 9:
                RemoveObserverCallbackNative._init_$lambda$0(this.f$0);
                break;
            case 10:
                GeofencingFactory.setPeer$lambda$0(this.f$0);
                break;
            case 11:
                GeofencingObserverNative._init_$lambda$0(this.f$0);
                break;
            default:
                GeofencingServiceNative._init_$lambda$0(this.f$0);
                break;
        }
    }
}
