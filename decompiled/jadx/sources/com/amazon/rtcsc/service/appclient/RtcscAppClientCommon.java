package com.amazon.rtcsc.service.appclient;

import com.amazon.rtcsc.interfaces.IRtcscAppClientListener;
import com.amazon.rtcsc.service.RtcscServiceHandler;
import com.amazon.rtcsc.utils.RtcscLogger;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RtcscAppClientCommon {
    private RtcscServiceHandler mRtcscServiceHandler;
    private final RtcscLogger mLog = RtcscLogger.getLogger(RtcscAppClientCommon.class);
    private ConcurrentHashMap<String, IRtcscAppClientListener> mAppClientListenersMap = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, String> mSessionIdToDomainMap = new ConcurrentHashMap<>();
    private ArrayList<String> mAvailableSessions = new ArrayList<>();

    public RtcscAppClientCommon(RtcscServiceHandler rtcscServiceHandler) {
        this.mRtcscServiceHandler = rtcscServiceHandler;
    }

    public IRtcscAppClientListener getListenerForDomain(String str) {
        if (str != null) {
            return this.mAppClientListenersMap.get(str);
        }
        this.mLog.e("getListenerForDomain: sessionDomain is null");
        return null;
    }

    public IRtcscAppClientListener getListenerForSessionId(String str) {
        if (str != null) {
            return getListenerForDomain(this.mSessionIdToDomainMap.get(str));
        }
        this.mLog.e("getListenerForSessionId: sessionId is null");
        return null;
    }

    public ArrayList<String> getSessionsForDomain(String str) {
        this.mLog.i("getSessionsForDomain: called.");
        ArrayList<String> arrayList = new ArrayList<>();
        if (str == null) {
            this.mLog.e("getSessionsForDomain: sessionDomain is null");
            return arrayList;
        }
        if (!this.mSessionIdToDomainMap.containsValue(str)) {
            this.mLog.e("getSessionsForDomain: sessionDomain is not actively tracked.");
            return arrayList;
        }
        for (Map.Entry<String, String> entry : this.mSessionIdToDomainMap.entrySet()) {
            if (str.equals(entry.getValue())) {
                this.mLog.i("getSessionsForDomain: Found sessionId : " + entry.getKey());
                arrayList.add(entry.getKey());
            }
        }
        return arrayList;
    }

    public boolean isAnyDomainRegistered() {
        return !this.mAppClientListenersMap.isEmpty();
    }

    public boolean isSessionDomainRegistered(String str) {
        return this.mAppClientListenersMap.containsKey(str);
    }

    public void onAudioEnabledForSession() {
        this.mLog.i("onAudioEnabledForSession");
        this.mRtcscServiceHandler.onAudioEnabledForSession();
    }

    public void onSessionAvailable(String str) {
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        RegionDefaults$$ExternalSyntheticOutline0.m("onSessionAvailable: sessionId: ", str, rtcscLogger);
        boolean isEmpty = this.mAvailableSessions.isEmpty();
        this.mAvailableSessions.add(str);
        if (isEmpty) {
            this.mRtcscServiceHandler.onFirstSessionAdded();
        }
    }

    public void onSessionRemoved(String str) {
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("onSessionRemoved: sessionId: " + str);
        removeSessionIdToDomainMapping(str);
        this.mAvailableSessions.remove(str);
        if (this.mAvailableSessions.isEmpty()) {
            this.mLog.i("Invoking onLastSessionRemoved()");
            this.mRtcscServiceHandler.onLastSessionRemoved();
        }
    }

    public void putDomainToListenerMapping(String str, IRtcscAppClientListener iRtcscAppClientListener) {
        this.mLog.i(String.format(Locale.US, "putDomainToListenerMapping: sessionDomain: %s, listener: %s", str, iRtcscAppClientListener));
        this.mAppClientListenersMap.put(str, iRtcscAppClientListener);
    }

    public void putSessionIdToDomainMapping(String str, String str2) {
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        rtcscLogger.i("putSessionIdToDomainMapping: sessionId: " + str + ", sessionDomain: " + str2);
        this.mSessionIdToDomainMap.put(str, str2);
    }

    public void removeDomainToListenerMapping(String str) {
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        RegionDefaults$$ExternalSyntheticOutline0.m("removeDomainToListenerMapping: sessionDomain: ", str, rtcscLogger);
        this.mAppClientListenersMap.remove(str);
    }

    public void removeSessionIdToDomainMapping(String str) {
        RtcscLogger rtcscLogger = this.mLog;
        Locale locale = Locale.US;
        RegionDefaults$$ExternalSyntheticOutline0.m("removeSessionIdToDomainMapping: sessionId: ", str, rtcscLogger);
        this.mSessionIdToDomainMap.remove(str);
    }
}
