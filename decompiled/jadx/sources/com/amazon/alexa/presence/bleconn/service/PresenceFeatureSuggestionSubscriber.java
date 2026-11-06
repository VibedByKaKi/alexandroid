package com.amazon.alexa.presence.bleconn.service;

import android.content.Context;
import com.amazon.alexa.presence.bleconn.service.handlers.IdentityRequestedSubscriber;
import com.amazon.alexa.presence.service.PresenceJobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PresenceFeatureSuggestionSubscriber implements IdentityRequestedSubscriber {
    private static final Logger LOG = LoggerFactory.getLogger((Class<?>) PresenceFeatureSuggestionSubscriber.class);
    private final Context ctx;

    public PresenceFeatureSuggestionSubscriber(Context context) {
        this.ctx = context;
    }

    @Override // com.amazon.alexa.presence.bleconn.service.handlers.IdentityRequestedSubscriber
    public void notifyIdentityReadRequested(boolean z, boolean z2, Integer num, boolean z3) {
        if (!z) {
            LOG.debug("Matching relationship not found.  Provided? {}.  Matching? {}.  Matching Type? {}.  Response provided? {} ", Boolean.valueOf(z), Boolean.valueOf(z2), num, Boolean.valueOf(z3));
        } else {
            LOG.debug("Matching relationship found.  Provided? {}.  Matching? {}.  Matching Type? {}.  Response provided? {} ", Boolean.valueOf(z), Boolean.valueOf(z2), num, Boolean.valueOf(z3));
            new PresenceJobService.Helper(this.ctx).schedulePresenceFeatureSuggestNotification();
        }
    }
}
