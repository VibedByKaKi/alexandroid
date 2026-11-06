package com.google.auto.value.processor;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import autovalue.shaded.com.google.common.base.Ascii;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import autovalue.shaded.com.google.common.collect.ImmutableMap;
import autovalue.shaded.com.google.common.collect.UnmodifiableIterator;
import autovalue.shaded.com.google.common.io.ByteStreams;
import autovalue.shaded.com.google.escapevelocity.Template;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.UncheckedIOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.TreeMap;
import java.util.jar.JarFile;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
abstract class TemplateVars {
    private final ImmutableList<Field> fields = getFields(getClass());

    private static void addFields(ImmutableList.Builder<Field> builder, Field[] fieldArr) {
        for (Field field : fieldArr) {
            if (!field.isSynthetic() && !isStaticFinal(field)) {
                if (Modifier.isPrivate(field.getModifiers())) {
                    Gson$$ExternalSyntheticBUOutline0.m((Object) field, "Field cannot be private: ");
                    return;
                } else if (Modifier.isStatic(field.getModifiers())) {
                    Gson$$ExternalSyntheticBUOutline0.m((Object) field, "Field cannot be static unless also final: ");
                    return;
                } else {
                    if (field.getType().isPrimitive()) {
                        Gson$$ExternalSyntheticBUOutline0.m((Object) field, "Field cannot be primitive: ");
                        return;
                    }
                    builder.add((ImmutableList.Builder<Field>) field);
                }
            }
        }
    }

    private static Object fieldValue(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (IllegalAccessException e) {
            Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
            return null;
        }
    }

    private static ImmutableList<Field> getFields(Class<?> cls) {
        ImmutableList.Builder builder = ImmutableList.builder();
        while (cls != TemplateVars.class) {
            addFields(builder, cls.getDeclaredFields());
            cls = cls.getSuperclass();
        }
        return builder.build();
    }

    private static boolean isStaticFinal(Field field) {
        int modifiers = field.getModifiers();
        return Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
    }

    public static Template parsedTemplateForResource(String str) {
        try {
            return Template.parseFrom(str, new TemplateVars$$ExternalSyntheticLambda0());
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static Reader readerFromFile(URL url) throws IOException, URISyntaxException {
        return new InputStreamReader(new FileInputStream(new File(url.toURI())), StandardCharsets.UTF_8);
    }

    private static Reader readerFromJar(URL url) throws URISyntaxException, IOException {
        String substring = url.toString().substring(4);
        int lastIndexOf = substring.lastIndexOf(33);
        String substring2 = substring.substring(lastIndexOf + 1);
        if (substring2.startsWith("/")) {
            substring2 = substring2.substring(1);
        }
        JarFile jarFile = new JarFile(new File(new URI(substring.substring(0, lastIndexOf))));
        try {
            InputStream inputStream = jarFile.getInputStream(jarFile.getJarEntry(substring2));
            try {
                StringReader stringReader = new StringReader(new String(ByteStreams.toByteArray(inputStream), StandardCharsets.UTF_8));
                if (inputStream != null) {
                    inputStream.close();
                }
                jarFile.close();
                return stringReader;
            } finally {
            }
        } catch (Throwable th) {
            try {
                jarFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static Reader readerFromOther(URL url) throws IOException {
        return new InputStreamReader(url.openStream(), StandardCharsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Reader readerFromUrl(String str) throws IOException {
        URL resource = TemplateVars.class.getResource(str);
        if (resource == null) {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Could not find resource: ", str));
            return null;
        }
        try {
            return Ascii.equalsIgnoreCase(resource.getProtocol(), "file") ? readerFromFile(resource) : Ascii.equalsIgnoreCase(resource.getProtocol(), "jar") ? readerFromJar(resource) : readerFromOther(resource);
        } catch (URISyntaxException e) {
            Buffer$$ExternalSyntheticBUOutline0.m$2(e);
            return null;
        }
    }

    private ImmutableMap<String, Object> toVars() {
        TreeMap treeMap = new TreeMap();
        UnmodifiableIterator<Field> it2 = this.fields.iterator();
        while (it2.hasNext()) {
            Field next = it2.next();
            Object fieldValue = fieldValue(next, this);
            if (fieldValue == null) {
                Gson$$ExternalSyntheticBUOutline0.m((Object) next, "Field cannot be null (was it set?): ");
                return null;
            }
            if (treeMap.put(next.getName(), fieldValue) != null) {
                OnnxMap$$ExternalSyntheticBUOutline0.m$1("Two fields called ", next.getName(), "?!");
                return null;
            }
        }
        return ImmutableMap.copyOf((Map) treeMap);
    }

    public abstract Template parsedTemplate();

    public String toString() {
        return getClass().getSimpleName() + toVars();
    }

    public String toText() {
        return parsedTemplate().evaluate(toVars());
    }
}
