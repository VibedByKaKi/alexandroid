package expo.modules.core.interfaces.services;

import expo.modules.core.errors.CurrentActivityNotFoundException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface KeepAwakeManager {
    void activate(String str, Runnable runnable) throws CurrentActivityNotFoundException;

    void deactivate(String str, Runnable runnable) throws CurrentActivityNotFoundException;

    boolean isActivated();
}
