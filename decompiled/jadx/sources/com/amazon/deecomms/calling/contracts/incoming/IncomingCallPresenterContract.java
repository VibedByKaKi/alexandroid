package com.amazon.deecomms.calling.contracts.incoming;

import com.amazon.deecomms.calling.contracts.BasePresenterContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IncomingCallPresenterContract extends BasePresenterContract {
    void checkForPermissionsAndAcceptCall();

    void rejectCall();
}
