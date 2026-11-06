package com.fasterxml.jackson.module.kotlin;

import java.util.BitSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinFeature;", "", "enabledByDefault", "", "(Ljava/lang/String;IZ)V", "bitSet", "Ljava/util/BitSet;", "getBitSet$jackson_module_kotlin", "()Ljava/util/BitSet;", "getEnabledByDefault$jackson_module_kotlin", "()Z", "NullToEmptyCollection", "NullToEmptyMap", "NullIsSameAsDefault", "SingletonSupport", "StrictNullChecks", "KotlinPropertyNameAsImplicitName", "UseJavaDurationConversion", "NewStrictNullChecks", "Companion", "jackson-module-kotlin"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KotlinFeature {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KotlinFeature[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final BitSet bitSet = InternalCommonsKt.toBitSet(1 << ordinal());
    private final boolean enabledByDefault;
    public static final KotlinFeature NullToEmptyCollection = new KotlinFeature("NullToEmptyCollection", 0, false);
    public static final KotlinFeature NullToEmptyMap = new KotlinFeature("NullToEmptyMap", 1, false);
    public static final KotlinFeature NullIsSameAsDefault = new KotlinFeature("NullIsSameAsDefault", 2, false);
    public static final KotlinFeature SingletonSupport = new KotlinFeature("SingletonSupport", 3, false);

    @Deprecated(level = DeprecationLevel.WARNING, message = "This option will be migrated to the new backend in 2.21.", replaceWith = @ReplaceWith(expression = "NewStrictNullChecks", imports = {}))
    public static final KotlinFeature StrictNullChecks = new KotlinFeature("StrictNullChecks", 4, false);
    public static final KotlinFeature KotlinPropertyNameAsImplicitName = new KotlinFeature("KotlinPropertyNameAsImplicitName", 5, false);
    public static final KotlinFeature UseJavaDurationConversion = new KotlinFeature("UseJavaDurationConversion", 6, false);
    public static final KotlinFeature NewStrictNullChecks = new KotlinFeature("NewStrictNullChecks", 7, false);

    private static final /* synthetic */ KotlinFeature[] $values() {
        return new KotlinFeature[]{NullToEmptyCollection, NullToEmptyMap, NullIsSameAsDefault, SingletonSupport, StrictNullChecks, KotlinPropertyNameAsImplicitName, UseJavaDurationConversion, NewStrictNullChecks};
    }

    static {
        KotlinFeature[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private KotlinFeature(String str, int i, boolean z) {
        this.enabledByDefault = z;
    }

    @NotNull
    public static EnumEntries<KotlinFeature> getEntries() {
        return $ENTRIES;
    }

    public static KotlinFeature valueOf(String str) {
        return (KotlinFeature) Enum.valueOf(KotlinFeature.class, str);
    }

    public static KotlinFeature[] values() {
        return (KotlinFeature[]) $VALUES.clone();
    }

    @NotNull
    /* renamed from: getBitSet$jackson_module_kotlin, reason: from getter */
    public final BitSet getBitSet() {
        return this.bitSet;
    }

    /* renamed from: getEnabledByDefault$jackson_module_kotlin, reason: from getter */
    public final boolean getEnabledByDefault() {
        return this.enabledByDefault;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/KotlinFeature$Companion;", "", "()V", "defaults", "Ljava/util/BitSet;", "getDefaults$jackson_module_kotlin", "()Ljava/util/BitSet;", "jackson-module-kotlin"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nKotlinFeature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinFeature.kt\ncom/fasterxml/jackson/module/kotlin/KotlinFeature$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1789#2,2:104\n1791#2:107\n1#3:106\n*S KotlinDebug\n*F\n+ 1 KotlinFeature.kt\ncom/fasterxml/jackson/module/kotlin/KotlinFeature$Companion\n*L\n98#1:104,2\n98#1:107\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BitSet getDefaults$jackson_module_kotlin() {
            EnumEntries<KotlinFeature> entries = KotlinFeature.getEntries();
            BitSet bitSet = new BitSet(32);
            for (KotlinFeature kotlinFeature : entries) {
                if (kotlinFeature.getEnabledByDefault()) {
                    bitSet.or(kotlinFeature.getBitSet());
                }
            }
            return bitSet;
        }

        private Companion() {
        }
    }
}
