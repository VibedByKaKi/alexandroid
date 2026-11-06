package com.mapbox.maps;

import android.graphics.Bitmap;
import androidx.annotation.AnyThread;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import com.ReactNativeBlobUtil.ReactNativeBlobUtilConst;
import com.amazon.alexa.accessorykit.ModelTransformer;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Cancelable;
import com.mapbox.geojson.Feature;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0016H\u0017J$\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.H\u0007J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0007J$\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0007J,\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\u0006\u0010/\u001a\u000200H\u0007J.\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0017J&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;2\b\u00107\u001a\u0004\u0018\u000108H\u0017J$\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010=\u001a\u00020>H\u0017J.\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u0017J$\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010=\u001a\u00020AH\u0017JZ\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u00052\u0006\u00101\u001a\u0002022\u0006\u0010/\u001a\u0002002\f\u0010D\u001a\b\u0012\u0004\u0012\u00020E0\u00162\f\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00162\b\u0010G\u001a\u0004\u0018\u00010HH\u0017JV\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0017JV\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0017J&\u0010S\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010T\u001a\u00020;2\b\u0010U\u001a\u0004\u0018\u000108H\u0017J$\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010W\u001a\u00020\u00122\u0006\u0010X\u001a\u00020\u0012H\u0017J$\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0017J\u000e\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u0016H\u0017J\u0010\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0017J\b\u0010_\u001a\u00020\u0012H\u0017J\u0012\u0010`\u001a\u0004\u0018\u0001022\u0006\u0010,\u001a\u00020\u0012H\u0017J8\u0010a\u001a*\u0012\u0004\u0012\u00020\u0012\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020]0Mj\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020]`N0%2\u0006\u0010J\u001a\u00020\u0012H\u0017J$\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020]0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u0012H\u0017J\u001c\u0010c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0%2\u0006\u0010J\u001a\u00020\u0012H\u0017J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0017J\u001c\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0%2\u0006\u00104\u001a\u00020\u0012H\u0017J\u0018\u0010f\u001a\u00020]2\u0006\u00104\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017J\u0018\u0010g\u001a\u00020]2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017J\u000e\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00170jH\u0017J\u0010\u0010k\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0017J\u0010\u0010l\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0007J\u0010\u0010m\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0007J\u001c\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0%2\u0006\u0010'\u001a\u00020\u0012H\u0017J\u0018\u0010o\u001a\u00020]2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017J\u0010\u0010p\u001a\u00020]2\u0006\u0010^\u001a\u00020\u0012H\u0017J\b\u0010q\u001a\u00020rH\u0017J\u0010\u0010s\u001a\u0002002\u0006\u0010,\u001a\u00020\u0012H\u0017J\u0010\u0010t\u001a\u0002002\u0006\u0010W\u001a\u00020\u0012H\u0017J$\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010v\u001a\u00020wH\u0017J$\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010y\u001a\u00020zH\u0017J\u001c\u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002000%2\u0006\u00104\u001a\u00020\u0012H\u0017J\b\u0010|\u001a\u000200H\u0017J&\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\b\u0010O\u001a\u0004\u0018\u00010PH\u0017J&\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\b\u00107\u001a\u0004\u0018\u000108H\u0017J3\u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\r\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0017J\u001d\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010,\u001a\u00020\u0012H\u0017J\u001d\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u0012H\u0017J\u001d\u0010\u0083\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u0012H\u0017J\u001d\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010W\u001a\u00020\u0012H\u0017J\u001d\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u0012H\u0017J\u001d\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u0012H\u0017J%\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010-\u001a\u00020.H\u0017J)\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0017J%\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0017J&\u0010\u0087\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u0012H\u0017J\n\u0010\u008b\u0001\u001a\u00030\u008c\u0001H\u0017J\u001d\u0010\u008d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010\u008e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001d\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010-\u001a\u00020.H\u0017J!\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0017J\u001d\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00101\u001a\u000202H\u0017J\u001e\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0007\u0010\u008a\u0001\u001a\u00020\u0012H\u0017J4\u0010\u0091\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010y\u001a\u00020z2\r\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020*0jH\u0017J-\u0010\u0093\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u000e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u0016H\u0017J/\u0010\u0096\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0017J\u0013\u0010\u0099\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u009a\u0001\u001a\u00020\u0012H\u0017JB\u0010\u009b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122#\u0010\u009c\u0001\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;0Mj\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;`NH\u0017J.\u0010\u009d\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010L\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J%\u0010\u009e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0017J$\u0010\u009f\u0001\u001a\u00030 \u00012\u0006\u00104\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;2\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0017J.\u0010£\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u00104\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J-\u0010¤\u0001\u001a\u00030 \u00012\u0006\u00104\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;2\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0017J.\u0010¥\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010h\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001e\u0010¦\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0007\u0010§\u0001\u001a\u00020;H\u0017J\u001d\u0010¨\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010©\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001d\u0010ª\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0007J&\u0010«\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0007J\u001d\u0010¬\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010\u00ad\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J%\u0010®\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010:\u001a\u00020;H\u0017J.\u0010¯\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J6\u0010¯\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u001d\u0010°\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010:\u001a\u00020;H\u0017J&\u0010±\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010^\u001a\u00020\u00122\u0007\u0010\u008f\u0001\u001a\u00020;H\u0017J\u0013\u0010²\u0001\u001a\u00030\u008c\u00012\u0007\u0010³\u0001\u001a\u00020rH\u0017J\u0011\u0010´\u0001\u001a\u0002002\u0006\u00104\u001a\u00020\u0012H\u0017J\u0011\u0010µ\u0001\u001a\u0002002\u0006\u0010'\u001a\u00020\u0012H\u0017J3\u0010¶\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u0016H\u0017J%\u0010·\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0017JM\u0010¸\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010K\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`NH\u0017JM\u0010¹\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020&0%2\u0006\u0010J\u001a\u00020\u00122\u0006\u0010R\u001a\u00020\u00122&\u0010L\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u00010Mj\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020;\u0018\u0001`NH\u0017R\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168WX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0014¨\u0006º\u0001"}, d2 = {"Lcom/mapbox/maps/MapboxStyleManager;", "", "styleManager", "Lcom/mapbox/maps/StyleManager;", "pixelRatio", "", "mapLoadingErrorDelegate", "Lcom/mapbox/maps/MapLoadingErrorDelegate;", "(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V", "getMapLoadingErrorDelegate", "()Lcom/mapbox/maps/MapLoadingErrorDelegate;", "getPixelRatio", "()F", "styleDefaultCamera", "Lcom/mapbox/maps/CameraOptions;", "getStyleDefaultCamera", "()Lcom/mapbox/maps/CameraOptions;", "styleJSON", "", "getStyleJSON", "()Ljava/lang/String;", "styleLayers", "", "Lcom/mapbox/maps/StyleObjectInfo;", "getStyleLayers", "()Ljava/util/List;", "getStyleManager", "()Lcom/mapbox/maps/StyleManager;", "styleSlots", "getStyleSlots$annotations", "()V", "getStyleSlots", "styleSources", "getStyleSources", "styleURI", "getStyleURI", "addGeoJSONSourceFeatures", "Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "sourceId", "dataId", CamerasRouteParameter.FEATURES, "Lcom/mapbox/geojson/Feature;", "addImage", "imageId", "bitmap", "Landroid/graphics/Bitmap;", "sdf", "", "image", "Lcom/mapbox/maps/Image;", "addPersistentStyleCustomLayer", "layerId", "layerHost", "Lcom/mapbox/maps/CustomLayerHost;", "layerPosition", "Lcom/mapbox/maps/LayerPosition;", "addPersistentStyleLayer", "properties", "Lcom/mapbox/bindgen/Value;", "addStyleCustomGeometrySource", "options", "Lcom/mapbox/maps/CustomGeometrySourceOptions;", "addStyleCustomLayer", "addStyleCustomRasterSource", "Lcom/mapbox/maps/CustomRasterSourceOptions;", "addStyleImage", ModelTransformer.KEY_BATTERY_SCALE, "stretchX", "Lcom/mapbox/maps/ImageStretches;", "stretchY", "content", "Lcom/mapbox/maps/ImageContent;", "addStyleImportFromJSON", "importId", "json", "config", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "importPosition", "Lcom/mapbox/maps/ImportPosition;", "addStyleImportFromURI", "uri", "addStyleLayer", "parameters", "position", "addStyleModel", "modelId", "modelUri", "addStyleSource", "getFeaturesets", "Lcom/mapbox/maps/FeaturesetDescriptor;", "getStyleAtmosphereProperty", "Lcom/mapbox/maps/StylePropertyValue;", "property", "getStyleGlyphURL", "getStyleImage", "getStyleImportConfigProperties", "getStyleImportConfigProperty", "getStyleImportSchema", "getStyleImports", "getStyleLayerProperties", "getStyleLayerProperty", "getStyleLightProperty", "id", "getStyleLights", "", "getStyleProjectionProperty", "getStyleRainProperty", "getStyleSnowProperty", "getStyleSourceProperties", "getStyleSourceProperty", "getStyleTerrainProperty", "getStyleTransition", "Lcom/mapbox/maps/TransitionOptions;", "hasStyleImage", "hasStyleModel", "invalidateStyleCustomGeometrySourceRegion", "coordinateBounds", "Lcom/mapbox/maps/CoordinateBounds;", "invalidateStyleCustomGeometrySourceTile", "tileId", "Lcom/mapbox/maps/CanonicalTileID;", "isStyleLayerPersistent", "isStyleLoaded", "moveStyleImport", "moveStyleLayer", "removeGeoJSONSourceFeatures", "featureIds", "removeStyleImage", "removeStyleImport", "removeStyleLayer", "removeStyleModel", "removeStyleSource", "removeStyleSourceUnchecked", "setImportColorTheme", "colorTheme", "Lcom/mapbox/maps/ColorTheme;", ReactNativeBlobUtilConst.RNFB_RESPONSE_BASE64, "setInitialStyleColorTheme", "", "setStyleAtmosphere", "setStyleAtmosphereProperty", "value", "setStyleColorTheme", "setStyleCustomGeometrySourceTileData", "featureCollection", "setStyleCustomRasterSourceTileData", "tiles", "Lcom/mapbox/maps/CustomRasterSourceTileData;", "setStyleGeoJSONSourceData", "data", "Lcom/mapbox/maps/GeoJSONSourceData;", "setStyleGlyphURL", "url", "setStyleImportConfigProperties", "configs", "setStyleImportConfigProperty", "setStyleLayerProperties", "setStyleLayerPropertiesAsync", "Lcom/mapbox/common/Cancelable;", "callback", "Lcom/mapbox/maps/AsyncOperationResultCallback;", "setStyleLayerProperty", "setStyleLayerPropertyAsync", "setStyleLightProperty", "setStyleLights", "lights", "setStyleProjection", "setStyleProjectionProperty", "setStyleRain", "setStyleRainProperty", "setStyleSnow", "setStyleSnowProperty", "setStyleSourceProperties", "setStyleSourceProperty", "setStyleTerrain", "setStyleTerrainProperty", "setStyleTransition", "transitionOptions", "styleLayerExists", "styleSourceExists", "updateGeoJSONSourceFeatures", "updateStyleImageSourceImage", "updateStyleImportWithJSON", "updateStyleImportWithURI", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public class MapboxStyleManager {

    @NotNull
    private final MapLoadingErrorDelegate mapLoadingErrorDelegate;
    private final float pixelRatio;

    @NotNull
    private final StyleManager styleManager;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MapboxStyleManager(@NotNull StyleManager styleManager, float f, @NotNull MapLoadingErrorDelegate mapLoadingErrorDelegate) {
        styleManager.getClass();
        mapLoadingErrorDelegate.getClass();
        this.styleManager = styleManager;
        this.pixelRatio = f;
        this.mapLoadingErrorDelegate = mapLoadingErrorDelegate;
    }

    @AnyThread
    @CallSuper
    @NotNull
    public Expected<String, None> addGeoJSONSourceFeatures(@NotNull String sourceId, @NotNull String dataId, @NotNull List<Feature> features) {
        ChatData$$ExternalSyntheticOutline0.m(sourceId, dataId, features);
        Expected<String, None> addGeoJSONSourceFeatures = this.styleManager.addGeoJSONSourceFeatures(sourceId, dataId, features);
        addGeoJSONSourceFeatures.getClass();
        return addGeoJSONSourceFeatures;
    }

    @CallSuper
    @MainThread
    @NotNull
    public final Expected<String, None> addImage(@NotNull String imageId, @NotNull Image image, boolean sdf) {
        imageId.getClass();
        image.getClass();
        return addStyleImage(imageId, this.pixelRatio, image, sdf, CollectionsKt.emptyList(), CollectionsKt.emptyList(), null);
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> addPersistentStyleCustomLayer(@NotNull String layerId, @NotNull CustomLayerHost layerHost, @Nullable LayerPosition layerPosition) {
        layerId.getClass();
        layerHost.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addPersistentStyleCustomLayer = this.styleManager.addPersistentStyleCustomLayer(layerId, layerHost, layerPosition);
        addPersistentStyleCustomLayer.getClass();
        return addPersistentStyleCustomLayer;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> addPersistentStyleLayer(@NotNull Value properties, @Nullable LayerPosition layerPosition) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addPersistentStyleLayer = this.styleManager.addPersistentStyleLayer(properties, layerPosition);
        addPersistentStyleLayer.getClass();
        return addPersistentStyleLayer;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> addStyleCustomGeometrySource(@NotNull String sourceId, @NotNull CustomGeometrySourceOptions options) {
        sourceId.getClass();
        options.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleCustomGeometrySource = this.styleManager.addStyleCustomGeometrySource(sourceId, options);
        addStyleCustomGeometrySource.getClass();
        return addStyleCustomGeometrySource;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> addStyleCustomLayer(@NotNull String layerId, @NotNull CustomLayerHost layerHost, @Nullable LayerPosition layerPosition) {
        layerId.getClass();
        layerHost.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleCustomLayer = this.styleManager.addStyleCustomLayer(layerId, layerHost, layerPosition);
        addStyleCustomLayer.getClass();
        return addStyleCustomLayer;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> addStyleCustomRasterSource(@NotNull String sourceId, @NotNull CustomRasterSourceOptions options) {
        sourceId.getClass();
        options.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleCustomRasterSource = this.styleManager.addStyleCustomRasterSource(sourceId, options);
        addStyleCustomRasterSource.getClass();
        return addStyleCustomRasterSource;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> addStyleImage(@NotNull String imageId, float scale, @NotNull Image image, boolean sdf, @NotNull List<ImageStretches> stretchX, @NotNull List<ImageStretches> stretchY, @Nullable ImageContent content) {
        imageId.getClass();
        image.getClass();
        stretchX.getClass();
        stretchY.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleImage = this.styleManager.addStyleImage(imageId, scale, image, sdf, stretchX, stretchY, content);
        addStyleImage.getClass();
        return addStyleImage;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> addStyleImportFromJSON(@NotNull String importId, @NotNull String json, @Nullable HashMap<String, Value> config, @Nullable ImportPosition importPosition) {
        importId.getClass();
        json.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleImportFromJSON = this.styleManager.addStyleImportFromJSON(importId, json, config, importPosition);
        addStyleImportFromJSON.getClass();
        return addStyleImportFromJSON;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> addStyleImportFromURI(@NotNull String importId, @NotNull String uri, @Nullable HashMap<String, Value> config, @Nullable ImportPosition importPosition) {
        importId.getClass();
        uri.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleImportFromURI = this.styleManager.addStyleImportFromURI(importId, uri, config, importPosition);
        addStyleImportFromURI.getClass();
        return addStyleImportFromURI;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> addStyleLayer(@NotNull Value parameters, @Nullable LayerPosition position) {
        parameters.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleLayer = this.styleManager.addStyleLayer(parameters, position);
        addStyleLayer.getClass();
        return addStyleLayer;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> addStyleModel(@NotNull String modelId, @NotNull String modelUri) {
        modelId.getClass();
        modelUri.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleModel = this.styleManager.addStyleModel(modelId, modelUri);
        addStyleModel.getClass();
        return addStyleModel;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> addStyleSource(@NotNull String sourceId, @NotNull Value properties) {
        sourceId.getClass();
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> addStyleSource = this.styleManager.addStyleSource(sourceId, properties);
        addStyleSource.getClass();
        return addStyleSource;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public List<FeaturesetDescriptor> getFeaturesets() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<FeaturesetDescriptor> styleFeaturesets = this.styleManager.getStyleFeaturesets();
        styleFeaturesets.getClass();
        return styleFeaturesets;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public final MapLoadingErrorDelegate getMapLoadingErrorDelegate() {
        return this.mapLoadingErrorDelegate;
    }

    public final float getPixelRatio() {
        return this.pixelRatio;
    }

    @CallSuper
    @MainThread
    @NotNull
    public StylePropertyValue getStyleAtmosphereProperty(@NotNull String property) {
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleAtmosphereProperty = this.styleManager.getStyleAtmosphereProperty(property);
        styleAtmosphereProperty.getClass();
        return styleAtmosphereProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public CameraOptions getStyleDefaultCamera() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        CameraOptions styleDefaultCamera = this.styleManager.getStyleDefaultCamera();
        styleDefaultCamera.getClass();
        return styleDefaultCamera;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public String getStyleGlyphURL() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleGlyphURL = this.styleManager.getStyleGlyphURL();
        styleGlyphURL.getClass();
        return styleGlyphURL;
    }

    @CallSuper
    @MainThread
    @Nullable
    public Image getStyleImage(@NotNull String imageId) {
        imageId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.getStyleImage(imageId);
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, HashMap<String, StylePropertyValue>> getStyleImportConfigProperties(@NotNull String importId) {
        importId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, HashMap<String, StylePropertyValue>> styleImportConfigProperties = this.styleManager.getStyleImportConfigProperties(importId);
        styleImportConfigProperties.getClass();
        return styleImportConfigProperties;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, StylePropertyValue> getStyleImportConfigProperty(@NotNull String importId, @NotNull String config) {
        importId.getClass();
        config.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, StylePropertyValue> styleImportConfigProperty = this.styleManager.getStyleImportConfigProperty(importId, config);
        styleImportConfigProperty.getClass();
        return styleImportConfigProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, Value> getStyleImportSchema(@NotNull String importId) {
        importId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleImportSchema = this.styleManager.getStyleImportSchema(importId);
        styleImportSchema.getClass();
        return styleImportSchema;
    }

    @CallSuper
    @MainThread
    @NotNull
    public List<StyleObjectInfo> getStyleImports() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleImports = this.styleManager.getStyleImports();
        styleImports.getClass();
        return styleImports;
    }

    @CallSuper
    @MainThread
    @NotNull
    public String getStyleJSON() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleJSON = this.styleManager.getStyleJSON();
        styleJSON.getClass();
        return styleJSON;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, Value> getStyleLayerProperties(@NotNull String layerId) {
        layerId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleLayerProperties = this.styleManager.getStyleLayerProperties(layerId);
        styleLayerProperties.getClass();
        return styleLayerProperties;
    }

    @CallSuper
    @MainThread
    @NotNull
    public StylePropertyValue getStyleLayerProperty(@NotNull String layerId, @NotNull String property) {
        layerId.getClass();
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleLayerProperty = this.styleManager.getStyleLayerProperty(layerId, property);
        styleLayerProperty.getClass();
        return styleLayerProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public List<StyleObjectInfo> getStyleLayers() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleLayers = this.styleManager.getStyleLayers();
        styleLayers.getClass();
        return styleLayers;
    }

    @CallSuper
    @MainThread
    @NotNull
    public StylePropertyValue getStyleLightProperty(@NotNull String id, @NotNull String property) {
        id.getClass();
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleLightProperty = this.styleManager.getStyleLightProperty(id, property);
        styleLightProperty.getClass();
        return styleLightProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public List<StyleObjectInfo> getStyleLights() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleLights = this.styleManager.getStyleLights();
        styleLights.getClass();
        return styleLights;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public final StyleManager getStyleManager() {
        return this.styleManager;
    }

    @CallSuper
    @MainThread
    @NotNull
    public StylePropertyValue getStyleProjectionProperty(@NotNull String property) {
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleProjectionProperty = this.styleManager.getStyleProjectionProperty(property);
        styleProjectionProperty.getClass();
        return styleProjectionProperty;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public final StylePropertyValue getStyleRainProperty(@NotNull String property) {
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleRainProperty = this.styleManager.getStyleRainProperty(property);
        styleRainProperty.getClass();
        return styleRainProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public List<String> getStyleSlots() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<String> styleSlots = this.styleManager.getStyleSlots();
        styleSlots.getClass();
        return styleSlots;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public final StylePropertyValue getStyleSnowProperty(@NotNull String property) {
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleSnowProperty = this.styleManager.getStyleSnowProperty(property);
        styleSnowProperty.getClass();
        return styleSnowProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, Value> getStyleSourceProperties(@NotNull String sourceId) {
        sourceId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Value> styleSourceProperties = this.styleManager.getStyleSourceProperties(sourceId);
        styleSourceProperties.getClass();
        return styleSourceProperties;
    }

    @CallSuper
    @MainThread
    @NotNull
    public StylePropertyValue getStyleSourceProperty(@NotNull String sourceId, @NotNull String property) {
        sourceId.getClass();
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleSourceProperty = this.styleManager.getStyleSourceProperty(sourceId, property);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public List<StyleObjectInfo> getStyleSources() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        List<StyleObjectInfo> styleSources = this.styleManager.getStyleSources();
        styleSources.getClass();
        return styleSources;
    }

    @CallSuper
    @MainThread
    @NotNull
    public StylePropertyValue getStyleTerrainProperty(@NotNull String property) {
        property.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        StylePropertyValue styleTerrainProperty = this.styleManager.getStyleTerrainProperty(property);
        styleTerrainProperty.getClass();
        return styleTerrainProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public TransitionOptions getStyleTransition() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        TransitionOptions styleTransition = this.styleManager.getStyleTransition();
        styleTransition.getClass();
        return styleTransition;
    }

    @CallSuper
    @MainThread
    @NotNull
    public String getStyleURI() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        String styleURI = this.styleManager.getStyleURI();
        styleURI.getClass();
        return styleURI;
    }

    @CallSuper
    @MainThread
    public boolean hasStyleImage(@NotNull String imageId) {
        imageId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.hasStyleImage(imageId);
    }

    @CallSuper
    @MainThread
    @MapboxExperimental
    public boolean hasStyleModel(@NotNull String modelId) {
        modelId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.hasStyleModel(modelId);
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> invalidateStyleCustomGeometrySourceRegion(@NotNull String sourceId, @NotNull CoordinateBounds coordinateBounds) {
        sourceId.getClass();
        coordinateBounds.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> invalidateStyleCustomGeometrySourceRegion = this.styleManager.invalidateStyleCustomGeometrySourceRegion(sourceId, coordinateBounds);
        invalidateStyleCustomGeometrySourceRegion.getClass();
        return invalidateStyleCustomGeometrySourceRegion;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> invalidateStyleCustomGeometrySourceTile(@NotNull String sourceId, @NotNull CanonicalTileID tileId) {
        sourceId.getClass();
        tileId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> invalidateStyleCustomGeometrySourceTile = this.styleManager.invalidateStyleCustomGeometrySourceTile(sourceId, tileId);
        invalidateStyleCustomGeometrySourceTile.getClass();
        return invalidateStyleCustomGeometrySourceTile;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, Boolean> isStyleLayerPersistent(@NotNull String layerId) {
        layerId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, Boolean> isStyleLayerPersistent = this.styleManager.isStyleLayerPersistent(layerId);
        isStyleLayerPersistent.getClass();
        return isStyleLayerPersistent;
    }

    @CallSuper
    @MainThread
    public boolean isStyleLoaded() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.isStyleLoaded();
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> moveStyleImport(@NotNull String importId, @Nullable ImportPosition importPosition) {
        importId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> moveStyleImport = this.styleManager.moveStyleImport(importId, importPosition);
        moveStyleImport.getClass();
        return moveStyleImport;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> moveStyleLayer(@NotNull String layerId, @Nullable LayerPosition layerPosition) {
        layerId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> moveStyleLayer = this.styleManager.moveStyleLayer(layerId, layerPosition);
        moveStyleLayer.getClass();
        return moveStyleLayer;
    }

    @AnyThread
    @CallSuper
    @NotNull
    public Expected<String, None> removeGeoJSONSourceFeatures(@NotNull String sourceId, @NotNull String dataId, @NotNull List<String> featureIds) {
        ChatData$$ExternalSyntheticOutline0.m(sourceId, dataId, featureIds);
        Expected<String, None> removeGeoJSONSourceFeatures = this.styleManager.removeGeoJSONSourceFeatures(sourceId, dataId, featureIds);
        removeGeoJSONSourceFeatures.getClass();
        return removeGeoJSONSourceFeatures;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> removeStyleImage(@NotNull String imageId) {
        imageId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleImage = this.styleManager.removeStyleImage(imageId);
        removeStyleImage.getClass();
        return removeStyleImage;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> removeStyleImport(@NotNull String importId) {
        importId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleImport = this.styleManager.removeStyleImport(importId);
        removeStyleImport.getClass();
        return removeStyleImport;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> removeStyleLayer(@NotNull String layerId) {
        layerId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleLayer = this.styleManager.removeStyleLayer(layerId);
        removeStyleLayer.getClass();
        return removeStyleLayer;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> removeStyleModel(@NotNull String modelId) {
        modelId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleModel = this.styleManager.removeStyleModel(modelId);
        removeStyleModel.getClass();
        return removeStyleModel;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> removeStyleSource(@NotNull String sourceId) {
        sourceId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleSource = this.styleManager.removeStyleSource(sourceId);
        removeStyleSource.getClass();
        return removeStyleSource;
    }

    @CallSuper
    @NotNull
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Expected<String, None> removeStyleSourceUnchecked(@NotNull String sourceId) {
        sourceId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> removeStyleSourceUnchecked = this.styleManager.removeStyleSourceUnchecked(sourceId);
        removeStyleSourceUnchecked.getClass();
        return removeStyleSourceUnchecked;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(@NotNull String importId, @NotNull String base64) {
        importId.getClass();
        base64.getClass();
        return setImportColorTheme(importId, ColorTheme.valueOf(new StylePropertyValue(Value.valueOf(base64), StylePropertyValueKind.CONSTANT)));
    }

    @CallSuper
    @MainThread
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @MapboxExperimental
    public void setInitialStyleColorTheme() {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setInitialStyleColorTheme();
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleAtmosphere(@NotNull Value properties) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleAtmosphere = this.styleManager.setStyleAtmosphere(properties);
        styleAtmosphere.getClass();
        return styleAtmosphere;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleAtmosphereProperty(@NotNull String property, @NotNull Value value) {
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleAtmosphereProperty = this.styleManager.setStyleAtmosphereProperty(property, value);
        styleAtmosphereProperty.getClass();
        return styleAtmosphereProperty;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(@NotNull String base64) {
        base64.getClass();
        return setStyleColorTheme(ColorTheme.valueOf(new StylePropertyValue(Value.valueOf(base64), StylePropertyValueKind.CONSTANT)));
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleCustomGeometrySourceTileData(@NotNull String sourceId, @NotNull CanonicalTileID tileId, @NotNull List<Feature> featureCollection) {
        sourceId.getClass();
        tileId.getClass();
        featureCollection.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleCustomGeometrySourceTileData = this.styleManager.setStyleCustomGeometrySourceTileData(sourceId, tileId, featureCollection);
        styleCustomGeometrySourceTileData.getClass();
        return styleCustomGeometrySourceTileData;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setStyleCustomRasterSourceTileData(@NotNull String sourceId, @NotNull List<CustomRasterSourceTileData> tiles) {
        sourceId.getClass();
        tiles.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleCustomRasterSourceTileData = this.styleManager.setStyleCustomRasterSourceTileData(sourceId, tiles);
        styleCustomRasterSourceTileData.getClass();
        return styleCustomRasterSourceTileData;
    }

    @AnyThread
    @CallSuper
    @NotNull
    public Expected<String, None> setStyleGeoJSONSourceData(@NotNull String sourceId, @NotNull String dataId, @NotNull GeoJSONSourceData data) {
        sourceId.getClass();
        dataId.getClass();
        data.getClass();
        Expected<String, None> styleGeoJSONSourceData = this.styleManager.setStyleGeoJSONSourceData(sourceId, dataId, data);
        styleGeoJSONSourceData.getClass();
        return styleGeoJSONSourceData;
    }

    @CallSuper
    @MainThread
    @MapboxExperimental
    public void setStyleGlyphURL(@NotNull String url) {
        url.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setStyleGlyphURL(url);
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleImportConfigProperties(@NotNull String importId, @NotNull HashMap<String, Value> configs) {
        importId.getClass();
        configs.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleImportConfigProperties = this.styleManager.setStyleImportConfigProperties(importId, configs);
        styleImportConfigProperties.getClass();
        return styleImportConfigProperties;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleImportConfigProperty(@NotNull String importId, @NotNull String config, @NotNull Value value) {
        importId.getClass();
        config.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleImportConfigProperty = this.styleManager.setStyleImportConfigProperty(importId, config, value);
        styleImportConfigProperty.getClass();
        return styleImportConfigProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleLayerProperties(@NotNull String layerId, @NotNull Value properties) {
        layerId.getClass();
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLayerProperties = this.styleManager.setStyleLayerProperties(layerId, properties);
        styleLayerProperties.getClass();
        return styleLayerProperties;
    }

    @CallSuper
    @NotNull
    @AnyThread
    @MapboxExperimental
    public Cancelable setStyleLayerPropertiesAsync(@NotNull String layerId, @NotNull Value properties, @NotNull AsyncOperationResultCallback callback) {
        layerId.getClass();
        properties.getClass();
        callback.getClass();
        Cancelable styleLayerPropertiesAsync = this.styleManager.setStyleLayerPropertiesAsync(layerId, properties, callback);
        styleLayerPropertiesAsync.getClass();
        return styleLayerPropertiesAsync;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleLayerProperty(@NotNull String layerId, @NotNull String property, @NotNull Value value) {
        layerId.getClass();
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLayerProperty = this.styleManager.setStyleLayerProperty(layerId, property, value);
        styleLayerProperty.getClass();
        return styleLayerProperty;
    }

    @CallSuper
    @NotNull
    @AnyThread
    @MapboxExperimental
    public Cancelable setStyleLayerPropertyAsync(@NotNull String layerId, @NotNull String property, @NotNull Value value, @NotNull AsyncOperationResultCallback callback) {
        layerId.getClass();
        property.getClass();
        value.getClass();
        callback.getClass();
        Cancelable styleLayerPropertyAsync = this.styleManager.setStyleLayerPropertyAsync(layerId, property, value, callback);
        styleLayerPropertyAsync.getClass();
        return styleLayerPropertyAsync;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleLightProperty(@NotNull String id, @NotNull String property, @NotNull Value value) {
        id.getClass();
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLightProperty = this.styleManager.setStyleLightProperty(id, property, value);
        styleLightProperty.getClass();
        return styleLightProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleLights(@NotNull Value lights) {
        lights.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleLights = this.styleManager.setStyleLights(lights);
        styleLights.getClass();
        return styleLights;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleProjection(@NotNull Value properties) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleProjection = this.styleManager.setStyleProjection(properties);
        styleProjection.getClass();
        return styleProjection;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleProjectionProperty(@NotNull String property, @NotNull Value value) {
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleProjectionProperty = this.styleManager.setStyleProjectionProperty(property, value);
        styleProjectionProperty.getClass();
        return styleProjectionProperty;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public final Expected<String, None> setStyleRain(@NotNull Value properties) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleRain = this.styleManager.setStyleRain(properties);
        styleRain.getClass();
        return styleRain;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public final Expected<String, None> setStyleRainProperty(@NotNull String property, @NotNull Value value) {
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleRainProperty = this.styleManager.setStyleRainProperty(property, value);
        styleRainProperty.getClass();
        return styleRainProperty;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setStyleSnow(@NotNull Value properties) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSnow = this.styleManager.setStyleSnow(properties);
        styleSnow.getClass();
        return styleSnow;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setStyleSnowProperty(@NotNull String property, @NotNull Value value) {
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSnowProperty = this.styleManager.setStyleSnowProperty(property, value);
        styleSnowProperty.getClass();
        return styleSnowProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleSourceProperties(@NotNull String sourceId, @NotNull Value properties) {
        sourceId.getClass();
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperties = this.styleManager.setStyleSourceProperties(sourceId, properties);
        styleSourceProperties.getClass();
        return styleSourceProperties;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setStyleSourceProperty(@NotNull String importId, @NotNull String sourceId, @NotNull String property, @NotNull Value value) {
        importId.getClass();
        sourceId.getClass();
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperty = this.styleManager.setStyleSourceProperty(importId, sourceId, property, value);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleTerrain(@NotNull Value properties) {
        properties.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleTerrain = this.styleManager.setStyleTerrain(properties);
        styleTerrain.getClass();
        return styleTerrain;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleTerrainProperty(@NotNull String property, @NotNull Value value) {
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleTerrainProperty = this.styleManager.setStyleTerrainProperty(property, value);
        styleTerrainProperty.getClass();
        return styleTerrainProperty;
    }

    @CallSuper
    @MainThread
    public void setStyleTransition(@NotNull TransitionOptions transitionOptions) {
        transitionOptions.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        this.styleManager.setStyleTransition(transitionOptions);
    }

    @CallSuper
    @MainThread
    public boolean styleLayerExists(@NotNull String layerId) {
        layerId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.styleLayerExists(layerId);
    }

    @CallSuper
    @MainThread
    public boolean styleSourceExists(@NotNull String sourceId) {
        sourceId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        return this.styleManager.styleSourceExists(sourceId);
    }

    @AnyThread
    @CallSuper
    @NotNull
    public Expected<String, None> updateGeoJSONSourceFeatures(@NotNull String sourceId, @NotNull String dataId, @NotNull List<Feature> features) {
        ChatData$$ExternalSyntheticOutline0.m(sourceId, dataId, features);
        Expected<String, None> updateGeoJSONSourceFeatures = this.styleManager.updateGeoJSONSourceFeatures(sourceId, dataId, features);
        updateGeoJSONSourceFeatures.getClass();
        return updateGeoJSONSourceFeatures;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> updateStyleImageSourceImage(@NotNull String sourceId, @NotNull Image image) {
        sourceId.getClass();
        image.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> updateStyleImageSourceImage = this.styleManager.updateStyleImageSourceImage(sourceId, image);
        updateStyleImageSourceImage.getClass();
        return updateStyleImageSourceImage;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> updateStyleImportWithJSON(@NotNull String importId, @NotNull String json, @Nullable HashMap<String, Value> config) {
        importId.getClass();
        json.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> updateStyleImportWithJSON = this.styleManager.updateStyleImportWithJSON(importId, json, config);
        updateStyleImportWithJSON.getClass();
        return updateStyleImportWithJSON;
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> updateStyleImportWithURI(@NotNull String importId, @NotNull String uri, @Nullable HashMap<String, Value> config) {
        importId.getClass();
        uri.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> updateStyleImportWithURI = this.styleManager.updateStyleImportWithURI(importId, uri, config);
        updateStyleImportWithURI.getClass();
        return updateStyleImportWithURI;
    }

    @MapboxExperimental
    public static /* synthetic */ void getStyleSlots$annotations() {
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(@Nullable ColorTheme colorTheme) {
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleColorTheme = this.styleManager.setStyleColorTheme(colorTheme);
        styleColorTheme.getClass();
        return styleColorTheme;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(@NotNull Bitmap bitmap) {
        bitmap.getClass();
        return setStyleColorTheme(ColorTheme.valueOf(ExtensionUtils.toMapboxImage(bitmap)));
    }

    @CallSuper
    @MainThread
    @NotNull
    public final Expected<String, None> addImage(@NotNull String imageId, @NotNull Image image) {
        imageId.getClass();
        image.getClass();
        return addImage(imageId, image, false);
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(@NotNull String importId, @Nullable ColorTheme colorTheme) {
        importId.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> importColorTheme = this.styleManager.setImportColorTheme(importId, colorTheme);
        importColorTheme.getClass();
        return importColorTheme;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setStyleColorTheme(@NotNull Image image) {
        image.getClass();
        return setStyleColorTheme(ColorTheme.valueOf(image));
    }

    @CallSuper
    @MainThread
    @NotNull
    public final Expected<String, None> addImage(@NotNull String imageId, @NotNull Bitmap bitmap, boolean sdf) {
        imageId.getClass();
        bitmap.getClass();
        return addImage(imageId, ExtensionUtils.toMapboxImage(bitmap), sdf);
    }

    @CallSuper
    @MainThread
    @NotNull
    public Expected<String, None> setStyleSourceProperty(@NotNull String sourceId, @NotNull String property, @NotNull Value value) {
        sourceId.getClass();
        property.getClass();
        value.getClass();
        ThreadChecker.INSTANCE.throwIfNotMainThread();
        Expected<String, None> styleSourceProperty = this.styleManager.setStyleSourceProperty(sourceId, property, value);
        styleSourceProperty.getClass();
        return styleSourceProperty;
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(@NotNull String importId, @NotNull Bitmap bitmap) {
        importId.getClass();
        bitmap.getClass();
        return setImportColorTheme(importId, ColorTheme.valueOf(ExtensionUtils.toMapboxImage(bitmap)));
    }

    @CallSuper
    @MainThread
    @NotNull
    public final Expected<String, None> addImage(@NotNull String imageId, @NotNull Bitmap bitmap) {
        imageId.getClass();
        bitmap.getClass();
        return addImage(imageId, bitmap, false);
    }

    @CallSuper
    @NotNull
    @MainThread
    @MapboxExperimental
    public Expected<String, None> setImportColorTheme(@NotNull String importId, @NotNull Image image) {
        importId.getClass();
        image.getClass();
        return setImportColorTheme(importId, ColorTheme.valueOf(image));
    }
}
