package com.bugsnag.android;

import android.util.JsonReader;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.bugsnag.android.JsonStream;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B+\b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/User;", "Lcom/bugsnag/android/JsonStream$Streamable;", "id", "", "email", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getId", "getName", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toStream", "", "writer", "Lcom/bugsnag/android/JsonStream;", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final class User implements JsonStream.Streamable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_EMAIL = "email";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";

    @Nullable
    private final String email;

    @Nullable
    private final String id;

    @Nullable
    private final String name;

    public /* synthetic */ User(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(User.class, other != null ? other.getClass() : null)) {
            return false;
        }
        if (other != null) {
            User user = (User) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.id, user.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, user.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, user.name);
        }
        CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type com.bugsnag.android.User");
        return false;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.email;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NotNull JsonStream writer) throws IOException {
        writer.getClass();
        writer.beginObject();
        writer.name("id").value(this.id);
        writer.name("email").value(this.email);
        writer.name("name").value(this.name);
        writer.endObject();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/User$Companion;", "Lcom/bugsnag/android/JsonReadable;", "Lcom/bugsnag/android/User;", "()V", "KEY_EMAIL", "", "KEY_ID", "KEY_NAME", "fromReader", "reader", "Landroid/util/JsonReader;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion implements JsonReadable<User> {
        private Companion() {
        }

        @Override // com.bugsnag.android.JsonReadable
        @NotNull
        public User fromReader(@NotNull JsonReader reader) {
            reader.getClass();
            reader.beginObject();
            String str = null;
            String str2 = null;
            String str3 = null;
            while (reader.hasNext()) {
                String nextName = reader.nextName();
                String nextString = reader.nextString();
                if (nextName != null) {
                    int hashCode = nextName.hashCode();
                    if (hashCode != 3355) {
                        if (hashCode != 3373707) {
                            if (hashCode == 96619420 && nextName.equals("email")) {
                                str2 = nextString;
                            }
                        } else if (nextName.equals("name")) {
                            str3 = nextString;
                        }
                    } else if (nextName.equals("id")) {
                        str = nextString;
                    }
                }
            }
            User user = new User(str, str2, str3);
            reader.endObject();
            return user;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmOverloads
    public User(@Nullable String str) {
        this(str, null, null, 6, null);
    }

    @JvmOverloads
    public User(@Nullable String str, @Nullable String str2) {
        this(str, str2, null, 4, null);
    }

    @JvmOverloads
    public User(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.id = str;
        this.email = str2;
        this.name = str3;
    }

    @JvmOverloads
    public User() {
        this(null, null, null, 7, null);
    }
}
