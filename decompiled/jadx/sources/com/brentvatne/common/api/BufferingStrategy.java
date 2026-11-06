package com.brentvatne.common.api;

import com.brentvatne.common.toolbox.DebugLog;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/brentvatne/common/api/BufferingStrategy;", "", "<init>", "()V", "BufferingStrategyEnum", "Companion", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BufferingStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "BufferingStrategy";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/brentvatne/common/api/BufferingStrategy$BufferingStrategyEnum;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "DisableBuffering", "DependingOnMemory", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BufferingStrategyEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BufferingStrategyEnum[] $VALUES;
        public static final BufferingStrategyEnum Default = new BufferingStrategyEnum("Default", 0);
        public static final BufferingStrategyEnum DisableBuffering = new BufferingStrategyEnum("DisableBuffering", 1);
        public static final BufferingStrategyEnum DependingOnMemory = new BufferingStrategyEnum("DependingOnMemory", 2);

        private static final /* synthetic */ BufferingStrategyEnum[] $values() {
            return new BufferingStrategyEnum[]{Default, DisableBuffering, DependingOnMemory};
        }

        static {
            BufferingStrategyEnum[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private BufferingStrategyEnum(String str, int i) {
        }

        @NotNull
        public static EnumEntries<BufferingStrategyEnum> getEntries() {
            return $ENTRIES;
        }

        public static BufferingStrategyEnum valueOf(String str) {
            return (BufferingStrategyEnum) Enum.valueOf(BufferingStrategyEnum.class, str);
        }

        public static BufferingStrategyEnum[] values() {
            return (BufferingStrategyEnum[]) $VALUES.clone();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/brentvatne/common/api/BufferingStrategy$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "parse", "Lcom/brentvatne/common/api/BufferingStrategy$BufferingStrategyEnum;", "src", "react-native-video_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BufferingStrategyEnum parse(@Nullable String src) {
            if (src == null) {
                return BufferingStrategyEnum.Default;
            }
            try {
                return BufferingStrategyEnum.valueOf(src);
            } catch (Exception unused) {
                DebugLog.e(BufferingStrategy.TAG, "cannot parse buffering strategy ".concat(src));
                return BufferingStrategyEnum.Default;
            }
        }

        private Companion() {
        }
    }
}
