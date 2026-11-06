package com.amazon.photos.discovery.internal.db;

import android.database.Cursor;
import android.database.CursorWrapper;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/photos/discovery/internal/db/CachedColumnIndexCursorDecorator;", "Landroid/database/CursorWrapper;", "cursor", "Landroid/database/Cursor;", "(Landroid/database/Cursor;)V", "columnIndexCache", "", "", "", "getColumnIndex", "columnName", "getColumnIndexOrThrow", "AndroidPhotosDiscovery_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CachedColumnIndexCursorDecorator extends CursorWrapper {

    @NotNull
    private final Map<String, Integer> columnIndexCache;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedColumnIndexCursorDecorator(@NotNull Cursor cursor) {
        super(cursor);
        cursor.getClass();
        this.columnIndexCache = new HashMap();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public int getColumnIndex(@NotNull String columnName) {
        columnName.getClass();
        if (!this.columnIndexCache.containsKey(columnName)) {
            this.columnIndexCache.put(columnName, Integer.valueOf(super.getColumnIndex(columnName)));
        }
        Integer num = this.columnIndexCache.get(columnName);
        num.getClass();
        return num.intValue();
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public int getColumnIndexOrThrow(@NotNull String columnName) throws IllegalArgumentException {
        columnName.getClass();
        if (!this.columnIndexCache.containsKey(columnName)) {
            this.columnIndexCache.put(columnName, Integer.valueOf(super.getColumnIndexOrThrow(columnName)));
        }
        Integer num = this.columnIndexCache.get(columnName);
        num.getClass();
        return num.intValue();
    }
}
