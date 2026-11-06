package com.amazon.comms.calling.foundation;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.blueprints.BlueprintsEndpointConstants;
import com.amazon.dee.app.storage.BobDispatchEndpointContentProvider;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/foundation/Stage;", "", "arcusEquivalentStage", "", "arcusConfigId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getArcusEquivalentStage", "()Ljava/lang/String;", "getArcusConfigId", BobDispatchEndpointContentProvider.PROD, "PROD_QA", BobDispatchEndpointContentProvider.PREPROD, BobDispatchEndpointContentProvider.GAMMA, "BETA", "ALPHA", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class Stage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Stage[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String arcusConfigId;

    @NotNull
    private final String arcusEquivalentStage;
    public static final Stage PROD = new Stage(BobDispatchEndpointContentProvider.PROD, 0, "prod", null, 2, null);
    public static final Stage PROD_QA = new Stage("PROD_QA", 1, "prod", "arn:aws:remote-config:us-west-2:412793207129:appConfig:azq8123c");
    public static final Stage PREPROD = new Stage(BobDispatchEndpointContentProvider.PREPROD, 2, "prod", null, 2, null);
    public static final Stage GAMMA = new Stage(BobDispatchEndpointContentProvider.GAMMA, 3, "gamma", null, 2, null);
    public static final Stage BETA = new Stage("BETA", 4, "beta", null, 2, null);
    public static final Stage ALPHA = new Stage("ALPHA", 5, "alpha", null, 2, null);

    private static final /* synthetic */ Stage[] $values() {
        return new Stage[]{PROD, PROD_QA, PREPROD, GAMMA, BETA, ALPHA};
    }

    static {
        Stage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ Stage(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? "arn:aws:remote-config:us-west-2:412793207129:appConfig:ayuw5hfh" : str3);
    }

    @NotNull
    public static EnumEntries<Stage> getEntries() {
        return $ENTRIES;
    }

    public static Stage valueOf(String str) {
        return (Stage) Enum.valueOf(Stage.class, str);
    }

    public static Stage[] values() {
        return (Stage[]) $VALUES.clone();
    }

    @NotNull
    public final String getArcusConfigId() {
        return this.arcusConfigId;
    }

    @NotNull
    public final String getArcusEquivalentStage() {
        return this.arcusEquivalentStage;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/foundation/Stage$Companion;", "", "<init>", "()V", "toStage", "Lcom/amazon/comms/calling/foundation/Stage;", "stage", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final Stage toStage(@Nullable String stage) {
            if (stage == null) {
                return Stage.PROD;
            }
            Locale locale = Locale.ROOT;
            String m = TableInfo$$ExternalSyntheticOutline0.m(locale, stage, locale);
            switch (m.hashCode()) {
                case -979814489:
                    if (m.equals("prodqa")) {
                        return Stage.PROD_QA;
                    }
                    break;
                case -318354310:
                    if (m.equals(BlueprintsEndpointConstants.PREPROD)) {
                        return Stage.PREPROD;
                    }
                    break;
                case -309494792:
                    if (m.equals("prod_qa")) {
                        return Stage.PROD_QA;
                    }
                    break;
                case 3020272:
                    if (m.equals("beta")) {
                        return Stage.BETA;
                    }
                    break;
                case 92909918:
                    if (m.equals("alpha")) {
                        return Stage.ALPHA;
                    }
                    break;
                case 98120615:
                    if (m.equals("gamma")) {
                        return Stage.GAMMA;
                    }
                    break;
            }
            return Stage.PROD;
        }

        private Companion() {
        }
    }

    private Stage(String str, int i, String str2, String str3) {
        this.arcusEquivalentStage = str2;
        this.arcusConfigId = str3;
    }
}
