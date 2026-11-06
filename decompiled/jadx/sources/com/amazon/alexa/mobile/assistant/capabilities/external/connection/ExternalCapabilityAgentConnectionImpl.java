package com.amazon.alexa.mobile.assistant.capabilities.external.connection;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.amazon.alexa.api.compat.model.AlexaCapability;
import com.amazon.alexa.api.compat.model.AlexaContext;
import com.amazon.alexa.api.compat.model.AlexaDirective;
import com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.api.compat.model.AlexaPayload;
import com.amazon.alexa.api.compat.model.CapabilityAgentMessageSenderV2;
import com.amazon.alexa.api.compat.model.MessageReceiversManager;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0012\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0%H\u0016J\n\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006-"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnectionImpl;", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnection;", "context", "Landroid/content/Context;", "componentName", "Landroid/content/ComponentName;", "<init>", "(Landroid/content/Context;Landroid/content/ComponentName;)V", "messageSender", "Lcom/amazon/alexa/api/compat/model/CapabilityAgentMessageSenderV2;", "conditionVariable", "Landroid/os/ConditionVariable;", "bound", "", "connectionLostListener", "Lkotlin/Function0;", "", "serviceConnection", "com/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnectionImpl$serviceConnection$1", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnectionImpl$serviceConnection$1;", "setConnectionLostListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getComponentName", "isConnected", MissingTokenPull.TRIGGER_CONNECT, "disconnect", "release", "preprocess", "directiveBundle", "Landroid/os/Bundle;", "callbacks", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalDirectiveProcessingCallbacks;", "process", "directiveId", "", "cancel", "getCapabilities", "", "getContext", "Lcom/amazon/alexa/api/compat/model/AlexaContext;", "bundleToDirective", "Lcom/amazon/alexa/api/compat/model/AlexaDirective;", "bundle", "DirectiveCallbacksProxy", "Companion", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExternalCapabilityAgentConnectionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalCapabilityAgentConnectionImpl.kt\ncom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnectionImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n1#2:229\n1557#3:230\n1628#3,3:231\n*S KotlinDebug\n*F\n+ 1 ExternalCapabilityAgentConnectionImpl.kt\ncom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnectionImpl\n*L\n165#1:230\n165#1:231,3\n*E\n"})
/* loaded from: classes18.dex */
public final class ExternalCapabilityAgentConnectionImpl implements ExternalCapabilityAgentConnection {

    @NotNull
    private static final String BUNDLE_KEY_CORRELATION_TOKEN = "correlationToken";

    @NotNull
    private static final String BUNDLE_KEY_DIALOG_REQUEST_ID = "dialogRequestId";

    @NotNull
    private static final String BUNDLE_KEY_MESSAGE_ID = "messageId";

    @NotNull
    private static final String BUNDLE_KEY_NAME = "name";

    @NotNull
    private static final String BUNDLE_KEY_NAMESPACE = "namespace";

    @NotNull
    private static final String BUNDLE_KEY_PAYLOAD = "payload";

    @NotNull
    private static final String CAPABILITY_KEY_CONFIGURATIONS = "configurations";

    @NotNull
    private static final String CAPABILITY_KEY_INSTANCE = "instance";

    @NotNull
    private static final String CAPABILITY_KEY_INTERFACE = "interface";

    @NotNull
    private static final String CAPABILITY_KEY_TYPE = "type";

    @NotNull
    private static final String CAPABILITY_KEY_VERSION = "version";
    private static final long CONNECTION_TIMEOUT_MS = 4000;

    @NotNull
    private static final String TAG = "ExternalCAConnection";
    private volatile boolean bound;

    @NotNull
    private final ComponentName componentName;

    @NotNull
    private final ConditionVariable conditionVariable;

    @Nullable
    private volatile Function0<Unit> connectionLostListener;

    @NotNull
    private final Context context;

    @Nullable
    private volatile CapabilityAgentMessageSenderV2 messageSender;

    @NotNull
    private final ExternalCapabilityAgentConnectionImpl$serviceConnection$1 serviceConnection;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalCapabilityAgentConnectionImpl$DirectiveCallbacksProxy;", "Lcom/amazon/alexa/api/compat/model/AlexaDirectiveProcessingCallbacksProxy$Stub;", "callbacks", "Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalDirectiveProcessingCallbacks;", "<init>", "(Lcom/amazon/alexa/mobile/assistant/capabilities/external/connection/ExternalDirectiveProcessingCallbacks;)V", "onProcessStarted", "", "onProcessFinished", "onCancelStarted", "onCancelFinished", "onError", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DirectiveCallbacksProxy extends AlexaDirectiveProcessingCallbacksProxy.Stub {

