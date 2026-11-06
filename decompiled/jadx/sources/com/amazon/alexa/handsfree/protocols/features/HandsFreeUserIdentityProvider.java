package com.amazon.alexa.handsfree.protocols.features;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeUserIdentity;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AhfScope
/* loaded from: classes17.dex */
public class HandsFreeUserIdentityProvider {
    private HandsFreeAppSwitcher mHandsFreeAppSwitcher;
    private HandsFreeUserIdentity mHandsFreeUserIdentity;
    private final Set<HandsFreeUserIdentity.Listener> mListeners = new HashSet();

    @Inject
    public HandsFreeUserIdentityProvider() {
    }

    public void addListener(@NonNull HandsFreeUserIdentity.Listener listener) {
        this.mListeners.add(listener);
    }

    @Nullable
    public synchronized HandsFreeAppSwitcher getHandsFreeAppSwitcher() {
        return this.mHandsFreeAppSwitcher;
    }

    @Nullable
    public synchronized HandsFreeUserIdentity getHandsFreeUserIdentity() {
        return this.mHandsFreeUserIdentity;
    }

    public synchronized void setHandsFreeAppSwitcher(@NonNull HandsFreeAppSwitcher handsFreeAppSwitcher) {
        this.mHandsFreeAppSwitcher = handsFreeAppSwitcher;
    }

    public synchronized void setHandsFreeUserIdentity(@Nullable HandsFreeUserIdentity handsFreeUserIdentity) {
        boolean z = handsFreeUserIdentity != this.mHandsFreeUserIdentity;
        this.mHandsFreeUserIdentity = handsFreeUserIdentity;
        if (z) {
            Iterator<HandsFreeUserIdentity.Listener> it2 = this.mListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onHandsFreeUserIdentityChanged(handsFreeUserIdentity);
            }
        }
    }
}
