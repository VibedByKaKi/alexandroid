package com.amazon.whisperjoin.devicesetupserviceandroidclient.internal.retrofit;

import com.amazon.whisperjoin.devicesetupserviceandroidclient.data.FFSAllowListPolicyResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface FFSApiGatewayInterface {
    @GET("fetchConfig")
    Call<FFSAllowListPolicyResponse> getFFSAllowListPolicy(@Query("deviceModel") String str, @Query("manufacturer") String str2, @Query("firmwareVersion") String str3, @Query("platform") String str4, @Query("application") String str5, @Query("applicationVersion") String str6, @Query("marketplace") String str7, @Query("customerId") String str8);
}
