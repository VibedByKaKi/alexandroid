package com.amazon.coral.reflect;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class AsmUtils {
    private AsmUtils() {
    }

    private static void getDescriptor(StringBuilder sb, Class<?> cls) {
        while (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                sb.append(Matrix.MATRIX_TYPE_RANDOM_LT);
                String name = cls.getName();
                int length = name.length();
                for (int i = 0; i < length; i++) {
                    char charAt = name.charAt(i);
                    if (charAt == '.') {
                        charAt = '/';
                    }
                    sb.append(charAt);
                }
                sb.append(';');
                return;
            }
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            cls = cls.getComponentType();
        }
        sb.append(cls == Integer.TYPE ? 'I' : cls == Void.TYPE ? 'V' : cls == Boolean.TYPE ? Matrix.MATRIX_TYPE_ZERO : cls == Byte.TYPE ? 'B' : cls == Character.TYPE ? 'C' : cls == Short.TYPE ? 'S' : cls == Double.TYPE ? 'D' : cls == Float.TYPE ? 'F' : 'J');
    }

    public static String getInternalName(Class<?> cls) {
        return cls.getName().replace('.', '/');
    }

    public static String getDescriptor(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        getDescriptor(sb, cls);
        return sb.toString();
    }
}
