package com.amazon.dee.app.services.icon;

import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.eventbus.message.EventTypeMessageFilter;
import com.amazon.alexa.identity.api.IdentityEvent;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService;
import com.amazon.dee.app.dependencies.ApplicationScope;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.ui.main.MainActivity$$ExternalSyntheticLambda2;
import dagger.Lazy;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0010\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B3\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/amazon/dee/app/services/icon/DefaultAppIconInitializer;", "Lcom/amazon/dee/app/services/icon/AppIconInitializer;", "updateAppIconUseCaseLazy", "Ldagger/Lazy;", "Lcom/amazon/dee/app/services/icon/UpdateAppIconUseCase;", "lifecycleServiceLazy", "Lcom/amazon/alexa/protocols/lifecycle/ApplicationLifecycleService;", "eventBusLazy", "Lcom/amazon/alexa/eventbus/api/EventBus;", "<init>", "(Ldagger/Lazy;Ldagger/Lazy;Ldagger/Lazy;)V", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "subscriber", "Lcom/amazon/alexa/eventbus/api/MultiFilterSubscriber;", "lifecycleObserver", "com/amazon/dee/app/services/icon/DefaultAppIconInitializer$lifecycleObserver$1", "Lcom/amazon/dee/app/services/icon/DefaultAppIconInitializer$lifecycleObserver$1;", "initialize", "", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ApplicationScope
/* loaded from: classes5.dex */
public final class DefaultAppIconInitializer implements AppIconInitializer {

    @NotNull
    private static final String FEATURES_UPDATED_EVENT = "featureServiceV2:featuresUpdated";

    @NotNull
    private static final String TAG = "AppIconInitializer";

    @NotNull
    private final Lazy<EventBus> eventBusLazy;

    @NotNull
    private final AtomicBoolean initialized;

    @NotNull
    private final DefaultAppIconInitializer$lifecycleObserver$1 lifecycleObserver;

    @NotNull
    private final Lazy<ApplicationLifecycleService> lifecycleServiceLazy;

    @Nullable
    private MultiFilterSubscriber subscriber;

