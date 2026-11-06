package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.Config;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_Config_Option<T> extends Config.Option<T> {
    private final String id;
    private final Object token;
    private final Class<T> valueClass;

    public AutoValue_Config_Option(String str, Class<T> cls, @Nullable Object obj) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null id");
            throw null;
        }
        this.id = str;
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null valueClass");
            throw null;
        }
        this.valueClass = cls;
        this.token = obj;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Config.Option) {
            Config.Option option = (Config.Option) obj;
            if (this.id.equals(option.getId()) && this.valueClass.equals(option.getValueClass()) && ((obj2 = this.token) != null ? obj2.equals(option.getToken()) : option.getToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.Config.Option
    @NonNull
    public String getId() {
        return this.id;
    }

    @Override // androidx.camera.core.impl.Config.Option
    @Nullable
    public Object getToken() {
        return this.token;
    }

    @Override // androidx.camera.core.impl.Config.Option
    @NonNull
    public Class<T> getValueClass() {
        return this.valueClass;
    }

    public int hashCode() {
        int hashCode = (((this.id.hashCode() ^ 1000003) * 1000003) ^ this.valueClass.hashCode()) * 1000003;
        Object obj = this.token;
        return (obj == null ? 0 : obj.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Option{id=");
        sb.append(this.id);
        sb.append(", valueClass=");
        sb.append(this.valueClass);
        sb.append(", token=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, StringSubstitutor.DEFAULT_VAR_END, this.token);
    }
}
