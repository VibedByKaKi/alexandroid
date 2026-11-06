package com.amazon.alexa.accessory.frames.routines;

import com.amazon.alexa.accessory.protocol.Input;
import com.google.common.base.Strings;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class TapRoutinesGestureHelper {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.accessory.frames.routines.TapRoutinesGestureHelper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputAction;

        static {
            int[] iArr = new int[Input.InputAction.values().length];
            $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputAction = iArr;
            try {
                iArr[Input.InputAction.INPUT_ACTION_TRIPLE_TAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputAction[Input.InputAction.INPUT_ACTION_LONG_PRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private TapRoutinesGestureHelper() {
    }

    public static String getGestureAction(Input.InputAction inputAction) {
        if (inputAction == null) {
            return null;
        }
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$accessory$protocol$Input$InputAction[inputAction.ordinal()];
        if (i == 1) {
            return TapRoutinesConstants.TRIPLE_TAP_ACTION_STR;
        }
        if (i != 2) {
            return null;
        }
        return TapRoutinesConstants.LONG_HOLD_ACTION_STR;
    }

    public static int getInputActionFromStr(String str) {
        if (Strings.isNullOrEmpty(str)) {
            return -1;
        }
        if (str.endsWith(TapRoutinesConstants.TRIPLE_TAP_ACTION_STR)) {
            return 13;
        }
        return str.endsWith(TapRoutinesConstants.LONG_HOLD_ACTION_STR) ? 5 : -1;
    }

    public static int getInputDeviceId(String str) {
        if (Strings.isNullOrEmpty(str)) {
            return 0;
        }
        if (str.startsWith(TapRoutinesConstants.RIGHT_BUD_STR)) {
            return 1;
        }
        return str.startsWith(TapRoutinesConstants.LEFT_BUD_STR) ? 2 : 0;
    }

    public static String getSource(int i) {
        if (i == 1) {
            return TapRoutinesConstants.RIGHT_BUD_STR;
        }
        if (i != 2) {
            return null;
        }
        return TapRoutinesConstants.LEFT_BUD_STR;
    }
}
