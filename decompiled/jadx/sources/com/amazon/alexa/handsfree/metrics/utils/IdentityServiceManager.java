package com.amazon.alexa.handsfree.metrics.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.eventbus.message.EventTypeMessageFilter;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.identity.api.IdentityEvent;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class IdentityServiceManager {
    private static final String TAG = "IdentityServiceManager";
    private static IdentityServiceManager sInstance;
    private final IdentityService mIdentityService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UserChangeListener {
        void onUserChanged(@Nullable UserIdentity userIdentity);
    }

    @Inject
    public IdentityServiceManager(@Nullable IdentityService identityService) {
        this.mIdentityService = identityService;
    }

    public void addUserChangeListener(@NonNull final UserChangeListener userChangeListener) {
        if (this.mIdentityService == null) {
            Log.w(TAG, "IdentityService could not be found.");
        } else {
            provideEventBus().getSubscriber().subscribeFilter(new EventTypeMessageFilter(IdentityEvent.IDENTITY_CHANGED), new MessageHandler() { // from class: com.amazon.alexa.handsfree.metrics.utils.IdentityServiceManager.1
                @Override // com.amazon.alexa.eventbus.api.MessageHandler
                /* renamed from: handle */
                public void lambda$subscribe$1(Message message) {
                    userChangeListener.onUserChanged(IdentityServiceManager.this.mIdentityService.getUser(IdentityServiceManager.TAG));
                }
            });
        }
    }

    @Nullable
    public UserIdentity getUser() {
        IdentityService identityService = this.mIdentityService;
        if (identityService != null) {
            return identityService.getUser(TAG);
        }
        return null;
    }

    public boolean hasAcceptedEula() {
        UserIdentity user;
        IdentityService identityService = this.mIdentityService;
        return (identityService == null || (user = identityService.getUser(TAG)) == null || !user.hasAcceptedEula()) ? false : true;
    }

    @NonNull
    @VisibleForTesting
    public EventBus provideEventBus() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(EventBus.class).get();
        return (EventBus) obj;
    }
}
