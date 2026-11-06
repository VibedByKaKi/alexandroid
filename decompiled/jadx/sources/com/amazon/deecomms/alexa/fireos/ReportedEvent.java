package com.amazon.deecomms.alexa.fireos;

import amazon.speech.simclient.event.EventResult;
import amazon.speech.simclient.event.EventStatusCallback;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.alexa.AlexaInterface;
import com.amazon.deecomms.alexa.InCallEvent;
import com.amazon.deecomms.common.Constants;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
class ReportedEvent implements EventStatusCallback {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, ReportedEvent.class);
    private final InCallEvent event;
    private final AlexaInterface mAlexaInterface;
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

    public ReportedEvent(@NonNull InCallEvent inCallEvent, @NonNull AlexaInterface alexaInterface) {
        this.event = inCallEvent;
        this.mAlexaInterface = alexaInterface;
    }

    private synchronized void onError(final String str, final int i) {
        LOG.e("There was an error while sending the event : " + str + " error code : " + i);
        this.mainThreadHandler.post(new Runnable() { // from class: com.amazon.deecomms.alexa.fireos.ReportedEvent.1
            @Override // java.lang.Runnable
            public void run() {
                AlexaInterface alexaInterface = ReportedEvent.this.mAlexaInterface;
                if (alexaInterface instanceof SimClientAlexaInterface) {
                    Iterator<SimEventListener> it2 = ((SimClientAlexaInterface) alexaInterface).getSimEventListeners().iterator();
                    while (it2.hasNext()) {
                        it2.next().onError(ReportedEvent.this.event, i, str);
                    }
                }
            }
        });
    }

    private synchronized void onFinish() {
        LOG.i("Sending event finished");
        this.mainThreadHandler.post(new Runnable() { // from class: com.amazon.deecomms.alexa.fireos.ReportedEvent.2
            @Override // java.lang.Runnable
            public void run() {
                CommsLogger commsLogger = ReportedEvent.LOG;
                InCallEvent inCallEvent = ReportedEvent.this.event;
                commsLogger.i(String.format("SipClient Message posted successfully: event:%s, data=%s", inCallEvent, inCallEvent.getData()));
                AlexaInterface alexaInterface = ReportedEvent.this.mAlexaInterface;
                if (alexaInterface instanceof SimClientAlexaInterface) {
                    Iterator<SimEventListener> it2 = ((SimClientAlexaInterface) alexaInterface).getSimEventListeners().iterator();
                    while (it2.hasNext()) {
                        it2.next().onSuccess(ReportedEvent.this.event);
                    }
                }
            }
        });
    }

    @Override // amazon.speech.simclient.event.EventStatusCallback
    public synchronized void onResult(EventResult eventResult) {
        if (eventResult.equals(EventResult.SUCCESS)) {
            onFinish();
        } else {
            onError(eventResult.name(), 1);
        }
    }
}
