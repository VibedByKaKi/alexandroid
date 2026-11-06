package com.amazon.alexa.alertsca.alertdisplay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import com.amazon.alexa.api.compat.model.AlertType;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class SharedDrawableResolver {
    private static final String DRAWABLE_RESOURCE_TYPE = "drawable";
    private static final String SHARED_ALARM_ICON = "ic_alarm";
    private static final String SHARED_TIMER_ICON = "ic_timer";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.alertsca.alertdisplay.SharedDrawableResolver$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$api$compat$model$AlertType;

        static {
            int[] iArr = new int[AlertType.values().length];
            $SwitchMap$com$amazon$alexa$api$compat$model$AlertType = iArr;
            try {
                iArr[AlertType.ALARM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$api$compat$model$AlertType[AlertType.TIMER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private SharedDrawableResolver() {
    }

    @SuppressLint({"DiscouragedApi"})
    public static int resolve(Context context, AlertType alertType) {
        String str;
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$api$compat$model$AlertType[alertType.ordinal()];
        if (i == 1) {
            str = SHARED_ALARM_ICON;
        } else {
            if (i != 2) {
                Gson$$ExternalSyntheticBUOutline0.m((Object) alertType, "No shared drawable for alert type: ");
                return 0;
            }
            str = SHARED_TIMER_ICON;
        }
        int identifier = context.getResources().getIdentifier(str, DRAWABLE_RESOURCE_TYPE, context.getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        throw new Resources.NotFoundException("Missing shared drawable: ".concat(str));
    }
}
