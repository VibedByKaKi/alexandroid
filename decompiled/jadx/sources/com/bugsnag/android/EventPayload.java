package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.ImmutableConfig;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B9\b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0000¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/bugsnag/android/EventPayload;", "Lcom/bugsnag/android/JsonStream$Streamable;", "apiKey", "", "event", "Lcom/bugsnag/android/Event;", "eventFile", "Ljava/io/File;", "notifier", "Lcom/bugsnag/android/Notifier;", "config", "Lcom/bugsnag/android/internal/ImmutableConfig;", "(Ljava/lang/String;Lcom/bugsnag/android/Event;Ljava/io/File;Lcom/bugsnag/android/Notifier;Lcom/bugsnag/android/internal/ImmutableConfig;)V", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "value", "getEvent", "()Lcom/bugsnag/android/Event;", "setEvent$bugsnag_android_core_release", "(Lcom/bugsnag/android/Event;)V", "getEventFile$bugsnag_android_core_release", "()Ljava/io/File;", "getNotifier$bugsnag_android_core_release", "()Lcom/bugsnag/android/Notifier;", "getErrorTypes", "", "Lcom/bugsnag/android/ErrorType;", "getErrorTypes$bugsnag_android_core_release", "toStream", "", "writer", "Lcom/bugsnag/android/JsonStream;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class EventPayload implements JsonStream.Streamable {

    @Nullable
    private String apiKey;
    private final ImmutableConfig config;

    @Nullable
    private Event event;

    @Nullable
    private final File eventFile;

    @NotNull
    private final Notifier notifier;

    @JvmOverloads
    public EventPayload(@Nullable String str, @Nullable Event event, @Nullable File file, @NotNull Notifier notifier, @NotNull ImmutableConfig immutableConfig) {
        notifier.getClass();
        immutableConfig.getClass();
        this.apiKey = str;
        this.eventFile = file;
        this.config = immutableConfig;
        this.event = event;
        Notifier notifier2 = new Notifier(notifier.getName(), notifier.getVersion(), notifier.getUrl());
        notifier2.setDependencies(CollectionsKt.toMutableList((Collection) notifier.getDependencies()));
        Unit unit = Unit.INSTANCE;
        this.notifier = notifier2;
    }

    @Nullable
    public final String getApiKey() {
        return this.apiKey;
    }

    @NotNull
    public final Set<ErrorType> getErrorTypes$bugsnag_android_core_release() {
        Event event = this.event;
        if (event != null) {
            return event.getImpl().getErrorTypesFromStackframes$bugsnag_android_core_release();
        }
        File file = this.eventFile;
        return file != null ? EventFilenameInfo.INSTANCE.fromFile(file, this.config).getErrorTypes() : SetsKt.emptySet();
    }

    @Nullable
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    /* renamed from: getEventFile$bugsnag_android_core_release, reason: from getter */
    public final File getEventFile() {
        return this.eventFile;
    }

    @NotNull
    /* renamed from: getNotifier$bugsnag_android_core_release, reason: from getter */
    public final Notifier getNotifier() {
        return this.notifier;
    }

    public final void setApiKey(@Nullable String str) {
        this.apiKey = str;
    }

    public final void setEvent$bugsnag_android_core_release(@Nullable Event event) {
        this.event = event;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NotNull JsonStream writer) throws IOException {
        writer.getClass();
        writer.beginObject();
        writer.name("apiKey").value(this.apiKey);
        writer.name("payloadVersion").value("4.0");
        writer.name("notifier").value(this.notifier);
        writer.name("events").beginArray();
        Event event = this.event;
        if (event != null) {
            writer.value(event);
        } else {
            File file = this.eventFile;
            if (file != null) {
                writer.value(file);
            }
        }
        writer.endArray();
        writer.endObject();
    }

    @JvmOverloads
    public EventPayload(@Nullable String str, @NotNull Notifier notifier, @NotNull ImmutableConfig immutableConfig) {
        this(str, null, null, notifier, immutableConfig, 6, null);
    }

    @JvmOverloads
    public EventPayload(@Nullable String str, @Nullable Event event, @NotNull Notifier notifier, @NotNull ImmutableConfig immutableConfig) {
        this(str, event, null, notifier, immutableConfig, 4, null);
    }

    public /* synthetic */ EventPayload(String str, Event event, File file, Notifier notifier, ImmutableConfig immutableConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : event, (i & 4) != 0 ? null : file, notifier, immutableConfig);
    }
}
