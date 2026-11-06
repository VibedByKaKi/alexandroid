package io.ktor.client.request.forms;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import io.ktor.http.Headers;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0011\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lio/ktor/client/request/forms/FormPart;", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "", "value", "headers", "Lio/ktor/http/Headers;", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/Headers;)V", "getHeaders", "()Lio/ktor/http/Headers;", "getKey", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/Headers;)Lio/ktor/client/request/forms/FormPart;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ktor-client-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final /* data */ class FormPart<T> {

    @NotNull
    private final Headers headers;

    @NotNull
    private final String key;

    @NotNull
    private final T value;

    public FormPart(@NotNull String str, @NotNull T t, @NotNull Headers headers) {
        str.getClass();
        t.getClass();
        headers.getClass();
        this.key = str;
        this.value = t;
        this.headers = headers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static /* synthetic */ FormPart copy$default(FormPart formPart, String str, Object obj, Headers headers, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = formPart.key;
        }
        if ((i & 2) != 0) {
            obj = formPart.value;
        }
        if ((i & 4) != 0) {
            headers = formPart.headers;
        }
        return formPart.copy(str, obj, headers);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final T component2() {
        return this.value;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    public final FormPart<T> copy(@NotNull String key, @NotNull T value, @NotNull Headers headers) {
        key.getClass();
        value.getClass();
        headers.getClass();
        return new FormPart<>(key, value, headers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormPart)) {
            return false;
        }
        FormPart formPart = (FormPart) other;
        return Intrinsics.areEqual(this.key, formPart.key) && Intrinsics.areEqual(this.value, formPart.value) && Intrinsics.areEqual(this.headers, formPart.headers);
    }

    @NotNull
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t = this.value;
        int hashCode2 = (hashCode + (t != null ? t.hashCode() : 0)) * 31;
        Headers headers = this.headers;
        return hashCode2 + (headers != null ? headers.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FormPart(key=" + this.key + ", value=" + this.value + ", headers=" + this.headers + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ FormPart(String str, Object obj, Headers headers, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, (i & 4) != 0 ? Headers.INSTANCE.getEmpty() : headers);
    }
}
