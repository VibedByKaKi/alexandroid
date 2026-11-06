package kotlinx.metadata.internal.metadata.deserialization;

import com.dee.app.metrics.MetricsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlinx.metadata.internal.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lkotlinx/metadata/internal/metadata/deserialization/TypeTable;", "", "typeTable", "Lkotlinx/metadata/internal/metadata/ProtoBuf$TypeTable;", "(Lorg/jetbrains/kotlin/metadata/ProtoBuf$TypeTable;)V", "types", "", "Lkotlinx/metadata/internal/metadata/ProtoBuf$Type;", "getTypes", "()Ljava/util/List;", MetricsConstants.Method.CACHE_GET, "index", "", "metadata"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class TypeTable {

    @NotNull
    private final List<ProtoBuf.Type> types;

    public TypeTable(@NotNull ProtoBuf.TypeTable typeTable) {
        typeTable.getClass();
        List<ProtoBuf.Type> typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            List<ProtoBuf.Type> typeList2 = typeTable.getTypeList();
            typeList2.getClass();
            List<ProtoBuf.Type> list = typeList2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ProtoBuf.Type type = (ProtoBuf.Type) obj;
                if (i >= firstNullable) {
                    type = type.toBuilder().setNullable(true).build();
                }
                arrayList.add(type);
                i = i2;
            }
            typeList = arrayList;
        }
        typeList.getClass();
        this.types = typeList;
    }

    @NotNull
    public final ProtoBuf.Type get(int index) {
        return this.types.get(index);
    }

    @NotNull
    public final List<ProtoBuf.Type> getTypes() {
        return this.types;
    }
}
