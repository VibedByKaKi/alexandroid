package expo.modules.kotlin.classcomponent;

import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", "", "name", "", "constructor", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "objectDefinition", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "isSharedRef", "", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/functions/SyncFunctionComponent;Lexpo/modules/kotlin/objects/ObjectDefinitionData;Z)V", "getName", "()Ljava/lang/String;", "getConstructor", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getObjectDefinition", "()Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "()Z", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ClassDefinitionData {

    @NotNull
    private final SyncFunctionComponent constructor;
    private final boolean isSharedRef;

    @NotNull
    private final String name;

    @NotNull
    private final ObjectDefinitionData objectDefinition;

    public ClassDefinitionData(@NotNull String str, @NotNull SyncFunctionComponent syncFunctionComponent, @NotNull ObjectDefinitionData objectDefinitionData, boolean z) {
        str.getClass();
        syncFunctionComponent.getClass();
        objectDefinitionData.getClass();
        this.name = str;
        this.constructor = syncFunctionComponent;
        this.objectDefinition = objectDefinitionData;
        this.isSharedRef = z;
    }

    @NotNull
    public final SyncFunctionComponent getConstructor() {
        return this.constructor;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ObjectDefinitionData getObjectDefinition() {
        return this.objectDefinition;
    }

    /* renamed from: isSharedRef, reason: from getter */
    public final boolean getIsSharedRef() {
        return this.isSharedRef;
    }
}
