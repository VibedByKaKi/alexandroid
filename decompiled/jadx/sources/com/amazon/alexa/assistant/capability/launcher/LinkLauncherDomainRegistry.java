package com.amazon.alexa.assistant.capability.launcher;

import com.amazon.identity.auth.device.api.MAPAccountManager;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u000e\u0010\f\u001a\u00020\bH¦@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/capability/launcher/LinkLauncherDomainRegistry;", "", "isRegistered", "", "domain", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, "", "Ljava/net/URL;", "(Ljava/net/URL;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deregister", "deregisterAllDomains", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface LinkLauncherDomainRegistry {
    @Nullable
    Object deregister(@NotNull URL url, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object deregisterAllDomains(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object isRegistered(@NotNull String str, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object register(@NotNull URL url, @NotNull Continuation<? super Unit> continuation);
}
