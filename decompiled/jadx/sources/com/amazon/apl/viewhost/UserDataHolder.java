package com.amazon.apl.viewhost;

import javax.annotation.concurrent.ThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ThreadSafe
/* loaded from: classes20.dex */
public class UserDataHolder {
    private Object mUserData;

    public synchronized Object getUserData() {
        return this.mUserData;
    }

    public synchronized boolean hasUserData() {
        return this.mUserData != null;
    }

    public synchronized boolean setUserData(Object obj) {
        this.mUserData = obj;
        return true;
    }
}
