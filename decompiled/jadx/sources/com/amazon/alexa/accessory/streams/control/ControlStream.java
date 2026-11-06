package com.amazon.alexa.accessory.streams.control;

import androidx.work.impl.Processor$$ExternalSyntheticLambda1;
import com.amazon.alexa.accessory.AccessoryStream;
import com.amazon.alexa.accessory.internal.util.LoggerUtils;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.internal.util.UIUtils;
import com.amazon.alexa.accessory.io.Buffer;
import com.amazon.alexa.accessory.io.DataSink;
import com.amazon.alexa.accessory.io.SizedSource;
import com.amazon.alexa.accessory.io.Source;
import com.amazon.alexa.accessory.protocol.Accessories;
import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.streams.control.ProtobufControlMessage;
import com.amazon.alexa.accessory.transport.TransportDispatcher;
import com.amazon.alexa.accessory.transport.TransportTransaction;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.facebook.imagepipeline.cache.BufferedDiskCache$$ExternalSyntheticLambda2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class ControlStream implements AccessoryStream {
    private final TransportDispatcher dispatcher;
    private final MessageAuthenticationMode messageAuthenticationMode;
    private final Map<Accessories.Command, ControlMessageHandler> messageHandlers;
    private final Map<Accessories.Command, ControlResponseHandler> responseHandlers;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MessageAuthenticationMode {
        FORCE_UNAUTHENTICATED(false),
        ATTEMPT_AUTHENTICATION(true);

        private final boolean shouldAttemptAuthenticationIfSupported;

        MessageAuthenticationMode(boolean z) {
            this.shouldAttemptAuthenticationIfSupported = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean shouldAttemptAuthenticationIfSupported() {
            return this.shouldAttemptAuthenticationIfSupported;
        }
    }

    public ControlStream(TransportDispatcher transportDispatcher, MessageAuthenticationMode messageAuthenticationMode) {
        Preconditions.notNull(transportDispatcher, "dispatcher");
        this.dispatcher = transportDispatcher;
        this.messageHandlers = new HashMap();
        this.responseHandlers = new HashMap();
        this.messageAuthenticationMode = messageAuthenticationMode;
    }

    public static void dispatch(TransportDispatcher transportDispatcher, ControlMessage controlMessage, MessageAuthenticationMode messageAuthenticationMode) {
        LoggerUtils.send(controlMessage);
        Buffer buffer = new Buffer();
        try {
            controlMessage.write(new DataSink(buffer));
            transportDispatcher.dispatch(TransportTransaction.newBuilder().stream(0).data(buffer).attemptAuthenticationIfSupported(messageAuthenticationMode.shouldAttemptAuthenticationIfSupported()).commit(true).build());
        } catch (IOException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
        }
    }

    private boolean handleMessage(ControlMessage controlMessage) throws Exception {
        ControlMessageHandler controlMessageHandler;
        synchronized (this.messageHandlers) {
            controlMessageHandler = this.messageHandlers.get(controlMessage.getCommand());
        }
        if (controlMessageHandler == null) {
            return false;
        }
        return ((Boolean) UIUtils.execute(new Processor$$ExternalSyntheticLambda1(this, 5, controlMessage, controlMessageHandler))).booleanValue();
    }

    private boolean handleResponse(Accessories.Command command, Accessories.Response response) throws Exception {
        ControlResponseHandler controlResponseHandler;
        synchronized (this.responseHandlers) {
            controlResponseHandler = this.responseHandlers.get(command);
        }
        if (controlResponseHandler == null) {
            return false;
        }
        return ((Boolean) UIUtils.execute(new BufferedDiskCache$$ExternalSyntheticLambda2(2, this, command, response, controlResponseHandler))).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$handleMessage$0(ControlMessage controlMessage, ControlMessageHandler controlMessageHandler) throws Exception {
        LoggerUtils.received(controlMessage);
        controlMessageHandler.onMessageReceived(this, controlMessage.getCommand(), controlMessage.getPayload());
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$handleResponse$1(Accessories.Command command, Accessories.Response response, ControlResponseHandler controlResponseHandler) throws Exception {
        LoggerUtils.received(command, response);
        controlResponseHandler.onResponseReceived(this, command, response);
        return Boolean.TRUE;
    }

    public void addMessageHandler(Accessories.Command command, ControlMessageHandler controlMessageHandler) {
        Preconditions.notNull(command, VoiceBridgePayloadUtil.PayloadKey.COMMAND);
        Preconditions.notNull(controlMessageHandler, "messageHandler");
        synchronized (this.messageHandlers) {
            try {
                if (this.messageHandlers.containsKey(command)) {
                    throw new IllegalArgumentException("A message handler is already registered for " + command);
                }
                this.messageHandlers.put(command, controlMessageHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addResponseHandler(Accessories.Command command, ControlResponseHandler controlResponseHandler) {
        Preconditions.notNull(command, VoiceBridgePayloadUtil.PayloadKey.COMMAND);
        Preconditions.notNull(controlResponseHandler, "responseHandler");
        synchronized (this.responseHandlers) {
            try {
                if (this.responseHandlers.containsKey(command)) {
                    throw new IllegalArgumentException("A response handler is already registered for " + command);
                }
                this.responseHandlers.put(command, controlResponseHandler);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.alexa.accessory.AccessoryStream
    public int getId() {
        return 0;
    }

    @Override // com.amazon.alexa.accessory.AccessoryStream
    public boolean handleData(SizedSource sizedSource) throws Exception {
        sizedSource.reset();
        ProtobufControlMessage create = new ProtobufControlMessage.Factory().create((Source) sizedSource);
        return !create.isResponse() ? handleMessage(create) : handleResponse(create.getCommand(), (Accessories.Response) create.getPayload());
    }

    public void removeMessageHandler(ControlMessageHandler controlMessageHandler) {
        Preconditions.notNull(controlMessageHandler, "messageHandler");
        synchronized (this.messageHandlers) {
            try {
                Iterator<Map.Entry<Accessories.Command, ControlMessageHandler>> it2 = this.messageHandlers.entrySet().iterator();
                while (it2.hasNext()) {
                    if (it2.next().getValue() == controlMessageHandler) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeResponseHandler(ControlResponseHandler controlResponseHandler) {
        Preconditions.notNull(controlResponseHandler, "responseHandler");
        synchronized (this.responseHandlers) {
            try {
                Iterator<Map.Entry<Accessories.Command, ControlResponseHandler>> it2 = this.responseHandlers.entrySet().iterator();
                while (it2.hasNext()) {
                    if (it2.next().getValue() == controlResponseHandler) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void respond(Accessories.Command command, Common.ErrorCode errorCode) {
        dispatch(new ProtobufControlMessage(Accessories.ControlEnvelope.newBuilder().setCommand(command).setResponse(Accessories.Response.newBuilder().setErrorCode(errorCode)).build()));
    }

    public void dispatch(ControlMessage controlMessage) {
        dispatch(this.dispatcher, controlMessage, this.messageAuthenticationMode);
    }

    public void dispatch(ControlMessage controlMessage, long j) {
        throw new UnsupportedOperationException("Boom! Not yet implemented.");
    }
}
