package com.amazon.alexa.api;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.amazon.alexa.api.messages.MessageReceiversManager;
import com.amazon.alexa.api.messages.messagereceiver.MessageReceiver;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.client.annotations.UiThread;
import com.amazon.alexa.utils.security.SignatureVerifier;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public abstract class AlexaCapabilityAgentService extends Service {
    private static final String ACTION = "com.amazon.alexa.ACTION_PROCESS_DIRECTIVE";
    public static final String ALEXA_CAPABILITY_SERVICE_VERSION = "alexa_capability_service_version";
    private static final String CATEGORY = "com.amazon.alexa.CATEGORY_CAPABILITY_AGENT";
    public static final Intent EXTERNAL_CAPABILITY_AGENT_INTENT;
    private static final String TAG = "AlexaCapabilityAgentService";
    private MessageReceiver<CapabilityAgentMessageType> capabilityAgentMessageReceiver;
    private MessageReceiversManager messageReceiversManager;

    static {
        Intent intent = new Intent(ACTION);
        EXTERNAL_CAPABILITY_AGENT_INTENT = intent;
        intent.addCategory(CATEGORY);
    }

    @UiThread
    public boolean cancel(AlexaDirective alexaDirective) {
        return true;
    }

    public abstract Set<AlexaCapability> getCapabilities();

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        doBind();
        MessageReceiver<CapabilityAgentMessageType> createMessageReceiver = this.messageReceiversManager.createMessageReceiver(new AlexaCapabilityAgentV1(this));
        this.capabilityAgentMessageReceiver = createMessageReceiver;
        return createMessageReceiver.getMessenger().getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        this.messageReceiversManager = new MessageReceiversManager(new SignatureVerifier(getApplicationContext()));
    }

    @Override // android.app.Service
    public void onDestroy() {
        MessageReceiver<CapabilityAgentMessageType> messageReceiver = this.capabilityAgentMessageReceiver;
        if (messageReceiver != null) {
            messageReceiver.getMessageProcessor().release();
            this.messageReceiversManager.removeMessageReceiver(this.capabilityAgentMessageReceiver);
            this.capabilityAgentMessageReceiver = null;
        }
        this.messageReceiversManager.clear();
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        doUnbind();
        return false;
    }

    @UiThread
    public boolean preprocess(AlexaDirective alexaDirective) {
        return true;
    }

    @UiThread
    public abstract boolean process(AlexaDirective alexaDirective);

    @UiThread
    public void doBind() {
    }

    @UiThread
    public void doUnbind() {
    }
}
