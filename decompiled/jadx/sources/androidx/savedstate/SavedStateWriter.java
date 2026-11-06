package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020(¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\b\"\b\b\u0000\u0010/*\u0002002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u0002H/¢\u0006\u0004\b1\u00102J'\u00103\u001a\u00020\b\"\b\b\u0000\u0010/*\u0002042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u0002H/¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u000208¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020<¢\u0006\u0004\b=\u0010>J\u001d\u0010?\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b@\u0010AJ#\u0010B\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020$0C¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00180C¢\u0006\u0004\bG\u0010EJ'\u0010H\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040C¢\u0006\u0004\bI\u0010EJ#\u0010J\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0C¢\u0006\u0004\bK\u0010EJ-\u0010L\u001a\u00020\b\"\b\b\u0000\u0010/*\u0002002\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H/0C¢\u0006\u0004\bM\u0010EJ\u001d\u0010N\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020O¢\u0006\u0004\bP\u0010QJ\u001d\u0010R\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020S¢\u0006\u0004\bT\u0010UJ#\u0010V\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00180W¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020[¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020_¢\u0006\u0004\b`\u0010aJ\u001d\u0010b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020c¢\u0006\u0004\bd\u0010eJ\u001d\u0010f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020g¢\u0006\u0004\bh\u0010iJ'\u0010j\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040W¢\u0006\u0004\bk\u0010lJ#\u0010m\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0W¢\u0006\u0004\bn\u0010oJ-\u0010p\u001a\u00020\b\"\b\b\u0000\u0010/*\u0002002\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H/0W¢\u0006\u0004\bq\u0010rJ-\u0010s\u001a\u00020\b\"\b\b\u0000\u0010/*\u0002002\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H/0t¢\u0006\u0004\bu\u0010vJ!\u0010w\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\bx\u0010yJ\u0019\u0010z\u001a\u00020\b2\n\u0010{\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b|\u0010}J\u0015\u0010~\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u007f\u0010-J\u0010\u0010\u0080\u0001\u001a\u00020\b¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001e\u0010\u0083\u0001\u001a\u00020\u00102\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0013\u0010\u0087\u0001\u001a\u00020$HÖ\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0013\u0010\u008a\u0001\u001a\u00020\nHÖ\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u008d\u0001"}, d2 = {"Landroidx/savedstate/SavedStateWriter;", "", "source", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "constructor-impl", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "putBinder", "", "key", "", "value", "Landroid/os/IBinder;", "putBinder-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/IBinder;)V", "putBoolean", "", "putBoolean-impl", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "putChar", "", "putChar-impl", "(Landroid/os/Bundle;Ljava/lang/String;C)V", "putCharSequence", "", "putCharSequence-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/CharSequence;)V", "putDouble", "", "putDouble-impl", "(Landroid/os/Bundle;Ljava/lang/String;D)V", "putFloat", "", "putFloat-impl", "(Landroid/os/Bundle;Ljava/lang/String;F)V", "putInt", "", "putInt-impl", "(Landroid/os/Bundle;Ljava/lang/String;I)V", "putLong", "", "putLong-impl", "(Landroid/os/Bundle;Ljava/lang/String;J)V", "putNull", "putNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)V", "putParcelable", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "putParcelable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Parcelable;)V", "putJavaSerializable", "Ljava/io/Serializable;", "putJavaSerializable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "putSize", "Landroid/util/Size;", "putSize-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V", "putSizeF", "Landroid/util/SizeF;", "putSizeF-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V", "putString", "putString-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "putIntList", "", "putIntList-impl", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "putCharSequenceList", "putCharSequenceList-impl", "putSavedStateList", "putSavedStateList-impl", "putStringList", "putStringList-impl", "putParcelableList", "putParcelableList-impl", "putBooleanArray", "", "putBooleanArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Z)V", "putCharArray", "", "putCharArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[C)V", "putCharSequenceArray", "", "putCharSequenceArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/CharSequence;)V", "putDoubleArray", "", "putDoubleArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[D)V", "putFloatArray", "", "putFloatArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[F)V", "putIntArray", "", "putIntArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[I)V", "putLongArray", "", "putLongArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[J)V", "putSavedStateArray", "putSavedStateArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Bundle;)V", "putStringArray", "putStringArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/lang/String;)V", "putParcelableArray", "putParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "putSparseParcelableArray", "Landroid/util/SparseArray;", "putSparseParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SparseArray;)V", "putSavedState", "putSavedState-impl", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V", "putAll", "from", "putAll-impl", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", BulkOperationType.remove, "remove-impl", MetricsConstants.Method.CACHE_CLEAR, "clear-impl", "(Landroid/os/Bundle;)V", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "equals-impl", "(Landroid/os/Bundle;Ljava/lang/Object;)Z", "hashCode", "hashCode-impl", "(Landroid/os/Bundle;)I", "toString", "toString-impl", "(Landroid/os/Bundle;)Ljava/lang/String;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes14.dex */
public final class SavedStateWriter {

