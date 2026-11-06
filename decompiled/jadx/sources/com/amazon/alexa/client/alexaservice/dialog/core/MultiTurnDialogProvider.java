package com.amazon.alexa.client.alexaservice.dialog.core;

import com.amazon.alexa.api.ExtendedClient;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class MultiTurnDialogProvider {
    private final DialogAuthority dialogAuthority;
    private final StartDialogTurnCallbacksProvider startDialogTurnCallbacksProvider;

    @Inject
    public MultiTurnDialogProvider(DialogAuthority dialogAuthority, StartDialogTurnCallbacksProvider startDialogTurnCallbacksProvider) {
        this.dialogAuthority = dialogAuthority;
        this.startDialogTurnCallbacksProvider = startDialogTurnCallbacksProvider;
    }

    public MultiTurnDialog create(ExtendedClient extendedClient, DialogLifecycle dialogLifecycle, DialogTurnLifecycle dialogTurnLifecycle, MultiTurnDialogMetadata multiTurnDialogMetadata, boolean z) {
        return MultiTurnDialog.create(extendedClient, dialogLifecycle, dialogTurnLifecycle, this.dialogAuthority, this.startDialogTurnCallbacksProvider, multiTurnDialogMetadata, z);
    }

    public MultiTurnDialog create(ExtendedClient extendedClient, DialogLifecycle dialogLifecycle, DialogTurnLifecycle dialogTurnLifecycle, MultiTurnDialogMetadata multiTurnDialogMetadata) {
        return create(extendedClient, dialogLifecycle, dialogTurnLifecycle, multiTurnDialogMetadata, false);
    }
}
