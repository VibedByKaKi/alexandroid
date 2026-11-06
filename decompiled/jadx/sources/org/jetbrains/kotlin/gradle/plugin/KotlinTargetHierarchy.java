package org.jetbrains.kotlin.gradle.plugin;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(message = "Use KotlinSourceSetTree instead")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetHierarchy;", "", "SourceSetTree", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public interface KotlinTargetHierarchy {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetHierarchy$SourceSetTree;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @Deprecated(message = "Use KotlinSourceSetTree instead", replaceWith = @ReplaceWith(expression = "KotlinSourceSetTree", imports = {}))
    public static final class SourceSetTree {

        @NotNull
        private final String name;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final SourceSetTree main = new SourceSetTree("main");

        @NotNull
        private static final SourceSetTree test = new SourceSetTree("test");

        @NotNull
        private static final SourceSetTree unitTest = new SourceSetTree("unitTest");

        @NotNull
        private static final SourceSetTree instrumentedTest = new SourceSetTree("instrumentedTest");

        @NotNull
        private static final SourceSetTree integrationTest = new SourceSetTree("integrationTest");

        public SourceSetTree(@NotNull String str) {
            str.getClass();
            this.name = str;
        }

        public boolean equals(@Nullable Object other) {
            if (other instanceof KotlinSourceSetTree) {
                return Intrinsics.areEqual(this.name, ((KotlinSourceSetTree) other).getName());
            }
            return false;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return this.name;
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetHierarchy$SourceSetTree$Companion;", "", "()V", "instrumentedTest", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetHierarchy$SourceSetTree;", "getInstrumentedTest", "()Lorg/jetbrains/kotlin/gradle/plugin/KotlinTargetHierarchy$SourceSetTree;", "integrationTest", "getIntegrationTest", "main", "getMain", "test", "getTest", "unitTest", "getUnitTest", "kotlin-gradle-plugin-api_common"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final SourceSetTree getInstrumentedTest() {
                return SourceSetTree.instrumentedTest;
            }

            @NotNull
            public final SourceSetTree getIntegrationTest() {
                return SourceSetTree.integrationTest;
            }

            @NotNull
            public final SourceSetTree getMain() {
                return SourceSetTree.main;
            }

            @NotNull
            public final SourceSetTree getTest() {
                return SourceSetTree.test;
            }

            @NotNull
            public final SourceSetTree getUnitTest() {
                return SourceSetTree.unitTest;
            }

            private Companion() {
            }
        }
    }
}