    @NotNull
    private final Bundle source;

    @PublishedApi
    private /* synthetic */ SavedStateWriter(Bundle bundle) {
        this.source = bundle;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateWriter m8198boximpl(Bundle bundle) {
        return new SavedStateWriter(bundle);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m8199clearimpl(Bundle bundle) {
        bundle.clear();
    }

    @PublishedApi
    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m8200constructorimpl(@NotNull Bundle bundle) {
        bundle.getClass();
        return bundle;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8201equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateWriter) && Intrinsics.areEqual(bundle, ((SavedStateWriter) obj).getSource());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8202equalsimpl0(Bundle bundle, Bundle bundle2) {
        return Intrinsics.areEqual(bundle, bundle2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8203hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* renamed from: putAll-impl, reason: not valid java name */
    public static final void m8204putAllimpl(Bundle bundle, @NotNull Bundle bundle2) {
        bundle2.getClass();
        bundle.putAll(bundle2);
    }

    /* renamed from: putBinder-impl, reason: not valid java name */
    public static final void m8205putBinderimpl(Bundle bundle, @NotNull String str, @NotNull IBinder iBinder) {
        str.getClass();
        iBinder.getClass();
        bundle.putBinder(str, iBinder);
    }

    /* renamed from: putBoolean-impl, reason: not valid java name */
    public static final void m8206putBooleanimpl(Bundle bundle, @NotNull String str, boolean z) {
        str.getClass();
        bundle.putBoolean(str, z);
    }

    /* renamed from: putBooleanArray-impl, reason: not valid java name */
    public static final void m8207putBooleanArrayimpl(Bundle bundle, @NotNull String str, @NotNull boolean[] zArr) {
        str.getClass();
        zArr.getClass();
        bundle.putBooleanArray(str, zArr);
    }

    /* renamed from: putChar-impl, reason: not valid java name */
    public static final void m8208putCharimpl(Bundle bundle, @NotNull String str, char c) {
        str.getClass();
        bundle.putChar(str, c);
    }

    /* renamed from: putCharArray-impl, reason: not valid java name */
    public static final void m8209putCharArrayimpl(Bundle bundle, @NotNull String str, @NotNull char[] cArr) {
        str.getClass();
        cArr.getClass();
        bundle.putCharArray(str, cArr);
    }

    /* renamed from: putCharSequence-impl, reason: not valid java name */
    public static final void m8210putCharSequenceimpl(Bundle bundle, @NotNull String str, @NotNull CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        bundle.putCharSequence(str, charSequence);
    }

    /* renamed from: putCharSequenceArray-impl, reason: not valid java name */
    public static final void m8211putCharSequenceArrayimpl(Bundle bundle, @NotNull String str, @NotNull CharSequence[] charSequenceArr) {
        str.getClass();
        charSequenceArr.getClass();
        bundle.putCharSequenceArray(str, charSequenceArr);
    }

    /* renamed from: putCharSequenceList-impl, reason: not valid java name */
    public static final void m8212putCharSequenceListimpl(Bundle bundle, @NotNull String str, @NotNull List<? extends CharSequence> list) {
        str.getClass();
        list.getClass();
        bundle.putCharSequenceArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* renamed from: putDouble-impl, reason: not valid java name */
    public static final void m8213putDoubleimpl(Bundle bundle, @NotNull String str, double d) {
        str.getClass();
        bundle.putDouble(str, d);
    }

    /* renamed from: putDoubleArray-impl, reason: not valid java name */
    public static final void m8214putDoubleArrayimpl(Bundle bundle, @NotNull String str, @NotNull double[] dArr) {
        str.getClass();
        dArr.getClass();
        bundle.putDoubleArray(str, dArr);
    }

    /* renamed from: putFloat-impl, reason: not valid java name */
    public static final void m8215putFloatimpl(Bundle bundle, @NotNull String str, float f) {
        str.getClass();
        bundle.putFloat(str, f);
    }

    /* renamed from: putFloatArray-impl, reason: not valid java name */
    public static final void m8216putFloatArrayimpl(Bundle bundle, @NotNull String str, @NotNull float[] fArr) {
        str.getClass();
        fArr.getClass();
        bundle.putFloatArray(str, fArr);
    }

    /* renamed from: putInt-impl, reason: not valid java name */
    public static final void m8217putIntimpl(Bundle bundle, @NotNull String str, int i) {
        str.getClass();
        bundle.putInt(str, i);
    }

    /* renamed from: putIntArray-impl, reason: not valid java name */
    public static final void m8218putIntArrayimpl(Bundle bundle, @NotNull String str, @NotNull int[] iArr) {
        str.getClass();
        iArr.getClass();
        bundle.putIntArray(str, iArr);
    }

    /* renamed from: putIntList-impl, reason: not valid java name */
    public static final void m8219putIntListimpl(Bundle bundle, @NotNull String str, @NotNull List<Integer> list) {
        str.getClass();
        list.getClass();
        bundle.putIntegerArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* renamed from: putJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> void m8220putJavaSerializableimpl(Bundle bundle, @NotNull String str, @NotNull T t) {
        str.getClass();
        t.getClass();
        bundle.putSerializable(str, t);
    }

    /* renamed from: putLong-impl, reason: not valid java name */
    public static final void m8221putLongimpl(Bundle bundle, @NotNull String str, long j) {
        str.getClass();
        bundle.putLong(str, j);
    }

    /* renamed from: putLongArray-impl, reason: not valid java name */
    public static final void m8222putLongArrayimpl(Bundle bundle, @NotNull String str, @NotNull long[] jArr) {
        str.getClass();
        jArr.getClass();
        bundle.putLongArray(str, jArr);
    }

    /* renamed from: putNull-impl, reason: not valid java name */
    public static final void m8223putNullimpl(Bundle bundle, @NotNull String str) {
        str.getClass();
        bundle.putString(str, null);
    }

    /* renamed from: putParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m8224putParcelableimpl(Bundle bundle, @NotNull String str, @NotNull T t) {
        str.getClass();
        t.getClass();
        bundle.putParcelable(str, t);
    }

    /* renamed from: putParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m8225putParcelableArrayimpl(Bundle bundle, @NotNull String str, @NotNull T[] tArr) {
        str.getClass();
        tArr.getClass();
        bundle.putParcelableArray(str, tArr);
    }

    /* renamed from: putParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m8226putParcelableListimpl(Bundle bundle, @NotNull String str, @NotNull List<? extends T> list) {
        str.getClass();
        list.getClass();
        bundle.putParcelableArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* renamed from: putSavedState-impl, reason: not valid java name */
    public static final void m8227putSavedStateimpl(Bundle bundle, @NotNull String str, @NotNull Bundle bundle2) {
        str.getClass();
        bundle2.getClass();
        bundle.putBundle(str, bundle2);
    }

    /* renamed from: putSavedStateArray-impl, reason: not valid java name */
    public static final void m8228putSavedStateArrayimpl(Bundle bundle, @NotNull String str, @NotNull Bundle[] bundleArr) {
        str.getClass();
        bundleArr.getClass();
        m8225putParcelableArrayimpl(bundle, str, bundleArr);
    }

    /* renamed from: putSavedStateList-impl, reason: not valid java name */
    public static final void m8229putSavedStateListimpl(Bundle bundle, @NotNull String str, @NotNull List<Bundle> list) {
        str.getClass();
        list.getClass();
        m8226putParcelableListimpl(bundle, str, list);
    }

    /* renamed from: putSize-impl, reason: not valid java name */
    public static final void m8230putSizeimpl(Bundle bundle, @NotNull String str, @NotNull Size size) {
        str.getClass();
        size.getClass();
        bundle.putSize(str, size);
    }

    /* renamed from: putSizeF-impl, reason: not valid java name */
    public static final void m8231putSizeFimpl(Bundle bundle, @NotNull String str, @NotNull SizeF sizeF) {
        str.getClass();
        sizeF.getClass();
        bundle.putSizeF(str, sizeF);
    }

    /* renamed from: putSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> void m8232putSparseParcelableArrayimpl(Bundle bundle, @NotNull String str, @NotNull SparseArray<T> sparseArray) {
        str.getClass();
        sparseArray.getClass();
        bundle.putSparseParcelableArray(str, sparseArray);
    }

    /* renamed from: putString-impl, reason: not valid java name */
    public static final void m8233putStringimpl(Bundle bundle, @NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        bundle.putString(str, str2);
    }

    /* renamed from: putStringArray-impl, reason: not valid java name */
    public static final void m8234putStringArrayimpl(Bundle bundle, @NotNull String str, @NotNull String[] strArr) {
        str.getClass();
        strArr.getClass();
        bundle.putStringArray(str, strArr);
    }

    /* renamed from: putStringList-impl, reason: not valid java name */
    public static final void m8235putStringListimpl(Bundle bundle, @NotNull String str, @NotNull List<String> list) {
        str.getClass();
        list.getClass();
        bundle.putStringArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final void m8236removeimpl(Bundle bundle, @NotNull String str) {
        str.getClass();
        bundle.remove(str);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8237toStringimpl(Bundle bundle) {
        return "SavedStateWriter(source=" + bundle + ')';
    }

    public boolean equals(Object obj) {
        return m8201equalsimpl(this.source, obj);
    }

    public int hashCode() {
        return m8203hashCodeimpl(this.source);
    }

    public String toString() {
        return m8237toStringimpl(this.source);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Bundle getSource() {
        return this.source;
    }
}
