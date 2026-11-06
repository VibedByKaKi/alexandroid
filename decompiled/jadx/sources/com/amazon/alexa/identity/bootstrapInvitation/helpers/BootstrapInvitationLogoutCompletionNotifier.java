package com.amazon.alexa.identity.bootstrapInvitation.helpers;

import rx.subjects.PublishSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final class BootstrapInvitationLogoutCompletionNotifier {
    private static final PublishSubject<Boolean> signOutCompletionSubject = PublishSubject.create();

    private BootstrapInvitationLogoutCompletionNotifier() {
        throw new AssertionError("Utility class - no instantiation intended");
    }

    public static PublishSubject<Boolean> getSignOutCompletionSubject() {
        return signOutCompletionSubject;
    }

    public static void notifySignOutCompleted() {
        signOutCompletionSubject.onNext(Boolean.TRUE);
    }
}
