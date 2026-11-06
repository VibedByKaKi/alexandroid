package com.amazon.dee.app.services.toolbar;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012J\u0006\u0010\u0013\u001a\u00020\u0007J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/amazon/dee/app/services/toolbar/VisibilityOptions;", "", "builder", "Lcom/amazon/dee/app/services/toolbar/VisibilityOptions$Builder;", "<init>", "(Lcom/amazon/dee/app/services/toolbar/VisibilityOptions$Builder;)V", "rootRoutesOnly", "", "Ljava/lang/Boolean;", "blacklist", "", "", "[Ljava/lang/String;", "whitelist", "getRootRoutesOnly", "()Ljava/lang/Boolean;", "hasBlacklist", "getBlacklist", "", "hasWhitelist", "getWhitelist", "Builder", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VisibilityOptions {

    @Nullable
    private String[] blacklist;

    @Nullable
    private Boolean rootRoutesOnly;

    @Nullable
    private String[] whitelist;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0019\u0010\u0017\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u0018J\u0006\u0010\u001a\u001a\u00020\u001bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/amazon/dee/app/services/toolbar/VisibilityOptions$Builder;", "", "<init>", "()V", "rootRoutesOnly", "", "getRootRoutesOnly$impl", "()Ljava/lang/Boolean;", "setRootRoutesOnly$impl", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "blacklist", "", "", "getBlacklist$impl", "()[Ljava/lang/String;", "setBlacklist$impl", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "whitelist", "getWhitelist$impl", "setWhitelist$impl", "withRootRoutesOnly", "withBlacklist", "([Ljava/lang/String;)Lcom/amazon/dee/app/services/toolbar/VisibilityOptions$Builder;", "withWhitelist", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/dee/app/services/toolbar/VisibilityOptions;", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private String[] blacklist;

        @Nullable
        private Boolean rootRoutesOnly;

        @Nullable
        private String[] whitelist;

        @NotNull
        public final VisibilityOptions build() {
            return new VisibilityOptions(this, null);
        }

        @Nullable
        /* renamed from: getBlacklist$impl, reason: from getter */
        public final String[] getBlacklist() {
            return this.blacklist;
        }

        @Nullable
        /* renamed from: getRootRoutesOnly$impl, reason: from getter */
        public final Boolean getRootRoutesOnly() {
            return this.rootRoutesOnly;
        }

        @Nullable
        /* renamed from: getWhitelist$impl, reason: from getter */
        public final String[] getWhitelist() {
            return this.whitelist;
        }

        public final void setBlacklist$impl(@Nullable String[] strArr) {
            this.blacklist = strArr;
        }

        public final void setRootRoutesOnly$impl(@Nullable Boolean bool) {
            this.rootRoutesOnly = bool;
        }

        public final void setWhitelist$impl(@Nullable String[] strArr) {
            this.whitelist = strArr;
        }

        @NotNull
        public final Builder withBlacklist(@NotNull String[] blacklist) {
            blacklist.getClass();
            this.blacklist = blacklist;
            return this;
        }

        @NotNull
        public final Builder withRootRoutesOnly(boolean rootRoutesOnly) {
            this.rootRoutesOnly = Boolean.valueOf(rootRoutesOnly);
            return this;
        }

        @NotNull
        public final Builder withWhitelist(@NotNull String[] whitelist) {
            whitelist.getClass();
            this.whitelist = whitelist;
            return this;
        }
    }

    private VisibilityOptions(Builder builder) {
        this.rootRoutesOnly = builder.getRootRoutesOnly();
        this.blacklist = builder.getBlacklist();
        this.whitelist = builder.getWhitelist();
    }

    @NotNull
    public final Iterable<String> getBlacklist() {
        List asList;
        String[] strArr = this.blacklist;
        return (strArr == null || (asList = ArraysKt.asList(strArr)) == null) ? CollectionsKt.emptyList() : asList;
    }

    @Nullable
    public final Boolean getRootRoutesOnly() {
        return this.rootRoutesOnly;
    }

    @NotNull
    public final Iterable<String> getWhitelist() {
        List asList;
        String[] strArr = this.whitelist;
        return (strArr == null || (asList = ArraysKt.asList(strArr)) == null) ? CollectionsKt.emptyList() : asList;
    }

    public final boolean hasBlacklist() {
        return this.blacklist != null;
    }

    public final boolean hasWhitelist() {
        return this.whitelist != null;
    }

    public /* synthetic */ VisibilityOptions(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
