package io.branch.referral.validators;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class LinkingValidator {
    private static LinkingValidator instance;
    private LinkingValidatorDialog linkingValidatorDialog;

    private LinkingValidator(Context context) {
    }

    public static void validate(Context context) {
        if (instance == null) {
            instance = new LinkingValidator(context);
        }
        instance.linkingValidatorDialog = new LinkingValidatorDialog(context);
        instance.validateDeepLinkRouting(context);
    }

    private void validateDeepLinkRouting(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = instance.linkingValidatorDialog.getWindow();
        Objects.requireNonNull(window);
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        layoutParams.height = 2000;
        instance.linkingValidatorDialog.show();
        instance.linkingValidatorDialog.getWindow().setAttributes(layoutParams);
    }
}
