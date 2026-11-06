package com.amazon.alexa.assistant.transport.connection;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.assistant.foundation.logging.Logger;
import com.amazon.alexa.assistant.transport.model.ConnectionState;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.dee.app.contacts.common.constants.Constants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Call;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\fJ\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018J-\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\b\b\u0000\u0010\u001c*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001e¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/amazon/alexa/assistant/transport/connection/ConnectAttempts;", "", "stateMachine", "Lcom/amazon/alexa/assistant/transport/connection/IConnectionStateMachine;", "logger", "Lcom/amazon/alexa/assistant/foundation/logging/Logger;", "<init>", "(Lcom/amazon/alexa/assistant/transport/connection/IConnectionStateMachine;Lcom/amazon/alexa/assistant/foundation/logging/Logger;)V", JoinPoint.SYNCHRONIZATION_LOCK, "generation", "", "downchannelCall", "Lokhttp3/Call;", "current", "supersede", "", "tearDown", "Lkotlin/Pair;", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, "", "attempt", "call", "report", "state", "Lcom/amazon/alexa/assistant/transport/model/ConnectionState;", "(JLcom/amazon/alexa/assistant/transport/model/ConnectionState;)Ljava/lang/Boolean;", "step", "whileCurrent", ExifInterface.GPS_DIRECTION_TRUE, "work", "Lkotlin/Function0;", "(JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnectAttempts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectAttempts.kt\ncom/amazon/alexa/assistant/transport/connection/ConnectAttempts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
/* loaded from: classes17.dex */
public final class ConnectAttempts {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String TAG = "ConnectAttempts";

    @Nullable
    private Call downchannelCall;
    private long generation;

    @NotNull
    private final Object lock;

    @NotNull
    private final Logger logger;

    @NotNull
    private final IConnectionStateMachine stateMachine;

    public ConnectAttempts(@NotNull IConnectionStateMachine iConnectionStateMachine, @NotNull Logger logger) {
        iConnectionStateMachine.getClass();
        logger.getClass();
        this.stateMachine = iConnectionStateMachine;
        this.logger = logger;
        this.lock = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean report$lambda$6(ConnectAttempts connectAttempts, ConnectionState connectionState) {
        return connectAttempts.stateMachine.transitionTo(connectionState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean step$lambda$7(ConnectAttempts connectAttempts, ConnectionState connectionState) {
        return connectAttempts.stateMachine.transitionTo(connectionState);
    }

    public final long current() {
        long j;
        synchronized (this.lock) {
            j = this.generation;
        }
        return j;
    }

    public final boolean register(long attempt, @NotNull Call call) {
        boolean z;
        call.getClass();
        synchronized (this.lock) {
            z = attempt == this.generation;
            if (z) {
                this.downchannelCall = call;
            }
        }
        return z;
    }

    @Nullable
    public final Boolean report(long attempt, @NotNull ConnectionState state) {
        state.getClass();
        Boolean bool = (Boolean) whileCurrent(attempt, new ConnectAttempts$$ExternalSyntheticLambda0(this, state, 0));
        if (bool == null) {
            Logger.DefaultImpls.debug$default(this.logger, TAG, "Ignoring " + state + " from a downchannel that was torn down", null, 4, null);
        }
        return bool;
    }

    public final boolean step(long attempt, @NotNull ConnectionState state) {
        state.getClass();
        Boolean bool = (Boolean) whileCurrent(attempt, new ConnectAttempts$$ExternalSyntheticLambda0(this, state, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new CancellationException("Superseded by a newer connect");
    }

    public final void supersede() {
        synchronized (this.lock) {
            this.generation++;
        }
    }

    @NotNull
    public final Pair<Long, Call> tearDown() {
        Pair<Long, Call> pair;
        synchronized (this.lock) {
            long j = this.generation + 1;
            this.generation = j;
            pair = TuplesKt.to(Long.valueOf(j), this.downchannelCall);
            this.downchannelCall = null;
        }
        return pair;
    }

    @Nullable
    public final <T> T whileCurrent(long attempt, @NotNull Function0<? extends T> work) {
        T invoke;
        work.getClass();
        synchronized (this.lock) {
            invoke = attempt == this.generation ? work.invoke() : null;
        }
        return invoke;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/assistant/transport/connection/ConnectAttempts$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "transport_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
