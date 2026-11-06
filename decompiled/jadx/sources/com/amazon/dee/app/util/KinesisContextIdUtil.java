package com.amazon.dee.app.util;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/dee/app/util/KinesisContextIdUtil;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getValue", "hashCode", "", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "Companion", "util"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KinesisContextIdUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KinesisContextIdUtil EMPTY_ID = new KinesisContextIdUtil("");

    @Nullable
    private final String id;

    public KinesisContextIdUtil(@Nullable String str) {
        this.id = str;
    }

    @JvmStatic
    @NotNull
    public static final synchronized KinesisContextIdUtil getEmptyId() {
        KinesisContextIdUtil emptyId;
        synchronized (KinesisContextIdUtil.class) {
            emptyId = INSTANCE.getEmptyId();
        }
        return emptyId;
    }

    @JvmStatic
    @NotNull
    public static final KinesisContextIdUtil valueOf(@Nullable String str) {
        return INSTANCE.valueOf(str);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(KinesisContextIdUtil.class, other.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.id, ((KinesisContextIdUtil) other).id);
    }

    @Nullable
    /* renamed from: getValue, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        String str = this.id;
        return (str != null ? str.hashCode() : 0) + 31;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/dee/app/util/KinesisContextIdUtil$Companion;", "", "<init>", "()V", "EMPTY_ID", "Lcom/amazon/dee/app/util/KinesisContextIdUtil;", "getEmptyId", "valueOf", "id", "", "util"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final synchronized KinesisContextIdUtil getEmptyId() {
            return KinesisContextIdUtil.EMPTY_ID;
        }

        @JvmStatic
        @NotNull
        public final KinesisContextIdUtil valueOf(@Nullable String id) {
            return (id == null || id.length() == 0) ? getEmptyId() : new KinesisContextIdUtil(id);
        }

        private Companion() {
        }
    }
}
