package com.amazon.alexa.mobile.assistant.client.apis;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.AlexaConnectingFailedReason;
import com.amazon.alexa.api.compat.model.AlexaConnectionListener;
import com.amazon.alexa.api.compat.model.AlexaReadinessListenerV2;
import com.amazon.alexa.api.compat.model.AlexaReadyStateV2;
import com.amazon.alexa.api.compat.model.ReadinessApiV2;
import com.amazon.alexa.assistant.AssistantState;
import com.amazon.alexa.lifecycle.api.LifecycleEvent;
import com.dee.app.contacts.common.constants.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u001a\u001a\u00020\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/apis/ReadinessApiImpl;", "Lcom/amazon/alexa/api/compat/model/ReadinessApiV2;", "<init>", "()V", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Lcom/amazon/alexa/api/compat/model/AlexaReadinessListenerV2;", "connectionListeners", "Lcom/amazon/alexa/api/compat/model/AlexaConnectionListener;", "currentState", "Lcom/amazon/alexa/api/compat/model/AlexaReadyStateV2;", "currentCategory", "Lcom/amazon/alexa/mobile/assistant/client/apis/ReadinessApiImpl$ConnCategory;", "wasConnected", "", "registerReadinessListener", "", "alexaReadinessListener", "deregisterReadinessListener", "registerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "deregisterListener", "onStateChanged", "state", "Lcom/amazon/alexa/assistant/AssistantState;", "notifyConnectionListeners", "destroy", "ConnCategory", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReadinessApiImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadinessApiImpl.kt\ncom/amazon/alexa/mobile/assistant/client/apis/ReadinessApiImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1#2:177\n1863#3,2:178\n1863#3,2:180\n1863#3,2:182\n1863#3,2:184\n1863#3,2:186\n*S KotlinDebug\n*F\n+ 1 ReadinessApiImpl.kt\ncom/amazon/alexa/mobile/assistant/client/apis/ReadinessApiImpl\n*L\n103#1:178,2\n123#1:180,2\n124#1:182,2\n126#1:184,2\n128#1:186,2\n*E\n"})
/* loaded from: classes18.dex */
public final class ReadinessApiImpl implements ReadinessApiV2 {

    @NotNull
    private static final String TAG = "ReadinessApiImpl";

    @Nullable
    private volatile ConnCategory currentCategory;

    @Nullable
    private volatile AlexaReadyStateV2 currentState;
    private volatile boolean wasConnected;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final CopyOnWriteArraySet<AlexaReadinessListenerV2> listeners = new CopyOnWriteArraySet<>();

    @NotNull
    private final CopyOnWriteArraySet<AlexaConnectionListener> connectionListeners = new CopyOnWriteArraySet<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/apis/ReadinessApiImpl$ConnCategory;", "", "<init>", "(Ljava/lang/String;I)V", "CONNECTED", "DISCONNECTED", "FAILED_UNKNOWN", "FAILED_UNAUTHORIZED", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConnCategory {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ConnCategory[] $VALUES;
        public static final ConnCategory CONNECTED = new ConnCategory("CONNECTED", 0);
        public static final ConnCategory DISCONNECTED = new ConnCategory("DISCONNECTED", 1);
        public static final ConnCategory FAILED_UNKNOWN = new ConnCategory("FAILED_UNKNOWN", 2);
        public static final ConnCategory FAILED_UNAUTHORIZED = new ConnCategory("FAILED_UNAUTHORIZED", 3);

        private static final /* synthetic */ ConnCategory[] $values() {
            return new ConnCategory[]{CONNECTED, DISCONNECTED, FAILED_UNKNOWN, FAILED_UNAUTHORIZED};
        }

