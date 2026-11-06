package com.amazon.dee.app.services.icon;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/dee/app/services/icon/AppIconAlias;", "", "aliasName", "", "isManifestDefault", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getAliasName", "()Ljava/lang/String;", "()Z", "CLASSIC", "CLONE_CLASSIC", "ALEXA_PLUS", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppIconAlias {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppIconAlias[] $VALUES;

    @NotNull
    private final String aliasName;
    private final boolean isManifestDefault;
    public static final AppIconAlias CLASSIC = new AppIconAlias("CLASSIC", 0, "com.amazon.dee.app.icon_alias.ClassicIconAlias", true);
    public static final AppIconAlias CLONE_CLASSIC = new AppIconAlias("CLONE_CLASSIC", 1, "com.amazon.dee.app.icon_alias.CloneClassicIconAlias", false);
    public static final AppIconAlias ALEXA_PLUS = new AppIconAlias("ALEXA_PLUS", 2, "com.amazon.dee.app.icon_alias.AlexaPlusIconAlias", false);

    private static final /* synthetic */ AppIconAlias[] $values() {
        return new AppIconAlias[]{CLASSIC, CLONE_CLASSIC, ALEXA_PLUS};
    }

    static {
        AppIconAlias[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AppIconAlias(String str, int i, String str2, boolean z) {
        this.aliasName = str2;
        this.isManifestDefault = z;
    }

    @NotNull
    public static EnumEntries<AppIconAlias> getEntries() {
        return $ENTRIES;
    }

    public static AppIconAlias valueOf(String str) {
        return (AppIconAlias) Enum.valueOf(AppIconAlias.class, str);
    }

    public static AppIconAlias[] values() {
        return (AppIconAlias[]) $VALUES.clone();
    }

    @NotNull
    public final String getAliasName() {
        return this.aliasName;
    }

    /* renamed from: isManifestDefault, reason: from getter */
    public final boolean getIsManifestDefault() {
        return this.isManifestDefault;
    }
}
