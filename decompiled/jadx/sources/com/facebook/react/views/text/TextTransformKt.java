package com.facebook.react.views.text;

import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000¨\u0006\u0004"}, d2 = {"applyTextTransform", "", ReactBaseTextShadowNode.PROP_TEXT_TRANSFORM, "Lcom/facebook/react/views/text/TextTransform;", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextTransform.kt\ncom/facebook/react/views/text/TextTransformKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1#2:50\n*E\n"})
/* loaded from: classes7.dex */
public final class TextTransformKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextTransform.values().length];
            try {
                iArr[TextTransform.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextTransform.LOWERCASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextTransform.CAPITALIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String applyTextTransform(@NotNull String str, @Nullable TextTransform textTransform) {
        str.getClass();
        int i = textTransform == null ? -1 : WhenMappings.$EnumSwitchMapping$0[textTransform.ordinal()];
        if (i == 1) {
            Locale locale = Locale.getDefault();
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            return upperCase;
        }
        if (i == 2) {
            Locale locale2 = Locale.getDefault();
            locale2.getClass();
            String lowerCase = str.toLowerCase(locale2);
            lowerCase.getClass();
            return lowerCase;
        }
        if (i != 3) {
            return str;
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        StringBuilder sb = new StringBuilder(str.length());
        int first = wordInstance.first();
        int next = wordInstance.next();
        while (true) {
            int i2 = next;
            int i3 = first;
            first = i2;
            if (first == -1) {
                return sb.toString();
            }
            String substring = str.substring(i3, first);
            if (substring.length() > 0) {
                substring = Character.toUpperCase(substring.charAt(0)) + substring.substring(1);
            }
            sb.append(substring);
            next = wordInstance.next();
        }
    }
}
