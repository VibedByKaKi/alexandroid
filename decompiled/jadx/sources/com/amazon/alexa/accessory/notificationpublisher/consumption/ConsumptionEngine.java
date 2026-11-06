package com.amazon.alexa.accessory.notificationpublisher.consumption;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsRecorder;
import com.amazon.alexa.accessory.notificationpublisher.renderer.RenderManager;
import com.amazon.alexa.accessory.notificationpublisher.timers.TimerManager;
import com.amazon.alexa.accessory.notificationpublisher.transcriber.SpeechRecognizerComponent;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class ConsumptionEngine {
    private static final String TAG = "ConsumptionEngine";
    public static final int THREAD_TYPE_INCOMING = 1;
    public static final int THREAD_TYPE_OUTGOING = 2;
    private static ConsumptionEngine instance;
    private ConversationComponent conversationComponent;
    private GestureManager gestureManagerInstance;
    private IncomingMessageThread incomingMessageThread;
    private OutgoingMessageThread outgoingMessageThread;
    private NotificationQueue queueInstance;
    private RenderManager renderManagerInstance;
    private ReplyReadBackComponent replyReadBackComponent;
    private SpeechRecognizerComponent speechRecognizerInstance;
    private StateManager stateManagerInstance;
    private TimerManager timerManagerInstance;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class IncomingMessageThread extends HandlerThread {
        Handler handler;

        public IncomingMessageThread(String str, int i) {
            super(str, i);
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            this.handler = new Handler(getLooper()) { // from class: com.amazon.alexa.accessory.notificationpublisher.consumption.ConsumptionEngine.IncomingMessageThread.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    try {
                        Log.d(ConsumptionEngine.TAG, "handleIncomingMessage " + message.toString());
                        int componentId = MessageUtils.getComponentId(message);
                        int eventId = MessageUtils.getEventId(message);
                        Object payload = MessageUtils.getPayload(message);
                        switch (componentId) {
                            case 1:
                                ConsumptionEngine.this.stateManagerInstance.handleNotificationEvent(eventId, payload);
                                break;
                            case 2:
                                ConsumptionEngine.this.stateManagerInstance.handleGestureEvent(eventId, payload);
                                break;
                            case 3:
                                ConsumptionEngine.this.stateManagerInstance.handleRendererEvent(eventId, payload);
                                break;
                            case 4:
                                ConsumptionEngine.this.stateManagerInstance.handleTimerEvent(eventId, payload);
                                break;
                            case 5:
                            default:
                                Log.w(ConsumptionEngine.TAG, "IncomingMessageThread - No event handler for this component: " + componentId);
                                break;
                            case 6:
                                ConsumptionEngine.this.stateManagerInstance.handleStatusEvent(eventId, payload);
                                break;
                            case 7:
                                ConsumptionEngine.this.stateManagerInstance.handleAudioFocusEvent(eventId, payload);
                                break;
                            case 8:
                                ConsumptionEngine.this.stateManagerInstance.handleSpeechRecognizerEvent(eventId, payload);
                                break;
                            case 9:
                                ConsumptionEngine.this.stateManagerInstance.handleReplyReadBackEvent(eventId, payload);
                                break;
                            case 10:
                                ConsumptionEngine.this.stateManagerInstance.handleConversationEvent(eventId, payload);
                                break;
                        }
                    } catch (Exception e) {
                        Log.e(ConsumptionEngine.TAG, "IncomingMessageThread - Exception caught in message handling: " + ConsumptionEngine.describeException(e));
                        StateManager.getInstance().transitState(StateManager.STATE_IDLE);
                        MetricsRecorder.getInstance().recordCounter(MetricsConstants.CE_ERROR_INCOMING_THREAD);
                    }
                }
            };
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class OutgoingMessageThread extends HandlerThread {
        Handler handler;

        public OutgoingMessageThread(String str, int i) {
            super(str, i);
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            this.handler = new Handler(getLooper()) { // from class: com.amazon.alexa.accessory.notificationpublisher.consumption.ConsumptionEngine.OutgoingMessageThread.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    try {
                        Log.d(ConsumptionEngine.TAG, "handleOutgoingMessage " + message.toString());
                        int componentId = MessageUtils.getComponentId(message);
                        int eventId = MessageUtils.getEventId(message);
                        Object payload = MessageUtils.getPayload(message);
                        if (componentId == 2) {
                            ConsumptionEngine.this.gestureManagerInstance.handleEventMessage(eventId, payload);
                            return;
                        }
                        if (componentId == 3) {
                            ConsumptionEngine.this.renderManagerInstance.handleEventMessage(eventId, payload);
                            return;
                        }
                        if (componentId == 4) {
                            ConsumptionEngine.this.timerManagerInstance.handleEventMessage(eventId, payload);
                            return;
                        }
                        switch (componentId) {
                            case 8:
                                ConsumptionEngine.this.speechRecognizerInstance.handleEventMessage(eventId, payload);
                                break;
                            case 9:
                                ConsumptionEngine.this.replyReadBackComponent.handleEventMessage(eventId, payload);
                                break;
                            case 10:
                                ConsumptionEngine.this.conversationComponent.handleEventMessage(eventId, payload);
                                break;
                            default:
                                Log.w(ConsumptionEngine.TAG, "OutgoingMessageThread - No event handler for this component: " + componentId);
                                break;
                        }
                    } catch (Exception e) {
                        Log.e(ConsumptionEngine.TAG, "OutgoingMessageThread - Exception caught in message handling: " + ConsumptionEngine.describeException(e));
                        StateManager.getInstance().transitState(StateManager.STATE_IDLE);
                        MetricsRecorder.getInstance().recordCounter(MetricsConstants.CE_ERROR_OUTGOING_THREAD);
                    }
                }
            };
        }
    }

    private ConsumptionEngine() {
        Log.d(TAG, "ConsumptionEngine constructor");
        IncomingMessageThread incomingMessageThread = new IncomingMessageThread("IncomingMessageThread", 10);
        this.incomingMessageThread = incomingMessageThread;
        incomingMessageThread.start();
        OutgoingMessageThread outgoingMessageThread = new OutgoingMessageThread("OutgoingMessageThread", 10);
        this.outgoingMessageThread = outgoingMessageThread;
        outgoingMessageThread.start();
        this.queueInstance = NotificationQueue.getInstance();
        this.stateManagerInstance = StateManager.getInstance();
        this.timerManagerInstance = TimerManager.getInstance();
        this.renderManagerInstance = RenderManager.getInstance();
        this.gestureManagerInstance = GestureManager.getInstance();
        this.speechRecognizerInstance = SpeechRecognizerComponent.getInstance();
        this.replyReadBackComponent = ReplyReadBackComponent.getInstance();
        ConversationComponent conversationComponent = ConversationComponent.getInstance();
        this.conversationComponent = conversationComponent;
        conversationComponent.recoverOrphanedSession();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String describeException(Exception exc) {
        String str;
        StackTraceElement[] stackTrace = exc.getStackTrace();
        String simpleName = exc.getClass().getSimpleName();
        if (stackTrace.length > 0) {
            str = " at " + stackTrace[0];
        } else {
            str = "";
        }
        return simpleName.concat(str);
    }

    public static synchronized ConsumptionEngine getInstance() {
        ConsumptionEngine consumptionEngine;
        synchronized (ConsumptionEngine.class) {
            try {
                if (instance == null) {
                    instance = new ConsumptionEngine();
                }
                consumptionEngine = instance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return consumptionEngine;
    }

    public static synchronized void releaseInstance() {
        synchronized (ConsumptionEngine.class) {
            try {
                ConsumptionEngine consumptionEngine = instance;
                if (consumptionEngine != null) {
                    consumptionEngine.incomingMessageThread.quit();
                    instance.outgoingMessageThread.quit();
                    ConsumptionEngine consumptionEngine2 = instance;
                    consumptionEngine2.queueInstance = null;
                    consumptionEngine2.stateManagerInstance = null;
                    consumptionEngine2.incomingMessageThread = null;
                    consumptionEngine2.outgoingMessageThread = null;
                    consumptionEngine2.timerManagerInstance = null;
                    consumptionEngine2.renderManagerInstance = null;
                    consumptionEngine2.gestureManagerInstance = null;
                    consumptionEngine2.speechRecognizerInstance = null;
                    consumptionEngine2.replyReadBackComponent = null;
                    ConversationComponent conversationComponent = consumptionEngine2.conversationComponent;
                    if (conversationComponent != null) {
                        conversationComponent.shutdown();
                    }
                    instance.conversationComponent = null;
                }
                instance = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ConsumptionEngine m9575clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cannot clone a singleton");
    }

    public boolean postEventMessage(Message message, int i) {
        if (i == 2) {
            Log.d(TAG, "status: " + this.outgoingMessageThread.getState().name());
            return this.outgoingMessageThread.handler.sendMessage(message);
        }
        if (i != 1) {
            Log.w(TAG, "Invalid Thread Type");
            return false;
        }
        Log.d(TAG, "status: " + this.incomingMessageThread.getState().name());
        return this.incomingMessageThread.handler.sendMessage(message);
    }

    public boolean postEventMessageDelayed(Message message, int i, long j) {
        String str = TAG;
        Log.i(str, "postEventMessageDelayed: " + j);
        if (i == 2) {
            Log.d(str, "status: " + this.outgoingMessageThread.getState().name());
            return this.outgoingMessageThread.handler.sendMessageDelayed(message, j);
        }
        if (i != 1) {
            Log.w(str, "Invalid Thread Type");
            return false;
        }
        Log.d(str, "status: " + this.incomingMessageThread.getState().name());
        return this.incomingMessageThread.handler.sendMessageDelayed(message, j);
    }

    public void removeMessages(int i, int i2) {
        if (i2 == 2) {
            Log.d(TAG, "status: " + this.outgoingMessageThread.getState().name());
            this.outgoingMessageThread.handler.removeMessages(i);
            return;
        }
        if (i2 != 1) {
            Log.w(TAG, "Invalid Thread Type");
            return;
        }
        Log.d(TAG, "status: " + this.incomingMessageThread.getState().name());
        this.incomingMessageThread.handler.removeMessages(i);
    }

    public boolean postEventMessage(int i, int i2, int i3, @Nullable Object obj) {
        try {
            return postEventMessage(MessageUtils.createMessage(i2, i3, obj), i);
        } catch (NumberFormatException e) {
            Log.e(TAG, "Invalid messageType.", e);
            return false;
        }
    }

    public boolean postEventMessageDelayed(int i, int i2, int i3, @Nullable Object obj, long j) {
        try {
            return postEventMessageDelayed(MessageUtils.createMessage(i2, i3, obj), i, j);
        } catch (NumberFormatException e) {
            Log.e(TAG, "Invalid messageType.", e);
            return false;
        }
    }
}
