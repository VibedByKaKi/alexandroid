package com.amazon.dee.app.ui.view;

import android.text.method.ReplacementTransformationMethod;
import kotlin.text.Typography;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class WordBreakTransformationMethod extends ReplacementTransformationMethod {
    private static char[] emDash;
    private static char[] emSpace;
    private static char[] enDash;
    private static char[] enSpace;
    private static char[] figureDash;
    private static char[] horizontalBar;
    private static char[] hyphen;
    private static char[] hyphenMinus;
    private static WordBreakTransformationMethod instance;
    private static char[] original;
    private static char[] replacement;
    private static char[] slash;
    private static char[] space;

    static {
        char[] cArr = {'-', 8209};
        hyphenMinus = cArr;
        char[] cArr2 = {8208, 8209};
        hyphen = cArr2;
        char[] cArr3 = {8210, 8209};
        figureDash = cArr3;
        char[] cArr4 = {Typography.ndash, 8209};
        enDash = cArr4;
        char[] cArr5 = {Typography.mdash, 8209};
        emDash = cArr5;
        char[] cArr6 = {8213, 8209};
        horizontalBar = cArr6;
        char[] cArr7 = {' ', Typography.nbsp};
        space = cArr7;
        char[] cArr8 = {8194, Typography.nbsp};
        enSpace = cArr8;
        char[] cArr9 = {8195, Typography.nbsp};
        emSpace = cArr9;
        char[] cArr10 = {'/', 8725};
        slash = cArr10;
        original = new char[]{cArr[0], cArr2[0], cArr3[0], cArr4[0], cArr5[0], cArr6[0], cArr7[0], cArr8[0], cArr9[0], cArr10[0]};
        replacement = new char[]{cArr[1], cArr2[1], cArr3[1], cArr4[1], cArr5[1], cArr6[1], cArr7[1], cArr8[1], cArr9[1], cArr10[1]};
    }

    private WordBreakTransformationMethod() {
    }

    public static WordBreakTransformationMethod getInstance() {
        if (instance == null) {
            instance = new WordBreakTransformationMethod();
        }
        return instance;
    }

    @Override // android.text.method.ReplacementTransformationMethod
    public char[] getOriginal() {
        return original;
    }

    @Override // android.text.method.ReplacementTransformationMethod
    public char[] getReplacement() {
        return replacement;
    }
}
