package com.amazon.alexa.ra.core.data.fragments;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001FB·\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\u0017\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000bHÆ\u0003J»\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020DHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$¨\u0006G"}, d2 = {"Lcom/amazon/alexa/ra/core/data/fragments/SmartFragmentContent;", "", "type", "", "version", "script", SmartFragmentContent.SCRIPT_TYPE, "Lcom/amazon/alexa/ra/core/data/fragments/ScriptType;", SmartFragmentContent.DEPENDENCIES, "", "data", "Lorg/json/JSONObject;", "artifacts", "", "Lcom/amazon/alexa/ra/core/data/fragments/Artifact;", "policy", "Lcom/amazon/alexa/ra/core/data/fragments/SmartFragmentPolicy;", "url", SmartFragmentContent.INTEGRITY, "platform", SmartFragmentContent.RUNTIME, "Lcom/amazon/alexa/ra/core/data/fragments/Runtime;", "experimental", "Lcom/amazon/alexa/ra/core/data/fragments/ContentExperimental;", "rawContentJson", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/fragments/ScriptType;Ljava/util/Map;Lorg/json/JSONObject;Ljava/util/List;Lcom/amazon/alexa/ra/core/data/fragments/SmartFragmentPolicy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/alexa/ra/core/data/fragments/Runtime;Lcom/amazon/alexa/ra/core/data/fragments/ContentExperimental;Lorg/json/JSONObject;)V", "getType", "()Ljava/lang/String;", "getVersion", "getScript", "getScriptType", "()Lcom/amazon/alexa/ra/core/data/fragments/ScriptType;", "getDependencies", "()Ljava/util/Map;", "getData", "()Lorg/json/JSONObject;", "getArtifacts", "()Ljava/util/List;", "getPolicy", "()Lcom/amazon/alexa/ra/core/data/fragments/SmartFragmentPolicy;", "getUrl", "getIntegrity", "getPlatform", "getRuntime", "()Lcom/amazon/alexa/ra/core/data/fragments/Runtime;", "getExperimental", "()Lcom/amazon/alexa/ra/core/data/fragments/ContentExperimental;", "getRawContentJson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "SpecificationKeys", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class SmartFragmentContent {

    @NotNull
    public static final String ARTIFACTS = "artifacts";

    @NotNull
    public static final String DATA = "data";

    @NotNull
    public static final String DEPENDENCIES = "dependencies";

    @NotNull
    public static final String EXPERIMENTAL = "experimental";

    @NotNull
    public static final String INTEGRITY = "integrity";

    @NotNull
    public static final String PLATFORM = "platform";

    @NotNull
    public static final String POLICY = "policy";

    @NotNull
    public static final String RUNTIME = "runtime";

    @NotNull
    public static final String SCRIPT = "script";

    @NotNull
    public static final String SCRIPT_TYPE = "scriptType";

    @NotNull
    public static final String TYPE = "type";

    @NotNull
    public static final String URL = "url";

    @NotNull
    public static final String VERSION = "version";

    @Nullable
    private final List<Artifact> artifacts;

    @Nullable
    private final JSONObject data;

    @Nullable
    private final Map<String, String> dependencies;

    @Nullable
    private final ContentExperimental experimental;

    @Nullable
    private final String integrity;

    @Nullable
    private final String platform;

    @Nullable
    private final SmartFragmentPolicy policy;

    @Nullable
    private final JSONObject rawContentJson;

    @Nullable
    private final Runtime runtime;

    @NotNull
    private final String script;

    @NotNull
    private final ScriptType scriptType;

    @NotNull
    private final String type;

    @Nullable
    private final String url;

    @NotNull
    private final String version;
    public static final int $stable = 8;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ SmartFragmentContent(java.lang.String r18, java.lang.String r19, java.lang.String r20, com.amazon.alexa.ra.core.data.fragments.ScriptType r21, java.util.Map r22, org.json.JSONObject r23, java.util.List r24, com.amazon.alexa.ra.core.data.fragments.SmartFragmentPolicy r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, com.amazon.alexa.ra.core.data.fragments.Runtime r29, com.amazon.alexa.ra.core.data.fragments.ContentExperimental r30, org.json.JSONObject r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r17 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto La
            java.lang.String r1 = "SmartFragment"
            r3 = r1
            goto Lc
        La:
            r3 = r18
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            java.lang.String r1 = "1.0"
            r4 = r1
            goto L16
        L14:
            r4 = r19
        L16:
            r1 = r0 & 4
            if (r1 == 0) goto L1e
            java.lang.String r1 = ""
            r5 = r1
            goto L20
        L1e:
            r5 = r20
        L20:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L27
            r7 = r2
            goto L29
        L27:
            r7 = r22
        L29:
            r1 = r0 & 32
            if (r1 == 0) goto L2f
            r8 = r2
            goto L31
        L2f:
            r8 = r23
        L31:
            r1 = r0 & 64
            if (r1 == 0) goto L37
            r9 = r2
            goto L39
        L37:
            r9 = r24
        L39:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L3f
            r10 = r2
            goto L41
        L3f:
            r10 = r25
        L41:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L47
            r11 = r2
            goto L49
        L47:
            r11 = r26
        L49:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L4f
            r12 = r2
            goto L51
        L4f:
            r12 = r27
        L51:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L57
            r13 = r2
            goto L59
        L57:
            r13 = r28
        L59:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L5f
            r14 = r2
            goto L61
        L5f:
            r14 = r29
        L61:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L67
            r15 = r2
            goto L69
        L67:
            r15 = r30
        L69:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L74
            r16 = r2
            r6 = r21
            r2 = r17
            goto L7a
        L74:
            r16 = r31
            r2 = r17
            r6 = r21
        L7a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.core.data.fragments.SmartFragmentContent.<init>(java.lang.String, java.lang.String, java.lang.String, com.amazon.alexa.ra.core.data.fragments.ScriptType, java.util.Map, org.json.JSONObject, java.util.List, com.amazon.alexa.ra.core.data.fragments.SmartFragmentPolicy, java.lang.String, java.lang.String, java.lang.String, com.amazon.alexa.ra.core.data.fragments.Runtime, com.amazon.alexa.ra.core.data.fragments.ContentExperimental, org.json.JSONObject, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getIntegrity() {
        return this.integrity;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Runtime getRuntime() {
        return this.runtime;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final ContentExperimental getExperimental() {
        return this.experimental;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final JSONObject getRawContentJson() {
        return this.rawContentJson;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getScript() {
        return this.script;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ScriptType getScriptType() {
        return this.scriptType;
    }

    @Nullable
    public final Map<String, String> component5() {
        return this.dependencies;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final JSONObject getData() {
        return this.data;
    }

    @Nullable
    public final List<Artifact> component7() {
        return this.artifacts;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final SmartFragmentPolicy getPolicy() {
        return this.policy;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final SmartFragmentContent copy(@NotNull String type, @NotNull String version, @NotNull String script, @NotNull ScriptType scriptType, @Nullable Map<String, String> dependencies, @Nullable JSONObject data, @Nullable List<Artifact> artifacts, @Nullable SmartFragmentPolicy policy, @Nullable String url, @Nullable String integrity, @Nullable String platform, @Nullable Runtime runtime, @Nullable ContentExperimental experimental, @Nullable JSONObject rawContentJson) {
        type.getClass();
        version.getClass();
        script.getClass();
        scriptType.getClass();
        return new SmartFragmentContent(type, version, script, scriptType, dependencies, data, artifacts, policy, url, integrity, platform, runtime, experimental, rawContentJson);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartFragmentContent)) {
            return false;
        }
        SmartFragmentContent smartFragmentContent = (SmartFragmentContent) other;
        return Intrinsics.areEqual(this.type, smartFragmentContent.type) && Intrinsics.areEqual(this.version, smartFragmentContent.version) && Intrinsics.areEqual(this.script, smartFragmentContent.script) && this.scriptType == smartFragmentContent.scriptType && Intrinsics.areEqual(this.dependencies, smartFragmentContent.dependencies) && Intrinsics.areEqual(this.data, smartFragmentContent.data) && Intrinsics.areEqual(this.artifacts, smartFragmentContent.artifacts) && Intrinsics.areEqual(this.policy, smartFragmentContent.policy) && Intrinsics.areEqual(this.url, smartFragmentContent.url) && Intrinsics.areEqual(this.integrity, smartFragmentContent.integrity) && Intrinsics.areEqual(this.platform, smartFragmentContent.platform) && Intrinsics.areEqual(this.runtime, smartFragmentContent.runtime) && Intrinsics.areEqual(this.experimental, smartFragmentContent.experimental) && Intrinsics.areEqual(this.rawContentJson, smartFragmentContent.rawContentJson);
    }

    @Nullable
    public final List<Artifact> getArtifacts() {
        return this.artifacts;
    }

    @Nullable
    public final JSONObject getData() {
        return this.data;
    }

    @Nullable
    public final Map<String, String> getDependencies() {
        return this.dependencies;
    }

    @Nullable
    public final ContentExperimental getExperimental() {
        return this.experimental;
    }

    @Nullable
    public final String getIntegrity() {
        return this.integrity;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final SmartFragmentPolicy getPolicy() {
        return this.policy;
    }

    @Nullable
    public final JSONObject getRawContentJson() {
        return this.rawContentJson;
    }

    @Nullable
    public final Runtime getRuntime() {
        return this.runtime;
    }

    @NotNull
    public final String getScript() {
        return this.script;
    }

    @NotNull
    public final ScriptType getScriptType() {
        return this.scriptType;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode = (this.scriptType.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.type.hashCode() * 31, 31, this.version), 31, this.script)) * 31;
        Map<String, String> map = this.dependencies;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        JSONObject jSONObject = this.data;
        int hashCode3 = (hashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        List<Artifact> list = this.artifacts;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SmartFragmentPolicy smartFragmentPolicy = this.policy;
        int hashCode5 = (hashCode4 + (smartFragmentPolicy == null ? 0 : smartFragmentPolicy.hashCode())) * 31;
        String str = this.url;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.integrity;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platform;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Runtime runtime = this.runtime;
        int hashCode9 = (hashCode8 + (runtime == null ? 0 : runtime.hashCode())) * 31;
        ContentExperimental contentExperimental = this.experimental;
        int hashCode10 = (hashCode9 + (contentExperimental == null ? 0 : contentExperimental.hashCode())) * 31;
        JSONObject jSONObject2 = this.rawContentJson;
        return hashCode10 + (jSONObject2 != null ? jSONObject2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.version;
        String str3 = this.script;
        ScriptType scriptType = this.scriptType;
        Map<String, String> map = this.dependencies;
        JSONObject jSONObject = this.data;
        List<Artifact> list = this.artifacts;
        SmartFragmentPolicy smartFragmentPolicy = this.policy;
        String str4 = this.url;
        String str5 = this.integrity;
        String str6 = this.platform;
        Runtime runtime = this.runtime;
        ContentExperimental contentExperimental = this.experimental;
        JSONObject jSONObject2 = this.rawContentJson;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SmartFragmentContent(type=", str, ", version=", str2, ", script=");
        m.append(str3);
        m.append(", scriptType=");
        m.append(scriptType);
        m.append(", dependencies=");
        m.append(map);
        m.append(", data=");
        m.append(jSONObject);
        m.append(", artifacts=");
        m.append(list);
        m.append(", policy=");
        m.append(smartFragmentPolicy);
        m.append(", url=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str4, ", integrity=", str5, ", platform=");
        m.append(str6);
        m.append(", runtime=");
        m.append(runtime);
        m.append(", experimental=");
        m.append(contentExperimental);
        m.append(", rawContentJson=");
        m.append(jSONObject2);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public SmartFragmentContent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull ScriptType scriptType, @Nullable Map<String, String> map, @Nullable JSONObject jSONObject, @Nullable List<Artifact> list, @Nullable SmartFragmentPolicy smartFragmentPolicy, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Runtime runtime, @Nullable ContentExperimental contentExperimental, @Nullable JSONObject jSONObject2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        scriptType.getClass();
        this.type = str;
        this.version = str2;
        this.script = str3;
        this.scriptType = scriptType;
        this.dependencies = map;
        this.data = jSONObject;
        this.artifacts = list;
        this.policy = smartFragmentPolicy;
        this.url = str4;
        this.integrity = str5;
        this.platform = str6;
        this.runtime = runtime;
        this.experimental = contentExperimental;
        this.rawContentJson = jSONObject2;
    }
}
