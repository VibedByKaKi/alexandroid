package com.amazon.deecomms.calling.ui;

import androidx.annotation.NonNull;
import java.util.Observable;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public class NameChangeObservable extends Observable {
    @Inject
    public NameChangeObservable() {
    }

    public void onCustomerNameChanged(@NonNull String str) {
        setChanged();
        notifyObservers(str);
    }
}
