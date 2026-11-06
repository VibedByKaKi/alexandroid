package com.amazon.alexa.benefits.models.service;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AppSchedulerProvider implements SchedulerProvider {
    @Override // com.amazon.alexa.benefits.models.service.SchedulerProvider
    public Scheduler io() {
        return Schedulers.io();
    }

    @Override // com.amazon.alexa.benefits.models.service.SchedulerProvider
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }
}
