package io.branch.referral.validators;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class IntegrationValidatorCheck {
    String errorMessage;
    String moreInfoLink;
    String name;

    public String GetMoreInfoLink() {
        return this.moreInfoLink;
    }

    public String GetOutput(Context context, boolean z) {
        RunTests(context);
        return this.errorMessage;
    }

    public String GetTestName() {
        return this.name;
    }

    public abstract boolean RunTests(Context context);
}
