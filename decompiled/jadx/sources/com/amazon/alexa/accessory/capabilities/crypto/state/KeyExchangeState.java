package com.amazon.alexa.accessory.capabilities.crypto.state;

import com.amazon.alexa.accessory.capabilities.crypto.metrics.KeyExchangeMetrics;
import com.amazon.alexa.accessory.capabilities.crypto.state.KeyExchangeState;
import com.amazon.alexa.accessory.capabilities.crypto.state.MessageHandlers;
import com.amazon.alexa.accessory.capabilities.crypto.state.event.EventHandlers;
import com.amazon.alexa.accessory.capabilities.crypto.state.event.KeyExchangeEvent;
import com.amazon.alexa.accessory.capabilities.crypto.state.event.KeyExchangeEventHandler;
import com.amazon.alexa.accessory.crypto.CryptoKeyDataStore;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.protocol.Accessories;
import com.amazon.alexa.accessory.transport.TransportFeature;
import com.amazon.dee.app.dependencies.ServiceModule;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_KEYS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class KeyExchangeState {
    private static final /* synthetic */ KeyExchangeState[] $VALUES;
    public static final KeyExchangeState HAS_KEYS;
    public static final KeyExchangeState HAS_KEYS_AWAITING_COMPLETE_HANDSHAKE;
    public static final KeyExchangeState HAS_KEYS_AWAITING_CONFIRM_RESET;
    public static final KeyExchangeState INITIALIZING = new KeyExchangeState("INITIALIZING", 0, new MessageHandlers() { // from class: com.amazon.alexa.accessory.capabilities.crypto.state.NoSupportedMessagesHandlers
        {
            Map map = Collections.EMPTY_MAP;
        }
    }, EventHandlers.builder().addHandler(KeyExchangeEvent.TRANSPORT_FEATURES_DISCOVERED, new KeyExchangeEventHandler<Set<TransportFeature>>() { // from class: com.amazon.alexa.accessory.capabilities.crypto.state.event.InitializationTransportFeaturesEventHandler
        @Override // com.amazon.alexa.accessory.capabilities.crypto.state.event.KeyExchangeEventHandler
        public KeyExchangeState handleEvent(Set<TransportFeature> set, String str, CryptoKeyDataStore cryptoKeyDataStore, KeyExchangeMetrics keyExchangeMetrics) {
            Preconditions.notNull(set, "eventData");
            Preconditions.notNull(str, "accessoryId");
            Preconditions.notNull(cryptoKeyDataStore, ServiceModule.DATA_STORE);
            Preconditions.notNull(keyExchangeMetrics, "metrics");
            KeyExchangeState keyExchangeState = !set.contains(TransportFeature.AUTHENTICATION) ? KeyExchangeState.NO_KEYS_REQUIRED : cryptoKeyDataStore.getData(str) != null ? KeyExchangeState.HAS_KEYS : KeyExchangeState.NO_KEYS;
            keyExchangeMetrics.onInitializationComplete(keyExchangeState);
            return keyExchangeState;
        }
    }).build(), null);
    public static final KeyExchangeState IRRECOVERABLE_ERROR;
    public static final KeyExchangeState NO_KEYS;
    public static final KeyExchangeState NO_KEYS_REQUIRED;
    private final EventHandlers stateEventHandlers;
    private final MessageHandlers stateMessageHandlers;
    private final TimeoutCondition timeoutCondition;

    private static /* synthetic */ KeyExchangeState[] $values() {
        return new KeyExchangeState[]{INITIALIZING, NO_KEYS, HAS_KEYS_AWAITING_COMPLETE_HANDSHAKE, HAS_KEYS, HAS_KEYS_AWAITING_CONFIRM_RESET, NO_KEYS_REQUIRED, IRRECOVERABLE_ERROR};
    }

    static {
        NoKeysMessageHandlers noKeysMessageHandlers = new NoKeysMessageHandlers();
        EventHandlers eventHandlers = EventHandlers.NO_SUPPORTED_EVENTS;
        NO_KEYS = new KeyExchangeState("NO_KEYS", 1, noKeysMessageHandlers, eventHandlers, new TimeoutCondition() { // from class: com.amazon.alexa.accessory.capabilities.crypto.state.KeyExchangeState.1
            @Override // com.amazon.alexa.accessory.capabilities.crypto.state.TimeoutCondition
            public KeyExchangeState getOnTimeoutState() {
                return KeyExchangeState.IRRECOVERABLE_ERROR;
            }

            @Override // com.amazon.alexa.accessory.capabilities.crypto.state.TimeoutCondition
            public long getTimeoutMs() {
                return 300000L;
            }
        });
        HAS_KEYS_AWAITING_COMPLETE_HANDSHAKE = new KeyExchangeState("HAS_KEYS_AWAITING_COMPLETE_HANDSHAKE", 2, new HasKeysAwaitingCompleteHandshakeMessageHandlers(), eventHandlers, new TimeoutCondition() { // from class: com.amazon.alexa.accessory.capabilities.crypto.state.KeyExchangeState.2
            @Override // com.amazon.alexa.accessory.capabilities.crypto.state.TimeoutCondition
            public KeyExchangeState getOnTimeoutState() {
                return KeyExchangeState.HAS_KEYS;
            }

            @Override // com.amazon.alexa.accessory.capabilities.crypto.state.TimeoutCondition
            public long getTimeoutMs() {
                return 20000L;
            }
        });
        HAS_KEYS = new KeyExchangeState("HAS_KEYS", 3, new HasKeysMessageHandlers(), eventHandlers, null);
        HAS_KEYS_AWAITING_CONFIRM_RESET = new KeyExchangeState("HAS_KEYS_AWAITING_CONFIRM_RESET", 4, new HasKeysAwaitingConfirmResetMessageHandlers(), eventHandlers, new TimeoutCondition() { // from class: com.amazon.alexa.accessory.capabilities.crypto.state.KeyExchangeState.3
            @Override // com.amazon.alexa.accessory.capabilities.crypto.state.TimeoutCondition
            public KeyExchangeState getOnTimeoutState() {
                return KeyExchangeState.HAS_KEYS;
            }

            @Override // com.amazon.alexa.accessory.capabilities.crypto.state.TimeoutCondition
            public long getTimeoutMs() {
                return 20000L;
            }
        });
        NO_KEYS_REQUIRED = new KeyExchangeState("NO_KEYS_REQUIRED", 5, new MessageHandlers() { // from class: com.amazon.alexa.accessory.capabilities.crypto.state.ResetRootKeyOnlyMessageHandlers
            {
                new MessageHandlers.MessageHandlersBuilder().build();
            }
        }, eventHandlers, null);
        IRRECOVERABLE_ERROR = new KeyExchangeState("IRRECOVERABLE_ERROR", 6, new MessageHandlers() { // from class: com.amazon.alexa.accessory.capabilities.crypto.state.ResetRootKeyOnlyMessageHandlers
            {
                new MessageHandlers.MessageHandlersBuilder().build();
            }
        }, eventHandlers, null);
        $VALUES = $values();
    }

    private KeyExchangeState(String str, int i, MessageHandlers messageHandlers, EventHandlers eventHandlers, TimeoutCondition timeoutCondition) {
        this.stateMessageHandlers = messageHandlers;
        this.stateEventHandlers = eventHandlers;
        this.timeoutCondition = timeoutCondition;
    }

    public static KeyExchangeState valueOf(String str) {
        return (KeyExchangeState) Enum.valueOf(KeyExchangeState.class, str);
    }

    public static KeyExchangeState[] values() {
        return (KeyExchangeState[]) $VALUES.clone();
    }

    public Set<Accessories.Command> getAllSupportedCommands() {
        return this.stateMessageHandlers.getAllSupportedCommands();
    }

    public final TransitionResponse getResponse(Accessories.Command command, Object obj, String str, CryptoKeyDataStore cryptoKeyDataStore, KeyExchangeMetrics keyExchangeMetrics) {
        return this.stateMessageHandlers.getResponse(command, obj, str, cryptoKeyDataStore, keyExchangeMetrics);
    }

    public TimeoutCondition getTimeoutCondition() {
        return this.timeoutCondition;
    }

    public final KeyExchangeState nextState(KeyExchangeEvent keyExchangeEvent, Object obj, String str, CryptoKeyDataStore cryptoKeyDataStore, KeyExchangeMetrics keyExchangeMetrics) {
        return this.stateEventHandlers.handleEvent(keyExchangeEvent, obj, str, cryptoKeyDataStore, keyExchangeMetrics);
    }
}
