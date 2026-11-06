package com.bugsnag.android;

import android.util.JsonReader;
import com.bugsnag.android.JsonStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bugsnag/android/DeviceId;", "Lcom/bugsnag/android/JsonStream$Streamable;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "toStream", "", "stream", "Lcom/bugsnag/android/JsonStream;", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
final class DeviceId implements JsonStream.Streamable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_ID = "id";

    @Nullable
    private final String id;

    public DeviceId(@Nullable String str) {
        this.id = str;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NotNull JsonStream stream) {
        stream.getClass();
        stream.beginObject();
        stream.name("id");
        stream.value(this.id);
        stream.endObject();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bugsnag/android/DeviceId$Companion;", "Lcom/bugsnag/android/JsonReadable;", "Lcom/bugsnag/android/DeviceId;", "()V", "KEY_ID", "", "fromReader", "reader", "Landroid/util/JsonReader;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion implements JsonReadable<DeviceId> {
        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bugsnag.android.JsonReadable
        @NotNull
        public DeviceId fromReader(@NotNull JsonReader reader) {
            reader.getClass();
            reader.beginObject();
            return new DeviceId((reader.hasNext() && kotlin.jvm.internal.Intrinsics.areEqual("id", reader.nextName())) ? reader.nextString() : null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