        @NotNull
        private final ExternalDirectiveProcessingCallbacks callbacks;

        public DirectiveCallbacksProxy(@NotNull ExternalDirectiveProcessingCallbacks externalDirectiveProcessingCallbacks) {
            externalDirectiveProcessingCallbacks.getClass();
            this.callbacks = externalDirectiveProcessingCallbacks;
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
        public void onCancelFinished() {
            this.callbacks.onCancelledFinished();
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
        public void onCancelStarted() {
            this.callbacks.onCancelledStarted();
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
        public void onError() {
            this.callbacks.onError();
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
        public void onProcessFinished() {
            this.callbacks.onProcessFinished();
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaDirectiveProcessingCallbacksProxy
        public void onProcessStarted() {
            this.callbacks.onProcessStarted();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnectionImpl$serviceConnection$1] */
    public ExternalCapabilityAgentConnectionImpl(@NotNull Context context, @NotNull ComponentName componentName) {
        context.getClass();
        componentName.getClass();
        this.context = context;
        this.componentName = componentName;
        this.conditionVariable = new ConditionVariable(false);
        this.serviceConnection = new ServiceConnection() { // from class: com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnectionImpl$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onBindingDied(ComponentName name) {
                Function0 function0;
                name.getClass();
                ExternalCapabilityAgentConnectionImpl.this.disconnect();
                function0 = ExternalCapabilityAgentConnectionImpl.this.connectionLostListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(ComponentName name) {
                Function0 function0;
                name.getClass();
                ExternalCapabilityAgentConnectionImpl.this.disconnect();
                function0 = ExternalCapabilityAgentConnectionImpl.this.connectionLostListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                ConditionVariable conditionVariable;
                name.getClass();
                service.getClass();
                ExternalCapabilityAgentConnectionImpl.this.messageSender = new CapabilityAgentMessageSenderV2(service, new MessageReceiversManager());
                conditionVariable = ExternalCapabilityAgentConnectionImpl.this.conditionVariable;
                conditionVariable.open();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                Function0 function0;
                name.getClass();
                ExternalCapabilityAgentConnectionImpl.this.messageSender = null;
                function0 = ExternalCapabilityAgentConnectionImpl.this.connectionLostListener;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        };
    }

    private final AlexaDirective bundleToDirective(Bundle bundle) {
        AlexaHeader.Builder builder = new AlexaHeader.Builder();
        String string = bundle.getString("namespace", "");
        string.getClass();
        AlexaHeader.Builder namespace = builder.setNamespace(string);
        String string2 = bundle.getString("name", "");
        string2.getClass();
        AlexaHeader.Builder name = namespace.setName(string2);
        String string3 = bundle.getString("messageId", "");
        string3.getClass();
        AlexaHeader build = name.setMessageId(string3).setDialogRequestId(bundle.getString("dialogRequestId", "")).setCorrelationToken(bundle.getString("correlationToken")).build();
        String string4 = bundle.getString("payload", "");
        string4.getClass();
        return new AlexaDirective(build, new AlexaPayload(string4));
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    public void cancel(@NotNull String directiveId) {
        directiveId.getClass();
        CapabilityAgentMessageSenderV2 capabilityAgentMessageSenderV2 = this.messageSender;
        if (capabilityAgentMessageSenderV2 == null) {
            throw new ExternalCapabilityAgentException("messageSender is null", ExternalCapabilityAgentException.FailureReason.NULL_SERVICE, null, 4, null);
        }
        try {
            capabilityAgentMessageSenderV2.cancel(directiveId);
        } catch (RemoteException e) {
            throw new ExternalCapabilityAgentException("Remote exception in cancel", ExternalCapabilityAgentException.FailureReason.REMOTE_EXCEPTION, e);
        } catch (Exception e2) {
            throw new ExternalCapabilityAgentException("Exception in cancel", ExternalCapabilityAgentException.FailureReason.UNKNOWN, e2);
        }
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    public boolean connect() {
        boolean z;
        if (isConnected()) {
            return true;
        }
        this.conditionVariable.close();
        Intent intent = new Intent();
        intent.setComponent(this.componentName);
        try {
            z = this.context.bindService(intent, this.serviceConnection, 1);
        } catch (SecurityException e) {
            Log.e(TAG, "SecurityException binding to " + this.componentName, e);
            z = false;
        }
        this.bound = z;
        if (this.bound) {
            this.conditionVariable.block(4000L);
            if (!isConnected()) {
                disconnect();
                return false;
            }
        }
        return isConnected();
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    public void disconnect() {
        if (this.bound) {
            try {
                this.context.unbindService(this.serviceConnection);
            } catch (IllegalArgumentException unused) {
                Log.w(TAG, "Service not bound: " + this.componentName);
            }
            this.bound = false;
            CapabilityAgentMessageSenderV2 capabilityAgentMessageSenderV2 = this.messageSender;
            if (capabilityAgentMessageSenderV2 != null) {
                capabilityAgentMessageSenderV2.release();
            }
            this.messageSender = null;
        }
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    @NotNull
    public List<Bundle> getCapabilities() {
        CapabilityAgentMessageSenderV2 capabilityAgentMessageSenderV2 = this.messageSender;
        if (capabilityAgentMessageSenderV2 == null) {
            throw new ExternalCapabilityAgentException("messageSender is null", ExternalCapabilityAgentException.FailureReason.NULL_SERVICE, null, 4, null);
        }
        try {
            List<AlexaCapability> capabilities = capabilityAgentMessageSenderV2.getCapabilities();
            if (capabilities == null) {
                return CollectionsKt.emptyList();
            }
            List<AlexaCapability> list = capabilities;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (AlexaCapability alexaCapability : list) {
                Bundle bundle = new Bundle();
                bundle.putString("type", alexaCapability.getCapabilityType());
                bundle.putString("interface", alexaCapability.getCapabilityInterface());
                bundle.putString("version", alexaCapability.getVersion());
                String configurations = alexaCapability.getConfigurations();
                if (configurations != null) {
                    bundle.putString(CAPABILITY_KEY_CONFIGURATIONS, configurations);
                }
                String alexaCapability2 = alexaCapability.getInstance();
                if (alexaCapability2 != null) {
                    bundle.putString("instance", alexaCapability2);
                }
                arrayList.add(bundle);
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new ExternalCapabilityAgentException("Remote exception in getCapabilities", ExternalCapabilityAgentException.FailureReason.REMOTE_EXCEPTION, e);
        } catch (Exception e2) {
            throw new ExternalCapabilityAgentException("Exception in getCapabilities", ExternalCapabilityAgentException.FailureReason.UNKNOWN, e2);
        }
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    @NotNull
    public ComponentName getComponentName() {
        return this.componentName;
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    @Nullable
    public AlexaContext getContext() {
        CapabilityAgentMessageSenderV2 capabilityAgentMessageSenderV2 = this.messageSender;
        if (capabilityAgentMessageSenderV2 != null) {
            return capabilityAgentMessageSenderV2.getContext();
        }
        return null;
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    public boolean isConnected() {
        return this.messageSender != null;
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    public void preprocess(@NotNull Bundle directiveBundle, @NotNull ExternalDirectiveProcessingCallbacks callbacks) {
        directiveBundle.getClass();
        callbacks.getClass();
        CapabilityAgentMessageSenderV2 capabilityAgentMessageSenderV2 = this.messageSender;
        if (capabilityAgentMessageSenderV2 == null) {
            throw new ExternalCapabilityAgentException("messageSender is null", ExternalCapabilityAgentException.FailureReason.NULL_SERVICE, null, 4, null);
        }
        try {
            capabilityAgentMessageSenderV2.preprocess(bundleToDirective(directiveBundle), new DirectiveCallbacksProxy(callbacks));
        } catch (RemoteException e) {
            throw new ExternalCapabilityAgentException("Remote exception in preprocess", ExternalCapabilityAgentException.FailureReason.REMOTE_EXCEPTION, e);
        } catch (Exception e2) {
            throw new ExternalCapabilityAgentException("Exception in preprocess", ExternalCapabilityAgentException.FailureReason.UNKNOWN, e2);
        }
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    public void process(@NotNull String directiveId) {
        directiveId.getClass();
        CapabilityAgentMessageSenderV2 capabilityAgentMessageSenderV2 = this.messageSender;
        if (capabilityAgentMessageSenderV2 == null) {
            throw new ExternalCapabilityAgentException("messageSender is null", ExternalCapabilityAgentException.FailureReason.NULL_SERVICE, null, 4, null);
        }
        try {
            capabilityAgentMessageSenderV2.process(directiveId);
        } catch (RemoteException e) {
            throw new ExternalCapabilityAgentException("Remote exception in process", ExternalCapabilityAgentException.FailureReason.REMOTE_EXCEPTION, e);
        } catch (Exception e2) {
            throw new ExternalCapabilityAgentException("Exception in process", ExternalCapabilityAgentException.FailureReason.UNKNOWN, e2);
        }
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    public void release() {
        disconnect();
    }

    @Override // com.amazon.alexa.mobile.assistant.capabilities.external.connection.ExternalCapabilityAgentConnection
    public void setConnectionLostListener(@Nullable Function0<Unit> listener) {
        this.connectionLostListener = listener;
    }
}
