package com.google.auto.value.processor;

import androidx.camera.video.Recorder$$ExternalSyntheticLambda18;
import androidx.exifinterface.media.ExifInterface;
import autovalue.shaded.com.google.auto.common.MoreElements;
import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.UnmodifiableIterator;
import autovalue.shaded.org.objectweb.asm.ClassWriter;
import autovalue.shaded.org.objectweb.asm.MethodVisitor;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.stream.Collectors;
import javax.lang.model.element.NestingKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class ForwardingClassGenerator {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.google.auto.value.processor.ForwardingClassGenerator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$lang$model$type$TypeKind;

        static {
            int[] iArr = new int[TypeKind.values().length];
            $SwitchMap$javax$lang$model$type$TypeKind = iArr;
            try {
                iArr[TypeKind.DECLARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.BYTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.SHORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.CHAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.INT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$javax$lang$model$type$TypeKind[TypeKind.BOOLEAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private ForwardingClassGenerator() {
    }

    private static String internalName(TypeElement typeElement) {
        if (!typeElement.getNestingKind().equals(NestingKind.MEMBER)) {
            return internalName(typeElement.getQualifiedName().toString());
        }
        return internalName(MoreElements.asType(typeElement.getEnclosingElement())) + "$" + typeElement.getSimpleName();
    }

    private static int loadInstruction(TypeMirror typeMirror) {
        switch (AnonymousClass1.$SwitchMap$javax$lang$model$type$TypeKind[typeMirror.getKind().ordinal()]) {
            case 1:
            case 2:
                return 25;
            case 3:
                return 22;
            case 4:
                return 23;
            case 5:
                return 24;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return 21;
            default:
                Gson$$ExternalSyntheticBUOutline0.m((Object) typeMirror, "Unexpected type ");
                return 0;
        }
    }

    private static int localSize(TypeMirror typeMirror) {
        int i = AnonymousClass1.$SwitchMap$javax$lang$model$type$TypeKind[typeMirror.getKind().ordinal()];
        return (i == 3 || i == 5) ? 2 : 1;
    }

    public static byte[] makeConstructorForwarder(String str, TypeMirror typeMirror, ImmutableList<TypeMirror> immutableList) {
        ClassWriter classWriter = new ClassWriter(1);
        classWriter.visit(52, 48, internalName(str), null, "java/lang/Object", null);
        classWriter.visitSource(str, null);
        String str2 = (String) immutableList.stream().map(new ForwardingClassGenerator$$ExternalSyntheticLambda0()).collect(Collectors.joining(""));
        String internalName = internalName(MoreTypes.asTypeElement(typeMirror));
        MethodVisitor visitMethod = classWriter.visitMethod(8, "of", a$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_PARENTHESIS, str2, ")L", internalName, ";"), null, null);
        visitMethod.visitCode();
        visitMethod.visitTypeInsn(187, internalName);
        visitMethod.visitInsn(89);
        UnmodifiableIterator<TypeMirror> it2 = immutableList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            TypeMirror next = it2.next();
            visitMethod.visitVarInsn(loadInstruction(next), i);
            i += localSize(next);
        }
        visitMethod.visitMethodInsn(183, internalName, "<init>", a$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_PARENTHESIS, str2, ")V"), false);
        visitMethod.visitInsn(176);
        visitMethod.visitMaxs(0, 0);
        visitMethod.visitEnd();
        classWriter.visitEnd();
        return classWriter.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String signatureEncoding(TypeMirror typeMirror) {
        switch (AnonymousClass1.$SwitchMap$javax$lang$model$type$TypeKind[typeMirror.getKind().ordinal()]) {
            case 1:
                return a$$ExternalSyntheticOutline0.m(new StringBuilder("L"), internalName(MoreTypes.asTypeElement(typeMirror)), ";");
            case 2:
                return MarkdownConstants.LEFT_BRACKET + signatureEncoding(MoreTypes.asArray(typeMirror).getComponentType());
            case 3:
                return "J";
            case 4:
                return "F";
            case 5:
                return "D";
            case 6:
                return "B";
            case 7:
                return ExifInterface.LATITUDE_SOUTH;
            case 8:
                return "C";
            case 9:
                return "I";
            case 10:
                return "Z";
            default:
                Recorder$$ExternalSyntheticLambda18.m(typeMirror, "Bad signature type ");
                return null;
        }
    }

    private static String internalName(String str) {
        return str.replace('.', '/');
    }
}
