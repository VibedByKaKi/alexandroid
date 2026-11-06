package com.amazon.alexa.protocols.usermessage;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public interface UserMessageService {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface MessageBuilder {
        void show();

        @NonNull
        MessageBuilder withAction(@StringRes int i, @NonNull Runnable runnable);

        @NonNull
        MessageBuilder withCancel(@StringRes int i, @NonNull Runnable runnable);

        @NonNull
        MessageBuilder withDismiss(@NonNull Runnable runnable);
    }

    @NonNull
    MessageBuilder message(@StringRes int i);

    @NonNull
    MessageBuilder message(CharSequence charSequence);
}
