package com.amazon.alexa.client.alexaservice.features.geolocation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class GooglePlayLocationComponent$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GooglePlayLocationComponent f$0;

    public /* synthetic */ GooglePlayLocationComponent$$ExternalSyntheticLambda0(GooglePlayLocationComponent googlePlayLocationComponent, int i) {
        this.$r8$classId = i;
        this.f$0 = googlePlayLocationComponent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        GooglePlayLocationComponent googlePlayLocationComponent = this.f$0;
        switch (i) {
            case 0:
                googlePlayLocationComponent.prefetchLocationDataIfConnected();
                break;
            default:
                googlePlayLocationComponent.reconnectGoogleApiClient();
                break;
        }
    }
}
