package com.amazon.alexa.auth.map;

import android.os.Process;
import android.os.RemoteException;
import com.amazon.alexa.auth.map.AuthorizationServiceProxy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class MAPAuthorizationServiceProxy extends AuthorizationServiceProxy.Stub {
    private final MAPAccountManagerWrapper accountManagerWrapper;

    public MAPAuthorizationServiceProxy(MAPAccountManagerWrapper mAPAccountManagerWrapper) {
        this.accountManagerWrapper = mAPAccountManagerWrapper;
    }

    @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
    public String getAccountPool() throws RemoteException {
        return this.accountManagerWrapper.getAccountPool();
    }

    @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
    public String getActorToken(String str) throws RemoteException {
        return this.accountManagerWrapper.getActorToken(str);
    }

    @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
    public String getDeviceSerialNumber() throws RemoteException {
        return this.accountManagerWrapper.getDeviceSerialNumber();
    }

    @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
    public String getDirectedID() throws RemoteException {
        return this.accountManagerWrapper.getDirectedID();
    }

    @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
    public String getMarketplace() throws RemoteException {
        return this.accountManagerWrapper.getMarketplace();
    }

    @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
    public String getToken() throws RemoteException {
        return this.accountManagerWrapper.getToken();
    }

    @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
    public boolean isLoggedIn() throws RemoteException {
        return this.accountManagerWrapper.isLoggedIn();
    }

    @Override // com.amazon.alexa.auth.map.AuthorizationServiceProxy
    public void killService() throws RemoteException {
        Process.killProcess(Process.myPid());
    }
}
