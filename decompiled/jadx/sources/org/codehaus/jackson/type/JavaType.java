package org.codehaus.jackson.type;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.comms.config.util.DeviceConfigConstants;
import java.lang.reflect.Modifier;
import kotlin.text.Regex$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class JavaType {
    protected final Class<?> _class;
    protected final int _hashCode;
    protected Object _valueHandler = null;
    protected Object _typeHandler = null;

    public JavaType(Class<?> cls, int i) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode() + i;
    }

    public void _assertSubclass(Class<?> cls, Class<?> cls2) {
        if (this._class.isAssignableFrom(cls)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Class ");
        ParcelCompat$$ExternalSyntheticOutline0.m7655m((Class) cls, sb, " is not assignable to ");
        Regex$$ExternalSyntheticBUOutline0.m(this._class.getName(), sb);
    }

    public abstract JavaType _narrow(Class<?> cls);

    public JavaType _widen(Class<?> cls) {
        return _narrow(cls);
    }

    public JavaType containedType(int i) {
        return null;
    }

    public int containedTypeCount() {
        return 0;
    }

    public String containedTypeName(int i) {
        return null;
    }

    public abstract boolean equals(Object obj);

    public JavaType forcedNarrowBy(Class<?> cls) {
        if (cls == this._class) {
            return this;
        }
        JavaType _narrow = _narrow(cls);
        if (this._valueHandler != _narrow.getValueHandler()) {
            _narrow = _narrow.withValueHandler(this._valueHandler);
        }
        return this._typeHandler != _narrow.getTypeHandler() ? _narrow.withTypeHandler(this._typeHandler) : _narrow;
    }

    public JavaType getContentType() {
        return null;
    }

    public String getErasedSignature() {
        StringBuilder sb = new StringBuilder(40);
        getErasedSignature(sb);
        return sb.toString();
    }

    public abstract StringBuilder getErasedSignature(StringBuilder sb);

    public String getGenericSignature() {
        StringBuilder sb = new StringBuilder(40);
        getGenericSignature(sb);
        return sb.toString();
    }

    public abstract StringBuilder getGenericSignature(StringBuilder sb);

    public JavaType getKeyType() {
        return null;
    }

    public final Class<?> getRawClass() {
        return this._class;
    }

    public <T> T getTypeHandler() {
        return (T) this._typeHandler;
    }

    public <T> T getValueHandler() {
        return (T) this._valueHandler;
    }

    public boolean hasGenericTypes() {
        return containedTypeCount() > 0;
    }

    public final boolean hasRawClass(Class<?> cls) {
        return this._class == cls;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public boolean isAbstract() {
        return Modifier.isAbstract(this._class.getModifiers());
    }

    public boolean isArrayType() {
        return false;
    }

    public boolean isCollectionLikeType() {
        return false;
    }

    public boolean isConcrete() {
        return (this._class.getModifiers() & DeviceConfigConstants.BUFFER_SIZE_IN_SAMPLES_768_2) == 0 || this._class.isPrimitive();
    }

    public abstract boolean isContainerType();

    public final boolean isEnumType() {
        return this._class.isEnum();
    }

    public final boolean isFinal() {
        return Modifier.isFinal(this._class.getModifiers());
    }

    public final boolean isInterface() {
        return this._class.isInterface();
    }

    public boolean isMapLikeType() {
        return false;
    }

    public final boolean isPrimitive() {
        return this._class.isPrimitive();
    }

    public boolean isThrowable() {
        return Throwable.class.isAssignableFrom(this._class);
    }

    public JavaType narrowBy(Class<?> cls) {
        Class<?> cls2 = this._class;
        if (cls == cls2) {
            return this;
        }
        _assertSubclass(cls, cls2);
        JavaType _narrow = _narrow(cls);
        if (this._valueHandler != _narrow.getValueHandler()) {
            _narrow = _narrow.withValueHandler(this._valueHandler);
        }
        return this._typeHandler != _narrow.getTypeHandler() ? _narrow.withTypeHandler(this._typeHandler) : _narrow;
    }

    public abstract JavaType narrowContentsBy(Class<?> cls);

    @Deprecated
    public void setValueHandler(Object obj) {
        if (obj == null || this._valueHandler == null) {
            this._valueHandler = obj;
            return;
        }
        throw new IllegalStateException("Trying to reset value handler for type [" + toString() + "]; old handler of type " + this._valueHandler.getClass().getName() + ", new handler of type " + obj.getClass().getName());
    }

    public abstract String toCanonical();

    public abstract String toString();

    public JavaType widenBy(Class<?> cls) {
        Class<?> cls2 = this._class;
        if (cls == cls2) {
            return this;
        }
        _assertSubclass(cls2, cls);
        return _widen(cls);
    }

    public abstract JavaType widenContentsBy(Class<?> cls);

    public abstract JavaType withContentTypeHandler(Object obj);

    public JavaType withContentValueHandler(Object obj) {
        getContentType().setValueHandler(obj);
        return this;
    }

    public abstract JavaType withTypeHandler(Object obj);

    public JavaType withValueHandler(Object obj) {
        setValueHandler(obj);
        return this;
    }
}
