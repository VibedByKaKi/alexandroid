package com.amazon.alexa.biloba.service;

import com.amazon.alexa.biloba.generated.network.SchedulerProvider;
import com.amazon.alexa.biloba.model.TimeZones;
import com.dee.app.http.CoralService;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TimeZoneApi {
    public static final String TAG = "TimeZoneApi";
    CoralService coralService;
    SchedulerProvider schedulerProvider;

    public TimeZoneApi(CoralService coralService, SchedulerProvider schedulerProvider) {
        this.coralService = coralService;
        this.schedulerProvider = schedulerProvider;
    }

    private CoralService.Request getTimeZonesRequest() {
        return this.coralService.request("/api/available-time-zones-by-region");
    }

    public CoralService getCoralService() {
        return this.coralService;
    }

    public SchedulerProvider getSchedulerProvider() {
        return this.schedulerProvider;
    }

    public Observable<TimeZones> getTimeZonesObservable() {
        return getTimeZonesRequest().get().as(TimeZones.class).toObservable().observeOn(this.schedulerProvider.ui()).subscribeOn(this.schedulerProvider.io());
    }

    public void setCoralService(CoralService coralService) {
        this.coralService = coralService;
    }

    public void setSchedulerProvider(SchedulerProvider schedulerProvider) {
        this.schedulerProvider = schedulerProvider;
    }

    public TimeZoneApi() {
    }
}
