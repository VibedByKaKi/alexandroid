package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.annotation.Nullable;
import com.bugsnag.android.repackaged.dslplatform.json.JsonReader;
import com.bugsnag.android.repackaged.dslplatform.json.JsonWriter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.w3c.dom.Element;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DslJson<TContext> implements UnknownSerializer, TypeLookup {
    private final JsonWriter.WriteObject NULL_WRITER;
    private final JsonWriter.WriteObject OBJECT_ARRAY_WRITER;
    private final JsonWriter.WriteObject<JsonObject> OBJECT_WRITER;
    public final boolean allowArrayFormat;
    protected final List<ConverterFactory<JsonReader.BindObject>> binderFactories;
    private final ConcurrentMap<Type, JsonReader.BindObject> binders;

    @Nullable
    public final TContext context;
    private final Map<Class<? extends Annotation>, Boolean> creatorMarkers;
    private final Map<Type, Object> defaults;
    private final JsonReader.DoublePrecision doublePrecision;
    private final JsonReader.ErrorInfo errorInfo;
    private final ExternalConverterAnalyzer externalConverterAnalyzer;

    @Nullable
    protected final Fallback<TContext> fallback;
    protected final StringCache keyCache;
    protected final ThreadLocal<JsonReader> localReader;
    protected final ThreadLocal<JsonWriter> localWriter;
    private final int maxNumberDigits;
    private final int maxStringSize;
    private final ConcurrentMap<Class<?>, JsonReader.ReadJsonObject<JsonObject>> objectReaders;
    public final boolean omitDefaults;
    protected final List<ConverterFactory<JsonReader.ReadObject>> readerFactories;
    private final ConcurrentMap<Type, JsonReader.ReadObject> readers;
    private final int settingsBinders;
    private final int settingsReaders;
    private final int settingsWriters;
    private final JsonReader.UnknownNumberParsing unknownNumbers;
    protected final StringCache valuesCache;
    protected final List<ConverterFactory<JsonWriter.WriteObject>> writerFactories;
    private final ConcurrentMap<Class<?>, Class<?>> writerMap;
    private final ConcurrentMap<Type, JsonWriter.WriteObject> writers;
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private static final Object unknownValue = new Object();
    private static final Iterator EMPTY_ITERATOR = new Iterator() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.4
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        @Nullable
        public Object next() {
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    };
    private static final JsonWriter.WriteObject CHAR_ARRAY_WRITER = new JsonWriter.WriteObject() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.8
        @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
        public void write(JsonWriter jsonWriter, @Nullable Object obj) {
            StringConverter.serialize(new String((char[]) obj), jsonWriter);
        }
    };
    private static final byte[] NULL = {110, 117, 108, 108};

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConverterFactory<T> {
        @Nullable
        T tryCreate(Type type, DslJson dslJson);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Fallback<TContext> {
        @Nullable
        Object deserialize(@Nullable TContext tcontext, Type type, InputStream inputStream) throws IOException;

        @Nullable
        Object deserialize(@Nullable TContext tcontext, Type type, byte[] bArr, int i) throws IOException;

        void serialize(@Nullable Object obj, OutputStream outputStream) throws IOException;
    }

    public DslJson(Settings<TContext> settings) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.writerFactories = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.readerFactories = copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        this.binderFactories = copyOnWriteArrayList3;
        this.defaults = new ConcurrentHashMap();
        this.objectReaders = new ConcurrentHashMap();
        this.readers = new ConcurrentHashMap();
        this.binders = new ConcurrentHashMap();
        this.writers = new ConcurrentHashMap();
        this.writerMap = new ConcurrentHashMap();
        this.OBJECT_WRITER = new JsonWriter.WriteObject<JsonObject>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.5
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
            public void write(JsonWriter jsonWriter, @Nullable JsonObject jsonObject) {
                if (jsonObject == null) {
                    jsonWriter.writeNull();
                } else {
                    jsonObject.serialize(jsonWriter, DslJson.this.omitDefaults);
                }
            }
        };
        this.OBJECT_ARRAY_WRITER = new JsonWriter.WriteObject() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.7
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
            public void write(JsonWriter jsonWriter, @Nullable Object obj) {
                DslJson.this.serialize(jsonWriter, (JsonObject[]) obj);
            }
        };
        this.NULL_WRITER = new JsonWriter.WriteObject() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.9
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
            public void write(JsonWriter jsonWriter, @Nullable Object obj) {
                jsonWriter.writeNull();
            }
        };
        if (settings == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("settings can't be null");
            throw null;
        }
        this.localWriter = new ThreadLocal<JsonWriter>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public JsonWriter initialValue() {
                return new JsonWriter(4096, this);
            }
        };
        this.localReader = new ThreadLocal<JsonReader>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.ThreadLocal
            public JsonReader initialValue() {
                DslJson dslJson = this;
                return new JsonReader(new byte[4096], 4096, dslJson.context, new char[64], dslJson.keyCache, dslJson.valuesCache, dslJson, dslJson.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
            }
        };
        this.context = (TContext) ((Settings) settings).context;
        this.fallback = ((Settings) settings).fallback;
        this.omitDefaults = ((Settings) settings).omitDefaults;
        this.allowArrayFormat = ((Settings) settings).allowArrayFormat;
        this.keyCache = ((Settings) settings).keyCache;
        this.valuesCache = ((Settings) settings).valuesCache;
        this.unknownNumbers = ((Settings) settings).unknownNumbers;
        this.errorInfo = ((Settings) settings).errorInfo;
        this.doublePrecision = ((Settings) settings).doublePrecision;
        this.maxNumberDigits = ((Settings) settings).maxNumberDigits;
        this.maxStringSize = ((Settings) settings).maxStringBuffer;
        copyOnWriteArrayList.addAll(((Settings) settings).writerFactories);
        this.settingsWriters = ((Settings) settings).writerFactories.size();
        copyOnWriteArrayList2.addAll(((Settings) settings).readerFactories);
        this.settingsReaders = ((Settings) settings).readerFactories.size();
        copyOnWriteArrayList3.addAll(((Settings) settings).binderFactories);
        this.settingsBinders = ((Settings) settings).binderFactories.size();
        this.externalConverterAnalyzer = new ExternalConverterAnalyzer(((Settings) settings).classLoaders);
        this.creatorMarkers = new HashMap(((Settings) settings).creatorMarkers);
        registerReader(byte[].class, BinaryConverter.Base64Reader);
        registerWriter(byte[].class, BinaryConverter.Base64Writer);
        JsonReader.ReadObject readObject = BoolConverter.READER;
        Class<T> cls = Boolean.TYPE;
        registerReader((Class) cls, readObject);
        JsonWriter.WriteObject writeObject = BoolConverter.WRITER;
        registerWriter((Class) cls, writeObject);
        registerDefault(cls, Boolean.FALSE);
        registerReader(boolean[].class, BoolConverter.ARRAY_READER);
        registerWriter(boolean[].class, BoolConverter.ARRAY_WRITER);
        registerReader(Boolean.class, BoolConverter.NULLABLE_READER);
        registerWriter(Boolean.class, writeObject);
        if (((Settings) settings).javaSpecifics) {
            registerJavaSpecifics(this);
        }
        JsonReader.ReadObject readObject2 = ObjectConverter.MapReader;
        registerReader(LinkedHashMap.class, readObject2);
        registerReader(HashMap.class, readObject2);
        registerReader(Map.class, readObject2);
        registerWriter(Map.class, new JsonWriter.WriteObject<Map>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.3
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
            public void write(JsonWriter jsonWriter, @Nullable Map map) {
                if (map == null) {
                    jsonWriter.writeNull();
                    return;
                }
                try {
                    DslJson.this.serializeMap(map, jsonWriter);
                } catch (IOException e) {
                    throw new SerializationException(e);
                }
            }
        });
        registerReader(URI.class, NetConverter.UriReader);
        registerWriter(URI.class, NetConverter.UriWriter);
        registerReader(InetAddress.class, NetConverter.AddressReader);
        registerWriter(InetAddress.class, NetConverter.AddressWriter);
        JsonReader.ReadObject readObject3 = NumberConverter.DOUBLE_READER;
        Class<T> cls2 = Double.TYPE;
        registerReader((Class) cls2, readObject3);
        JsonWriter.WriteObject writeObject2 = NumberConverter.DOUBLE_WRITER;
        registerWriter((Class) cls2, writeObject2);
        registerDefault(cls2, Double.valueOf(0.0d));
        registerReader(double[].class, NumberConverter.DOUBLE_ARRAY_READER);
        registerWriter(double[].class, NumberConverter.DOUBLE_ARRAY_WRITER);
        registerReader(Double.class, NumberConverter.NULLABLE_DOUBLE_READER);
        registerWriter(Double.class, writeObject2);
        JsonReader.ReadObject readObject4 = NumberConverter.FLOAT_READER;
        Class<T> cls3 = Float.TYPE;
        registerReader((Class) cls3, readObject4);
        JsonWriter.WriteObject writeObject3 = NumberConverter.FLOAT_WRITER;
        registerWriter((Class) cls3, writeObject3);
        registerDefault(cls3, Float.valueOf(0.0f));
        registerReader(float[].class, NumberConverter.FLOAT_ARRAY_READER);
        registerWriter(float[].class, NumberConverter.FLOAT_ARRAY_WRITER);
        registerReader(Float.class, NumberConverter.NULLABLE_FLOAT_READER);
        registerWriter(Float.class, writeObject3);
        JsonReader.ReadObject readObject5 = NumberConverter.INT_READER;
        Class<T> cls4 = Integer.TYPE;
        registerReader((Class) cls4, readObject5);
        JsonWriter.WriteObject writeObject4 = NumberConverter.INT_WRITER;
        registerWriter((Class) cls4, writeObject4);
        registerDefault(cls4, 0);
        registerReader(int[].class, NumberConverter.INT_ARRAY_READER);
        registerWriter(int[].class, NumberConverter.INT_ARRAY_WRITER);
        registerReader(Integer.class, NumberConverter.NULLABLE_INT_READER);
        registerWriter(Integer.class, writeObject4);
        JsonReader.ReadObject readObject6 = NumberConverter.SHORT_READER;
        Class<T> cls5 = Short.TYPE;
        registerReader((Class) cls5, readObject6);
        JsonWriter.WriteObject writeObject5 = NumberConverter.SHORT_WRITER;
        registerWriter((Class) cls5, writeObject5);
        registerDefault(cls5, (short) 0);
        registerReader(short[].class, NumberConverter.SHORT_ARRAY_READER);
        registerWriter(short[].class, NumberConverter.SHORT_ARRAY_WRITER);
        registerReader(Short.class, NumberConverter.NULLABLE_SHORT_READER);
        registerWriter(Short.class, writeObject5);
        JsonReader.ReadObject readObject7 = NumberConverter.LONG_READER;
        Class<T> cls6 = Long.TYPE;
        registerReader((Class) cls6, readObject7);
        JsonWriter.WriteObject writeObject6 = NumberConverter.LONG_WRITER;
        registerWriter((Class) cls6, writeObject6);
        registerDefault(cls6, 0L);
        registerReader(long[].class, NumberConverter.LONG_ARRAY_READER);
        registerWriter(long[].class, NumberConverter.LONG_ARRAY_WRITER);
        registerReader(Long.class, NumberConverter.NULLABLE_LONG_READER);
        registerWriter(Long.class, writeObject6);
        registerReader(BigDecimal.class, NumberConverter.DecimalReader);
        registerWriter(BigDecimal.class, NumberConverter.DecimalWriter);
        registerReader(String.class, StringConverter.READER);
        registerWriter(String.class, StringConverter.WRITER);
        registerReader(UUID.class, UUIDConverter.READER);
        registerWriter(UUID.class, UUIDConverter.WRITER);
        registerReader(Number.class, NumberConverter.NumberReader);
        registerWriter(CharSequence.class, StringConverter.WRITER_CHARS);
        registerReader(StringBuilder.class, StringConverter.READER_BUILDER);
        registerReader(StringBuffer.class, StringConverter.READER_BUFFER);
        Iterator it2 = ((Settings) settings).configurations.iterator();
        while (it2.hasNext()) {
            ((Configuration) it2.next()).configure(this);
        }
        if (((Settings) settings).classLoaders.isEmpty() || ((Settings) settings).fromServiceLoader != 0) {
            return;
        }
        loadDefaultConverters(this, ((Settings) settings).classLoaders, "dsl_json_Annotation_Processor_External_Serialization");
        loadDefaultConverters(this, ((Settings) settings).classLoaders, "dsl_json.json.ExternalSerialization");
        loadDefaultConverters(this, ((Settings) settings).classLoaders, "dsl_json_ExternalSerialization");
    }

    private <T> void checkExternal(Type type, ConcurrentMap<Type, T> concurrentMap) {
        Type extractActualType;
        if (type instanceof Class) {
            this.externalConverterAnalyzer.tryFindConverter((Class) type, this);
            return;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            this.externalConverterAnalyzer.tryFindConverter((Class) parameterizedType.getRawType(), this);
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (!concurrentMap.containsKey(type2) && (extractActualType = extractActualType(type2)) != type2 && !concurrentMap.containsKey(extractActualType)) {
                    checkExternal(extractActualType, concurrentMap);
                }
            }
        }
    }

    private static Object convertResultToArray(Class<?> cls, List<?> list) {
        int i = 0;
        if (cls.isPrimitive()) {
            if (Boolean.TYPE.equals(cls)) {
                boolean[] zArr = new boolean[list.size()];
                while (i < list.size()) {
                    zArr[i] = ((Boolean) list.get(i)).booleanValue();
                    i++;
                }
                return zArr;
            }
            if (Integer.TYPE.equals(cls)) {
                int[] iArr = new int[list.size()];
                while (i < list.size()) {
                    iArr[i] = ((Integer) list.get(i)).intValue();
                    i++;
                }
                return iArr;
            }
            if (Long.TYPE.equals(cls)) {
                long[] jArr = new long[list.size()];
                while (i < list.size()) {
                    jArr[i] = ((Long) list.get(i)).longValue();
                    i++;
                }
                return jArr;
            }
            if (Short.TYPE.equals(cls)) {
                short[] sArr = new short[list.size()];
                while (i < list.size()) {
                    sArr[i] = ((Short) list.get(i)).shortValue();
                    i++;
                }
                return sArr;
            }
            if (Byte.TYPE.equals(cls)) {
                byte[] bArr = new byte[list.size()];
                while (i < list.size()) {
                    bArr[i] = ((Byte) list.get(i)).byteValue();
                    i++;
                }
                return bArr;
            }
            if (Float.TYPE.equals(cls)) {
                float[] fArr = new float[list.size()];
                while (i < list.size()) {
                    fArr[i] = ((Float) list.get(i)).floatValue();
                    i++;
                }
                return fArr;
            }
            if (Double.TYPE.equals(cls)) {
                double[] dArr = new double[list.size()];
                while (i < list.size()) {
                    dArr[i] = ((Double) list.get(i)).doubleValue();
                    i++;
                }
                return dArr;
            }
            if (Character.TYPE.equals(cls)) {
                char[] cArr = new char[list.size()];
                while (i < list.size()) {
                    cArr[i] = ((Character) list.get(i)).charValue();
                    i++;
                }
                return cArr;
            }
        }
        return list.toArray((Object[]) Array.newInstance(cls, 0));
    }

    private <T extends JsonObject> JsonReader.ReadObject<T> convertToReader(final JsonReader.ReadJsonObject<T> readJsonObject) {
        return (JsonReader.ReadObject<T>) new JsonReader.ReadObject<T>() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.6
            /* JADX WARN: Incorrect return type in method signature: (Lcom/bugsnag/android/repackaged/dslplatform/json/JsonReader;)TT; */
            @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonReader.ReadObject
            public JsonObject read(JsonReader jsonReader) throws IOException {
                if (jsonReader.wasNull()) {
                    return null;
                }
                if (jsonReader.last() != 123) {
                    throw jsonReader.newParseError("Expecting '{' for object start");
                }
                jsonReader.getNextToken();
                return readJsonObject.deserialize(jsonReader);
            }
        };
    }

    @Deprecated
    public static LinkedHashMap<String, Object> deserializeMap(JsonReader jsonReader) throws IOException {
        return ObjectConverter.deserializeMap(jsonReader);
    }

    @Nullable
    @Deprecated
    public static Object deserializeObject(JsonReader jsonReader) throws IOException {
        return ObjectConverter.deserializeObject(jsonReader);
    }

    private static Type extractActualType(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return (wildcardType.getUpperBounds().length == 1 && wildcardType.getLowerBounds().length == 0) ? wildcardType.getUpperBounds()[0] : type;
    }

    private static void findAllSignatures(Class<?> cls, ArrayList<Class<?>> arrayList) {
        if (arrayList.contains(cls)) {
            return;
        }
        arrayList.add(cls);
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && superclass != Object.class) {
            findAllSignatures(superclass, arrayList);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            findAllSignatures(cls2, arrayList);
        }
    }

    private JsonWriter.WriteObject getOrCreateWriter(@Nullable Object obj, Class<?> cls) throws IOException {
        if (obj instanceof JsonObject) {
            return this.OBJECT_WRITER;
        }
        if (obj instanceof JsonObject[]) {
            return this.OBJECT_ARRAY_WRITER;
        }
        Class cls2 = cls != null ? cls : obj.getClass();
        if (cls != null && JsonObject.class.isAssignableFrom(cls2)) {
            return this.OBJECT_WRITER;
        }
        JsonWriter.WriteObject<T> tryFindWriter = tryFindWriter(cls2);
        if (tryFindWriter != 0) {
            return tryFindWriter;
        }
        if (cls2.isArray()) {
            Class componentType = cls2.getComponentType();
            if (Character.TYPE == componentType) {
                return CHAR_ARRAY_WRITER;
            }
            final JsonWriter.WriteObject<T> tryFindWriter2 = tryFindWriter(componentType);
            if (tryFindWriter2 != 0) {
                return new JsonWriter.WriteObject() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.10
                    @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
                    public void write(JsonWriter jsonWriter, @Nullable Object obj2) {
                        jsonWriter.serialize((Object[]) obj2, tryFindWriter2);
                    }
                };
            }
        }
        if ((obj instanceof Collection) || Collection.class.isAssignableFrom(cls2)) {
            return new JsonWriter.WriteObject() { // from class: com.bugsnag.android.repackaged.dslplatform.json.DslJson.11
                @Override // com.bugsnag.android.repackaged.dslplatform.json.JsonWriter.WriteObject
                public void write(JsonWriter jsonWriter, @Nullable Object obj2) {
                    Class<?> cls3;
                    Collection collection = (Collection) obj2;
                    Iterator it2 = collection.iterator();
                    Class<?> cls4 = null;
                    do {
                        Object next = it2.next();
                        if (next != null && (cls3 = next.getClass()) != cls4 && (cls4 == null || cls3.isAssignableFrom(cls4))) {
                            cls4 = cls3;
                        }
                    } while (it2.hasNext());
                    if (cls4 == null) {
                        jsonWriter.writeByte(JsonWriter.ARRAY_START);
                        jsonWriter.writeNull();
                        for (int i = 1; i < collection.size(); i++) {
                            jsonWriter.writeAscii(",null");
                        }
                        jsonWriter.writeByte(JsonWriter.ARRAY_END);
                        return;
                    }
                    boolean isAssignableFrom = JsonObject.class.isAssignableFrom(cls4);
                    DslJson dslJson = DslJson.this;
                    if (isAssignableFrom) {
                        dslJson.serialize(jsonWriter, collection);
                        return;
                    }
                    JsonWriter.WriteObject tryFindWriter3 = dslJson.tryFindWriter((Class) cls4);
                    if (tryFindWriter3 != null) {
                        jsonWriter.serialize(collection, tryFindWriter3);
                        return;
                    }
                    if (DslJson.this.fallback == null) {
                        throw new ConfigurationException("Unable to serialize provided object. Failed to find serializer for: " + collection.getClass());
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.reset();
                    try {
                        DslJson.this.fallback.serialize(obj2, byteArrayOutputStream);
                        jsonWriter.writeAscii(byteArrayOutputStream.toByteArray());
                    } catch (IOException e) {
                        throw new SerializationException(e);
                    }
                }
            };
        }
        throw new ConfigurationException(a$$ExternalSyntheticOutline0.m("Unable to serialize provided object. Failed to find serializer for: ", cls2));
    }

    private static void loadDefaultConverters(DslJson dslJson, Set<ClassLoader> set, String str) {
        Iterator<ClassLoader> it2 = set.iterator();
        while (it2.hasNext()) {
            try {
                ((Configuration) it2.next().loadClass(str).getDeclaredConstructor(null).newInstance(null)).configure(dslJson);
            } catch (Exception | NoClassDefFoundError unused) {
            }
        }
    }

    @Nullable
    private <T> T lookupFromFactories(Type type, Type type2, List<ConverterFactory<T>> list, ConcurrentMap<Type, T> concurrentMap) {
        if (type2 instanceof Class) {
            this.externalConverterAnalyzer.tryFindConverter((Class) type2, this);
            T t = concurrentMap.get(type2);
            if (t != null) {
                return t;
            }
        } else if (type2 instanceof ParameterizedType) {
            checkExternal(type2, concurrentMap);
        }
        Iterator<ConverterFactory<T>> it2 = list.iterator();
        while (it2.hasNext()) {
            T tryCreate = it2.next().tryCreate(type2, this);
            if (tryCreate != null) {
                concurrentMap.putIfAbsent(type, tryCreate);
                return tryCreate;
            }
        }
        return null;
    }

    @Nullable
    private JsonReader.ReadJsonObject<JsonObject> probeForObjectReader(Class<?> cls, Object obj) {
        Object invoke;
        try {
            try {
                try {
                    invoke = cls.getField("JSON_READER").get(obj);
                } catch (Exception unused) {
                    invoke = cls.getMethod("JSON_READER", null).invoke(obj, null);
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            invoke = cls.getMethod("getJSON_READER", null).invoke(obj, null);
        }
        if (invoke instanceof JsonReader.ReadJsonObject) {
            return (JsonReader.ReadJsonObject) invoke;
        }
        return null;
    }

    public static void registerJavaSpecifics(DslJson dslJson) {
        dslJson.registerReader(Element.class, (JsonReader.ReadObject) XmlConverter.Reader);
        dslJson.registerWriter(Element.class, (JsonWriter.WriteObject) XmlConverter.Writer);
    }

    private static Object returnAsArray(Type type, ArrayList<?> arrayList) {
        return type instanceof Class ? convertResultToArray((Class) type, arrayList) : type instanceof ParameterizedType ? arrayList.toArray((Object[]) Array.newInstance((Class<?>) ((ParameterizedType) type).getRawType(), 0)) : arrayList.toArray();
    }

    private static Object returnEmptyArray(Type type) {
        return type instanceof Class ? Array.newInstance((Class<?>) type, 0) : type instanceof ParameterizedType ? Array.newInstance((Class<?>) ((ParameterizedType) type).getRawType(), 0) : new Object[0];
    }

    public final boolean canDeserialize(Type type) {
        if (tryFindReader(type) != null) {
            return true;
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                return (cls.getComponentType().isArray() || Collection.class.isAssignableFrom(cls.getComponentType()) || !canDeserialize(cls.getComponentType())) ? false : true;
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getActualTypeArguments().length == 1) {
                Class cls2 = (Class) parameterizedType.getRawType();
                if ((cls2.isArray() || Collection.class.isAssignableFrom(cls2)) && tryFindReader(parameterizedType.getActualTypeArguments()[0]) != null) {
                    return true;
                }
            }
        } else if ((type instanceof GenericArrayType) && tryFindReader(((GenericArrayType) type).getGenericComponentType()) != null) {
            return true;
        }
        return false;
    }

    public final boolean canSerialize(Type type) {
        if (this.writers.get(type) != null) {
            return true;
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (JsonObject.class.isAssignableFrom(cls) || JsonObject[].class.isAssignableFrom(cls) || tryFindWriter(type) != null) {
                return true;
            }
            if (cls.isArray()) {
                return (cls.getComponentType().isArray() || Collection.class.isAssignableFrom(cls.getComponentType()) || !canSerialize(cls.getComponentType())) ? false : true;
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getActualTypeArguments().length == 1) {
                Class cls2 = (Class) parameterizedType.getRawType();
                if (cls2.isArray() || Collection.class.isAssignableFrom(cls2)) {
                    Type type2 = parameterizedType.getActualTypeArguments()[0];
                    return ((type2 instanceof Class) && JsonObject.class.isAssignableFrom((Class) type2)) || tryFindWriter(type2) != null;
                }
            }
        } else if (type instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type;
            return ((genericArrayType.getGenericComponentType() instanceof Class) && JsonObject.class.isAssignableFrom((Class) genericArrayType.getGenericComponentType())) || tryFindWriter(genericArrayType.getGenericComponentType()) != null;
        }
        Iterator<ConverterFactory<JsonWriter.WriteObject>> it2 = this.writerFactories.iterator();
        while (it2.hasNext()) {
            if (it2.next().tryCreate(type, this) != null) {
                return true;
            }
        }
        return false;
    }

    public IOException createErrorMessage(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        findAllSignatures(cls, arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Class cls2 = (Class) it2.next();
            if (this.readers.containsKey(cls2)) {
                if (cls2.equals(cls)) {
                    return new IOException("Reader for provided type: " + cls + " is disabled and fallback serialization is not registered (converter is registered as null).\nTry initializing system with custom fallback or don't register null for " + cls);
                }
                return new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nFound reader for: " + cls2 + " so try deserializing into that instead?\nAlternatively, try initializing system with custom fallback or register specified type using registerReader into " + getClass());
            }
        }
        return new IOException("Unable to find reader for provided type: " + cls + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + getClass());
    }

    @Nullable
    public <TResult> TResult deserialize(Class<TResult> cls, byte[] bArr, int i) throws IOException {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("body can't be null");
            return null;
        }
        JsonReader<TContext> process = this.localReader.get().process(bArr, i);
        try {
            process.getNextToken();
            JsonReader.ReadObject<T> tryFindReader = tryFindReader((Class) cls);
            if (tryFindReader != 0) {
                return (TResult) tryFindReader.read(process);
            }
            if (!cls.isArray()) {
                Fallback<TContext> fallback = this.fallback;
                if (fallback != null) {
                    return (TResult) fallback.deserialize(this.context, cls, bArr, i);
                }
                throw createErrorMessage(cls);
            }
            if (process.wasNull()) {
                return null;
            }
            if (process.last() != 91) {
                throw process.newParseError("Expecting '[' for array start");
            }
            Class componentType = cls.getComponentType();
            List<TResult> deserializeList = deserializeList(componentType, bArr, i);
            if (deserializeList == null) {
                return null;
            }
            return (TResult) convertResultToArray(componentType, deserializeList);
        } finally {
            process.reset();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public <TResult> List<TResult> deserializeList(Class<TResult> cls, byte[] bArr, int i) throws IOException {
        JsonReader.ReadJsonObject<JsonObject> objectReader;
        if (cls == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("body can't be null");
            return null;
        }
        if (i == 4 && bArr[0] == 110 && bArr[1] == 117 && bArr[2] == 108 && bArr[3] == 108) {
            return null;
        }
        if (i == 2 && bArr[0] == 91 && bArr[1] == 93) {
            return new ArrayList(0);
        }
        JsonReader<TContext> process = this.localReader.get().process(bArr, i);
        try {
            if (process.getNextToken() != 91) {
                if (!process.wasNull()) {
                    throw process.newParseError("Expecting '[' for list start");
                }
                process.reset();
                return null;
            }
            if (process.getNextToken() == 93) {
                ArrayList arrayList = new ArrayList(0);
                process.reset();
                return arrayList;
            }
            if (JsonObject.class.isAssignableFrom(cls) && (objectReader = getObjectReader(cls)) != null) {
                List<TResult> deserializeNullableCollection = process.deserializeNullableCollection(objectReader);
                process.reset();
                return deserializeNullableCollection;
            }
            JsonReader.ReadObject tryFindReader = tryFindReader((Class) cls);
            if (tryFindReader != null) {
                List<TResult> deserializeNullableCollectionCustom = process.deserializeNullableCollectionCustom(tryFindReader);
                process.reset();
                return deserializeNullableCollectionCustom;
            }
            if (this.fallback == null) {
                throw createErrorMessage(cls);
            }
            Object[] objArr = (Object[]) this.fallback.deserialize(this.context, Array.newInstance((Class<?>) cls, 0).getClass(), bArr, i);
            if (objArr == null) {
                process.reset();
                return null;
            }
            ArrayList arrayList2 = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                arrayList2.add(obj);
            }
            process.reset();
            return arrayList2;
        } catch (Throwable th) {
            process.reset();
            throw th;
        }
    }

    @Nullable
    public Object deserializeWith(Type type, JsonReader jsonReader) throws IOException {
        JsonReader.ReadObject<?> tryFindReader = tryFindReader(type);
        if (tryFindReader != null) {
            return tryFindReader.read(jsonReader);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getActualTypeArguments().length == 1) {
                Type type2 = parameterizedType.getActualTypeArguments()[0];
                Class cls = (Class) parameterizedType.getRawType();
                if (cls.isArray() || Collection.class.isAssignableFrom(cls)) {
                    if (jsonReader.wasNull()) {
                        return null;
                    }
                    if (jsonReader.last() != 91) {
                        throw jsonReader.newParseError("Expecting '[' for array start");
                    }
                    if (jsonReader.getNextToken() == 93) {
                        if (cls.isArray()) {
                            returnEmptyArray(type2);
                        }
                        return new ArrayList(0);
                    }
                    JsonReader.ReadObject<?> tryFindReader2 = tryFindReader(type2);
                    if (tryFindReader2 != null) {
                        ArrayList deserializeNullableCollectionCustom = jsonReader.deserializeNullableCollectionCustom(tryFindReader2);
                        return cls.isArray() ? returnAsArray(type2, deserializeNullableCollectionCustom) : deserializeNullableCollectionCustom;
                    }
                }
            }
        } else if (type instanceof GenericArrayType) {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() != 91) {
                throw jsonReader.newParseError("Expecting '[' for array start");
            }
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (jsonReader.getNextToken() == 93) {
                return returnEmptyArray(genericComponentType);
            }
            JsonReader.ReadObject<?> tryFindReader3 = tryFindReader(genericComponentType);
            if (tryFindReader3 != null) {
                return returnAsArray(genericComponentType, jsonReader.deserializeNullableCollectionCustom(tryFindReader3));
            }
        }
        return unknownValue;
    }

    @Nullable
    public final Object getDefault(@Nullable Type type) {
        Class cls;
        if (type == null) {
            return null;
        }
        Object obj = this.defaults.get(type);
        if (obj != null) {
            return obj;
        }
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            if (!(type instanceof ParameterizedType)) {
                return null;
            }
            cls = (Class) ((ParameterizedType) type).getRawType();
        }
        return cls.isPrimitive() ? Array.get(Array.newInstance((Class<?>) cls, 1), 0) : this.defaults.get(cls);
    }

    @Nullable
    public final JsonReader.ReadJsonObject<JsonObject> getObjectReader(Class<?> cls) {
        try {
            JsonReader.ReadJsonObject<JsonObject> readJsonObject = this.objectReaders.get(cls);
            if (readJsonObject == null) {
                readJsonObject = probeForObjectReader(cls, null);
                if (readJsonObject == null) {
                    try {
                        Object obj = cls.getField("Companion").get(null);
                        readJsonObject = probeForObjectReader(obj.getClass(), obj);
                    } catch (Exception unused) {
                        return null;
                    }
                }
                if (readJsonObject != null) {
                    this.objectReaders.putIfAbsent(cls, readJsonObject);
                }
            }
            return readJsonObject;
        } catch (Exception unused2) {
            return null;
        }
    }

    public final Set<Type> getRegisteredBinders() {
        return this.binders.keySet();
    }

    public final Map<Class<? extends Annotation>, Boolean> getRegisteredCreatorMarkers() {
        return this.creatorMarkers;
    }

    public final Set<Type> getRegisteredDecoders() {
        return this.readers.keySet();
    }

    public final Set<Type> getRegisteredEncoders() {
        return this.writers.keySet();
    }

    public <T> void iterateOver(Iterator<T> it2, OutputStream outputStream, @Nullable JsonWriter jsonWriter) throws IOException {
        Class<?> cls;
        JsonWriter.WriteObject writeObject;
        if (it2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("iterator can't be null");
            return;
        }
        if (outputStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
            return;
        }
        outputStream.write(91);
        if (!it2.hasNext()) {
            outputStream.write(93);
            return;
        }
        if (jsonWriter == null) {
            jsonWriter = new JsonWriter(this);
        }
        T next = it2.next();
        if (next != null) {
            cls = next.getClass();
            writeObject = getOrCreateWriter(next, cls);
            jsonWriter.reset();
            try {
                writeObject.write(jsonWriter, next);
                jsonWriter.toStream(outputStream);
            } catch (ConfigurationException e) {
                throw e;
            } catch (Exception e2) {
                Buffer$$ExternalSyntheticBUOutline0.m$2(e2);
                return;
            }
        } else {
            outputStream.write(NULL);
            cls = null;
            writeObject = null;
        }
        while (it2.hasNext()) {
            outputStream.write(44);
            T next2 = it2.next();
            if (next2 != null) {
                Class<?> cls2 = next2.getClass();
                if (writeObject == null || cls == null || !cls.equals(cls2)) {
                    writeObject = getOrCreateWriter(next2, cls2);
                    cls = cls2;
                }
                jsonWriter.reset();
                try {
                    writeObject.write(jsonWriter, next2);
                    jsonWriter.toStream(outputStream);
                } catch (ConfigurationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    Buffer$$ExternalSyntheticBUOutline0.m$2(e4);
                    return;
                }
            } else {
                outputStream.write(NULL);
            }
        }
        outputStream.write(93);
    }

    @Deprecated
    public JsonReader<TContext> newReader(String str) {
        byte[] bytes = str.getBytes(UTF8);
        return new JsonReader<>(bytes, bytes.length, this.context, new char[64], this.keyCache, this.valuesCache, this, this.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
    }

    public JsonWriter newWriter(byte[] bArr) {
        if (bArr != null) {
            return new JsonWriter(bArr, this);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("null value provided for buffer");
        return null;
    }

    public <T, S extends T> void registerBinder(Class<T> cls, @Nullable JsonReader.BindObject<S> bindObject) {
        ConcurrentMap<Type, JsonReader.BindObject> concurrentMap = this.binders;
        if (bindObject == null) {
            concurrentMap.remove(cls);
        } else {
            concurrentMap.put(cls, bindObject);
        }
    }

    public boolean registerBinderFactory(ConverterFactory<? extends JsonReader.BindObject> converterFactory) {
        if (converterFactory == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("factory can't be null");
            return false;
        }
        if (this.binderFactories.contains(converterFactory)) {
            return false;
        }
        List<ConverterFactory<JsonReader.BindObject>> list = this.binderFactories;
        list.add(list.size() - this.settingsBinders, converterFactory);
        return true;
    }

    public <T> void registerDefault(Class<T> cls, T t) {
        this.defaults.put(cls, t);
    }

    @Nullable
    public JsonReader.ReadObject registerReader(Type type, @Nullable JsonReader.ReadObject<?> readObject) {
        ConcurrentMap<Type, JsonReader.ReadObject> concurrentMap = this.readers;
        if (readObject == null) {
            return concurrentMap.remove(type);
        }
        try {
            return concurrentMap.get(type);
        } finally {
            this.readers.put(type, readObject);
        }
    }

    public boolean registerReaderFactory(ConverterFactory<? extends JsonReader.ReadObject> converterFactory) {
        if (converterFactory == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("factory can't be null");
            return false;
        }
        if (this.readerFactories.contains(converterFactory)) {
            return false;
        }
        List<ConverterFactory<JsonReader.ReadObject>> list = this.readerFactories;
        list.add(list.size() - this.settingsReaders, converterFactory);
        return true;
    }

    @Nullable
    public JsonWriter.WriteObject registerWriter(Type type, @Nullable JsonWriter.WriteObject<?> writeObject) {
        ConcurrentMap<Type, JsonWriter.WriteObject> concurrentMap = this.writers;
        if (writeObject == null) {
            return concurrentMap.remove(type);
        }
        try {
            return concurrentMap.get(type);
        } finally {
            this.writers.put(type, writeObject);
        }
    }

    public boolean registerWriterFactory(ConverterFactory<? extends JsonWriter.WriteObject> converterFactory) {
        if (converterFactory == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("factory can't be null");
            return false;
        }
        if (this.writerFactories.contains(converterFactory)) {
            return false;
        }
        List<ConverterFactory<JsonWriter.WriteObject>> list = this.writerFactories;
        list.add(list.size() - this.settingsWriters, converterFactory);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        if (r10 != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean serialize(com.bugsnag.android.repackaged.dslplatform.json.JsonWriter r12, java.lang.reflect.Type r13, @androidx.annotation.Nullable java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.DslJson.serialize(com.bugsnag.android.repackaged.dslplatform.json.JsonWriter, java.lang.reflect.Type, java.lang.Object):boolean");
    }

    public void serializeMap(Map<String, Object> map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeByte(JsonWriter.OBJECT_START);
        int size = map.size();
        if (size > 0) {
            Iterator<Map.Entry<String, Object>> it2 = map.entrySet().iterator();
            Map.Entry<String, Object> next = it2.next();
            jsonWriter.writeString(next.getKey());
            jsonWriter.writeByte(JsonWriter.SEMI);
            serialize(jsonWriter, next.getValue());
            for (int i = 1; i < size; i++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                Map.Entry<String, Object> next2 = it2.next();
                jsonWriter.writeString(next2.getKey());
                jsonWriter.writeByte(JsonWriter.SEMI);
                serialize(jsonWriter, next2.getValue());
            }
        }
        jsonWriter.writeByte(JsonWriter.OBJECT_END);
    }

    @Nullable
    public JsonReader.BindObject<?> tryFindBinder(Type type) {
        JsonReader.BindObject<?> bindObject;
        JsonReader.BindObject<?> bindObject2 = this.binders.get(type);
        if (bindObject2 != null) {
            return bindObject2;
        }
        Type extractActualType = extractActualType(type);
        if (extractActualType == type || (bindObject = this.binders.get(extractActualType)) == null) {
            return (JsonReader.BindObject) lookupFromFactories(type, extractActualType, this.binderFactories, this.binders);
        }
        this.binders.putIfAbsent(type, bindObject);
        return bindObject;
    }

    @Nullable
    public JsonReader.ReadObject<?> tryFindReader(Type type) {
        JsonReader.ReadJsonObject<JsonObject> objectReader;
        JsonReader.ReadObject<?> readObject;
        JsonReader.ReadObject<?> readObject2 = this.readers.get(type);
        if (readObject2 != null) {
            return readObject2;
        }
        Type extractActualType = extractActualType(type);
        if (extractActualType != type && (readObject = this.readers.get(extractActualType)) != null) {
            this.readers.putIfAbsent(type, readObject);
            return readObject;
        }
        if (extractActualType instanceof Class) {
            Class<?> cls = (Class) extractActualType;
            if (JsonObject.class.isAssignableFrom(cls) && (objectReader = getObjectReader(cls)) != null) {
                JsonReader.ReadObject convertToReader = convertToReader(objectReader);
                this.readers.putIfAbsent(type, convertToReader);
                return convertToReader;
            }
        }
        return (JsonReader.ReadObject) lookupFromFactories(type, extractActualType, this.readerFactories, this.readers);
    }

    @Nullable
    public JsonWriter.WriteObject<?> tryFindWriter(Type type) {
        JsonWriter.WriteObject<?> writeObject;
        JsonWriter.WriteObject<?> writeObject2 = this.writers.get(type);
        if (writeObject2 != null) {
            return writeObject2;
        }
        Type extractActualType = extractActualType(type);
        if (extractActualType != type && (writeObject = this.writers.get(extractActualType)) != null) {
            this.writers.putIfAbsent(type, writeObject);
            return writeObject;
        }
        boolean z = extractActualType instanceof Class;
        if (z && JsonObject.class.isAssignableFrom((Class) extractActualType)) {
            this.writers.putIfAbsent(type, this.OBJECT_WRITER);
            return this.OBJECT_WRITER;
        }
        JsonWriter.WriteObject<?> writeObject3 = (JsonWriter.WriteObject) lookupFromFactories(type, extractActualType, this.writerFactories, this.writers);
        if (writeObject3 != null) {
            return writeObject3;
        }
        if (!z) {
            return null;
        }
        Class<?> cls = this.writerMap.get(extractActualType);
        if (cls != null) {
            return this.writers.get(cls);
        }
        Class<?> cls2 = (Class) extractActualType;
        ArrayList arrayList = new ArrayList();
        findAllSignatures(cls2, arrayList);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Class<?> cls3 = (Class) it2.next();
            JsonWriter.WriteObject<?> writeObject4 = this.writers.get(cls3);
            if (writeObject4 == null) {
                writeObject4 = (JsonWriter.WriteObject) lookupFromFactories(type, cls3, this.writerFactories, this.writers);
            }
            if (writeObject4 != null) {
                this.writerMap.putIfAbsent(cls2, cls3);
                return writeObject4;
            }
        }
        return null;
    }

    public void registerBinder(Type type, @Nullable JsonReader.BindObject<?> bindObject) {
        ConcurrentMap<Type, JsonReader.BindObject> concurrentMap = this.binders;
        if (bindObject == null) {
            concurrentMap.remove(type);
        } else {
            concurrentMap.put(type, bindObject);
        }
    }

    public JsonWriter newWriter(int i) {
        return new JsonWriter(i, this);
    }

    public JsonWriter newWriter() {
        return new JsonWriter(this);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SimpleStringCache implements StringCache {
        private final String[] cache;
        private final int mask;

        public SimpleStringCache(int i) {
            int i2 = 2;
            for (int i3 = 1; i3 < i; i3++) {
                i2 *= 2;
            }
            this.mask = i2 - 1;
            this.cache = new String[i2];
        }

        private String createAndPut(int i, char[] cArr, int i2) {
            String str = new String(cArr, 0, i2);
            this.cache[i] = str;
            return str;
        }

        @Override // com.bugsnag.android.repackaged.dslplatform.json.StringCache
        public String get(char[] cArr, int i) {
            long j = -2128831035;
            for (int i2 = 0; i2 < i; i2++) {
                j = (j ^ ((byte) cArr[i2])) * 16777619;
            }
            int i3 = ((int) j) & this.mask;
            String str = this.cache[i3];
            if (str == null) {
                return createAndPut(i3, cArr, i);
            }
            if (str.length() != i) {
                return createAndPut(i3, cArr, i);
            }
            for (int i4 = 0; i4 < str.length(); i4++) {
                if (str.charAt(i4) != cArr[i4]) {
                    return createAndPut(i3, cArr, i);
                }
            }
            return str;
        }

        public SimpleStringCache() {
            this(10);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Settings<TContext> {
        private boolean allowArrayFormat;
        private TContext context;
        private Fallback<TContext> fallback;
        private int fromServiceLoader;
        private boolean javaSpecifics;
        private boolean omitDefaults;
        private StringCache valuesCache;
        private StringCache keyCache = new SimpleStringCache();
        private JsonReader.ErrorInfo errorInfo = JsonReader.ErrorInfo.WITH_STACK_TRACE;
        private JsonReader.DoublePrecision doublePrecision = JsonReader.DoublePrecision.DEFAULT;
        private JsonReader.UnknownNumberParsing unknownNumbers = JsonReader.UnknownNumberParsing.LONG_AND_BIGDECIMAL;
        private int maxNumberDigits = 512;
        private int maxStringBuffer = 134217728;
        private final List<Configuration> configurations = new ArrayList();
        private final List<ConverterFactory<JsonWriter.WriteObject>> writerFactories = new ArrayList();
        private final List<ConverterFactory<JsonReader.ReadObject>> readerFactories = new ArrayList();
        private final List<ConverterFactory<JsonReader.BindObject>> binderFactories = new ArrayList();
        private final Set<ClassLoader> classLoaders = new HashSet();
        private final Map<Class<? extends Annotation>, Boolean> creatorMarkers = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public Settings<TContext> with(Iterable<Configuration> iterable) {
            if (iterable != null) {
                Iterator<Configuration> it2 = iterable.iterator();
                while (it2.hasNext()) {
                    this.configurations.add(it2.next());
                }
            }
            return this;
        }

        public Settings<TContext> allowArrayFormat(boolean z) {
            this.allowArrayFormat = z;
            return this;
        }

        public Settings<TContext> creatorMarker(Class<? extends Annotation> cls, boolean z) {
            if (cls != null) {
                this.creatorMarkers.put(cls, Boolean.valueOf(z));
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("marker can't be null");
            return null;
        }

        public Settings<TContext> doublePrecision(JsonReader.DoublePrecision doublePrecision) {
            if (doublePrecision != null) {
                this.doublePrecision = doublePrecision;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("precision can't be null");
            return null;
        }

        public Settings<TContext> errorInfo(JsonReader.ErrorInfo errorInfo) {
            if (errorInfo != null) {
                this.errorInfo = errorInfo;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("errorInfo can't be null");
            return null;
        }

        @Deprecated
        public Settings<TContext> fallbackTo(@Nullable Fallback<TContext> fallback) {
            this.fallback = fallback;
            return this;
        }

        public Settings<TContext> includeServiceLoader(ClassLoader classLoader) {
            if (classLoader == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("loader can't be null");
                return null;
            }
            this.classLoaders.add(classLoader);
            Iterator it2 = ServiceLoader.load(Configuration.class, classLoader).iterator();
            while (it2.hasNext()) {
                Configuration configuration = (Configuration) it2.next();
                Class<?> cls = configuration.getClass();
                Iterator<Configuration> it3 = this.configurations.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        this.fromServiceLoader++;
                        this.configurations.add(configuration);
                        break;
                    }
                    if (it3.next().getClass() == cls) {
                        break;
                    }
                }
            }
            return this;
        }

        public Settings<TContext> limitDigitsBuffer(int i) {
            if (i >= 1) {
                this.maxNumberDigits = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size can't be smaller than 1");
            return null;
        }

        public Settings<TContext> limitStringBuffer(int i) {
            if (i >= 1) {
                this.maxStringBuffer = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size can't be smaller than 1");
            return null;
        }

        public Settings<TContext> resolveBinder(ConverterFactory<? extends JsonReader.BindObject> converterFactory) {
            if (converterFactory == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("binder can't be null");
                return null;
            }
            if (this.binderFactories.contains(converterFactory)) {
                Single$$ExternalSyntheticBUOutline0.m$3("binder already registered");
                return null;
            }
            this.binderFactories.add(converterFactory);
            return this;
        }

        public Settings<TContext> resolveReader(ConverterFactory<? extends JsonReader.ReadObject> converterFactory) {
            if (converterFactory == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("reader can't be null");
                return null;
            }
            if (this.readerFactories.contains(converterFactory)) {
                Single$$ExternalSyntheticBUOutline0.m$3("reader already registered");
                return null;
            }
            this.readerFactories.add(converterFactory);
            return this;
        }

        public Settings<TContext> resolveWriter(ConverterFactory<? extends JsonWriter.WriteObject> converterFactory) {
            if (converterFactory == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("writer can't be null");
                return null;
            }
            if (this.writerFactories.contains(converterFactory)) {
                Single$$ExternalSyntheticBUOutline0.m$3("writer already registered");
                return null;
            }
            this.writerFactories.add(converterFactory);
            return this;
        }

        public Settings<TContext> skipDefaultValues(boolean z) {
            this.omitDefaults = z;
            return this;
        }

        public Settings<TContext> unknownNumbers(JsonReader.UnknownNumberParsing unknownNumberParsing) {
            if (unknownNumberParsing != null) {
                this.unknownNumbers = unknownNumberParsing;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("unknownNumbers can't be null");
            return null;
        }

        public Settings<TContext> useKeyCache(@Nullable StringCache stringCache) {
            this.keyCache = stringCache;
            return this;
        }

        public Settings<TContext> useStringValuesCache(@Nullable StringCache stringCache) {
            this.valuesCache = stringCache;
            return this;
        }

        public Settings<TContext> withContext(@Nullable TContext tcontext) {
            this.context = tcontext;
            return this;
        }

        public Settings<TContext> withJavaConverters(boolean z) {
            this.javaSpecifics = z;
            return this;
        }

        public Settings<TContext> with(Configuration configuration) {
            if (configuration != null) {
                this.configurations.add(configuration);
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("conf can't be null");
            return null;
        }

        public Settings<TContext> includeServiceLoader() {
            return includeServiceLoader(Thread.currentThread().getContextClassLoader());
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RereadStream extends InputStream {
        private final byte[] buffer;
        private int position;
        private final InputStream stream;
        private boolean usingBuffer = true;

        public RereadStream(byte[] bArr, InputStream inputStream) {
            this.buffer = bArr;
            this.stream = inputStream;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.usingBuffer) {
                int i = this.position;
                byte[] bArr = this.buffer;
                if (i < bArr.length) {
                    this.position = i + 1;
                    return bArr[i];
                }
                this.usingBuffer = false;
            }
            return this.stream.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr) throws IOException {
            if (this.usingBuffer) {
                return super.read(bArr);
            }
            return this.stream.read(bArr);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.usingBuffer) {
                return super.read(bArr, i, i2);
            }
            return this.stream.read(bArr, i, i2);
        }
    }

    public <T, S extends T> void registerReader(Class<T> cls, @Nullable JsonReader.ReadObject<S> readObject) {
        ConcurrentMap<Type, JsonReader.ReadObject> concurrentMap = this.readers;
        if (readObject == null) {
            concurrentMap.remove(cls);
        } else {
            concurrentMap.put(cls, readObject);
        }
    }

    public <T> void registerWriter(Class<T> cls, @Nullable JsonWriter.WriteObject<T> writeObject) {
        ConcurrentMap<Class<?>, Class<?>> concurrentMap = this.writerMap;
        if (writeObject == null) {
            concurrentMap.remove(cls);
            this.writers.remove(cls);
        } else {
            concurrentMap.put(cls, cls);
            this.writers.put(cls, writeObject);
        }
    }

    public JsonReader<TContext> newReader(byte[] bArr) {
        return new JsonReader<>(bArr, bArr.length, this.context, new char[64], this.keyCache, this.valuesCache, this, this.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
    }

    public JsonReader<TContext> newReader(byte[] bArr, int i) {
        return new JsonReader<>(bArr, i, this.context, new char[64], this.keyCache, this.valuesCache, this, this.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
    }

    public JsonReader<TContext> newReader(byte[] bArr, int i, char[] cArr) {
        return new JsonReader<>(bArr, i, this.context, cArr, this.keyCache, this.valuesCache, this, this.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
    }

    public JsonReader<TContext> newReader(InputStream inputStream, byte[] bArr) throws IOException {
        JsonReader<TContext> newReader = newReader(bArr);
        newReader.process(inputStream);
        return newReader;
    }

    public JsonReader<TContext> newReader() {
        return new JsonReader<>(new byte[4096], 4096, this.context, new char[64], this.keyCache, this.valuesCache, this, this.errorInfo, this.doublePrecision, this.unknownNumbers, this.maxNumberDigits, this.maxStringSize);
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.TypeLookup
    @Nullable
    public <T> JsonReader.BindObject<T> tryFindBinder(Class<T> cls) {
        return (JsonReader.BindObject<T>) tryFindBinder((Type) cls);
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.TypeLookup
    @Nullable
    public <T> JsonReader.ReadObject<T> tryFindReader(Class<T> cls) {
        return (JsonReader.ReadObject<T>) tryFindReader((Type) cls);
    }

    @Nullable
    public <T> T deserialize(JsonReader.ReadObject<T> readObject, JsonReader<TContext> jsonReader) throws IOException {
        if (readObject == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("converter can't be null");
            return null;
        }
        if (jsonReader != null) {
            jsonReader.getNextToken();
            return readObject.read(jsonReader);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("input can't be null");
        return null;
    }

    @Nullable
    public Object deserialize(Type type, byte[] bArr, int i) throws IOException {
        if (type instanceof Class) {
            return deserialize((Class) type, bArr, i);
        }
        if (type == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (bArr != null) {
            JsonReader<TContext> process = this.localReader.get().process(bArr, i);
            try {
                process.getNextToken();
                Object deserializeWith = deserializeWith(type, process);
                if (deserializeWith != unknownValue) {
                    return deserializeWith;
                }
                Fallback<TContext> fallback = this.fallback;
                if (fallback == null) {
                    throw new ConfigurationException("Unable to find reader for provided type: " + type + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + getClass());
                }
                return fallback.deserialize(this.context, type, bArr, i);
            } finally {
                process.reset();
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("body can't be null");
        return null;
    }

    @Nullable
    public <TResult> Iterator<TResult> iterateOver(Class<TResult> cls, InputStream inputStream, byte[] bArr) throws IOException {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (inputStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
            return null;
        }
        if (bArr != null) {
            return iterateOver(cls, newReader(inputStream, bArr), inputStream);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("buffer can't be null");
        return null;
    }

    @Nullable
    public <TResult> TResult deserialize(Class<TResult> cls, InputStream inputStream, byte[] bArr) throws IOException {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (inputStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
            return null;
        }
        if (bArr != null) {
            return (TResult) deserialize(cls, newReader(inputStream, bArr), inputStream);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("buffer can't be null");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public <TResult> Iterator<TResult> iterateOver(Class<TResult> cls, JsonReader jsonReader, InputStream inputStream) throws IOException {
        JsonReader.ReadJsonObject<JsonObject> objectReader;
        if (jsonReader.getNextToken() != 91) {
            if (jsonReader.wasNull()) {
                return null;
            }
            throw jsonReader.newParseError("Expecting '[' for iterator start");
        }
        if (jsonReader.getNextToken() == 93) {
            return EMPTY_ITERATOR;
        }
        if (JsonObject.class.isAssignableFrom(cls) && (objectReader = getObjectReader(cls)) != null) {
            return jsonReader.iterateOver(objectReader);
        }
        Object tryFindReader = tryFindReader((Class) cls);
        if (tryFindReader != null) {
            return jsonReader.iterateOverCustom(tryFindReader);
        }
        if (this.fallback != null) {
            Object[] objArr = (Object[]) this.fallback.deserialize(this.context, Array.newInstance((Class<?>) cls, 0).getClass(), new RereadStream(jsonReader.buffer, inputStream));
            if (objArr == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                arrayList.add(obj);
            }
            return arrayList.iterator();
        }
        throw createErrorMessage(cls);
    }

    @Nullable
    public <TResult> TResult deserialize(Class<TResult> cls, InputStream inputStream) throws IOException {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (inputStream != null) {
            JsonReader<TContext> process = this.localReader.get().process(inputStream);
            try {
                return (TResult) deserialize(cls, process, inputStream);
            } finally {
                process.reset();
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
        return null;
    }

    @Nullable
    public <T> JsonWriter.WriteObject<T> tryFindWriter(Class<T> cls) {
        return (JsonWriter.WriteObject<T>) tryFindWriter((Type) cls);
    }

    @Nullable
    public <TResult> TResult deserialize(Class<TResult> cls, JsonReader jsonReader, InputStream inputStream) throws IOException {
        JsonReader.ReadJsonObject<JsonObject> objectReader;
        jsonReader.getNextToken();
        JsonReader.ReadObject<T> tryFindReader = tryFindReader((Class) cls);
        if (tryFindReader != 0) {
            return (TResult) tryFindReader.read(jsonReader);
        }
        if (cls.isArray()) {
            if (jsonReader.wasNull()) {
                return null;
            }
            if (jsonReader.last() == 91) {
                Class componentType = cls.getComponentType();
                if (jsonReader.getNextToken() == 93) {
                    return (TResult) Array.newInstance((Class<?>) componentType, 0);
                }
                if (JsonObject.class.isAssignableFrom(componentType) && (objectReader = getObjectReader(componentType)) != null) {
                    return (TResult) convertResultToArray(componentType, jsonReader.deserializeNullableCollection(objectReader));
                }
                Object tryFindReader2 = tryFindReader(componentType);
                if (tryFindReader2 != null) {
                    return (TResult) convertResultToArray(componentType, jsonReader.deserializeNullableCollectionCustom(tryFindReader2));
                }
            } else {
                throw jsonReader.newParseError("Expecting '[' for array start");
            }
        }
        Fallback<TContext> fallback = this.fallback;
        if (fallback != null) {
            return (TResult) fallback.deserialize(this.context, cls, new RereadStream(jsonReader.buffer, inputStream));
        }
        throw createErrorMessage(cls);
    }

    @Nullable
    public <TResult> Iterator<TResult> iterateOver(Class<TResult> cls, InputStream inputStream) throws IOException {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (inputStream != null) {
            JsonReader jsonReader = this.localReader.get();
            jsonReader.process(inputStream);
            return iterateOver(cls, jsonReader, inputStream);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
        return null;
    }

    public <T> void iterateOver(Iterator<T> it2, Class<T> cls, OutputStream outputStream, @Nullable JsonWriter jsonWriter) throws IOException {
        if (it2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("iterator can't be null");
            return;
        }
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return;
        }
        if (outputStream != null) {
            if (jsonWriter == null) {
                jsonWriter = new JsonWriter(this);
            }
            JsonWriter.WriteObject orCreateWriter = getOrCreateWriter(null, cls);
            outputStream.write(91);
            T next = it2.next();
            if (next != null) {
                jsonWriter.reset();
                try {
                    orCreateWriter.write(jsonWriter, next);
                    jsonWriter.toStream(outputStream);
                } catch (ConfigurationException e) {
                    throw e;
                } catch (Exception e2) {
                    Buffer$$ExternalSyntheticBUOutline0.m$2(e2);
                    return;
                }
            } else {
                outputStream.write(NULL);
            }
            while (it2.hasNext()) {
                outputStream.write(44);
                T next2 = it2.next();
                if (next2 != null) {
                    jsonWriter.reset();
                    try {
                        orCreateWriter.write(jsonWriter, next2);
                        jsonWriter.toStream(outputStream);
                    } catch (ConfigurationException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        Buffer$$ExternalSyntheticBUOutline0.m$2(e4);
                        return;
                    }
                } else {
                    outputStream.write(NULL);
                }
            }
            outputStream.write(93);
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
    }

    @Nullable
    public Object deserialize(Type type, InputStream inputStream, byte[] bArr) throws IOException {
        if (type instanceof Class) {
            return deserialize((Class) type, inputStream, bArr);
        }
        if (type == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (inputStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
            return null;
        }
        if (bArr != null) {
            JsonReader<TContext> newReader = newReader(inputStream, bArr);
            newReader.getNextToken();
            Object deserializeWith = deserializeWith(type, newReader);
            if (deserializeWith != unknownValue) {
                return deserializeWith;
            }
            Fallback<TContext> fallback = this.fallback;
            if (fallback != null) {
                return fallback.deserialize(this.context, type, new RereadStream(bArr, inputStream));
            }
            StringBuilder sb = new StringBuilder("Unable to find reader for provided type: ");
            sb.append(type);
            Class<?> cls = getClass();
            sb.append(" and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into ");
            sb.append(cls);
            throw new ConfigurationException(sb.toString());
        }
        Single$$ExternalSyntheticBUOutline0.m$3("buffer can't be null");
        return null;
    }

    @Nullable
    public Object deserialize(Type type, InputStream inputStream) throws IOException {
        if (type instanceof Class) {
            return deserialize((Class) type, inputStream);
        }
        if (type == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (inputStream != null) {
            JsonReader<TContext> process = this.localReader.get().process(inputStream);
            try {
                process.getNextToken();
                Object deserializeWith = deserializeWith(type, process);
                if (deserializeWith != unknownValue) {
                    return deserializeWith;
                }
                Fallback<TContext> fallback = this.fallback;
                if (fallback == null) {
                    throw new ConfigurationException("Unable to find reader for provided type: " + type + " and fallback serialization is not registered.\nTry initializing DslJson with custom fallback in case of unsupported objects or register specified type using registerReader into " + getClass());
                }
                return fallback.deserialize(this.context, type, new RereadStream(process.buffer, inputStream));
            } finally {
                process.reset();
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
        return null;
    }

    @Deprecated
    public static ArrayList<Object> deserializeList(JsonReader jsonReader) throws IOException {
        return ObjectConverter.deserializeList(jsonReader);
    }

    @Nullable
    public <TResult> List<TResult> deserializeList(Class<TResult> cls, InputStream inputStream, byte[] bArr) throws IOException {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (inputStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
            return null;
        }
        if (bArr != null) {
            return deserializeList(cls, newReader(inputStream, bArr), inputStream);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("buffer can't be null");
        return null;
    }

    @Nullable
    public <TResult> List<TResult> deserializeList(Class<TResult> cls, InputStream inputStream) throws IOException {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (inputStream != null) {
            JsonReader<TContext> process = this.localReader.get().process(inputStream);
            try {
                return deserializeList(cls, process, inputStream);
            } finally {
                process.reset();
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public <TResult> List<TResult> deserializeList(Class<TResult> cls, JsonReader<TContext> jsonReader, InputStream inputStream) throws IOException {
        JsonReader.ReadJsonObject objectReader;
        if (jsonReader.getNextToken() != 91) {
            if (jsonReader.wasNull()) {
                return null;
            }
            throw jsonReader.newParseError("Expecting '[' for list start");
        }
        if (jsonReader.getNextToken() == 93) {
            return new ArrayList(0);
        }
        if (JsonObject.class.isAssignableFrom(cls) && (objectReader = getObjectReader(cls)) != null) {
            return jsonReader.deserializeNullableCollection(objectReader);
        }
        JsonReader.ReadObject tryFindReader = tryFindReader((Class) cls);
        if (tryFindReader != null) {
            return jsonReader.deserializeNullableCollectionCustom(tryFindReader);
        }
        if (this.fallback != null) {
            Object[] objArr = (Object[]) this.fallback.deserialize(this.context, Array.newInstance((Class<?>) cls, 0).getClass(), new RereadStream(jsonReader.buffer, inputStream));
            if (objArr == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                arrayList.add(obj);
            }
            return arrayList;
        }
        throw createErrorMessage(cls);
    }

    @Deprecated
    public <T extends JsonObject> void serialize(JsonWriter jsonWriter, T[] tArr, int i) {
        if (jsonWriter == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("writer can't be null");
            return;
        }
        if (tArr == null) {
            jsonWriter.writeNull();
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        if (i != 0) {
            T t = tArr[0];
            if (t != null) {
                t.serialize(jsonWriter, this.omitDefaults);
            } else {
                jsonWriter.writeNull();
            }
            for (int i2 = 1; i2 < i; i2++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                T t2 = tArr[i2];
                if (t2 != null) {
                    t2.serialize(jsonWriter, this.omitDefaults);
                } else {
                    jsonWriter.writeNull();
                }
            }
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    @Deprecated
    public <T extends JsonObject> void serialize(JsonWriter jsonWriter, @Nullable List<T> list) {
        if (jsonWriter == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("writer can't be null");
            return;
        }
        if (list == null) {
            jsonWriter.writeNull();
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        if (list.size() != 0) {
            T t = list.get(0);
            if (t != null) {
                t.serialize(jsonWriter, this.omitDefaults);
            } else {
                jsonWriter.writeNull();
            }
            for (int i = 1; i < list.size(); i++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                T t2 = list.get(i);
                if (t2 != null) {
                    t2.serialize(jsonWriter, this.omitDefaults);
                } else {
                    jsonWriter.writeNull();
                }
            }
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    @Deprecated
    public <T extends JsonObject> void serialize(JsonWriter jsonWriter, @Nullable Collection<T> collection) {
        if (jsonWriter == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("writer can't be null");
            return;
        }
        if (collection == null) {
            jsonWriter.writeNull();
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        if (!collection.isEmpty()) {
            Iterator<T> it2 = collection.iterator();
            T next = it2.next();
            if (next != null) {
                next.serialize(jsonWriter, this.omitDefaults);
            } else {
                jsonWriter.writeNull();
            }
            while (it2.hasNext()) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                T next2 = it2.next();
                if (next2 != null) {
                    next2.serialize(jsonWriter, this.omitDefaults);
                } else {
                    jsonWriter.writeNull();
                }
            }
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    @Deprecated
    public <T extends JsonObject> void serialize(JsonWriter jsonWriter, @Nullable T[] tArr) {
        if (tArr == null) {
            jsonWriter.writeNull();
            return;
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_START);
        if (tArr.length != 0) {
            T t = tArr[0];
            if (t != null) {
                t.serialize(jsonWriter, this.omitDefaults);
            } else {
                jsonWriter.writeNull();
            }
            for (int i = 1; i < tArr.length; i++) {
                jsonWriter.writeByte(JsonWriter.COMMA);
                T t2 = tArr[i];
                if (t2 != null) {
                    t2.serialize(jsonWriter, this.omitDefaults);
                } else {
                    jsonWriter.writeNull();
                }
            }
        }
        jsonWriter.writeByte(JsonWriter.ARRAY_END);
    }

    public final void serialize(@Nullable Object obj, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("stream can't be null");
            return;
        }
        if (obj == null) {
            outputStream.write(NULL);
            return;
        }
        JsonWriter jsonWriter = this.localWriter.get();
        jsonWriter.reset(outputStream);
        Class<?> cls = obj.getClass();
        if (!serialize(jsonWriter, cls, obj)) {
            Fallback<TContext> fallback = this.fallback;
            if (fallback != null) {
                fallback.serialize(obj, outputStream);
                return;
            }
            throw new ConfigurationException(a$$ExternalSyntheticOutline0.m("Unable to serialize provided object. Failed to find serializer for: ", cls));
        }
        jsonWriter.flush();
        jsonWriter.reset(null);
    }

    @Override // com.bugsnag.android.repackaged.dslplatform.json.UnknownSerializer
    public final void serialize(JsonWriter jsonWriter, @Nullable Object obj) throws IOException {
        if (jsonWriter == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("writer can't be null");
            return;
        }
        if (obj == null) {
            jsonWriter.writeNull();
            return;
        }
        Class<?> cls = obj.getClass();
        if (serialize(jsonWriter, cls, obj)) {
            return;
        }
        if (this.fallback != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.fallback.serialize(obj, byteArrayOutputStream);
            jsonWriter.writeAscii(byteArrayOutputStream.toByteArray());
            return;
        }
        throw new ConfigurationException(a$$ExternalSyntheticOutline0.m("Unable to serialize provided object. Failed to find serializer for: ", cls));
    }

    @Deprecated
    public DslJson(@Nullable TContext tcontext, boolean z, @Nullable Fallback<TContext> fallback, boolean z2, @Nullable StringCache stringCache, Iterable<Configuration> iterable) {
        this(new Settings().withContext(tcontext).withJavaConverters(z).fallbackTo(fallback).skipDefaultValues(z2).useKeyCache(stringCache).with(iterable));
    }

    public DslJson() {
        this(new Settings().includeServiceLoader());
    }
}
