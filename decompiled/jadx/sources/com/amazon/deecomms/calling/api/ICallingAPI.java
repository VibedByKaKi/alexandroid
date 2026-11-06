package com.amazon.deecomms.calling.api;

import android.os.Bundle;
import com.amazon.deecomms.calling.api.exceptions.CallException;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface ICallingAPI {
    void answerCall(String str);

    void endCall(String str);

    void getCallHistory(int i, ResponseCallback<List<HistoricalCall>> responseCallback);

    CallInfo[] getCallInformation();

    void handleDirective(String str, String str2, String str3);

    void handleNotification(Bundle bundle);

    Future initiateCall(CallRequest callRequest, CallStateListener callStateListener) throws CallException;

    void rejectCall(String str);
}
