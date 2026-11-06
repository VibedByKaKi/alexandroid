package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class FrameworkSQLiteDatabase$$ExternalSyntheticLambda1 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ FrameworkSQLiteDatabase$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteCursor query$lambda$0;
        Typeface _init_$lambda$0;
        int i = this.$r8$classId;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                query$lambda$0 = FrameworkSQLiteDatabase.query$lambda$0((SupportSQLiteQuery) obj5, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
                return query$lambda$0;
            default:
                _init_$lambda$0 = AndroidParagraphIntrinsics._init_$lambda$0((AndroidParagraphIntrinsics) obj5, (FontFamily) obj, (FontWeight) obj2, (FontStyle) obj3, (FontSynthesis) obj4);
                return _init_$lambda$0;
        }
    }
}
