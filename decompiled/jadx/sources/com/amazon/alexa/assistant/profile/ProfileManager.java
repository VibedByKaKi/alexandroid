package com.amazon.alexa.assistant.profile;

import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import com.amazon.alexa.assistant.foundation.model.ProfileMetadataProvider;
import com.amazon.alexa.assistant.toolkit.lifecycle.LifecycleComponent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAssistantSdkApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\n\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\n\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/profile/ProfileManager;", "Lcom/amazon/alexa/assistant/foundation/model/ProfileMetadataProvider;", "Lcom/amazon/alexa/assistant/toolkit/lifecycle/LifecycleComponent;", "awaitProfileId", "Lkotlin/Result;", "", "awaitProfileId-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTermsAcceptanceStatus", "Lcom/amazon/alexa/assistant/profile/ProfileQueryResult;", "personId", "getTermsAcceptanceStatus-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTermsAcceptanceStatus", "", "setTermsAcceptanceStatus-gIAlu-s", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ProfileManager extends ProfileMetadataProvider, LifecycleComponent {
    @Nullable
    /* renamed from: awaitProfileId-IoAF18A */
    Object mo15066awaitProfileIdIoAF18A(@NotNull Continuation<? super Result<String>> continuation);

    @Nullable
    /* renamed from: getTermsAcceptanceStatus-gIAlu-s */
    Object mo15067getTermsAcceptanceStatusgIAlus(@NotNull String str, @NotNull Continuation<? super Result<ProfileQueryResult>> continuation);

    @Nullable
    /* renamed from: setTermsAcceptanceStatus-gIAlu-s */
    Object mo15068setTermsAcceptanceStatusgIAlus(@NotNull String str, @NotNull Continuation<? super Result<Unit>> continuation);
}
