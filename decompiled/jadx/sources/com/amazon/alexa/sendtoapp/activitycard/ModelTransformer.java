package com.amazon.alexa.sendtoapp.activitycard;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.applink.evaluator.Target;
import com.amazon.alexa.applink.evaluator.TargetIdentifierType;
import com.amazon.alexa.sendtoapp.activitycard.model.v1.IdentifierType;
import com.amazon.alexa.sendtoapp.activitycard.model.v1.LaunchConfig;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ModelTransformer {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.sendtoapp.activitycard.ModelTransformer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$sendtoapp$activitycard$model$v1$IdentifierType;

        static {
            int[] iArr = new int[IdentifierType.values().length];
            $SwitchMap$com$amazon$alexa$sendtoapp$activitycard$model$v1$IdentifierType = iArr;
            try {
                iArr[IdentifierType.URI_HTTP_SCHEME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$sendtoapp$activitycard$model$v1$IdentifierType[IdentifierType.URI_CUSTOM_SCHEME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$sendtoapp$activitycard$model$v1$IdentifierType[IdentifierType.URI_ANDROID_INTENT_SCHEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$sendtoapp$activitycard$model$v1$IdentifierType[IdentifierType.URI_APP_IDENTIFIER_SCHEME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private ModelTransformer() {
    }

    @VisibleForTesting
    public static boolean mustLaunchTargetInGivenApp(LaunchConfig launchConfig) {
        if (launchConfig == null || launchConfig.mustLaunchTargetInGivenApp() == null) {
            return false;
        }
        return launchConfig.mustLaunchTargetInGivenApp().booleanValue();
    }

    @VisibleForTesting
    public static TargetIdentifierType transformIdentifierType(IdentifierType identifierType) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$sendtoapp$activitycard$model$v1$IdentifierType[identifierType.ordinal()];
        if (i == 1) {
            return TargetIdentifierType.URI_HTTP_SCHEME;
        }
        if (i == 2) {
            return TargetIdentifierType.URI_CUSTOM_SCHEME;
        }
        if (i == 3) {
            return TargetIdentifierType.URI_ANDROID_INTENT_SCHEME;
        }
        if (i == 4) {
            return TargetIdentifierType.URI_APP_IDENTIFIER_SCHEME;
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3(identifierType, "Invalid identifier type: ");
        return null;
    }

    public static Target transformTarget(com.amazon.alexa.sendtoapp.activitycard.model.v1.Target target) {
        return Target.create(target.getCatalogId(), target.getIdentifier(), transformIdentifierType(target.getIdentifierType()), mustLaunchTargetInGivenApp(target.getLaunchConfig()));
    }
}
