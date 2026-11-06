package androidx.compose.ui.graphics;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.auth.BuildConfig;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.dee.app.metrics.MetricsConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087@\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086\n¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\tH\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001d¢\u0006\u0004\b\u001b\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0010¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0010¢\u0006\u0004\b+\u0010)J\u0015\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020\u0000¢\u0006\u0004\b.\u0010\"J\u0015\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\t¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00102\u0006\u00100\u001a\u00020\t¢\u0006\u0004\b4\u00102J\u0015\u00105\u001a\u00020\u00102\u0006\u00100\u001a\u00020\t¢\u0006\u0004\b6\u00102J+\u00107\u001a\u00020\u00102\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\t¢\u0006\u0004\b;\u0010<J+\u0010=\u001a\u00020\u00102\b\b\u0002\u00108\u001a\u00020\t2\b\b\u0002\u00109\u001a\u00020\t2\b\b\u0002\u0010:\u001a\u00020\t¢\u0006\u0004\b>\u0010<J{\u0010?\u001a\u00020\u00102\b\b\u0002\u0010@\u001a\u00020\t2\b\b\u0002\u0010A\u001a\u00020\t2\b\b\u0002\u0010B\u001a\u00020\t2\b\b\u0002\u0010C\u001a\u00020\t2\b\b\u0002\u0010D\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020\t2\b\b\u0002\u0010F\u001a\u00020\t2\b\b\u0002\u0010G\u001a\u00020\t2\b\b\u0002\u0010H\u001a\u00020\t2\b\b\u0002\u0010I\u001a\u00020\t2\b\b\u0002\u0010J\u001a\u00020\t¢\u0006\u0004\bK\u0010LJ\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006R"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", MetricsConstants.Method.CACHE_GET, "", "row", "", "column", "get-impl", "([FII)F", "set", "", "v", "set-impl", "([FIIF)V", BuildConfig.FLAVOR_authType, "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "Landroidx/compose/ui/geometry/Rect;", "rect", "map-impl", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/MutableRect;", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "timesAssign", "m", "timesAssign-58bKbWc", "([F[F)V", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "invert", "invert-impl", "([F)V", "reset", "reset-impl", "setFrom", "matrix", "setFrom-58bKbWc", "rotateX", "degrees", "rotateX-impl", "([FF)V", "rotateY", "rotateY-impl", "rotateZ", "rotateZ-impl", ModelTransformer.KEY_BATTERY_SCALE, "x", "y", "z", "scale-impl", "([FFFF)V", "translate", "translate-impl", "resetToPivotedTransform", "pivotX", "pivotY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "scaleZ", "resetToPivotedTransform-impl", "([FFFFFFFFFFFF)V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "Companion", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 Matrix.kt\nandroidx/compose/ui/graphics/MatrixKt\n*L\n1#1,681:1\n49#1:682\n49#1:683\n49#1:684\n49#1:685\n49#1:686\n49#1:687\n49#1:688\n49#1:689\n49#1:690\n49#1:702\n49#1:703\n49#1:704\n49#1:705\n49#1:706\n49#1:707\n49#1:708\n49#1:709\n49#1:710\n49#1:719\n49#1:720\n49#1:721\n49#1:722\n49#1:723\n49#1:724\n49#1:725\n49#1:726\n49#1:727\n49#1:737\n49#1:742\n49#1:747\n49#1:752\n49#1:757\n49#1:762\n49#1:767\n49#1:772\n49#1:777\n49#1:782\n49#1:787\n49#1:792\n49#1:797\n49#1:802\n49#1:807\n49#1:812\n49#1:816\n49#1:817\n49#1:818\n49#1:819\n49#1:820\n49#1:821\n49#1:822\n49#1:823\n49#1:824\n49#1:825\n49#1:826\n49#1:827\n49#1:828\n49#1:829\n49#1:830\n49#1:831\n49#1:832\n49#1:833\n49#1:834\n49#1:835\n52#1,2:836\n52#1,2:838\n52#1,2:840\n52#1,2:842\n52#1,2:844\n52#1,2:846\n52#1,2:848\n52#1,2:850\n52#1,2:852\n52#1,2:854\n52#1,2:856\n52#1,2:858\n52#1,2:860\n52#1,2:862\n52#1,2:864\n52#1,2:866\n49#1:868\n49#1:869\n49#1:870\n49#1:871\n49#1:872\n49#1:873\n49#1:874\n49#1:875\n52#1,2:876\n52#1,2:878\n52#1,2:880\n52#1,2:882\n52#1,2:884\n52#1,2:886\n52#1,2:888\n52#1,2:890\n49#1:892\n49#1:893\n49#1:894\n49#1:895\n49#1:896\n49#1:897\n49#1:898\n49#1:899\n52#1,2:900\n52#1,2:902\n52#1,2:904\n52#1,2:906\n52#1,2:908\n52#1,2:910\n52#1,2:912\n52#1,2:914\n49#1:916\n49#1:917\n49#1:918\n49#1:919\n49#1:920\n49#1:921\n49#1:922\n49#1:923\n52#1,2:924\n52#1,2:926\n52#1,2:928\n52#1,2:930\n52#1,2:932\n52#1,2:934\n52#1,2:936\n52#1,2:938\n49#1,5:940\n49#1,5:945\n49#1,5:950\n49#1,5:955\n49#1,5:960\n49#1,5:965\n49#1,5:970\n49#1,5:975\n49#1,5:980\n49#1,5:985\n49#1,5:990\n49#1,5:995\n49#1:1000\n49#1:1001\n49#1:1002\n49#1:1003\n52#1,2:1004\n52#1,2:1006\n52#1,2:1008\n52#1,2:1010\n52#1,2:1012\n52#1,2:1014\n52#1,2:1016\n52#1,2:1018\n52#1,2:1020\n52#1,2:1022\n52#1,2:1024\n52#1,2:1026\n52#1,2:1028\n52#1,2:1030\n52#1,2:1032\n52#1,2:1034\n52#1,2:1036\n52#1,2:1038\n52#1,2:1040\n52#1,2:1042\n65#2:691\n69#2:694\n60#3:692\n70#3:695\n53#3,3:699\n22#4:693\n22#4:696\n139#5:697\n139#5:711\n139#5:712\n139#5:713\n139#5:714\n46#5:715\n46#5:716\n56#5:717\n56#5:718\n139#5:728\n139#5:729\n139#5:730\n139#5:731\n46#5:732\n46#5:733\n56#5:734\n56#5:735\n30#6:698\n653#7:736\n654#7,3:738\n653#7:741\n654#7,3:743\n653#7:746\n654#7,3:748\n653#7:751\n654#7,3:753\n653#7:756\n654#7,3:758\n653#7:761\n654#7,3:763\n653#7:766\n654#7,3:768\n653#7:771\n654#7,3:773\n653#7:776\n654#7,3:778\n653#7:781\n654#7,3:783\n653#7:786\n654#7,3:788\n653#7:791\n654#7,3:793\n653#7:796\n654#7,3:798\n653#7:801\n654#7,3:803\n653#7:806\n654#7,3:808\n653#7:811\n654#7,3:813\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n60#1:682\n61#1:683\n62#1:684\n63#1:685\n64#1:686\n65#1:687\n66#1:688\n67#1:689\n68#1:690\n84#1:702\n85#1:703\n86#1:704\n87#1:705\n88#1:706\n89#1:707\n90#1:708\n91#1:709\n92#1:710\n140#1:719\n141#1:720\n142#1:721\n143#1:722\n144#1:723\n145#1:724\n146#1:725\n147#1:726\n148#1:727\n196#1:737\n197#1:742\n198#1:747\n199#1:752\n200#1:757\n201#1:762\n202#1:767\n203#1:772\n204#1:777\n205#1:782\n206#1:787\n207#1:792\n208#1:797\n209#1:802\n210#1:807\n211#1:812\n233#1:816\n234#1:817\n235#1:818\n236#1:819\n246#1:820\n247#1:821\n248#1:822\n249#1:823\n250#1:824\n251#1:825\n252#1:826\n253#1:827\n254#1:828\n255#1:829\n256#1:830\n257#1:831\n258#1:832\n259#1:833\n260#1:834\n261#1:835\n282#1:836,2\n283#1:838,2\n284#1:840,2\n285#1:842,2\n286#1:844,2\n287#1:846,2\n288#1:848,2\n289#1:850,2\n290#1:852,2\n291#1:854,2\n292#1:856,2\n293#1:858,2\n294#1:860,2\n295#1:862,2\n296#1:864,2\n297#1:866,2\n359#1:868\n360#1:869\n364#1:870\n365#1:871\n369#1:872\n370#1:873\n374#1:874\n375#1:875\n379#1:876,2\n380#1:878,2\n381#1:880,2\n382#1:882,2\n383#1:884,2\n384#1:886,2\n385#1:888,2\n386#1:890,2\n398#1:892\n399#1:893\n403#1:894\n404#1:895\n408#1:896\n409#1:897\n413#1:898\n414#1:899\n418#1:900,2\n419#1:902,2\n420#1:904,2\n421#1:906,2\n422#1:908,2\n423#1:910,2\n424#1:912,2\n425#1:914,2\n437#1:916\n438#1:917\n442#1:918\n443#1:919\n447#1:920\n448#1:921\n452#1:922\n453#1:923\n457#1:924,2\n458#1:926,2\n459#1:928,2\n460#1:930,2\n461#1:932,2\n462#1:934,2\n463#1:936,2\n464#1:938,2\n471#1:940,5\n472#1:945,5\n473#1:950,5\n474#1:955,5\n475#1:960,5\n476#1:965,5\n477#1:970,5\n478#1:975,5\n479#1:980,5\n480#1:985,5\n481#1:990,5\n482#1:995,5\n489#1:1000\n490#1:1001\n491#1:1002\n492#1:1003\n493#1:1004,2\n494#1:1006,2\n495#1:1008,2\n496#1:1010,2\n598#1:1012,2\n599#1:1014,2\n600#1:1016,2\n601#1:1018,2\n602#1:1020,2\n603#1:1022,2\n604#1:1024,2\n605#1:1026,2\n606#1:1028,2\n607#1:1030,2\n608#1:1032,2\n609#1:1034,2\n610#1:1036,2\n611#1:1038,2\n612#1:1040,2\n613#1:1042,2\n70#1:691\n71#1:694\n70#1:692\n71#1:695\n76#1:699,3\n70#1:693\n71#1:696\n74#1:697\n102#1:711\n109#1:712\n116#1:713\n123#1:714\n128#1:715\n129#1:716\n130#1:717\n131#1:718\n158#1:728\n165#1:729\n172#1:730\n179#1:731\n183#1:732\n184#1:733\n185#1:734\n186#1:735\n76#1:698\n196#1:736\n196#1:738,3\n197#1:741\n197#1:743,3\n198#1:746\n198#1:748,3\n199#1:751\n199#1:753,3\n200#1:756\n200#1:758,3\n201#1:761\n201#1:763,3\n202#1:766\n202#1:768,3\n203#1:771\n203#1:773,3\n204#1:776\n204#1:778,3\n205#1:781\n205#1:783,3\n206#1:786\n206#1:788,3\n207#1:791\n207#1:793,3\n208#1:796\n208#1:798,3\n209#1:801\n209#1:803,3\n210#1:806\n210#1:808,3\n211#1:811\n211#1:813,3\n*E\n"})
/* loaded from: classes13.dex */
public final class Matrix {
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;

    @NotNull
    private final float[] values;

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m4884boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m4886constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m4885constructorimpl(fArr);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4887equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).m4909unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4888equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m4889getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 4) + i2];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4890hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* renamed from: invert-impl, reason: not valid java name */
    public static final void m4891invertimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 == 0.0f) {
            return;
        }
        float f30 = 1.0f / f29;
        fArr[0] = DoubleList$$ExternalSyntheticOutline0.m(f8, f26, (f6 * f28) - (f7 * f27), f30);
        fArr[1] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f4, f26, (f3 * f27) + ((-f2) * f28), f30);
        fArr[2] = DoubleList$$ExternalSyntheticOutline0.m(f16, f20, (f14 * f22) - (f15 * f21), f30);
        fArr[3] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f12, f20, (f11 * f21) + ((-f10) * f22), f30);
        float f31 = -f5;
        fArr[4] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f8, f24, (f7 * f25) + (f31 * f28), f30);
        fArr[5] = DoubleList$$ExternalSyntheticOutline0.m(f4, f24, (f28 * f) - (f3 * f25), f30);
        float f32 = -f13;
        fArr[6] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f16, f18, (f15 * f19) + (f32 * f22), f30);
        fArr[7] = DoubleList$$ExternalSyntheticOutline0.m(f12, f18, (f9 * f22) - (f11 * f19), f30);
        fArr[8] = DoubleList$$ExternalSyntheticOutline0.m(f8, f23, (f5 * f27) - (f6 * f25), f30);
        fArr[9] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f4, f23, (f25 * f2) + ((-f) * f27), f30);
        fArr[10] = DoubleList$$ExternalSyntheticOutline0.m(f16, f17, (f13 * f21) - (f14 * f19), f30);
        fArr[11] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f12, f17, (f19 * f10) + ((-f9) * f21), f30);
        fArr[12] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f7, f23, (f6 * f24) + (f31 * f26), f30);
        fArr[13] = DoubleList$$ExternalSyntheticOutline0.m(f3, f23, (f * f26) - (f2 * f24), f30);
        fArr[14] = AppLaunchChecker$$ExternalSyntheticOutline0.m(f15, f17, (f14 * f18) + (f32 * f20), f30);
        fArr[15] = DoubleList$$ExternalSyntheticOutline0.m(f11, f17, (f9 * f20) - (f10 * f18), f30);
    }

    /* renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m4892mapMKHz9U(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f10 = 1 / (((f6 * intBitsToFloat2) + (f3 * intBitsToFloat)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = 0.0f;
        }
        float f11 = ((f5 * intBitsToFloat2) + (f2 * intBitsToFloat) + f8) * f10;
        return Offset.m4392constructorimpl((Float.floatToRawIntBits((((f4 * intBitsToFloat2) + (f * intBitsToFloat)) + f7) * f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
    }

    /* renamed from: map-impl, reason: not valid java name */
    public static final void m4894mapimpl(float[] fArr, @NotNull MutableRect mutableRect) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float left = mutableRect.getLeft();
        float top = mutableRect.getTop();
        float right = mutableRect.getRight();
        float bottom = mutableRect.getBottom();
        float f10 = f3 * left;
        float f11 = f6 * top;
        float f12 = 1.0f / ((f10 + f11) + f9);
        if ((Float.floatToRawIntBits(f12) & Integer.MAX_VALUE) >= 2139095040) {
            f12 = 0.0f;
        }
        float f13 = f * left;
        float f14 = f4 * top;
        float f15 = (f13 + f14 + f7) * f12;
        float f16 = left * f2;
        float f17 = top * f5;
        float f18 = (f16 + f17 + f8) * f12;
        float f19 = f6 * bottom;
        float f20 = 1.0f / ((f10 + f19) + f9);
        if ((Float.floatToRawIntBits(f20) & Integer.MAX_VALUE) >= 2139095040) {
            f20 = 0.0f;
        }
        float f21 = f4 * bottom;
        float f22 = (f13 + f21 + f7) * f20;
        float f23 = f5 * bottom;
        float f24 = (f16 + f23 + f8) * f20;
        float f25 = f3 * right;
        float f26 = 1.0f / ((f11 + f25) + f9);
        if ((Float.floatToRawIntBits(f26) & Integer.MAX_VALUE) >= 2139095040) {
            f26 = 0.0f;
        }
        float f27 = f * right;
        float f28 = (f27 + f14 + f7) * f26;
        float f29 = right * f2;
        float f30 = (f17 + f29 + f8) * f26;
        float f31 = 1.0f / ((f25 + f19) + f9);
        float f32 = (Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) < 2139095040 ? f31 : 0.0f;
        float f33 = (f27 + f21 + f7) * f32;
        float f34 = (f29 + f23 + f8) * f32;
        mutableRect.setLeft(Math.min(f15, Math.min(f22, Math.min(f28, f33))));
        mutableRect.setTop(Math.min(f18, Math.min(f24, Math.min(f30, f34))));
        mutableRect.setRight(Math.max(f15, Math.max(f22, Math.max(f28, f33))));
        mutableRect.setBottom(Math.max(f18, Math.max(f24, Math.max(f30, f34))));
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m4895resetimpl(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl, reason: not valid java name */
    public static final void m4896resetToPivotedTransformimpl(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        double d = f6 * 0.017453292519943295d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f12 = -sin;
        float f13 = (f4 * cos) - (f5 * sin);
        float f14 = (f5 * cos) + (f4 * sin);
        double d2 = f7 * 0.017453292519943295d;
        float sin2 = (float) Math.sin(d2);
        float cos2 = (float) Math.cos(d2);
        float f15 = -sin2;
        float f16 = sin * sin2;
        float f17 = sin * cos2;
        float f18 = cos * sin2;
        float f19 = cos * cos2;
        float f20 = (f14 * sin2) + (f3 * cos2);
        float f21 = (f14 * cos2) + ((-f3) * sin2);
        double d3 = f8 * 0.017453292519943295d;
        float sin3 = (float) Math.sin(d3);
        float cos3 = (float) Math.cos(d3);
        float f22 = -sin3;
        float f23 = (cos3 * f16) + (f22 * cos2);
        float f24 = ((f16 * sin3) + (cos2 * cos3)) * f9;
        float f25 = sin3 * cos * f9;
        float f26 = ((sin3 * f17) + (cos3 * f15)) * f9;
        float f27 = f23 * f10;
        float f28 = cos * cos3 * f10;
        float f29 = ((cos3 * f17) + (f22 * f15)) * f10;
        float f30 = f18 * f11;
        float f31 = f12 * f11;
        float f32 = f19 * f11;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f24;
        fArr[1] = f25;
        fArr[2] = f26;
        fArr[3] = 0.0f;
        fArr[4] = f27;
        fArr[5] = f28;
        fArr[6] = f29;
        fArr[7] = 0.0f;
        fArr[8] = f30;
        fArr[9] = f31;
        fArr[10] = f32;
        fArr[11] = 0.0f;
        float f33 = -f;
        fArr[12] = ((f24 * f33) - (f27 * f2)) + f20 + f;
        fArr[13] = ((f25 * f33) - (f28 * f2)) + f13 + f2;
        fArr[14] = ((f33 * f26) - (f2 * f29)) + f21;
        fArr[15] = 1.0f;
    }

    /* renamed from: resetToPivotedTransform-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4897resetToPivotedTransformimpl$default(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 16) != 0) {
            f5 = 0.0f;
        }
        if ((i & 32) != 0) {
            f6 = 0.0f;
        }
        if ((i & 64) != 0) {
            f7 = 0.0f;
        }
        if ((i & 128) != 0) {
            f8 = 0.0f;
        }
        if ((i & 256) != 0) {
            f9 = 1.0f;
        }
        if ((i & 512) != 0) {
            f10 = 1.0f;
        }
        if ((i & 1024) != 0) {
            f11 = 1.0f;
        }
        m4896resetToPivotedTransformimpl(fArr, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
    }

    /* renamed from: rotateX-impl, reason: not valid java name */
    public static final void m4898rotateXimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = f * 0.017453292519943295d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * cos) - (f3 * sin);
        fArr[2] = (f3 * cos) + (f2 * sin);
        fArr[5] = (f4 * cos) - (f5 * sin);
        fArr[6] = (f5 * cos) + (f4 * sin);
        fArr[9] = (f6 * cos) - (f7 * sin);
        fArr[10] = (f7 * cos) + (f6 * sin);
        fArr[13] = (f8 * cos) - (f9 * sin);
        fArr[14] = (f9 * cos) + (f8 * sin);
    }

    /* renamed from: rotateY-impl, reason: not valid java name */
    public static final void m4899rotateYimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = f * 0.017453292519943295d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[8];
        float f7 = fArr[10];
        float f8 = fArr[12];
        float f9 = fArr[14];
        fArr[0] = (f3 * sin) + (f2 * cos);
        fArr[2] = (f3 * cos) + ((-f2) * sin);
        fArr[4] = (f5 * sin) + (f4 * cos);
        fArr[6] = (f5 * cos) + ((-f4) * sin);
        fArr[8] = (f7 * sin) + (f6 * cos);
        fArr[10] = (f7 * cos) + ((-f6) * sin);
        fArr[12] = (f9 * sin) + (f8 * cos);
        fArr[14] = (f9 * cos) + ((-f8) * sin);
    }

    /* renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m4900rotateZimpl(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = f * 0.017453292519943295d;
        float sin = (float) Math.sin(d);
        float cos = (float) Math.cos(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = (sin * f3) + (cos * f2);
        float f5 = -sin;
        float f6 = fArr[1];
        float f7 = fArr[5];
        float f8 = (sin * f7) + (cos * f6);
        float f9 = fArr[2];
        float f10 = fArr[6];
        float f11 = (sin * f10) + (cos * f9);
        float f12 = fArr[3];
        float f13 = fArr[7];
        fArr[0] = f4;
        fArr[1] = f8;
        fArr[2] = f11;
        fArr[3] = (sin * f13) + (cos * f12);
        fArr[4] = (f3 * cos) + (f2 * f5);
        fArr[5] = (f7 * cos) + (f6 * f5);
        fArr[6] = (f10 * cos) + (f9 * f5);
        fArr[7] = (cos * f13) + (f5 * f12);
    }

    /* renamed from: scale-impl, reason: not valid java name */
    public static final void m4901scaleimpl(float[] fArr, float f, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4902scaleimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        m4901scaleimpl(fArr, f, f2, f3);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m4903setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 4) + i2] = f;
    }

    /* renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m4904setFrom58bKbWc(float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            fArr[3] = fArr2[3];
            fArr[4] = fArr2[4];
            fArr[5] = fArr2[5];
            fArr[6] = fArr2[6];
            fArr[7] = fArr2[7];
            fArr[8] = fArr2[8];
            fArr[9] = fArr2[9];
            fArr[10] = fArr2[10];
            fArr[11] = fArr2[11];
            fArr[12] = fArr2[12];
            fArr[13] = fArr2[13];
            fArr[14] = fArr2[14];
            fArr[15] = fArr2[15];
        }
    }

    /* renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m4905timesAssign58bKbWc(float[] fArr, @NotNull float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[1];
            float f4 = fArr2[4];
            float f5 = fArr[2];
            float f6 = fArr2[8];
            float f7 = f5 * f6;
            float f8 = fArr[3];
            float f9 = fArr2[12];
            float f10 = f8 * f9;
            float f11 = f10 + f7 + (f3 * f4) + (f * f2);
            float f12 = fArr2[1];
            float f13 = fArr2[5];
            float f14 = fArr2[9];
            float f15 = f5 * f14;
            float f16 = fArr2[13];
            float f17 = f8 * f16;
            float f18 = f17 + f15 + (f3 * f13) + (f * f12);
            float f19 = fArr2[2];
            float f20 = fArr2[6];
            float f21 = fArr2[10];
            float f22 = f5 * f21;
            float f23 = fArr2[14];
            float f24 = f8 * f23;
            float f25 = f24 + f22 + (f3 * f20) + (f * f19);
            float f26 = fArr2[3];
            float f27 = fArr2[7];
            float f28 = fArr2[11];
            float f29 = f5 * f28;
            float f30 = fArr2[15];
            float f31 = f8 * f30;
            float f32 = f31 + f29 + (f3 * f27) + (f * f26);
            float f33 = fArr[4];
            float f34 = fArr[5];
            float f35 = fArr[6];
            float f36 = (f35 * f6) + (f34 * f4) + (f33 * f2);
            float f37 = fArr[7];
            float f38 = (f37 * f9) + f36;
            float f39 = (f37 * f16) + (f35 * f14) + (f34 * f13) + (f33 * f12);
            float f40 = (f37 * f23) + (f35 * f21) + (f34 * f20) + (f33 * f19);
            float f41 = f35 * f28;
            float f42 = f37 * f30;
            float f43 = f42 + f41 + (f34 * f27) + (f33 * f26);
            float f44 = fArr[8];
            float f45 = fArr[9];
            float f46 = fArr[10];
            float f47 = (f46 * f6) + (f45 * f4) + (f44 * f2);
            float f48 = fArr[11];
            float f49 = (f48 * f9) + f47;
            float f50 = (f48 * f16) + (f46 * f14) + (f45 * f13) + (f44 * f12);
            float f51 = (f48 * f23) + (f46 * f21) + (f45 * f20) + (f44 * f19);
            float f52 = f46 * f28;
            float f53 = f48 * f30;
            float f54 = f53 + f52 + (f45 * f27) + (f44 * f26);
            float f55 = fArr[12];
            float f56 = fArr[13];
            float f57 = (f4 * f56) + (f2 * f55);
            float f58 = fArr[14];
            float f59 = (f6 * f58) + f57;
            float f60 = fArr[15];
            float f61 = (f9 * f60) + f59;
            float f62 = f14 * f58;
            float f63 = f16 * f60;
            float f64 = f63 + f62 + (f13 * f56) + (f12 * f55);
            float f65 = f21 * f58;
            float f66 = f23 * f60;
            float f67 = f66 + f65 + (f20 * f56) + (f19 * f55);
            float f68 = f58 * f28;
            float f69 = f60 * f30;
            fArr[0] = f11;
            fArr[1] = f18;
            fArr[2] = f25;
            fArr[3] = f32;
            fArr[4] = f38;
            fArr[5] = f39;
            fArr[6] = f40;
            fArr[7] = f43;
            fArr[8] = f49;
            fArr[9] = f50;
            fArr[10] = f51;
            fArr[11] = f54;
            fArr[12] = f61;
            fArr[13] = f64;
            fArr[14] = f67;
            fArr[15] = f69 + f68 + (f56 * f27) + (f55 * f26);
        }
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4906toStringimpl(float[] fArr) {
        return StringsKt.trimIndent("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    /* renamed from: translate-impl, reason: not valid java name */
    public static final void m4907translateimpl(float[] fArr, float f, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        float f4 = (fArr[8] * f3) + (fArr[4] * f2) + (fArr[0] * f) + fArr[12];
        float f5 = (fArr[9] * f3) + (fArr[5] * f2) + (fArr[1] * f) + fArr[13];
        float f6 = (fArr[10] * f3) + (fArr[6] * f2) + (fArr[2] * f) + fArr[14];
        float f7 = (fArr[11] * f3) + (fArr[7] * f2) + (fArr[3] * f) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    /* renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m4908translateimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m4907translateimpl(fArr, f, f2, f3);
    }

    public boolean equals(Object other) {
        return m4887equalsimpl(this.values, other);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m4890hashCodeimpl(this.values);
    }

    @NotNull
    public String toString() {
        return m4906toStringimpl(this.values);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m4909unboximpl() {
        return this.values;
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m4885constructorimpl(@NotNull float[] fArr) {
        return fArr;
    }

    @NotNull
    /* renamed from: map-impl, reason: not valid java name */
    public static final Rect m4893mapimpl(float[] fArr, @NotNull Rect rect) {
        if (fArr.length < 16) {
            return rect;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        float f10 = f3 * left;
        float f11 = f6 * top;
        float f12 = 1.0f / ((f10 + f11) + f9);
        if ((Float.floatToRawIntBits(f12) & Integer.MAX_VALUE) >= 2139095040) {
            f12 = 0.0f;
        }
        float f13 = f * left;
        float f14 = f4 * top;
        float f15 = (f13 + f14 + f7) * f12;
        float f16 = left * f2;
        float f17 = top * f5;
        float f18 = f12 * (f16 + f17 + f8);
        float f19 = f6 * bottom;
        float f20 = 1.0f / ((f10 + f19) + f9);
        if ((Float.floatToRawIntBits(f20) & Integer.MAX_VALUE) >= 2139095040) {
            f20 = 0.0f;
        }
        float f21 = f4 * bottom;
        float f22 = (f13 + f21 + f7) * f20;
        float f23 = f5 * bottom;
        float f24 = (f16 + f23 + f8) * f20;
        float f25 = f3 * right;
        float f26 = 1.0f / ((f11 + f25) + f9);
        if ((Float.floatToRawIntBits(f26) & Integer.MAX_VALUE) >= 2139095040) {
            f26 = 0.0f;
        }
        float f27 = f * right;
        float f28 = (f27 + f14 + f7) * f26;
        float f29 = right * f2;
        float f30 = (f17 + f29 + f8) * f26;
        float f31 = 1.0f / ((f25 + f19) + f9);
        float f32 = (Float.floatToRawIntBits(f31) & Integer.MAX_VALUE) < 2139095040 ? f31 : 0.0f;
        float f33 = (f27 + f21 + f7) * f32;
        float f34 = (f29 + f23 + f8) * f32;
        return new Rect(Math.min(f15, Math.min(f22, Math.min(f28, f33))), Math.min(f18, Math.min(f24, Math.min(f30, f34))), Math.max(f15, Math.max(f22, Math.max(f28, f33))), Math.max(f18, Math.max(f24, Math.max(f30, f34))));
    }
}
