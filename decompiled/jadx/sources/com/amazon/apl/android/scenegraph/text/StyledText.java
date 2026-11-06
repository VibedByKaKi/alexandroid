package com.amazon.apl.android.scenegraph.text;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.apl.android.TextProxy;
import com.amazon.apl.android.primitive.Dimension;
import com.amazon.apl.android.scenegraph.text.AutoValue_StyledText_Span;
import com.amazon.apl.android.scenegraph.text.AutoValue_StyledText_SpanTransition;
import com.amazon.apl.android.text.LineSpan;
import com.amazon.apl.android.utils.ColorUtils;
import com.amazon.apl.enums.SpanAttributeName;
import com.amazon.apl.enums.SpanType;
import com.amazon.apl.enums.TokenType;
import com.google.auto.value.AutoValue;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class StyledText {
    private static final String TAG = "StyledText";
    private final long mNativeHandle;
    private final String mUnprocessedText;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.apl.android.scenegraph.text.StyledText$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$SpanAttributeName;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$SpanType;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$apl$enums$TokenType;

        static {
            int[] iArr = new int[SpanAttributeName.values().length];
            $SwitchMap$com$amazon$apl$enums$SpanAttributeName = iArr;
            try {
                iArr[SpanAttributeName.kSpanAttributeNameColor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$SpanAttributeName[SpanAttributeName.kSpanAttributeNameFontSize.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[TokenType.values().length];
            $SwitchMap$com$amazon$apl$enums$TokenType = iArr2;
            try {
                iArr2[TokenType.kStartSpan.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$TokenType[TokenType.kEndSpan.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$TokenType[TokenType.kString.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$TokenType[TokenType.kEnd.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[SpanType.values().length];
            $SwitchMap$com$amazon$apl$enums$SpanType = iArr3;
            try {
                iArr3[SpanType.kSpanTypeLineBreak.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$SpanType[SpanType.kSpanTypeStrong.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$SpanType[SpanType.kSpanTypeItalic.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$SpanType[SpanType.kSpanTypeStrike.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$SpanType[SpanType.kSpanTypeUnderline.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$SpanType[SpanType.kSpanTypeMonospace.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$SpanType[SpanType.kSpanTypeSuperscript.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$SpanType[SpanType.kSpanTypeSubscript.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$amazon$apl$enums$SpanType[SpanType.kSpanTypeSpan.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class Span {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract Span build();

            public abstract Builder end(int i);

            public abstract Builder start(int i);

            public abstract Builder type(SpanType spanType);
        }

        public static Builder builder() {
            return new AutoValue_StyledText_Span.Builder();
        }

        public abstract int end();

        public abstract int start();

        public abstract SpanType type();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class SpanTransition {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @AutoValue.Builder
        public static abstract class Builder {
            public abstract SpanTransition build();

            public abstract Builder setAttributes(Map<SpanAttributeName, Object> map);

            public abstract Builder setSpanType(SpanType spanType);

            public abstract Builder setString(String str);

            public abstract Builder setTokenType(TokenType tokenType);
        }

        public static Builder builder() {
            return new AutoValue_StyledText_SpanTransition.Builder();
        }

        @Nullable
        public abstract Map<SpanAttributeName, Object> getAttributes();

        @Nullable
        public abstract SpanType getSpanType();

        @Nullable
        public abstract String getString();

        public abstract TokenType getTokenType();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class StyledTextIterator implements Iterator<SpanTransition> {
        private SpanTransition mCurrentTransition;
        private final long nIteratorPtr;

        public StyledTextIterator() {
            this.nIteratorPtr = StyledText.nCreateStyledTextIterator(StyledText.this.mNativeHandle);
        }

        private Map<SpanAttributeName, Object> getSpanAttributes() {
            int[] nStyledTextIteratorGetSpanAttributesNames = StyledText.nStyledTextIteratorGetSpanAttributesNames(this.nIteratorPtr);
            HashMap hashMap = new HashMap();
            for (int i : nStyledTextIteratorGetSpanAttributesNames) {
                SpanAttributeName valueOf = SpanAttributeName.valueOf(i);
                int i2 = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$SpanAttributeName[valueOf.ordinal()];
                hashMap.put(valueOf, i2 != 1 ? i2 != 2 ? null : Dimension.create((float) StyledText.nStyledTextIteratorGetSpanAttributeGetDimension(this.nIteratorPtr, SpanAttributeName.kSpanAttributeNameFontSize.getIndex())) : Integer.valueOf(ColorUtils.toARGB(StyledText.nStyledTextIteratorGetSpanAttributeGetColor(this.nIteratorPtr, SpanAttributeName.kSpanAttributeNameColor.getIndex()))));
            }
            return hashMap;
        }

        public void finalize() {
            StyledText.nDestroyStyledTextIterator(this.nIteratorPtr);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            SpanTransition spanTransition = this.mCurrentTransition;
            return spanTransition == null || spanTransition.getTokenType() != TokenType.kEnd;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public SpanTransition next() {
            TokenType valueOf = TokenType.valueOf(StyledText.nStyledTextIteratorNext(this.nIteratorPtr));
            SpanTransition.Builder tokenType = SpanTransition.builder().setTokenType(valueOf);
            int i = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$TokenType[valueOf.ordinal()];
            if (i == 1) {
                tokenType.setSpanType(SpanType.valueOf(StyledText.nStyledTextIteratorGetSpanType(this.nIteratorPtr)));
                tokenType.setAttributes(getSpanAttributes());
            } else if (i == 2) {
                tokenType.setSpanType(SpanType.valueOf(StyledText.nStyledTextIteratorGetSpanType(this.nIteratorPtr)));
            } else if (i == 3) {
                tokenType.setString(new String(StyledText.nStyledTextIteratorGetString(this.nIteratorPtr), StandardCharsets.UTF_8));
            }
            SpanTransition build = tokenType.build();
            this.mCurrentTransition = build;
            return build;
        }
    }

    public StyledText(long j) {
        this.mNativeHandle = j;
        this.mUnprocessedText = nGetUnprocessedText(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1 A[LOOP:0: B:11:0x009b->B:13:0x00a1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addSpan(@androidx.annotation.NonNull android.text.SpannableStringBuilder r2, int r3, int r4, com.amazon.apl.enums.SpanType r5, java.util.Map<com.amazon.apl.enums.SpanAttributeName, java.lang.Object> r6) {
        /*
            r1 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int[] r0 = com.amazon.apl.android.scenegraph.text.StyledText.AnonymousClass1.$SwitchMap$com$amazon$apl$enums$SpanType
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto Lac;
                case 2: goto L8e;
                case 3: goto L84;
                case 4: goto L7b;
                case 5: goto L72;
                case 6: goto L67;
                case 7: goto L5e;
                case 8: goto L55;
                case 9: goto L11;
                default: goto L10;
            }
        L10:
            goto L45
        L11:
            com.amazon.apl.enums.SpanAttributeName r5 = com.amazon.apl.enums.SpanAttributeName.kSpanAttributeNameColor
            java.lang.Object r0 = r6.get(r5)
            if (r0 == 0) goto L2b
            java.lang.Object r5 = r6.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r5)
            r1.add(r0)
        L2b:
            com.amazon.apl.enums.SpanAttributeName r5 = com.amazon.apl.enums.SpanAttributeName.kSpanAttributeNameFontSize
            java.lang.Object r0 = r6.get(r5)
            if (r0 == 0) goto L45
            java.lang.Object r5 = r6.get(r5)
            com.amazon.apl.android.primitive.Dimension r5 = (com.amazon.apl.android.primitive.Dimension) r5
            android.text.style.AbsoluteSizeSpan r6 = new android.text.style.AbsoluteSizeSpan
            int r5 = r5.intValue()
            r6.<init>(r5)
            r1.add(r6)
        L45:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L97
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r6 = 0
            r5.<init>(r6)
            r1.add(r5)
            goto L97
        L55:
            android.text.style.SubscriptSpan r5 = new android.text.style.SubscriptSpan
            r5.<init>()
            r1.add(r5)
            goto L97
        L5e:
            android.text.style.SuperscriptSpan r5 = new android.text.style.SuperscriptSpan
            r5.<init>()
            r1.add(r5)
            goto L97
        L67:
            android.text.style.TypefaceSpan r5 = new android.text.style.TypefaceSpan
            java.lang.String r6 = "monospace"
            r5.<init>(r6)
            r1.add(r5)
            goto L97
        L72:
            android.text.style.UnderlineSpan r5 = new android.text.style.UnderlineSpan
            r5.<init>()
            r1.add(r5)
            goto L97
        L7b:
            android.text.style.StrikethroughSpan r5 = new android.text.style.StrikethroughSpan
            r5.<init>()
            r1.add(r5)
            goto L97
        L84:
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r6 = 2
            r5.<init>(r6)
            r1.add(r5)
            goto L97
        L8e:
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r6 = 1
            r5.<init>(r6)
            r1.add(r5)
        L97:
            java.util.Iterator r1 = r1.iterator()
        L9b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lab
            java.lang.Object r5 = r1.next()
            r6 = 33
            r2.setSpan(r5, r3, r4, r6)
            goto L9b
        Lab:
            return
        Lac:
            r1 = 10
            r2.append(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.apl.android.scenegraph.text.StyledText.addSpan(android.text.SpannableStringBuilder, int, int, com.amazon.apl.enums.SpanType, java.util.Map):void");
    }

    private void handleEndSpan(Stack<SpanType> stack, SpannableStringBuilder spannableStringBuilder, SpanType spanType) {
        if (spanType == SpanType.kSpanTypeNoBreak && !stack.empty()) {
            stack.pop();
            if (!stack.empty() || spannableStringBuilder.length() <= 0) {
                return;
            }
            if (spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 8288) {
                Log.wtf(TAG, "<nobr> tag ended but there was no tailing word joiner char");
            }
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private void handleStartSpan(Stack<SpanType> stack, SpannableStringBuilder spannableStringBuilder, SpanType spanType) {
        SpanType spanType2 = SpanType.kSpanTypeNoBreak;
        if (spanType != spanType2) {
            return;
        }
        if (stack.empty()) {
            spannableStringBuilder.append((CharSequence) String.valueOf(TextProxy.WORD_BREAK_OPPORTUNITY_CHAR));
        }
        stack.push(spanType2);
    }

    private String handleString(Stack<SpanType> stack, String str) {
        if (stack.empty()) {
            return str;
        }
        if (str.length() == 0) {
            return str;
        }
        String replace = str.replace("", String.valueOf(TextProxy.WORD_JOINER_CHAR));
        return replace.substring(1, replace.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateStyledTextIterator(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyStyledTextIterator(long j);

    @NonNull
    private static native String nGetUnprocessedText(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nStyledTextIteratorGetSpanAttributeGetColor(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native double nStyledTextIteratorGetSpanAttributeGetDimension(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int[] nStyledTextIteratorGetSpanAttributesNames(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nStyledTextIteratorGetSpanType(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native byte[] nStyledTextIteratorGetString(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nStyledTextIteratorNext(long j);

    @NonNull
    private SpannableStringBuilder processStyledText(@NonNull StyledText styledText, LineSpan lineSpan) {
        StyledText styledText2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Objects.requireNonNull(styledText);
        StyledTextIterator styledTextIterator = styledText.new StyledTextIterator();
        Stack<SpanType> stack = new Stack<>();
        Stack stack2 = new Stack();
        Stack stack3 = new Stack();
        while (styledTextIterator.hasNext()) {
            SpanTransition next = styledTextIterator.next();
            int i = AnonymousClass1.$SwitchMap$com$amazon$apl$enums$TokenType[next.getTokenType().ordinal()];
            if (i == 1) {
                styledText2 = this;
                stack2.push(next);
                stack3.push(Integer.valueOf(spannableStringBuilder.length()));
                styledText2.handleStartSpan(stack, spannableStringBuilder, next.getSpanType());
            } else if (i != 2) {
                if (i == 3) {
                    spannableStringBuilder.append((CharSequence) this.handleString(stack, next.getString()));
                }
                styledText2 = this;
            } else {
                int intValue = ((Integer) stack3.pop()).intValue();
                SpanTransition spanTransition = (SpanTransition) stack2.pop();
                int length = spannableStringBuilder.length();
                SpanType spanType = next.getSpanType();
                Map<SpanAttributeName, Object> attributes = spanTransition.getAttributes();
                styledText2 = this;
                styledText2.addSpan(spannableStringBuilder, intValue, length, spanType, attributes);
                styledText2.handleEndSpan(stack, spannableStringBuilder, next.getSpanType());
            }
            this = styledText2;
        }
        if (lineSpan != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(lineSpan.getColor()), lineSpan.getStart(), lineSpan.getEnd(), 33);
        }
        return spannableStringBuilder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StyledText) {
            return this.mUnprocessedText.equals(((StyledText) obj).mUnprocessedText);
        }
        return false;
    }

    public CharSequence getText(LineSpan lineSpan) {
        return Spannable.Factory.getInstance().newSpannable(processStyledText(this, lineSpan));
    }

    public String getUnprocessedText() {
        return this.mUnprocessedText;
    }
}
