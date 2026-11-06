package org.apache.commons.lang.p002enum;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class Enum implements Comparable, Serializable {
    private static final Map EMPTY_MAP = Collections.unmodifiableMap(new HashMap(0));
    private static Map cEnumClasses = new WeakHashMap();
    static /* synthetic */ Class class$org$apache$commons$lang$enum$Enum = null;
    static /* synthetic */ Class class$org$apache$commons$lang$enum$ValuedEnum = null;
    private static final long serialVersionUID = -487045951170455942L;
    private final transient int iHashCode;
    private final String iName;
    protected transient String iToString = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Entry {
        final List list;
        final Map map;
        final List unmodifiableList;
        final Map unmodifiableMap;

        public Entry() {
            HashMap hashMap = new HashMap();
            this.map = hashMap;
            this.unmodifiableMap = Collections.unmodifiableMap(hashMap);
            ArrayList arrayList = new ArrayList(25);
            this.list = arrayList;
            this.unmodifiableList = Collections.unmodifiableList(arrayList);
        }
    }

    public Enum(String str) {
        init(str);
        this.iName = str;
        this.iHashCode = (str.hashCode() * 3) + getEnumClass().hashCode() + 7;
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    private static Entry createEntry(Class cls) {
        Entry entry = new Entry();
        for (Class superclass = cls.getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            Class cls2 = class$org$apache$commons$lang$enum$Enum;
            if (cls2 == null) {
                cls2 = class$("org.apache.commons.lang.enum.Enum");
                class$org$apache$commons$lang$enum$Enum = cls2;
            }
            if (superclass == cls2) {
                break;
            }
            Class cls3 = class$org$apache$commons$lang$enum$ValuedEnum;
            if (cls3 == null) {
                cls3 = class$("org.apache.commons.lang.enum.ValuedEnum");
                class$org$apache$commons$lang$enum$ValuedEnum = cls3;
            }
            if (superclass == cls3) {
                break;
            }
            Entry entry2 = (Entry) cEnumClasses.get(superclass);
            if (entry2 != null) {
                entry.list.addAll(entry2.list);
                entry.map.putAll(entry2.map);
                return entry;
            }
        }
        return entry;
    }

    private static Entry getEntry(Class cls) {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("The Enum Class must not be null");
            return null;
        }
        Class cls2 = class$org$apache$commons$lang$enum$Enum;
        if (cls2 == null) {
            cls2 = class$("org.apache.commons.lang.enum.Enum");
            class$org$apache$commons$lang$enum$Enum = cls2;
        }
        if (!cls2.isAssignableFrom(cls)) {
            Single$$ExternalSyntheticBUOutline0.m$3("The Class must be a subclass of Enum");
            return null;
        }
        Entry entry = (Entry) cEnumClasses.get(cls);
        if (entry == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                return (Entry) cEnumClasses.get(cls);
            } catch (Exception unused) {
            }
        }
        return entry;
    }

    public static Enum getEnum(Class cls, String str) {
        Entry entry = getEntry(cls);
        if (entry == null) {
            return null;
        }
        return (Enum) entry.map.get(str);
    }

    public static List getEnumList(Class cls) {
        Entry entry = getEntry(cls);
        return entry == null ? Collections.EMPTY_LIST : entry.unmodifiableList;
    }

    public static Map getEnumMap(Class cls) {
        Entry entry = getEntry(cls);
        return entry == null ? EMPTY_MAP : entry.unmodifiableMap;
    }

    private String getNameInOtherClassLoader(Object obj) {
        try {
            return (String) obj.getClass().getMethod("getName", null).invoke(obj, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            Single$$ExternalSyntheticBUOutline0.m$2("This should not happen");
            return null;
        }
    }

    private void init(String str) {
        Entry entry;
        if (StringUtils.isEmpty(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3("The Enum name must not be empty or null");
            return;
        }
        Class<?> enumClass = getEnumClass();
        if (enumClass == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("getEnumClass() must not be null");
            return;
        }
        for (Class<?> cls = getClass(); cls != null; cls = cls.getSuperclass()) {
            Class<?> cls2 = class$org$apache$commons$lang$enum$Enum;
            if (cls2 == null) {
                cls2 = class$("org.apache.commons.lang.enum.Enum");
                class$org$apache$commons$lang$enum$Enum = cls2;
            }
            if (cls == cls2) {
                break;
            }
            Class<?> cls3 = class$org$apache$commons$lang$enum$ValuedEnum;
            if (cls3 == null) {
                cls3 = class$("org.apache.commons.lang.enum.ValuedEnum");
                class$org$apache$commons$lang$enum$ValuedEnum = cls3;
            }
            if (cls == cls3) {
                break;
            }
            if (cls == enumClass) {
                Class cls4 = class$org$apache$commons$lang$enum$Enum;
                if (cls4 == null) {
                    cls4 = class$("org.apache.commons.lang.enum.Enum");
                    class$org$apache$commons$lang$enum$Enum = cls4;
                }
                synchronized (cls4) {
                    try {
                        entry = (Entry) cEnumClasses.get(enumClass);
                        if (entry == null) {
                            entry = createEntry(enumClass);
                            WeakHashMap weakHashMap = new WeakHashMap();
                            weakHashMap.putAll(cEnumClasses);
                            weakHashMap.put(enumClass, entry);
                            cEnumClasses = weakHashMap;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!entry.map.containsKey(str)) {
                    entry.map.put(str, this);
                    entry.list.add(this);
                    return;
                } else {
                    StringBuffer stringBuffer = new StringBuffer("The Enum name must be unique, '");
                    stringBuffer.append(str);
                    stringBuffer.append("' has already been added");
                    XML$$ExternalSyntheticBUOutline0.m(stringBuffer);
                    return;
                }
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3("getEnumClass() must return a superclass of this class");
    }

    public static Iterator iterator(Class cls) {
        return getEnumList(cls).iterator();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj == this) {
            return 0;
        }
        if (obj.getClass() == getClass()) {
            return this.iName.compareTo(((Enum) obj).iName);
        }
        if (obj.getClass().getName().equals(getClass().getName())) {
            return this.iName.compareTo(getNameInOtherClassLoader(obj));
        }
        StringBuffer stringBuffer = new StringBuffer("Different enum class '");
        stringBuffer.append(ClassUtils.getShortClassName(obj.getClass()));
        stringBuffer.append("'");
        throw new ClassCastException(stringBuffer.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == getClass()) {
            return this.iName.equals(((Enum) obj).iName);
        }
        if (obj.getClass().getName().equals(getClass().getName())) {
            return this.iName.equals(getNameInOtherClassLoader(obj));
        }
        return false;
    }

    public Class getEnumClass() {
        return getClass();
    }

    public final String getName() {
        return this.iName;
    }

    public final int hashCode() {
        return this.iHashCode;
    }

    public Object readResolve() {
        Entry entry = (Entry) cEnumClasses.get(getEnumClass());
        if (entry == null) {
            return null;
        }
        return entry.map.get(getName());
    }

    public String toString() {
        if (this.iToString == null) {
            String shortClassName = ClassUtils.getShortClassName(getEnumClass());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(shortClassName);
            stringBuffer.append(MarkdownConstants.LEFT_BRACKET);
            stringBuffer.append(getName());
            stringBuffer.append(MarkdownConstants.RIGHT_BRACKET);
            this.iToString = stringBuffer.toString();
        }
        return this.iToString;
    }
}
