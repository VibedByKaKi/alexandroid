package com.amazon.comms.calling.domain.repo;

import com.amazon.comms.calling.domain.model.SipRegistrationReason;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/RegisterSIPRepository;", "", "registerSIP", "", "reason", "Lcom/amazon/comms/calling/domain/model/SipRegistrationReason;", "callToken", "", "callTokenVersion", "(Lcom/amazon/comms/calling/domain/model/SipRegistrationReason;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSipRegistered", "", "shutDown", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface RegisterSIPRepository {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object registerSIP$default(RegisterSIPRepository registerSIPRepository, SipRegistrationReason sipRegistrationReason, String str, String str2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: registerSIP");
                return null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return registerSIPRepository.registerSIP(sipRegistrationReason, str, str2, continuation);
        }
    }

    boolean isSipRegistered();

    @Nullable
    Object registerSIP(@NotNull SipRegistrationReason sipRegistrationReason, @Nullable String str, @Nullable String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object shutDown(@NotNull Continuation<? super Unit> continuation);
}
