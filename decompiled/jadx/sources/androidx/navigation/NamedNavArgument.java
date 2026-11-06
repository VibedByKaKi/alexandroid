package androidx.navigation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u0086\u0002J\t\u0010\f\u001a\u00020\u0005H\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/navigation/NamedNavArgument;", "", "name", "", "argument", "Landroidx/navigation/NavArgument;", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "getArgument", "()Landroidx/navigation/NavArgument;", "getName", "()Ljava/lang/String;", "component1", "component2", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NamedNavArgument {

    @NotNull
    private final NavArgument argument;

    @NotNull
    private final String name;

    public NamedNavArgument(@NotNull String str, @NotNull NavArgument navArgument) {
        str.getClass();
        navArgument.getClass();
        this.name = str;
        this.argument = navArgument;
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final NavArgument getArgument() {
        return this.argument;
    }

    @NotNull
    public final NavArgument getArgument() {
        return this.argument;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
