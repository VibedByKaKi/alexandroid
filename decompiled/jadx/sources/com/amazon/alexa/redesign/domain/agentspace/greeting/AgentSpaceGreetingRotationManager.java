package com.amazon.alexa.redesign.domain.agentspace.greeting;

import com.amazon.alexa.ra.rtvi.RTVIInitializer$$ExternalSyntheticLambda0;
import com.amazon.alexa.redesign.entity.agentforward.network.GreetingItemDomain;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J@\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH&J\b\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/AgentSpaceGreetingRotationManager;", "", "advance", "Lcom/amazon/alexa/redesign/entity/agentforward/network/GreetingItemDomain;", "listKey", "", "scopeKey", "list", "", "canResolve", "Lkotlin/Function1;", "", "resetAll", "", "enforceTtl", "nowMillis", "", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface AgentSpaceGreetingRotationManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String SCOPE_STATIC = "";
    public static final long TTL_MS = 1296000000;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/redesign/domain/agentspace/greeting/AgentSpaceGreetingRotationManager$Companion;", "", "<init>", "()V", "SCOPE_STATIC", "", "TTL_MS", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String SCOPE_STATIC = "";
        public static final long TTL_MS = 1296000000;

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GreetingItemDomain advance$default(AgentSpaceGreetingRotationManager agentSpaceGreetingRotationManager, String str, String str2, List list, Function1 function1, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: advance");
                return null;
            }
            if ((i & 8) != 0) {
                function1 = new RTVIInitializer$$ExternalSyntheticLambda0(17);
            }
            return agentSpaceGreetingRotationManager.advance(str, str2, list, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean advance$lambda$0(GreetingItemDomain greetingItemDomain) {
            greetingItemDomain.getClass();
            return true;
        }
    }

    @Nullable
    GreetingItemDomain advance(@NotNull String listKey, @NotNull String scopeKey, @Nullable List<GreetingItemDomain> list, @NotNull Function1<? super GreetingItemDomain, Boolean> canResolve);

    void enforceTtl(long nowMillis);

    void resetAll();
}
