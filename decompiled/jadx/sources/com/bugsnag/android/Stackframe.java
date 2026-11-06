package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.JsonHelper;
import com.dee.app.metrics.MetricsConstants;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BU\b\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fB\u000f\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fB\u001d\b\u0010\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n¢\u0006\u0002\u0010\u0012J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0016R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010-\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001eR\u001e\u00101\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b2\u0010$\"\u0004\b3\u0010&R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\u001e\u00106\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010'\u001a\u0004\b7\u0010$\"\u0004\b8\u0010&R\u001c\u00109\u001a\u0004\u0018\u00010:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/bugsnag/android/Stackframe;", "Lcom/bugsnag/android/JsonStream$Streamable;", MetricsConstants.NativeFetch.METHOD, "", "file", "lineNumber", "", "inProject", "", "code", "", "columnNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Number;)V", "nativeFrame", "Lcom/bugsnag/android/NativeStackframe;", "(Lcom/bugsnag/android/NativeStackframe;)V", "json", "", "(Ljava/util/Map;)V", "getCode", "()Ljava/util/Map;", "setCode", "codeIdentifier", "getCodeIdentifier", "()Ljava/lang/String;", "setCodeIdentifier", "(Ljava/lang/String;)V", "getColumnNumber", "()Ljava/lang/Number;", "setColumnNumber", "(Ljava/lang/Number;)V", "getFile", "setFile", "frameAddress", "", "getFrameAddress", "()Ljava/lang/Long;", "setFrameAddress", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getInProject", "()Ljava/lang/Boolean;", "setInProject", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "isPC", "setPC", "getLineNumber", "setLineNumber", "loadAddress", "getLoadAddress", "setLoadAddress", "getMethod", "setMethod", "symbolAddress", "getSymbolAddress", "setSymbolAddress", "type", "Lcom/bugsnag/android/ErrorType;", "getType", "()Lcom/bugsnag/android/ErrorType;", "setType", "(Lcom/bugsnag/android/ErrorType;)V", "toStream", "", "writer", "Lcom/bugsnag/android/JsonStream;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class Stackframe implements JsonStream.Streamable {

    @Nullable
    private Map<String, String> code;

    @Nullable
    private String codeIdentifier;

    @Nullable
    private Number columnNumber;

    @Nullable
    private String file;

    @Nullable
    private Long frameAddress;

    @Nullable
    private Boolean inProject;

    @Nullable
    private Boolean isPC;

    @Nullable
    private Number lineNumber;

    @Nullable
    private Long loadAddress;

    @Nullable
    private String method;

    @Nullable
    private Long symbolAddress;

    @Nullable
    private ErrorType type;

    public Stackframe(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        Object obj = map.get(MetricsConstants.NativeFetch.METHOD);
        this.method = (String) (obj instanceof String ? obj : null);
        Object obj2 = map.get("file");
        this.file = (String) (obj2 instanceof String ? obj2 : null);
        JsonHelper jsonHelper = JsonHelper.INSTANCE;
        this.lineNumber = jsonHelper.jsonToLong(map.get("lineNumber"));
        Object obj3 = map.get("inProject");
        this.inProject = (Boolean) (obj3 instanceof Boolean ? obj3 : null);
        Object obj4 = map.get("columnNumber");
        this.columnNumber = (Number) (obj4 instanceof Number ? obj4 : null);
        this.frameAddress = jsonHelper.jsonToLong(map.get("frameAddress"));
        this.symbolAddress = jsonHelper.jsonToLong(map.get("symbolAddress"));
        this.loadAddress = jsonHelper.jsonToLong(map.get("loadAddress"));
        Object obj5 = map.get("codeIdentifier");
        this.codeIdentifier = (String) (obj5 instanceof String ? obj5 : null);
        Object obj6 = map.get("isPC");
        this.isPC = (Boolean) (obj6 instanceof Boolean ? obj6 : null);
        Object obj7 = map.get("code");
        this.code = (Map) (obj7 instanceof Map ? obj7 : null);
        Object obj8 = map.get("type");
        String str = (String) (obj8 instanceof String ? obj8 : null);
        this.type = str != null ? ErrorType.INSTANCE.fromDescriptor(str) : null;
    }

    @Nullable
    public final Map<String, String> getCode() {
        return this.code;
    }

    @Nullable
    public final String getCodeIdentifier() {
        return this.codeIdentifier;
    }

    @Nullable
    public final Number getColumnNumber() {
        return this.columnNumber;
    }

    @Nullable
    public final String getFile() {
        return this.file;
    }

    @Nullable
    public final Long getFrameAddress() {
        return this.frameAddress;
    }

    @Nullable
    public final Boolean getInProject() {
        return this.inProject;
    }

    @Nullable
    public final Number getLineNumber() {
        return this.lineNumber;
    }

    @Nullable
    public final Long getLoadAddress() {
        return this.loadAddress;
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final Long getSymbolAddress() {
        return this.symbolAddress;
    }

    @Nullable
    public final ErrorType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: isPC, reason: from getter */
    public final Boolean getIsPC() {
        return this.isPC;
    }

    public final void setCode(@Nullable Map<String, String> map) {
        this.code = map;
    }

    public final void setCodeIdentifier(@Nullable String str) {
        this.codeIdentifier = str;
    }

    public final void setColumnNumber(@Nullable Number number) {
        this.columnNumber = number;
    }

    public final void setFile(@Nullable String str) {
        this.file = str;
    }

    public final void setFrameAddress(@Nullable Long l) {
        this.frameAddress = l;
    }

    public final void setInProject(@Nullable Boolean bool) {
        this.inProject = bool;
    }

    public final void setLineNumber(@Nullable Number number) {
        this.lineNumber = number;
    }

    public final void setLoadAddress(@Nullable Long l) {
        this.loadAddress = l;
    }

    public final void setMethod(@Nullable String str) {
        this.method = str;
    }

    public final void setPC(@Nullable Boolean bool) {
        this.isPC = bool;
    }

    public final void setSymbolAddress(@Nullable Long l) {
        this.symbolAddress = l;
    }

    public final void setType(@Nullable ErrorType errorType) {
        this.type = errorType;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NotNull JsonStream writer) throws IOException {
        writer.getClass();
        writer.beginObject();
        writer.name(MetricsConstants.NativeFetch.METHOD).value(this.method);
        writer.name("file").value(this.file);
        writer.name("lineNumber").value(this.lineNumber);
        Boolean bool = this.inProject;
        if (bool != null) {
            writer.name("inProject").value(bool.booleanValue());
        }
        writer.name("columnNumber").value(this.columnNumber);
        if (this.frameAddress != null) {
            writer.name("frameAddress").value(JsonHelper.INSTANCE.ulongToHex(this.frameAddress));
        }
        if (this.symbolAddress != null) {
            writer.name("symbolAddress").value(JsonHelper.INSTANCE.ulongToHex(this.symbolAddress));
        }
        if (this.loadAddress != null) {
            writer.name("loadAddress").value(JsonHelper.INSTANCE.ulongToHex(this.loadAddress));
        }
        String str = this.codeIdentifier;
        if (str != null) {
            writer.name("codeIdentifier").value(str);
        }
        Boolean bool2 = this.isPC;
        if (bool2 != null) {
            writer.name("isPC").value(bool2.booleanValue());
        }
        ErrorType errorType = this.type;
        if (errorType != null) {
            writer.name("type").value(errorType.getDesc());
        }
        Map<String, String> map = this.code;
        if (map != null) {
            writer.name("code");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.beginObject();
                writer.name(entry.getKey());
                writer.value(entry.getValue());
                writer.endObject();
            }
        }
        writer.endObject();
    }

    @JvmOverloads
    public Stackframe(@Nullable String str, @Nullable String str2, @Nullable Number number, @Nullable Boolean bool, @Nullable Map<String, String> map) {
        this(str, str2, number, bool, map, null, 32, null);
    }

    public /* synthetic */ Stackframe(String str, String str2, Number number, Boolean bool, Map map, Number number2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, number, bool, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : number2);
    }

    @JvmOverloads
    public Stackframe(@Nullable String str, @Nullable String str2, @Nullable Number number, @Nullable Boolean bool, @Nullable Map<String, String> map, @Nullable Number number2) {
        this.method = str;
        this.file = str2;
        this.lineNumber = number;
        this.inProject = bool;
        this.code = map;
        this.columnNumber = number2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Stackframe(@NotNull NativeStackframe nativeStackframe) {
        this(nativeStackframe.getMethod(), nativeStackframe.getFile(), nativeStackframe.getLineNumber(), null, null, null, 32, null);
        nativeStackframe.getClass();
        this.frameAddress = nativeStackframe.getFrameAddress();
        this.symbolAddress = nativeStackframe.getSymbolAddress();
        this.loadAddress = nativeStackframe.getLoadAddress();
        this.codeIdentifier = nativeStackframe.getCodeIdentifier();
        this.isPC = nativeStackframe.getIsPC();
        this.type = nativeStackframe.getType();
    }

    @JvmOverloads
    public Stackframe(@Nullable String str, @Nullable String str2, @Nullable Number number, @Nullable Boolean bool) {
        this(str, str2, number, bool, null, null, 48, null);
    }
}
