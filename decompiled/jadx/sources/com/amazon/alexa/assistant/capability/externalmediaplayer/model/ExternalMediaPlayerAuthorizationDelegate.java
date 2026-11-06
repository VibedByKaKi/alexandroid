package com.amazon.alexa.assistant.capability.externalmediaplayer.model;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/capability/externalmediaplayer/model/ExternalMediaPlayerAuthorizationDelegate;", "", "login", "Lkotlin/Result;", "", "accessToken", "", HintConstants.AUTOFILL_HINT_USERNAME, "forceLogin", "", "login-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "logout-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "play", "playbackContextToken", "index", "", "offsetInMilliseconds", "play-BWLJW6A", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface ExternalMediaPlayerAuthorizationDelegate {
    @Nullable
    /* renamed from: login-BWLJW6A */
    Object mo14936loginBWLJW6A(@NotNull String str, @NotNull String str2, boolean z, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: logout-IoAF18A */
    Object mo14937logoutIoAF18A(@NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* renamed from: play-BWLJW6A */
    Object mo14940playBWLJW6A(@NotNull String str, long j, long j2, @NotNull Continuation<? super Result<Unit>> continuation);
}
