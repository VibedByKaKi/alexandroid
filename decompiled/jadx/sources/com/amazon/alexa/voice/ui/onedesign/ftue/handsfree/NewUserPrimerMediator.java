package com.amazon.alexa.voice.ui.onedesign.ftue.handsfree;

import androidx.annotation.NonNull;
import com.amazon.alexa.voice.ui.onedesign.ftue.PermissionsDelegate;
import com.amazon.regulator.ViewController;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class NewUserPrimerMediator extends HandsfreePrimerMediator {
    private final String[] allPermissions;
    private PermissionsDelegate requester;

    public NewUserPrimerMediator(@NonNull ViewController viewController, @NonNull PermissionsDelegate permissionsDelegate, @NonNull String[] strArr) {
        super(viewController);
        this.requester = permissionsDelegate;
        this.allPermissions = (String[]) strArr.clone();
    }

    @Override // com.amazon.alexa.voice.ui.onedesign.ftue.handsfree.HandsfreePrimerContract.Mediator
    public void requestPermissions() {
        this.requester.requestPermissions((String[]) this.allPermissions.clone());
    }
}
