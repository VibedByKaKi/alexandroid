package com.amazon.dee.app.services.environment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class DataRegionEnvironmentService$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DataRegionEnvironmentService f$0;

    public /* synthetic */ DataRegionEnvironmentService$$ExternalSyntheticLambda0(DataRegionEnvironmentService dataRegionEnvironmentService, int i) {
        this.$r8$classId = i;
        this.f$0 = dataRegionEnvironmentService;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit handleIdentityChanged$lambda$5;
        Unit endpointsFromServer$lambda$9;
        Unit handleColdStart$lambda$2;
        int i = this.$r8$classId;
        DataRegionEnvironmentService dataRegionEnvironmentService = this.f$0;
        Endpoints endpoints = (Endpoints) obj;
        switch (i) {
            case 0:
                handleIdentityChanged$lambda$5 = DataRegionEnvironmentService.handleIdentityChanged$lambda$5(dataRegionEnvironmentService, endpoints);
                return handleIdentityChanged$lambda$5;
            case 1:
                endpointsFromServer$lambda$9 = DataRegionEnvironmentService.getEndpointsFromServer$lambda$9(dataRegionEnvironmentService, endpoints);
                return endpointsFromServer$lambda$9;
            default:
                handleColdStart$lambda$2 = DataRegionEnvironmentService.handleColdStart$lambda$2(dataRegionEnvironmentService, endpoints);
                return handleColdStart$lambda$2;
        }
    }
}