    @NotNull
    private final Lazy<UpdateAppIconUseCase> updateAppIconUseCaseLazy;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.amazon.dee.app.services.icon.DefaultAppIconInitializer$lifecycleObserver$1] */
    @Inject
    public DefaultAppIconInitializer(@NotNull Lazy<UpdateAppIconUseCase> lazy, @NotNull Lazy<ApplicationLifecycleService> lazy2, @NotNull Lazy<EventBus> lazy3) {
        lazy.getClass();
        lazy2.getClass();
        lazy3.getClass();
        this.updateAppIconUseCaseLazy = lazy;
        this.lifecycleServiceLazy = lazy2;
        this.eventBusLazy = lazy3;
        this.initialized = new AtomicBoolean(false);
        this.lifecycleObserver = new ApplicationLifecycleObserver() { // from class: com.amazon.dee.app.services.icon.DefaultAppIconInitializer$lifecycleObserver$1
            @Override // com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver
            public void onStart() {
                Lazy lazy4;
                lazy4 = DefaultAppIconInitializer.this.updateAppIconUseCaseLazy;
                ((UpdateAppIconUseCase) lazy4.get()).updateIcon();
            }

            @Override // com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleObserver
            public void onStop() {
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$0(DefaultAppIconInitializer defaultAppIconInitializer, Message message) {
        message.getClass();
        defaultAppIconInitializer.updateAppIconUseCaseLazy.get().updateIcon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initialize$lambda$4$lambda$1(Message message) {
        message.getClass();
        return Intrinsics.areEqual(IdentityEvent.IDENTITY_SIGN_OUT_SUCCESS, message.getEventType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$2(DefaultAppIconInitializer defaultAppIconInitializer, Message message) {
        message.getClass();
        defaultAppIconInitializer.updateAppIconUseCaseLazy.get().resetToClassic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3(DefaultAppIconInitializer defaultAppIconInitializer, Message message) {
        message.getClass();
        defaultAppIconInitializer.updateAppIconUseCaseLazy.get().updateIcon();
    }

    @Override // com.amazon.dee.app.services.icon.AppIconInitializer
    public void initialize() {
        if (this.initialized.compareAndSet(false, true)) {
            Log.i(TAG, "Initializing dynamic app icon listeners");
            this.updateAppIconUseCaseLazy.get().updateIcon();
            this.lifecycleServiceLazy.get().addObserver(this.lifecycleObserver);
            MultiFilterSubscriber newSubscriber = this.eventBusLazy.get().getNewSubscriber();
            final int i = 0;
            newSubscriber.subscribeFilter(new EventTypeMessageFilter(IdentityEvent.IDENTITY_CHANGED), new MessageHandler(this) { // from class: com.amazon.dee.app.services.icon.DefaultAppIconInitializer$$ExternalSyntheticLambda0
                public final /* synthetic */ DefaultAppIconInitializer f$0;

                {
                    this.f$0 = this;
                }

                @Override // com.amazon.alexa.eventbus.api.MessageHandler
                /* renamed from: handle */
                public final void lambda$subscribe$1(Message message) {
                    int i2 = i;
                    DefaultAppIconInitializer defaultAppIconInitializer = this.f$0;
                    switch (i2) {
                        case 0:
                            DefaultAppIconInitializer.initialize$lambda$4$lambda$0(defaultAppIconInitializer, message);
                            break;
                        case 1:
                            DefaultAppIconInitializer.initialize$lambda$4$lambda$2(defaultAppIconInitializer, message);
                            break;
                        default:
                            DefaultAppIconInitializer.initialize$lambda$4$lambda$3(defaultAppIconInitializer, message);
                            break;
                    }
                }
            });
            final int i2 = 1;
            newSubscriber.subscribeFilter(new MainActivity$$ExternalSyntheticLambda2(24), new MessageHandler(this) { // from class: com.amazon.dee.app.services.icon.DefaultAppIconInitializer$$ExternalSyntheticLambda0
                public final /* synthetic */ DefaultAppIconInitializer f$0;

                {
                    this.f$0 = this;
                }

                @Override // com.amazon.alexa.eventbus.api.MessageHandler
                /* renamed from: handle */
                public final void lambda$subscribe$1(Message message) {
                    int i22 = i2;
                    DefaultAppIconInitializer defaultAppIconInitializer = this.f$0;
                    switch (i22) {
                        case 0:
                            DefaultAppIconInitializer.initialize$lambda$4$lambda$0(defaultAppIconInitializer, message);
                            break;
                        case 1:
                            DefaultAppIconInitializer.initialize$lambda$4$lambda$2(defaultAppIconInitializer, message);
                            break;
                        default:
                            DefaultAppIconInitializer.initialize$lambda$4$lambda$3(defaultAppIconInitializer, message);
                            break;
                    }
                }
            });
            final int i3 = 2;
            newSubscriber.subscribeFilter(new EventTypeMessageFilter("featureServiceV2:featuresUpdated"), new MessageHandler(this) { // from class: com.amazon.dee.app.services.icon.DefaultAppIconInitializer$$ExternalSyntheticLambda0
                public final /* synthetic */ DefaultAppIconInitializer f$0;

                {
                    this.f$0 = this;
                }

                @Override // com.amazon.alexa.eventbus.api.MessageHandler
                /* renamed from: handle */
                public final void lambda$subscribe$1(Message message) {
                    int i22 = i3;
                    DefaultAppIconInitializer defaultAppIconInitializer = this.f$0;
                    switch (i22) {
                        case 0:
                            DefaultAppIconInitializer.initialize$lambda$4$lambda$0(defaultAppIconInitializer, message);
                            break;
                        case 1:
                            DefaultAppIconInitializer.initialize$lambda$4$lambda$2(defaultAppIconInitializer, message);
                            break;
                        default:
                            DefaultAppIconInitializer.initialize$lambda$4$lambda$3(defaultAppIconInitializer, message);
                            break;
                    }
                }
            });
            this.subscriber = newSubscriber;
        }
    }
}
