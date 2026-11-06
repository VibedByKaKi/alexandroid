package com.amazon.alexa.hho.dependency;

import com.amazon.alexa.hho.api.HHOServiceImpl;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {ApplicationModule.class, HHOModule.class})
@Singleton
/* loaded from: classes13.dex */
public interface HHOComponent {
    void inject(HHOServiceImpl hHOServiceImpl);
}
