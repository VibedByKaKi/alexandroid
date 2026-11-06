package org.jetbrains.kotlin.gradle.plugin;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinJsCompilerType;", "", "(Ljava/lang/String;I)V", "LEGACY", "IR", "BOTH", "Companion", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public enum KotlinJsCompilerType {
    LEGACY,
    IR,
    BOTH;


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String jsCompilerProperty = "kotlin.js.compiler";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinJsCompilerType$Companion;", "", "()V", "jsCompilerProperty", "", "byArgument", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinJsCompilerType;", "argument", "byArgumentOrNull", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nKotlinJsCompilerType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinJsCompilerType.kt\norg/jetbrains/kotlin/gradle/plugin/KotlinJsCompilerType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,46:1\n1282#2,2:47\n*S KotlinDebug\n*F\n+ 1 KotlinJsCompilerType.kt\norg/jetbrains/kotlin/gradle/plugin/KotlinJsCompilerType$Companion\n*L\n23#1:47,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KotlinJsCompilerType byArgument(@NotNull String argument) {
            argument.getClass();
            KotlinJsCompilerType byArgumentOrNull = byArgumentOrNull(argument);
            if (byArgumentOrNull != null) {
                return byArgumentOrNull;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m(AbstractJsonLexerKt.END_LIST, CollectionsKt.joinToString$default(ArraysKt.toList(KotlinJsCompilerType.values()), null, null, null, null, 63), a$$ExternalSyntheticOutline0.m2m("Unable to find ", argument, " setting. Use [")));
            return null;
        }

        @Nullable
        public final KotlinJsCompilerType byArgumentOrNull(@NotNull String argument) {
            argument.getClass();
            for (KotlinJsCompilerType kotlinJsCompilerType : KotlinJsCompilerType.values()) {
                if (StringsKt.equals(kotlinJsCompilerType.name(), argument, true)) {
                    return kotlinJsCompilerType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
