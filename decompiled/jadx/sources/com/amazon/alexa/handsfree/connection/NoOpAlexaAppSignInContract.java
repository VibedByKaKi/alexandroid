package com.amazon.alexa.handsfree.connection;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.utils.AlexaAppSignInContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class NoOpAlexaAppSignInContract implements AlexaAppSignInContract {
    private static final String TAG = "NoOpAlexaAppSignInContract";

    @Override // com.amazon.alexa.handsfree.protocols.utils.AlexaAppSignInContract
    public void teardown(@NonNull Context context) {
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.AlexaAppSignInContract
    public boolean getSignInState(@NonNull Context context, boolean z) {
        return z;
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.AlexaAppSignInContract
    public void setup(@NonNull Context context, boolean z) {
    }
}
