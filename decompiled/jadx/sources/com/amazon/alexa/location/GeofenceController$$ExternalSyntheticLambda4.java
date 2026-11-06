package com.amazon.alexa.location;

import com.amazon.alexa.mobilytics.event.operational.MobilyticsMetricsCounter;
import com.google.android.gms.location.LocationSettingsRequest;
import io.reactivex.rxjava3.core.CompletableEmitter;
import io.reactivex.rxjava3.core.CompletableOnSubscribe;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class GeofenceController$$ExternalSyntheticLambda4 implements SingleOnSubscribe, Predicate, CompletableOnSubscribe {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ GeofenceController$$ExternalSyntheticLambda4(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        switch (this.$r8$classId) {
            case 0:
                ((GeofenceController) this.f$0).lambda$getLocationSettings$5((LocationSettingsRequest) this.f$1, singleEmitter);
                break;
            default:
                ((AlexaLocationNetworkService) this.f$0).lambda$getGeofencesByDevice$3((String) this.f$1, singleEmitter);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean lambda$onSyncErrorRetryHandler$6;
        lambda$onSyncErrorRetryHandler$6 = DefaultLocationService.lambda$onSyncErrorRetryHandler$6((MobilyticsMetricsCounter) this.f$0, (AtomicInteger) this.f$1, (Throwable) obj);
        return lambda$onSyncErrorRetryHandler$6;
    }

    @Override // io.reactivex.rxjava3.core.CompletableOnSubscribe
    public void subscribe(CompletableEmitter completableEmitter) {
        ((EncryptedLocationDataService) this.f$0).lambda$saveGeofences$1((List) this.f$1, completableEmitter);
    }
}
