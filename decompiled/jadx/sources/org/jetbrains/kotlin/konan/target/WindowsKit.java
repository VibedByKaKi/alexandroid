package org.jetbrains.kotlin.konan.target;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/WindowsKit;", "", "()V", "compilerFlags", "", "", "CustomPath", "DefaultPath", "Lorg/jetbrains/kotlin/konan/target/WindowsKit$CustomPath;", "Lorg/jetbrains/kotlin/konan/target/WindowsKit$DefaultPath;", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public abstract class WindowsKit {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/WindowsKit$CustomPath;", "Lorg/jetbrains/kotlin/konan/target/WindowsKit;", "includeDirectories", "", "Ljava/nio/file/Path;", "libraryDirectories", "(Ljava/util/List;Ljava/util/List;)V", "compilerFlags", "", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension({"SMAP\nWindows.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Windows.kt\norg/jetbrains/kotlin/konan/target/WindowsKit$CustomPath\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n1360#2:120\n1446#2,5:121\n1360#2:126\n1446#2,5:127\n*S KotlinDebug\n*F\n+ 1 Windows.kt\norg/jetbrains/kotlin/konan/target/WindowsKit$CustomPath\n*L\n110#1:120\n110#1:121,5\n111#1:126\n111#1:127,5\n*E\n"})
    public static final class CustomPath extends WindowsKit {

        @NotNull
        private final List<Path> includeDirectories;

        @NotNull
        private final List<Path> libraryDirectories;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CustomPath(@NotNull List<? extends Path> list, @NotNull List<? extends Path> list2) {
            super(null);
            list.getClass();
            list2.getClass();
            this.includeDirectories = list;
            this.libraryDirectories = list2;
        }

        @Override // org.jetbrains.kotlin.konan.target.WindowsKit
        @NotNull
        public List<String> compilerFlags() {
            List<Path> list = this.includeDirectories;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, CollectionsKt.listOf((Object[]) new String[]{"-isystem", ((Path) it2.next()).toAbsolutePath().toString()}));
            }
            List<Path> list2 = this.libraryDirectories;
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, CollectionsKt.listOf((Object[]) new String[]{"-L", ((Path) it3.next()).toAbsolutePath().toString()}));
            }
            return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/WindowsKit$DefaultPath;", "Lorg/jetbrains/kotlin/konan/target/WindowsKit;", "()V", "compilerFlags", "", "", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DefaultPath extends WindowsKit {

        @NotNull
        public static final DefaultPath INSTANCE = new DefaultPath();

        private DefaultPath() {
            super(null);
        }

        @Override // org.jetbrains.kotlin.konan.target.WindowsKit
        @NotNull
        public List<String> compilerFlags() {
            return CollectionsKt.emptyList();
        }
    }

    public /* synthetic */ WindowsKit(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract List<String> compilerFlags();

    private WindowsKit() {
    }
}
