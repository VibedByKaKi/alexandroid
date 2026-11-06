package com.amazon.alexa.assistant.ui.conversation.fragments;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.data.fragments.Runtime;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentCapabilityConfig;", "", "type", "", "version", Runtime.RUNTIME_VERSION, "schemas", "", "Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentCapabilityConfig$Schema;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getVersion", "getRuntimeVersion", "getSchemas", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Schema", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FragmentCapabilityConfig {
    public static final int $stable = 8;

    @Nullable
    private final String runtimeVersion;

    @Nullable
    private final List<Schema> schemas;

    @NotNull
    private final String type;

    @Nullable
    private final String version;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/fragments/FragmentCapabilityConfig$Schema;", "", "name", "", "version", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getVersion", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Schema {
        public static final int $stable = 0;

        @NotNull
        private final String name;

        @NotNull
        private final String version;

        public Schema(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.version = str2;
        }

        public static /* synthetic */ Schema copy$default(Schema schema, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = schema.name;
            }
            if ((i & 2) != 0) {
                str2 = schema.version;
            }
            return schema.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        @NotNull
        public final Schema copy(@NotNull String name, @NotNull String version) {
            name.getClass();
            version.getClass();
            return new Schema(name, version);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Schema)) {
                return false;
            }
            Schema schema = (Schema) other;
            return Intrinsics.areEqual(this.name, schema.name) && Intrinsics.areEqual(this.version, schema.version);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getVersion() {
            return this.version;
        }

        public int hashCode() {
            return this.version.hashCode() + (this.name.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Schema(name=", this.name, ", version=", this.version, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ FragmentCapabilityConfig(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FragmentCapabilityConfig copy$default(FragmentCapabilityConfig fragmentCapabilityConfig, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fragmentCapabilityConfig.type;
        }
        if ((i & 2) != 0) {
            str2 = fragmentCapabilityConfig.version;
        }
        if ((i & 4) != 0) {
            str3 = fragmentCapabilityConfig.runtimeVersion;
        }
        if ((i & 8) != 0) {
            list = fragmentCapabilityConfig.schemas;
        }
        return fragmentCapabilityConfig.copy(str, str2, str3, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    @Nullable
    public final List<Schema> component4() {
        return this.schemas;
    }

    @NotNull
    public final FragmentCapabilityConfig copy(@NotNull String type, @Nullable String version, @Nullable String runtimeVersion, @Nullable List<Schema> schemas) {
        type.getClass();
        return new FragmentCapabilityConfig(type, version, runtimeVersion, schemas);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentCapabilityConfig)) {
            return false;
        }
        FragmentCapabilityConfig fragmentCapabilityConfig = (FragmentCapabilityConfig) other;
        return Intrinsics.areEqual(this.type, fragmentCapabilityConfig.type) && Intrinsics.areEqual(this.version, fragmentCapabilityConfig.version) && Intrinsics.areEqual(this.runtimeVersion, fragmentCapabilityConfig.runtimeVersion) && Intrinsics.areEqual(this.schemas, fragmentCapabilityConfig.schemas);
    }

    @Nullable
    public final String getRuntimeVersion() {
        return this.runtimeVersion;
    }

    @Nullable
    public final List<Schema> getSchemas() {
        return this.schemas;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.version;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.runtimeVersion;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Schema> list = this.schemas;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.version;
        String str3 = this.runtimeVersion;
        List<Schema> list = this.schemas;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("FragmentCapabilityConfig(type=", str, ", version=", str2, ", runtimeVersion=");
        m.append(str3);
        m.append(", schemas=");
        m.append(list);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public FragmentCapabilityConfig(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable List<Schema> list) {
        str.getClass();
        this.type = str;
        this.version = str2;
        this.runtimeVersion = str3;
        this.schemas = list;
    }
}
