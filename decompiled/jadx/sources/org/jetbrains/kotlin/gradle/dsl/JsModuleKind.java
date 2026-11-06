package org.jetbrains.kotlin.gradle.dsl;

import com.amazon.alexa.accessory.frames.translation.util.TranslationLanguageManager;
import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/JsModuleKind;", "", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getKind", "()Ljava/lang/String;", "MODULE_AMD", "MODULE_PLAIN", "MODULE_ES", "MODULE_COMMONJS", "MODULE_UMD", "Companion", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum JsModuleKind {
    MODULE_AMD("amd"),
    MODULE_PLAIN("plain"),
    MODULE_ES(TranslationLanguageManager.DEFAULT_BYSTANDER_LANGUAGE),
    MODULE_COMMONJS("commonjs"),
    MODULE_UMD("umd");


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String kind;

    JsModuleKind(String str) {
        this.kind = str;
    }

    @NotNull
    public final String getKind() {
        return this.kind;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/gradle/dsl/JsModuleKind$Companion;", "", "()V", "fromKind", "Lorg/jetbrains/kotlin/gradle/dsl/JsModuleKind;", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "", "kotlin-gradle-compiler-types"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nJsModuleKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsModuleKind.kt\norg/jetbrains/kotlin/gradle/dsl/JsModuleKind$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,22:1\n1282#2,2:23\n*S KotlinDebug\n*F\n+ 1 JsModuleKind.kt\norg/jetbrains/kotlin/gradle/dsl/JsModuleKind$Companion\n*L\n18#1:23,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JsModuleKind fromKind(@NotNull String kind) {
            JsModuleKind jsModuleKind;
            kind.getClass();
            JsModuleKind[] values = JsModuleKind.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    jsModuleKind = null;
                    break;
                }
                jsModuleKind = values[i];
                if (Intrinsics.areEqual(jsModuleKind.getKind(), kind)) {
                    break;
                }
                i++;
            }
            if (jsModuleKind != null) {
                return jsModuleKind;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Unknown JS module kind: ", kind));
            return null;
        }

        private Companion() {
        }
    }
}
