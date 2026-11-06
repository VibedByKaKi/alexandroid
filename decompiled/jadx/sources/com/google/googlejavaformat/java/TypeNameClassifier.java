package com.google.googlejavaformat.java;

import com.google.common.base.Verify;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class TypeNameClassifier {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.google.googlejavaformat.java.TypeNameClassifier$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$googlejavaformat$java$TypeNameClassifier$JavaCaseFormat;

        static {
            int[] iArr = new int[JavaCaseFormat.values().length];
            $SwitchMap$com$google$googlejavaformat$java$TypeNameClassifier$JavaCaseFormat = iArr;
            try {
                iArr[JavaCaseFormat.UPPERCASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$googlejavaformat$java$TypeNameClassifier$JavaCaseFormat[JavaCaseFormat.LOWER_CAMEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$googlejavaformat$java$TypeNameClassifier$JavaCaseFormat[JavaCaseFormat.LOWERCASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$googlejavaformat$java$TypeNameClassifier$JavaCaseFormat[JavaCaseFormat.UPPER_CAMEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum JavaCaseFormat {
        UPPERCASE,
        LOWERCASE,
        UPPER_CAMEL,
        LOWER_CAMEL;

        public static JavaCaseFormat from(String str) {
            boolean z = true;
            Verify.verify(!str.isEmpty());
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (Character.isAlphabetic(charAt)) {
                    if (z) {
                        z2 = Character.isUpperCase(charAt);
                        z = false;
                    }
                    z3 |= Character.isUpperCase(charAt);
                    z4 |= Character.isLowerCase(charAt);
                }
            }
            return z2 ? z4 ? UPPER_CAMEL : UPPERCASE : z3 ? LOWER_CAMEL : LOWERCASE;
        }
    }

    private TypeNameClassifier() {
    }

    public static int typePrefixLength(List<String> list) {
        TyParseState tyParseState = TyParseState.START;
        int i = -1;
        for (int i2 = 0; i2 < list.size() && (tyParseState = tyParseState.next(JavaCaseFormat.from(list.get(i2)))) != TyParseState.REJECT; i2++) {
            if (tyParseState.isSingleUnit()) {
                i = i2;
            }
        }
        return i;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum TyParseState {
        START(0 == true ? 1 : 0) { // from class: com.google.googlejavaformat.java.TypeNameClassifier.TyParseState.1
            @Override // com.google.googlejavaformat.java.TypeNameClassifier.TyParseState
            public TyParseState next(JavaCaseFormat javaCaseFormat) {
                int i = AnonymousClass1.$SwitchMap$com$google$googlejavaformat$java$TypeNameClassifier$JavaCaseFormat[javaCaseFormat.ordinal()];
                if (i == 1) {
                    return TyParseState.AMBIGUOUS;
                }
                if (i == 2) {
                    return TyParseState.REJECT;
                }
                if (i == 3) {
                    return TyParseState.START;
                }
                if (i == 4) {
                    return TyParseState.TYPE;
                }
                Buffer$$ExternalSyntheticBUOutline0.m$2();
                return null;
            }
        },
        TYPE(1 == true ? 1 : 0) { // from class: com.google.googlejavaformat.java.TypeNameClassifier.TyParseState.2
            @Override // com.google.googlejavaformat.java.TypeNameClassifier.TyParseState
            public TyParseState next(JavaCaseFormat javaCaseFormat) {
                int i = AnonymousClass1.$SwitchMap$com$google$googlejavaformat$java$TypeNameClassifier$JavaCaseFormat[javaCaseFormat.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    return TyParseState.FIRST_STATIC_MEMBER;
                }
                if (i == 4) {
                    return TyParseState.TYPE;
                }
                Buffer$$ExternalSyntheticBUOutline0.m$2();
                return null;
            }
        },
        FIRST_STATIC_MEMBER(1 == true ? 1 : 0) { // from class: com.google.googlejavaformat.java.TypeNameClassifier.TyParseState.3
            @Override // com.google.googlejavaformat.java.TypeNameClassifier.TyParseState
            public TyParseState next(JavaCaseFormat javaCaseFormat) {
                return TyParseState.REJECT;
            }
        },
        REJECT(0 == true ? 1 : 0) { // from class: com.google.googlejavaformat.java.TypeNameClassifier.TyParseState.4
            @Override // com.google.googlejavaformat.java.TypeNameClassifier.TyParseState
            public TyParseState next(JavaCaseFormat javaCaseFormat) {
                return TyParseState.REJECT;
            }
        },
        AMBIGUOUS(0 == true ? 1 : 0) { // from class: com.google.googlejavaformat.java.TypeNameClassifier.TyParseState.5
            @Override // com.google.googlejavaformat.java.TypeNameClassifier.TyParseState
            public TyParseState next(JavaCaseFormat javaCaseFormat) {
                int i = AnonymousClass1.$SwitchMap$com$google$googlejavaformat$java$TypeNameClassifier$JavaCaseFormat[javaCaseFormat.ordinal()];
                if (i == 1) {
                    return TyParseState.AMBIGUOUS;
                }
                if (i == 2 || i == 3) {
                    return TyParseState.REJECT;
                }
                if (i == 4) {
                    return TyParseState.TYPE;
                }
                Buffer$$ExternalSyntheticBUOutline0.m$2();
                return null;
            }
        };

        private final boolean isSingleUnit;

        TyParseState(boolean z) {
            this.isSingleUnit = z;
        }

        public boolean isSingleUnit() {
            return this.isSingleUnit;
        }

        public abstract TyParseState next(JavaCaseFormat javaCaseFormat);

        /* synthetic */ TyParseState(boolean z, AnonymousClass1 anonymousClass1) {
            this(z);
        }
    }
}