        static {
            ConnCategory[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private ConnCategory(String str, int i) {
        }

        @NotNull
        public static EnumEntries<ConnCategory> getEntries() {
            return $ENTRIES;
        }

        public static ConnCategory valueOf(String str) {
            return (ConnCategory) Enum.valueOf(ConnCategory.class, str);
        }

        public static ConnCategory[] values() {
            return (ConnCategory[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConnCategory.values().length];
            try {
                iArr[ConnCategory.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ConnCategory.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ConnCategory.FAILED_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ConnCategory.FAILED_UNAUTHORIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void notifyConnectionListeners(AssistantState state) {
        if (state instanceof AssistantState.Ready) {
            this.wasConnected = true;
        } else if (state instanceof AssistantState.Stopped) {
            this.wasConnected = false;
        }
        ConnCategory categoryOf = INSTANCE.categoryOf(state, this.wasConnected);
        if (categoryOf == null || categoryOf == this.currentCategory) {
            return;
        }
        this.currentCategory = categoryOf;
        int i = WhenMappings.$EnumSwitchMapping$0[categoryOf.ordinal()];
        if (i == 1) {
            Iterator<T> it2 = this.connectionListeners.iterator();
            while (it2.hasNext()) {
                ((AlexaConnectionListener) it2.next()).onConnected();
            }
            return;
        }
        if (i == 2) {
            Iterator<T> it3 = this.connectionListeners.iterator();
            while (it3.hasNext()) {
                ((AlexaConnectionListener) it3.next()).onDisconnected();
            }
        } else if (i == 3) {
            Iterator<T> it4 = this.connectionListeners.iterator();
            while (it4.hasNext()) {
                ((AlexaConnectionListener) it4.next()).onConnectingFailed(AlexaConnectingFailedReason.UNKNOWN, null);
            }
        } else {
            if (i != 4) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return;
            }
            Iterator<T> it5 = this.connectionListeners.iterator();
            while (it5.hasNext()) {
                ((AlexaConnectionListener) it5.next()).onConnectingFailed(AlexaConnectingFailedReason.UNAUTHORIZED, null);
            }
        }
    }

    @Override // com.amazon.alexa.api.compat.model.ReadinessApiV2
    public void deregisterListener(@NotNull AlexaConnectionListener listener) {
        listener.getClass();
        this.connectionListeners.remove(listener);
        this.connectionListeners.size();
    }

    @Override // com.amazon.alexa.api.compat.model.ReadinessApiV2
    public void deregisterReadinessListener(@NotNull AlexaReadinessListenerV2 alexaReadinessListener) {
        alexaReadinessListener.getClass();
        this.listeners.remove(alexaReadinessListener);
        this.listeners.size();
    }

    public final void destroy() {
        this.currentState = null;
        this.currentCategory = null;
        this.wasConnected = false;
        this.listeners.clear();
        this.connectionListeners.clear();
    }

    public final void onStateChanged(@NotNull AssistantState state) {
        boolean z;
        state.getClass();
        if (state instanceof AssistantState.Ready) {
            z = true;
        } else {
            if (!(state instanceof AssistantState.Stopped) && !(state instanceof AssistantState.Starting) && !(state instanceof AssistantState.Unauthorized) && !(state instanceof AssistantState.Error)) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return;
            }
            z = false;
        }
        AlexaReadyStateV2 readyState = INSTANCE.toReadyState(z);
        this.currentState = readyState;
        this.listeners.size();
        Objects.toString(state);
        Objects.toString(readyState);
        Iterator<T> it2 = this.listeners.iterator();
        while (it2.hasNext()) {
            ((AlexaReadinessListenerV2) it2.next()).onReadinessChanged(readyState);
        }
        notifyConnectionListeners(state);
    }

    @Override // com.amazon.alexa.api.compat.model.ReadinessApiV2
    public void registerListener(@NotNull AlexaConnectionListener listener) {
        listener.getClass();
        this.connectionListeners.add(listener);
        if (this.currentCategory == ConnCategory.CONNECTED) {
            listener.onConnected();
        }
        this.connectionListeners.size();
    }

    @Override // com.amazon.alexa.api.compat.model.ReadinessApiV2
    public void registerReadinessListener(@NotNull AlexaReadinessListenerV2 alexaReadinessListener) {
        alexaReadinessListener.getClass();
        this.listeners.add(alexaReadinessListener);
        AlexaReadyStateV2 alexaReadyStateV2 = this.currentState;
        if (alexaReadyStateV2 != null) {
            alexaReadinessListener.onReadinessChanged(alexaReadyStateV2);
        }
        this.listeners.size();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/apis/ReadinessApiImpl$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "toReadyState", "Lcom/amazon/alexa/api/compat/model/AlexaReadyStateV2;", LifecycleEvent.IS_READY, "", "categoryOf", "Lcom/amazon/alexa/mobile/assistant/client/apis/ReadinessApiImpl$ConnCategory;", "state", "Lcom/amazon/alexa/assistant/AssistantState;", "wasConnected", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ConnCategory categoryOf(AssistantState state, boolean wasConnected) {
            if (state instanceof AssistantState.Ready) {
                return ConnCategory.CONNECTED;
            }
            if (state instanceof AssistantState.Starting) {
                return null;
            }
            if (state instanceof AssistantState.Stopped) {
                return ConnCategory.DISCONNECTED;
            }
            if (state instanceof AssistantState.Unauthorized) {
                return ConnCategory.FAILED_UNAUTHORIZED;
            }
            if (state instanceof AssistantState.Error) {
                return wasConnected ? ConnCategory.DISCONNECTED : ConnCategory.FAILED_UNKNOWN;
            }
            PathKt$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AlexaReadyStateV2 toReadyState(boolean isReady) {
            return new AlexaReadyStateV2(isReady, isReady);
        }

        private Companion() {
        }
    }
}
