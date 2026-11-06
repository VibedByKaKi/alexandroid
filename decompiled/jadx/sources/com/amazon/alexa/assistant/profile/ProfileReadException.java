package com.amazon.alexa.assistant.profile;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/assistant/profile/ProfileReadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "Lcom/amazon/alexa/assistant/profile/ProfileReadFailure;", "<init>", "(Lcom/amazon/alexa/assistant/profile/ProfileReadFailure;)V", "getReason", "()Lcom/amazon/alexa/assistant/profile/ProfileReadFailure;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfileReadException extends Exception {

    @NotNull
    private final ProfileReadFailure reason;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileReadException(@NotNull ProfileReadFailure profileReadFailure) {
        super(profileReadFailure.name());
        profileReadFailure.getClass();
        this.reason = profileReadFailure;
    }

    @NotNull
    public final ProfileReadFailure getReason() {
        return this.reason;
    }
}
