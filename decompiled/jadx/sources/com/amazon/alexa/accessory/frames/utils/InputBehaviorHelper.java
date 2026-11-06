package com.amazon.alexa.accessory.frames.utils;

import com.amazon.alexa.accessory.protocol.Input;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class InputBehaviorHelper {
    private static final String TAG = "InputBehaviorHelper";

    private InputBehaviorHelper() {
    }

    public static boolean isBackRightSource(Input.InputBehaviorConfiguration inputBehaviorConfiguration) {
        return inputBehaviorConfiguration.getSource() == Input.InputSource.INPUT_SOURCE_BACK_RIGHT;
    }

    public static boolean isFrontRightSource(Input.InputBehaviorConfiguration inputBehaviorConfiguration) {
        return inputBehaviorConfiguration.getSource() == Input.InputSource.INPUT_SOURCE_FRONT_RIGHT;
    }

    public static boolean isLongPressAction(Input.InputBehaviorConfiguration inputBehaviorConfiguration) {
        return inputBehaviorConfiguration.getAction() == Input.InputAction.INPUT_ACTION_LONG_PRESS;
    }

    public static boolean isRightButtonSource(Input.InputBehaviorConfiguration inputBehaviorConfiguration) {
        return isFrontRightSource(inputBehaviorConfiguration) || isBackRightSource(inputBehaviorConfiguration);
    }

    public static boolean isShortcutConfig(Input.InputBehaviorConfiguration inputBehaviorConfiguration) {
        return isLongPressAction(inputBehaviorConfiguration) && isRightButtonSource(inputBehaviorConfiguration);
    }

    public static String trimBehaviorName(Input.InputBehaviorConfiguration inputBehaviorConfiguration) {
        return inputBehaviorConfiguration.getBehavior().toString().replaceFirst("INPUT_BEHAVIOR_", "");
    }
}
