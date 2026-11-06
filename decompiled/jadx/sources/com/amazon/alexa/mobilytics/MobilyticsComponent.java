package com.amazon.alexa.mobilytics;

import com.amazon.alexa.mobilytics.dependencies.MobilyticsModule;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {MobilyticsModule.class})
@Singleton
/* loaded from: classes18.dex */
public interface MobilyticsComponent {
    Mobilytics mobilytics();
}
