package com.amazon.alexa.presence.service.dagger;

import com.amazon.alexa.presence.service.PresenceForegroundService;
import com.amazon.alexa.ra.core.data.fragments.DataPolicy;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(modules = {ForegroundServiceModule.class, ForegroundServiceContextModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/presence/service/dagger/ForegroundServiceComponent;", "", "inject", "", DataPolicy.ENTITY, "Lcom/amazon/alexa/presence/service/PresenceForegroundService;", "AlexaMobileAndroidPresence_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface ForegroundServiceComponent {
    void inject(@NotNull PresenceForegroundService entity);
}
