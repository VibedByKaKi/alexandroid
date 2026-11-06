package androidx.room.migration.bundle;

import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u00052\b\u0010\b\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\tJ6\u0010\u0003\u001a\u00020\u0004\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u000bJH\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\r\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/room/migration/bundle/SchemaEqualityUtil;", "", "()V", "checkSchemaEquality", "", "K", "Landroidx/room/migration/bundle/SchemaEquality;", "item1", "item2", "(Landroidx/room/migration/bundle/SchemaEquality;Landroidx/room/migration/bundle/SchemaEquality;)Z", "list1", "", "list2", ExifInterface.GPS_DIRECTION_TRUE, "map1", "", "map2", "room-migration"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@SourceDebugExtension({"SMAP\nSchemaEqualityUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaEqualityUtil.kt\nandroidx/room/migration/bundle/SchemaEqualityUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1726#2,3:70\n1726#2,2:73\n1747#2,3:75\n1728#2:78\n*S KotlinDebug\n*F\n+ 1 SchemaEqualityUtil.kt\nandroidx/room/migration/bundle/SchemaEqualityUtil\n*L\n35#1:70,3\n49#1:73,2\n50#1:75,3\n49#1:78\n*E\n"})
/* loaded from: classes14.dex */
public final class SchemaEqualityUtil {

    @NotNull
    public static final SchemaEqualityUtil INSTANCE = new SchemaEqualityUtil();

    private SchemaEqualityUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K extends SchemaEquality<K>> boolean checkSchemaEquality(@Nullable List<? extends K> list1, @Nullable List<? extends K> list2) {
        if (list1 == null) {
            return list2 == null;
        }
        if (list2 == null || list1.size() != list2.size()) {
            return false;
        }
        List<? extends K> list = list1;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            SchemaEquality schemaEquality = (SchemaEquality) it2.next();
            List<? extends K> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (INSTANCE.checkSchemaEquality(schemaEquality, (SchemaEquality) it3.next())) {
                        break;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T, K extends SchemaEquality<K>> boolean checkSchemaEquality(@Nullable Map<T, ? extends K> map1, @Nullable Map<T, ? extends K> map2) {
        if (map1 == null) {
            return map2 == null;
        }
        if (map2 == null || map1.size() != map2.size()) {
            return false;
        }
        Set<Map.Entry<T, ? extends K>> entrySet = map1.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!INSTANCE.checkSchemaEquality((SchemaEquality) entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final <K extends SchemaEquality<K>> boolean checkSchemaEquality(@Nullable K item1, @Nullable K item2) {
        if (item1 == null) {
            return item2 == null;
        }
        if (item2 == null) {
            return false;
        }
        return item1.isSchemaEqual(item2);
    }
}
