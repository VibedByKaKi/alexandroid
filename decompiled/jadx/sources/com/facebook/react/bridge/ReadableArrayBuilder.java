package com.facebook.react.bridge;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\nJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\fJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000eJ\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007J\u001f\u0010\u0011\u001a\u00020\u00072\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u0015J\u001f\u0010\u0016\u001a\u00020\u00072\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/bridge/ReadableArrayBuilder;", "", "array", "Lcom/facebook/react/bridge/WritableArray;", "<init>", "(Lcom/facebook/react/bridge/WritableArray;)V", BulkOperationType.add, "", "value", "", "", "", "", "", "Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/bridge/ReadableArray;", "addNull", "addMap", "builder", "Lkotlin/Function1;", "Lcom/facebook/react/bridge/ReadableMapBuilder;", "Lkotlin/ExtensionFunctionType;", "addArray", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReadableArrayBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadableArrayBuilder.kt\ncom/facebook/react/bridge/ReadableArrayBuilder\n+ 2 ReadableMapBuilder.kt\ncom/facebook/react/bridge/ReadableMapBuilderKt\n+ 3 ReadableArrayBuilder.kt\ncom/facebook/react/bridge/ReadableArrayBuilderKt\n*L\n1#1,70:1\n30#2,3:71\n24#3,3:74\n*S KotlinDebug\n*F\n+ 1 ReadableArrayBuilder.kt\ncom/facebook/react/bridge/ReadableArrayBuilder\n*L\n63#1:71,3\n67#1:74,3\n*E\n"})
/* loaded from: classes6.dex */
public final class ReadableArrayBuilder {

    @NotNull
    private final WritableArray array;

    public ReadableArrayBuilder(@NotNull WritableArray writableArray) {
        writableArray.getClass();
        this.array = writableArray;
    }

    public final void add(@NotNull ReadableMap value) {
        value.getClass();
        this.array.pushMap(value);
    }

    public final void addArray(@NotNull Function1<? super ReadableArrayBuilder, Unit> builder) {
        builder.getClass();
        WritableArray writableArray = this.array;
        WritableArray createArray = Arguments.createArray();
        createArray.getClass();
        builder.invoke(new ReadableArrayBuilder(createArray));
        writableArray.pushArray(createArray);
    }

    public final void addMap(@NotNull Function1<? super ReadableMapBuilder, Unit> builder) {
        builder.getClass();
        WritableArray writableArray = this.array;
        WritableMap createMap = Arguments.createMap();
        createMap.getClass();
        builder.invoke(new ReadableMapBuilder(createMap));
        writableArray.pushMap(createMap);
    }

    public final void addNull() {
        this.array.pushNull();
    }

    public final void add(int value) {
        this.array.pushInt(value);
    }

    public final void add(boolean value) {
        this.array.pushBoolean(value);
    }

    public final void add(double value) {
        this.array.pushDouble(value);
    }

    public final void add(long value) {
        this.array.pushDouble(value);
    }

    public final void add(@Nullable String value) {
        this.array.pushString(value);
    }

    public final void add(@NotNull ReadableArray value) {
        value.getClass();
        this.array.pushArray(value);
    }
}
