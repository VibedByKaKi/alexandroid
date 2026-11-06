package com.esotericsoftware.reflectasm;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import java.lang.reflect.Modifier;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class ConstructorAccess<T> {
    boolean isNonStaticMemberClass;

    public static <T> ConstructorAccess<T> get(Class<T> cls) {
        int modifiers;
        String str;
        Class<?> defineClass;
        Class<?> enclosingClass = cls.getEnclosingClass();
        boolean z = (enclosingClass == null || !cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? false : true;
        String name = cls.getName();
        String concat = name.concat("ConstructorAccess");
        if (concat.startsWith("java.")) {
            concat = "reflectasm.".concat(concat);
        }
        AccessClassLoader accessClassLoader = AccessClassLoader.get(cls);
        synchronized (accessClassLoader) {
            try {
                defineClass = accessClassLoader.loadClass(concat);
            } catch (ClassNotFoundException unused) {
                String replace = concat.replace('.', '/');
                String replace2 = name.replace('.', '/');
                if (z) {
                    String replace3 = enclosingClass.getName().replace('.', '/');
                    try {
                        modifiers = cls.getDeclaredConstructor(enclosingClass).getModifiers();
                        if (Modifier.isPrivate(modifiers)) {
                            throw new RuntimeException("Non-static member class cannot be created (the enclosing class constructor is private): ".concat(cls.getName()));
                        }
                        str = replace3;
                    } catch (Exception e) {
                        throw new RuntimeException("Non-static member class cannot be created (missing enclosing class constructor): ".concat(cls.getName()), e);
                    }
                } else {
                    str = null;
                    try {
                        modifiers = cls.getDeclaredConstructor(null).getModifiers();
                        if (Modifier.isPrivate(modifiers)) {
                            throw new RuntimeException("Class cannot be created (the no-arg constructor is private): ".concat(cls.getName()));
                        }
                    } catch (Exception e2) {
                        throw new RuntimeException("Class cannot be created (missing no-arg constructor): ".concat(cls.getName()), e2);
                    }
                }
                String str2 = Modifier.isPublic(modifiers) ? "com/esotericsoftware/reflectasm/PublicConstructorAccess" : "com/esotericsoftware/reflectasm/ConstructorAccess";
                ClassWriter classWriter = new ClassWriter(0);
                classWriter.visit(196653, 33, replace, null, str2, null);
                insertConstructor(classWriter, str2);
                insertNewInstance(classWriter, replace2);
                insertNewInstanceInner(classWriter, replace2, str);
                classWriter.visitEnd();
                defineClass = accessClassLoader.defineClass(concat, classWriter.toByteArray());
            }
        }
        try {
            ConstructorAccess<T> constructorAccess = (ConstructorAccess) defineClass.newInstance();
            if (!(constructorAccess instanceof PublicConstructorAccess) && !AccessClassLoader.areInSameRuntimeClassLoader(cls, defineClass)) {
                throw new RuntimeException((!z ? "Class cannot be created (the no-arg constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): " : "Non-static member class cannot be created (the enclosing class constructor is protected or package-protected, and its ConstructorAccess could not be defined in the same class loader): ").concat(cls.getName()));
            }
            constructorAccess.isNonStaticMemberClass = z;
            return constructorAccess;
        } catch (Throwable th) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Exception constructing constructor access class: ".concat(concat), th);
            return null;
        }
    }

    private static void insertConstructor(ClassWriter classWriter, String str) {
        MethodVisitor visitMethod = classWriter.visitMethod(1, "<init>", "()V", null, null);
        visitMethod.visitCode();
        visitMethod.visitVarInsn(25, 0);
        visitMethod.visitMethodInsn(183, str, "<init>", "()V");
        visitMethod.visitInsn(177);
        visitMethod.visitMaxs(1, 1);
        visitMethod.visitEnd();
    }

    public static void insertNewInstance(ClassWriter classWriter, String str) {
        MethodVisitor visitMethod = classWriter.visitMethod(1, SmartFragmentEventProcessor.NEW_INSTANCE, "()Ljava/lang/Object;", null, null);
        visitMethod.visitCode();
        visitMethod.visitTypeInsn(187, str);
        visitMethod.visitInsn(89);
        visitMethod.visitMethodInsn(183, str, "<init>", "()V");
        visitMethod.visitInsn(176);
        visitMethod.visitMaxs(2, 1);
        visitMethod.visitEnd();
    }

    public static void insertNewInstanceInner(ClassWriter classWriter, String str, String str2) {
        MethodVisitor visitMethod = classWriter.visitMethod(1, SmartFragmentEventProcessor.NEW_INSTANCE, "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
        visitMethod.visitCode();
        if (str2 != null) {
            visitMethod.visitTypeInsn(187, str);
            visitMethod.visitInsn(89);
            visitMethod.visitVarInsn(25, 1);
            visitMethod.visitTypeInsn(192, str2);
            visitMethod.visitInsn(89);
            visitMethod.visitMethodInsn(182, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            visitMethod.visitInsn(87);
            visitMethod.visitMethodInsn(183, str, "<init>", "(L" + str2 + ";)V");
            visitMethod.visitInsn(176);
            visitMethod.visitMaxs(4, 2);
        } else {
            visitMethod.visitTypeInsn(187, "java/lang/UnsupportedOperationException");
            visitMethod.visitInsn(89);
            visitMethod.visitLdcInsn("Not an inner class.");
            visitMethod.visitMethodInsn(183, "java/lang/UnsupportedOperationException", "<init>", "(Ljava/lang/String;)V");
            visitMethod.visitInsn(191);
            visitMethod.visitMaxs(3, 2);
        }
        visitMethod.visitEnd();
    }

    public boolean isNonStaticMemberClass() {
        return this.isNonStaticMemberClass;
    }

    public abstract T newInstance();

    public abstract T newInstance(Object obj);
}
