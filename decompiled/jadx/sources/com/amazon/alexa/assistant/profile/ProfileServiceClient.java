package com.amazon.alexa.assistant.profile;

import com.amazon.tarazed.metrics.BizMetricsConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/assistant/profile/ProfileServiceClient;", "", "getTermsAcceptanceStatus", "Lkotlin/Result;", "Lcom/amazon/alexa/assistant/profile/ProfileQueryResult;", "personId", "", "getTermsAcceptanceStatus-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultProfileStatus", "getDefaultProfileStatus-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setTermsAcceptanceStatus", "", "status", "Lcom/amazon/alexa/assistant/profile/AlexaTermsConditionsStatus;", "firstName", "lastName", BizMetricsConstants.CUSTOMER_ID, "setTermsAcceptanceStatus-hUnOzRk", "(Ljava/lang/String;Lcom/amazon/alexa/assistant/profile/AlexaTermsConditionsStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ProfileServiceClient {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        /* renamed from: setTermsAcceptanceStatus-hUnOzRk$default, reason: not valid java name */
        public static /* synthetic */ Object m15074setTermsAcceptanceStatushUnOzRk$default(ProfileServiceClient profileServiceClient, String str, AlexaTermsConditionsStatus alexaTermsConditionsStatus, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: setTermsAcceptanceStatus-hUnOzRk");
                return null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                str4 = null;
            }
            return profileServiceClient.mo15072setTermsAcceptanceStatushUnOzRk(str, alexaTermsConditionsStatus, str2, str3, str4, continuation);
        }
    }

    @Nullable
    /* renamed from: getDefaultProfileStatus-IoAF18A */
    Object mo15070getDefaultProfileStatusIoAF18A(@NotNull Continuation<? super Result<ProfileQueryResult>> continuation);

    @Nullable
    /* renamed from: getTermsAcceptanceStatus-gIAlu-s */
    Object mo15071getTermsAcceptanceStatusgIAlus(@NotNull String str, @NotNull Continuation<? super Result<ProfileQueryResult>> continuation);

    @Nullable
    /* renamed from: setTermsAcceptanceStatus-hUnOzRk */
    Object mo15072setTermsAcceptanceStatushUnOzRk(@NotNull String str, @NotNull AlexaTermsConditionsStatus alexaTermsConditionsStatus, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull Continuation<? super Result<Unit>> continuation);
}
